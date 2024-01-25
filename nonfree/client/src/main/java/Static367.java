import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!no", name = "w", descriptor = "[Lclient!fl;")
	public static Class106[] aClass106Array1;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;ZIZZJII)V")
	public static void method5215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) long arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static289.aBoolean370 && Static161.anInt3613 < 500) {
			@Pc(18) int local18 = arg9 == -1 ? Static580.anInt10049 : arg9;
			@Pc(32) Class3_Sub13 local32 = new Class3_Sub13(arg2, arg3, local18, arg5, arg1, arg7, arg8, arg0, arg4, arg6);
			Static260.aClass244_40.method5570(local32);
			Static161.anInt3613++;
		}
	}
}
