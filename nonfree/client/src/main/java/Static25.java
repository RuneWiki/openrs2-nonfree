import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!at", name = "a", descriptor = "I")
	private static int anInt349;

	@OriginalMember(owner = "client!at", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString8;

	@OriginalMember(owner = "client!at", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString9;

	@OriginalMember(owner = "client!at", name = "e", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable1 = new Hashtable(16);

	@OriginalMember(owner = "client!at", name = "d", descriptor = "Z")
	private static boolean aBoolean26 = false;

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public static File method379(@OriginalArg(0) String arg0) {
		return method381(arg0, aString8, anInt349);
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method380(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		aString8 = arg1;
		anInt349 = arg0;
		try {
			aString9 = System.getProperty("user.home");
			if (aString9 != null) {
				aString9 = aString9 + "/";
			}
		} catch (@Pc(21) Exception local21) {
		}
		if (aString9 == null) {
			aString9 = "~/";
		}
		aBoolean26 = true;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;")
	public static File method381(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (!aBoolean26) {
			throw new RuntimeException("");
		}
		@Pc(12) File local12 = (File) aHashtable1.get(arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(64) String[] local64 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString9, "/tmp/", "" };
		@Pc(91) String[] local91 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(93) int local93 = 0; local93 < 2; local93++) {
			for (@Pc(96) int local96 = 0; local96 < local91.length; local96++) {
				for (@Pc(99) int local99 = 0; local99 < local64.length; local99++) {
					@Pc(131) String local131 = local64[local99] + local91[local96] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
					@Pc(133) RandomAccessFile local133 = null;
					try {
						@Pc(138) File local138 = new File(local131);
						if (local93 != 0 || local138.exists()) {
							@Pc(149) String local149 = local64[local99];
							if (local93 != 1 || local149.length() <= 0 || (new File(local149)).exists()) {
								(new File(local64[local99] + local91[local96])).mkdir();
								if (arg1 != null) {
									(new File(local64[local99] + local91[local96] + "/" + arg1)).mkdir();
								}
								local133 = new RandomAccessFile(local138, "rw");
								@Pc(223) int local223 = local133.read();
								local133.seek(0L);
								local133.write(local223);
								local133.seek(0L);
								local133.close();
								aHashtable1.put(arg0, local138);
								return local138;
							}
						}
					} catch (@Pc(242) Exception local242) {
						try {
							if (local133 != null) {
								local133.close();
							}
						} catch (@Pc(250) Exception local250) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}
}
