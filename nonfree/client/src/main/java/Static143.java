import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!of", name = "l", descriptor = "I")
	public static int anInt3031;

	@OriginalMember(owner = "client!of", name = "e", descriptor = "Lclient!kg;")
	public static final Class53 aClass53_17 = new Class53(64);

	@OriginalMember(owner = "client!of", name = "g", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1058 = Static151.method2243("headicons_prayer");

	@OriginalMember(owner = "client!of", name = "m", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1062 = Static151.method2243("white:");

	@OriginalMember(owner = "client!of", name = "h", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1059 = aClass62_1062;

	@OriginalMember(owner = "client!of", name = "i", descriptor = "[Lclient!gj;")
	public static final Class7_Sub3[] aClass7_Sub3Array1 = new Class7_Sub3[4];

	@OriginalMember(owner = "client!of", name = "j", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1060 = Static151.method2243("<img=0>");

	@OriginalMember(owner = "client!of", name = "k", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1061 = aClass62_1062;

	@OriginalMember(owner = "client!of", name = "n", descriptor = "I")
	public static int anInt3032 = 0;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIZ)V")
	public static void method2155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) Class13 local11 = Static13.aClass13ArrayArrayArray1[Static126.anInt2806][arg1][arg0];
		if (local11 == null) {
			Static205.method2997(Static126.anInt2806, arg1, arg0);
			return;
		}
		@Pc(20) int local20 = -99999999;
		@Pc(22) Class2_Sub1_Sub6 local22 = null;
		@Pc(27) Class2_Sub1_Sub6 local27;
		for (local27 = (Class2_Sub1_Sub6) local11.method303(); local27 != null; local27 = (Class2_Sub1_Sub6) local11.method309()) {
			@Pc(34) Class2_Sub1_Sub26 local34 = Static52.method774(local27.aClass7_Sub6_1.anInt3706);
			@Pc(37) int local37 = local34.anInt4537;
			if (local34.anInt4541 == 1) {
				local37 *= local27.aClass7_Sub6_1.anInt3711 + 1;
			}
			if (local20 < local37) {
				local20 = local37;
				local22 = local27;
			}
		}
		if (local22 == null) {
			Static205.method2997(Static126.anInt2806, arg1, arg0);
			return;
		}
		local11.method306(local22);
		@Pc(80) Class7_Sub6 local80 = null;
		@Pc(82) Class7_Sub6 local82 = null;
		for (local27 = (Class2_Sub1_Sub6) local11.method303(); local27 != null; local27 = (Class2_Sub1_Sub6) local11.method309()) {
			@Pc(91) Class7_Sub6 local91 = local27.aClass7_Sub6_1;
			if (local91.anInt3706 != local22.aClass7_Sub6_1.anInt3706) {
				if (local82 == null) {
					local82 = local91;
				}
				if (local91.anInt3706 != local82.anInt3706 && local80 == null) {
					local80 = local91;
				}
			}
		}
		@Pc(131) long local131 = (long) (arg1 + (arg0 << 7) + 1610612736);
		Static115.method1780(Static126.anInt2806, arg1, arg0, Static175.method2548(arg0 * 128 + 64, Static126.anInt2806, arg1 * 128 + 64), local22.aClass7_Sub6_1, local131, local82, local80);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!kd;I)Lclient!ed;")
	public static Class24_Sub1 method2156(@OriginalArg(0) Class2_Sub11 arg0) {
		return new Class24_Sub1(arg0.method1568(), arg0.method1568(), arg0.method1568(), arg0.method1568(), arg0.method1536(), arg0.method1536(), arg0.method1534());
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(II)I")
	public static int method2158(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BI)Lclient!ii;")
	public static Class47 method2159(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static89.aClass47ArrayArray1[local12] == null || Static89.aClass47ArrayArray1[local12][local16] == null) {
			@Pc(30) boolean local30 = Static124.method1934(local12);
			if (!local30) {
				return null;
			}
		}
		return Static89.aClass47ArrayArray1[local12][local16];
	}
}
