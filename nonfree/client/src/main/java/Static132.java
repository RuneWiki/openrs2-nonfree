import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!q", name = "g", descriptor = "Lclient!vb;")
	public static Class82 aClass82_52;

	@OriginalMember(owner = "client!q", name = "h", descriptor = "I")
	public static int anInt2861;

	@OriginalMember(owner = "client!q", name = "n", descriptor = "I")
	public static int anInt2863;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "Lclient!tg;")
	private static Class81 aClass81_1029 = Static120.method2057("Choose Option");

	@OriginalMember(owner = "client!q", name = "i", descriptor = "Lclient!tg;")
	private static Class81 aClass81_1032 = Static120.method2057("Members object");

	@OriginalMember(owner = "client!q", name = "d", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1030 = aClass81_1032;

	@OriginalMember(owner = "client!q", name = "f", descriptor = "Lclient!tg;")
	private static Class81 aClass81_1031 = Static120.method2057("This computers address has been blocked");

	@OriginalMember(owner = "client!q", name = "j", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1033 = null;

	@OriginalMember(owner = "client!q", name = "k", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1034 = aClass81_1031;

	@OriginalMember(owner = "client!q", name = "o", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1035 = Static120.method2057(" <col=ffff00>");

	@OriginalMember(owner = "client!q", name = "q", descriptor = "[[I")
	public static int[][] anIntArrayArray23 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!q", name = "r", descriptor = "I")
	public static int anInt2865 = 20;

	@OriginalMember(owner = "client!q", name = "t", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1036 = aClass81_1029;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(II)I")
	public static int method2249(@OriginalArg(0) int arg0) {
		@Pc(19) int local19 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAA) >>> 1);
		@Pc(30) int local30 = (local19 & 0x33333333) + (local19 >>> 2 & 0x33333333);
		@Pc(38) int local38 = (local30 >>> 4) + local30 & 0xF0F0F0F;
		@Pc(44) int local44 = local38 + (local38 >>> 8);
		@Pc(50) int local50 = local44 + (local44 >>> 16);
		return local50 & 0xFF;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
	public static void method2250() {
		Static57.anInt1360 = 0;
		@Pc(16) int local16 = Static51.anInt1219 + (Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anInt3040 >> 7);
		@Pc(28) int local28 = (Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anInt3026 >> 7) + Static114.anInt2140;
		if (local16 >= 3053 && local16 <= 3156 && local28 >= 3056 && local28 <= 3136) {
			Static57.anInt1360 = 1;
		}
		if (local16 >= 3072 && local16 <= 3118 && local28 >= 9492 && local28 <= 9535) {
			Static57.anInt1360 = 1;
		}
		if (Static57.anInt1360 == 1 && local16 >= 3139 && local16 <= 3199 && local28 >= 3008 && local28 <= 3062) {
			Static57.anInt1360 = 0;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ZLclient!u;)V")
	public static void method2251(@OriginalArg(1) Class1_Sub23 arg0) {
		@Pc(1) long local1 = 0L;
		if (arg0.anInt3729 == 0) {
			local1 = Static21.method421(arg0.anInt3733, arg0.anInt3742, arg0.anInt3739);
		}
		if (arg0.anInt3729 == 1) {
			local1 = Static170.method3007(arg0.anInt3733, arg0.anInt3742, arg0.anInt3739);
		}
		if (arg0.anInt3729 == 2) {
			local1 = Static104.method1707(arg0.anInt3733, arg0.anInt3742, arg0.anInt3739);
		}
		@Pc(49) int local49 = -1;
		@Pc(55) int local55 = 0;
		if (arg0.anInt3729 == 3) {
			local1 = Static48.method2781(arg0.anInt3733, arg0.anInt3742, arg0.anInt3739);
		}
		@Pc(71) int local71 = 0;
		if (local1 != 0L) {
			local55 = (int) local1 >> 20 & 0x3;
			local49 = Integer.MAX_VALUE & (int) (local1 >>> 32);
			local71 = (int) local1 >> 14 & 0x1F;
		}
		arg0.anInt3730 = local49;
		arg0.anInt3727 = local55;
		arg0.anInt3741 = local71;
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V")
	public static void method2256() {
		aClass81_1036 = null;
		aClass81_1031 = null;
		aClass81_1029 = null;
		anIntArrayArray23 = null;
		aClass81_1034 = null;
		aClass81_1030 = null;
		aClass81_1033 = null;
		aClass81_1035 = null;
		aClass82_52 = null;
		aClass81_1032 = null;
	}
}
