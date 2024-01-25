import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "Lclient!jk;")
	public static Class106 aClass106_8;

	@OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
	public static int anInt6183;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "Z")
	public static boolean aBoolean600 = false;

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "Lclient!hq;")
	public static final Class87 aClass87_57 = new Class87(64);

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
	public static int anInt6180 = 0;

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
	public static int anInt6182 = 0;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
	public static void method5247() {
		@Pc(1) Class87 local1 = Static108.aClass87_21;
		synchronized (Static108.aClass87_21) {
			Static108.aClass87_21.method2485();
		}
		local1 = Static314.aClass87_55;
		synchronized (Static314.aClass87_55) {
			Static314.aClass87_55.method2485();
		}
		@Pc(33) Class18 local33 = Static357.aClass18_3;
		synchronized (Static357.aClass18_3) {
			Static357.aClass18_3.method568();
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!be;B)I")
	public static int method5249(@OriginalArg(0) Class17_Sub1_Sub1_Sub1 arg0) {
		@Pc(8) int local8 = arg0.anInt822;
		@Pc(12) Class123 local12 = arg0.method4319();
		if (arg0.aBoolean471) {
			local8 = arg0.anInt809;
		} else if (arg0.anInt4824 == local12.anInt3700 || arg0.anInt4824 == local12.anInt3686 || arg0.anInt4824 == local12.anInt3683 || local12.anInt3698 == arg0.anInt4824) {
			local8 = arg0.anInt826;
		} else if (local12.anInt3693 == arg0.anInt4824 || local12.anInt3672 == arg0.anInt4824 || arg0.anInt4824 == local12.anInt3667 || arg0.anInt4824 == local12.anInt3685) {
			local8 = arg0.anInt824;
		}
		return local8;
	}
}
