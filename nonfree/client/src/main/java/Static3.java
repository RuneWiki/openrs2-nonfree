import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static3 {

	@OriginalMember(owner = "client!ad", name = "p", descriptor = "[I")
	public static final int[] anIntArray80 = new int[1024];

	@OriginalMember(owner = "client!ad", name = "eb", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_6 = new Class67(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 200.", null, null);

	@OriginalMember(owner = "client!ad", name = "jc", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray3 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!ad", name = "vd", descriptor = "Z")
	public static boolean aBoolean14 = false;

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(B)V")
	public static void method402() {
		Static430.aClass267_45.method6648();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!rt;I)Lclient!uba;")
	public static Class30_Sub4 method415(@OriginalArg(0) Class3_Sub27 arg0) {
		return new Class30_Sub4(arg0.method7604(), arg0.method7604(), arg0.method7604(), arg0.method7604(), arg0.method7604(), arg0.method7604(), arg0.method7604(), arg0.method7604(), arg0.method7551(), arg0.method7548());
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(IIIII)V")
	public static void method443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static515.aClass3_Sub27_Sub1_2.anInt9191 = 0;
		Static515.aClass3_Sub27_Sub1_2.method7576(Static538.aClass42_7.anInt1132);
		Static515.aClass3_Sub27_Sub1_2.method7576(arg0);
		Static515.aClass3_Sub27_Sub1_2.method7576(arg3);
		Static515.aClass3_Sub27_Sub1_2.method7600(arg2, 30364);
		Static515.aClass3_Sub27_Sub1_2.method7600(arg1, 30364);
		Static138.anInt2797 = 0;
		Static496.anInt8742 = 1;
		Static490.anInt8722 = 0;
		Static417.anInt7805 = -3;
	}
}
