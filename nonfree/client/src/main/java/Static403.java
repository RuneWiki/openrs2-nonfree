import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!ui", name = "i", descriptor = "Lclient!pc;")
	public static Class188 aClass188_117;

	@OriginalMember(owner = "client!ui", name = "r", descriptor = "I")
	public static int anInt7008 = 0;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZLclient!gm;)V")
	public static void method5485(@OriginalArg(1) Class2_Sub18 arg0) {
		arg0.aBoolean475 = false;
		if (arg0.aClass2_Sub41_5 != null) {
			arg0.aClass2_Sub41_5.anInt7098 = 0;
		}
		for (@Pc(18) Class2_Sub18 local18 = arg0.method4448(); local18 != null; local18 = arg0.method4451()) {
			method5485(local18);
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(FFILclient!v;IIFFIFI)[B")
	public static byte[] method5489(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) Class160 arg2, @OriginalArg(6) float arg3, @OriginalArg(7) float arg4, @OriginalArg(9) float arg5) {
		@Pc(10) byte[] local10 = new byte[262144];
		Static4.method136(arg4, arg5, local10, arg3, arg2, arg0, 0, arg1);
		return local10;
	}
}
