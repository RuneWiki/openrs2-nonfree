import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static634 {

	@OriginalMember(owner = "client!vi", name = "i", descriptor = "Lclient!aha;")
	public static Class15 aClass15_1;

	@OriginalMember(owner = "client!vi", name = "j", descriptor = "Lclient!wia;")
	public static Class386 aClass386_134;

	@OriginalMember(owner = "client!vi", name = "m", descriptor = "[Lclient!jd;")
	public static Class20[] aClass20Array15;

	@OriginalMember(owner = "client!vi", name = "n", descriptor = "Z")
	public static boolean aBoolean731 = false;

	@OriginalMember(owner = "client!vi", name = "o", descriptor = "Lclient!ti;")
	public static final Class339 aClass339_12 = new Class339();

	@OriginalMember(owner = "client!vi", name = "y", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_181 = new Class44(34, -2);

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIILclient!ha;BIIIIIILclient!jga;)V")
	public static void method8858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class137 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class14_Sub3_Sub11 arg10) {
		if (arg1 > arg2 && arg2 + arg7 > arg1 && arg9 - 13 < arg5 && arg5 < arg9 + 3 && arg10.aBoolean326) {
			arg8 = arg6;
		}
		@Pc(44) int[] local44 = null;
		if (Static461.method6748(arg10.anInt4752)) {
			local44 = Static175.aClass247_2.method5962((int) arg10.aLong144).anIntArray72;
		} else if (arg10.anInt4755 != -1) {
			local44 = Static175.aClass247_2.method5962(arg10.anInt4755).anIntArray72;
		} else if (Static254.method3738(arg10.anInt4752)) {
			@Pc(76) Class14_Sub44 local76 = (Class14_Sub44) Static579.aClass187_73.method4078((long) (int) arg10.aLong144);
			if (local76 != null) {
				@Pc(81) Class12_Sub2_Sub2_Sub1_Sub1 local81 = local76.aClass12_Sub2_Sub2_Sub1_Sub1_2;
				@Pc(84) Class283 local84 = local81.aClass283_1;
				if (local84.anIntArray638 != null) {
					local84 = local84.method7129(Static595.aClass241_1);
				}
				if (local84 != null) {
					local44 = local84.anIntArray639;
				}
			}
		} else if (Static198.method3030(arg10.anInt4752)) {
			@Pc(120) Class203 local120;
			if (arg10.anInt4752 == 1010) {
				local120 = Static511.aClass13_2.method86((int) arg10.aLong144);
			} else {
				local120 = Static511.aClass13_2.method86((int) (arg10.aLong144 >>> 32 & 0x7FFFFFFFL));
			}
			if (local120.anIntArray440 != null) {
				local120 = local120.method5007(Static595.aClass241_1);
			}
			if (local120 != null) {
				local44 = local120.anIntArray444;
			}
		}
		@Pc(154) String local154 = Static654.method9084(arg10);
		if (local44 != null) {
			local154 = local154 + Static433.method8535(local44);
		}
		Static448.aClass38_10.method8993(arg8, Static387.anIntArray518, Static135.aClass20Array3, arg9, local154, arg2 + 3);
		if (arg10.aBoolean327) {
			Static19.aClass20_24.method7399(arg2 + Static48.aClass158_1.method3601(local154) + 5, arg9 - 12);
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)V")
	public static void method8859() {
		if (Static234.aClass333_5.aBoolean693 && Static96.aClass337_2.anInt9843 != -1) {
			Static660.method9134(Static96.aClass337_2.anInt9843, Static96.aClass337_2.aString103);
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!mea;I)V")
	public static void method8860(@OriginalArg(0) Class230 arg0) {
		if (arg0.anInt6704 == Static624.anInt10508) {
			Static446.aBooleanArray18[arg0.anInt6682] = true;
		}
	}
}
