import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!av", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString7;

	@OriginalMember(owner = "client!av", name = "c", descriptor = "I")
	private static int anInt456;

	@OriginalMember(owner = "client!av", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString8;

	@OriginalMember(owner = "client!av", name = "b", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable1 = new Hashtable(16);

	@OriginalMember(owner = "client!av", name = "e", descriptor = "Z")
	private static boolean aBoolean44 = false;

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(BLjava/lang/String;)Ljava/io/File;")
	public static File method443(@OriginalArg(1) String arg0) {
		return method445(aString7, anInt456, arg0);
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method444(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		aString7 = arg1;
		anInt456 = arg0;
		try {
			aString8 = System.getProperty("user.home");
			if (aString8 != null) {
				aString8 = aString8 + "/";
			}
		} catch (@Pc(23) Exception local23) {
		}
		if (aString8 == null) {
			aString8 = "~/";
		}
		aBoolean44 = true;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;B)Ljava/io/File;")
	public static File method445(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (!aBoolean44) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable1.get(arg2);
		if (local11 != null) {
			return local11;
		}
		@Pc(50) String[] local50 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString8, "/tmp/", "" };
		@Pc(73) String[] local73 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(83) int local83 = 0; local83 < 2; local83++) {
			for (@Pc(86) int local86 = 0; local86 < local73.length; local86++) {
				for (@Pc(89) int local89 = 0; local89 < local50.length; local89++) {
					@Pc(120) String local120 = local50[local89] + local73[local86] + "/" + (arg0 == null ? "" : arg0 + "/") + arg2;
					@Pc(122) RandomAccessFile local122 = null;
					try {
						@Pc(127) File local127 = new File(local120);
						if (local83 != 0 || local127.exists()) {
							@Pc(136) String local136 = local50[local89];
							if (local83 != 1 || local136.length() <= 0 || (new File(local136)).exists()) {
								(new File(local50[local89] + local73[local86])).mkdir();
								if (arg0 != null) {
									(new File(local50[local89] + local73[local86] + "/" + arg0)).mkdir();
								}
								local122 = new RandomAccessFile(local127, "rw");
								@Pc(199) int local199 = local122.read();
								local122.seek(0L);
								local122.write(local199);
								local122.seek(0L);
								local122.close();
								aHashtable1.put(arg2, local127);
								return local127;
							}
						}
					} catch (@Pc(218) Exception local218) {
						try {
							if (local122 != null) {
								local122.close();
							}
						} catch (@Pc(226) Exception local226) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}
}
