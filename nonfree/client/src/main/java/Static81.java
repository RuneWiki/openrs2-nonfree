import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!de", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString21;

	@OriginalMember(owner = "client!de", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString22;

	@OriginalMember(owner = "client!de", name = "e", descriptor = "I")
	private static int anInt1398;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable1 = new Hashtable(16);

	@OriginalMember(owner = "client!de", name = "c", descriptor = "Z")
	private static boolean aBoolean94 = false;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public static File method1307(@OriginalArg(1) String arg0) {
		return method1309(aString22, arg0, anInt1398);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BILjava/lang/String;)V")
	public static void method1308(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		aString22 = arg1;
		anInt1398 = arg0;
		try {
			aString21 = System.getProperty("user.home");
			if (aString21 != null) {
				aString21 = aString21 + "/";
			}
		} catch (@Pc(26) Exception local26) {
		}
		if (aString21 == null) {
			aString21 = "~/";
		}
		aBoolean94 = true;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;I)Ljava/io/File;")
	public static File method1309(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (!aBoolean94) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable1.get(arg1);
		if (local11 != null) {
			return local11;
		}
		@Pc(50) String[] local50 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString21, "/tmp/", "" };
		@Pc(82) String[] local82 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(84) int local84 = 0; local84 < 2; local84++) {
			for (@Pc(87) int local87 = 0; local87 < local82.length; local87++) {
				for (@Pc(90) int local90 = 0; local90 < local50.length; local90++) {
					@Pc(121) String local121 = local50[local90] + local82[local87] + "/" + (arg0 == null ? "" : arg0 + "/") + arg1;
					@Pc(123) RandomAccessFile local123 = null;
					try {
						@Pc(128) File local128 = new File(local121);
						if (local84 != 0 || local128.exists()) {
							@Pc(140) String local140 = local50[local90];
							if (local84 != 1 || local140.length() <= 0 || (new File(local140)).exists()) {
								(new File(local50[local90] + local82[local87])).mkdir();
								if (arg0 != null) {
									(new File(local50[local90] + local82[local87] + "/" + arg0)).mkdir();
								}
								local123 = new RandomAccessFile(local128, "rw");
								@Pc(201) int local201 = local123.read();
								local123.seek(0L);
								local123.write(local201);
								local123.seek(0L);
								local123.close();
								aHashtable1.put(arg1, local128);
								return local128;
							}
						}
					} catch (@Pc(220) Exception local220) {
						try {
							if (local123 != null) {
								local123.close();
							}
						} catch (@Pc(228) Exception local228) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}
}
