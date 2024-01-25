import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static590 {

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString117;

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString118;

	@OriginalMember(owner = "client!tv", name = "e", descriptor = "I")
	private static int anInt9333;

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable5 = new Hashtable(16);

	@OriginalMember(owner = "client!tv", name = "d", descriptor = "Z")
	private static boolean aBoolean701 = false;

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method7924(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		aString118 = arg1;
		anInt9333 = arg0;
		try {
			aString117 = System.getProperty("user.home");
			if (aString117 != null) {
				aString117 = aString117 + "/";
			}
		} catch (@Pc(22) Exception local22) {
		}
		aBoolean701 = true;
		if (aString117 == null) {
			aString117 = "~/";
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
	public static File method7925(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean701) {
			throw new RuntimeException("");
		}
		@Pc(16) File local16 = (File) aHashtable5.get(arg1);
		if (local16 != null) {
			return local16;
		}
		@Pc(55) String[] local55 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString117, "/tmp/", "" };
		@Pc(78) String[] local78 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(80) int local80 = 0; local80 < 2; local80++) {
			for (@Pc(83) int local83 = 0; local83 < local78.length; local83++) {
				for (@Pc(86) int local86 = 0; local86 < local55.length; local86++) {
					@Pc(117) String local117 = local55[local86] + local78[local83] + "/" + (arg2 == null ? "" : arg2 + "/") + arg1;
					@Pc(119) RandomAccessFile local119 = null;
					try {
						@Pc(124) File local124 = new File(local117);
						if (local80 != 0 || local124.exists()) {
							@Pc(136) String local136 = local55[local86];
							if (local80 != 1 || local136.length() <= 0 || (new File(local136)).exists()) {
								(new File(local55[local86] + local78[local83])).mkdir();
								if (arg2 != null) {
									(new File(local55[local86] + local78[local83] + "/" + arg2)).mkdir();
								}
								local119 = new RandomAccessFile(local124, "rw");
								@Pc(202) int local202 = local119.read();
								local119.seek(0L);
								local119.write(local202);
								local119.seek(0L);
								local119.close();
								aHashtable5.put(arg1, local124);
								return local124;
							}
						}
					} catch (@Pc(221) Exception local221) {
						try {
							if (local119 != null) {
								local119.close();
							}
						} catch (@Pc(229) Exception local229) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public static File method7926(@OriginalArg(1) String arg0) {
		return method7925(anInt9333, arg0, aString118);
	}
}
