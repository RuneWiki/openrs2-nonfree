import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!sh", name = "O", descriptor = "[Lclient!l;")
	public static Class17[] aClass17Array14;

	@OriginalMember(owner = "client!sh", name = "Q", descriptor = "Lclient!mg;")
	public static Class160 aClass160_71;

	@OriginalMember(owner = "client!sh", name = "X", descriptor = "Lclient!mg;")
	public static Class160 aClass160_72;

	@OriginalMember(owner = "client!sh", name = "cb", descriptor = "I")
	public static int anInt6109;

	@OriginalMember(owner = "client!sh", name = "T", descriptor = "Lclient!ol;")
	public static final Class182 aClass182_111 = new Class182("", 17);

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(B[[BLclient!od;)V")
	public static void method4893(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class23_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(22) int local22 = 0; local22 < arg1.anInt5076; local22++) {
			Static112.method2026();
			for (@Pc(28) int local28 = 0; local28 < Static229.anInt4427 >> 3; local28++) {
				for (@Pc(32) int local32 = 0; local32 < Static379.anInt6422 >> 3; local32++) {
					@Pc(36) boolean local36 = false;
					@Pc(44) int local44 = Static393.anIntArrayArrayArray13[local22][local28][local32];
					if (local44 != -1) {
						@Pc(53) int local53 = local44 >> 24 & 0x3;
						if (!arg1.aBoolean378 || local53 == 0) {
							@Pc(67) int local67 = local44 >> 1 & 0x3;
							@Pc(73) int local73 = local44 >> 14 & 0x3FF;
							@Pc(79) int local79 = local44 >> 3 & 0x7FF;
							@Pc(90) int local90 = (local73 / 8 << 8) + (local79 / 8);
							for (@Pc(92) int local92 = 0; local92 < Static334.anIntArray494.length; local92++) {
								if (Static334.anIntArray494[local92] == local90 && arg0[local92] != null) {
									@Pc(114) Class2_Sub23 local114 = new Class2_Sub23(arg0[local92]);
									arg1.method4071(local32 * 8, Static194.aClass70Array1, local53, local67, local79, local28 * 8, local114, local22, local73);
									local36 = true;
									arg1.method4089(local28 * 8, local22, local73, local32 * 8, local67, Static33.aClass49_1, local12[0] == -1 ? local12 : null, local114, local53, local79);
									break;
								}
							}
						}
					}
					if (!local36) {
						arg1.method4077(local32 * 8, local28 * 8, local22, 8, 8);
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static441.aClass242_2 = Static154.aClass252_1.method5608(local12[1], local12[3], Static318.aClass131_5, local12[0], local12[2]);
			Static383.anInt6435 = local12[4];
		}
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "(III)Z")
	public static boolean method4894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BLjava/awt/Canvas;)Lclient!dj;")
	public static Class2_Sub1 method4895(@OriginalArg(1) Canvas arg0) {
		try {
			@Pc(6) Class local6 = Class.forName("Class2_Sub1_Sub1");
			@Pc(10) Class2_Sub1 local10 = (Class2_Sub1) local6.getDeclaredConstructor().newInstance();
			local10.method152(arg0);
			return local10;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class2_Sub1_Sub2 local26 = new Class2_Sub1_Sub2();
			local26.method152(arg0);
			return local26;
		}
	}

	@OriginalMember(owner = "client!sh", name = "g", descriptor = "(I)V")
	public static void method4898() {
		if (Static327.aBoolean400) {
			Static346.aClass17_45 = null;
			Static327.aBoolean400 = false;
			Static163.aClass17_48 = null;
		}
	}

	@OriginalMember(owner = "client!sh", name = "h", descriptor = "(I)I")
	public static int method4899() {
		if (Static150.aFrame5 == null) {
			return Static234.aBoolean327 ? 2 : 1;
		} else {
			return 3;
		}
	}
}
