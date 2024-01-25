import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static639 {

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIIILjava/lang/String;Lclient!ha;)V")
	public static void method8543(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) String arg4, @OriginalArg(7) Class33 arg5) {
		if (Static9.aClass17_77 == null || Static475.aClass17_56 == null) {
			if (Static368.aClass34_80.method1235(Static516.anInt8033) && Static368.aClass34_80.method1235(Static485.anInt7631)) {
				Static9.aClass17_77 = arg5.method8147(Static682.method1662(Static368.aClass34_80, Static516.anInt8033, 0), true);
				@Pc(28) Class51 local28 = Static682.method1662(Static368.aClass34_80, Static485.anInt7631, 0);
				Static475.aClass17_56 = arg5.method8147(local28, true);
				local28.method1656();
				Static191.aClass17_30 = arg5.method8147(local28, true);
			} else {
				arg5.aa(arg1, arg2, arg3, 20, 255 - Static164.anInt2983 << 24 | Static533.anInt8272, 1);
			}
		}
		if (Static9.aClass17_77 != null && Static475.aClass17_56 != null) {
			@Pc(86) int local86 = (arg3 - Static475.aClass17_56.method5268() * 2) / Static9.aClass17_77.method5268();
			for (@Pc(88) int local88 = 0; local88 < local86; local88++) {
				Static9.aClass17_77.method5246(arg1 + Static475.aClass17_56.method5268() + Static9.aClass17_77.method5268() * local88, arg2);
			}
			Static475.aClass17_56.method5246(arg1, arg2);
			Static191.aClass17_30.method5246(arg3 + arg1 - Static191.aClass17_30.method5268(), arg2);
		}
		Static344.aClass56_10.method8052(arg1 + 3, arg4, arg2 + 14, Static222.anInt7628 | 0xFF000000, -1);
		arg5.aa(arg1, arg2 + 20, arg3, arg0 - 20, Static533.anInt8272 | -Static164.anInt2983 + 255 << 24, 1);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I[I[IILclient!wg;B)Lclient!oja;")
	public static Class1_Sub3 method8545(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class33_Sub2 arg4) {
		@Pc(23) int local23;
		@Pc(33) int local33;
		@Pc(35) int local35;
		if (!arg4.method8165(Static111.aClass79_7, Static360.aClass276_15)) {
			@Pc(65) int[] local65 = new int[arg0 * arg3];
			for (local23 = 0; local23 < arg3; local23++) {
				local33 = local23 * arg0 + arg2[local23];
				for (local35 = 0; local35 < arg1[local23]; local35++) {
					local65[local33++] = -16777216;
				}
			}
			return new Class1_Sub3(arg4, arg0, arg3, local65);
		}
		@Pc(21) byte[] local21 = new byte[arg0 * arg3];
		for (local23 = 0; local23 < arg3; local23++) {
			local33 = arg2[local23] + local23 * arg0;
			for (local35 = 0; local35 < arg1[local23]; local35++) {
				local21[local33++] = -1;
			}
		}
		return new Class1_Sub3(arg4, arg0, arg3, local21);
	}
}
