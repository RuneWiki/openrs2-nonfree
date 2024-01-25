import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString22;

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString23;

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString24;

	@OriginalMember(owner = "client!hf", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString25;

	@OriginalMember(owner = "client!hf", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString27;

	@OriginalMember(owner = "client!hf", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString28;

	@OriginalMember(owner = "client!hf", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString29;

	@OriginalMember(owner = "client!hf", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!hf", name = "x", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!hf", name = "p", descriptor = "I")
	public static final int anInt2575 = 3;

	@OriginalMember(owner = "client!hf", name = "q", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "client!hf", name = "y", descriptor = "J")
	public static volatile long aLong78 = 0L;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)Ljava/io/File;")
	public static File method2366(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		@Pc(9) File local9 = (File) aHashtable2.get(arg2);
		if (local9 != null) {
			return local9;
		}
		@Pc(48) String[] local48 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString27, "/tmp/", "" };
		@Pc(71) String[] local71 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(73) int local73 = 0; local73 < 2; local73++) {
			for (@Pc(76) int local76 = 0; local76 < local71.length; local76++) {
				for (@Pc(79) int local79 = 0; local79 < local48.length; local79++) {
					@Pc(110) String local110 = local48[local79] + local71[local76] + "/" + (arg1 == null ? "" : arg1 + "/") + arg2;
					@Pc(112) RandomAccessFile local112 = null;
					try {
						@Pc(117) File local117 = new File(local110);
						if (local73 != 0 || local117.exists()) {
							@Pc(126) String local126 = local48[local79];
							if (local73 != 1 || local126.length() <= 0 || (new File(local126)).exists()) {
								(new File(local48[local79] + local71[local76])).mkdir();
								if (arg1 != null) {
									(new File(local48[local79] + local71[local76] + "/" + arg1)).mkdir();
								}
								local112 = new RandomAccessFile(local117, "rw");
								@Pc(192) int local192 = local112.read();
								local112.seek(0L);
								local112.write(local192);
								local112.seek(0L);
								local112.close();
								aHashtable2.put(arg2, local117);
								return local117;
							}
						}
					} catch (@Pc(211) Exception local211) {
						try {
							if (local112 != null) {
								local112.close();
							}
						} catch (@Pc(219) Exception local219) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}
}
