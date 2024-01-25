import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static560 {

	@OriginalMember(owner = "client!vfa", name = "H", descriptor = "I")
	public static int anInt9246;

	@OriginalMember(owner = "client!vfa", name = "I", descriptor = "I")
	public static int anInt9247;

	@OriginalMember(owner = "client!vfa", name = "D", descriptor = "I")
	public static int anInt9242 = -1;

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Lclient!ed;)V")
	public static void method7561(@OriginalArg(0) Class78 arg0) {
		if (Static573.anInt9406 >= 65535) {
			return;
		}
		@Pc(6) Class6_Sub7 local6 = arg0.aClass6_Sub7_1;
		Static478.aClass78Array1[Static573.anInt9406] = arg0;
		Static599.aBooleanArray44[Static573.anInt9406] = false;
		Static573.anInt9406++;
		@Pc(21) int local21 = arg0.anInt2074;
		if (arg0.aBoolean146) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt2074;
		if (arg0.aBoolean145) {
			local29 = Static107.anInt2060 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method4286() + Static108.anInt2068 - local6.method4283() >> Static339.anInt6128;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method4286() + local6.method4283() - Static108.anInt2068 >> Static339.anInt6128;
			if (local73 >= Static555.anInt9182) {
				local73 = Static555.anInt9182 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray13[local41++];
				@Pc(105) int local105 = (local6.method4292() + Static108.anInt2068 - local6.method4283() >> Static339.anInt6128) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static401.anInt7022) {
					local113 = Static401.anInt7022 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static362.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static362.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static573.anInt9406;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static362.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static573.anInt9406 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static362.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static573.anInt9406 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static362.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static573.anInt9406 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Lclient!rr;III)V")
	public static void method7563(@OriginalArg(0) Class292 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static220.anInt4394 = arg1;
		Static35.anInt1964 = arg2;
		Static206.aClass292_3 = arg0;
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(ILclient!kd;Lclient!kd;)V")
	public static void method7565(@OriginalArg(1) Class6 arg0, @OriginalArg(2) Class6 arg1) {
		if (arg0.aClass6_285 != null) {
			arg0.method7804();
		}
		arg0.aClass6_286 = arg1;
		arg0.aClass6_285 = arg1.aClass6_285;
		arg0.aClass6_285.aClass6_286 = arg0;
		arg0.aClass6_286.aClass6_285 = arg0;
	}
}
