import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString23;

	@OriginalMember(owner = "client!gt", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString24;

	@OriginalMember(owner = "client!gt", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString25;

	@OriginalMember(owner = "client!gt", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString26;

	@OriginalMember(owner = "client!gt", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString27;

	@OriginalMember(owner = "client!gt", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString28;

	@OriginalMember(owner = "client!gt", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString29;

	@OriginalMember(owner = "client!gt", name = "v", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!gt", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!gt", name = "e", descriptor = "I")
	public static final int anInt2596 = 3;

	@OriginalMember(owner = "client!gt", name = "j", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable1 = new Hashtable(16);

	@OriginalMember(owner = "client!gt", name = "x", descriptor = "J")
	public static volatile long aLong82 = 0L;

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)Ljava/io/File;")
	public static File method2082(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(4) File local4 = (File) aHashtable1.get(arg0);
		if (local4 != null) {
			return local4;
		}
		@Pc(43) String[] local43 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString28, "/tmp/", "" };
		@Pc(75) String[] local75 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(77) int local77 = 0; local77 < 2; local77++) {
			for (@Pc(80) int local80 = 0; local80 < local75.length; local80++) {
				for (@Pc(83) int local83 = 0; local83 < local43.length; local83++) {
					@Pc(114) String local114 = local43[local83] + local75[local80] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
					@Pc(116) RandomAccessFile local116 = null;
					try {
						@Pc(121) File local121 = new File(local114);
						if (local77 != 0 || local121.exists()) {
							@Pc(130) String local130 = local43[local83];
							if (local77 != 1 || local130.length() <= 0 || (new File(local130)).exists()) {
								(new File(local43[local83] + local75[local80])).mkdir();
								if (arg1 != null) {
									(new File(local43[local83] + local75[local80] + "/" + arg1)).mkdir();
								}
								local116 = new RandomAccessFile(local121, "rw");
								@Pc(194) int local194 = local116.read();
								local116.seek(0L);
								local116.write(local194);
								local116.seek(0L);
								local116.close();
								aHashtable1.put(arg0, local121);
								return local121;
							}
						}
					} catch (@Pc(213) Exception local213) {
						try {
							if (local116 != null) {
								local116.close();
							}
						} catch (@Pc(221) Exception local221) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}
}
