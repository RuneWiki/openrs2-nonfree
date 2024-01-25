import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static101 {

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "Lclient!am;")
	public static Class11 aClass11_64;

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas8;

	@OriginalMember(owner = "client!gh", name = "f", descriptor = "[[S")
	public static short[][] aShortArrayArray8;

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "[I")
	public static final int[] anIntArray280 = new int[14];

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "Lclient!ph;")
	public static final Class154 aClass154_48 = new Class154(128);

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "[Lclient!ur;")
	public static final Class2_Sub2_Sub1_Sub2[] aClass2_Sub2_Sub1_Sub2Array6 = new Class2_Sub2_Sub1_Sub2[32768];

	@OriginalMember(owner = "client!gh", name = "i", descriptor = "[Lclient!om;")
	public static final Class4_Sub1_Sub16[] aClass4_Sub1_Sub16Array8 = new Class4_Sub1_Sub16[14];

	@OriginalMember(owner = "client!gh", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString107 = "Members object";

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIII)V")
	public static void method2749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static170.anIntArrayArray37 != null) {
			Static170.anIntArrayArray37[arg0][arg1] = (arg3 & 0x7F8) << 21 | arg2 & 0xFFFFFF;
		}
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(B)V")
	public static void method2750() {
		if (Static297.aBoolean525) {
			Static297.aBoolean525 = false;
			Static333.aClass60_2 = null;
			Static115.aClass60_10 = null;
		}
	}
}
