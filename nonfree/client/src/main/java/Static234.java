import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!lo", name = "g", descriptor = "Lclient!vh;")
	public static Class250 aClass250_52;

	@OriginalMember(owner = "client!lo", name = "j", descriptor = "Lclient!hn;")
	public static Class107 aClass107_3;

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_112 = new Class131(60, 2);

	@OriginalMember(owner = "client!lo", name = "k", descriptor = "Lclient!sl;")
	public static final Class216 aClass216_1 = new Class216();

	@OriginalMember(owner = "client!lo", name = "m", descriptor = "Lclient!of;")
	public static final Class176 aClass176_7 = new Class176("LIVE", 0);

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)V")
	public static void method3458(@OriginalArg(1) int arg0) {
		if (!Static389.aClass128_Sub1_1.aBoolean234) {
			arg0 = -1;
		}
		if (Static427.anInt7384 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(25) Class43 local25 = Static199.aClass106_2.method2348(arg0);
			@Pc(29) Class159 local29 = local25.method1074();
			if (local29 == null) {
				arg0 = -1;
			} else {
				Static119.aClass138_7.method3196(Static299.aCanvas5, new Point(local25.anInt1265, local25.anInt1268), local29.method3743(), local29.method3752(), local29.method3751());
				Static427.anInt7384 = arg0;
			}
		}
		if (arg0 == -1 && Static427.anInt7384 != -1) {
			Static119.aClass138_7.method3196(Static299.aCanvas5, new Point(), -1, null, -1);
			Static427.anInt7384 = -1;
		}
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)V")
	public static void method3459() {
		if (Static372.aClass161_6 != null) {
			Static372.aClass161_6.method3764();
			Static372.aClass161_6 = null;
		}
		Static95.method1501();
		Static288.method4075();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static170.aClass112Array1[local17].method2686();
		}
		Static157.method2372(false);
		System.gc();
		Static451.method6036();
		Static94.aBoolean98 = false;
		Static369.anInt6297 = -1;
		Static330.method4637(true);
		Static134.anInt5502 = 0;
		Static138.anInt2346 = 0;
		Static437.anInt7555 = 0;
		Static12.anInt325 = 0;
		Static13.anInt330 = 0;
		for (@Pc(56) int local56 = 0; local56 < Static444.aClass3Array1.length; local56++) {
			Static444.aClass3Array1[local56] = null;
		}
		Static135.method1928();
		for (@Pc(76) int local76 = 0; local76 < 2048; local76++) {
			Static311.aClass26_Sub2_Sub2_Sub1Array1[local76] = null;
		}
		Static288.anInt5039 = 0;
		for (@Pc(92) int local92 = 0; local92 < 32768; local92++) {
			Static410.aClass26_Sub2_Sub2_Sub2Array1[local92] = null;
		}
		Static184.aClass27_23.method566();
		Static242.method3588();
		Static303.anInt5383 = 0;
		Static51.aClass79_1.method1579();
		Static92.method1482();
		Static214.method3258();
		Static107.method1651(true);
		try {
			Static456.method694(Static119.aClass138_7.anApplet1, "loggedout");
		} catch (@Pc(127) Throwable local127) {
		}
		Static175.aClass1_Sub25_2 = null;
		Static228.aLong129 = 0L;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)V")
	public static void method3460() {
		for (@Pc(6) Class1_Sub29 local6 = (Class1_Sub29) Static205.aClass266_32.method6000(); local6 != null; local6 = (Class1_Sub29) Static205.aClass266_32.method5994()) {
			if (local6.aBoolean300) {
				local6.method3604();
			}
		}
		for (@Pc(30) Class1_Sub29 local30 = (Class1_Sub29) Static14.aClass266_3.method6000(); local30 != null; local30 = (Class1_Sub29) Static14.aClass266_3.method5994()) {
			if (local30.aBoolean300) {
				local30.method3604();
			}
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIII)I")
	public static int method3461(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg0) {
			return arg0;
		}
		@Pc(12) int local12 = 128 - arg1;
		@Pc(26) int local26 = arg1 * (arg2 & 0x7F) + local12 * (arg0 & 0x7F) >> 7;
		@Pc(40) int local40 = (arg2 & 0x380) * arg1 + (arg0 & 0x380) * local12 >> 7;
		@Pc(54) int local54 = arg1 * (arg2 & 0xFC00) + (arg0 & 0xFC00) * local12 >> 7;
		return local26 & 0x7F | local40 & 0x380 | local54 & 0xFC00;
	}
}
