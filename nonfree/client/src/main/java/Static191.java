import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!hv", name = "Ib", descriptor = "Lclient!kea;")
	public static Class161 aClass161_43;

	@OriginalMember(owner = "client!hv", name = "Db", descriptor = "J")
	public static long aLong106 = 0L;

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILclient!oa;IIILclient!qf;ILclient!fa;I)V")
	public static void method3678(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class245 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class10 arg7) {
		@Pc(15) Class179 local15 = Static531.aClass135_4.method3801(arg2);
		if (local15 == null || !local15.aBoolean369 || !local15.method4796(Static127.aClass215_1)) {
			return;
		}
		@Pc(35) int local35;
		if (local15.anIntArray509 != null) {
			@Pc(33) int[] local33 = new int[local15.anIntArray509.length];
			@Pc(47) int local47;
			for (local35 = 0; local35 < local33.length / 2; local35++) {
				if (Static305.anInt5998 == 4) {
					local47 = (int) Static487.aFloat258 & 0x3FFF;
				} else {
					local47 = Static262.anInt5488 + (int) Static487.aFloat258 & 0x3FFF;
				}
				@Pc(60) int local60 = Class5.anIntArray761[local47];
				@Pc(64) int local64 = Class5.anIntArray760[local47];
				if (Static305.anInt5998 != 4) {
					local60 = local60 * 256 / (Static509.anInt8869 + 256);
					local64 = local64 * 256 / (Static509.anInt8869 + 256);
				}
				local33[local35 * 2] = (local64 * (local15.anIntArray509[local35 * 2] * 4 + arg6) + local60 * (local15.anIntArray509[local35 * 2 + 1] * 4 + arg3) >> 14) + arg5.anInt7249 / 2 + arg0;
				local33[local35 * 2 + 1] = arg5.anInt7229 / 2 + arg4 - (local64 * (local15.anIntArray509[local35 * 2 + 1] * 4 + arg3) - local60 * (local15.anIntArray509[local35 * 2] * 4 + arg6) >> 14);
			}
			Static540.method7702(arg1, local33, local15.anInt5714, arg5.anIntArray644, arg5.anIntArray643);
			for (local47 = 0; local47 < local33.length / 2 - 1; local47++) {
				arg1.method7467(local33[local47 * 2], local33[local47 * 2 + 1], local33[(local47 + 1) * 2], local33[(local47 + 1) * 2 + 1], local15.anInt5725, arg7, arg0, arg4);
			}
			arg1.method7467(local33[local33.length - 2], local33[local33.length - 1], local33[0], local33[1], local15.anInt5725, arg7, arg0, arg4);
		}
		@Pc(266) Class119 local266 = null;
		if (local15.anInt5730 != -1) {
			local266 = local15.method4798(false, arg1);
			if (local266 != null) {
				Static344.method5465(arg4, arg3, arg6, arg0, arg5, arg7, local266);
			}
		}
		if (local15.aString41 == null) {
			return;
		}
		local35 = 0;
		if (local266 != null) {
			local35 = local266.b();
		}
		@Pc(300) Class59 local300 = Static364.aClass59_3;
		@Pc(302) Class53 local302 = Static23.aClass53_15;
		if (local15.anInt5726 == 1) {
			local300 = Static164.aClass59_1;
			local302 = Static54.aClass53_7;
		}
		if (local15.anInt5726 == 2) {
			local302 = Static25.aClass53_6;
			local300 = Static294.aClass59_2;
		}
		Static317.method5131(arg0, arg7, local302, local15.anInt5719, local15.aString41, local35, arg6, local300, arg3, arg4, arg5);
		return;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(III)Z")
	public static boolean method3679(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}
}
