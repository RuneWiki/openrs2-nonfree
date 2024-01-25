import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!st", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString65;

	@OriginalMember(owner = "client!st", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString66;

	@OriginalMember(owner = "client!st", name = "e", descriptor = "I")
	private static int anInt8230;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable5 = new Hashtable(16);

	@OriginalMember(owner = "client!st", name = "c", descriptor = "Z")
	private static boolean aBoolean585 = false;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
	public static File method6823(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (!aBoolean585) {
			throw new RuntimeException("ClientDiskCache not inited!");
		}
		@Pc(11) File local11 = (File) aHashtable5.get(arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(58) String[] local58 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString65, "/tmp/", "" };
		@Pc(81) String[] local81 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(83) int local83 = 0; local83 < 2; local83++) {
			for (@Pc(86) int local86 = 0; local86 < local81.length; local86++) {
				for (@Pc(89) int local89 = 0; local89 < local58.length; local89++) {
					@Pc(120) String local120 = local58[local89] + local81[local86] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
					@Pc(122) RandomAccessFile local122 = null;
					try {
						@Pc(127) File local127 = new File(local120);
						if (local83 != 0 || local127.exists()) {
							@Pc(136) String local136 = local58[local89];
							if (local83 != 1 || local136.length() <= 0 || (new File(local136)).exists()) {
								(new File(local58[local89] + local81[local86])).mkdir();
								if (arg1 != null) {
									(new File(local58[local89] + local81[local86] + "/" + arg1)).mkdir();
								}
								local122 = new RandomAccessFile(local127, "rw");
								@Pc(200) int local200 = local122.read();
								local122.seek(0L);
								local122.write(local200);
								local122.seek(0L);
								local122.close();
								aHashtable5.put(arg0, local127);
								return local127;
							}
						}
					} catch (@Pc(219) Exception local219) {
						System.out.println("Unable to open/write: " + local120);
						try {
							if (local122 != null) {
								local122.close();
							}
						} catch (@Pc(236) Exception local236) {
						}
					}
				}
			}
		}
		throw new RuntimeException("Fatal - could not find ANY location for file: " + arg0);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public static File method6824(@OriginalArg(0) String arg0) {
		return method6823(arg0, aString66, anInt8230);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method6825(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		aString66 = arg1;
		anInt8230 = arg0;
		try {
			aString65 = System.getProperty("user.home");
			if (aString65 != null) {
				aString65 = aString65 + "/";
			}
		} catch (@Pc(26) Exception local26) {
		}
		if (aString65 == null) {
			aString65 = "~/";
		}
		aBoolean585 = true;
	}
}
