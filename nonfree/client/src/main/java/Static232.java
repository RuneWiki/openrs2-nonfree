import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!hr", name = "l", descriptor = "Lclient!tm;")
	public static final Class338 aClass338_110 = new Class338();

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!bba;IIBIIIIILclient!bba;)V")
	public static void method3917(@OriginalArg(0) Class28_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) Class28_Sub1_Sub1_Sub1 arg6) {
		@Pc(7) int local7 = arg6.method9318();
		if (local7 == -1) {
			return;
		}
		@Pc(21) Class33 local21 = (Class33) Static658.aClass165_85.method4389((long) local7);
		if (local21 == null) {
			@Pc(28) Class97[] local28 = Static682.method2750(Static369.aClass15_97, local7);
			if (local28 == null) {
				return;
			}
			local21 = Static674.aClass13_22.method8465(local28[0], true);
			Static658.aClass165_85.method4392(local21, (long) local7);
		}
		Static113.method2113(arg0.anInt10731, 0, arg0.anInt10729, arg5 >> 1, arg0.aByte174, arg0.method9314() * 256, arg4 >> 1);
		@Pc(74) int local74 = arg2 + Static396.anIntArray551[0] - 18;
		@Pc(82) int local82 = Static396.anIntArray551[1] + arg1 - 70;
		@Pc(90) int local90 = local74 + arg3 / 4 * 18;
		@Pc(98) int local98 = local82 + arg3 % 4 * 18;
		local21.method7654(local90, local98);
		if (arg0 == arg6) {
			Static674.aClass13_22.method8460(local98 - 1, 18, -256, local90 - 1, 18);
		}
		Static642.method8919(local90 + 18, local98 + 18, local98 - 1, local90 + -1);
		@Pc(142) Class28_Sub10 local142 = Static295.method4574();
		local142.anInt10104 = local90;
		local142.anInt10103 = local98 + 16;
		local142.anInt10106 = local98;
		local142.aClass28_Sub1_Sub1_Sub1_1 = arg6;
		local142.anInt10102 = local90 + 16;
		Static124.aClass371_1.method8908(local142);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!wp;[IIZ)V")
	public static void method3918(@OriginalArg(0) Class28_Sub1_Sub1_Sub1_Sub2 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(6) boolean local6;
		@Pc(8) int local8;
		if (arg0.lb != null) {
			local6 = true;
			for (local8 = 0; local8 < arg0.lb.length; local8++) {
				if (arg1[local8] != arg0.lb[local8]) {
					local6 = false;
					break;
				}
			}
			if (local6 && arg0.anInt10773 != -1) {
				@Pc(44) Class372 local44 = Static243.aClass343_3.method8356(arg0.anInt10773);
				@Pc(47) int local47 = local44.anInt10254;
				if (local47 == 1) {
					arg0.anInt10758 = 0;
					arg0.anInt10775 = arg2;
					arg0.anInt10750 = 0;
					arg0.anInt10767 = 0;
					arg0.anInt10804 = 1;
					if (!arg0.aBoolean819) {
						Static548.method7844(arg0, local44, arg0.anInt10750);
					}
				}
				if (local47 == 2) {
					arg0.anInt10767 = 0;
				}
			}
		}
		local6 = true;
		for (local8 = 0; local8 < arg1.length; local8++) {
			if (arg1[local8] != -1) {
				local6 = false;
			}
			if (arg0.lb == null || arg0.lb[local8] == -1 || Static243.aClass343_3.method8356(arg1[local8]).anInt10249 >= Static243.aClass343_3.method8356(arg0.lb[local8]).anInt10249) {
				arg0.lb = arg1;
				arg0.anInt10814 = arg0.anInt10812;
				arg0.anInt10775 = arg2;
			}
		}
		if (local6) {
			arg0.anInt10775 = arg2;
			arg0.lb = arg1;
			arg0.anInt10814 = arg0.anInt10812;
		}
	}
}
