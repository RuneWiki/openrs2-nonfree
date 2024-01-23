import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
	public static int anInt5142;

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "Lclient!g;")
	public static Class56 aClass56_21;

	@OriginalMember(owner = "client!sl", name = "l", descriptor = "Z")
	public static boolean aBoolean343 = true;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method4095(@OriginalArg(1) Component arg0) {
		arg0.addMouseListener(Static56.aClass177_1);
		arg0.addMouseMotionListener(Static56.aClass177_1);
		arg0.addFocusListener(Static56.aClass177_1);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILclient!gb;ILclient!gb;Z)I")
	public static int method4096(@OriginalArg(0) int arg0, @OriginalArg(1) Class58_Sub1 arg1, @OriginalArg(3) Class58_Sub1 arg2, @OriginalArg(4) boolean arg3) {
		if (arg0 == 1) {
			@Pc(17) int local17 = arg1.anInt2150;
			@Pc(20) int local20 = arg2.anInt2150;
			if (!arg3) {
				if (local20 == -1) {
					local20 = 2001;
				}
				if (local17 == -1) {
					local17 = 2001;
				}
			}
			return local17 - local20;
		} else if (arg0 == 2) {
			return Static140.method2492(arg2.method1602().aString88, Static100.anInt2375, arg1.method1602().aString88);
		} else if (arg0 == 3) {
			if (arg1.aString79.equals("-")) {
				if (arg2.aString79.equals("-")) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg2.aString79.equals("-")) {
				return arg3 ? 1 : -1;
			} else {
				return Static140.method2492(arg2.aString79, Static100.anInt2375, arg1.aString79);
			}
		} else if (arg0 == 4) {
			return arg1.method1589() ? (arg2.method1589() ? 0 : 1) : (arg2.method1589() ? -1 : 0);
		} else if (arg0 == 5) {
			return arg1.method1592() ? (arg2.method1592() ? 0 : 1) : arg2.method1592() ? -1 : 0;
		} else if (arg0 == 6) {
			return arg1.method1593() ? (arg2.method1593() ? 0 : 1) : (arg2.method1593() ? -1 : 0);
		} else if (arg0 == 7) {
			return arg1.method1594() ? (arg2.method1594() ? 0 : 1) : (arg2.method1594() ? -1 : 0);
		} else {
			return arg1.anInt2165 - arg2.anInt2165;
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!ek;IZLclient!ek;I)Lclient!eb;")
	public static Class2_Sub8_Sub6 method4099(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class42 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) int[] local12 = arg2.method1265(arg1);
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(26) byte[] local26 = arg2.method1278(local12[local14], arg1);
			if (local26 == null) {
				local7 = false;
			} else {
				@Pc(47) int local47 = local26[1] & 0xFF | (local26[0] & 0xFF) << 8;
				@Pc(55) byte[] local55 = arg0.method1278(0, local47);
				if (local55 == null) {
					local7 = false;
				}
			}
		}
		if (!local7) {
			return null;
		}
		try {
			return new Class2_Sub8_Sub6(arg2, arg0, arg1, false);
		} catch (@Pc(85) Exception local85) {
			return null;
		}
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(B)V")
	public static void method4100() {
		for (@Pc(14) Class2_Sub8_Sub11 local14 = (Class2_Sub8_Sub11) Static34.aClass44_2.method1352(); local14 != null; local14 = (Class2_Sub8_Sub11) Static34.aClass44_2.method1360()) {
			@Pc(24) Class15_Sub3 local24 = local14.aClass15_Sub3_1;
			if (Static32.anInt876 != local24.anInt997 || local24.anInt1026 < Static268.anInt5236) {
				local14.method4743();
			} else if (local24.anInt1020 <= Static268.anInt5236) {
				if (local24.anInt1024 > 0) {
					@Pc(53) Class15_Sub2_Sub1 local53 = Static35.aClass15_Sub2_Sub1Array2[local24.anInt1024 - 1];
					if (local53 != null && local53.anInt5358 >= 0 && local53.anInt5358 < 13312 && local53.anInt5371 >= 0 && local53.anInt5371 < 13312) {
						local24.method755(Static268.anInt5236, local53.anInt5371, Static234.method3798(local53.anInt5371, local53.anInt5358, local24.anInt997) - local24.anInt1013, local53.anInt5358);
					}
				}
				if (local24.anInt1024 < 0) {
					@Pc(107) int local107 = -local24.anInt1024 - 1;
					@Pc(116) Class15_Sub2_Sub2 local116;
					if (Static22.anInt504 == local107) {
						local116 = Static22.aClass15_Sub2_Sub2_1;
					} else {
						local116 = Static188.aClass15_Sub2_Sub2Array41[local107];
					}
					if (local116 != null && local116.anInt5358 >= 0 && local116.anInt5358 < 13312 && local116.anInt5371 >= 0 && local116.anInt5371 < 13312) {
						local24.method755(Static268.anInt5236, local116.anInt5371, Static234.method3798(local116.anInt5371, local116.anInt5358, local24.anInt997) - local24.anInt1013, local116.anInt5358);
					}
				}
				local24.method752(Static247.anInt1733);
				Static152.method2794(Static32.anInt876, (int) local24.aDouble1, (int) local24.aDouble5, (int) local24.aDouble6, 60, local24, local24.anInt1012, -1L, false);
			}
		}
	}
}
