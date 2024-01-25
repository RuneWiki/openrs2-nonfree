import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "[[B")
	public static final byte[][] aByteArrayArray5 = new byte[250][];

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_40 = new Class286(76, 8);

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "S")
	public static short aShort54 = 32767;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BIIIIIIII)V")
	public static void method3644(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 < 1 || arg4 < 1 || arg0 > Static362.anInt8653 - 2 || arg4 > Static206.anInt11291 - 2) {
			return;
		}
		@Pc(35) int local35 = arg2;
		if (arg2 < 3 && Static135.method2226(arg0, arg4)) {
			local35 = arg2 + 1;
		}
		if (Static713.aClass3_Sub55_31.aClass15_Sub25_1.method8268() == 0 && !Static467.method6925(local35, arg0, Static715.anInt7793, arg4)) {
			return;
		}
		if (Static584.aClass262ArrayArrayArray2 == null) {
			return;
		}
		Static462.aClass131_Sub1_2.method3087(arg2, Static488.aClass67_12, arg0, arg4, arg5, Static678.aClass360Array5[arg2]);
		if (arg7 >= 0) {
			@Pc(91) int local91 = Static713.aClass3_Sub55_31.aClass15_Sub29_1.method9292();
			Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub29_1, 1);
			Static462.aClass131_Sub1_2.method3081(arg6, arg7, arg1, arg2, local35, Static678.aClass360Array5[arg2], arg0, arg4, Static488.aClass67_12, arg3);
			Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub29_1, local91);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
	public static void method3645() {
		Static319.method9110();
		Static140.method2345();
	}
}
