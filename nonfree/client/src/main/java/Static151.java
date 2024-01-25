import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!fda", name = "t", descriptor = "Lclient!bt;")
	public static Class34 aClass34_38;

	@OriginalMember(owner = "client!fda", name = "jb", descriptor = "[Lclient!nm;")
	public static Interface18[] anInterface18Array1;

	@OriginalMember(owner = "client!fda", name = "K", descriptor = "[I")
	public static final int[] anIntArray198 = new int[200];

	@OriginalMember(owner = "client!fda", name = "Eb", descriptor = "[I")
	public static final int[] anIntArray201 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method2607(@OriginalArg(0) Class33 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static423.aBoolean517) {
			local7 = Static383.method8455();
			local9 = Static286.method4120();
		}
		arg0.KA(local7, local9, local7 + Static632.anInt9867, local9 + 350);
		arg0.aa(local7, local9, Static632.anInt9867, 350, Static132.anInt2496 << 24 | 0x332277, 1);
		Static100.method2025(local9, Static632.anInt9867 + local7, local7, local9 + 350);
		@Pc(53) int local53 = 350 / Static548.anInt8426;
		@Pc(63) int local63;
		if (Static249.anInt4093 > 0) {
			local63 = 342 - Static548.anInt8426;
			@Pc(73) int local73 = local53 * local63 / (Static249.anInt4093 + local53 - 1);
			@Pc(75) int local75 = 4;
			if (Static249.anInt4093 > 1) {
				local75 = (Static249.anInt4093 - Static319.anInt4944 - 1) * (local63 - local73) / (Static249.anInt4093 - 1) + 4;
			}
			arg0.aa(Static632.anInt9867 + local7 - 16, local9 - -local75, 12, local73, Static132.anInt2496 << 24 | 0x332277, 2);
			for (@Pc(118) int local118 = Static319.anInt4944; Static319.anInt4944 + local53 > local118 && Static249.anInt4093 > local118; local118++) {
				@Pc(127) String[] local127 = Static189.method2958('\b', Static489.aStringArray40[local118]);
				@Pc(136) int local136 = (Static632.anInt9867 - 16 - 8) / local127.length;
				for (@Pc(138) int local138 = 0; local138 < local127.length; local138++) {
					@Pc(147) int local147 = local138 * local136 + 8;
					arg0.KA(local7 + local147, local9, local136 + local147 + local7 - 8, local9 + 350);
					Static189.aClass56_5.method8052(local147 + local7, Static633.method8388(local127[local138]), local9 + 350 - (local118 - Static319.anInt4944) * Static548.anInt8426 - Static44.anInt898 - Static636.aClass31_14.anInt1095 - 2, -1, -16777216);
				}
			}
		}
		Static302.aClass56_9.method8057("Build: 648", local9 + 330, Static632.anInt9867 + (local7 - 25), -1, -16777216);
		arg0.KA(local7, local9, Static632.anInt9867 + local7, local9 - -350);
		arg0.method8082(local7, local9 + 350 - Static44.anInt898, -1, Static632.anInt9867);
		Static344.aClass56_10.method8052(local7 + 10, "--> " + Static633.method8388(Static330.aString58), local9 + 350 - Static641.aClass31_10.anInt1095 - 1, -1, -16777216);
		if (!Static175.aBoolean230) {
			return;
		}
		local63 = -1;
		if (Static177.anInt3088 % 30 > 15) {
			local63 = 16777215;
		}
		arg0.method8097(local63, Static641.aClass31_10.method1024("--> " + Static633.method8388(Static330.aString58).substring(0, Static631.anInt9864)) + local7 + 10, local9 + 350 + (-Static641.aClass31_10.anInt1095 - 11), 12);
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lclient!bt;Lclient!bt;Lclient!bt;Lclient!bt;I)V")
	public static void method2616(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class34 arg3) {
		Static279.aClass34_62 = arg2;
		Static358.aClass34_79 = arg3;
		Static282.aClass34_63 = arg0;
		Static392.aClass199ArrayArray2 = new Class199[Static358.aClass34_79.method1247()][];
		Static335.aBooleanArray11 = new boolean[Static358.aClass34_79.method1247()];
	}

	@OriginalMember(owner = "client!fda", name = "b", descriptor = "(I)V")
	public static void method2617() {
		Static169.aClass17Array5 = null;
		Static217.aClass17_32 = null;
		Static189.aClass56_5 = null;
		Static302.aClass56_9 = null;
		Static384.aClass17Array12 = null;
		Static577.aClass17Array17 = null;
		Static638.aClass17Array18 = null;
		Static275.aClass17Array7 = null;
		Static388.aClass17Array13 = null;
		Static455.aClass17Array16 = null;
		Static404.aClass17Array15 = null;
		Static152.aClass17Array4 = null;
		Static344.aClass56_10 = null;
		Static404.aClass17Array14 = null;
		Static300.aClass17Array9 = null;
		Static93.aClass17_14 = null;
		Static359.aClass17Array11 = null;
		Static338.aClass17Array10 = null;
	}
}
