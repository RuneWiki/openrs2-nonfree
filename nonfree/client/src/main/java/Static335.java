import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!le", name = "j", descriptor = "I")
	public static int anInt6094;

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V")
	public static void method5520() {
		Static307.aClass150Array1 = new Class150[50];
		Static356.anInt6821 = 0;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IZJILjava/lang/String;IIZZIJILjava/lang/String;)V")
	public static void method5521(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) long arg9, @OriginalArg(11) int arg10, @OriginalArg(12) String arg11) {
		if (!Static183.aBoolean305 && Static276.anInt5124 < 500) {
			@Pc(21) int local21 = arg8 == -1 ? Static113.anInt2045 : arg8;
			@Pc(37) Class2_Sub1_Sub13 local37 = new Class2_Sub1_Sub13(arg11, arg3, local21, arg10, arg0, arg2, arg5, arg4, arg7, arg6, arg9, arg1);
			Static531.method8225(local37);
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(B)I")
	public static int method5522() {
		return Static396.aClass249_1.method6627();
	}
}
