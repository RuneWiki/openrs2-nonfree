import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString37;

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
	private static int anInt3537;

	@OriginalMember(owner = "client!gp", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString38;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "Z")
	private static boolean aBoolean274 = false;

	@OriginalMember(owner = "client!gp", name = "e", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	public static void method3107(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		aString38 = arg0;
		anInt3537 = arg1;
		try {
			aString37 = System.getProperty("user.home");
			if (aString37 != null) {
				aString37 = aString37 + "/";
			}
		} catch (@Pc(19) Exception local19) {
		}
		aBoolean274 = true;
		if (aString37 == null) {
			aString37 = "~/";
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(BLjava/lang/String;)Ljava/io/File;")
	public static File method3108(@OriginalArg(1) String arg0) {
		return method3109(anInt3537, arg0, aString38);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
	public static File method3109(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean274) {
			throw new RuntimeException("");
		}
		@Pc(16) File local16 = (File) aHashtable2.get(arg1);
		if (local16 != null) {
			return local16;
		}
		@Pc(55) String[] local55 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString37, "/tmp/", "" };
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
								aHashtable2.put(arg1, local124);
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
}
