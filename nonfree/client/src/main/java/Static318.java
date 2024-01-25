import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!ug", name = "E", descriptor = "Lclient!rk;")
	public static Class180 aClass180_6;

	@OriginalMember(owner = "client!ug", name = "J", descriptor = "I")
	public static int anInt614;

	@OriginalMember(owner = "client!ug", name = "C", descriptor = "I")
	public static int anInt611 = 0;

	@OriginalMember(owner = "client!ug", name = "G", descriptor = "[I")
	public static final int[] anIntArray84 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)V")
	public static void method468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class7_Sub1_Sub15 local13 = Static315.method5104(13, arg0);
		local13.method4790();
		local13.anInt5687 = arg1;
	}

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "(I)V")
	public static void method469() {
		Static305.aClass103_62.method2678();
		Static177.aClass103_29.method2678();
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)I")
	public static int method470(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "(B)V")
	public static void method472() {
		@Pc(3) Class152 local3 = Static239.aClass152_1;
		synchronized (Static239.aClass152_1) {
			Static116.anInt2643++;
			Static283.anInt5557 = Static72.anInt1773;
			@Pc(26) int local26;
			if (Static225.anInt4491 < 0) {
				for (local26 = 0; local26 < 112; local26++) {
					Static17.aBooleanArray24[local26] = false;
				}
				Static225.anInt4491 = Static63.anInt5456;
			} else {
				while (Static225.anInt4491 != Static63.anInt5456) {
					local26 = Static331.anIntArray795[Static63.anInt5456];
					Static63.anInt5456 = Static63.anInt5456 + 1 & 0x7F;
					if (local26 >= 0) {
						Static17.aBooleanArray24[local26] = true;
					} else {
						Static17.aBooleanArray24[~local26] = false;
					}
				}
			}
			Static72.anInt1773 = Static275.anInt5438;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!qf;IIII)V")
	public static void method473(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static138.method2797(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static346.anInt6536) {
			Static138.method2797(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static138.method2797(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static174.anInt3604) {
			Static138.method2797(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static174.anInt3604) {
			Static138.method2797(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static346.anInt6536 && arg4 <= Static174.anInt3604) {
			Static138.method2797(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static138.method2797(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static346.anInt6536 && arg4 > 0) {
			Static138.method2797(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}
}
