import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!fv", name = "t", descriptor = "I")
	public static int anInt2625;

	@OriginalMember(owner = "client!fv", name = "v", descriptor = "[Lclient!mq;")
	public static Class156[] aClass156Array1;

	@OriginalMember(owner = "client!fv", name = "w", descriptor = "I")
	public static int anInt2626;

	@OriginalMember(owner = "client!fv", name = "x", descriptor = "Lclient!f;")
	public static Class8 aClass8_9;

	@OriginalMember(owner = "client!fv", name = "k", descriptor = "I")
	public static int anInt2620 = 0;

	@OriginalMember(owner = "client!fv", name = "u", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_46 = new Class217(61, -1);

	@OriginalMember(owner = "client!fv", name = "y", descriptor = "[I")
	public static final int[] anIntArray155 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!fv", name = "z", descriptor = "Z")
	public static boolean aBoolean231 = false;

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lclient!vj;I)V")
	public static void method1980(@OriginalArg(0) Class172_Sub2 arg0) {
		@Pc(16) byte[] local16;
		if (Static365.anObject13 == null) {
			@Pc(9) Class57_Sub1_Sub1 local9 = new Class57_Sub1_Sub1();
			local16 = local9.method3582();
			Static365.anObject13 = Static14.method317(local16);
		}
		if (Static87.anObject12 == null) {
			@Pc(27) Class57_Sub2_Sub1 local27 = new Class57_Sub2_Sub1();
			local16 = local27.method4487();
			Static87.anObject12 = Static14.method317(local16);
		}
		@Pc(46) Class45 local46 = arg0.aClass45_1;
		if (local46.method1222() && Static72.anObject6 == null) {
			local16 = Static310.method4315(0.6F, 4.0F, 4.0F, 16.0F, new Class89_Sub1(419684), 0.5F);
			Static72.anObject6 = Static14.method317(local16);
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(BI)Z")
	public static boolean method1983(@OriginalArg(1) int arg0) {
		return arg0 == 10 || arg0 == 50 || arg0 == 1002 || arg0 == 8 || arg0 == 15;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIIII)V")
	public static void method1984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static374.aClass20_Sub1_1.anInt2360 != 0 && arg1 != 0 && Static319.anInt1933 < 50 && arg2 != -1) {
			Static25.aClass219Array1[Static319.anInt1933++] = new Class219((byte) 2, arg2, arg1, arg3, arg0, 0);
		}
	}
}
