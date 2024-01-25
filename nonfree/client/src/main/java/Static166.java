import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!ib", name = "M", descriptor = "I")
	public static int anInt2851 = 0;

	@OriginalMember(owner = "client!ib", name = "N", descriptor = "I")
	public static int anInt2852 = 104;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)V")
	public static void method2337(@OriginalArg(0) int arg0) {
		if (!Static2.aClass148_Sub1_1.aBoolean257) {
			arg0 = -1;
		}
		if (arg0 == Static105.anInt1975) {
			return;
		}
		if (arg0 != -1) {
			@Pc(21) Class101 local21 = Static185.aClass201_2.method4379(arg0);
			@Pc(25) Class17 local25 = local21.method2182();
			if (local25 == null) {
				arg0 = -1;
			} else {
				Static79.aClass183_2.method3922(local25.method258(), Static286.aCanvas4, local25.method250(), local25.method261(), new Point(local21.anInt2651, local21.anInt2655));
				Static105.anInt1975 = arg0;
			}
		}
		if (arg0 == -1 && Static105.anInt1975 != -1) {
			Static79.aClass183_2.method3922(-1, Static286.aCanvas4, -1, null, new Point());
			Static105.anInt1975 = -1;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!mk;I)V")
	public static void method2338(@OriginalArg(0) int arg0, @OriginalArg(1) Class159 arg1) {
		if (Static457.aBoolean532) {
			arg0 = 0;
			Static457.aBoolean532 = false;
		}
		if (Static342.aClass159_2 != null && Static342.aClass159_2.method3199(arg1)) {
			return;
		}
		Static342.aClass159_2 = arg1;
		Static295.aLong163 = Static110.method1702();
		Static392.anInt6450 = arg0;
		Static160.anInt2719 = arg0;
		if (Static160.anInt2719 != 0) {
			Static36.aFloat8 = Static9.aFloat1;
			Static161.aFloat83 = Static422.aFloat102;
			Static164.anInt4843 = Static106.anInt2003;
			Static216.aFloat36 = Static280.aFloat54;
			Static278.aClass109_3 = Static30.aClass109_1;
			Static373.aFloat97 = Static107.aFloat18;
			Static386.aFloat99 = Static261.aFloat21;
			Static173.aFloat100 = Static440.aFloat103;
			Static99.anInt1890 = Static153.anInt2663;
			Static363.anInt6114 = Static229.anInt3736;
			return;
		}
		Static363.method4780();
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!ta;JIIIIIILclient!at;)V")
	public static void method2339(@OriginalArg(0) Class35 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class16 arg7) {
		@Pc(15) int local15 = arg2 * arg2 + arg4 * arg4;
		if (arg1 < (long) local15) {
			return;
		}
		@Pc(31) int local31 = Math.min(arg7.anInt294 / 2, arg7.anInt285 / 2);
		if (local31 * local31 >= local15) {
			Static30.method455(arg0, arg7, arg5, Static385.aClass13Array20[arg6], arg4, arg2, arg3);
			return;
		}
		local31 -= 10;
		@Pc(51) int local51;
		if (Static414.anInt6776 == 4) {
			local51 = (int) Static113.aFloat19 & 0x3FFF;
		} else {
			local51 = Static363.anInt6120 + (int) Static113.aFloat19 & 0x3FFF;
		}
		@Pc(64) int local64 = Class155.anIntArray342[local51];
		@Pc(68) int local68 = Class155.anIntArray341[local51];
		if (Static414.anInt6776 != 4) {
			local64 = local64 * 256 / (Static454.anInt7274 + 256);
			local68 = local68 * 256 / (Static454.anInt7274 + 256);
		}
		@Pc(99) int local99 = local68 * arg4 + arg2 * local64 >> 15;
		@Pc(110) int local110 = local68 * arg2 - arg4 * local64 >> 15;
		@Pc(116) double local116 = Math.atan2((double) local99, (double) local110);
		@Pc(123) int local123 = (int) (Math.sin(local116) * (double) local31);
		@Pc(130) int local130 = (int) ((double) local31 * Math.cos(local116));
		Static410.aClass13Array21[arg6].method5672((float) arg7.anInt294 / 2.0F + (float) arg5 + (float) local123, (float) -local130 + (float) arg7.anInt285 / 2.0F + (float) arg3, 4096, (int) (-local116 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V")
	public static void method2340(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4) {
		Static234.method3027(arg1, arg3, null, arg2, -1, arg0, arg4);
	}
}
