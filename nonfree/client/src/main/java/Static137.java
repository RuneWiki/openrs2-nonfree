import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "Lclient!lc;")
	public static Class98 aClass98_82;

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "Lclient!lc;")
	public static Class98 aClass98_83;

	@OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
	public static int anInt2811;

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
	public static int anInt2812;

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString89 = "green:";

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
	public static int anInt2809 = 0;

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "[I")
	public static int[] anIntArray252 = new int[128];

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "Lclient!dh;")
	public static Class33 aClass33_22 = new Class33(64);

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)V")
	public static void method2182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class4_Sub2_Sub21 local10 = Static39.method4121(arg0, 12);
		local10.method4360();
		local10.anInt5492 = arg1;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
	public static void method2183() {
		aString89 = null;
		aClass98_83 = null;
		aClass98_82 = null;
		anIntArray252 = null;
		aClass33_22 = null;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(JI)V")
	public static void method2185(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < Static231.anInt4525; local19++) {
			if (arg0 == Static153.aLongArray7[local19]) {
				Static231.anInt4525--;
				for (@Pc(38) int local38 = local19; local38 < Static231.anInt4525; local38++) {
					Static196.aStringArray31[local38] = Static196.aStringArray31[local38 + 1];
					Static131.anIntArray247[local38] = Static131.anIntArray247[local38 + 1];
					Static175.aStringArray28[local38] = Static175.aStringArray28[local38 + 1];
					Static153.aLongArray7[local38] = Static153.aLongArray7[local38 + 1];
					Static266.anIntArray447[local38] = Static266.anIntArray447[local38 + 1];
					Static176.aBooleanArray10[local38] = Static176.aBooleanArray10[local38 + 1];
				}
				Static233.anInt4542 = Static177.anInt3485;
				Static142.aClass4_Sub17_Sub1_3.method1905(132);
				Static142.aClass4_Sub17_Sub1_3.method1891(arg0);
				break;
			}
		}
	}
}
