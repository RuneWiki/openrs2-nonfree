import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
	public static int anInt4569;

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "[Lclient!lg;")
	public static Class60[] aClass60Array10;

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "Lclient!ii;")
	public static Class4_Sub18 aClass4_Sub18_1;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString168 = "Drop";

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)V")
	public static void method3777(@OriginalArg(0) int arg0) {
		if (Static266.method4641(arg0)) {
			Static40.method769(Static158.aClass72ArrayArray1[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
	public static void method3779() {
		Static85.method1508(Static152.anInt3390);
		@Pc(16) int local16 = (Static230.anInt4796 >> 10) + (Static10.anInt231 >> 3);
		@Pc(25) int local25 = (Static133.anInt3056 >> 10) + (Static81.anInt1732 >> 3);
		Static128.anIntArray268 = new int[18];
		Static68.aByteArrayArray3 = new byte[18][];
		Static247.aByteArrayArray19 = new byte[18][];
		Static182.anIntArray344 = new int[18];
		Static281.anIntArray461 = new int[18];
		Static235.aByteArrayArray25 = new byte[18][];
		Static98.anIntArray526 = new int[18];
		Static173.anIntArray335 = new int[18];
		Static57.anIntArrayArray17 = new int[18][4];
		Static118.aByteArrayArray8 = new byte[18][];
		Static40.aByteArrayArray1 = new byte[18][];
		Static313.anIntArray505 = new int[18];
		@Pc(77) int local77 = 0;
		@Pc(96) int local96;
		for (@Pc(85) int local85 = (local16 - (Static92.anInt2048 >> 4)) / 8; local85 <= ((Static92.anInt2048 >> 4) + local16) / 8; local85++) {
			for (local96 = (local25 - (Static290.anInt5893 >> 4)) / 8; local96 <= (local25 + (Static290.anInt5893 >> 4)) / 8; local96++) {
				@Pc(104) int local104 = local96 + (local85 << 8);
				Static313.anIntArray505[local77] = local104;
				Static173.anIntArray335[local77] = Static159.aClass11_72.method301("m" + local85 + "_" + local96);
				Static281.anIntArray461[local77] = Static159.aClass11_72.method301("l" + local85 + "_" + local96);
				Static182.anIntArray344[local77] = Static159.aClass11_72.method301("n" + local85 + "_" + local96);
				Static98.anIntArray526[local77] = Static159.aClass11_72.method301("um" + local85 + "_" + local96);
				Static128.anIntArray268[local77] = Static159.aClass11_72.method301("ul" + local85 + "_" + local96);
				if (Static182.anIntArray344[local77] == -1) {
					Static173.anIntArray335[local77] = -1;
					Static281.anIntArray461[local77] = -1;
					Static98.anIntArray526[local77] = -1;
					Static128.anIntArray268[local77] = -1;
				}
				local77++;
			}
		}
		for (local96 = local77; local96 < Static182.anIntArray344.length; local96++) {
			Static182.anIntArray344[local96] = -1;
			Static173.anIntArray335[local96] = -1;
			Static281.anIntArray461[local96] = -1;
			Static98.anIntArray526[local96] = -1;
			Static128.anIntArray268[local96] = -1;
		}
		Static253.method4353(false, 8, 8, 0, local25, local16, true);
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
	public static void method3780() {
		@Pc(1) Class154 local1 = Static319.aClass154_99;
		synchronized (Static319.aClass154_99) {
			Static319.aClass154_99.method4219();
		}
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)I")
	public static int method3781() {
		if ((double) Static42.aFloat25 == 3.0D) {
			return 37;
		} else if ((double) Static42.aFloat25 == 4.0D) {
			return 50;
		} else if ((double) Static42.aFloat25 == 6.0D) {
			return 75;
		} else if ((double) Static42.aFloat25 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!lo;IIIIII)V")
	public static void method3782(@OriginalArg(0) Class2_Sub2_Sub1 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		Static346.method5622(0, arg0.anInt6466, arg0.anInt6465, arg3, arg1, arg2);
	}
}
