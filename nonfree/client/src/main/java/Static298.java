import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!wc", name = "Pb", descriptor = "I")
	public static int anInt5312;

	@OriginalMember(owner = "client!wc", name = "oc", descriptor = "[I")
	public static int[] anIntArray417;

	@OriginalMember(owner = "client!wc", name = "S", descriptor = "Lclient!gg;")
	public static Class4_Sub15 aClass4_Sub15_3 = new Class4_Sub15(0, 0);

	@OriginalMember(owner = "client!wc", name = "Nb", descriptor = "[I")
	public static int[] anIntArray414 = new int[2500];

	@OriginalMember(owner = "client!wc", name = "Rb", descriptor = "I")
	public static int anInt5314 = 0;

	@OriginalMember(owner = "client!wc", name = "ec", descriptor = "[I")
	public static int[] anIntArray416 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!wc", name = "jc", descriptor = "I")
	public static int anInt5328 = 0;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!pi;IZ)Ljava/lang/String;")
	public static String method4208(@OriginalArg(0) Class4_Sub24 arg0) {
		try {
			@Pc(13) int local13 = arg0.method3060();
			if (local13 > 32767) {
				local13 = 32767;
			}
			@Pc(25) byte[] local25 = new byte[local13];
			arg0.anInt3822 += Static120.aClass69_5.method1828(arg0.aByteArray47, local25, 0, local13, arg0.anInt3822);
			return Static25.method561(0, local25, local13);
		} catch (@Pc(49) Exception local49) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method4216(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + (long) arg0.charAt(local12) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)V")
	public static void method4218() {
		Static148.aClass25_1.method4579();
		@Pc(10) int local10;
		for (local10 = 0; local10 < 32; local10++) {
			Static188.aLongArray13[local10] = 0L;
		}
		for (local10 = 0; local10 < 32; local10++) {
			Static112.aLongArray4[local10] = 0L;
		}
		Static132.anInt2633 = 0;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIII)V")
	public static void method4222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 > Static100.anInt1982 || Static293.anInt5688 > arg0) {
			return;
		}
		@Pc(30) boolean local30;
		if (Static173.anInt3481 > arg1) {
			arg1 = Static173.anInt3481;
			local30 = false;
		} else if (arg1 > Static121.anInt2460) {
			arg1 = Static121.anInt2460;
			local30 = false;
		} else {
			local30 = true;
		}
		@Pc(45) boolean local45;
		if (Static173.anInt3481 > arg2) {
			local45 = false;
			arg2 = Static173.anInt3481;
		} else if (arg2 > Static121.anInt2460) {
			arg2 = Static121.anInt2460;
			local45 = false;
		} else {
			local45 = true;
		}
		if (arg4 < Static293.anInt5688) {
			arg4 = Static293.anInt5688;
		} else {
			Static190.method3151(arg2, Static253.anIntArrayArray34[arg4++], arg3, arg1);
		}
		if (arg0 > Static100.anInt1982) {
			arg0 = Static100.anInt1982;
		} else {
			Static190.method3151(arg2, Static253.anIntArrayArray34[arg0--], arg3, arg1);
		}
		@Pc(102) int local102;
		if (local30 && local45) {
			for (local102 = arg4; local102 <= arg0; local102++) {
				@Pc(109) int[] local109 = Static253.anIntArrayArray34[local102];
				local109[arg1] = local109[arg2] = arg3;
			}
		} else if (local30) {
			for (local102 = arg4; local102 <= arg0; local102++) {
				Static253.anIntArrayArray34[local102][arg1] = arg3;
			}
		} else if (local45) {
			for (local102 = arg4; local102 <= arg0; local102++) {
				Static253.anIntArrayArray34[local102][arg2] = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(II)I")
	public static int method4224(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZI)V")
	public static void method4227(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		anIntArray414[arg0] = arg1;
		@Pc(10) Class4_Sub4 local10 = (Class4_Sub4) Static278.aClass163_35.method4188((long) arg0);
		if (local10 == null) {
			local10 = new Class4_Sub4(Static61.method1150() + 500L);
			Static278.aClass163_35.method4181((long) arg0, local10);
		} else {
			local10.aLong16 = Static61.method1150() + 500L;
		}
	}
}
