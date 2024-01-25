import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!as", name = "d", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!as", name = "j", descriptor = "[I")
	public static int[] anIntArray23;

	@OriginalMember(owner = "client!as", name = "g", descriptor = "Lclient!ea;")
	public static final Class63 aClass63_1 = new Class63("runescape", 0);

	@OriginalMember(owner = "client!as", name = "i", descriptor = "I")
	public static int anInt215 = 0;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ILclient!dt;)V")
	public static void method207(@OriginalArg(1) Class62 arg0) {
		if (arg0.anInt1572 != Static352.anInt5919) {
			return;
		}
		if (Static226.aClass28_Sub1_Sub1_Sub2_2.aString51 == null) {
			arg0.anInt1515 = 0;
			arg0.anInt1548 = 0;
			return;
		}
		arg0.anInt1567 = 150;
		arg0.anInt1538 = (int) (Math.sin((double) Static76.anInt1617 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt1515 = Static376.anInt6265;
		arg0.anInt1571 = 5;
		arg0.anInt1548 = Static276.method4311(Static226.aClass28_Sub1_Sub1_Sub2_2.aString51);
		arg0.anInt1535 = 0;
		arg0.anInt1566 = Static226.aClass28_Sub1_Sub1_Sub2_2.anInt4338;
		arg0.anInt1520 = Static226.aClass28_Sub1_Sub1_Sub2_2.anInt4333;
		arg0.anInt1547 = Static226.aClass28_Sub1_Sub1_Sub2_2.anInt4316;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!np;I)V")
	public static void method209(@OriginalArg(0) Class155 arg0) {
		arg0.method4867(0, 0, Static199.anInt3567, 350);
		arg0.method4896(0, 0, Static199.anInt3567, 350, Static132.anInt2501 << 24 | 0x332277, 1);
		@Pc(38) int local38;
		@Pc(44) int local44;
		for (@Pc(30) int local30 = 0; local30 < 100; local30++) {
			local38 = anIntArray23[local30] >> 4;
			local44 = Static198.anIntArray385[local30] >> 4;
			@Pc(60) int local60 = local38 + (Class226.anIntArray614[((local38 & 0x40) + local44) * 64 & 0x3FFF] >> 10);
			arg0.method4896(local60, local44, 2, 2, Static345.anIntArray636[local30] << 24 | 0xFFFFFF, 1);
		}
		local38 = 350 / Static272.anInt4752;
		if (Static125.anInt2385 > 0) {
			local44 = 346 - Static272.anInt4752 - 4;
			@Pc(100) int local100 = local38 * local44 / (Static125.anInt2385 + local38 - 1);
			@Pc(102) int local102 = 4;
			if (Static125.anInt2385 > 1) {
				local102 = (local44 - local100) * (Static125.anInt2385 + (-1 - Static319.anInt5444)) / (Static125.anInt2385 - 1) + 4;
			}
			arg0.method4896(Static199.anInt3567 - 16, local102, 12, local100, Static132.anInt2501 << 24 | 0x332277, 2);
			for (@Pc(140) int local140 = Static319.anInt5444; local38 + Static319.anInt5444 > local140 && Static125.anInt2385 > local140; local140++) {
				@Pc(151) String[] local151 = Static63.method1103('\b', Static361.aStringArray42[local140]);
				@Pc(160) int local160 = (Static199.anInt3567 - 8 - 16) / local151.length;
				for (@Pc(162) int local162 = 0; local162 < local151.length; local162++) {
					@Pc(170) int local170 = local162 * local160 + 8;
					arg0.method4867(local170, 0, local160 + local170 - 8, 350);
					Static140.aClass150_3.method5722(local151[local162], -1, -16777216, local170, 350 - Static272.anInt4752 * (local140 - Static319.anInt5444) - Static61.aClass190_1.anInt4834 - Static45.anInt803 - 2);
				}
			}
		}
		arg0.method4867(0, 0, Static199.anInt3567, 350);
		arg0.method4879(-1, Static199.anInt3567, 350 - Static45.anInt803, 0);
		Static95.aClass150_6.method5722("--> " + Static204.aString52, -1, -16777216, 10, 349 - Static366.aClass190_7.anInt4834);
		local44 = -1;
		if (Static76.anInt1617 % 30 > 15) {
			local44 = 16777215;
		}
		arg0.method4925(12, 350 - Static366.aClass190_7.anInt4834 - 11, Static366.aClass190_7.method4358("--> " + Static204.aString52.substring(0, Static88.anInt1814)) + 10, local44);
	}
}
