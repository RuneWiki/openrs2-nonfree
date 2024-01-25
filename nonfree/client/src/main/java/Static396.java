import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!tp", name = "I", descriptor = "[F")
	public static final float[] aFloatArray30 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!tp", name = "P", descriptor = "S")
	public static short aShort93 = 1;

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "(III)I")
	public static int method5259(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static55.anIntArray86[arg0 & 0x3] : Static43.anIntArray66[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!tp", name = "d", descriptor = "(Z)Lclient!ge;")
	public static Class40_Sub3 method5260() {
		@Pc(13) Class40_Sub3 local13 = (Class40_Sub3) Static450.aClass240_8.method5226();
		if (local13 == null) {
			return new Class40_Sub3();
		} else {
			Static412.anInt6895--;
			return local13;
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(ZIIILclient!gh;)V")
	public static void method5261(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class89 arg3) {
		@Pc(8) int local8 = arg3.anInt2703;
		@Pc(11) int local11 = arg3.anInt2682;
		if (arg3.aByte22 == 0) {
			arg3.anInt2703 = arg3.anInt2748;
		} else if (arg3.aByte22 == 1) {
			arg3.anInt2703 = arg1 - arg3.anInt2748;
		} else if (arg3.aByte22 == 2) {
			arg3.anInt2703 = arg1 * arg3.anInt2748 >> 14;
		}
		if (arg3.aByte20 == 0) {
			arg3.anInt2682 = arg3.anInt2700;
		} else if (arg3.aByte20 == 1) {
			arg3.anInt2682 = arg2 - arg3.anInt2700;
		} else if (arg3.aByte20 == 2) {
			arg3.anInt2682 = arg2 * arg3.anInt2700 >> 14;
		}
		if (arg3.aByte22 == 4) {
			arg3.anInt2703 = arg3.anInt2751 * arg3.anInt2682 / arg3.anInt2696;
		}
		if (arg3.aByte20 == 4) {
			arg3.anInt2682 = arg3.anInt2703 * arg3.anInt2696 / arg3.anInt2751;
		}
		if (Static372.aBoolean418 && (Static56.method1002(arg3).anInt5644 != 0 || arg3.anInt2727 == 0)) {
			if (arg3.anInt2682 < 5 && arg3.anInt2703 < 5) {
				arg3.anInt2682 = 5;
				arg3.anInt2703 = 5;
			} else {
				if (arg3.anInt2703 <= 0) {
					arg3.anInt2703 = 5;
				}
				if (arg3.anInt2682 <= 0) {
					arg3.anInt2682 = 5;
				}
			}
		}
		if (arg3.anInt2715 == Static411.anInt6879) {
			Static76.aClass89_3 = arg3;
		}
		if (arg0 && arg3.anObjectArray25 != null && (arg3.anInt2703 != local8 || arg3.anInt2682 != local11)) {
			@Pc(190) Class10_Sub40 local190 = new Class10_Sub40();
			local190.anObjectArray36 = arg3.anObjectArray25;
			local190.aClass89_12 = arg3;
			Static72.aClass163_15.method3613(local190);
		}
	}
}
