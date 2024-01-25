import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!le", name = "a", descriptor = "I")
	private static int anInt5423;

	@OriginalMember(owner = "client!le", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString45;

	@OriginalMember(owner = "client!le", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString46;

	@OriginalMember(owner = "client!le", name = "b", descriptor = "Z")
	private static boolean aBoolean429 = false;

	@OriginalMember(owner = "client!le", name = "c", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable4 = new Hashtable(16);

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BI)Ljava/io/File;")
	public static File method4551(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		if (!aBoolean429) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable4.get(arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(55) String[] local55 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString45, "/tmp/", "" };
		@Pc(78) String[] local78 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(80) int local80 = 0; local80 < 2; local80++) {
			for (@Pc(83) int local83 = 0; local83 < local78.length; local83++) {
				for (@Pc(86) int local86 = 0; local86 < local55.length; local86++) {
					@Pc(117) String local117 = local55[local86] + local78[local83] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
					@Pc(119) RandomAccessFile local119 = null;
					try {
						@Pc(124) File local124 = new File(local117);
						if (local80 != 0 || local124.exists()) {
							@Pc(133) String local133 = local55[local86];
							if (local80 != 1 || local133.length() <= 0 || (new File(local133)).exists()) {
								(new File(local55[local86] + local78[local83])).mkdir();
								if (arg1 != null) {
									(new File(local55[local86] + local78[local83] + "/" + arg1)).mkdir();
								}
								local119 = new RandomAccessFile(local124, "rw");
								@Pc(194) int local194 = local119.read();
								local119.seek(0L);
								local119.write(local194);
								local119.seek(0L);
								local119.close();
								aHashtable4.put(arg0, local124);
								return local124;
							}
						}
					} catch (@Pc(213) Exception local213) {
						try {
							if (local119 != null) {
								local119.close();
							}
						} catch (@Pc(221) Exception local221) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/io/File;")
	public static File method4552(@OriginalArg(0) String arg0) {
		return method4551(arg0, aString46, anInt5423);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method4553(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		anInt5423 = arg0;
		aString46 = arg1;
		try {
			aString45 = System.getProperty("user.home");
			if (aString45 != null) {
				aString45 = aString45 + "/";
			}
		} catch (@Pc(19) Exception local19) {
		}
		aBoolean429 = true;
		if (aString45 == null) {
			aString45 = "~/";
		}
	}
}
