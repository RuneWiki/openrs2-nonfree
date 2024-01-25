import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString38;

	@OriginalMember(owner = "client!lt", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString39;

	@OriginalMember(owner = "client!lt", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString40;

	@OriginalMember(owner = "client!lt", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString41;

	@OriginalMember(owner = "client!lt", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString42;

	@OriginalMember(owner = "client!lt", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString44;

	@OriginalMember(owner = "client!lt", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString45;

	@OriginalMember(owner = "client!lt", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!lt", name = "y", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!lt", name = "h", descriptor = "I")
	public static final int anInt4376 = 3;

	@OriginalMember(owner = "client!lt", name = "k", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "client!lt", name = "x", descriptor = "J")
	public static volatile long aLong142 = 0L;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(BILjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
	public static File method3504(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(4) File local4 = (File) aHashtable2.get(arg1);
		if (local4 != null) {
			return local4;
		}
		@Pc(43) String[] local43 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString40, "/tmp/", "" };
		@Pc(66) String[] local66 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(68) int local68 = 0; local68 < 2; local68++) {
			for (@Pc(71) int local71 = 0; local71 < local66.length; local71++) {
				for (@Pc(74) int local74 = 0; local74 < local43.length; local74++) {
					@Pc(105) String local105 = local43[local74] + local66[local71] + "/" + (arg2 == null ? "" : arg2 + "/") + arg1;
					@Pc(107) RandomAccessFile local107 = null;
					try {
						@Pc(112) File local112 = new File(local105);
						if (local68 != 0 || local112.exists()) {
							@Pc(124) String local124 = local43[local74];
							if (local68 != 1 || local124.length() <= 0 || (new File(local124)).exists()) {
								(new File(local43[local74] + local66[local71])).mkdir();
								if (arg2 != null) {
									(new File(local43[local74] + local66[local71] + "/" + arg2)).mkdir();
								}
								local107 = new RandomAccessFile(local112, "rw");
								@Pc(185) int local185 = local107.read();
								local107.seek(0L);
								local107.write(local185);
								local107.seek(0L);
								local107.close();
								aHashtable2.put(arg1, local112);
								return local112;
							}
						}
					} catch (@Pc(204) Exception local204) {
						try {
							if (local107 != null) {
								local107.close();
							}
						} catch (@Pc(212) Exception local212) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}
}
