import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!sb", name = "S", descriptor = "Lclient!pe;")
	public static Class13 aClass13_34;

	@OriginalMember(owner = "client!sb", name = "gb", descriptor = "I")
	public static int anInt4089;

	@OriginalMember(owner = "client!sb", name = "U", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!sb", name = "Z", descriptor = "Lclient!ra;")
	public static Class72 aClass72_10 = null;

	@OriginalMember(owner = "client!sb", name = "ab", descriptor = "[Lclient!li;")
	public static final Class49[] aClass49Array1 = new Class49[50];

	@OriginalMember(owner = "client!sb", name = "bb", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_1116 = Static158.method3034("Create a free account");

	@OriginalMember(owner = "client!sb", name = "hb", descriptor = "Lclient!ob;")
	public static Class60 aClass60_1117 = aClass60_1116;

	@OriginalMember(owner = "client!sb", name = "jb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1118 = Static158.method3034(" )2> <col=ffffff>");

	@OriginalMember(owner = "client!sb", name = "qb", descriptor = "[I")
	public static final int[] anIntArray451 = new int[128];

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V")
	public static void method3096() {
		@Pc(7) int local7;
		if (Static134.anInt3572 > 0) {
			for (local7 = 0; local7 < 256; local7++) {
				if (Static134.anInt3572 > 768) {
					Static123.anIntArray392[local7] = Static49.method1127(1024 - Static134.anInt3572, Static78.anIntArray265[local7], Static174.anIntArray462[local7]);
				} else if (Static134.anInt3572 <= 256) {
					Static123.anIntArray392[local7] = Static49.method1127(256 - Static134.anInt3572, Static174.anIntArray462[local7], Static78.anIntArray265[local7]);
				} else {
					Static123.anIntArray392[local7] = Static174.anIntArray462[local7];
				}
			}
		} else if (Static169.anInt4154 <= 0) {
			for (local7 = 0; local7 < 256; local7++) {
				Static123.anIntArray392[local7] = Static78.anIntArray265[local7];
			}
		} else {
			for (local7 = 0; local7 < 256; local7++) {
				if (Static169.anInt4154 > 768) {
					Static123.anIntArray392[local7] = Static49.method1127(1024 - Static169.anInt4154, Static78.anIntArray265[local7], Static118.anIntArray374[local7]);
				} else if (Static169.anInt4154 > 256) {
					Static123.anIntArray392[local7] = Static118.anIntArray374[local7];
				} else {
					Static123.anIntArray392[local7] = Static49.method1127(256 - Static169.anInt4154, Static118.anIntArray374[local7], Static78.anIntArray265[local7]);
				}
			}
		}
		@Pc(150) int local150 = 0;
		@Pc(155) int local155 = Static97.aClass2_Sub1_Sub7_Sub4_5.anInt2694 * 9;
		local7 = 0;
		@Pc(178) int local178;
		@Pc(191) int local191;
		@Pc(204) int local204;
		@Pc(199) int local199;
		@Pc(219) int local219;
		@Pc(224) int local224;
		for (@Pc(164) int local164 = 1; local164 < 255; local164++) {
			local178 = Static168.anIntArray455[local164] * (256 - local164) / 256 + 22;
			if (local178 < 0) {
				local178 = 0;
			}
			local7 += local178;
			for (local191 = local178; local191 < 128; local191++) {
				local199 = Static97.aClass2_Sub1_Sub7_Sub4_5.anIntArray310[local155++];
				local204 = Static152.anIntArray320[local7++];
				if (local204 == 0) {
					Static106.aClass2_Sub1_Sub7_Sub4_7.anIntArray310[local150++] = local199;
				} else {
					local219 = local204;
					local224 = 256 - local204;
					local204 = Static123.anIntArray392[local204];
					Static106.aClass2_Sub1_Sub7_Sub4_7.anIntArray310[local150++] = (local219 * (local204 & 0xFF00) + local224 * (local199 & 0xFF00) & 0xFF0000) + (local219 * (local204 & 0xFF00FF) + ((local199 & 0xFF00FF) * local224) & 0xFF00FF00) >> 8;
				}
			}
			for (local204 = 0; local204 < local178; local204++) {
				Static106.aClass2_Sub1_Sub7_Sub4_7.anIntArray310[local150++] = Static97.aClass2_Sub1_Sub7_Sub4_5.anIntArray310[local155++];
			}
			local155 += Static97.aClass2_Sub1_Sub7_Sub4_5.anInt2694 - 128;
		}
		local150 = 0;
		local7 = 0;
		Static106.aClass2_Sub1_Sub7_Sub4_7.method2149(0, 9);
		local155 = Static97.aClass2_Sub1_Sub7_Sub4_5.anInt2694 * 9 + 128;
		for (local178 = 1; local178 < 255; local178++) {
			local191 = (256 - local178) * Static168.anIntArray455[local178] / 256 + 22;
			if (local191 < 0) {
				local191 = 0;
			}
			for (local204 = 0; local204 < local191; local204++) {
				@Pc(346) int local346 = local150++;
				local155--;
				Static11.aClass2_Sub1_Sub7_Sub4_4.anIntArray310[local346] = Static97.aClass2_Sub1_Sub7_Sub4_5.anIntArray310[local155];
			}
			for (local199 = local191; local199 < 128; local199++) {
				local155--;
				local224 = Static97.aClass2_Sub1_Sub7_Sub4_5.anIntArray310[local155];
				local219 = Static152.anIntArray320[local7++];
				if (local219 == 0) {
					Static11.aClass2_Sub1_Sub7_Sub4_4.anIntArray310[local150++] = local224;
				} else {
					@Pc(378) int local378 = 256 - local219;
					@Pc(380) int local380 = local219;
					local219 = Static123.anIntArray392[local219];
					Static11.aClass2_Sub1_Sub7_Sub4_4.anIntArray310[local150++] = (local378 * (local224 & 0xFF00) + local380 * (local219 & 0xFF00) & 0xFF0000) + ((local224 & 0xFF00FF) * local378 + local380 * (local219 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local155 += Static97.aClass2_Sub1_Sub7_Sub4_5.anInt2694 + 128;
			local7 += local191;
		}
		Static11.aClass2_Sub1_Sub7_Sub4_4.method2149(637, 9);
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(BI)I")
	public static int method3099(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(IIIIII)V")
	public static void method3100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg0 - arg1;
		@Pc(15) int local15 = arg4 - arg3;
		if (local15 == 0) {
			if (local10 != 0) {
				Static62.method1441(arg3, arg2, arg0, arg1);
			}
		} else if (local10 == 0) {
			Static56.method1332(arg1, arg4, arg3, arg2);
		} else {
			if (local15 < 0) {
				local15 = -local15;
			}
			if (local10 < 0) {
				local10 = -local10;
			}
			@Pc(63) boolean local63 = local10 > local15;
			@Pc(67) int local67;
			@Pc(71) int local71;
			if (local63) {
				local67 = arg3;
				arg3 = arg1;
				local71 = arg4;
				arg1 = local67;
				arg4 = arg0;
				arg0 = local71;
			}
			if (arg4 < arg3) {
				local67 = arg3;
				arg3 = arg4;
				arg4 = local67;
				local71 = arg1;
				arg1 = arg0;
				arg0 = local71;
			}
			local67 = arg1;
			@Pc(104) int local104 = arg0 - arg1;
			if (local104 < 0) {
				local104 = -local104;
			}
			@Pc(123) int local123 = arg1 < arg0 ? 1 : -1;
			local71 = arg4 - arg3;
			@Pc(133) int local133 = -(local71 >> 1);
			@Pc(137) int local137;
			if (local63) {
				for (local137 = arg3; local137 <= arg4; local137++) {
					Static42.anIntArrayArray8[local137][local67] = arg2;
					local133 += local104;
					if (local133 > 0) {
						local67 += local123;
						local133 -= local71;
					}
				}
			} else {
				for (local137 = arg3; local137 <= arg4; local137++) {
					Static42.anIntArrayArray8[local67][local137] = arg2;
					local133 += local104;
					if (local133 > 0) {
						local133 -= local71;
						local67 += local123;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "(I)V")
	public static void method3101() {
		Static30.aClass89_10.method3439();
		Static156.aClass89_58.method3439();
		Static115.aClass89_45.method3439();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!og;Lclient!ob;I)I")
	public static int method3102(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) Class60 arg1) {
		@Pc(6) int local6 = arg0.anInt273;
		arg0.method235(arg1.anInt3466);
		arg0.anInt273 += Static114.aClass80_1.method3116(0, arg1.anInt3466, arg1.aByteArray39, arg0.aByteArray4, arg0.anInt273);
		return arg0.anInt273 - local6;
	}
}
