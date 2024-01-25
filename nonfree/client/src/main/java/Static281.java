import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "Lclient!c;")
	public static Class32 aClass32_4;

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_62 = new Class12(107, -2);

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!jk;I)V")
	public static void method2014(@OriginalArg(0) Class124 arg0) {
		if (arg0.anInt3417 == 5 && arg0.anInt3405 != -1) {
			Static445.method5842(arg0, Static185.aClass34_7);
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)Z")
	public static boolean method2016(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static10.method142(arg0, arg1) || Static384.method5033(arg0, arg1);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IJ)V")
	public static void method2017(@OriginalArg(1) long arg0) {
		if (Static359.aClass169ArrayArrayArray5 != null) {
			if (Static333.anInt5693 == 1 || Static333.anInt5693 == 5) {
				Static340.method4541(arg0);
			} else if (Static333.anInt5693 == 4) {
				Static97.method1510(arg0);
			}
		}
		Static222.method3246((long) Static236.anInt4213, Static185.aClass34_7);
		if (Static207.anInt6026 != -1) {
			Static150.method5309(Static207.anInt6026);
		}
		for (@Pc(42) int local42 = 0; local42 < Static250.anInt4507; local42++) {
			if (Static369.aBooleanArray23[local42]) {
				Static408.aBooleanArray25[local42] = true;
			}
			Static10.aBooleanArray1[local42] = Static369.aBooleanArray23[local42];
			Static369.aBooleanArray23[local42] = false;
		}
		Static453.anInt7489 = Static236.anInt4213;
		if (Static185.aClass34_7.method5772()) {
			Static332.aBoolean646 = true;
		}
		if (Static207.anInt6026 != -1) {
			Static250.anInt4507 = 0;
			Static385.method5054();
		}
		Static185.aClass34_7.va();
		Static336.method4511(Static185.aClass34_7);
		@Pc(92) int local92 = Static116.method1852();
		if (local92 == -1) {
			local92 = Static33.anInt530;
		}
		if (local92 == -1) {
			local92 = Static54.anInt973;
		}
		Static46.method622(local92);
		Static190.method2739(Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5514, Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5518, Static341.anInt5831, Static447.aClass25_Sub5_Sub1_Sub2_4.aByte94);
		Static341.anInt5831 = 0;
	}
}
