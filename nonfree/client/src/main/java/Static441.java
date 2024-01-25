import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "I")
	public static int anInt7698;

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "Lclient!uda;")
	public static final Class325 aClass325_7 = new Class325();

	@OriginalMember(owner = "client!qr", name = "g", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_181 = new Class81(28, 6);

	@OriginalMember(owner = "client!qr", name = "o", descriptor = "I")
	public static final int anInt7701 = 50;

	@OriginalMember(owner = "client!qr", name = "h", descriptor = "[I")
	public static final int[] anIntArray508 = new int[anInt7701];

	@OriginalMember(owner = "client!qr", name = "i", descriptor = "[I")
	public static final int[] anIntArray509 = new int[anInt7701];

	@OriginalMember(owner = "client!qr", name = "j", descriptor = "[I")
	public static final int[] anIntArray510 = new int[anInt7701];

	@OriginalMember(owner = "client!qr", name = "k", descriptor = "[I")
	public static final int[] anIntArray511 = new int[anInt7701];

	@OriginalMember(owner = "client!qr", name = "l", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray30 = new String[anInt7701];

	@OriginalMember(owner = "client!qr", name = "m", descriptor = "[I")
	public static final int[] anIntArray512 = new int[anInt7701];

	@OriginalMember(owner = "client!qr", name = "n", descriptor = "[I")
	public static final int[] anIntArray513 = new int[anInt7701];

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(BI)V")
	public static void method6334(@OriginalArg(1) int arg0) {
		if (!Static479.aClass1_Sub7_Sub1_1.aBoolean236) {
			arg0 = -1;
		}
		if (Static573.anInt9326 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(31) Class156 local31 = Static470.aClass352_2.method7717(arg0);
			@Pc(35) Class318 local35 = local31.method3679();
			if (local35 == null) {
				arg0 = -1;
			} else {
				Static246.aClass114_10.method2506(new Point(local31.anInt4285, local31.anInt4278), local35.method7070(), Static26.aCanvas3, local35.method7063(), local35.method7075());
				Static573.anInt9326 = arg0;
			}
		}
		if (arg0 == -1 && Static573.anInt9326 != -1) {
			Static246.aClass114_10.method2506(new Point(), -1, Static26.aCanvas3, -1, null);
			Static573.anInt9326 = -1;
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lclient!he;II)V")
	public static void method6335(@OriginalArg(0) Class20_Sub2_Sub4_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = 0;
		if (arg0.anInt6429 > Static81.anInt1910) {
			Static540.method7337(arg0);
		} else if (Static81.anInt1910 > arg0.anInt6387) {
			Static412.method5787(arg0, false);
			local13 = Static312.anInt5628;
			local11 = Static569.anInt9286;
		} else {
			Static196.method5898(arg0);
		}
		if (arg0.anInt8796 < 512 || arg0.anInt8795 < 512 || Static500.anInt6888 * 512 - 512 <= arg0.anInt8796 || arg0.anInt8795 >= Static573.anInt9325 * 512 - 512) {
			arg0.anInt6429 = 0;
			arg0.anInt6438 = -1;
			arg0.anIntArray429 = null;
			local11 = -1;
			arg0.anInt6387 = 0;
			arg0.anInt6452 = -1;
			arg0.anInt6416 = -1;
			local13 = 0;
			arg0.anInt8796 = arg0.anIntArray437[0] * 512 + arg0.method5349() * 256;
			arg0.anInt8795 = arg0.anIntArray436[0] * 512 + arg0.method5349() * 256;
			arg0.method5352();
		}
		if (arg0 == Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2 && (arg0.anInt8796 < 6144 || arg0.anInt8795 < 6144 || arg0.anInt8796 >= Static500.anInt6888 * 512 - 6144 || (Static573.anInt9325 - 12) * 512 <= arg0.anInt8795)) {
			arg0.anInt6452 = -1;
			arg0.anInt6416 = -1;
			arg0.anInt6438 = -1;
			local11 = -1;
			arg0.anInt6387 = 0;
			arg0.anInt6429 = 0;
			local13 = 0;
			arg0.anIntArray429 = null;
			arg0.anInt8796 = arg0.anIntArray437[0] * 512 + arg0.method5349() * 256;
			arg0.anInt8795 = arg0.anIntArray436[0] * 512 + arg0.method5349() * 256;
			arg0.method5352();
		}
		@Pc(220) int local220 = Static518.method7098(arg0);
		Static167.method2561(local13, local220, arg0, local11);
		Static50.method1157(arg0, local11);
		Static279.method4313(arg0);
	}
}
