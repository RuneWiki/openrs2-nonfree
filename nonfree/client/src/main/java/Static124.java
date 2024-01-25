import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!fr", name = "d", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_81 = new Class67(107, 3);

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)V")
	public static void method1517() {
		@Pc(5) Class77 local5 = Static85.aClass77_52;
		synchronized (Static85.aClass77_52) {
			Static85.aClass77_52.method1394();
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(ILclient!ya;)V")
	public static void method1518(@OriginalArg(0) int arg0, @OriginalArg(1) Class139 arg1) {
		Static452.aClass139Array3[arg0] = arg1;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(ZI)V")
	public static void method1519(@OriginalArg(0) boolean arg0) {
		if (Static337.aClass110_2 != null) {
			Static337.aClass110_2.method3781();
			Static337.aClass110_2 = null;
		}
		Static372.anInt5995 = 0;
		Static167.method2199();
		Static210.method5858();
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			Static385.aClass158Array1[local19].method3624();
		}
		Static327.method4302(false);
		System.gc();
		Static247.method3518();
		Static299.anInt5002 = -1;
		Static461.aBoolean648 = false;
		Static461.method5949(true);
		Static122.anInt1849 = 0;
		Static315.anInt5207 = 0;
		Static47.anInt676 = 0;
		Static1.anInt19 = 0;
		Static70.anInt4903 = 0;
		Static210.anInt7231 = 0;
		for (@Pc(64) int local64 = 0; local64 < Static13.aClass78Array1.length; local64++) {
			Static13.aClass78Array1[local64] = null;
		}
		Static286.method3790();
		for (@Pc(83) int local83 = 0; local83 < 2048; local83++) {
			Static399.aClass11_Sub1_Sub3_Sub2Array1[local83] = null;
		}
		Static137.anInt2142 = 0;
		Static46.aClass208_33.method4408();
		Static406.anInt6516 = 0;
		Static402.aClass208_37.method4408();
		Static37.method496();
		Static382.anInt4998 = 0;
		Static32.aClass4_1.method32();
		Static142.method1768();
		Static136.method1741();
		Static374.aClass1_Sub17_5 = null;
		Static116.aLong97 = 0L;
		if (arg0) {
			Static154.method1923(11);
			return;
		}
		Static154.method1923(2);
		try {
			Static466.method42("loggedout", Static259.aClass177_2.anApplet1);
		} catch (@Pc(139) Throwable local139) {
		}
	}
}
