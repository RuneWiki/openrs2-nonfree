import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!nt", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString46;

	@OriginalMember(owner = "client!nt", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString47;

	@OriginalMember(owner = "client!nt", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString48;

	@OriginalMember(owner = "client!nt", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString49;

	@OriginalMember(owner = "client!nt", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString50;

	@OriginalMember(owner = "client!nt", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString51;

	@OriginalMember(owner = "client!nt", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString52;

	@OriginalMember(owner = "client!nt", name = "x", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!nt", name = "y", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!nt", name = "h", descriptor = "I")
	public static final int anInt4838 = 3;

	@OriginalMember(owner = "client!nt", name = "p", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "client!nt", name = "w", descriptor = "J")
	public static volatile long aLong163 = 0L;

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;")
	public static File method3839(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(4) File local4 = (File) aHashtable2.get(arg1);
		if (local4 != null) {
			return local4;
		}
		@Pc(43) String[] local43 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString52, "/tmp/", "" };
		@Pc(66) String[] local66 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(68) int local68 = 0; local68 < 2; local68++) {
			for (@Pc(71) int local71 = 0; local71 < local66.length; local71++) {
				for (@Pc(74) int local74 = 0; local74 < local43.length; local74++) {
					@Pc(105) String local105 = local43[local74] + local66[local71] + "/" + (arg0 == null ? "" : arg0 + "/") + arg1;
					@Pc(107) RandomAccessFile local107 = null;
					try {
						@Pc(112) File local112 = new File(local105);
						if (local68 != 0 || local112.exists()) {
							@Pc(124) String local124 = local43[local74];
							if (local68 != 1 || local124.length() <= 0 || (new File(local124)).exists()) {
								(new File(local43[local74] + local66[local71])).mkdir();
								if (arg0 != null) {
									(new File(local43[local74] + local66[local71] + "/" + arg0)).mkdir();
								}
								local107 = new RandomAccessFile(local112, "rw");
								@Pc(190) int local190 = local107.read();
								local107.seek(0L);
								local107.write(local190);
								local107.seek(0L);
								local107.close();
								aHashtable2.put(arg1, local112);
								return local112;
							}
						}
					} catch (@Pc(209) Exception local209) {
						try {
							if (local107 != null) {
								local107.close();
							}
						} catch (@Pc(217) Exception local217) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}
}
