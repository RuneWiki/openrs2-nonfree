import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!ga", name = "y", descriptor = "I")
	public static int anInt10313;

	@OriginalMember(owner = "client!ga", name = "p", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_233 = new Class215(11, 6);

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!ha;ILclient!at;)V")
	public static void method8607(@OriginalArg(0) Class20 arg0, @OriginalArg(2) Class24 arg1) {
		@Pc(38) boolean local38 = Static635.aClass336_2.method8425(arg1.anInt421, arg1.anInt501, arg1.anInt483, arg1.anInt500 | 0xFF000000, arg1.anInt425, arg0, arg1.aBoolean31 ? Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aClass249_1 : null) == null;
		if (local38) {
			Static644.aClass341_70.method8528(new Class2_Sub19(arg1.anInt501, arg1.anInt483, arg1.anInt421, arg1.anInt500 | 0xFF000000, arg1.anInt425, arg1.aBoolean31));
			Static553.method8248(arg1);
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!at;ILclient!aa;IIIBILclient!ha;)V")
	public static void method8609(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class20 arg7) {
		@Pc(10) Class153 local10 = Static361.aClass248_4.method6584(arg3);
		if (local10 == null || !local10.aBoolean384 || !local10.method4493(Static286.aClass263_3)) {
			return;
		}
		@Pc(34) int local34;
		if (local10.anIntArray273 != null) {
			@Pc(32) int[] local32 = new int[local10.anIntArray273.length];
			@Pc(46) int local46;
			@Pc(57) int local57;
			@Pc(61) int local61;
			for (local34 = 0; local34 < local32.length / 2; local34++) {
				if (Static496.anInt9165 == 4) {
					local46 = (int) Static72.aFloat68 & 0x3FFF;
				} else {
					local46 = Static563.anInt10146 + (int) Static72.aFloat68 & 0x3FFF;
				}
				local57 = Class177.anIntArray361[local46];
				local61 = Class177.anIntArray360[local46];
				if (Static496.anInt9165 != 4) {
					local57 = local57 * 256 / (Static183.anInt4411 + 256);
					local61 = local61 * 256 / (Static183.anInt4411 + 256);
				}
				local32[local34 * 2] = (local57 * (local10.anIntArray273[local34 * 2 + 1] * 4 + arg6) + (arg4 + local10.anIntArray273[local34 * 2] * 4) * local61 >> 14) + (arg5 + (arg0.anInt441 / 2));
				local32[local34 * 2 + 1] = arg1 + arg0.anInt488 / 2 - ((local10.anIntArray273[local34 * 2 + 1] * 4 + arg6) * local61 - (arg4 + local10.anIntArray273[local34 * 2] * 4) * local57 >> 14);
			}
			Static95.method2536(arg7, local32, local10.anInt5228, arg0.anIntArray24, arg0.anIntArray30);
			if (local10.anInt5230 > 0) {
				@Pc(218) int local218;
				@Pc(228) int local228;
				@Pc(243) int local243;
				@Pc(255) int local255;
				for (local46 = 0; local46 < local32.length / 2 - 1; local46++) {
					local57 = local32[local46 * 2];
					local61 = local32[local46 * 2 + 1];
					local218 = local32[local46 * 2 + 2];
					local228 = local32[(local46 + 1) * 2 + 1];
					if (local57 > local218) {
						local243 = local57;
						local57 = local218;
						local255 = local61;
						local61 = local228;
						local218 = local243;
						local228 = local255;
					} else if (local218 == local57 && local61 > local228) {
						local243 = local61;
						local61 = local228;
						local228 = local243;
					}
					arg7.method7306(local57, local61, local218, local228, local10.anIntArray272[local10.aByteArray69[local46] & 0xFF], arg2, arg5, arg1, local10.anInt5230, local10.anInt5222, local10.anInt5242);
				}
				local57 = local32[local32.length - 2];
				local61 = local32[local32.length - 1];
				local218 = local32[0];
				local228 = local32[1];
				if (local218 < local57) {
					local243 = local57;
					local57 = local218;
					local255 = local61;
					local61 = local228;
					local218 = local243;
					local228 = local255;
				} else if (local57 == local218 && local61 > local228) {
					local243 = local61;
					local61 = local228;
					local228 = local243;
				}
				arg7.method7306(local57, local61, local218, local228, local10.anIntArray272[local10.aByteArray69[local10.aByteArray69.length - 1] & 0xFF], arg2, arg5, arg1, local10.anInt5230, local10.anInt5222, local10.anInt5242);
			} else {
				for (local46 = 0; local46 < local32.length / 2 - 1; local46++) {
					arg7.method7239(local32[local46 * 2], local32[local46 * 2 + 1], local32[(local46 + 1) * 2], local32[local46 * 2 + 3], local10.anIntArray272[local10.aByteArray69[local46] & 0xFF], arg2, arg5, arg1);
				}
				arg7.method7239(local32[local32.length - 2], local32[local32.length - 1], local32[0], local32[1], local10.anIntArray272[local10.aByteArray69[local10.aByteArray69.length - 1] & 0xFF], arg2, arg5, arg1);
			}
		}
		@Pc(474) Class46 local474 = null;
		if (local10.anInt5224 != -1) {
			local474 = local10.method4494(false, arg7);
			if (local474 != null) {
				Static402.method6561(arg1, local474, arg5, arg0, arg2, arg6, arg4);
			}
		}
		if (local10.aString51 == null) {
			return;
		}
		local34 = 0;
		if (local474 != null) {
			local34 = local474.method6208();
		}
		@Pc(508) Class68 local508 = Static529.aClass68_10;
		@Pc(510) Class239 local510 = Static187.aClass239_8;
		if (local10.anInt5223 == 1) {
			local508 = Static300.aClass68_4;
			local510 = Static58.aClass239_18;
		}
		if (local10.anInt5223 == 2) {
			local510 = Static161.aClass239_14;
			local508 = Static571.aClass68_12;
		}
		Static104.method2673(local510, local10.anInt5226, arg2, arg6, arg5, local10.aString51, arg1, local508, local34, arg0, arg4);
		return;
	}
}
