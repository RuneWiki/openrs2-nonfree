import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!rq", name = "Y", descriptor = "B")
	public static byte aByte62;

	@OriginalMember(owner = "client!rq", name = "I", descriptor = "Ljava/lang/String;")
	public static String aString348 = null;

	@OriginalMember(owner = "client!rq", name = "h", descriptor = "(I)V")
	public static void method4665() {
		while (true) {
			if (Static200.aClass7_Sub3_Sub2_3.method2801(Static54.anInt1421) >= 11) {
				@Pc(14) int local14 = Static200.aClass7_Sub3_Sub2_3.method2806(11);
				if (local14 != 2047) {
					@Pc(21) boolean local21 = false;
					if (Static157.aClass22_Sub2_Sub1_Sub1Array1[local14] == null) {
						Static157.aClass22_Sub2_Sub1_Sub1Array1[local14] = new Class22_Sub2_Sub1_Sub1();
						Static157.aClass22_Sub2_Sub1_Sub1Array1[local14].anInt5115 = local14;
						local21 = true;
						if (Static74.aClass7_Sub3Array1[local14] != null) {
							Static157.aClass22_Sub2_Sub1_Sub1Array1[local14].method817(Static74.aClass7_Sub3Array1[local14]);
						}
					}
					Static314.anIntArray758[Static223.anInt4466++] = local14;
					@Pc(62) Class22_Sub2_Sub1_Sub1 local62 = Static157.aClass22_Sub2_Sub1_Sub1Array1[local14];
					local62.anInt5096 = Static212.anInt4234;
					@Pc(72) int local72 = Static122.anIntArray368[Static200.aClass7_Sub3_Sub2_3.method2806(3)];
					@Pc(77) int local77 = Static200.aClass7_Sub3_Sub2_3.method2806(5);
					if (local77 > 15) {
						local77 -= 32;
					}
					@Pc(90) int local90 = Static200.aClass7_Sub3_Sub2_3.method2806(5);
					if (local90 > 15) {
						local90 -= 32;
					}
					@Pc(101) int local101 = Static200.aClass7_Sub3_Sub2_3.method2806(1);
					if (local101 == 1) {
						Static71.anIntArray241[Static85.anInt2209++] = local14;
					}
					@Pc(119) int local119 = Static200.aClass7_Sub3_Sub2_3.method2806(1);
					if (local21) {
						local62.method4411(local72);
					}
					local62.method822(local90 + Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray665[0], local119 == 1, Static168.anInt3508, Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray666[0] + local77);
					continue;
				}
			}
			Static200.aClass7_Sub3_Sub2_3.method2805();
			return;
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lclient!pe;IILclient!fi;I)V")
	public static void method4666(@OriginalArg(0) Class89 arg0, @OriginalArg(3) Class74 arg1) {
		Static10.aClass74_2.method1803();
		if (Static134.aBoolean225) {
			return;
		}
		for (@Pc(21) Class7_Sub37 local21 = (Class7_Sub37) arg1.method1793(); local21 != null; local21 = (Class7_Sub37) arg1.method1798()) {
			@Pc(27) Class155 local27 = Static84.method1785(local21.anInt5839);
			if (Static34.method722(local27)) {
				@Pc(39) boolean local39 = Static36.method826(local21, local27, arg0);
				if (local39) {
					Static210.method3748(local27, local21, arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method4668(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < local6; local15++) {
			local13 = arg0.charAt(local15) + (local13 << 5) - local13;
		}
		return local13;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lclient!rk;Lclient!rk;I)V")
	public static void method4669(@OriginalArg(0) Class180 arg0, @OriginalArg(1) Class180 arg1) {
		Static177.aClass180_47 = arg0;
		Static162.aClass180_27 = arg1;
	}
}
