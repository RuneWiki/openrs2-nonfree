import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
	public static int anInt3522;

	@OriginalMember(owner = "client!kd", name = "E", descriptor = "Lclient!ft;")
	public static Class88 aClass88_31;

	@OriginalMember(owner = "client!kd", name = "D", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_57 = new Class186(27, 12);

	@OriginalMember(owner = "client!kd", name = "F", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_51 = new Class25(17, -1);

	@OriginalMember(owner = "client!kd", name = "H", descriptor = "I")
	public static int anInt3527 = 0;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIII)V")
	public static void method3165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static299.anInt4962; local3++) {
			@Pc(9) Rectangle local9 = Class121.aRectangleArray2[local3];
			if (local9.x + local9.width > arg1 && local9.x < arg3 + arg1 && arg2 < local9.y + local9.height && local9.y < arg2 + arg0) {
				Static298.aBooleanArray21[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)Lclient!ll;")
	public static Class152 method3167(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static36.aFloat47 == 3.0D) {
				return Static125.aClass152_5;
			}
			if ((double) Static36.aFloat47 == 4.0D) {
				return Static393.aClass152_9;
			}
			if ((double) Static36.aFloat47 == 6.0D) {
				return Static165.aClass152_6;
			}
			if ((double) Static36.aFloat47 >= 8.0D) {
				return Static343.aClass152_11;
			}
		} else if (arg0 == 1) {
			if ((double) Static36.aFloat47 == 3.0D) {
				return Static165.aClass152_6;
			}
			if ((double) Static36.aFloat47 == 4.0D) {
				return Static343.aClass152_11;
			}
			if ((double) Static36.aFloat47 == 6.0D) {
				return Static336.aClass152_10;
			}
			if ((double) Static36.aFloat47 >= 8.0D) {
				return Static178.aClass152_2;
			}
		} else if (arg0 == 2) {
			if ((double) Static36.aFloat47 == 3.0D) {
				return Static336.aClass152_10;
			}
			if ((double) Static36.aFloat47 == 4.0D) {
				return Static178.aClass152_2;
			}
			if ((double) Static36.aFloat47 == 6.0D) {
				return Static321.aClass152_8;
			}
			if ((double) Static36.aFloat47 >= 8.0D) {
				return Static207.aClass152_7;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)V")
	public static void method3168(@OriginalArg(1) int arg0) {
		Static71.anInt1487 = 3;
		Static119.anInt2070 = 100;
		Static18.anInt316 = -1;
		Static26.anInt2329 = arg0;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!ha;IZ)V")
	public static void method3171(@OriginalArg(0) Class6_Sub15 arg0, @OriginalArg(1) int arg1) {
		if (Static182.aClass155_5 == null) {
			return;
		}
		try {
			Static182.aClass155_5.method3607(0L);
			Static182.aClass155_5.method3598(24, arg0.aByteArray51, arg1);
		} catch (@Pc(14) Exception local14) {
		}
	}
}
