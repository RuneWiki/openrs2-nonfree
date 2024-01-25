import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!sa", name = "R", descriptor = "Lclient!um;")
	public static Class243 aClass243_209;

	@OriginalMember(owner = "client!sa", name = "S", descriptor = "[I")
	public static final int[] anIntArray425 = new int[13];

	@OriginalMember(owner = "client!sa", name = "T", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray42 = new String[100];

	@OriginalMember(owner = "client!sa", name = "U", descriptor = "Lclient!mo;")
	public static final Class163 aClass163_11 = new Class163(6, 3);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIILclient!za;Lclient!fi;ZILclient!ta;)V")
	public static void method4748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class200 arg4, @OriginalArg(5) Class76 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class97 arg7) {
		@Pc(14) Class6 local14 = Static404.aClass28_4.method670(arg0);
		if (local14 == null || !local14.aBoolean24 || !local14.method92(Static408.aClass39_1)) {
			return;
		}
		@Pc(34) int local34;
		if (local14.anIntArray8 != null) {
			@Pc(32) int[] local32 = new int[local14.anIntArray8.length];
			@Pc(46) int local46;
			for (local34 = 0; local34 < local32.length / 2; local34++) {
				if (Static449.anInt7379 == 4) {
					local46 = (int) Static99.aFloat33 & 0x3FFF;
				} else {
					local46 = Static65.anInt5018 + (int) Static99.aFloat33 & 0x3FFF;
				}
				@Pc(59) int local59 = Class30.anIntArray38[local46];
				@Pc(63) int local63 = Class30.anIntArray37[local46];
				if (Static449.anInt7379 != 4) {
					local59 = local59 * 256 / (Static430.anInt7181 + 256);
					local63 = local63 * 256 / (Static430.anInt7181 + 256);
				}
				local32[local34 * 2] = ((arg1 + local14.anIntArray8[local34 * 2] * 4) * local63 + (local14.anIntArray8[local34 * 2 + 1] * 4 + arg6) * local59 >> 15) + arg2 + arg5.anInt2127 / 2;
				local32[local34 * 2 + 1] = arg3 + arg5.anInt2106 / 2 - (local63 * (arg6 + local14.anIntArray8[local34 * 2 + 1] * 4) - (arg1 + local14.anIntArray8[local34 * 2] * 4) * local59 >> 15);
			}
			Static100.method1408(arg4, local32, local14.anInt121, arg5.anIntArray116, arg5.anIntArray107);
			for (local46 = 0; local46 < local32.length / 2 - 1; local46++) {
				arg4.method5870(local32[local46 * 2], local32[local46 * 2 + 1], local32[local46 * 2 + 2], local32[(local46 + 1) * 2 + 1], local14.anInt106, arg7, arg2, arg3);
			}
			arg4.method5870(local32[local32.length - 2], local32[local32.length - 1], local32[0], local32[1], local14.anInt106, arg7, arg2, arg3);
		}
		@Pc(265) Class49 local265 = null;
		if (local14.anInt102 != -1) {
			local265 = local14.method84(false, arg4);
			if (local265 != null) {
				Static280.method3468(arg7, arg1, arg3, local265, arg2, arg5, arg6);
			}
		}
		if (local14.aString1 == null) {
			return;
		}
		local34 = 0;
		if (local265 != null) {
			local34 = local265.ZA();
		}
		@Pc(298) Class23 local298 = Static138.aClass23_2;
		@Pc(300) Class14 local300 = Static113.aClass14_5;
		if (local14.anInt119 == 1) {
			local298 = Static428.aClass23_4;
			local300 = Static51.aClass14_4;
		}
		if (local14.anInt119 == 2) {
			local300 = Static21.aClass14_1;
			local298 = Static56.aClass23_1;
		}
		Static433.method5726(arg5, arg7, local34, arg1, arg3, local300, local14.anInt98, local298, local14.aString1, arg2, arg6);
		return;
	}
}
