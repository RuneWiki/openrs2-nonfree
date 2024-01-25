import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "Lclient!l;")
	public static Class57 aClass57_20;

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "[S")
	public static short[] aShortArray179;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "[I")
	public static final int[] anIntArray353 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "Z")
	public static boolean aBoolean481 = false;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "[I")
	public static final int[] anIntArray354 = new int[13];

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
	public static int anInt5328 = -1;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZ)V")
	public static void method4087(@OriginalArg(1) boolean arg0) {
		Static159.method2701();
		if (Static403.anInt6667 != 30 && Static403.anInt6667 != 25) {
			return;
		}
		Static162.anInt6744++;
		if (Static162.anInt6744 < 50 && !arg0) {
			return;
		}
		Static162.anInt6744 = 0;
		if (!Static22.aBoolean38 && Static125.aClass11_5 != null) {
			Static429.method5476(Static14.aClass215_2);
			try {
				Static125.aClass11_5.method142(Static3.aClass4_Sub12_Sub1_5.anInt2997, Static3.aClass4_Sub12_Sub1_5.aByteArray36);
				Static3.aClass4_Sub12_Sub1_5.anInt2997 = 0;
			} catch (@Pc(56) IOException local56) {
				Static22.aBoolean38 = true;
			}
		}
		Static159.method2701();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)Z")
	public static boolean method4088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static7.anInt5461; local1++) {
			@Pc(6) Class136 local6 = Static414.aClass136Array3[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt4366 == 1) {
				local15 = local6.anInt4355 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt4359 + (local6.anInt4352 * local15 >> 8);
					local37 = local6.anInt4356 + (local6.anInt4369 * local15 >> 8);
					local47 = local6.anInt4368 + (local6.anInt4367 * local15 >> 8);
					local57 = local6.anInt4361 + (local6.anInt4362 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4366 == 2) {
				local15 = arg0 - local6.anInt4355;
				if (local15 > 0) {
					local27 = local6.anInt4359 + (local6.anInt4352 * local15 >> 8);
					local37 = local6.anInt4356 + (local6.anInt4369 * local15 >> 8);
					local47 = local6.anInt4368 + (local6.anInt4367 * local15 >> 8);
					local57 = local6.anInt4361 + (local6.anInt4362 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4366 == 3) {
				local15 = local6.anInt4359 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt4355 + (local6.anInt4353 * local15 >> 8);
					local37 = local6.anInt4370 + (local6.anInt4358 * local15 >> 8);
					local47 = local6.anInt4368 + (local6.anInt4367 * local15 >> 8);
					local57 = local6.anInt4361 + (local6.anInt4362 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4366 == 4) {
				local15 = arg2 - local6.anInt4359;
				if (local15 > 0) {
					local27 = local6.anInt4355 + (local6.anInt4353 * local15 >> 8);
					local37 = local6.anInt4370 + (local6.anInt4358 * local15 >> 8);
					local47 = local6.anInt4368 + (local6.anInt4367 * local15 >> 8);
					local57 = local6.anInt4361 + (local6.anInt4362 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4366 == 5) {
				local15 = arg1 - local6.anInt4368;
				if (local15 > 0) {
					local27 = local6.anInt4355 + (local6.anInt4353 * local15 >> 8);
					local37 = local6.anInt4370 + (local6.anInt4358 * local15 >> 8);
					local47 = local6.anInt4359 + (local6.anInt4352 * local15 >> 8);
					local57 = local6.anInt4356 + (local6.anInt4369 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(III)Z")
	public static boolean method4090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static92.method1613(arg0, arg1) & Static399.method5172(arg1, arg0);
	}
}
