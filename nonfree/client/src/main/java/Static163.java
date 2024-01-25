import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!id", name = "s", descriptor = "[I")
	public static final int[] anIntArray243 = new int[32];

	@OriginalMember(owner = "client!id", name = "A", descriptor = "I")
	public static int anInt3008 = 0;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!ug;IIBII)Lclient!nq;")
	public static Class65_Sub2_Sub1 method2286(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0.aBoolean473 || Static280.method3692(arg1) && Static280.method3692(arg4)) {
			return new Class65_Sub2_Sub1(arg0, 3553, arg3, arg2, arg1, arg4, true);
		} else if (arg0.aBoolean479) {
			return new Class65_Sub2_Sub1(arg0, 34037, arg3, arg2, arg1, arg4, true);
		} else {
			return new Class65_Sub2_Sub1(arg0, arg3, arg2, arg1, arg4, Static171.method2382(arg1), Static171.method2382(arg4), true);
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BI)V")
	public static void method2287(@OriginalArg(1) int arg0) {
		Static245.anInt4066 = arg0;
		Static242.aClass137_44.method2739();
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
	public static void method2289() {
		@Pc(8) Class4_Sub1 local8 = (Class4_Sub1) Static398.aClass244_36.method5263();
		@Pc(19) boolean local19 = Static11.aClass110_1 != null || Static368.anInt6060 > 0;
		if (local19) {
			Static6.anInt97 = 1;
		}
		if (Static196.aBoolean269 && Static180.aClass107_1.method2003(81) && Static351.anInt5841 > 2) {
			if (local19) {
				Static254.aClass4_Sub30_1 = (Class4_Sub30) Static41.aClass244_2.aClass4_227.aClass4_262.aClass4_262;
			} else {
				Static428.method5726((Class4_Sub30) Static41.aClass244_2.aClass4_227.aClass4_262.aClass4_262, local8.method65(), local8.method64());
			}
		} else if (local19) {
			Static254.aClass4_Sub30_1 = (Class4_Sub30) Static41.aClass244_2.aClass4_227.aClass4_262;
		} else {
			Static428.method5726((Class4_Sub30) Static41.aClass244_2.aClass4_227.aClass4_262, local8.method65(), local8.method64());
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIB)I")
	public static int method2290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local15 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return local15 * arg1;
		} else {
			return local15;
		}
	}
}
