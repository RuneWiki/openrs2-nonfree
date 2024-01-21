import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!sa", name = "r", descriptor = "Lclient!ma;")
	public static Class50 aClass50_4;

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "Lclient!cb;")
	public static Class10 aClass10_93 = new Class10();

	@OriginalMember(owner = "client!sa", name = "s", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1251 = Static146.method2172("Your account has been disabled)3");

	@OriginalMember(owner = "client!sa", name = "j", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1248 = aClass77_1251;

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1249 = Static146.method2172("Nehmen");

	@OriginalMember(owner = "client!sa", name = "n", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1250 = Static146.method2172(")4lang)4de");

	@OriginalMember(owner = "client!sa", name = "o", descriptor = "[I")
	public static int[] anIntArray514 = new int[5];

	@OriginalMember(owner = "client!sa", name = "p", descriptor = "Lclient!ua;")
	public static Class82 aClass82_52 = new Class82(260);

	@OriginalMember(owner = "client!sa", name = "v", descriptor = "I")
	public static final int anInt3528 = 2301979;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)Lclient!j;")
	public static Class2_Sub2_Sub12 method2434(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub2_Sub12 local12 = (Class2_Sub2_Sub12) Static110.aClass82_49.method2699((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static42.aClass43_11.method2205(arg0, 5);
		local12 = new Class2_Sub2_Sub12();
		if (local22 != null) {
			local12.method1384(new Class2_Sub18(local22));
		}
		Static110.aClass82_49.method2701((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
	public static void method2436() {
		aClass50_4 = null;
		anIntArray514 = null;
		aClass77_1250 = null;
		aClass77_1249 = null;
		aClass82_52 = null;
		aClass77_1251 = null;
		aClass10_93 = null;
		aClass77_1248 = null;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILclient!ke;)Lclient!bg;")
	public static Class2_Sub2_Sub3_Sub2 method2439(@OriginalArg(0) int arg0, @OriginalArg(2) Class43 arg1) {
		return Static83.method1516(arg1, arg0) ? Static131.method2906() : null;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!bf;IIIIB)V")
	public static void method2440(@OriginalArg(0) Class2_Sub2_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) Class2_Sub25 local7 = new Class2_Sub25();
		local7.anInt4589 = arg3 * 128;
		local7.anIntArray644 = arg0.anIntArray76;
		local7.anInt4583 = arg4;
		local7.anInt4586 = arg2 * 128;
		local7.anInt4580 = arg0.anInt535;
		local7.anInt4591 = arg0.anInt523;
		local7.anInt4590 = arg0.anInt539;
		@Pc(39) int local39 = arg0.anInt538;
		@Pc(42) int local42 = arg0.anInt520;
		local7.anInt4585 = arg0.anInt522 * 128;
		if (arg1 == 1 || arg1 == 3) {
			local42 = arg0.anInt538;
			local39 = arg0.anInt520;
		}
		local7.anInt4588 = (arg3 + local39) * 128;
		local7.anInt4579 = (local42 + arg2) * 128;
		if (arg0.anIntArray73 != null) {
			local7.aClass2_Sub2_Sub5_1 = arg0;
			local7.method3007();
		}
		Static63.aClass10_45.method448(local7);
		if (local7.anIntArray644 != null) {
			local7.anInt4581 = (int) (Math.random() * (double) (local7.anInt4590 - local7.anInt4591)) + local7.anInt4591;
		}
	}
}
