import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "Lclient!mn;")
	public static Class115 aClass115_13;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "[I")
	public static int[] anIntArray344;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "Lclient!jd;")
	public static Class84 aClass84_84;

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "Ljava/awt/Image;")
	public static Image anImage4;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "F")
	public static float aFloat41 = 128.0F;

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString207 = "Loaded fonts";

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "[Z")
	public static boolean[] aBooleanArray19 = new boolean[5];

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)I")
	public static int method3356() {
		return Static185.anInt3926;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)I")
	public static int method3357() {
		return ((Static144.anInt3122 == 0 ? 0 : 1) << 22) + ((Static102.aBoolean176 ? 1 : 0) << 16) + ((Static56.aBoolean96 ? 1 : 0) << 13) + ((Static195.anInt4041 & 0x3) << 11) + ((Static96.aBoolean166 ? 1 : 0) << 9) + ((Static242.aBoolean414 ? 1 : 0) << 8) + ((Static150.aBoolean262 ? 1 : 0) << 7) + ((Static126.aBoolean211 ? 1 : 0) << 6) + (Static105.anInt2269 & 0x7) + ((Static124.aBoolean208 ? 1 : 0) << 3) + ((Static43.aBoolean77 ? 1 : 0) << 4) + (Static171.anInt3648 << 17) - (-((Static106.aBoolean183 ? 1 : 0) << 5) + -((Static284.aBoolean475 ? 1 : 0) << 10) + -((Static233.aBoolean407 ? 1 : 0) << 15)) + ((Static183.aBoolean332 ? 1 : 0) << 19) + ((Static214.anInt4468 == 0 ? 0 : 1) << 20) + ((Static91.anInt2030 == 0 ? 0 : 1) << 21) + (Static179.method3104() << 23);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIII)V")
	public static void method3358(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 0) {
			Static95.aClass2_Sub26_Sub1_1.method4287(71);
			Static95.aClass2_Sub26_Sub1_1.method4239(5);
		}
		if (arg0 == 1) {
			Static95.aClass2_Sub26_Sub1_1.method4287(245);
			Static95.aClass2_Sub26_Sub1_1.method4239(19);
		}
		Static95.aClass2_Sub26_Sub1_1.method4271(arg1 + Static203.anInt4236);
		Static95.aClass2_Sub26_Sub1_1.method4213(Static79.aBooleanArray8[82] ? 1 : 0);
		Static95.aClass2_Sub26_Sub1_1.method4271(arg2 + Static125.anInt5772);
		Static197.anInt4129 = arg2;
		Static110.anInt2372 = arg1;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IBI)I")
	public static int method3359(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(46) int local46 = Static21.method455(arg1 - 1, arg0 - 1) + Static21.method455(arg1 - 1, arg0 + 1) + Static21.method455(arg1 + 1, arg0 + -1) + Static21.method455(arg1 + 1, arg0 - -1);
		@Pc(76) int local76 = Static21.method455(arg1, arg0 - 1) + Static21.method455(arg1, arg0 + 1) + Static21.method455(arg1 - 1, arg0) + Static21.method455(arg1 - -1, arg0);
		@Pc(81) int local81 = Static21.method455(arg1, arg0);
		return local81 / 4 + local76 / 8 + local46 / 16;
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)V")
	public static void method3361() {
		for (@Pc(10) Class2_Sub4 local10 = (Class2_Sub4) Static104.aClass1_10.method13(); local10 != null; local10 = (Class2_Sub4) Static104.aClass1_10.method9()) {
			if (local10.anInt396 == -1) {
				local10.anInt391 = 0;
				Static2.method4761(local10);
			} else {
				local10.method4926();
			}
		}
	}
}
