import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!hk", name = "P", descriptor = "I")
	private static int anInt1110;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
	public static void method830() {
		@Pc(10) int local10 = Static82.anInt1972 + (Static239.aClass25_Sub1_Sub1_2.anInt1635 >> 7);
		Static10.anInt278 = 0;
		@Pc(25) int local25 = Static266.anInt5790 + (Static239.aClass25_Sub1_Sub1_2.anInt1604 >> 7);
		if (local10 >= 3053 && local10 <= 3156 && local25 >= 3056 && local25 <= 3136) {
			Static10.anInt278 = 1;
		}
		if (local10 >= 3072 && local10 <= 3118 && local25 >= 9492 && local25 <= 9535) {
			Static10.anInt278 = 1;
		}
		if (Static10.anInt278 == 1 && local10 >= 3139 && local10 <= 3199 && local25 >= 3008 && local25 <= 3062) {
			Static10.anInt278 = 0;
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IBI)Lclient!eh;")
	public static Class1_Sub2_Sub6 method831(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class1_Sub2_Sub6 local15 = (Class1_Sub2_Sub6) Static58.aClass117_5.method3438((long) arg1 << 32 | (long) arg0);
		if (local15 == null) {
			local15 = new Class1_Sub2_Sub6(arg1, arg0);
			Static58.aClass117_5.method3445(local15, local15.aLong201);
		}
		return local15;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZBI)I")
	public static int method834(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class1_Sub28 local12 = (Class1_Sub28) Static84.aClass117_6.method3438((long) arg2);
		if (local12 == null) {
			return 0;
		}
		@Pc(20) int local20 = 0;
		for (@Pc(30) int local30 = 0; local30 < local12.anIntArray500.length; local30++) {
			if (local12.anIntArray500[local30] >= 0 && local12.anIntArray500[local30] < Static78.anInt1887) {
				@Pc(57) Class138 local57 = Static238.method4099(local12.anIntArray500[local30]);
				if (local57.aClass117_17 != null) {
					@Pc(69) Class1_Sub10 local69 = (Class1_Sub10) local57.aClass117_17.method3438((long) arg0);
					if (local69 != null) {
						if (arg1) {
							local20 += local12.anIntArray499[local30] * local69.anInt1508;
						} else {
							local20 += local69.anInt1508;
						}
					}
				}
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "(B)V")
	public static void method835() {
		if (Static179.anInt4031 <= 0) {
			Static181.aClass41_3 = Static22.aClass41_1;
			Static22.aClass41_1 = null;
			Static140.method2511(40);
		} else {
			Static267.method2725();
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZLclient!im;)Lclient!ib;")
	public static Class68_Sub1 method837(@OriginalArg(1) Class1_Sub16 arg0) {
		return new Class68_Sub1(arg0.method2645(), arg0.method2645(), arg0.method2645(), arg0.method2645(), arg0.method2634(), arg0.method2655());
	}

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "(I)V")
	public static void method840() {
		Static50.aClass155_10.method4354();
	}

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "(I)V")
	public static void method843() {
		Static247.aClass155_40.method4354();
		Static92.aClass155_15.method4354();
		Static114.aClass155_21.method4354();
	}

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "(I)Lclient!fj;")
	public static Class7 method847() {
		@Pc(27) Class7 local27;
		if (Static296.aBoolean335) {
			local27 = new Class7_Sub2(Static298.anInt6232, Static158.anInt3659, Static298.anIntArray623[0], Static121.anIntArray257[0], Static166.anIntArray343[0], Static81.anIntArray204[0], Static200.aByteArrayArray83[0], Static167.anIntArray346);
		} else {
			local27 = new Class7_Sub1(Static298.anInt6232, Static158.anInt3659, Static298.anIntArray623[0], Static121.anIntArray257[0], Static166.anIntArray343[0], Static81.anIntArray204[0], Static200.aByteArrayArray83[0], Static167.anIntArray346);
		}
		Static265.method4490();
		return local27;
	}

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "(B)V")
	public static void method850() {
		if (Static87.anInt2033 < 0) {
			Static5.anInt145 = -1;
			Static87.anInt2033 = 0;
			Static206.anInt4587 = -1;
		}
		if (Static178.anInt4022 < Static87.anInt2033) {
			Static5.anInt145 = -1;
			Static87.anInt2033 = Static178.anInt4022;
			Static206.anInt4587 = -1;
		}
		if (Static88.anInt2053 < 0) {
			Static5.anInt145 = -1;
			Static206.anInt4587 = -1;
			Static88.anInt2053 = 0;
		}
		if (Static88.anInt2053 > Static173.anInt3932) {
			Static88.anInt2053 = Static173.anInt3932;
			Static5.anInt145 = -1;
			Static206.anInt4587 = -1;
		}
	}
}
