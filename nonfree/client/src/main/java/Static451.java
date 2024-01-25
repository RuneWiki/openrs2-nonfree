import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
	public static int anInt7699 = 0;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIZILclient!ha;III)V")
	public static void method6506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class65 arg3, @OriginalArg(5) int arg4) {
		arg3.method6900(arg1, arg4, arg2, -10660793, arg0);
		arg3.method6900(arg1 + 1, arg4 + 1, arg2 - 2, -16777216, 16);
		arg3.method6943(arg1 + 1, arg2 + -2, arg0 - 19, arg4 + 18, -16777216);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZLclient!d;ILjava/awt/Canvas;I)Lclient!ha;")
	public static Class65 method6508(@OriginalArg(1) Interface4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) int arg3) {
		return new Class65_Sub3(arg2, arg0, arg1, arg3);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZII)V")
	public static void method6509(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class347 local14 = Static27.aClass347ArrayArray1[arg1][arg0];
		if (local14 != null) {
			Static311.anInt5912 = local14.anInt9686;
			Static148.anInt3030 = local14.anInt9680;
			Static331.anInt6125 = local14.anInt9685;
		}
		Static654.method8787();
	}
}
