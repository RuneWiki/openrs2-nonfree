import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!fj", name = "g", descriptor = "[S")
	public static short[] aShortArray31;

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "Lclient!oq;")
	public static final Class193 aClass193_3 = new Class193("", 16);

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
	public static int anInt1926 = 0;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZILclient!be;IIIILclient!qq;Lclient!tq;)V")
	public static void method1779(@OriginalArg(1) int arg0, @OriginalArg(2) Class24 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class28 arg6, @OriginalArg(8) Class239 arg7) {
		@Pc(15) Class94 local15 = Static171.aClass254_3.method5834(arg4);
		if (local15 == null || !local15.aBoolean164 || !local15.method2000(Static71.aClass126_1)) {
			return;
		}
		@Pc(35) int local35;
		if (local15.anIntArray230 != null) {
			@Pc(33) int[] local33 = new int[local15.anIntArray230.length];
			@Pc(47) int local47;
			for (local35 = 0; local35 < local33.length / 2; local35++) {
				if (Static9.anInt164 == 4) {
					local47 = (int) Static397.aFloat99 & 0x3FFF;
				} else {
					local47 = (int) Static397.aFloat99 + Static71.anInt1484 & 0x3FFF;
				}
				@Pc(58) int local58 = Class6_Sub1_Sub18.anIntArray642[local47];
				@Pc(62) int local62 = Class6_Sub1_Sub18.anIntArray643[local47];
				if (Static9.anInt164 != 4) {
					local62 = local62 * 256 / (Static393.anInt5623 + 256);
					local58 = local58 * 256 / (Static393.anInt5623 + 256);
				}
				local33[local35 * 2] = ((local15.anIntArray230[local35 * 2 + 1] * 4 + arg2) * local58 + (arg0 + local15.anIntArray230[local35 * 2] * 4) * local62 >> 15) + arg3 + arg7.anInt6435 / 2;
				local33[local35 * 2 + 1] = arg7.anInt6408 / 2 + arg5 - (local62 * (arg2 + local15.anIntArray230[local35 * 2 + 1] * 4) - local58 * (arg0 + local15.anIntArray230[local35 * 2] * 4) >> 15);
			}
			Static67.method1268(arg6, local33, local15.anInt2174, arg7.anIntArray566, arg7.anIntArray560);
			for (local47 = 0; local47 < local33.length / 2 - 1; local47++) {
				arg6.method3484(local33[local47 * 2], local33[local47 * 2 + 1], local33[(local47 + 1) * 2], local33[local47 * 2 + 3], local15.anInt2166, arg1, arg3, arg5);
			}
			arg6.method3484(local33[local33.length - 2], local33[local33.length - 1], local33[0], local33[1], local15.anInt2166, arg1, arg3, arg5);
		}
		@Pc(265) Class12 local265 = null;
		if (local15.anInt2183 != -1) {
			local265 = local15.method2001(arg6, false);
			if (local265 != null) {
				Static31.method409(arg1, local265, arg2, arg0, arg3, arg7, arg5);
			}
		}
		if (local15.aString20 == null) {
			return;
		}
		local35 = 0;
		if (local265 != null) {
			local35 = local265.method5664();
		}
		@Pc(298) Class92 local298 = Static120.aClass92_3;
		@Pc(300) Class201 local300 = Static358.aClass201_7;
		if (local15.anInt2190 == 1) {
			local300 = Static196.aClass201_4;
			local298 = Static60.aClass92_2;
		}
		if (local15.anInt2190 == 2) {
			local298 = Static45.aClass92_1;
			local300 = Static252.aClass201_5;
		}
		Static146.method2433(arg1, local15.anInt2169, arg3, arg2, local298, arg5, local15.aString20, arg7, local300, arg0, local35);
		return;
	}
}
