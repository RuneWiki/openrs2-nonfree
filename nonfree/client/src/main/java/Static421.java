import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString83;

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
	private static int anInt7944;

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString84;

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable5 = new Hashtable(16);

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "Z")
	private static boolean aBoolean574 = false;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method6587(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		anInt7944 = arg0;
		aString84 = arg1;
		try {
			aString83 = System.getProperty("user.home");
			if (aString83 != null) {
				aString83 = aString83 + "/";
			}
		} catch (@Pc(22) Exception local22) {
		}
		if (aString83 == null) {
			aString83 = "~/";
		}
		aBoolean574 = true;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public static File method6588(@OriginalArg(0) String arg0) {
		return method6589(aString84, arg0, anInt7944);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Ljava/io/File;")
	public static File method6589(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (!aBoolean574) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable5.get(arg1);
		if (local11 != null) {
			return local11;
		}
		@Pc(58) String[] local58 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString83, "/tmp/", "" };
		@Pc(81) String[] local81 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(83) int local83 = 0; local83 < 2; local83++) {
			for (@Pc(86) int local86 = 0; local86 < local81.length; local86++) {
				for (@Pc(89) int local89 = 0; local89 < local58.length; local89++) {
					@Pc(120) String local120 = local58[local89] + local81[local86] + "/" + (arg0 == null ? "" : arg0 + "/") + arg1;
					@Pc(122) RandomAccessFile local122 = null;
					try {
						@Pc(127) File local127 = new File(local120);
						if (local83 != 0 || local127.exists()) {
							@Pc(136) String local136 = local58[local89];
							if (local83 != 1 || local136.length() <= 0 || (new File(local136)).exists()) {
								(new File(local58[local89] + local81[local86])).mkdir();
								if (arg0 != null) {
									(new File(local58[local89] + local81[local86] + "/" + arg0)).mkdir();
								}
								local122 = new RandomAccessFile(local127, "rw");
								@Pc(202) int local202 = local122.read();
								local122.seek(0L);
								local122.write(local202);
								local122.seek(0L);
								local122.close();
								aHashtable5.put(arg1, local127);
								return local127;
							}
						}
					} catch (@Pc(221) Exception local221) {
						try {
							if (local122 != null) {
								local122.close();
							}
						} catch (@Pc(229) Exception local229) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}
}
