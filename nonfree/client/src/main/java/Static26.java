import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
	public static int anInt574;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "Lclient!db;")
	public static Class31 aClass31_7 = new Class31(64);

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "Z")
	public static boolean aBoolean49 = false;

	@OriginalMember(owner = "client!bj", name = "f", descriptor = "[I")
	public static int[] anIntArray58 = new int[] { 12543016, 15504954, 15914854, 16773818 };

	@OriginalMember(owner = "client!bj", name = "g", descriptor = "[I")
	public static int[] anIntArray59 = new int[200];

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(BZ)V")
	public static void method442(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static121.anInt2350 != -1) {
				Static23.method4490(Static121.anInt2350);
			}
			for (@Pc(14) Class1_Sub32 local14 = (Class1_Sub32) Static67.aClass22_7.method640(); local14 != null; local14 = (Class1_Sub32) Static67.aClass22_7.method637()) {
				Static22.method3920(local14, true);
			}
			Static121.anInt2350 = -1;
			Static67.aClass22_7 = new Class22(8);
			Static108.method1718();
			Static121.anInt2350 = Static195.anInt3761;
			Static156.method1490(false);
			Static155.method2395();
			Static17.method320(Static121.anInt2350);
		}
		Static223.anInt4684 = -1;
		Static257.method3986(Static186.anInt3489);
		Static28.aClass6_Sub6_Sub2_1 = new Class6_Sub6_Sub2();
		Static28.aClass6_Sub6_Sub2_1.anInt4562 = 3000;
		Static28.aClass6_Sub6_Sub2_1.anInt4569 = 3000;
		if (!Static240.aBoolean369 && Static107.anInt1994 == 0) {
			Static196.method2969(Static58.aClass7_58);
			Static299.method4554(10);
			return;
		}
		if (Static109.anInt2057 == 2) {
			Static182.anInt3398 = Static298.anInt5904 << 7;
			Static68.anInt4743 = Static192.anInt5400 << 7;
		} else {
			Static199.method3037();
		}
		if (Static240.aBoolean369) {
			Static192.method4141();
		}
		Static12.method262();
		Static299.method4554(28);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZII)V")
	public static void method444(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static224.anInt4696 > 0) {
			Static185.method2797(Static224.anInt4696);
			Static224.anInt4696 = 0;
		}
		@Pc(27) int local27 = Static213.anInt4239 * arg0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		for (@Pc(33) int local33 = 1; local33 < 255; local33++) {
			@Pc(48) int local48 = Static242.anIntArray583[local33] * (256 - local33) / 256;
			if (local48 < 0) {
				local48 = 0;
			}
			local29 += local48;
			@Pc(59) int local59;
			for (local59 = local48; local59 < 128; local59++) {
				@Pc(69) int local69 = Static213.anIntArray495[arg1 + local27++];
				@Pc(74) int local74 = Static295.anIntArray691[local29++];
				if (local74 == 0) {
					Static55.aClass1_Sub2_Sub2_Sub1_1.anIntArray598[local31++] = local69;
				} else {
					@Pc(86) int local86 = 256 - local74 - 18;
					@Pc(90) int local90 = local74 + 18;
					local74 = Static8.anIntArray27[local74];
					if (local86 > 255) {
						local86 = 255;
					}
					if (local90 > 255) {
						local90 = 255;
					}
					Static55.aClass1_Sub2_Sub2_Sub1_1.anIntArray598[local31++] = ((local74 & 0xFF00FF) * local90 + local86 * (local69 & 0xFF00FF) & 0xFF00FF00) + (local90 * (local74 & 0xFF00) + local86 * (local69 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			for (local59 = 0; local59 < local48; local59++) {
				Static55.aClass1_Sub2_Sub2_Sub1_1.anIntArray598[local31++] = Static213.anIntArray495[local27++ + arg1];
			}
			local27 += Static213.anInt4239 - 128;
		}
		if (Static240.aBoolean369) {
			Static50.method873(Static55.aClass1_Sub2_Sub2_Sub1_1.anIntArray598, arg1, arg0, Static55.aClass1_Sub2_Sub2_Sub1_1.anInt5119, Static55.aClass1_Sub2_Sub2_Sub1_1.anInt5112);
		} else {
			Static55.aClass1_Sub2_Sub2_Sub1_1.method3925(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(III)Lclient!oc;")
	public static Class1_Sub2_Sub13 method445(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(10) Class1_Sub2_Sub13 local10 = (Class1_Sub2_Sub13) Static45.aClass22_3.method640(); local10 != null; local10 = (Class1_Sub2_Sub13) Static45.aClass22_3.method637()) {
			if (local10.aBoolean258 && local10.method2811(arg1, arg0)) {
				return local10;
			}
		}
		return null;
	}
}
