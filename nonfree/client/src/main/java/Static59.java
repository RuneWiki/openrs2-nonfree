import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static59 {

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "Lclient!ec;")
	public static Class4_Sub2_Sub2 aClass4_Sub2_Sub2_2;

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "Ljava/awt/Image;")
	public static Image anImage4;

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "[Lclient!da;")
	public static Class4_Sub4_Sub3_Sub1[] aClass4_Sub4_Sub3_Sub1Array4;

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "Lclient!qc;")
	private static Class60 aClass60_550 = Static121.method2047("Take");

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "Lclient!qc;")
	public static Class60 aClass60_549 = aClass60_550;

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "[Lclient!sd;")
	public static Class4_Sub4_Sub1_Sub2_Sub2[] aClass4_Sub4_Sub1_Sub2_Sub2Array1 = new Class4_Sub4_Sub1_Sub2_Sub2[2048];

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "Lclient!mf;")
	public static Class48 aClass48_37 = new Class48(64);

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "Lclient!qc;")
	public static Class60 aClass60_551 = Static121.method2047("event_opbase");

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "Lclient!qc;")
	public static Class60 aClass60_552 = Static121.method2047("sl_back");

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "Lclient!qc;")
	public static Class60 aClass60_553 = Static121.method2047(":tradereq:");

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLclient!lc;)V")
	public static void method1054(@OriginalArg(1) Class40 arg0) {
		Static39.aClass40_30 = arg0;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	public static void method1055() {
		aClass60_553 = null;
		aClass4_Sub4_Sub3_Sub1Array4 = null;
		anImage4 = null;
		aClass48_37 = null;
		aClass4_Sub2_Sub2_2 = null;
		aClass60_552 = null;
		aClass4_Sub4_Sub1_Sub2_Sub2Array1 = null;
		aClass60_551 = null;
		aClass60_549 = null;
		aClass60_550 = null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIZ)Lclient!qc;")
	public static Class60 method1056(@OriginalArg(1) int arg0) {
		return Static67.method1979(true, arg0);
	}
}
