import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static535 {

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "[Lclient!bq;")
	public static Class34[] aClass34Array1;

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "Lclient!ufa;")
	public static Class326 aClass326_5;

	@OriginalMember(owner = "client!uk", name = "o", descriptor = "I")
	public static int anInt9696 = 0;

	@OriginalMember(owner = "client!uk", name = "r", descriptor = "Z")
	public static boolean aBoolean812 = true;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IBIIIII)V")
	public static void method7873(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg2 + arg4;
		@Pc(13) int local13 = arg1 - arg4;
		for (@Pc(15) int local15 = arg2; local15 < local8; local15++) {
			Static426.method6794(arg0, Static333.anIntArrayArray56[local15], arg5, arg3);
		}
		@Pc(36) int local36 = arg4 + arg5;
		@Pc(41) int local41 = arg0 - arg4;
		for (@Pc(43) int local43 = arg1; local43 > local13; local43--) {
			Static426.method6794(arg0, Static333.anIntArrayArray56[local43], arg5, arg3);
		}
		for (@Pc(67) int local67 = local8; local67 <= local13; local67++) {
			@Pc(72) int[] local72 = Static333.anIntArrayArray56[local67];
			Static426.method6794(local36, local72, arg5, arg3);
			Static426.method6794(arg0, local72, local41, arg3);
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)V")
	public static void method7875() {
		if (!Static305.method5051()) {
			return;
		}
		if (Static171.aStringArray14 == null) {
			Static313.method5255();
		}
		Static361.aBoolean607 = true;
		Static368.anInt7250 = 0;
		try {
			Static93.aClipboard1 = Static173.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(24) Exception local24) {
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)I")
	public static int method7878(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 & 0x3F;
		@Pc(18) int local18 = arg0 >> 6 & 0x3;
		if (local12 == 18) {
			if (local18 == 0) {
				return 1;
			}
			if (local18 == 1) {
				return 2;
			}
			if (local18 == 2) {
				return 4;
			}
			if (local18 == 3) {
				return 8;
			}
		} else if (local12 == 19 || local12 == 21) {
			if (local18 == 0) {
				return 16;
			}
			if (local18 == 1) {
				return 32;
			}
			if (local18 == 2) {
				return 64;
			}
			if (local18 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)V")
	public static void method7879() {
		if (Static413.anIntArray500 != null && Static251.anIntArray323 != null) {
			return;
		}
		Static413.anIntArray500 = new int[256];
		Static251.anIntArray323 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(22) double local22 = (double) local13 / 255.0D * 6.283185307179586D;
			Static413.anIntArray500[local13] = (int) (Math.sin(local22) * 4096.0D);
			Static251.anIntArray323[local13] = (int) (Math.cos(local22) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZZI)Lclient!js;")
	public static Class3_Sub29 method7881(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(12) long local12 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg1);
		return (Class3_Sub29) Static426.aClass25_32.method946(local12);
	}
}
