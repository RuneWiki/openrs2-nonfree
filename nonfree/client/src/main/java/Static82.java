import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!dt", name = "H", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_58 = new Class67(35, -2);

	@OriginalMember(owner = "client!dt", name = "J", descriptor = "Lclient!nh;")
	public static final Class170 aClass170_1 = new Class170("WTI", 5);

	@OriginalMember(owner = "client!dt", name = "M", descriptor = "Lclient!bh;")
	public static Class28 aClass28_1 = new Class28(8);

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(BLjava/awt/Component;)Lclient!df;")
	public static Class53 method1003(@OriginalArg(1) Component arg0) {
		return new Class53_Sub1(arg0);
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(Z)I")
	public static int method1006() {
		if (Static364.aClass107_13 == null) {
			if (!Static170.aBoolean282 && Static76.anInt1078 > 0) {
				if (Static53.aBoolean106 && Static269.aClass53_1.method3910(81) && Static76.anInt1078 > 2) {
					return ((Class1_Sub10) Static57.aClass14_3.aClass1_5.aClass1_268.aClass1_268).anInt1055;
				}
				return ((Class1_Sub10) Static57.aClass14_3.aClass1_5.aClass1_268).anInt1055;
			}
			@Pc(20) int local20 = Static181.aClass224_1.method5613();
			@Pc(24) int local24 = Static181.aClass224_1.method5615();
			@Pc(26) int local26 = Static64.anInt995;
			@Pc(28) int local28 = Static25.anInt358;
			@Pc(30) int local30 = Static273.anInt4719;
			if (local20 > local26 && local30 + local26 > local20) {
				@Pc(48) int local48 = -1;
				@Pc(67) int local67;
				for (@Pc(50) int local50 = 0; local50 < Static76.anInt1078; local50++) {
					if (Static51.aBoolean102) {
						local67 = local28 + (-local50 + Static76.anInt1078 + -1) * 16 + 33;
						if (local67 - 13 < local24 && local24 <= local67 + 3) {
							local48 = local50;
						}
					} else {
						local67 = local28 + (Static76.anInt1078 - local50 - 1) * 16 + 31;
						if (local67 - 13 < local24 && local24 <= local67 + 3) {
							local48 = local50;
						}
					}
				}
				if (local48 != -1) {
					local67 = 0;
					@Pc(137) Class228 local137 = new Class228(Static57.aClass14_3);
					for (@Pc(142) Class1_Sub10 local142 = (Class1_Sub10) local137.method4804(); local142 != null; local142 = (Class1_Sub10) local137.method4808()) {
						if (local67++ == local48) {
							return local142.anInt1055;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(II)V")
	public static void method1007(@OriginalArg(0) int arg0) {
		Static47.anInt678 = 3;
		Static80.anInt1104 = 100;
		Static32.anInt496 = -1;
		Static232.anInt4196 = arg0;
	}

	@OriginalMember(owner = "client!dt", name = "h", descriptor = "(I)V")
	public static void method1008() {
		Static426.aClass1_Sub19_Sub2_2.anInt3698 = 0;
		Static270.aClass67_88 = null;
		Static417.anInt6744 = 0;
		Static425.aClass67_257 = null;
		Static12.aClass67_8 = null;
		Static153.aClass67_98 = null;
		Static413.aClass1_Sub19_Sub2_1.anInt3698 = 0;
		Static379.anInt119 = 0;
		Static175.anInt3046 = 0;
		Static141.method4893();
		Static217.method989();
		for (@Pc(33) int local33 = 0; local33 < 2048; local33++) {
			Static399.aClass11_Sub1_Sub3_Sub2Array1[local33] = null;
		}
		Static94.aClass11_Sub1_Sub3_Sub2_1 = null;
		for (@Pc(47) int local47 = 0; local47 < Static406.anInt6516; local47++) {
			@Pc(54) Class11_Sub1_Sub3_Sub1 local54 = Static47.aClass1_Sub44Array1[local47].aClass11_Sub1_Sub3_Sub1_2;
			if (local54 != null) {
				local54.anInt3318 = -1;
			}
		}
		Static78.method3887();
		Static139.anInt2147 = 1;
		Static154.method1923(9);
		for (@Pc(76) int local76 = 0; local76 < 100; local76++) {
			Static179.aBooleanArray69[local76] = true;
		}
		Static132.method5176();
		Static116.aLong97 = 0L;
		Static374.aClass1_Sub17_5 = null;
	}
}
