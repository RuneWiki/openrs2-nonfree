import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!pda", name = "t", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_160 = new Class359(24, 0);

	@OriginalMember(owner = "client!pda", name = "w", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_161 = new Class359(45, 12);

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(ILclient!qf;)V")
	public static void method6441(@OriginalArg(1) Class5_Sub3_Sub15 arg0) {
		arg0.method8687();
		@Pc(8) boolean local8 = false;
		for (@Pc(15) Class5_Sub3_Sub15 local15 = (Class5_Sub3_Sub15) Static609.aClass358_13.method8322(); local15 != null; local15 = (Class5_Sub3_Sub15) Static609.aClass358_13.method8328()) {
			if (Static527.method7438(local15.method6806(), arg0.method6806())) {
				Static580.method8008(local15, arg0);
				local8 = true;
				break;
			}
		}
		if (!local8) {
			Static609.aClass358_13.method8329(arg0);
		}
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(B)[Lclient!gp;")
	public static Class139[] method6442() {
		return new Class139[] { Static456.aClass139_7, Static590.aClass139_10, Static549.aClass139_9, Static340.aClass139_5, Static149.aClass139_3, Static490.aClass139_8, Static3.aClass139_1, Static212.aClass139_4, Static432.aClass139_6, Static73.aClass139_2 };
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method6443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg7 >= Static106.anInt2266 && arg7 <= Static669.anInt10712 && Static106.anInt2266 <= arg8 && Static669.anInt10712 >= arg8 && Static106.anInt2266 <= arg3 && arg3 <= Static669.anInt10712 && arg1 >= Static106.anInt2266 && Static669.anInt10712 >= arg1 && Static639.anInt10384 <= arg4 && arg4 <= Static496.anInt8305 && arg0 >= Static639.anInt10384 && Static496.anInt8305 >= arg0 && arg2 >= Static639.anInt10384 && Static496.anInt8305 >= arg2 && arg6 >= Static639.anInt10384 && Static496.anInt8305 >= arg6) {
			Static138.method2414(arg5, arg1, arg4, arg6, arg8, arg2, arg7, arg3, arg0);
		} else {
			Static55.method733(arg7, arg6, arg2, arg5, arg3, arg0, arg1, arg8, arg4);
		}
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(IBII)I")
	public static int method6444(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static495.aClass109Array4 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg1 >> 9;
		@Pc(15) int local15 = arg2 >> 9;
		if (local11 < 0 || local15 < 0 || Static201.anInt3834 - 1 < local11 || Static626.anInt10238 - 1 < local15) {
			return 0;
		}
		@Pc(52) int local52 = arg0;
		if (arg0 < 3 && (Static7.aByteArrayArrayArray1[1][local11][local15] & 0x2) != 0) {
			local52 = arg0 + 1;
		}
		return Static495.aClass109Array4[local52].method7702(arg1, arg2);
	}
}
