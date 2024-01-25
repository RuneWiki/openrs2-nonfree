import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!hh", name = "Ab", descriptor = "Lclient!ok;")
	public static Class218 aClass218_1;

	@OriginalMember(owner = "client!hh", name = "Lb", descriptor = "Lclient!dm;")
	public static final Class68 aClass68_1 = new Class68();

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILclient!ge;)Lclient!ai;")
	public static Class10_Sub1 method2886(@OriginalArg(1) Class1_Sub6 arg0) {
		return new Class10_Sub1(arg0.method3964(), arg0.method3964(), arg0.method3964(), arg0.method3964(), arg0.method3920(), arg0.method3922());
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIILclient!bu;Lclient!qa;I)V")
	public static void method2887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class36 arg3, @OriginalArg(4) Class122 arg4) {
		@Pc(14) Class11 local14 = Static323.aClass257_4.method6143(arg3.lb);
		if (local14.anInt391 == -1) {
			return;
		}
		if (arg3.aBoolean64) {
			@Pc(31) int local31 = arg0 + arg3.anInt978;
			arg0 = local31 & 0x3;
		} else {
			arg0 = 0;
		}
		@Pc(43) Class2 local43 = local14.method429(arg0, arg3.aBoolean61, arg4);
		if (local43 == null) {
			return;
		}
		@Pc(49) int local49 = arg3.anInt975;
		@Pc(52) int local52 = arg3.anInt947;
		if ((arg0 & 0x1) == 1) {
			local52 = arg3.anInt975;
			local49 = arg3.anInt947;
		}
		@Pc(66) int local66 = local43.EA();
		@Pc(69) int local69 = local43.ma();
		if (local14.aBoolean15) {
			local69 = local52 * 4;
			local66 = local49 * 4;
		}
		if (local14.anInt396 == 0) {
			local43.method7367(arg2, arg1 - (local52 - 1) * 4, local66, local69);
		} else {
			local43.ra(arg2, arg1 + 4 - local52 * 4, local66, local69, 0, local14.anInt396 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(II)Lclient!jq;")
	public static Class156 method2888(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static396.aClass156ArrayArray1[local7] == null || Static396.aClass156ArrayArray1[local7][local11] == null) {
			@Pc(25) boolean local25 = Static204.method3515(local7);
			if (!local25) {
				return null;
			}
		}
		return Static396.aClass156ArrayArray1[local7][local11];
	}
}
