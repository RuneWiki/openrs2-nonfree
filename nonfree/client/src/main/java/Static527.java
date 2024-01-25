import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static527 {

	@OriginalMember(owner = "client!saa", name = "d", descriptor = "I")
	private static int anInt8864;

	@OriginalMember(owner = "client!saa", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString114;

	@OriginalMember(owner = "client!saa", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString115;

	@OriginalMember(owner = "client!saa", name = "e", descriptor = "Z")
	private static boolean aBoolean670 = false;

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable12 = new Hashtable(16);

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/io/File;")
	public static File method7593(@OriginalArg(0) String arg0) {
		return method7595(arg0, anInt8864, aString114);
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(BILjava/lang/String;)V")
	public static void method7594(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		aString114 = arg1;
		anInt8864 = arg0;
		try {
			aString115 = System.getProperty("user.home");
			if (aString115 != null) {
				aString115 = aString115 + "/";
			}
		} catch (@Pc(26) Exception local26) {
		}
		aBoolean670 = true;
		if (aString115 == null) {
			aString115 = "~/";
		}
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(ZLjava/lang/String;ILjava/lang/String;)Ljava/io/File;")
	public static File method7595(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean670) {
			throw new RuntimeException("");
		}
		@Pc(12) File local12 = (File) aHashtable12.get(arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(64) String[] local64 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString115, "/tmp/", "" };
		@Pc(91) String[] local91 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(93) int local93 = 0; local93 < 2; local93++) {
			for (@Pc(96) int local96 = 0; local96 < local91.length; local96++) {
				for (@Pc(99) int local99 = 0; local99 < local64.length; local99++) {
					@Pc(131) String local131 = local64[local99] + local91[local96] + "/" + (arg2 == null ? "" : arg2 + "/") + arg0;
					@Pc(133) RandomAccessFile local133 = null;
					try {
						@Pc(138) File local138 = new File(local131);
						if (local93 != 0 || local138.exists()) {
							@Pc(149) String local149 = local64[local99];
							if (local93 != 1 || local149.length() <= 0 || (new File(local149)).exists()) {
								(new File(local64[local99] + local91[local96])).mkdir();
								if (arg2 != null) {
									(new File(local64[local99] + local91[local96] + "/" + arg2)).mkdir();
								}
								local133 = new RandomAccessFile(local138, "rw");
								@Pc(220) int local220 = local133.read();
								local133.seek(0L);
								local133.write(local220);
								local133.seek(0L);
								local133.close();
								aHashtable12.put(arg0, local138);
								return local138;
							}
						}
					} catch (@Pc(239) Exception local239) {
						try {
							if (local133 != null) {
								local133.close();
							}
						} catch (@Pc(247) Exception local247) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}
}
