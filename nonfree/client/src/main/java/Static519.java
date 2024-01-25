import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static519 {

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString93;

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "I")
	private static int anInt8690;

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString94;

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "Z")
	private static boolean aBoolean631 = false;

	@OriginalMember(owner = "client!rt", name = "e", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable30 = new Hashtable(16);

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method7338(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		aString94 = arg0;
		anInt8690 = arg1;
		try {
			aString93 = System.getProperty("user.home");
			if (aString93 != null) {
				aString93 = aString93 + "/";
			}
		} catch (@Pc(24) Exception local24) {
		}
		aBoolean631 = true;
		if (aString93 == null) {
			aString93 = "~/";
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/io/File;")
	public static File method7339(@OriginalArg(1) String arg0) {
		return method7340(anInt8690, arg0, aString94);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(BILjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
	public static File method7340(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean631) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable30.get(arg1);
		if (local11 != null) {
			return local11;
		}
		@Pc(50) String[] local50 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString93, "/tmp/", "" };
		@Pc(73) String[] local73 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(80) int local80 = 0; local80 < 2; local80++) {
			for (@Pc(83) int local83 = 0; local83 < local73.length; local83++) {
				for (@Pc(86) int local86 = 0; local86 < local50.length; local86++) {
					@Pc(117) String local117 = local50[local86] + local73[local83] + "/" + (arg2 == null ? "" : arg2 + "/") + arg1;
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
								@Pc(194) int local194 = local119.read();
								local119.seek(0L);
								local119.write(local194);
								local119.seek(0L);
								local119.close();
								aHashtable30.put(arg1, local124);
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
}
