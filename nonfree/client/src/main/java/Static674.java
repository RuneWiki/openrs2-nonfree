import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static674 {

	@OriginalMember(owner = "client!wq", name = "F", descriptor = "I")
	public static int anInt10304 = -1;

	@OriginalMember(owner = "client!wq", name = "G", descriptor = "Z")
	public static boolean aBoolean762 = false;

	@OriginalMember(owner = "client!wq", name = "H", descriptor = "Z")
	public static boolean aBoolean763 = true;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIBI)I")
	public static int method8719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg2;
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IILclient!bi;Lclient!ha;Lclient!gka;IILclient!po;I)V")
	public static void method8720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub8 arg2, @OriginalArg(3) Class16 arg3, @OriginalArg(4) Class145 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class281 arg7) {
		@Pc(14) int local14 = arg0 - arg5 / 2 - 5;
		@Pc(18) int local18 = arg1 + 2;
		if (arg4.anInt3623 != 0) {
			arg3.method8113(arg1 + arg6 * arg7.method6670() + 1 - local18, local14, arg5 + 10, arg4.anInt3623, local18);
		}
		if (arg4.anInt3609 != 0) {
			arg3.method8180(arg4.anInt3609, local14, arg5 + 10, -local18 + arg7.method6670() * arg6 + arg1 + 1, local18);
		}
		@Pc(79) int local79 = arg4.anInt3601;
		if (arg2.aBoolean108 && arg4.anInt3612 != -1) {
			local79 = arg4.anInt3612;
		}
		for (@Pc(92) int local92 = 0; local92 < arg6; local92++) {
			@Pc(98) String local98 = Static467.aStringArray55[local92];
			if (arg6 - 1 > local92) {
				local98 = local98.substring(0, local98.length() - 4);
			}
			arg7.method6671(arg3, local98, arg0, arg1, local79);
			arg1 += arg7.method6670();
		}
	}
}
