import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "Lclient!iq;")
	public static Class104 aClass104_147;

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_188 = new Class221(72, 9);

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_180 = new Class157(76, -1);

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
	public static int anInt5684 = 20;

	@OriginalMember(owner = "client!ri", name = "i", descriptor = "[I")
	private static final int[] anIntArray445 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BLclient!wn;)V")
	public static void method4799(@OriginalArg(1) Class1_Sub2_Sub3_Sub2 arg0) {
		for (@Pc(18) Class2_Sub37 local18 = (Class2_Sub37) Static120.aClass180_2.method4919(); local18 != null; local18 = (Class2_Sub37) Static120.aClass180_2.method4916()) {
			if (local18.aClass1_Sub2_Sub3_Sub2_1 == arg0) {
				if (local18.aClass2_Sub11_Sub4_3 != null) {
					Static31.aClass2_Sub11_Sub3_1.method4110(local18.aClass2_Sub11_Sub4_3);
					local18.aClass2_Sub11_Sub4_3 = null;
				}
				local18.method5723();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIB)I")
	public static int method4801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static13.anIntArray25[arg1 & 0x3] : anIntArray445[arg1 & 0x3];
	}
}
