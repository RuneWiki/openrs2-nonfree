import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!ls", name = "q", descriptor = "I")
	public static int anInt9558;

	@OriginalMember(owner = "client!ls", name = "H", descriptor = "[Lclient!iw;")
	public static Class153[] aClass153Array3;

	@OriginalMember(owner = "client!ls", name = "s", descriptor = "Lclient!nc;")
	public static final Class208 aClass208_15 = new Class208();

	@OriginalMember(owner = "client!ls", name = "A", descriptor = "[Lclient!sl;")
	public static final Class295[] aClass295Array3 = new Class295[4];

	@OriginalMember(owner = "client!ls", name = "D", descriptor = "Z")
	public static boolean aBoolean667 = false;

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "([JI[Ljava/lang/Object;)V")
	public static void method7808(@OriginalArg(0) long[] arg0, @OriginalArg(2) Object[] arg1) {
		Static315.method4902(arg0, arg0.length - 1, 0, arg1);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Ljava/awt/Canvas;Z)Lclient!hb;")
	public static Class6_Sub16 method7809(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(11) Class local11 = Class.forName("Class6_Sub16_Sub1");
			@Pc(15) Class6_Sub16 local15 = (Class6_Sub16) local11.getDeclaredConstructor().newInstance();
			local15.method5956(arg0);
			return local15;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class6_Sub16_Sub2 local26 = new Class6_Sub16_Sub2();
			local26.method5956(arg0);
			return local26;
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(BJ)V")
	public static void method7812(@OriginalArg(1) long arg0) {
		if (Static208.aClass9ArrayArrayArray3 != null) {
			if (Static354.anInt6233 == 1 || Static354.anInt6233 == 5) {
				Static466.method6530(arg0);
			} else if (Static354.anInt6233 == 4) {
				Static41.method574(arg0);
			}
		}
		Static13.method200(Static176.aClass121_5, (long) Static358.anInt6263);
		if (Static487.anInt8139 != -1) {
			Static344.method5182(Static487.anInt8139);
		}
		for (@Pc(39) int local39 = 0; local39 < Static73.anInt1201; local39++) {
			if (Static258.aBooleanArray27[local39]) {
				Static44.aBooleanArray5[local39] = true;
			}
			Static40.aBooleanArray4[local39] = Static258.aBooleanArray27[local39];
			Static258.aBooleanArray27[local39] = false;
		}
		Static557.anInt9311 = Static358.anInt6263;
		if (Static176.aClass121_5.method7142()) {
			Static364.aBoolean436 = true;
		}
		if (Static487.anInt8139 != -1) {
			Static73.anInt1201 = 0;
			Static89.method1430();
		}
		Static176.aClass121_5.F();
		Static457.method3508(Static176.aClass121_5);
		@Pc(89) int local89 = Static322.method4985();
		if (local89 == -1) {
			local89 = Static278.anInt6564;
		}
		if (local89 == -1) {
			local89 = Static48.anInt822;
		}
		Static41.method572(local89);
		Static186.method2765(Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9222, Static267.anInt4424, Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9218, Static426.aClass29_Sub2_Sub1_Sub2_2.aByte103);
		Static267.anInt4424 = 0;
	}
}
