import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
	public static int anInt6250;

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
	public static int anInt6251 = 0;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(III)I")
	public static int method5355(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static82.anIntArray101[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!qa;III)V")
	public static void method5356(@OriginalArg(0) Class67_Sub3_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg0.anInt5013 && arg2 != -1) {
			@Pc(15) Class111 local15 = Static306.method5143(arg2);
			@Pc(18) int local18 = local15.anInt2720;
			if (local18 == 1) {
				arg0.anInt5015 = 1;
				arg0.anInt5001 = arg1;
				arg0.anInt5000 = 0;
				arg0.anInt5060 = 0;
				arg0.anInt5005 = 0;
				Static354.method5681(arg0.anInt6310, arg0.anInt6308, local15, Static156.aClass67_Sub3_Sub3_Sub2_2 == arg0, arg0.anInt5060);
			}
			if (local18 == 2) {
				arg0.anInt5000 = 0;
			}
		} else if (arg2 == -1 || arg0.anInt5013 == -1 || Static306.method5143(arg2).anInt2716 >= Static306.method5143(arg0.anInt5013).anInt2716) {
			arg0.anInt5005 = 0;
			arg0.anInt5000 = 0;
			arg0.anInt5060 = 0;
			arg0.anInt5015 = 1;
			arg0.anInt5063 = arg0.anInt5074;
			arg0.anInt5013 = arg2;
			arg0.anInt5001 = arg1;
			if (arg0.anInt5013 != -1) {
				Static354.method5681(arg0.anInt6310, arg0.anInt6308, Static306.method5143(arg0.anInt5013), arg0 == Static156.aClass67_Sub3_Sub3_Sub2_2, arg0.anInt5060);
			}
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)V")
	public static void method5357(@OriginalArg(0) int arg0) {
		if (Static7.anInt71 == arg0) {
			return;
		}
		Static24.anInt454 = Static240.anInt4832 = Static306.anIntArray495[arg0];
		Static107.aClass129_4.method5012(50, (int) ((double) Static24.anInt454 * 34.46D));
		Static62.anIntArrayArray4 = new int[Static24.anInt454][Static240.anInt4832];
		Static230.anIntArrayArrayArray12 = new int[4][Static24.anInt454 >> 3][Static240.anInt4832 >> 3];
		Static182.anIntArrayArray44 = new int[Static24.anInt454][Static240.anInt4832];
		for (@Pc(54) int local54 = 0; local54 < 4; local54++) {
			Static211.aClass92Array1[local54] = Static232.method4151(Static240.anInt4832, Static24.anInt454);
		}
		Static247.aByteArrayArrayArray9 = new byte[4][Static24.anInt454][Static240.anInt4832];
		Static42.method637(Static24.anInt454, Static240.anInt4832);
		Static303.method4305(Static240.anInt4832 >> 3, Static24.anInt454 >> 3, Static107.aClass129_4);
		Static7.anInt71 = arg0;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZIB)I")
	public static int method5358(@OriginalArg(1) int arg0) {
		@Pc(14) Class11_Sub6 local14 = Static158.method2534(arg0, false);
		if (local14 == null) {
			return Static159.method2562(arg0).anInt1407;
		}
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < local14.anIntArray48.length; local25++) {
			if (local14.anIntArray48[local25] == -1) {
				local23++;
			}
		}
		return local23 + Static159.method2562(arg0).anInt1407 - local14.anIntArray48.length;
	}
}
