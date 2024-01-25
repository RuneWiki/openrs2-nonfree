import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static544 {

	@OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
	public static int anInt9196;

	@OriginalMember(owner = "client!vj", name = "q", descriptor = "Lclient!ek;")
	public static Class85 aClass85_8;

	@OriginalMember(owner = "client!vj", name = "w", descriptor = "I")
	public static int anInt9204;

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger7 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
	public static int anInt9197 = -1;

	@OriginalMember(owner = "client!vj", name = "r", descriptor = "I")
	public static int anInt9202 = 0;

	@OriginalMember(owner = "client!vj", name = "u", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_188 = new Class40(83, 8);

	@OriginalMember(owner = "client!vj", name = "v", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_120 = new Class160(4, 1);

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IZ)V")
	public static void method7513(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static349.aClass6_Sub1_Sub9_3 != null) {
			Static25.anInt475 = Static349.aClass6_Sub1_Sub9_3.anInt3232;
		} else {
			Static25.anInt475 = -1;
		}
		Static553.aClass275_194 = null;
		Static142.anInt2546 = 0;
		Static157.aClass97_5 = null;
		Static349.aClass6_Sub1_Sub9_3 = null;
		Static349.method6176();
		Static349.aClass275_155.method6357();
		Static169.aClass85_3 = null;
		Static402.aClass85_7 = null;
		Static173.aClass85_4 = null;
		Static230.anInt3922 = -1;
		aClass85_8 = null;
		Static331.anInt6297 = -1;
		Static43.aClass85_2 = null;
		Static510.aClass4_33 = null;
		Static349.aClass252_5 = null;
		Static334.aClass85_6 = null;
		Static199.aClass85_5 = null;
		Static40.aClass85_1 = null;
		if (Static349.aClass276_3 != null) {
			Static349.aClass276_3.method6399();
			Static349.aClass276_3.method6397(128, 64);
		}
		if (Static349.aClass245_4 != null) {
			Static349.aClass245_4.method5766(64, 64);
		}
		if (Static349.aClass100_3 != null) {
			Static349.aClass100_3.method2005(64);
		}
		Static386.aClass91_1.method1859(64);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IBI)Z")
	public static boolean method7514(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)I")
	public static int method7515() {
		return 14;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)Z")
	public static boolean method7517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static177.method2709(arg0, arg1) || Static252.method3570(arg1, arg0);
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(III)Z")
	public static boolean method7518(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
