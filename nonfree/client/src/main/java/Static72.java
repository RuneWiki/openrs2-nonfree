import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static72 {

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "Lclient!uu;")
	public static Class250 aClass250_23;

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "Lclient!uu;")
	public static Class250 aClass250_24;

	@OriginalMember(owner = "client!dk", name = "g", descriptor = "Lclient!uu;")
	public static Class250 aClass250_25;

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "Lclient!wi;")
	public static final Class268 aClass268_12 = new Class268(4);

	@OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
	public static int anInt1324 = 0;

	@OriginalMember(owner = "client!dk", name = "j", descriptor = "[F")
	public static final float[] aFloatArray6 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!dk", name = "m", descriptor = "[[B")
	public static final byte[][] aByteArrayArray5 = new byte[250][];

	@OriginalMember(owner = "client!dk", name = "n", descriptor = "[I")
	public static final int[] anIntArray69 = new int[3];

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIZ)B")
	public static byte method1299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(III)Z")
	public static boolean method1300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x70000) != 0 | Static222.method4448(arg0, arg1) || Static314.method4404(arg1, arg0);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZBI)V")
	public static void method1301(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		Static154.anInt2803 = arg1;
		Static395.anInt6596 = 3;
		Static68.method1256(Static167.aClass241_3.aString61, Static167.aClass241_3.anInt6624);
		if (arg0) {
			Static27.method494("", "");
		} else {
			Static299.method4268();
			Static27.method494(Static223.aString46, Static140.aString37);
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IILclient!dq;)I")
	public static int method1303(@OriginalArg(2) Class51 arg0) {
		return -1;
	}
}
