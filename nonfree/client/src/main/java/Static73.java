import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString9;

	@OriginalMember(owner = "client!dr", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString10;

	@OriginalMember(owner = "client!dr", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString12;

	@OriginalMember(owner = "client!dr", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString13;

	@OriginalMember(owner = "client!dr", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString14;

	@OriginalMember(owner = "client!dr", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString15;

	@OriginalMember(owner = "client!dr", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString16;

	@OriginalMember(owner = "client!dr", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!dr", name = "y", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable1 = new Hashtable(16);

	@OriginalMember(owner = "client!dr", name = "j", descriptor = "I")
	public static int anInt1597 = 3;

	@OriginalMember(owner = "client!dr", name = "x", descriptor = "J")
	public static volatile long aLong51 = 0L;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(BILjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
	public static File method1359(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(4) File local4 = (File) aHashtable1.get(arg1);
		if (local4 != null) {
			return local4;
		}
		@Pc(48) String[] local48 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString15, "/tmp/", "" };
		@Pc(71) String[] local71 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(73) int local73 = 0; local73 < 2; local73++) {
			for (@Pc(76) int local76 = 0; local76 < local71.length; local76++) {
				for (@Pc(79) int local79 = 0; local79 < local48.length; local79++) {
					@Pc(110) String local110 = local48[local79] + local71[local76] + "/" + (arg2 == null ? "" : arg2 + "/") + arg1;
					@Pc(112) RandomAccessFile local112 = null;
					try {
						@Pc(117) File local117 = new File(local110);
						if (local73 != 0 || local117.exists()) {
							@Pc(129) String local129 = local48[local79];
							if (local73 != 1 || local129.length() <= 0 || (new File(local129)).exists()) {
								(new File(local48[local79] + local71[local76])).mkdir();
								if (arg2 != null) {
									(new File(local48[local79] + local71[local76] + "/" + arg2)).mkdir();
								}
								local112 = new RandomAccessFile(local117, "rw");
								@Pc(193) int local193 = local112.read();
								local112.seek(0L);
								local112.write(local193);
								local112.seek(0L);
								local112.close();
								aHashtable1.put(arg1, local117);
								return local117;
							}
						}
					} catch (@Pc(212) Exception local212) {
						try {
							if (local112 != null) {
								local112.close();
							}
						} catch (@Pc(220) Exception local220) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}
}
