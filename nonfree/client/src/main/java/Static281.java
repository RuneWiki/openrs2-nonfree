import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!vi", name = "x", descriptor = "[I")
	public static int[] anIntArray476;

	@OriginalMember(owner = "client!vi", name = "C", descriptor = "[[Lclient!gj;")
	public static Class4_Sub14[][] aClass4_Sub14ArrayArray3;

	@OriginalMember(owner = "client!vi", name = "F", descriptor = "[B")
	public static byte[] aByteArray71;

	@OriginalMember(owner = "client!vi", name = "G", descriptor = "I")
	public static int anInt5347;

	@OriginalMember(owner = "client!vi", name = "q", descriptor = "I")
	public static int anInt5336 = 3353893;

	@OriginalMember(owner = "client!vi", name = "t", descriptor = "Lclient!lb;")
	public static Class97 aClass97_24 = new Class97(16);

	@OriginalMember(owner = "client!vi", name = "w", descriptor = "[[I")
	public static int[][] anIntArrayArray46 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

	@OriginalMember(owner = "client!vi", name = "E", descriptor = "I")
	public static int anInt5346 = 0;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILclient!cc;IIIIIB)V")
	public static void method4238(@OriginalArg(0) int arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(13) int local13 = arg3 * arg3 + arg5 * arg5;
		if (local13 > arg6) {
			return;
		}
		@Pc(32) int local32 = Math.min(arg1.anInt546 / 2, arg1.anInt602 / 2);
		if (local32 * local32 >= local13) {
			Static268.method4003(arg1, arg5, Static81.aClass4_Sub2_Sub1Array10[arg2], arg0, arg4, arg3);
			return;
		}
		@Pc(48) int local48 = Static113.anInt2470 + (int) Static270.aFloat49 & 0x7FF;
		local32 -= 10;
		@Pc(53) int local53 = Class131.anIntArray353[local48];
		@Pc(61) int local61 = local53 * 256 / (Static44.anInt879 + 256);
		@Pc(65) int local65 = Class131.anIntArray355[local48];
		@Pc(73) int local73 = local65 * 256 / (Static44.anInt879 + 256);
		@Pc(84) int local84 = local73 * arg3 + arg5 * local61 >> 16;
		@Pc(95) int local95 = local61 * arg3 - arg5 * local73 >> 16;
		@Pc(101) double local101 = Math.atan2((double) local84, (double) local95);
		@Pc(108) int local108 = (int) (Math.sin(local101) * (double) local32);
		@Pc(115) int local115 = (int) (Math.cos(local101) * (double) local32);
		if (Static178.aBoolean216) {
			((Class4_Sub2_Sub1_Sub2) Static254.aClass4_Sub2_Sub1Array11[arg2]).method2587((local108 + arg1.anInt546 / 2 + arg4) * 16, (arg1.anInt602 / 2 + arg0 - local115) * 16, (int) (local101 * 10430.378D));
		} else {
			((Class4_Sub2_Sub1_Sub1) Static254.aClass4_Sub2_Sub1Array11[arg2]).method3467(local108 + arg4 + arg1.anInt546 / 2 - 10, -local115 + -10 + arg1.anInt602 / 2 + arg0, local101);
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)V")
	public static void method4239() {
		Static106.aClass33_18.method838(5);
		Static295.aClass33_40.method838(5);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V")
	public static void method4240() {
		aClass97_24 = null;
		aByteArray71 = null;
		anIntArray476 = null;
		anIntArrayArray46 = null;
		aClass4_Sub14ArrayArray3 = null;
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(II)V")
	public static void method4241(@OriginalArg(1) int arg0) {
		@Pc(12) Class4_Sub32 local12 = (Class4_Sub32) Static105.aClass97_9.method2360((long) arg0);
		if (local12 != null) {
			for (@Pc(22) int local22 = 0; local22 < local12.anIntArray480.length; local22++) {
				local12.anIntArray480[local22] = -1;
				local12.anIntArray482[local22] = 0;
			}
		}
	}
}
