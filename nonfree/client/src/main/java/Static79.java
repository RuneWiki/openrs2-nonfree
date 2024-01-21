import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!o", name = "g", descriptor = "Lclient!t;")
	public static Class10_Sub1 aClass10_Sub1_14;

	@OriginalMember(owner = "client!o", name = "l", descriptor = "I")
	public static int anInt1902;

	@OriginalMember(owner = "client!o", name = "p", descriptor = "[[S")
	public static short[][] aShortArrayArray22;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "Lclient!od;")
	public static Class60 aClass60_788 = Static41.method597(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!o", name = "c", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!o", name = "d", descriptor = "I")
	public static int anInt1896 = 0;

	@OriginalMember(owner = "client!o", name = "e", descriptor = "I")
	public static int anInt1897 = 0;

	@OriginalMember(owner = "client!o", name = "j", descriptor = "[Lclient!od;")
	public static Class60[] aClass60Array13 = new Class60[8];

	@OriginalMember(owner = "client!o", name = "n", descriptor = "I")
	public static int anInt1904 = 0;

	@OriginalMember(owner = "client!o", name = "o", descriptor = "Lclient!od;")
	public static Class60 aClass60_789 = Static41.method597("::fpson");

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)V")
	public static void method1274(@OriginalArg(1) int arg0) {
		@Pc(6) Class4_Sub17 local6 = (Class4_Sub17) Static75.aClass75_8.method1896((long) arg0);
		if (local6 != null) {
			local6.method1989();
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
	public static void method1275() {
		aShortArrayArray22 = null;
		aClass60_788 = null;
		aClass10_Sub1_14 = null;
		aClass60_789 = null;
		aClass60Array13 = null;
		aCRC32_1 = null;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BLclient!c;)V")
	public static void method1276(@OriginalArg(1) Class10 arg0) {
		Static55.aClass10_17 = arg0;
		Static129.anInt1200 = Static55.aClass10_17.method1772(16);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILclient!c;II)[Lclient!rd;")
	public static Class4_Sub3_Sub6_Sub3[] method1277(@OriginalArg(1) Class10 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static110.method1825(arg2, arg1, arg0) ? Static37.method569() : null;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(II)Lclient!od;")
	public static Class60 method1278(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return Static12.method1761(new Class60[] { Static20.aClass60_210, Static65.method1051(arg0), Static41.aClass60_405 });
		} else if (arg0 < 10000000) {
			return Static12.method1761(new Class60[] { Static128.aClass60_1113, Static65.method1051(arg0 / 1000), Static91.aClass60_879, Static41.aClass60_405 });
		} else {
			return Static12.method1761(new Class60[] { Static119.aClass60_1073, Static65.method1051(arg0 / 1000000), Static105.aClass60_971, Static41.aClass60_405 });
		}
	}
}
