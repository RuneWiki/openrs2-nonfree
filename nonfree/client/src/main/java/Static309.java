import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!lt", name = "r", descriptor = "Lclient!bfa;")
	public static Class1_Sub7_Sub1 aClass1_Sub7_Sub1_2;

	@OriginalMember(owner = "client!lt", name = "m", descriptor = "Z")
	public static boolean aBoolean425 = true;

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(I)V")
	public static void method4298() {
		@Pc(5) int local5 = 0;
		if (Static348.aClass1_Sub30_Sub1_1 != null) {
			local5 = Static348.aClass1_Sub30_Sub1_1.method3919(Static113.anInt2222);
		}
		@Pc(38) int local38;
		@Pc(47) int local47;
		if (local5 == 2) {
			local38 = Static493.anInt8493 > 800 ? 800 : Static493.anInt8493;
			Static281.anInt4923 = (Static493.anInt8493 - local38) / 2;
			local47 = Static38.anInt603 <= 600 ? Static38.anInt603 : 600;
			Static130.anInt2566 = local38;
			Static499.anInt4149 = local47;
			Static272.anInt4785 = 0;
		} else if (local5 == 1) {
			local38 = Static493.anInt8493 > 1024 ? 1024 : Static493.anInt8493;
			local47 = Static38.anInt603 > 768 ? 768 : Static38.anInt603;
			Static130.anInt2566 = local38;
			Static281.anInt4923 = (Static493.anInt8493 - local38) / 2;
			Static272.anInt4785 = 0;
			Static499.anInt4149 = local47;
		} else {
			Static130.anInt2566 = Static493.anInt8493;
			Static272.anInt4785 = 0;
			Static281.anInt4923 = 0;
			Static499.anInt4149 = Static38.anInt603;
		}
	}
}
