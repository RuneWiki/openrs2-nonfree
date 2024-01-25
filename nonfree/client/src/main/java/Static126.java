import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!ft", name = "T", descriptor = "[Lclient!ob;")
	public static Class180[] aClass180Array1;

	@OriginalMember(owner = "client!ft", name = "U", descriptor = "Lclient!lg;")
	public static Class19_Sub1 aClass19_Sub1_1;

	@OriginalMember(owner = "client!ft", name = "O", descriptor = "I")
	public static int anInt1907 = 0;

	@OriginalMember(owner = "client!ft", name = "S", descriptor = "[I")
	public static final int[] anIntArray166 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!ft", name = "h", descriptor = "(I)I")
	public static int method1558() {
		return 2;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IZ)V")
	public static void method1559(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static118.anInt1785 != -1) {
				Static364.method4777(Static118.anInt1785);
			}
			for (@Pc(17) Class1_Sub37 local17 = (Class1_Sub37) Static462.aClass208_42.method4414(); local17 != null; local17 = (Class1_Sub37) Static462.aClass208_42.method4410()) {
				if (!local17.method5956()) {
					local17 = (Class1_Sub37) Static462.aClass208_42.method4414();
					if (local17 == null) {
						break;
					}
				}
				Static393.method5106(local17, true, false);
			}
			Static118.anInt1785 = -1;
			Static462.aClass208_42 = new Class208(8);
			Static219.method3140();
			Static118.anInt1785 = Static264.anInt4592;
			Static428.method5437(false);
			Static186.method2688();
			Static198.method2835(Static118.anInt1785);
		}
		Static297.aBoolean453 = false;
		Static88.aString13 = "";
		Static99.aString14 = "";
		Static240.method3457();
		Static211.anInt5191 = -1;
		Static462.method5972(Static379.anInt122);
		Static94.aClass11_Sub1_Sub3_Sub2_1 = new Class11_Sub1_Sub3_Sub2();
		Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6428 = Static147.anInt2300 * 128 / 2;
		Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6430 = Static293.anInt4886 * 128 / 2;
		Static94.aClass11_Sub1_Sub3_Sub2_1.anIntArray246[0] = Static147.anInt2300 / 2;
		Static80.anInt1106 = 0;
		Static386.anInt7155 = 0;
		Static94.aClass11_Sub1_Sub3_Sub2_1.anIntArray247[0] = Static293.anInt4886 / 2;
		if (Static139.anInt2147 == 2) {
			Static80.anInt1106 = Static164.anInt6557 << 7;
			Static386.anInt7155 = Static409.anInt6536 << 7;
		} else {
			Static391.method5084();
		}
		Static111.method1401();
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILclient!nt;Ljava/lang/String;Z)Lclient!um;")
	public static Class253 method1562(@OriginalArg(0) int arg0, @OriginalArg(1) Class177 arg1, @OriginalArg(2) String arg2) {
		if (arg0 == 0) {
			return arg1.method3830(arg2);
		}
		@Pc(41) Class253 local41;
		if (arg0 == 1) {
			try {
				Static466.method41("openjs", new Object[] { (new URL(arg1.anApplet1.getCodeBase(), arg2)).toString() }, arg1.anApplet1);
				local41 = new Class253();
				local41.anInt6669 = 1;
				return local41;
			} catch (@Pc(47) Throwable local47) {
				local41 = new Class253();
				local41.anInt6669 = 2;
				return local41;
			}
		} else if (arg0 == 2) {
			try {
				arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg2), "_blank");
				local41 = new Class253();
				local41.anInt6669 = 1;
				return local41;
			} catch (@Pc(81) Exception local81) {
				local41 = new Class253();
				local41.anInt6669 = 2;
				return local41;
			}
		} else if (arg0 == 3) {
			try {
				Static466.method42("loggedout", arg1.anApplet1);
			} catch (@Pc(101) Throwable local101) {
			}
			try {
				arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg2), "_top");
				local41 = new Class253();
				local41.anInt6669 = 1;
				return local41;
			} catch (@Pc(123) Exception local123) {
				local41 = new Class253();
				local41.anInt6669 = 2;
				return local41;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
