import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!mb", name = "W", descriptor = "I")
	public static int anInt4283;

	@OriginalMember(owner = "client!mb", name = "Y", descriptor = "[S")
	public static short[] aShortArray78;

	@OriginalMember(owner = "client!mb", name = "ab", descriptor = "Lclient!iq;")
	public static Class104 aClass104_108;

	@OriginalMember(owner = "client!mb", name = "db", descriptor = "I")
	public static int anInt4286;

	@OriginalMember(owner = "client!mb", name = "L", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_140 = new Class221(24, 2);

	@OriginalMember(owner = "client!mb", name = "U", descriptor = "I")
	public static int anInt4281 = 0;

	@OriginalMember(owner = "client!mb", name = "bb", descriptor = "[I")
	public static final int[] anIntArray321 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!mb", name = "cb", descriptor = "I")
	public static int anInt4285 = 0;

	@OriginalMember(owner = "client!mb", name = "eb", descriptor = "[I")
	public static final int[] anIntArray322 = new int[2048];

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)V")
	public static void method3629() {
		Static204.aClass107_25.method3015();
		Static354.aClass107_57.method3015();
		Static364.aClass107_61.method3015();
		Static274.aClass107_42.method3015();
		Static355.aClass107_58.method3015();
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZLclient!dr;)V")
	public static void method3631(@OriginalArg(1) Class37 arg0) {
		arg0.method3677(0, 0, Static335.anInt6496, 350);
		arg0.method3712(0, 0, Static335.anInt6496, 350, Static123.anInt2610 << 24 | 0x332277, 1);
		@Pc(36) int local36;
		@Pc(40) int local40;
		for (@Pc(30) int local30 = 0; local30 < 100; local30++) {
			local36 = Static220.anIntArray355[local30];
			local40 = Static81.anIntArray127[local30];
			arg0.method3712(local36, local40, 2, 2, Static63.anIntArray102[local30] << 24 | 0xFFFFFF, 1);
		}
		local36 = 350 / Static12.anInt206;
		if (Static128.anInt2757 > 0) {
			local40 = 346 - Static12.anInt206 - 4;
			@Pc(82) int local82 = local36 * local40 / (local36 + Static128.anInt2757 - 1);
			@Pc(84) int local84 = 4;
			if (Static128.anInt2757 > 1) {
				local84 = (Static128.anInt2757 - Static250.anInt5225 - 1) * (local40 + -local82) / (Static128.anInt2757 - 1) + 4;
			}
			arg0.method3712(Static335.anInt6496 - 16, local84, 12, local82, Static123.anInt2610 << 24 | 0x332277, 2);
			for (@Pc(121) int local121 = Static250.anInt5225; local121 < local36 + Static250.anInt5225 && local121 < Static128.anInt2757; local121++) {
				@Pc(130) String[] local130 = Static137.method2633('\b', Static81.aStringArray8[local121]);
				@Pc(139) int local139 = (Static335.anInt6496 - 8 - 16) / local130.length;
				for (@Pc(141) int local141 = 0; local141 < local130.length; local141++) {
					@Pc(149) int local149 = local139 * local141 + 8;
					arg0.method3677(local149, 0, local139 + local149 - 8, 350);
					Static272.aClass71_4.method5250(local130[local141], 350 - Static12.anInt206 * (local121 - Static250.anInt5225) - Static201.anInt4407 - Static213.aClass82_7.anInt2400 - 2, -1, -16777216, local149);
				}
			}
		}
		arg0.method3677(0, 0, Static335.anInt6496, 350);
		arg0.method3660(Static335.anInt6496, 350 - Static201.anInt4407, 0, -1);
		Static25.aClass71_1.method5250("--> " + Class139.lb, 350 - Static99.aClass82_3.anInt2400 - 1, -1, -16777216, 10);
		local40 = -1;
		if (Static6.anInt91 % 30 > 15) {
			local40 = 16777215;
		}
		arg0.method3739(350 - Static99.aClass82_3.anInt2400 - 11, local40, 12, Static99.aClass82_3.method2230("--> " + Class139.lb.substring(0, Static28.anInt436)) + 10);
	}
}
