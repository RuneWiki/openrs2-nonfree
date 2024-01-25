import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString51;

	@OriginalMember(owner = "client!gda", name = "d", descriptor = "I")
	private static int anInt3352;

	@OriginalMember(owner = "client!gda", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString52;

	@OriginalMember(owner = "client!gda", name = "c", descriptor = "Z")
	private static boolean aBoolean211 = false;

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
	public static File method3057(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		if (!aBoolean211) {
			throw new RuntimeException("");
		}
		@Pc(12) File local12 = (File) aHashtable2.get(arg1);
		if (local12 != null) {
			return local12;
		}
		@Pc(64) String[] local64 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString51, "/tmp/", "" };
		@Pc(91) String[] local91 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(93) int local93 = 0; local93 < 2; local93++) {
			for (@Pc(96) int local96 = 0; local96 < local91.length; local96++) {
				for (@Pc(99) int local99 = 0; local99 < local64.length; local99++) {
					@Pc(131) String local131 = local64[local99] + local91[local96] + "/" + (arg0 == null ? "" : arg0 + "/") + arg1;
					@Pc(133) RandomAccessFile local133 = null;
					try {
						@Pc(138) File local138 = new File(local131);
						if (local93 != 0 || local138.exists()) {
							@Pc(149) String local149 = local64[local99];
							if (local93 != 1 || local149.length() <= 0 || (new File(local149)).exists()) {
								(new File(local64[local99] + local91[local96])).mkdir();
								if (arg0 != null) {
									(new File(local64[local99] + local91[local96] + "/" + arg0)).mkdir();
								}
								local133 = new RandomAccessFile(local138, "rw");
								@Pc(221) int local221 = local133.read();
								local133.seek(0L);
								local133.write(local221);
								local133.seek(0L);
								local133.close();
								aHashtable2.put(arg1, local138);
								return local138;
							}
						}
					} catch (@Pc(240) Exception local240) {
						try {
							if (local133 != null) {
								local133.close();
							}
						} catch (@Pc(248) Exception local248) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method3058(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		aString52 = arg0;
		anInt3352 = arg1;
		try {
			aString51 = System.getProperty("user.home");
			if (aString51 != null) {
				aString51 = aString51 + "/";
			}
		} catch (@Pc(21) Exception local21) {
		}
		if (aString51 == null) {
			aString51 = "~/";
		}
		aBoolean211 = true;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/io/File;")
	public static File method3059(@OriginalArg(0) String arg0) {
		return method3057(aString52, arg0, anInt3352);
	}
}
