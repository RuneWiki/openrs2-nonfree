import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
	public static int anInt1841;

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "Lclient!r;")
	public static Class197 aClass197_20;

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "Lclient!r;")
	public static Class197 aClass197_21;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZLclient!nk;B)V", line = 32)
	public static void method1913(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class161 arg1) {
		@Pc(12) int local12 = arg1.anInt4274 == 0 ? arg1.anInt4242 : arg1.anInt4274;
		@Pc(24) int local24 = arg1.anInt4260 == 0 ? arg1.anInt4255 : arg1.anInt4260;
		Static339.method6106(arg0, local24, arg1.anInt4310, Static25.aClass161ArrayArray1[arg1.anInt4310 >> 16], local12);
		if (arg1.aClass161Array2 != null) {
			Static339.method6106(arg0, local24, arg1.anInt4310, arg1.aClass161Array2, local12);
		}
		@Pc(57) Class2_Sub7 local57 = (Class2_Sub7) Class2_Sub3_Sub34.aClass4_130.method90((long) arg1.anInt4310);
		if (local57 != null) {
			Static121.method2437(local24, local57.anInt1368, arg0, local12);
		}
	}
}
