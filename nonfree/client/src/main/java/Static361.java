import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!md", name = "a", descriptor = "I")
	private static int anInt6167;

	@OriginalMember(owner = "client!md", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString80;

	@OriginalMember(owner = "client!md", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString81;

	@OriginalMember(owner = "client!md", name = "b", descriptor = "Z")
	private static boolean aBoolean405 = false;

	@OriginalMember(owner = "client!md", name = "c", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable4 = new Hashtable(16);

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method5210(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		anInt6167 = arg1;
		aString81 = arg0;
		try {
			aString80 = System.getProperty("user.home");
			if (aString80 != null) {
				aString80 = aString80 + "/";
			}
		} catch (@Pc(23) Exception local23) {
		}
		if (aString80 == null) {
			aString80 = "~/";
		}
		aBoolean405 = true;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ZLjava/lang/String;ILjava/lang/String;)Ljava/io/File;")
	public static File method5211(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean405) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable4.get(arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(50) String[] local50 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString80, "/tmp/", "" };
		@Pc(73) String[] local73 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(80) int local80 = 0; local80 < 2; local80++) {
			for (@Pc(83) int local83 = 0; local83 < local73.length; local83++) {
				for (@Pc(86) int local86 = 0; local86 < local50.length; local86++) {
					@Pc(117) String local117 = local50[local86] + local73[local83] + "/" + (arg2 == null ? "" : arg2 + "/") + arg0;
					@Pc(119) RandomAccessFile local119 = null;
					try {
						@Pc(124) File local124 = new File(local117);
						if (local80 != 0 || local124.exists()) {
							@Pc(133) String local133 = local50[local86];
							if (local80 != 1 || local133.length() <= 0 || (new File(local133)).exists()) {
								(new File(local50[local86] + local73[local83])).mkdir();
								if (arg2 != null) {
									(new File(local50[local86] + local73[local83] + "/" + arg2)).mkdir();
								}
								local119 = new RandomAccessFile(local124, "rw");
								@Pc(196) int local196 = local119.read();
								local119.seek(0L);
								local119.write(local196);
								local119.seek(0L);
								local119.close();
								aHashtable4.put(arg0, local124);
								return local124;
							}
						}
					} catch (@Pc(215) Exception local215) {
						try {
							if (local119 != null) {
								local119.close();
							}
						} catch (@Pc(223) Exception local223) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public static File method5212(@OriginalArg(1) String arg0) {
		return method5211(arg0, anInt6167, aString81);
	}
}
