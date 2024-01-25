import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString46;

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString47;

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString48;

	@OriginalMember(owner = "client!pb", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString50;

	@OriginalMember(owner = "client!pb", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString51;

	@OriginalMember(owner = "client!pb", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString52;

	@OriginalMember(owner = "client!pb", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString53;

	@OriginalMember(owner = "client!pb", name = "x", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!pb", name = "y", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
	public static final int anInt5537 = 3;

	@OriginalMember(owner = "client!pb", name = "v", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "client!pb", name = "w", descriptor = "J")
	public static volatile long aLong272 = 0L;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
	public static File method4409(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(4) File local4 = (File) aHashtable2.get(arg1);
		if (local4 != null) {
			return local4;
		}
		@Pc(43) String[] local43 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString53, "/tmp/", "" };
		@Pc(66) String[] local66 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(77) int local77 = 0; local77 < 2; local77++) {
			for (@Pc(80) int local80 = 0; local80 < local66.length; local80++) {
				for (@Pc(83) int local83 = 0; local83 < local43.length; local83++) {
					@Pc(114) String local114 = local43[local83] + local66[local80] + "/" + (arg0 == null ? "" : arg0 + "/") + arg1;
					@Pc(116) RandomAccessFile local116 = null;
					try {
						@Pc(121) File local121 = new File(local114);
						if (local77 != 0 || local121.exists()) {
							@Pc(130) String local130 = local43[local83];
							if (local77 != 1 || local130.length() <= 0 || (new File(local130)).exists()) {
								(new File(local43[local83] + local66[local80])).mkdir();
								if (arg0 != null) {
									(new File(local43[local83] + local66[local80] + "/" + arg0)).mkdir();
								}
								local116 = new RandomAccessFile(local121, "rw");
								@Pc(196) int local196 = local116.read();
								local116.seek(0L);
								local116.write(local196);
								local116.seek(0L);
								local116.close();
								aHashtable2.put(arg1, local121);
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
