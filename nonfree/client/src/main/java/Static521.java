import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static521 {

	@OriginalMember(owner = "client!sga", name = "e", descriptor = "I")
	public static int anInt9826;

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "Lclient!fc;")
	public static final Class94 aClass94_62 = new Class94(32);

	@OriginalMember(owner = "client!sga", name = "f", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_172 = new Class73(47, -1);

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(III)Lclient!pfa;")
	public static Class258 method8021(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class258 local12 = new Class258();
		local12.anInt7874 = -1;
		local12.anInt7870 = -1;
		local12.anInt7877 = arg0 + 6;
		local12.anInt7878 = arg1 + 5 + 1;
		local12.anIntArrayArray38 = new int[local12.anInt7878][local12.anInt7877];
		local12.method6645();
		return local12;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Z)V")
	public static void method8025() {
		@Pc(5) int local5 = 0;
		if (Static87.aClass6_Sub33_6 != null) {
			local5 = Static87.aClass6_Sub33_6.aClass14_Sub16_1.method5719();
		}
		@Pc(36) int local36;
		@Pc(45) int local45;
		if (local5 == 2) {
			local36 = Static351.anInt6858 <= 800 ? Static351.anInt6858 : 800;
			Static184.anInt4050 = (Static351.anInt6858 - local36) / 2;
			local45 = Static59.anInt1894 > 600 ? 600 : Static59.anInt1894;
			Static294.anInt6026 = local36;
			Static354.anInt6878 = 0;
			Static277.anInt5899 = local45;
		} else if (local5 == 1) {
			local36 = Static351.anInt6858 > 1024 ? 1024 : Static351.anInt6858;
			Static294.anInt6026 = local36;
			local45 = Static59.anInt1894 <= 768 ? Static59.anInt1894 : 768;
			Static184.anInt4050 = (Static351.anInt6858 - local36) / 2;
			Static354.anInt6878 = 0;
			Static277.anInt5899 = local45;
		} else {
			Static294.anInt6026 = Static351.anInt6858;
			Static277.anInt5899 = Static59.anInt1894;
			Static354.anInt6878 = 0;
			Static184.anInt4050 = 0;
		}
	}
}
