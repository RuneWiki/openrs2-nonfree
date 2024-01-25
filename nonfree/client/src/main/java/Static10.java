import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString7;

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString8;

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
	private static int anInt159;

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable1 = new Hashtable(16);

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "Z")
	private static boolean aBoolean8 = false;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method139(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		aString7 = arg0;
		anInt159 = arg1;
		try {
			aString8 = System.getProperty("user.home");
			if (aString8 != null) {
				aString8 = aString8 + "/";
			}
		} catch (@Pc(19) Exception local19) {
		}
		aBoolean8 = true;
		if (aString8 == null) {
			aString8 = "~/";
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BILjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
	public static File method140(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean8) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable1.get(arg2);
		if (local11 != null) {
			return local11;
		}
		@Pc(50) String[] local50 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString8, "/tmp/", "" };
		@Pc(73) String[] local73 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(75) int local75 = 0; local75 < 2; local75++) {
			for (@Pc(83) int local83 = 0; local83 < local73.length; local83++) {
				for (@Pc(86) int local86 = 0; local86 < local50.length; local86++) {
					@Pc(117) String local117 = local50[local86] + local73[local83] + "/" + (arg1 == null ? "" : arg1 + "/") + arg2;
					@Pc(119) RandomAccessFile local119 = null;
					try {
						@Pc(124) File local124 = new File(local117);
						if (local75 != 0 || local124.exists()) {
							@Pc(136) String local136 = local50[local86];
							if (local75 != 1 || local136.length() <= 0 || (new File(local136)).exists()) {
								(new File(local50[local86] + local73[local83])).mkdir();
								if (arg1 != null) {
									(new File(local50[local86] + local73[local83] + "/" + arg1)).mkdir();
								}
								local119 = new RandomAccessFile(local124, "rw");
								@Pc(202) int local202 = local119.read();
								local119.seek(0L);
								local119.write(local202);
								local119.seek(0L);
								local119.close();
								aHashtable1.put(arg2, local124);
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

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public static File method141(@OriginalArg(0) String arg0) {
		return method140(anInt159, aString7, arg0);
	}
}
