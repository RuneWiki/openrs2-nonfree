import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!ke", name = "C", descriptor = "I")
	public static int anInt3742;

	@OriginalMember(owner = "client!ke", name = "I", descriptor = "[I")
	public static final int[] anIntArray278 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!ke", name = "K", descriptor = "J")
	public static long aLong109 = 0L;

	@OriginalMember(owner = "client!ke", name = "L", descriptor = "Z")
	public static boolean aBoolean269 = false;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)I")
	public static int method3279(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static227.anIntArray379[arg0 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)Z")
	public static boolean method3281() {
		return Static348.anInt6384 == 0 ? Static67.aClass2_Sub11_Sub1_1.method1770() : true;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIBII)V")
	public static void method3283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg1 - arg0;
		@Pc(15) int local15 = arg3 - arg2;
		if (local10 == 0) {
			if (local15 != 0) {
				Static98.method1721(arg2, arg4, arg0, arg3);
			}
		} else if (local15 == 0) {
			Static29.method335(arg4, arg2, arg0, arg1);
		} else {
			@Pc(44) int local44 = (local15 << 12) / local10;
			@Pc(53) int local53 = arg2 - (local44 * arg0 >> 12);
			@Pc(82) int local82;
			@Pc(80) int local80;
			if (arg0 < Static179.anInt3768) {
				local82 = Static179.anInt3768;
				local80 = (local44 * Static179.anInt3768 >> 12) + local53;
			} else if (Static121.anInt6758 < arg0) {
				local80 = (Static121.anInt6758 * local44 >> 12) + local53;
				local82 = Static121.anInt6758;
			} else {
				local80 = arg2;
				local82 = arg0;
			}
			@Pc(114) int local114;
			@Pc(112) int local112;
			if (Static179.anInt3768 > arg1) {
				local112 = (local44 * Static179.anInt3768 >> 12) + local53;
				local114 = Static179.anInt3768;
			} else if (arg1 <= Static121.anInt6758) {
				local112 = arg3;
				local114 = arg1;
			} else {
				local114 = Static121.anInt6758;
				local112 = (local44 * Static121.anInt6758 >> 12) + local53;
			}
			if (local112 < Static317.anInt5793) {
				local112 = Static317.anInt5793;
				local114 = (Static317.anInt5793 - local53 << 12) / local44;
			} else if (Static69.anInt1551 < local112) {
				local114 = (Static69.anInt1551 - local53 << 12) / local44;
				local112 = Static69.anInt1551;
			}
			if (local80 < Static317.anInt5793) {
				local80 = Static317.anInt5793;
				local82 = (Static317.anInt5793 - local53 << 12) / local44;
			} else if (local80 > Static69.anInt1551) {
				local82 = (Static69.anInt1551 - local53 << 12) / local44;
				local80 = Static69.anInt1551;
			}
			Static114.method2038(local114, local112, arg4, local82, local80);
		}
	}
}
