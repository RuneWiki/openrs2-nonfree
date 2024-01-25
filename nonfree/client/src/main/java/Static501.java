import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static501 {

	@OriginalMember(owner = "client!tda", name = "p", descriptor = "Lclient!jn;")
	public static Class176 aClass176_88;

	@OriginalMember(owner = "client!tda", name = "z", descriptor = "I")
	public static int anInt6753;

	@OriginalMember(owner = "client!tda", name = "u", descriptor = "I")
	public static int anInt6750 = 765;

	@OriginalMember(owner = "client!tda", name = "v", descriptor = "Lclient!qf;")
	public static final Class271 aClass271_7 = new Class271();

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIBII[BI)Z")
	public static boolean method5639(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) byte[] arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg0 % 8;
		@Pc(23) int local23;
		if (local9 == 0) {
			local23 = 0;
		} else {
			local23 = 8 - local9;
		}
		@Pc(36) int local36 = -((arg4 + 8 - 1) / 8);
		@Pc(46) int local46 = -((arg0 + 7) / 8);
		for (@Pc(48) int local48 = local36; local48 < 0; local48++) {
			for (@Pc(52) int local52 = local46; local52 < 0; local52++) {
				if (arg3[arg2] == 0) {
					return true;
				}
				arg2 += 8;
			}
			arg2 -= local23;
			if (arg3[arg2 - 1] == 0) {
				return true;
			}
			arg2 += arg1;
		}
		return false;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(B)V")
	public static void method5640() {
		if (Static203.anInt3855 == 7) {
			Static135.method2684(false);
		} else {
			Static75.aClass241_2 = Static299.aClass241_3;
			Static299.aClass241_3 = null;
			Static285.method5604(13);
		}
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIII)I")
	public static int method5641(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static499.aClass83Array3 == null) {
			return 0;
		}
		@Pc(16) int local16 = arg0 >> 9;
		@Pc(20) int local20 = arg2 >> 9;
		if (local16 < 0 || local20 < 0 || local16 > Static428.anInt8046 - 1 || Static119.anInt2717 - 1 < local20) {
			return 0;
		}
		@Pc(48) int local48 = arg1;
		if (arg1 < 3 && (Static262.aByteArrayArrayArray16[1][local16][local20] & 0x2) != 0) {
			local48 = arg1 + 1;
		}
		return Static499.aClass83Array3[local48].method7213(arg0, arg2);
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lclient!mt;IIILclient!jn;ZI)V")
	public static void method5642(@OriginalArg(0) Class4_Sub7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) Class176 arg2, @OriginalArg(6) int arg3) {
		Static410.method6484(arg1, arg2, arg3);
		Static280.aClass4_Sub7_Sub3_2 = arg0;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(BLclient!un;)V")
	public static void method5643(@OriginalArg(1) Class4_Sub11 arg0) {
		@Pc(9) int local9 = arg0.method4942();
		Static466.aClass218Array10 = new Class218[local9];
		for (@Pc(19) int local19 = 0; local19 < local9; local19++) {
			Static466.aClass218Array10[local19] = new Class218();
			Static466.aClass218Array10[local19].anInt6284 = arg0.method4942();
			Static466.aClass218Array10[local19].aString61 = arg0.method4933();
		}
		Static364.anInt7050 = arg0.method4942();
		Static505.anInt9067 = arg0.method4942();
		Static401.anInt7652 = arg0.method4942();
		Static539.aClass158_Sub1Array2 = new Class158_Sub1[Static505.anInt9067 + 1 - Static364.anInt7050];
		for (@Pc(71) int local71 = 0; local71 < Static401.anInt7652; local71++) {
			@Pc(77) int local77 = arg0.method4942();
			@Pc(85) Class158_Sub1 local85 = Static539.aClass158_Sub1Array2[local77] = new Class158_Sub1();
			local85.anInt4055 = arg0.method4905();
			local85.anInt4053 = arg0.method4931();
			local85.anInt4062 = Static364.anInt7050 + local77;
			local85.aString44 = arg0.method4933();
			local85.aString45 = arg0.method4933();
		}
		Static48.anInt688 = arg0.method4931();
		Static325.aBoolean717 = true;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(BIIIIII)V")
	public static void method5644(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static226.anInt4163 = arg1;
		Static76.anInt1269 = arg3;
		Static436.anInt8165 = arg0;
		Static283.anInt10292 = arg2;
		Static404.anInt7679 = arg4;
		Static190.anInt3735 = arg5;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Ljava/lang/Object;ZZ)[B")
	public static byte[] method5647(@OriginalArg(0) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return arg1 ? Static65.method1067(local13) : local13;
		} else if (arg0 instanceof Class25) {
			@Pc(27) Class25 local27 = (Class25) arg0;
			return local27.method354();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
