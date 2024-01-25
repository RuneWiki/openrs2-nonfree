import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static482 {

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString182;

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString183;

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString184;

	@OriginalMember(owner = "client!uf", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString185;

	@OriginalMember(owner = "client!uf", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString186;

	@OriginalMember(owner = "client!uf", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString187;

	@OriginalMember(owner = "client!uf", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString188;

	@OriginalMember(owner = "client!uf", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!uf", name = "y", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable6 = new Hashtable(16);

	@OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
	public static final int anInt8574 = 3;

	@OriginalMember(owner = "client!uf", name = "x", descriptor = "J")
	public static volatile long aLong219 = 0L;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;I)Ljava/io/File;")
	public static File method7162(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(4) File local4 = (File) aHashtable6.get(arg0);
		if (local4 != null) {
			return local4;
		}
		@Pc(43) String[] local43 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString185, "/tmp/", "" };
		@Pc(66) String[] local66 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(68) int local68 = 0; local68 < 2; local68++) {
			for (@Pc(79) int local79 = 0; local79 < local66.length; local79++) {
				for (@Pc(82) int local82 = 0; local82 < local43.length; local82++) {
					@Pc(113) String local113 = local43[local82] + local66[local79] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
					@Pc(115) RandomAccessFile local115 = null;
					try {
						@Pc(120) File local120 = new File(local113);
						if (local68 != 0 || local120.exists()) {
							@Pc(132) String local132 = local43[local82];
							if (local68 != 1 || local132.length() <= 0 || (new File(local132)).exists()) {
								(new File(local43[local82] + local66[local79])).mkdir();
								if (arg1 != null) {
									(new File(local43[local82] + local66[local79] + "/" + arg1)).mkdir();
								}
								local115 = new RandomAccessFile(local120, "rw");
								@Pc(198) int local198 = local115.read();
								local115.seek(0L);
								local115.write(local198);
								local115.seek(0L);
								local115.close();
								aHashtable6.put(arg0, local120);
								return local120;
							}
						}
					} catch (@Pc(217) Exception local217) {
						try {
							if (local115 != null) {
								local115.close();
							}
						} catch (@Pc(225) Exception local225) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}
}
