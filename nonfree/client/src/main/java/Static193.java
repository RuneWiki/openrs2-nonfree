import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!iba", name = "z", descriptor = "[S")
	public static short[] aShortArray71;

	@OriginalMember(owner = "client!iba", name = "D", descriptor = "Lclient!bl;")
	public static Class32 aClass32_2;

	@OriginalMember(owner = "client!iba", name = "E", descriptor = "Lclient!mv;")
	public static Class103 aClass103_2;

	@OriginalMember(owner = "client!iba", name = "x", descriptor = "I")
	public static int anInt3949 = -1;

	@OriginalMember(owner = "client!iba", name = "F", descriptor = "[Lclient!sba;")
	public static final Class1_Sub2_Sub17[] aClass1_Sub2_Sub17Array2 = new Class1_Sub2_Sub17[14];

	@OriginalMember(owner = "client!iba", name = "H", descriptor = "I")
	public static int anInt3953 = 0;

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(IIZ)V")
	public static void method3688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static313.anInt5997 = arg1 - Static335.anInt4935;
		Static162.anInt3142 = arg0 - Static335.anInt4941;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILclient!vp;)I")
	public static int method3691(@OriginalArg(1) Class308 arg0) {
		if (arg0 == Static517.aClass308_12) {
			return 5120;
		} else if (arg0 == Static517.aClass308_13) {
			return 5122;
		} else if (Static517.aClass308_14 == arg0) {
			return 5124;
		} else if (arg0 == Static517.aClass308_15) {
			return 5121;
		} else if (arg0 == Static517.aClass308_16) {
			return 5123;
		} else if (arg0 == Static517.aClass308_17) {
			return 5125;
		} else if (Static517.aClass308_18 == arg0) {
			return 5131;
		} else if (Static517.aClass308_19 == arg0) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(IIIII)V")
	public static void method3693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static260.anInt5066; local3++) {
			@Pc(9) Rectangle local9 = Class194.aRectangleArray2[local3];
			if (arg3 < local9.x + local9.width && local9.x < arg2 + arg3 && local9.y + local9.height > arg1 && arg0 + arg1 > local9.y) {
				Static258.aBooleanArray17[local3] = true;
			}
		}
	}
}
