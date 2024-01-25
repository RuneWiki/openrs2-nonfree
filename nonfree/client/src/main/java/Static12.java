import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static12 {

	@OriginalMember(owner = "client!am", name = "b", descriptor = "Lclient!kg;")
	public static Class112 aClass112_1;

	@OriginalMember(owner = "client!am", name = "i", descriptor = "[I")
	public static int[] anIntArray25;

	@OriginalMember(owner = "client!am", name = "m", descriptor = "[Lclient!qe;")
	public static Class168[] aClass168Array1;

	@OriginalMember(owner = "client!am", name = "r", descriptor = "I")
	public static int anInt292;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "I")
	public static int anInt280 = 0;

	@OriginalMember(owner = "client!am", name = "f", descriptor = "Z")
	public static boolean aBoolean15 = false;

	@OriginalMember(owner = "client!am", name = "n", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_6 = new Class217(81, 2);

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IZI)B")
	public static byte method331(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IZIBI)V")
	public static void method332(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static241.anInt4925 == 0) {
			Static138.method2789(false);
		} else {
			Static283.anInt5521 = Static241.anInt4925;
			Static186.method3507(0);
		}
		Static219.anInt4374 = arg3;
		Static118.aBoolean189 = arg1;
		Static216.anInt4296 = arg0;
		Static269.method3042(arg2);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V")
	public static void method333() {
		if (Static111.anInt2479 != 3) {
			Static239.anInt4853 = -1;
		}
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(I)[Lclient!il;")
	public static Class93[] method334() {
		return new Class93[] { Static289.aClass93_16, Static230.aClass93_10, Static138.aClass93_12, Static62.aClass93_8, Static118.aClass93_11, Static301.aClass93_17, Static249.aClass93_2, Static306.aClass93_18, Static25.aClass93_7, Static41.aClass93_6, Static260.aClass93_14, Static270.aClass93_15, Static223.aClass93_13, Static324.aClass93_19, Static27.aClass93_5 };
	}
}
