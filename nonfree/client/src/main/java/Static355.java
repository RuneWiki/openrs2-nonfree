import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!ri", name = "H", descriptor = "I")
	public static int anInt5734;

	@OriginalMember(owner = "client!ri", name = "M", descriptor = "Lclient!oi;")
	public static Class185 aClass185_89;

	@OriginalMember(owner = "client!ri", name = "ab", descriptor = "I")
	public static int anInt5747;

	@OriginalMember(owner = "client!ri", name = "ib", descriptor = "Lclient!np;")
	public static Class175 aClass175_1;

	@OriginalMember(owner = "client!ri", name = "P", descriptor = "Lclient!vo;")
	public static final Class265 aClass265_7 = new Class265("", 12);

	@OriginalMember(owner = "client!ri", name = "Q", descriptor = "I")
	public static int anInt5738 = 0;

	@OriginalMember(owner = "client!ri", name = "gb", descriptor = "Z")
	public static boolean aBoolean515 = true;

	@OriginalMember(owner = "client!ri", name = "zb", descriptor = "[I")
	public static final int[] anIntArray433 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!ri", name = "Ob", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_88 = new Class142("Examine", "Untersuchen", "Examiner", "Examinar");

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "(I)V")
	public static void method4638() {
		@Pc(10) int local10 = Static126.aClass19_Sub1_1.method3348(Static214.anInt3968);
		if (local10 == 0) {
			Static380.aByteArrayArrayArray17 = null;
			Static373.method5946(0);
		} else if (local10 == 1) {
			Static243.method3490((byte) 0);
			Static373.method5946(512);
			if (Static278.aByteArrayArrayArray16 != null) {
				Static230.method3294();
			}
		} else {
			Static243.method3490((byte) (Static330.anInt5429 - 4 & 0xFF));
			Static373.method5946(2);
		}
		Static12.anInt198 = Static390.anInt6272;
	}

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(IIZ)I")
	public static int method4651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local12 *= arg1;
			}
			arg1 *= arg1;
			arg0 >>= 0x1;
		}
		if (arg0 == 1) {
			return arg1 * local12;
		} else {
			return local12;
		}
	}

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "(B)V")
	public static void method4658() {
		Static40.aClass77_8.method1395();
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!mn;II)V")
	public static void method4659(@OriginalArg(0) Class160 arg0, @OriginalArg(2) int arg1) {
		if (Static284.aBoolean433) {
			Static284.aBoolean433 = false;
			arg1 = 0;
		}
		if (Static223.aClass160_6 != null && Static223.aClass160_6.method3639(arg0)) {
			return;
		}
		Static223.aClass160_6 = arg0;
		Static362.aLong193 = Static183.method2674();
		Static36.anInt541 = arg1;
		Static232.anInt4197 = arg1;
		if (Static232.anInt4197 != 0) {
			Static322.anInt5303 = Static106.anInt7395;
			Static199.aClass59_18 = Static43.aClass59_49;
			Static112.aFloat10 = Static165.aFloat29;
			Static33.anInt500 = Static138.anInt2145;
			Static182.aFloat51 = Static30.aFloat4;
			Static258.aFloat61 = Static374.aFloat80;
			Static459.aFloat91 = Static293.aFloat69;
			Static431.aFloat85 = Static416.aFloat82;
			Static4.aFloat1 = Static428.aFloat84;
			Static371.anInt5990 = Static65.anInt1010;
			return;
		}
		Static296.method3925();
	}

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "(III)V")
	public static void method4660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class216 local7 = Static259.aClass216ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass11_Sub4_2 != null) {
			local7.aClass11_Sub4_2 = null;
		}
		if (local7.aClass11_Sub4_1 != null) {
			local7.aClass11_Sub4_1 = null;
		}
	}
}
