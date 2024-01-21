import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static125 {

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "Z")
	public static boolean aBoolean121;

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "Lclient!qc;")
	private static Class60 aClass60_1172 = Static121.method2047("This computers address has been blocked");

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1170 = aClass60_1172;

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "Lclient!qc;")
	private static Class60 aClass60_1171 = Static121.method2047("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1173 = Static121.method2047("<col=ff9040>");

	@OriginalMember(owner = "client!vc", name = "s", descriptor = "Lclient!qc;")
	private static Class60 aClass60_1177 = Static121.method2047("Prepared visibility map");

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1174 = aClass60_1177;

	@OriginalMember(owner = "client!vc", name = "m", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1175 = aClass60_1171;

	@OriginalMember(owner = "client!vc", name = "n", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1176 = Static121.method2047(" x ");

	@OriginalMember(owner = "client!vc", name = "q", descriptor = "[I")
	public static int[] anIntArray330 = new int[100];

	@OriginalMember(owner = "client!vc", name = "u", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1178 = Static121.method2047("<col=ff7000>");

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
	public static void method2068() {
		aClass60_1176 = null;
		aClass60_1175 = null;
		anIntArray330 = null;
		aClass60_1171 = null;
		aClass60_1170 = null;
		aClass60_1172 = null;
		aClass60_1173 = null;
		aClass60_1177 = null;
		aClass60_1174 = null;
		aClass60_1178 = null;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!lc;IIIZII)V")
	public static void method2069(@OriginalArg(0) Class40 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		Static51.anInt1334 = arg3;
		Static48.aBoolean44 = false;
		Static82.aClass40_59 = arg0;
		Static15.anInt2965 = arg1;
		Static3.anInt31 = arg2;
		Static34.anInt895 = 2;
		Static30.anInt836 = 1;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
	public static void method2070() {
		if (Static61.aBoolean57 && Static129.anInt3003 != Static127.anInt2976) {
			Static90.method1544(Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray286[0], Static58.anInt1441, Static127.anInt2975, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray288[0], Static129.anInt3003);
		} else if (Static67.anInt2823 != Static129.anInt3003) {
			Static67.anInt2823 = Static129.anInt3003;
			Static41.method695(Static129.anInt3003);
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z[Lclient!qc;)Lclient!qc;")
	public static Class60 method2072(@OriginalArg(1) Class60[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static29.method580(arg0.length, arg0, 0);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method2074(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static54.aClass3_1);
		arg0.addMouseMotionListener(Static54.aClass3_1);
		arg0.addFocusListener(Static54.aClass3_1);
	}
}
