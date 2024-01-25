import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!hg", name = "K", descriptor = "Lclient!ps;")
	public static Class262 aClass262_4;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZILjava/lang/Object;)[B")
	public static byte[] method3393(@OriginalArg(0) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg1;
			return arg0 ? Static91.method1977(local18) : local18;
		} else if (arg1 instanceof Class28) {
			@Pc(32) Class28 local32 = (Class28) arg1;
			return local32.method2607();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILclient!cw;)V")
	public static void method3398(@OriginalArg(1) Class3_Sub10 arg0) {
		Static566.aClass244_69.method5570(arg0);
		arg0.anInt2129 = arg0.aClass3_Sub26_Sub1_1.anInt8703;
		arg0.aClass3_Sub26_Sub1_1.anInt8703 = 0;
		Static303.anInt5651 += arg0.anInt2129;
	}
}
