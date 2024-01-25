import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!p", name = "b", descriptor = "Lclient!rk;")
	public static Class180 aClass180_60;

	@OriginalMember(owner = "client!p", name = "w", descriptor = "Lclient!rk;")
	public static Class180 aClass180_61;

	@OriginalMember(owner = "client!p", name = "m", descriptor = "I")
	public static int anInt4724 = 0;

	@OriginalMember(owner = "client!p", name = "p", descriptor = "Lclient!oi;")
	public static Class152 aClass152_1 = new Class152();

	@OriginalMember(owner = "client!p", name = "t", descriptor = "I")
	public static int anInt4730 = 0;

	@OriginalMember(owner = "client!p", name = "y", descriptor = "Lclient!ik;")
	public static final Class103 aClass103_46 = new Class103(64);

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(B)Lclient!pr;")
	public static Class45 method4104() {
		try {
			return (Class45) Class.forName("Class45_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BI)V")
	public static void method4107(@OriginalArg(1) int arg0) {
		Static314.anIntArray757 = new int[Static325.anInt6173];
		Static343.aByteArrayArrayArray13 = new byte[arg0][Static15.anInt287][Static325.anInt6173];
		Static227.aByteArrayArrayArray12 = new byte[arg0][Static15.anInt287][Static325.anInt6173];
		Static222.aByteArrayArrayArray10 = null;
		Static210.anIntArray575 = new int[5];
		Static349.anIntArray837 = new int[Static325.anInt6173];
		Static353.aByteArrayArrayArray5 = new byte[arg0][Static15.anInt287][Static325.anInt6173];
		Static343.aByteArrayArrayArray14 = new byte[arg0][Static15.anInt287][Static325.anInt6173];
		Static79.anIntArray283 = new int[Static325.anInt6173];
		Static23.anIntArrayArrayArray15 = new int[arg0][Static15.anInt287 + 1][Static325.anInt6173 + 1];
		Static343.anIntArray830 = new int[Static325.anInt6173];
		Static220.aByteArrayArrayArray9 = new byte[arg0][Static15.anInt287 + 1][Static325.anInt6173 + 1];
		Static45.anInt1289 = 99;
		Static144.anIntArray410 = new int[Static325.anInt6173];
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4108(@OriginalArg(1) String arg0) {
		if (Static275.aClass115Array1 != null) {
			Static29.aClass7_Sub3_Sub2_1.method2799(71);
			Static29.aClass7_Sub3_Sub2_1.method2735(Static344.method5559(arg0));
			Static29.aClass7_Sub3_Sub2_1.method2738(arg0);
		}
	}
}
