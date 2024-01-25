import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString27;

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString28;

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString29;

	@OriginalMember(owner = "client!ji", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString30;

	@OriginalMember(owner = "client!ji", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString32;

	@OriginalMember(owner = "client!ji", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString33;

	@OriginalMember(owner = "client!ji", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString34;

	@OriginalMember(owner = "client!ji", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!ji", name = "y", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable1 = new Hashtable(16);

	@OriginalMember(owner = "client!ji", name = "h", descriptor = "I")
	public static final int anInt3047 = 3;

	@OriginalMember(owner = "client!ji", name = "x", descriptor = "J")
	public static volatile long aLong97 = 0L;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Ljava/io/File;")
	public static File method2509(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(4) File local4 = (File) aHashtable1.get(arg0);
		if (local4 != null) {
			return local4;
		}
		@Pc(43) String[] local43 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString28, "/tmp/", "" };
		@Pc(66) String[] local66 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(68) int local68 = 0; local68 < 2; local68++) {
			for (@Pc(71) int local71 = 0; local71 < local66.length; local71++) {
				for (@Pc(74) int local74 = 0; local74 < local43.length; local74++) {
					@Pc(105) String local105 = local43[local74] + local66[local71] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
					@Pc(107) RandomAccessFile local107 = null;
					try {
						@Pc(112) File local112 = new File(local105);
						if (local68 != 0 || local112.exists()) {
							@Pc(121) String local121 = local43[local74];
							if (local68 != 1 || local121.length() <= 0 || (new File(local121)).exists()) {
								(new File(local43[local74] + local66[local71])).mkdir();
								if (arg1 != null) {
									(new File(local43[local74] + local66[local71] + "/" + arg1)).mkdir();
								}
								local107 = new RandomAccessFile(local112, "rw");
								@Pc(187) int local187 = local107.read();
								local107.seek(0L);
								local107.write(local187);
								local107.seek(0L);
								local107.close();
								aHashtable1.put(arg0, local112);
								return local112;
							}
						}
					} catch (@Pc(206) Exception local206) {
						try {
							if (local107 != null) {
								local107.close();
							}
						} catch (@Pc(214) Exception local214) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}
}
