import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static626 {

	@OriginalMember(owner = "client!vba", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString117;

	@OriginalMember(owner = "client!vba", name = "d", descriptor = "I")
	private static int anInt10012;

	@OriginalMember(owner = "client!vba", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString118;

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable7 = new Hashtable(16);

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "Z")
	private static boolean aBoolean761 = false;

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method8771(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		anInt10012 = arg0;
		aString117 = arg1;
		try {
			aString118 = System.getProperty("user.home");
			if (aString118 != null) {
				aString118 = aString118 + "/";
			}
		} catch (@Pc(19) Exception local19) {
		}
		if (aString118 == null) {
			aString118 = "~/";
		}
		aBoolean761 = true;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public static File method8772(@OriginalArg(1) String arg0) {
		return method8773(anInt10012, aString117, arg0);
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(BILjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
	public static File method8773(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean761) {
			throw new RuntimeException("");
		}
		@Pc(16) File local16 = (File) aHashtable7.get(arg2);
		if (local16 != null) {
			return local16;
		}
		@Pc(55) String[] local55 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString118, "/tmp/", "" };
		@Pc(78) String[] local78 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(80) int local80 = 0; local80 < 2; local80++) {
			for (@Pc(83) int local83 = 0; local83 < local78.length; local83++) {
				for (@Pc(86) int local86 = 0; local86 < local55.length; local86++) {
					@Pc(117) String local117 = local55[local86] + local78[local83] + "/" + (arg1 == null ? "" : arg1 + "/") + arg2;
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
								@Pc(199) int local199 = local119.read();
								local119.seek(0L);
								local119.write(local199);
								local119.seek(0L);
								local119.close();
								aHashtable7.put(arg2, local124);
								return local124;
							}
						}
					} catch (@Pc(218) Exception local218) {
						try {
							if (local119 != null) {
								local119.close();
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
