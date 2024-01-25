import java.awt.Point;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
	public static int anInt687;

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_18 = new Class40(69, -2);

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILclient!dw;IB)V")
	public static void method568(@OriginalArg(0) int arg0, @OriginalArg(1) Class29_Sub2_Sub1_Sub1 arg1, @OriginalArg(2) int arg2) {
		if (arg1.anInt8538 == arg0 && arg0 != -1) {
			@Pc(89) Class108 local89 = Static31.aClass345_1.method7798(arg0);
			@Pc(92) int local92 = local89.anInt2591;
			if (local92 == 1) {
				arg1.anInt8540 = 1;
				arg1.anInt8536 = 0;
				arg1.anInt8577 = 0;
				arg1.anInt8563 = arg2;
				arg1.anInt8516 = 0;
				Static294.method4111(arg1.anInt8536, arg1.anInt9218, false, arg1.anInt9222, local89, arg1.aByte103);
			}
			if (local92 == 2) {
				arg1.anInt8516 = 0;
			}
		} else if (arg0 == -1 || arg1.anInt8538 == -1 || Static31.aClass345_1.method7798(arg0).anInt2604 >= Static31.aClass345_1.method7798(arg1.anInt8538).anInt2604) {
			arg1.anInt8583 = arg1.anInt8582;
			arg1.anInt8540 = 1;
			arg1.anInt8563 = arg2;
			arg1.anInt8577 = 0;
			arg1.anInt8538 = arg0;
			arg1.anInt8536 = 0;
			arg1.anInt8516 = 0;
			if (arg1.anInt8538 != -1) {
				Static294.method4111(arg1.anInt8536, arg1.anInt9218, false, arg1.anInt9222, Static31.aClass345_1.method7798(arg1.anInt8538), arg1.aByte103);
			}
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(BLclient!pq;Lclient!pq;Lclient!pq;Lclient!pq;)V")
	public static void method571(@OriginalArg(1) Class251 arg0, @OriginalArg(2) Class251 arg1, @OriginalArg(3) Class251 arg2, @OriginalArg(4) Class251 arg3) {
		Static400.aClass251_134 = arg2;
		Static264.aClass251_76 = arg0;
		Static409.aClass251_36 = arg1;
		Static208.aClass251_70 = arg3;
		Static375.aClass97ArrayArray1 = new Class97[Static400.aClass251_134.method5847()][];
		Static555.aBooleanArray42 = new boolean[Static400.aClass251_134.method5847()];
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(II)V")
	public static void method572(@OriginalArg(1) int arg0) {
		if (!Static480.aClass6_Sub37_Sub1_1.aBoolean398) {
			arg0 = -1;
		}
		if (Static571.anInt9575 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(32) Class139 local32 = Static247.aClass33_2.method600(arg0);
			@Pc(36) Class196 local36 = local32.method3004();
			if (local36 == null) {
				arg0 = -1;
			} else {
				Static152.aClass57_4.method931(local36.method4744(), new Point(local32.anInt3468, local32.anInt3467), Static34.aCanvas15, local36.method4743(), local36.method4755());
				Static571.anInt9575 = arg0;
			}
		}
		if (arg0 == -1 && Static571.anInt9575 != -1) {
			Static152.aClass57_4.method931(-1, new Point(), Static34.aCanvas15, null, -1);
			Static571.anInt9575 = -1;
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIII)V")
	public static void method573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(13) int local13 = 0; local13 < Static73.anInt1201; local13++) {
			@Pc(19) Rectangle local19 = Class6_Sub1_Sub11.aRectangleArray1[local13];
			if (arg2 < local19.x + local19.width && arg3 + arg2 > local19.x && local19.y + local19.height > arg1 && arg0 + arg1 > local19.y) {
				Static258.aBooleanArray27[local13] = true;
			}
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IJ)V")
	public static void method574(@OriginalArg(1) long arg0) {
		@Pc(7) int local7 = Static135.anInt2370;
		@Pc(19) int local19;
		@Pc(27) int local27;
		if (local7 != Static141.anInt2539) {
			local19 = local7 - Static141.anInt2539;
			local27 = (int) ((long) local19 * arg0 / 320L);
			if (local19 > 0) {
				if (local27 == 0) {
					local27 = 1;
				} else if (local27 > local19) {
					local27 = local19;
				}
			} else if (local27 == 0) {
				local27 = -1;
			} else if (local27 < local19) {
				local27 = local19;
			}
			Static141.anInt2539 += local27;
		}
		@Pc(65) int local65 = Static224.anInt3801;
		if (!Static480.aClass6_Sub37_Sub1_1.aBoolean412) {
			Static399.aFloat167 += (float) arg0 * Static274.aFloat47 / 40.0F * 8.0F;
			Static475.aFloat174 += (float) arg0 * Static212.aFloat48 / 40.0F * 8.0F;
		}
		if (local65 != Static285.anInt4695) {
			local19 = local65 - Static285.anInt4695;
			local27 = (int) (arg0 * (long) local19 / 320L);
			if (local19 > 0) {
				if (local27 == 0) {
					local27 = 1;
				} else if (local19 < local27) {
					local27 = local19;
				}
			} else if (local27 == 0) {
				local27 = -1;
			} else if (local19 > local27) {
				local27 = local19;
			}
			Static285.anInt4695 += local27;
		}
		Static318.method4939();
	}
}
