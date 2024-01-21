import java.awt.Component;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
	public static int anInt3326;

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
	public static int anInt3328;

	@OriginalMember(owner = "client!qg", name = "m", descriptor = "Lclient!a;")
	public static Class1 aClass1_43;

	@OriginalMember(owner = "client!qg", name = "t", descriptor = "I")
	public static int anInt3334;

	@OriginalMember(owner = "client!qg", name = "v", descriptor = "I")
	public static int anInt3336;

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1219 = Static177.method3050("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1220 = Static177.method3050("Loading sprites )2 ");

	@OriginalMember(owner = "client!qg", name = "j", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1223 = Static177.method3050("Sorry invited players only)3");

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1221 = aClass46_1223;

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1222 = Static177.method3050("headicons_pk");

	@OriginalMember(owner = "client!qg", name = "i", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!qg", name = "k", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1224 = aClass46_1220;

	@OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
	public static int anInt3331 = 0;

	@OriginalMember(owner = "client!qg", name = "p", descriptor = "[J")
	public static final long[] aLongArray38 = new long[32];

	@OriginalMember(owner = "client!qg", name = "q", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1225 = Static177.method3050("Your account is already logged in)3");

	@OriginalMember(owner = "client!qg", name = "r", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1226 = aClass46_1225;

	@OriginalMember(owner = "client!qg", name = "s", descriptor = "I")
	public static int anInt3333 = 0;

	@OriginalMember(owner = "client!qg", name = "u", descriptor = "I")
	public static int anInt3335 = -1;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method2447(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static59.aClass32_1);
		arg0.removeMouseMotionListener(Static59.aClass32_1);
		arg0.removeFocusListener(Static59.aClass32_1);
		Static144.anInt3348 = 0;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZLclient!a;I)Lclient!jd;")
	public static Class46 method2448(@OriginalArg(1) Class1 arg0, @OriginalArg(2) int arg1) {
		if (!Static18.method328(arg1, Static102.method1954(arg0)) && arg0.anObjectArray7 == null) {
			return null;
		} else if (arg0.aClass46Array1 == null || arg1 >= arg0.aClass46Array1.length || arg0.aClass46Array1[arg1] == null || arg0.aClass46Array1[arg1].method1644().method1677() == 0) {
			return Static120.aBoolean150 ? Static69.method1482(new Class46[] { Static15.aClass46_158, Static127.method2240(arg1) }) : null;
		} else {
			return arg0.aClass46Array1[arg1];
		}
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V")
	public static void method2449() {
		while (true) {
			@Pc(9) Class11 local9 = Static166.aClass11_15;
			@Pc(16) Class4_Sub19 local16;
			synchronized (Static166.aClass11_15) {
				local16 = (Class4_Sub19) Static183.aClass11_8.method276();
			}
			if (local16 == null) {
				return;
			}
			local16.aClass62_Sub1_74.method2886(false, local16.aByteArray37, (int) local16.aLong148, local16.aClass52_2);
		}
	}
}
