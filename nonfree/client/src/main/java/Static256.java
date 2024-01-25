import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!ika", name = "m", descriptor = "Lclient!lv;")
	public static Class232 aClass232_3;

	@OriginalMember(owner = "client!ika", name = "q", descriptor = "I")
	public static int anInt4826;

	@OriginalMember(owner = "client!ika", name = "s", descriptor = "[I")
	public static int[] anIntArray322;

	@OriginalMember(owner = "client!ika", name = "p", descriptor = "[I")
	public static final int[] anIntArray321 = new int[250];

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(I)V")
	public static void method4060() {
		Static132.aClass279_14.method6638();
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(ZIIZIBI)V")
	public static void method4062(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 >= arg5) {
			return;
		}
		@Pc(14) int local14 = (arg5 + arg2) / 2;
		@Pc(16) int local16 = arg2;
		@Pc(20) Class31_Sub1 local20 = Static491.aClass31_Sub1Array7[local14];
		Static491.aClass31_Sub1Array7[local14] = Static491.aClass31_Sub1Array7[arg5];
		Static491.aClass31_Sub1Array7[arg5] = local20;
		for (@Pc(32) int local32 = arg2; local32 < arg5; local32++) {
			if (Static587.method7888(arg4, local20, arg3, Static491.aClass31_Sub1Array7[local32], arg1, arg0) <= 0) {
				@Pc(52) Class31_Sub1 local52 = Static491.aClass31_Sub1Array7[local32];
				Static491.aClass31_Sub1Array7[local32] = Static491.aClass31_Sub1Array7[local16];
				Static491.aClass31_Sub1Array7[local16++] = local52;
			}
		}
		Static491.aClass31_Sub1Array7[arg5] = Static491.aClass31_Sub1Array7[local16];
		Static491.aClass31_Sub1Array7[local16] = local20;
		method4062(arg0, arg1, arg2, arg3, arg4, local16 - 1);
		method4062(arg0, arg1, local16 + 1, arg3, arg4, arg5);
	}
}
