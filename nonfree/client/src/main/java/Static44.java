import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "Lclient!ec;")
	public static Class22 aClass22_297 = Static60.method1113("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "Lclient!ec;")
	private static Class22 aClass22_298 = Static60.method1113("Login server offline)3");

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "[Lclient!ka;")
	public static Class4_Sub1_Sub3_Sub2_Sub1[] aClass4_Sub1_Sub3_Sub2_Sub1Array1 = new Class4_Sub1_Sub3_Sub2_Sub1[2048];

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "Lclient!ec;")
	public static Class22 aClass22_299 = aClass22_298;

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
	public static int anInt1212 = 0;

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "Lclient!ec;")
	public static Class22 aClass22_300 = Static60.method1113("cross");

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "Lclient!ec;")
	public static Class22 aClass22_301 = Static60.method1113("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "Lclient!ec;")
	private static Class22 aClass22_302 = Static60.method1113("Loaded title screen");

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "Lclient!ec;")
	public static Class22 aClass22_303 = aClass22_302;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "([Lclient!ec;B)Lclient!ec;")
	public static Class22 method856(@OriginalArg(0) Class22[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static70.method1175(arg0, arg0.length, 0);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method857(@OriginalArg(0) Component arg0) {
		@Pc(9) Method local9 = Static21.aMethod1;
		if (local9 != null) {
			try {
				local9.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(23) Throwable local23) {
			}
		}
		arg0.addKeyListener(Static33.aClass44_1);
		arg0.addFocusListener(Static33.aClass44_1);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
	public static void method858() {
		aClass22_299 = null;
		aClass22_301 = null;
		aClass22_297 = null;
		aClass22_302 = null;
		aClass22_300 = null;
		aClass22_298 = null;
		aClass22_303 = null;
		aClass4_Sub1_Sub3_Sub2_Sub1Array1 = null;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!ga;I)V")
	public static void method859(@OriginalArg(0) int arg0, @OriginalArg(1) Class20_Sub1 arg1) {
		if (Static99.aClass4_Sub11_3 == null) {
			Static105.method1729(true, (byte) 0, 255, 255, null, 0);
			Static73.aClass20_Sub1Array1[arg0] = arg1;
		} else {
			Static99.aClass4_Sub11_3.anInt1099 = arg0 * 8 + 5;
			@Pc(23) int local23 = Static99.aClass4_Sub11_3.method725();
			@Pc(27) int local27 = Static99.aClass4_Sub11_3.method725();
			arg1.method614(local27, local23);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)I")
	public static int method860(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) Class4_Sub19 local6 = (Class4_Sub19) Static30.aClass81_4.method2010((long) arg0);
		if (local6 == null) {
			return 0;
		} else if (arg1 >= 0 && local6.anIntArray272.length > arg1) {
			return local6.anIntArray272[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)J")
	public static synchronized long method861() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (local5 < Static61.aLong52) {
			Static80.aLong69 += Static61.aLong52 - local5;
		}
		Static61.aLong52 = local5;
		return Static80.aLong69 + local5;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!ea;I)Lclient!hb;")
	public static Class4_Sub1_Sub2_Sub3 method862(@OriginalArg(1) Class20 arg0, @OriginalArg(2) int arg1) {
		return Static41.method754(arg0, arg1) ? Static78.method1299() : null;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLclient!ea;)V")
	public static void method863(@OriginalArg(1) Class20 arg0) {
		Static75.aClass20_36 = arg0;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
	public static void method864() {
		Static3.aClass33_2.method1003();
	}
}
