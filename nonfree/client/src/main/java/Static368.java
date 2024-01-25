import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIILclient!jc;Lclient!za;)V")
	public static void method4942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class126 arg3, @OriginalArg(5) Class50 arg4) {
		@Pc(9) Class14 local9 = Static228.aClass2_4.method12(arg3.anInt3783);
		if (local9.anInt303 == -1) {
			return;
		}
		if (arg3.aBoolean241) {
			@Pc(26) int local26 = arg0 + arg3.anInt3775;
			arg0 = local26 & 0x3;
		} else {
			arg0 = 0;
		}
		@Pc(38) Class80 local38 = local9.method247(arg0, arg3.aBoolean245, arg4);
		if (local38 == null) {
			return;
		}
		@Pc(48) int local48 = arg3.anInt3785;
		@Pc(51) int local51 = arg3.anInt3782;
		if ((arg0 & 0x1) == 1) {
			local48 = arg3.anInt3782;
			local51 = arg3.anInt3785;
		}
		@Pc(65) int local65 = local38.RA();
		@Pc(68) int local68 = local38.Q();
		if (local9.aBoolean23) {
			local68 = local51 * 4;
			local65 = local48 * 4;
		}
		if (local9.anInt313 == 0) {
			local38.method5554(arg1, arg2 - (local51 - 1) * 4, local65, local68);
		} else {
			local38.ya(arg1, arg2 - (local51 - 1) * 4, local65, local68, 0, local9.anInt313 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)[Lclient!og;")
	public static Class178[] method4944() {
		return new Class178[] { Static185.aClass178_14, Static116.aClass178_6, Static336.aClass178_15 };
	}
}
