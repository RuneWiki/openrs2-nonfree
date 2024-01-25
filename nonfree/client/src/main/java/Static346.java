import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
	public static int anInt6729;

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "F")
	public static float aFloat155;

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_91 = new Class200(58, -2);

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_92 = new Class200(70, 4);

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray4 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
	public static void method5781() {
		Static76.aClass279Array1 = null;
		if (Static219.aBoolean285 && Static634.method8682() != 1) {
			Static595.method8718(0, 0, Static485.anInt8420 == 3 || Static485.anInt8420 == 7, Static604.method8438(), Static317.method5195());
		}
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		if (Static219.aBoolean285) {
			local30 = Static30.method1089();
			local32 = Static166.method2921();
		}
		Static32.method6779(-1, local32, local30, local32, Static330.anInt6165 + local32, local30 + Static109.anInt2357, Static307.anInt5465, local30);
		if (Static76.aClass279Array1 != null) {
			Static192.method3264(Static146.anInt2907, local30, local32, true, Static76.aClass279Array1, local32 + Static330.anInt6165, Static109.anInt2357 + local30, Static191.anInt3612, Static220.aClass279_6.anInt8215, -1412584499);
			Static76.aClass279Array1 = null;
		}
	}
}
