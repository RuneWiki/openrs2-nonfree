import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static457 {

	@OriginalMember(owner = "client!qi", name = "v", descriptor = "Lclient!ffa;")
	public static final Class100 aClass100_27 = new Class100();

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
	public static void method6927() {
		Static14.method6445(Static171.aClass16_5, (long) Static435.anInt8192);
		if (Static212.anInt4965 != -1) {
			Static414.method6511(Static212.anInt4965);
		}
		for (@Pc(19) int local19 = 0; local19 < Static259.anInt5574; local19++) {
			if (Static620.aBooleanArray29[local19]) {
				Static10.aBooleanArray1[local19] = true;
			}
			Static373.aBooleanArray26[local19] = Static620.aBooleanArray29[local19];
			Static620.aBooleanArray29[local19] = false;
		}
		Static32.anInt1302 = Static435.anInt8192;
		if (Static212.anInt4965 != -1) {
			Static259.anInt5574 = 0;
			Static522.method7444();
		}
		Static171.aClass16_5.la();
		Static38.method1272(Static171.aClass16_5);
		@Pc(60) int local60 = Static84.method2096();
		if (local60 == -1) {
			local60 = Static341.anInt6662;
		}
		if (local60 == -1) {
			local60 = Static553.anInt9618;
		}
		Static30.method1110(local60);
		Static77.anInt2367 = 0;
	}

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "(I)V")
	public static void method6928() {
		for (@Pc(10) Class8_Sub5_Sub9 local10 = (Class8_Sub5_Sub9) Static199.aClass43_27.method1422(); local10 != null; local10 = (Class8_Sub5_Sub9) Static199.aClass43_27.method1426()) {
			@Pc(23) Class15_Sub1_Sub2_Sub5 local23 = local10.aClass15_Sub1_Sub2_Sub5_1;
			if (Static435.anInt8192 > local23.anInt9258) {
				local10.method8640();
				local23.method7559();
			} else if (local23.anInt9266 <= Static435.anInt8192) {
				local23.method7564();
				if (local23.anInt9241 > 0) {
					@Pc(47) Class8_Sub50 local47 = (Class8_Sub50) Static278.aClass253_20.method6594((long) (local23.anInt9241 - 1));
					if (local47 != null) {
						@Pc(52) Class15_Sub1_Sub2_Sub2_Sub2 local52 = local47.aClass15_Sub1_Sub2_Sub2_Sub2_2;
						if (local52.anInt10301 >= 0 && Static372.anInt7082 * 512 > local52.anInt10301 && local52.anInt10298 >= 0 && local52.anInt10298 < Static218.anInt5023 * 512) {
							local23.method7562(local52.anInt10301, Static435.anInt8192, local52.anInt10298, Static177.method3098(local52.anInt10298, local52.anInt10301, local23.aByte124) - local23.anInt9264);
						}
					}
				}
				if (local23.anInt9241 < 0) {
					@Pc(113) int local113 = -local23.anInt9241 - 1;
					@Pc(122) Class15_Sub1_Sub2_Sub2_Sub1 local122;
					if (local113 == Static616.anInt10362) {
						local122 = Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2;
					} else {
						local122 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local113];
					}
					if (local122 != null && local122.anInt10301 >= 0 && Static372.anInt7082 * 512 > local122.anInt10301 && local122.anInt10298 >= 0 && local122.anInt10298 < Static218.anInt5023 * 512) {
						local23.method7562(local122.anInt10301, Static435.anInt8192, local122.anInt10298, Static177.method3098(local122.anInt10298, local122.anInt10301, local23.aByte124) - local23.anInt9264);
					}
				}
				local23.method7565(Static77.anInt2367);
				Static333.method5408(local23, true);
			}
		}
	}
}
