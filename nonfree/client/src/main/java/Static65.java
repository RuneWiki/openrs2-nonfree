import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_54 = new Class123(111, -2);

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "Lclient!ws;")
	public static final Class364 aClass364_6 = new Class364(4, 8);

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray8 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
	public static int anInt1813 = 0;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)Z")
	public static boolean method1622(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "([[BBLclient!rfa;)V")
	public static void method1623(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class268_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg0.length;
		@Pc(36) int local36;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(23) byte[] local23 = arg0[local17];
			if (local23 != null) {
				@Pc(30) Class3_Sub26 local30 = new Class3_Sub26(local23);
				local36 = Static178.anIntArray159[local17] >> 8;
				@Pc(42) int local42 = Static178.anIntArray159[local17] & 0xFF;
				@Pc(49) int local49 = local36 * 64 - Static321.anInt5874;
				@Pc(55) int local55 = local42 * 64 - Static137.anInt3293;
				Static245.method3870();
				arg1.method6296(Static187.aClass220Array1, local55, Static137.anInt3293, local30, Static321.anInt5874, local49);
				arg1.method6304(local30, local49, Static319.aClass31_11, local12, local55);
				if (!arg1.aBoolean552 && local36 == Static347.anInt6235 / 8 && local42 == Static100.anInt9658 / 8 && local12[0] != -1) {
					Static177.aClass256_1 = Static345.aClass103_1.method2773(local12[2], local12[3], Static240.aClass13_1, local12[0], local12[1]);
					Static111.anInt2678 = local12[4];
				}
			}
		}
		for (@Pc(130) int local130 = 0; local130 < local15; local130++) {
			@Pc(143) int local143 = (Static178.anIntArray159[local130] >> 8) * 64 - Static321.anInt5874;
			local36 = (Static178.anIntArray159[local130] & 0xFF) * 64 - Static137.anInt3293;
			@Pc(158) byte[] local158 = arg0[local130];
			if (local158 == null && Static100.anInt9658 < 800) {
				Static245.method3870();
				arg1.method6289(local36, local143);
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(II)Lclient!od;")
	public static Class25_Sub10 method1625(@OriginalArg(0) int arg0) {
		@Pc(11) Class269[] local11 = Class200.aClass269Array1;
		synchronized (Class200.aClass269Array1) {
			@Pc(34) Class25_Sub10 local34;
			if (arg0 >= Class200.aClass269Array1.length || Class200.aClass269Array1[arg0].method5971()) {
				local34 = new Class25_Sub10();
				local34.aClass25_Sub1Array1 = new Class25_Sub1[arg0];
				for (@Pc(56) int local56 = 0; local56 < arg0; local56++) {
					local34.aClass25_Sub1Array1[local56] = new Class25_Sub1();
				}
			} else {
				local34 = (Class25_Sub10) Class200.aClass269Array1[arg0].method5972();
				local34.method6959();
				@Pc(41) int local41 = Static73.anIntArray439[arg0]--;
			}
			return local34;
		}
	}
}
