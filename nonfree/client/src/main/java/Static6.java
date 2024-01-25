import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString2;

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString3;

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
	private static int anInt108;

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable1 = new Hashtable(16);

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "Z")
	private static boolean aBoolean4 = false;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method115(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		aString3 = arg1;
		anInt108 = arg0;
		try {
			aString2 = System.getProperty("user.home");
			if (aString2 != null) {
				aString2 = aString2 + "/";
			}
		} catch (@Pc(19) Exception local19) {
		}
		if (aString2 == null) {
			aString2 = "~/";
		}
		aBoolean4 = true;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IBLjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
	public static File method116(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean4) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable1.get(arg2);
		if (local11 != null) {
			return local11;
		}
		@Pc(50) String[] local50 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString2, "/tmp/", "" };
		@Pc(73) String[] local73 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(83) int local83 = 0; local83 < 2; local83++) {
			for (@Pc(86) int local86 = 0; local86 < local73.length; local86++) {
				for (@Pc(89) int local89 = 0; local89 < local50.length; local89++) {
					@Pc(120) String local120 = local50[local89] + local73[local86] + "/" + (arg1 == null ? "" : arg1 + "/") + arg2;
					@Pc(122) RandomAccessFile local122 = null;
					try {
						@Pc(127) File local127 = new File(local120);
						if (local83 != 0 || local127.exists()) {
							@Pc(139) String local139 = local50[local89];
							if (local83 != 1 || local139.length() <= 0 || (new File(local139)).exists()) {
								(new File(local50[local89] + local73[local86])).mkdir();
								if (arg1 != null) {
									(new File(local50[local89] + local73[local86] + "/" + arg1)).mkdir();
								}
								local122 = new RandomAccessFile(local127, "rw");
								@Pc(203) int local203 = local122.read();
								local122.seek(0L);
								local122.write(local203);
								local122.seek(0L);
								local122.close();
								aHashtable1.put(arg2, local127);
								return local127;
							}
						}
					} catch (@Pc(222) Exception local222) {
						try {
							if (local122 != null) {
								local122.close();
							}
						} catch (@Pc(230) Exception local230) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public static File method117(@OriginalArg(1) String arg0) {
		return method116(anInt108, aString3, arg0);
	}
}
