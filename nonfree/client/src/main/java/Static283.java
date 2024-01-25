import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString47;

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString48;

	@OriginalMember(owner = "client!lp", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString49;

	@OriginalMember(owner = "client!lp", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString50;

	@OriginalMember(owner = "client!lp", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString51;

	@OriginalMember(owner = "client!lp", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString52;

	@OriginalMember(owner = "client!lp", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString53;

	@OriginalMember(owner = "client!lp", name = "x", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!lp", name = "y", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!lp", name = "h", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable7 = new Hashtable(16);

	@OriginalMember(owner = "client!lp", name = "u", descriptor = "I")
	public static final int anInt5580 = 3;

	@OriginalMember(owner = "client!lp", name = "w", descriptor = "J")
	public static volatile long aLong144 = 0L;

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;I)Ljava/io/File;")
	public static File method4806(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(13) File local13 = (File) aHashtable7.get(arg1);
		if (local13 != null) {
			return local13;
		}
		@Pc(52) String[] local52 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString47, "/tmp/", "" };
		@Pc(75) String[] local75 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(77) int local77 = 0; local77 < 2; local77++) {
			for (@Pc(80) int local80 = 0; local80 < local75.length; local80++) {
				for (@Pc(83) int local83 = 0; local83 < local52.length; local83++) {
					@Pc(114) String local114 = local52[local83] + local75[local80] + "/" + (arg0 == null ? "" : arg0 + "/") + arg1;
					@Pc(116) RandomAccessFile local116 = null;
					try {
						@Pc(121) File local121 = new File(local114);
						if (local77 != 0 || local121.exists()) {
							@Pc(133) String local133 = local52[local83];
							if (local77 != 1 || local133.length() <= 0 || (new File(local133)).exists()) {
								(new File(local52[local83] + local75[local80])).mkdir();
								if (arg0 != null) {
									(new File(local52[local83] + local75[local80] + "/" + arg0)).mkdir();
								}
								local116 = new RandomAccessFile(local121, "rw");
								@Pc(196) int local196 = local116.read();
								local116.seek(0L);
								local116.write(local196);
								local116.seek(0L);
								local116.close();
								aHashtable7.put(arg1, local121);
								return local121;
							}
						}
					} catch (@Pc(215) Exception local215) {
						try {
							if (local116 != null) {
								local116.close();
							}
						} catch (@Pc(223) Exception local223) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}
}
