import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!al", name = "c", descriptor = "[I")
	public static int[] anIntArray111;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "I")
	public static int anInt630 = 0;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(B)J")
	public static synchronized long method647() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (Static283.aLong157 > local5) {
			Static323.aLong180 += Static283.aLong157 - local5;
		}
		Static283.aLong157 = local5;
		return local5 + Static323.aLong180;
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(I)V")
	public static void method649() {
		Static317.aClient1.method1275();
		Static515.aClass3_Sub27_Sub1_2.anInt9191 = 0;
		Static270.anInt5584 = 0;
		Static473.aClass133_147 = null;
		Static335.anInt3040 = 0;
		Static358.aClass133_117 = null;
		Static90.aClass3_Sub27_Sub1_1.anInt9191 = 0;
		Static159.aClass133_67 = null;
		Static109.method2115();
		Static468.aClass47Array1 = null;
		Static210.anInt4631 = 0;
		Static178.anInt4133 = 0;
		Static98.aString22 = null;
		Static476.anInt7744 = 0;
	}
}
