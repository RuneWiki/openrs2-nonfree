import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!qv", name = "j", descriptor = "I")
	public static int anInt5508;

	@OriginalMember(owner = "client!qv", name = "p", descriptor = "I")
	public static int anInt5513;

	@OriginalMember(owner = "client!qv", name = "f", descriptor = "[I")
	public static final int[] anIntArray334 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!qv", name = "g", descriptor = "[F")
	public static final float[] aFloatArray27 = new float[4];

	@OriginalMember(owner = "client!qv", name = "i", descriptor = "[S")
	public static final short[] aShortArray66 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!qv", name = "l", descriptor = "[I")
	public static final int[] anIntArray335 = new int[5];

	@OriginalMember(owner = "client!qv", name = "s", descriptor = "I")
	public static int anInt5516 = 500;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lclient!m;ILjava/awt/Canvas;BLclient!ji;)Lclient!qa;")
	public static Class128 method4301(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(4) Class124 arg3) {
		return new h(arg1, arg2, arg0, arg3);
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lclient!ji;BI)I")
	public static int method4303(@OriginalArg(0) Class124 arg0) {
		return -1;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)V")
	public static void method4304() {
		Static95.method1362();
		Static15.method239();
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIBII)V")
	public static void method4305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10;
		if (arg3 >= arg0) {
			for (local10 = arg0; local10 < arg3; local10++) {
				Static106.anIntArrayArray46[local10][arg2] = arg1;
			}
		} else {
			for (local10 = arg3; local10 < arg0; local10++) {
				Static106.anIntArrayArray46[local10][arg2] = arg1;
			}
		}
	}
}
