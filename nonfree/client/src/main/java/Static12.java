import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
	public static int anInt346;

	@OriginalMember(owner = "client!ba", name = "k", descriptor = "[[B")
	public static byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!ba", name = "m", descriptor = "Lclient!kh;")
	public static Class60 aClass60_99 = Static200.method3116("");

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "Lclient!kh;")
	public static Class60 aClass60_94 = aClass60_99;

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "Lclient!kh;")
	public static Class60 aClass60_95 = aClass60_99;

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "Lclient!kh;")
	public static Class60 aClass60_96 = aClass60_99;

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "Lclient!kh;")
	public static Class60 aClass60_97 = aClass60_99;

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "Lclient!kh;")
	public static Class60 aClass60_98 = aClass60_99;

	@OriginalMember(owner = "client!ba", name = "n", descriptor = "Lclient!kh;")
	public static Class60 aClass60_100 = Static200.method3116("<col=ffff00>");

	@OriginalMember(owner = "client!ba", name = "o", descriptor = "Lclient!kh;")
	public static Class60 aClass60_101 = Static200.method3116("<img=1>");

	@OriginalMember(owner = "client!ba", name = "p", descriptor = "Lclient!kh;")
	public static Class60 aClass60_102 = Static200.method3116("Fps:");

	@OriginalMember(owner = "client!ba", name = "q", descriptor = "Lclient!kh;")
	private static Class60 aClass60_103 = Static200.method3116("Loaded config");

	@OriginalMember(owner = "client!ba", name = "u", descriptor = "Lclient!kh;")
	public static Class60 aClass60_104 = aClass60_99;

	@OriginalMember(owner = "client!ba", name = "v", descriptor = "Lclient!kh;")
	public static Class60 aClass60_105 = aClass60_103;

	@OriginalMember(owner = "client!ba", name = "y", descriptor = "Lclient!kh;")
	public static Class60 aClass60_106 = Static200.method3116("::rect_debug");

	@OriginalMember(owner = "client!ba", name = "z", descriptor = "I")
	public static int anInt352 = 0;

	@OriginalMember(owner = "client!ba", name = "C", descriptor = "Lclient!kh;")
	private static Class60 aClass60_108 = Static200.method3116("Password: ");

	@OriginalMember(owner = "client!ba", name = "A", descriptor = "Lclient!kh;")
	public static Class60 aClass60_107 = aClass60_108;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!vb;I)V")
	public static void method225(@OriginalArg(0) int arg0, @OriginalArg(1) Class7_Sub1 arg1) {
		if (Static38.aClass1_Sub9_2 == null) {
			Static107.method1856(0, 255, true, 255, (byte) 0, null);
			Static157.aClass7_Sub1Array1[arg0] = arg1;
		} else {
			Static38.aClass1_Sub9_2.anInt1192 = arg0 * 8 + 5;
			@Pc(24) int local24 = Static38.aClass1_Sub9_2.method915();
			@Pc(28) int local28 = Static38.aClass1_Sub9_2.method915();
			arg1.method3257(local24, local28);
		}
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
	public static void method226() {
		while (true) {
			@Pc(10) Class19 local10 = Static51.aClass19_8;
			@Pc(17) Class1_Sub24 local17;
			synchronized (Static51.aClass19_8) {
				local17 = (Class1_Sub24) Static102.aClass19_9.method621();
			}
			if (local17 == null) {
				return;
			}
			local17.aClass7_Sub1_26.method3252(false, local17.aByteArray47, (int) local17.aLong150, local17.aClass90_2);
		}
	}
}
