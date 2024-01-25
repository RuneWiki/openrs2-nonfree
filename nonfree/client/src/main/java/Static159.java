import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "I")
	private static int anInt2897;

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString29;

	@OriginalMember(owner = "client!fs", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString30;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "client!fs", name = "e", descriptor = "Z")
	private static boolean aBoolean218 = false;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(ILjava/lang/String;B)V")
	public static void method2471(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		aString29 = arg1;
		anInt2897 = arg0;
		try {
			aString30 = System.getProperty("user.home");
			if (aString30 != null) {
				aString30 = aString30 + "/";
			}
		} catch (@Pc(27) Exception local27) {
		}
		aBoolean218 = true;
		if (aString30 == null) {
			aString30 = "~/";
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Z)Ljava/io/File;")
	public static File method2472(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (!aBoolean218) {
			throw new RuntimeException("");
		}
		@Pc(16) File local16 = (File) aHashtable2.get(arg2);
		if (local16 != null) {
			return local16;
		}
		@Pc(55) String[] local55 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString30, "/tmp/", "" };
		@Pc(78) String[] local78 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(80) int local80 = 0; local80 < 2; local80++) {
			for (@Pc(83) int local83 = 0; local83 < local78.length; local83++) {
				for (@Pc(86) int local86 = 0; local86 < local55.length; local86++) {
					@Pc(117) String local117 = local55[local86] + local78[local83] + "/" + (arg0 == null ? "" : arg0 + "/") + arg2;
					@Pc(119) RandomAccessFile local119 = null;
					try {
						@Pc(124) File local124 = new File(local117);
						if (local80 != 0 || local124.exists()) {
							@Pc(133) String local133 = local55[local86];
							if (local80 != 1 || local133.length() <= 0 || (new File(local133)).exists()) {
								(new File(local55[local86] + local78[local83])).mkdir();
								if (arg0 != null) {
									(new File(local55[local86] + local78[local83] + "/" + arg0)).mkdir();
								}
								local119 = new RandomAccessFile(local124, "rw");
								@Pc(196) int local196 = local119.read();
								local119.seek(0L);
								local119.write(local196);
								local119.seek(0L);
								local119.close();
								aHashtable2.put(arg2, local124);
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

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public static File method2473(@OriginalArg(0) String arg0) {
		return method2472(aString29, anInt2897, arg0);
	}
}
