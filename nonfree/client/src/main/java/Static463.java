import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static463 {

	@OriginalMember(owner = "client!tc", name = "q", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_123 = new Class252(76, 4);

	@OriginalMember(owner = "client!tc", name = "w", descriptor = "I")
	public static int anInt7994 = 0;

	@OriginalMember(owner = "client!tc", name = "B", descriptor = "[Lclient!vaa;")
	public static final Interface18[] anInterface18Array2 = new Interface18[128];

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZII)V")
	public static void method7054(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub2_Sub16 local12 = Static422.method6588(15, 0);
		local12.method6693();
		local12.anInt7487 = arg0;
		local12.anInt7482 = arg1;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!dda;I)V")
	public static void method7056(@OriginalArg(0) Class46_Sub2 arg0) {
		arg0.aClass20_Sub1_Sub1_1 = null;
		if (Static231.anInt4488 < 20) {
			Static437.aClass184_24.method5142(arg0);
			Static231.anInt4488++;
		}
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(III)Z")
	public static boolean method7059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static135.method8180(arg0, arg1) | (arg0 & 0x70000) != 0 || Static319.method5470(arg0, arg1);
	}
}
