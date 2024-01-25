import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "F")
	public static float aFloat9;

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "Lclient!dh;")
	public static Class15 aClass15_1;

	@OriginalMember(owner = "client!ci", name = "l", descriptor = "Lclient!eq;")
	public static Class66 aClass66_3;

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
	public static int anInt1240 = 0;

	@OriginalMember(owner = "client!ci", name = "i", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_23 = new Class92(21, 2);

	@OriginalMember(owner = "client!ci", name = "j", descriptor = "[J")
	public static final long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILclient!ts;)V")
	public static void method1025(@OriginalArg(1) Class239 arg0) {
		if (arg0.anInt6900 == 5 && arg0.anInt6903 != -1) {
			Static33.method835(Static126.aClass66_5, arg0);
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)V")
	public static void method1026(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = Static66.anInt1741 - anInt1240;
		if (local7 >= 100) {
			Static429.anInt7656 = 1;
			return;
		}
		@Pc(22) int local22 = (int) Static165.aFloat28;
		if (local22 < Static98.anInt6274 >> 8) {
			local22 = Static98.anInt6274 >> 8;
		}
		if (Static412.aBooleanArray26[4] && local22 < Static29.anIntArray48[4] + 128) {
			local22 = Static29.anIntArray48[4] + 128;
		}
		@Pc(55) int local55 = (int) Static265.aFloat51 + Static176.anInt3528 & 0x3FFF;
		Static200.method3111(local55, Static390.anInt6891, arg0, (local22 >> 3) * 3 + 600 << 0, Static221.method3331(Static388.anInt6870, Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7207, Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7202) - 50, local22, Static14.anInt435);
		@Pc(100) float local100 = 1.0F - (float) ((100 - local7) * (100 - local7) * (100 - local7)) / 1000000.0F;
		Static367.anInt6653 = (int) ((float) Static178.anInt7772 + (float) (Static367.anInt6653 - Static178.anInt7772) * local100);
		Static229.anInt4187 = (int) ((float) (Static229.anInt4187 - Static318.anInt5514) * local100 + (float) Static318.anInt5514);
		Static157.anInt3220 = (int) (local100 * (float) (Static157.anInt3220 - Static24.anInt790) + (float) Static24.anInt790);
		Static328.anInt5668 = (int) ((float) (Static328.anInt5668 - Static332.anInt5780) * local100 + (float) Static332.anInt5780);
		@Pc(152) int local152 = Static260.anInt4728 - Static303.anInt5377;
		if (local152 > 8192) {
			local152 -= 16384;
		} else if (local152 < -8192) {
			local152 += 16384;
		}
		Static260.anInt4728 = (int) (local100 * (float) local152 + (float) Static303.anInt5377);
		Static260.anInt4728 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(II)Lclient!vg;")
	public static Class6_Sub2_Sub17 method1027(@OriginalArg(1) int arg0) {
		@Pc(15) Class6_Sub2_Sub17 local15 = (Class6_Sub2_Sub17) Static439.aClass243_3.method5962((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static321.aClass100_60.method2520(0, arg0);
		if (local25 == null || local25.length <= 1) {
			return null;
		} else {
			local15 = Static414.method5821(local25);
			Static439.aClass243_3.method5960(local15, (long) arg0);
			return local15;
		}
	}
}
