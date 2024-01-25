import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!qj", name = "B", descriptor = "Lclient!b;")
	public static Class16 aClass16_18;

	@OriginalMember(owner = "client!qj", name = "R", descriptor = "Lclient!ul;")
	public static Class205 aClass205_3;

	@OriginalMember(owner = "client!qj", name = "V", descriptor = "[Lclient!gp;")
	public static Class74_Sub1[] aClass74_Sub1Array1;

	@OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
	public static int anInt4863 = 0;

	@OriginalMember(owner = "client!qj", name = "i", descriptor = "Lclient!cj;")
	public static final Class31 aClass31_2 = new Class31();

	@OriginalMember(owner = "client!qj", name = "A", descriptor = "Z")
	public static boolean aBoolean409 = false;

	@OriginalMember(owner = "client!qj", name = "C", descriptor = "[Z")
	public static final boolean[] aBooleanArray27 = new boolean[100];

	@OriginalMember(owner = "client!qj", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString198 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

	@OriginalMember(owner = "client!qj", name = "U", descriptor = "[I")
	public static final int[] anIntArray631 = new int[13];

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)Lclient!bn;")
	public static Class1_Sub1_Sub4 method4473(@OriginalArg(0) int arg0) {
		@Pc(16) Class1_Sub1_Sub4 local16 = (Class1_Sub1_Sub4) Static258.aClass156_10.method4258((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(31) byte[] local31;
		if (arg0 < 32768) {
			local31 = Static82.aClass165_28.method4508(arg0, 0);
		} else {
			local31 = Static216.aClass165_65.method4508(arg0 & 0x7FFF, 0);
		}
		local16 = new Class1_Sub1_Sub4();
		if (local31 != null) {
			local16.method862(new Class1_Sub7(local31));
		}
		if (arg0 >= 32768) {
			local16.method861();
		}
		Static258.aClass156_10.method4256(local16, (long) arg0);
		return local16;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
	public static void method4476() {
		@Pc(5) Class140 local5 = Static344.aClass140_169;
		synchronized (Static344.aClass140_169) {
			Static344.aClass140_169.method3813();
		}
		local5 = Static249.aClass140_129;
		synchronized (Static249.aClass140_129) {
			Static249.aClass140_129.method3813();
		}
		local5 = Static152.aClass140_78;
		synchronized (Static152.aClass140_78) {
			Static152.aClass140_78.method3813();
		}
		local5 = Static210.aClass140_111;
		synchronized (Static210.aClass140_111) {
			Static210.aClass140_111.method3813();
		}
	}

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "(II)V")
	public static void method4483(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = Static215.anInt4246 - Static116.anInt2307;
		if (local8 >= 100) {
			Static81.anInt1609 = 1;
			return;
		}
		@Pc(17) int local17 = (int) Static233.aFloat86;
		if (local17 < Static16.anInt334 >> 8) {
			local17 = Static16.anInt334 >> 8;
		}
		if (Static138.aBooleanArray9[4] && local17 < Static243.anIntArray606[4] + 128) {
			local17 = Static243.anIntArray606[4] + 128;
		}
		@Pc(54) int local54 = Static252.anInt4857 + (int) Static304.aFloat110 & 0x3FFF;
		Static153.method2920(local17, Static16.method362(Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5050, Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5047, Static285.anInt5511) - 50, arg0, local54, Static81.anInt1607, (local17 >> 3) * 3 + 600, Static140.anInt2779);
		@Pc(99) float local99 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static194.anInt3958 = (int) (local99 * (float) (Static194.anInt3958 - Static347.anInt4344) + (float) Static347.anInt4344);
		Static107.anInt2183 = (int) ((float) Static32.anInt788 + (float) (Static107.anInt2183 - Static32.anInt788) * local99);
		Static164.anInt3425 = (int) ((float) Static57.anInt1266 + (float) (Static164.anInt3425 - Static57.anInt1266) * local99);
		Static221.anInt4363 = (int) ((float) Static182.anInt3766 + local99 * (float) (Static221.anInt4363 - Static182.anInt3766));
		@Pc(150) int local150 = Static5.anInt99 - Static311.anInt5990;
		if (local150 > 8192) {
			local150 -= 16384;
		} else if (local150 < -8192) {
			local150 += 16384;
		}
		Static5.anInt99 = (int) (local99 * (float) local150 + (float) Static311.anInt5990);
		Static5.anInt99 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IBIII)V")
	public static void method4497(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = arg2;
		@Pc(17) int local17 = -arg2;
		@Pc(19) int local19 = -1;
		@Pc(27) int local27 = Static216.method3969(Static251.anInt6512, arg1 + arg2, Static106.anInt2157);
		@Pc(36) int local36 = Static216.method3969(Static251.anInt6512, arg1 - arg2, Static106.anInt2157);
		Static97.method1784(local36, Static327.anIntArrayArray63[arg3], arg0, local27);
		while (local12 < local14) {
			local19 += 2;
			local17 += local19;
			@Pc(65) int local65;
			@Pc(70) int local70;
			@Pc(88) int local88;
			@Pc(96) int local96;
			if (local17 > 0) {
				local14--;
				local17 -= local14 << 1;
				local65 = arg3 - local14;
				local70 = arg3 + local14;
				if (local70 >= Static49.anInt1124 && local65 <= Static291.anInt5657) {
					local88 = Static216.method3969(Static251.anInt6512, arg1 + local12, Static106.anInt2157);
					local96 = Static216.method3969(Static251.anInt6512, arg1 - local12, Static106.anInt2157);
					if (local70 <= Static291.anInt5657) {
						Static97.method1784(local96, Static327.anIntArrayArray63[local70], arg0, local88);
					}
					if (Static49.anInt1124 <= local65) {
						Static97.method1784(local96, Static327.anIntArrayArray63[local65], arg0, local88);
					}
				}
			}
			local12++;
			local65 = arg3 - local12;
			local70 = local12 + arg3;
			if (Static49.anInt1124 <= local70 && local65 <= Static291.anInt5657) {
				local88 = Static216.method3969(Static251.anInt6512, local14 + arg1, Static106.anInt2157);
				local96 = Static216.method3969(Static251.anInt6512, arg1 - local14, Static106.anInt2157);
				if (Static291.anInt5657 >= local70) {
					Static97.method1784(local96, Static327.anIntArrayArray63[local70], arg0, local88);
				}
				if (Static49.anInt1124 <= local65) {
					Static97.method1784(local96, Static327.anIntArrayArray63[local65], arg0, local88);
				}
			}
		}
	}
}
