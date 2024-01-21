import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray40;

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "[I")
	public static int[] anIntArray302;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "[I")
	public static final int[] anIntArray301 = new int[] { 2, 2, 4, 2, 1, 8, 4 };

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "Lclient!cf;")
	public static final Class20 aClass20_18 = new Class20();

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1655 = Static187.method3089("flash1:");

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1654 = aClass92_1655;

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1656 = aClass92_1655;

	@OriginalMember(owner = "client!rg", name = "i", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1657 = Static187.method3089("Clientscript error in: ");

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)V")
	public static void method2559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static119.aBoolean148 = true;
		Static73.anInt1641 = arg0;
		Static45.anInt1167 = arg1;
		Static179.anInt3908 = arg2;
		Static64.anInt1510 = -1;
		Static74.anInt1650 = -1;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)Lclient!vd;")
	public static Class92 method2560(@OriginalArg(1) int arg0) {
		return arg0 < 999999999 ? Static49.method872(arg0) : Static167.aClass92_1686;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(III)I")
	public static int method2561(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(40) int local40 = Static153.method2351(arg1 - 1, arg0 + -1) + Static153.method2351(arg1 - 1, arg0 + 1) + Static153.method2351(arg1 + 1, arg0 + -1) + Static153.method2351(arg1 + 1, arg0 - -1);
		@Pc(77) int local77 = Static153.method2351(arg1, arg0 - 1) + Static153.method2351(arg1, arg0 + 1) + Static153.method2351(arg1 - 1, arg0) + Static153.method2351(arg1 + 1, arg0);
		@Pc(82) int local82 = Static153.method2351(arg1, arg0);
		return local82 / 4 + local40 / 16 + local77 / 8;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!va;Z)V")
	public static void method2562(@OriginalArg(0) Class1_Sub3_Sub1_Sub5 arg0) {
		for (@Pc(9) int local9 = 0; local9 < Static36.anIntArray76.length; local9++) {
			Static36.anIntArray76[local9] = 0;
		}
		@Pc(36) int local36;
		for (@Pc(26) int local26 = 0; local26 < 5000; local26++) {
			local36 = (int) ((double) 256 * Math.random() * 128.0D);
			Static36.anIntArray76[local36] = (int) (Math.random() * 256.0D);
		}
		@Pc(58) int local58;
		@Pc(62) int local62;
		@Pc(70) int local70;
		for (local36 = 0; local36 < 20; local36++) {
			for (local58 = 1; local58 < 255; local58++) {
				for (local62 = 1; local62 < 127; local62++) {
					local70 = (local58 << 7) + local62;
					Static131.anIntArray211[local70] = (Static36.anIntArray76[local70 + 128] + Static36.anIntArray76[local70 - 1] + Static36.anIntArray76[local70 + 1] + Static36.anIntArray76[local70 + -128]) / 4;
				}
			}
			@Pc(114) int[] local114 = Static36.anIntArray76;
			Static36.anIntArray76 = Static131.anIntArray211;
			Static131.anIntArray211 = local114;
		}
		if (arg0 == null) {
			return;
		}
		local58 = 0;
		for (local62 = 0; local62 < arg0.anInt4208; local62++) {
			for (local70 = 0; local70 < arg0.anInt4204; local70++) {
				if (arg0.aByteArray50[local58++] != 0) {
					@Pc(149) int local149 = arg0.anInt4205 + local70 + 16;
					@Pc(156) int local156 = arg0.anInt4203 + local62 + 16;
					@Pc(162) int local162 = local149 + (local156 << 7);
					Static36.anIntArray76[local162] = 0;
				}
			}
		}
	}
}
