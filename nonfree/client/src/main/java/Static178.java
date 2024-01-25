import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString29;

	@OriginalMember(owner = "client!gw", name = "d", descriptor = "I")
	private static int anInt3139;

	@OriginalMember(owner = "client!gw", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString30;

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "Z")
	private static boolean aBoolean238 = false;

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Ljava/lang/String;IZLjava/lang/String;)Ljava/io/File;")
	public static File method2520(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean238) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable2.get(arg2);
		if (local11 != null) {
			return local11;
		}
		@Pc(50) String[] local50 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString29, "/tmp/", "" };
		@Pc(73) String[] local73 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(75) int local75 = 0; local75 < 2; local75++) {
			for (@Pc(82) int local82 = 0; local82 < local73.length; local82++) {
				for (@Pc(85) int local85 = 0; local85 < local50.length; local85++) {
					@Pc(116) String local116 = local50[local85] + local73[local82] + "/" + (arg0 == null ? "" : arg0 + "/") + arg2;
					@Pc(118) RandomAccessFile local118 = null;
					try {
						@Pc(123) File local123 = new File(local116);
						if (local75 != 0 || local123.exists()) {
							@Pc(135) String local135 = local50[local85];
							if (local75 != 1 || local135.length() <= 0 || (new File(local135)).exists()) {
								(new File(local50[local85] + local73[local82])).mkdir();
								if (arg0 != null) {
									(new File(local50[local85] + local73[local82] + "/" + arg0)).mkdir();
								}
								local118 = new RandomAccessFile(local123, "rw");
								@Pc(201) int local201 = local118.read();
								local118.seek(0L);
								local118.write(local201);
								local118.seek(0L);
								local118.close();
								aHashtable2.put(arg2, local123);
								return local123;
							}
						}
					} catch (@Pc(220) Exception local220) {
						try {
							if (local118 != null) {
								local118.close();
							}
						} catch (@Pc(228) Exception local228) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/io/File;")
	public static File method2521(@OriginalArg(1) String arg0) {
		return method2520(aString30, anInt3139, arg0);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method2522(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		aString30 = arg1;
		anInt3139 = arg0;
		try {
			aString29 = System.getProperty("user.home");
			if (aString29 != null) {
				aString29 = aString29 + "/";
			}
		} catch (@Pc(24) Exception local24) {
		}
		aBoolean238 = true;
		if (aString29 == null) {
			aString29 = "~/";
		}
	}
}
