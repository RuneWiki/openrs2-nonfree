import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "m", descriptor = "[I")
	public static int[] anIntArray1;

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "Lclient!wd;")
	public static Class82 aClass82_1 = new Class82();

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
	public static int anInt9 = 0;

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
	public static int anInt10 = 0;

	@OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
	public static int anInt12 = 0;

	@OriginalMember(owner = "client!aa", name = "j", descriptor = "Lclient!ja;")
	public static Class33 aClass33_1 = new Class33(64);

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
	public static int anInt14 = 0;

	@OriginalMember(owner = "client!aa", name = "n", descriptor = "Lclient!ec;")
	public static Class22 aClass22_7 = Static60.method1113("::gc");

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
	public static void method5() {
		aClass82_1 = null;
		aClass33_1 = null;
		anIntArray1 = null;
		aClass22_7 = null;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI)V")
	public static void method7(@OriginalArg(1) int arg0) {
		@Pc(8) int[] local8 = Static119.aClass4_Sub1_Sub2_Sub2_7.anIntArray129;
		@Pc(11) int local11 = local8.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local8[local13] = 0;
		}
		@Pc(44) int local44;
		@Pc(46) int local46;
		for (@Pc(31) int local31 = 1; local31 < 103; local31++) {
			local44 = (52736 - local31 * 512) * 4 + 24628;
			for (local46 = 1; local46 < 103; local46++) {
				if ((Static3.aByteArrayArrayArray1[arg0][local46][local31] & 0x18) == 0) {
					Static134.aClass77_1.method1953(local8, local44, arg0, local46, local31);
				}
				if (arg0 < 3 && (Static3.aByteArrayArrayArray1[arg0 + 1][local46][local31] & 0x8) != 0) {
					Static134.aClass77_1.method1953(local8, local44, arg0 + 1, local46, local31);
				}
				local44 += 4;
			}
		}
		Static119.aClass4_Sub1_Sub2_Sub2_7.method809();
		local44 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 16) + (238 - -((int) (Math.random() * 20.0D)) + -10 << 8) + 228;
		local46 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		@Pc(157) int local157;
		for (@Pc(153) int local153 = 1; local153 < 103; local153++) {
			for (local157 = 1; local157 < 103; local157++) {
				if ((Static3.aByteArrayArrayArray1[arg0][local157][local153] & 0x18) == 0) {
					Static26.method602(local44, arg0, local157, local153, local46);
				}
				if (arg0 < 3 && (Static3.aByteArrayArrayArray1[arg0 + 1][local157][local153] & 0x8) != 0) {
					Static26.method602(local44, arg0 + 1, local157, local153, local46);
				}
			}
		}
		Static68.anInt492 = 0;
		for (local157 = 0; local157 < 104; local157++) {
			for (@Pc(224) int local224 = 0; local224 < 104; local224++) {
				@Pc(232) int local232 = Static134.aClass77_1.method1938(Static37.anInt895, local157, local224);
				if (local232 != 0) {
					local232 = local232 >> 14 & 0x7FFF;
					@Pc(248) int local248 = Static5.method45(local232).anInt1250;
					if (local248 >= 0) {
						@Pc(255) int local255 = local157;
						@Pc(257) int local257 = local224;
						if (local248 != 22 && local248 != 29 && local248 != 34 && local248 != 36 && local248 != 46 && local248 != 47 && local248 != 48) {
							@Pc(289) int[][] local289 = Static87.aClass60Array1[Static37.anInt895].anIntArrayArray27;
							for (@Pc(291) int local291 = 0; local291 < 10; local291++) {
								@Pc(298) int local298 = (int) (Math.random() * 4.0D);
								if (local298 == 0 && local255 > 0 && local255 > local157 - 3 && (local289[local255 - 1][local257] & 0x12C0108) == 0) {
									local255--;
								}
								if (local298 == 1 && local255 < 103 && local157 + 3 > local255 && (local289[local255 + 1][local257] & 0x12C0180) == 0) {
									local255++;
								}
								if (local298 == 2 && local257 > 0 && local257 > local224 - 3 && (local289[local255][local257 - 1] & 0x12C0102) == 0) {
									local257--;
								}
								if (local298 == 3 && local257 < 103 && local224 + 3 > local257 && (local289[local255][local257 + 1] & 0x12C0120) == 0) {
									local257++;
								}
							}
						}
						Static133.aClass4_Sub1_Sub2_Sub2Array15[Static68.anInt492] = Static92.aClass4_Sub1_Sub2_Sub2Array14[local248];
						Static99.anIntArray285[Static68.anInt492] = local255;
						Static69.anIntArray192[Static68.anInt492] = local257;
						Static68.anInt492++;
					}
				}
			}
		}
		Static43.aClass11_1.method577();
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!ea;Lclient!ec;Lclient!ec;I)Lclient!h;")
	public static Class4_Sub1_Sub2_Sub2 method8(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) Class22 arg2) {
		@Pc(13) int local13 = arg0.method592(arg2);
		@Pc(19) int local19 = arg0.method606(arg1, local13);
		return Static31.method535(local19, arg0, local13);
	}
}
