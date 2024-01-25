import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static546 {

	@OriginalMember(owner = "client!th", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString101;

	@OriginalMember(owner = "client!th", name = "d", descriptor = "I")
	private static int anInt9426;

	@OriginalMember(owner = "client!th", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString102;

	@OriginalMember(owner = "client!th", name = "b", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable7 = new Hashtable(16);

	@OriginalMember(owner = "client!th", name = "c", descriptor = "Z")
	private static boolean aBoolean745 = false;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
	public static File method7685(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean745) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable7.get(arg1);
		if (local11 != null) {
			return local11;
		}
		@Pc(50) String[] local50 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString101, "/tmp/", "" };
		@Pc(73) String[] local73 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(75) int local75 = 0; local75 < 2; local75++) {
			for (@Pc(78) int local78 = 0; local78 < local73.length; local78++) {
				for (@Pc(81) int local81 = 0; local81 < local50.length; local81++) {
					@Pc(112) String local112 = local50[local81] + local73[local78] + "/" + (arg2 == null ? "" : arg2 + "/") + arg1;
					@Pc(114) RandomAccessFile local114 = null;
					try {
						@Pc(119) File local119 = new File(local112);
						if (local75 != 0 || local119.exists()) {
							@Pc(131) String local131 = local50[local81];
							if (local75 != 1 || local131.length() <= 0 || (new File(local131)).exists()) {
								(new File(local50[local81] + local73[local78])).mkdir();
								if (arg2 != null) {
									(new File(local50[local81] + local73[local78] + "/" + arg2)).mkdir();
								}
								local114 = new RandomAccessFile(local119, "rw");
								@Pc(194) int local194 = local114.read();
								local114.seek(0L);
								local114.write(local194);
								local114.seek(0L);
								local114.close();
								aHashtable7.put(arg1, local119);
								return local119;
							}
						}
					} catch (@Pc(213) Exception local213) {
						try {
							if (local114 != null) {
								local114.close();
							}
						} catch (@Pc(221) Exception local221) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public static File method7686(@OriginalArg(0) String arg0) {
		return method7685(anInt9426, arg0, aString102);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method7687(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		anInt9426 = arg0;
		aString102 = arg1;
		try {
			aString101 = System.getProperty("user.home");
			if (aString101 != null) {
				aString101 = aString101 + "/";
			}
		} catch (@Pc(23) Exception local23) {
		}
		aBoolean745 = true;
		if (aString101 == null) {
			aString101 = "~/";
		}
	}
}
