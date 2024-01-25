import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!lq", name = "O", descriptor = "Lclient!rg;")
	public static Class310 aClass310_73;

	@OriginalMember(owner = "client!lq", name = "I", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_171 = new Class160(70, 3);

	@OriginalMember(owner = "client!lq", name = "K", descriptor = "I")
	public static volatile int anInt6145 = -1;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "([BB)[B")
	public static byte[] method5440(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static691.method82(arg0, 0, local9, 0, local6);
		return local9;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIII)V")
	public static void method5441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = Static181.aClass14_Sub26_9.aClass43_Sub11_1.method3829() * arg2 >> 8;
		if (arg0 == -1 && !Static460.aBoolean599) {
			Static377.method5814();
		} else if (arg0 != -1 && (arg0 != Static184.anInt7567 || !Static104.method1717()) && local12 != 0 && !Static460.aBoolean599) {
			Static612.method8638(Static341.aClass310_67, local12, arg0, arg1);
			Static285.method4779();
		}
		if (Static184.anInt7567 != arg0) {
			Static157.aClass14_Sub1_Sub3_1 = null;
		}
		Static184.anInt7567 = arg0;
	}
}
