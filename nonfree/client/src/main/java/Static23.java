import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "Lclient!ue;")
	public static Class1_Sub2_Sub2_Sub4 aClass1_Sub2_Sub2_Sub4_3;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "Z")
	public static boolean aBoolean21 = false;

	@OriginalMember(owner = "client!dd", name = "m", descriptor = "Lclient!fc;")
	private static Class25 aClass25_285 = Static78.method1313("Drop");

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "Lclient!fc;")
	public static Class25 aClass25_284 = aClass25_285;

	@OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
	public static int anInt673 = 0;

	@OriginalMember(owner = "client!dd", name = "l", descriptor = "J")
	public static volatile long aLong50 = 0L;

	@OriginalMember(owner = "client!dd", name = "o", descriptor = "Lclient!fc;")
	public static Class25 aClass25_286 = Static78.method1313("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
	public static int anInt675 = 0;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZIIILclient!ef;)V")
	public static void method553(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1_Sub2_Sub6 arg4) {
		@Pc(3) Class1_Sub4 local3 = new Class1_Sub4();
		local3.anInt595 = arg4.anInt859;
		local3.anInt591 = arg4.anInt863;
		@Pc(14) int local14 = arg4.anInt845;
		local3.anInt599 = arg3 * 128;
		local3.anInt589 = arg2 * 128;
		local3.anInt587 = arg4.anInt844 * 128;
		local3.anInt598 = arg0;
		@Pc(36) int local36 = arg4.anInt857;
		local3.anInt593 = arg4.anInt867;
		local3.anIntArray137 = arg4.anIntArray168;
		if (arg1 == 1 || arg1 == 3) {
			local36 = arg4.anInt845;
			local14 = arg4.anInt857;
		}
		local3.anInt594 = (arg2 + local36) * 128;
		local3.anInt602 = (arg3 + local14) * 128;
		if (arg4.anIntArray171 != null) {
			local3.aClass1_Sub2_Sub6_1 = arg4;
			local3.method489();
		}
		Static71.aClass2_8.method33(local3);
		if (local3.anIntArray137 != null) {
			local3.anInt588 = local3.anInt595 + (int) ((double) (local3.anInt593 - local3.anInt595) * Math.random());
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
	public static void method555() {
		while (true) {
			if (Static35.aClass1_Sub5_Sub1_1.method687(Static110.anInt2558) >= 27) {
				@Pc(14) int local14 = Static35.aClass1_Sub5_Sub1_1.method691(15);
				if (local14 != 32767) {
					@Pc(19) boolean local19 = false;
					if (Static103.aClass1_Sub2_Sub3_Sub4_Sub1Array32[local14] == null) {
						local19 = true;
						Static103.aClass1_Sub2_Sub3_Sub4_Sub1Array32[local14] = new Class1_Sub2_Sub3_Sub4_Sub1();
					}
					@Pc(35) Class1_Sub2_Sub3_Sub4_Sub1 local35 = Static103.aClass1_Sub2_Sub3_Sub4_Sub1Array32[local14];
					Static106.anIntArray423[Static13.anInt383++] = local14;
					local35.anInt2794 = Static60.anInt1366;
					@Pc(53) int local53 = Static5.anIntArray25[Static35.aClass1_Sub5_Sub1_1.method691(3)];
					if (local19) {
						local35.anInt2819 = local53;
					}
					@Pc(63) int local63 = Static35.aClass1_Sub5_Sub1_1.method691(1);
					@Pc(68) int local68 = Static35.aClass1_Sub5_Sub1_1.method691(5);
					local35.aClass1_Sub2_Sub13_1 = Static129.method2045(Static35.aClass1_Sub5_Sub1_1.method691(13));
					if (local68 > 15) {
						local68 -= 32;
					}
					@Pc(85) int local85 = Static35.aClass1_Sub5_Sub1_1.method691(5);
					@Pc(90) int local90 = Static35.aClass1_Sub5_Sub1_1.method691(1);
					if (local85 > 15) {
						local85 -= 32;
					}
					if (local90 == 1) {
						Static85.anIntArray336[Static59.anInt1356++] = local14;
					}
					local35.anInt2785 = local35.aClass1_Sub2_Sub13_1.anInt1853;
					local35.anInt2834 = local35.aClass1_Sub2_Sub13_1.anInt1863;
					local35.anInt2825 = local35.aClass1_Sub2_Sub13_1.anInt1847;
					local35.anInt2815 = local35.aClass1_Sub2_Sub13_1.anInt1849;
					local35.anInt2833 = local35.aClass1_Sub2_Sub13_1.anInt1868;
					local35.anInt2835 = local35.aClass1_Sub2_Sub13_1.anInt1840;
					local35.anInt2799 = local35.aClass1_Sub2_Sub13_1.anInt1860;
					if (local35.anInt2815 == 0) {
						local35.anInt2819 = 0;
					}
					local35.anInt2817 = local35.aClass1_Sub2_Sub13_1.anInt1842;
					local35.anInt2788 = local35.aClass1_Sub2_Sub13_1.anInt1865;
					local35.method1973(local85 + Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray484[0], local63 == 1, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray485[0] + local68);
					continue;
				}
			}
			Static35.aClass1_Sub5_Sub1_1.method690();
			return;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
	public static void method556() {
		@Pc(10) int local10 = Static35.aClass1_Sub5_Sub1_1.method691(8);
		if (Static96.anInt2797 > local10) {
			for (@Pc(15) int local15 = local10; local15 < Static96.anInt2797; local15++) {
				Static28.anIntArray151[Static25.anInt719++] = Static28.anIntArray150[local15];
			}
		}
		if (Static96.anInt2797 < local10) {
			throw new RuntimeException("gppov1");
		}
		Static96.anInt2797 = 0;
		for (@Pc(51) int local51 = 0; local51 < local10; local51++) {
			@Pc(57) int local57 = Static28.anIntArray150[local51];
			@Pc(61) Class1_Sub2_Sub3_Sub4_Sub2 local61 = Static88.aClass1_Sub2_Sub3_Sub4_Sub2Array1[local57];
			@Pc(66) int local66 = Static35.aClass1_Sub5_Sub1_1.method691(1);
			if (local66 == 0) {
				Static28.anIntArray150[Static96.anInt2797++] = local57;
				local61.anInt2794 = Static60.anInt1366;
			} else {
				@Pc(89) int local89 = Static35.aClass1_Sub5_Sub1_1.method691(2);
				if (local89 == 0) {
					Static28.anIntArray150[Static96.anInt2797++] = local57;
					local61.anInt2794 = Static60.anInt1366;
					Static85.anIntArray336[Static59.anInt1356++] = local57;
				} else {
					@Pc(136) int local136;
					@Pc(146) int local146;
					if (local89 == 1) {
						Static28.anIntArray150[Static96.anInt2797++] = local57;
						local61.anInt2794 = Static60.anInt1366;
						local136 = Static35.aClass1_Sub5_Sub1_1.method691(3);
						local61.method1971(false, local136);
						local146 = Static35.aClass1_Sub5_Sub1_1.method691(1);
						if (local146 == 1) {
							Static85.anIntArray336[Static59.anInt1356++] = local57;
						}
					} else if (local89 == 2) {
						Static28.anIntArray150[Static96.anInt2797++] = local57;
						local61.anInt2794 = Static60.anInt1366;
						local136 = Static35.aClass1_Sub5_Sub1_1.method691(3);
						local61.method1971(true, local136);
						local146 = Static35.aClass1_Sub5_Sub1_1.method691(3);
						local61.method1971(true, local146);
						@Pc(202) int local202 = Static35.aClass1_Sub5_Sub1_1.method691(1);
						if (local202 == 1) {
							Static85.anIntArray336[Static59.anInt1356++] = local57;
						}
					} else if (local89 == 3) {
						Static28.anIntArray151[Static25.anInt719++] = local57;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
	public static void method557() {
		aClass25_285 = null;
		aClass25_286 = null;
		aClass1_Sub2_Sub2_Sub4_3 = null;
		aClass25_284 = null;
	}
}
