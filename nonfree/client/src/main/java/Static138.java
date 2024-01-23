import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "Lclient!cc;")
	public static Class22 aClass22_13;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "[I")
	public static int[] anIntArray266 = new int[] { 0, 0, -1, 0, 8, 2, 6, 0, 4, 0, -1, 8, 12, -2, 0, 0, 0, 0, 15, -2, 0, 12, 0, 0, 3, 0, 0, 0, 0, 0, 8, 0, -2, 0, 0, 0, 0, 2, -2, -1, 0, -1, 0, 0, 0, 6, 0, 0, 0, 0, 12, -1, -1, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 5, 0, 6, 0, 0, 0, 10, 0, 12, 0, 0, 0, 4, 0, -2, 8, 3, 6, 5, 8, 0, 0, 0, 0, 0, 0, 3, 0, 14, 0, 0, 0, 0, 4, -2, 0, 20, 11, -1, -2, 0, 0, 0, 0, 6, 3, 0, 7, 0, 0, 0, 0, 6, -1, 0, 0, 0, 0, 7, 0, 0, 28, 0, 1, 0, 0, 4, 0, 15, 0, 2, 0, 0, 7, 2, 0, 0, 0, 7, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -2, 0, 0, 0, 6, 0, 0, 2, 0, 0, 0, 2, 3, -1, 0, 0, 17, 0, 0, 0, 0, 10, 0, 1, -2, 0, 6, 0, 0, 9, 0, 0, 1, 0, 0, 0, 0, 0, 5, 0, 6, 0, 2, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 8, 14, -1, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 3, 0, 2, 0, 0, 8, 0, 0, 0, 0, 0, -2, 0, 0, 0, -2, 6, 1, 0, 6, 0, 1, -1, 0, 10, 10, 0, 8, 5 };

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V")
	public static void method2259() {
		Static195.method3033();
		Static240.anInterface3Array6 = new Interface3[9];
		Static240.anInterface3Array6[1] = new Class166();
		Static240.anInterface3Array6[2] = new Class65();
		Static240.anInterface3Array6[3] = new Class83();
		Static240.anInterface3Array6[4] = new Class161();
		Static240.anInterface3Array6[5] = new Class74();
		Static240.anInterface3Array6[6] = new Class136();
		Static240.anInterface3Array6[7] = new Class105();
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)I")
	public static int method2260(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0xD5555555);
		@Pc(28) int local28 = (local10 >>> 2 & 0x33333333) + (local10 & 0x33333333);
		@Pc(36) int local36 = (local28 >>> 4) + local28 & 0xF0F0F0F;
		@Pc(46) int local46 = local36 + (local36 >>> 8);
		@Pc(52) int local52 = local46 + (local46 >>> 16);
		return local52 & 0xFF;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
	public static void method2261() {
		anIntArray266 = null;
		aClass22_13 = null;
		aBigInteger1 = null;
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)Lclient!ge;")
	public static Class53_Sub1 method2262() {
		return Static121.anInt2652 >= Static96.aClass53_Sub1Array1.length ? null : Static96.aClass53_Sub1Array1[Static121.anInt2652++];
	}
}
