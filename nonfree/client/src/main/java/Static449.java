import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static449 {

	@OriginalMember(owner = "client!pda", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString80;

	@OriginalMember(owner = "client!pda", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString81;

	@OriginalMember(owner = "client!pda", name = "e", descriptor = "I")
	private static int anInt7870;

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "Z")
	private static boolean aBoolean538 = false;

	@OriginalMember(owner = "client!pda", name = "b", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable4 = new Hashtable(16);

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public static File method6508(@OriginalArg(0) String arg0) {
		return method6510(aString81, arg0, anInt7870);
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method6509(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		anInt7870 = arg1;
		aString81 = arg0;
		try {
			aString80 = System.getProperty("user.home");
			if (aString80 != null) {
				aString80 = aString80 + "/";
			}
		} catch (@Pc(26) Exception local26) {
		}
		if (aString80 == null) {
			aString80 = "~/";
		}
		aBoolean538 = true;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Ljava/io/File;")
	public static File method6510(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (!aBoolean538) {
			throw new RuntimeException("");
		}
		@Pc(19) File local19 = (File) aHashtable4.get(arg1);
		if (local19 != null) {
			return local19;
		}
		@Pc(58) String[] local58 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString80, "/tmp/", "" };
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
								@Pc(197) int local197 = local122.read();
								local122.seek(0L);
								local122.write(local197);
								local122.seek(0L);
								local122.close();
								aHashtable4.put(arg1, local127);
								return local127;
							}
						}
					} catch (@Pc(216) Exception local216) {
						try {
							if (local122 != null) {
								local122.close();
							}
						} catch (@Pc(224) Exception local224) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}
}
