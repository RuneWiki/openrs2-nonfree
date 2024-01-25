import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString36;

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString37;

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
	private static int anInt3539;

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "Z")
	private static boolean aBoolean302 = false;

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable3 = new Hashtable(16);

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method2914(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		aString37 = arg0;
		anInt3539 = arg1;
		try {
			aString36 = System.getProperty("user.home");
			if (aString36 != null) {
				aString36 = aString36 + "/";
			}
		} catch (@Pc(19) Exception local19) {
		}
		if (aString36 == null) {
			aString36 = "~/";
		}
		aBoolean302 = true;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IBLjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
	public static File method2915(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean302) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable3.get(arg2);
		if (local11 != null) {
			return local11;
		}
		@Pc(50) String[] local50 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString36, "/tmp/", "" };
		@Pc(73) String[] local73 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(75) int local75 = 0; local75 < 2; local75++) {
			for (@Pc(87) int local87 = 0; local87 < local73.length; local87++) {
				for (@Pc(90) int local90 = 0; local90 < local50.length; local90++) {
					@Pc(121) String local121 = local50[local90] + local73[local87] + "/" + (arg1 == null ? "" : arg1 + "/") + arg2;
					@Pc(123) RandomAccessFile local123 = null;
					try {
						@Pc(128) File local128 = new File(local121);
						if (local75 != 0 || local128.exists()) {
							@Pc(137) String local137 = local50[local90];
							if (local75 != 1 || local137.length() <= 0 || (new File(local137)).exists()) {
								(new File(local50[local90] + local73[local87])).mkdir();
								if (arg1 != null) {
									(new File(local50[local90] + local73[local87] + "/" + arg1)).mkdir();
								}
								local123 = new RandomAccessFile(local128, "rw");
								@Pc(201) int local201 = local123.read();
								local123.seek(0L);
								local123.write(local201);
								local123.seek(0L);
								local123.close();
								aHashtable3.put(arg2, local128);
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

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLjava/lang/String;)Ljava/io/File;")
	public static File method2916(@OriginalArg(1) String arg0) {
		return method2915(anInt3539, aString37, arg0);
	}
}
