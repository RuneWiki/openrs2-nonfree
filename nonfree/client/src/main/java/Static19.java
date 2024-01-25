import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "[I")
	public static int[] anIntArray18;

	@OriginalMember(owner = "client!ba", name = "D", descriptor = "[Lclient!cq;")
	public static Class8[] aClass8Array1;

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "Lclient!cr;")
	public static final Class37 aClass37_9 = new Class37(256);

	@OriginalMember(owner = "client!ba", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString13 = "Loading...";

	@OriginalMember(owner = "client!ba", name = "z", descriptor = "[Z")
	public static final boolean[] aBooleanArray1 = new boolean[100];

	@OriginalMember(owner = "client!ba", name = "E", descriptor = "I")
	public static int anInt384 = 0;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIBI)V")
	public static void method326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			Static305.aClass1_Sub21_Sub2_3.method5757(223);
		}
		if (arg2 == 1) {
			Static305.aClass1_Sub21_Sub2_3.method5757(69);
		}
		Static305.aClass1_Sub21_Sub2_3.method5698(arg1 + Static92.anInt1755);
		Static305.aClass1_Sub21_Sub2_3.method5718(Static112.aBooleanArray11[82] ? 1 : 0);
		Static305.aClass1_Sub21_Sub2_3.method5751(arg0 + Static98.anInt1911);
		Static324.aBoolean528 = false;
		Static14.anInt229 = arg0;
		Static307.anInt6146 = arg1;
		Static39.method793();
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
	public static void method327() {
		Static24.method404(Static235.aCanvas6);
		Static158.method2805(Static235.aCanvas6);
		if (Static212.aClass24_1 != null) {
			Static212.aClass24_1.method439(Static235.aCanvas6);
		}
		Static71.aClient1.method831();
		Static235.aCanvas6.setBackground(Color.black);
		Static174.anInt5777 = -1;
		Static326.method4952(Static235.aCanvas6);
		Static71.method1255(Static235.aCanvas6);
		if (Static212.aClass24_1 != null) {
			Static212.aClass24_1.method444(Static235.aCanvas6);
		}
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
	public static void method331() {
		if (Static112.aClass220_1 != null) {
			@Pc(15) Class220 local15 = Static112.aClass220_1;
			synchronized (Static112.aClass220_1) {
				Static112.aClass220_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)V")
	public static void method334(@OriginalArg(1) int arg0) {
		if (!Static274.method4904(arg0)) {
			return;
		}
		@Pc(14) Class163[] local14 = Static313.aClass163ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(27) Class163 local27 = local14[local16];
			if (local27 != null) {
				local27.anInt4950 = 1;
				local27.anInt4922 = 0;
				local27.anInt4965 = 0;
			}
		}
	}
}
