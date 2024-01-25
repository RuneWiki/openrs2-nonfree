import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString8;

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString9;

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString10;

	@OriginalMember(owner = "client!ci", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString11;

	@OriginalMember(owner = "client!ci", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString13;

	@OriginalMember(owner = "client!ci", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString14;

	@OriginalMember(owner = "client!ci", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString15;

	@OriginalMember(owner = "client!ci", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!ci", name = "y", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!ci", name = "k", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable1 = new Hashtable(16);

	@OriginalMember(owner = "client!ci", name = "v", descriptor = "I")
	public static final int anInt770 = 3;

	@OriginalMember(owner = "client!ci", name = "x", descriptor = "J")
	public static volatile long aLong33 = 0L;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IBLjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
	public static File method664(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(13) File local13 = (File) aHashtable1.get(arg2);
		if (local13 != null) {
			return local13;
		}
		@Pc(52) String[] local52 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString9, "/tmp/", "" };
		@Pc(75) String[] local75 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(77) int local77 = 0; local77 < 2; local77++) {
			for (@Pc(80) int local80 = 0; local80 < local75.length; local80++) {
				for (@Pc(83) int local83 = 0; local83 < local52.length; local83++) {
					@Pc(114) String local114 = local52[local83] + local75[local80] + "/" + (arg1 == null ? "" : arg1 + "/") + arg2;
					@Pc(116) RandomAccessFile local116 = null;
					try {
						@Pc(121) File local121 = new File(local114);
						if (local77 != 0 || local121.exists()) {
							@Pc(130) String local130 = local52[local83];
							if (local77 != 1 || local130.length() <= 0 || (new File(local130)).exists()) {
								(new File(local52[local83] + local75[local80])).mkdir();
								if (arg1 != null) {
									(new File(local52[local83] + local75[local80] + "/" + arg1)).mkdir();
								}
								local116 = new RandomAccessFile(local121, "rw");
								@Pc(194) int local194 = local116.read();
								local116.seek(0L);
								local116.write(local194);
								local116.seek(0L);
								local116.close();
								aHashtable1.put(arg2, local121);
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
