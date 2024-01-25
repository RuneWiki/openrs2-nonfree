import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "Lclient!cha;")
	public static final Class55 aClass55_8 = new Class55(4, -1);

	@OriginalMember(owner = "client!hk", name = "j", descriptor = "[I")
	public static final int[] anIntArray264 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(B)V")
	public static void method3548() {
		for (@Pc(6) Class2_Sub27 local6 = (Class2_Sub27) Static143.aClass114_16.method2772(); local6 != null; local6 = (Class2_Sub27) Static143.aClass114_16.method2762()) {
			if (local6.aBoolean401) {
				local6.method4738();
			}
		}
		for (@Pc(34) Class2_Sub27 local34 = (Class2_Sub27) Static536.aClass114_41.method2772(); local34 != null; local34 = (Class2_Sub27) Static536.aClass114_41.method2762()) {
			if (local34.aBoolean401) {
				local34.method4738();
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIBIIII)V")
	public static void method3550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static305.aClass2_Sub49_15.aClass33_Sub9_5.method3103() != 0 && arg3 != 0 && Static110.anInt2383 < 50 && arg0 != -1) {
			Static301.aClass301Array1[Static110.anInt2383++] = new Class301((byte) 1, arg0, arg3, arg5, arg2, arg4, arg1, (Class16_Sub1) null);
		}
	}
}
