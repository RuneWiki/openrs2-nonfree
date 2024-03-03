import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!nb", name = "C", descriptor = "Lclient!nk;")
	public static Class161 aClass161_11;

	@OriginalMember(owner = "client!nb", name = "E", descriptor = "Lclient!fi;")
	public static Class2_Sub12_Sub2 aClass2_Sub12_Sub2_2;

	@OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
	public static int anInt4031;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V", line = 354)
	public static void method3990() {
		for (@Pc(6) Class2_Sub5 local6 = (Class2_Sub5) Class92.aClass135_19.method3552(); local6 != null; local6 = (Class2_Sub5) Class92.aClass135_19.method3553()) {
			if (Static281.method5214(local6.anInt1004)) {
				Static365.method6455(local6);
			}
		}
		if (Class2_Sub3_Sub24.anInt4949 == 1) {
			Class243.aBoolean477 = false;
			Static344.method6222(Static100.anInt2217, Static282.anInt5731, Static327.anInt6507, Static338.anInt6788);
			return;
		}
		Static344.method6222(Static100.anInt2217, Static282.anInt5731, Static327.anInt6507, Static338.anInt6788);
		@Pc(51) int local51 = Static106.aClass239_2.method6127(Class124.aClass79_74.method2269(Class197.anInt5569));
		for (@Pc(56) Class2_Sub5 local56 = (Class2_Sub5) Class92.aClass135_19.method3552(); local56 != null; local56 = (Class2_Sub5) Class92.aClass135_19.method3553()) {
			@Pc(62) int local62 = Static203.method1096(local56);
			if (local62 > local51) {
				local51 = local62;
			}
		}
		Static100.anInt2217 = local51 + 8;
		Static327.anInt6507 = Class2_Sub3_Sub24.anInt4949 * 16 + (Class179.aBoolean371 ? 26 : 22);
	}
}
