import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!ao", name = "h", descriptor = "I")
	public static int anInt4107;

	@OriginalMember(owner = "client!ao", name = "k", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet3;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "[I")
	public static final int[] anIntArray300 = new int[25];

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray37 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "Lclient!sea;")
	public static Class308 aClass308_7 = null;

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "J")
	public static long aLong107 = 0L;

	@OriginalMember(owner = "client!ao", name = "m", descriptor = "I")
	public static int anInt4109 = -1;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIBIII)V")
	public static void method3525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 >= Static130.anInt2131 && Static89.anInt1576 >= arg3 && Static275.anInt4756 <= arg4 && arg0 <= Static48.anInt898) {
			if (arg2 == 1) {
				Static59.method1024(arg5, arg3, arg0, arg4, arg1);
			} else {
				Static17.method4061(arg0, arg3, arg1, arg4, arg2, arg5);
			}
		} else if (arg2 == 1) {
			Static484.method6239(arg3, arg5, arg1, arg0, arg4);
		} else {
			Static114.method1674(arg5, arg3, arg4, arg1, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(B)V")
	public static void method3527() {
		@Pc(16) int local16 = Static26.aByteArrayArray1.length;
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			if (Static26.aByteArrayArray1[local18] != null) {
				@Pc(26) int local26 = -1;
				for (@Pc(28) int local28 = 0; local28 < Static295.anInt4972; local28++) {
					if (Static466.anIntArray500[local28] == Static301.anIntArray349[local18]) {
						local26 = local28;
						break;
					}
				}
				if (local26 == -1) {
					Static466.anIntArray500[Static295.anInt4972] = Static301.anIntArray349[local18];
					local26 = Static295.anInt4972++;
				}
				@Pc(71) Class2_Sub7 local71 = new Class2_Sub7(Static26.aByteArrayArray1[local18]);
				@Pc(73) int local73 = 0;
				while (local71.anInt5186 < Static26.aByteArrayArray1[local18].length && local73 < 511 && Static365.anInt6148 < 1023) {
					@Pc(92) int local92 = local73++ << 6 | local26;
					@Pc(96) int local96 = local71.method4518();
					@Pc(100) int local100 = local96 >> 14;
					@Pc(106) int local106 = local96 >> 7 & 0x3F;
					@Pc(110) int local110 = local96 & 0x3F;
					@Pc(123) int local123 = local106 + (Static301.anIntArray349[local18] >> 8) * 64 - Static485.anInt7725;
					@Pc(135) int local135 = local110 + (Static301.anIntArray349[local18] & 0xFF) * 64 - Static310.anInt5129;
					@Pc(142) Class295 local142 = Static76.aClass361_1.method7581(local71.method4518());
					@Pc(149) Class2_Sub5 local149 = (Class2_Sub5) Static436.aClass90_26.method1685((long) local92);
					if (local149 == null && (local142.aByte105 & 0x1) > 0 && Static487.anInt7738 == local100 && local123 >= 0 && Static281.anInt4822 > local142.anInt7362 + local123 && local135 >= 0 && local135 + local142.anInt7362 < Static29.anInt491) {
						@Pc(187) Class12_Sub2_Sub1_Sub4_Sub2 local187 = new Class12_Sub2_Sub1_Sub4_Sub2();
						local187.anInt8406 = local92;
						@Pc(195) Class2_Sub5 local195 = new Class2_Sub5(local187);
						Static436.aClass90_26.method1684(local195, (long) local92);
						Static379.aClass2_Sub5Array1[Static51.anInt912++] = local195;
						Static461.anIntArray562[Static365.anInt6148++] = local92;
						local187.anInt8367 = Static532.anInt8757;
						local187.method6784(local142);
						local187.method6762(local187.aClass295_1.anInt7362);
						local187.anInt8395 = local187.aClass295_1.anInt7329 << 3;
						local187.method6766((local187.aClass295_1.aByte110 + 4 & 0xB3E00007) << 11, true);
						local187.method6783(local100, local187.method6777(), local135, true, local123);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(I)V")
	public static void method3528() {
		Static304.aClass2_Sub27_2 = new Class2_Sub27(Static229.aClass159_6.method2776(Static261.anInt4297), "", Static409.anInt6677, 1001, -1, 0L, 0, 0, true, false);
	}
}
