import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!ika", name = "d", descriptor = "I")
	public static int anInt4527;

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "I")
	public static int anInt4524 = 0;

	@OriginalMember(owner = "client!ika", name = "b", descriptor = "I")
	public static int anInt4525 = -1;

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(IILclient!aa;Lclient!ha;IILclient!or;II)V")
	public static void method4147(@OriginalArg(1) int arg0, @OriginalArg(2) Class1 arg1, @OriginalArg(3) Class13 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class260 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(12) Class308 local12 = Static84.aClass27_1.method693(arg7);
		if (local12 == null || !local12.aBoolean683 || !local12.method7689(Static131.aClass66_1)) {
			return;
		}
		@Pc(32) int local32;
		if (local12.anIntArray748 != null) {
			@Pc(30) int[] local30 = new int[local12.anIntArray748.length];
			@Pc(46) int local46;
			@Pc(57) int local57;
			@Pc(61) int local61;
			for (local32 = 0; local32 < local30.length / 2; local32++) {
				if (Static428.anInt6834 == 4) {
					local46 = (int) Static618.aFloat207 & 0x3FFF;
				} else {
					local46 = (int) Static618.aFloat207 + Static490.anInt8101 & 0x3FFF;
				}
				local57 = Class3_Sub20.anIntArray206[local46];
				local61 = Class3_Sub20.anIntArray204[local46];
				if (Static428.anInt6834 != 4) {
					local61 = local61 * 256 / (Static663.anInt10571 + 256);
					local57 = local57 * 256 / (Static663.anInt10571 + 256);
				}
				local30[local32 * 2] = (local57 * (arg3 + local12.anIntArray748[local32 * 2 + 1] * 4) + local61 * (local12.anIntArray748[local32 * 2] * 4 + arg0) >> 14) + arg5.anInt6963 / 2 + arg6;
				local30[local32 * 2 + 1] = arg5.anInt6971 / 2 + arg4 - (local61 * (local12.anIntArray748[local32 * 2 + 1] * 4 + arg3) - local57 * (arg0 + local12.anIntArray748[local32 * 2] * 4) >> 14);
			}
			Static573.method8082(arg2, local30, local12.anInt8791, arg5.anIntArray624, arg5.anIntArray620);
			if (local12.anInt8796 > 0) {
				@Pc(212) int local212;
				@Pc(222) int local222;
				@Pc(245) int local245;
				@Pc(255) int local255;
				for (local46 = 0; local46 < local30.length / 2 - 1; local46++) {
					local57 = local30[local46 * 2];
					local61 = local30[local46 * 2 + 1];
					local212 = local30[(local46 + 1) * 2];
					local222 = local30[(local46 + 1) * 2 + 1];
					if (local57 > local212) {
						local245 = local57;
						local255 = local61;
						local57 = local212;
						local61 = local222;
						local212 = local245;
						local222 = local255;
					} else if (local212 == local57 && local222 < local61) {
						local245 = local61;
						local61 = local222;
						local222 = local245;
					}
					arg2.method8500(local57, local61, local212, local222, local12.anIntArray749[local12.aByteArray94[local46] & 0xFF], arg1, arg6, arg4, local12.anInt8796, local12.anInt8780, local12.anInt8804);
				}
				local57 = local30[local30.length - 2];
				local61 = local30[local30.length - 1];
				local212 = local30[0];
				local222 = local30[1];
				if (local212 < local57) {
					local245 = local57;
					local57 = local212;
					local255 = local61;
					local61 = local222;
					local212 = local245;
					local222 = local255;
				} else if (local212 == local57 && local222 < local61) {
					local245 = local61;
					local61 = local222;
					local222 = local245;
				}
				arg2.method8500(local57, local61, local212, local222, local12.anIntArray749[local12.aByteArray94[local12.aByteArray94.length - 1] & 0xFF], arg1, arg6, arg4, local12.anInt8796, local12.anInt8780, local12.anInt8804);
			} else {
				for (local46 = 0; local46 < local30.length / 2 - 1; local46++) {
					arg2.method8463(local30[local46 * 2], local30[local46 * 2 + 1], local30[local46 * 2 + 2], local30[local46 * 2 + 1 + 2], local12.anIntArray749[local12.aByteArray94[local46] & 0xFF], arg1, arg6, arg4);
				}
				arg2.method8463(local30[local30.length - 2], local30[local30.length - 1], local30[0], local30[1], local12.anIntArray749[local12.aByteArray94[local12.aByteArray94.length - 1] & 0xFF], arg1, arg6, arg4);
			}
		}
		@Pc(490) Class33 local490 = null;
		if (local12.anInt8801 != -1) {
			local490 = local12.method7691(false, arg2);
			if (local490 != null) {
				Static236.method3938(arg0, arg3, arg4, arg5, arg1, local490, arg6);
			}
		}
		if (local12.aString103 == null) {
			return;
		}
		local32 = 0;
		if (local490 != null) {
			local32 = local490.method7662();
		}
		@Pc(526) Class69 local526 = Static400.aClass69_9;
		@Pc(528) Class88 local528 = Static595.aClass88_20;
		if (local12.anInt8805 == 1) {
			local526 = Static504.aClass69_11;
			local528 = Static253.aClass88_19;
		}
		if (local12.anInt8805 == 2) {
			local526 = Static303.aClass69_6;
			local528 = Static59.aClass88_1;
		}
		Static460.method6704(local12.aString103, arg1, arg3, local32, arg5, arg6, local528, local526, arg4, arg0, local12.anInt8802);
	}
}
