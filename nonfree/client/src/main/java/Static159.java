import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!fg", name = "l", descriptor = "F")
	public static float aFloat66;

	@OriginalMember(owner = "client!fg", name = "s", descriptor = "I")
	public static int anInt3316;

	@OriginalMember(owner = "client!fg", name = "q", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_49 = new Class322(46, 3);

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(ZI)V")
	public static void method3128(@OriginalArg(0) boolean arg0) {
		if (arg0 && Static627.aClass6_Sub2_Sub9_2 != null) {
			Static352.anInt5985 = Static627.aClass6_Sub2_Sub9_2.anInt4780;
		} else {
			Static352.anInt5985 = -1;
		}
		Static627.aClass6_Sub2_Sub9_2 = null;
		Static527.aClass340_67 = null;
		Static98.anInt1457 = 0;
		Static88.aClass381_2 = null;
		Static627.method6479();
		Static627.aClass340_57.method8129();
		Static471.aClass259_8 = null;
		Static446.aClass259_6 = null;
		Static383.aClass259_4 = null;
		Static393.aClass259_5 = null;
		Static499.anInt8390 = -1;
		Static51.anInt617 = -1;
		Static53.aClass259_1 = null;
		Static627.aClass176_3 = null;
		Static70.aClass259_2 = null;
		Static462.aClass259_7 = null;
		Static158.aClass49_8 = null;
		Static292.aClass259_3 = null;
		if (Static627.aClass190_5 != null) {
			Static627.aClass190_5.method4693();
			Static627.aClass190_5.method4690(64, 128);
		}
		if (Static627.aClass306_4 != null) {
			Static627.aClass306_4.method7369(64, 64);
		}
		if (Static627.aClass163_4 != null) {
			Static627.aClass163_4.method4126(64);
		}
		Static61.aClass335_1.method7987(64);
	}

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "(I)Lclient!mh;")
	public static Class29 method3130() {
		try {
			return new Class29_Sub3();
		} catch (@Pc(16) Throwable local16) {
			try {
				return (Class29) Class.forName("ce").getDeclaredConstructor().newInstance();
			} catch (@Pc(24) Throwable local24) {
				return new Class29_Sub1();
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIZ)V")
	public static void method3133(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			@Pc(15) Class6_Sub13 local15 = Static30.method353(Class140.aClass241_51, Static525.aClass260_4.aClass270_2);
			local15.aClass6_Sub15_Sub1_1.method3040(arg0);
			Static525.aClass260_4.method6404(local15);
		} else {
			Static301.method4845(Static429.aClass275_13, arg0, -1);
		}
	}
}
