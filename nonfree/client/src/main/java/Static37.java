import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static37 {

	@OriginalMember(owner = "client!de", name = "N", descriptor = "Lclient!wd;")
	public static Class1_Sub7_Sub3 aClass1_Sub7_Sub3_2;

	@OriginalMember(owner = "client!de", name = "O", descriptor = "[Lclient!tj;")
	public static Class1_Sub26[] aClass1_Sub26Array1;

	@OriginalMember(owner = "client!de", name = "R", descriptor = "Lclient!r;")
	public static Class73 aClass73_1;

	@OriginalMember(owner = "client!de", name = "V", descriptor = "I")
	public static int anInt869;

	@OriginalMember(owner = "client!de", name = "C", descriptor = "Lclient!db;")
	public static Class19 aClass19_4 = new Class19();

	@OriginalMember(owner = "client!de", name = "G", descriptor = "I")
	public static int anInt862 = 1;

	@OriginalMember(owner = "client!de", name = "J", descriptor = "Z")
	public static boolean aBoolean55 = false;

	@OriginalMember(owner = "client!de", name = "M", descriptor = "Lclient!kh;")
	public static Class60 aClass60_287 = Static200.method3116(" (X");

	@OriginalMember(owner = "client!de", name = "P", descriptor = "Lclient!fe;")
	public static Class32 aClass32_1 = new Class32();

	@OriginalMember(owner = "client!de", name = "T", descriptor = "Lclient!kh;")
	public static Class60 aClass60_288 = Static200.method3116("gleiten:");

	@OriginalMember(owner = "client!de", name = "U", descriptor = "I")
	public static int anInt868 = 0;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IJ)V")
	public static void method652(@OriginalArg(1) long arg0) {
		if (arg0 != 0L) {
			Static96.aClass1_Sub9_Sub1_3.method953(58);
			Static96.aClass1_Sub9_Sub1_3.method897(arg0);
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!kh;ILclient!kh;ILclient!kh;)V")
	public static void method654(@OriginalArg(0) Class60 arg0, @OriginalArg(2) Class60 arg1, @OriginalArg(4) Class60 arg2) {
		Static135.method2255(-1, 9, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II)V")
	public static void method656(@OriginalArg(1) int arg0) {
		if (arg0 == -1 && !Static105.aBoolean134) {
			Static220.method3532();
		} else if (arg0 != -1 && (Static163.anInt3583 != arg0 || !Static161.method2694()) && Static155.anInt3456 != 0 && !Static105.aBoolean134) {
			Static202.method3128(Static106.aClass7_Sub1_19, arg0, Static155.anInt3456);
		}
		Static163.anInt3583 = arg0;
	}
}
