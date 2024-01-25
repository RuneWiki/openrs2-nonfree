import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!qu", name = "L", descriptor = "I")
	public static int anInt5756;

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(ZI)V")
	public static void method4571() {
		Static310.method4308(Static139.aClass27_54);
		for (@Pc(25) Class10_Sub21 local25 = (Class10_Sub21) Static114.aClass167_12.method3702(); local25 != null; local25 = (Class10_Sub21) Static114.aClass167_12.method3708()) {
			if (!local25.method6034()) {
				local25 = (Class10_Sub21) Static114.aClass167_12.method3702();
				if (local25 == null) {
					break;
				}
			}
			if (local25.anInt3643 == 0) {
				Static153.method2607(true, local25, true);
			}
		}
		if (Static378.aClass89_13 != null) {
			Static135.method5400(Static378.aClass89_13);
			Static378.aClass89_13 = null;
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIII)V")
	public static void method4572(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1002) {
			Static79.method1511(Static172.aClass36_9, arg2, arg1);
		} else if (arg0 == 1011) {
			Static79.method1511(Static336.aClass36_12, arg2, arg1);
		} else if (arg0 == 1010) {
			Static79.method1511(Static97.aClass36_5, arg2, arg1);
		} else if (arg0 == 1006) {
			Static79.method1511(Static379.aClass36_3, arg2, arg1);
		} else if (arg0 == 1009) {
			Static79.method1511(Static36.aClass36_1, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IFBII[BFFFILclient!pj;FII)V")
	public static void method4573(@OriginalArg(1) float arg0, @OriginalArg(4) int arg1, @OriginalArg(5) byte[] arg2, @OriginalArg(6) float arg3, @OriginalArg(7) float arg4, @OriginalArg(8) float arg5, @OriginalArg(10) Class189 arg6, @OriginalArg(11) float arg7, @OriginalArg(12) int arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(48) int local48;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			@Pc(18) int local18 = arg1;
			arg6.method4655(arg5 / (float) 128, arg4 / (float) 128, 0, arg8, arg3 * 127.0F, arg7 / (float) 16, local12);
			arg3 *= arg0;
			for (local48 = 0; local48 < 16384; local48++) {
				arg2[local18] = (byte) ((float) arg2[local18] + local12[local48]);
				local18++;
			}
			arg4 *= 2.0F;
			arg5 *= 2.0F;
			arg7 *= 2.0F;
		}
		local48 = arg1;
		for (@Pc(103) int local103 = 0; local103 < 16384; local103++) {
			arg2[local48] = (byte) (arg2[local48] + 127);
			local48++;
		}
	}
}
