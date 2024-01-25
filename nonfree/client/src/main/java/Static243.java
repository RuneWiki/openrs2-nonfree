import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
	public static int anInt3820;

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "Lclient!hk;")
	public static final Class158 aClass158_14 = new Class158(4);

	@OriginalMember(owner = "client!hk", name = "m", descriptor = "Lclient!hk;")
	public static final Class158 aClass158_10 = new Class158(1);

	@OriginalMember(owner = "client!hk", name = "p", descriptor = "Lclient!hk;")
	public static final Class158 aClass158_7 = new Class158(1);

	@OriginalMember(owner = "client!hk", name = "q", descriptor = "Lclient!hk;")
	public static final Class158 aClass158_8 = new Class158(2);

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "Lclient!hk;")
	public static final Class158 aClass158_9 = new Class158(4);

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "Lclient!hk;")
	public static final Class158 aClass158_11 = new Class158(2);

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "Lclient!hk;")
	public static final Class158 aClass158_12 = new Class158(4);

	@OriginalMember(owner = "client!hk", name = "o", descriptor = "Lclient!hk;")
	public static final Class158 aClass158_13 = new Class158(2);

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "Lclient!ij;")
	public static final Class179 aClass179_3 = new Class179("LIVE", 0);

	@OriginalMember(owner = "client!hk", name = "n", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_72 = new Class225(129, 1);

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)V")
	public static void method3433(@OriginalArg(1) int arg0) {
		Static560.aClass221_3 = Static487.aClass221_2;
		Static690.anInt10620 = arg0;
		Static25.anInt319 = 2;
		Static574.method7981(true, Static465.aString87.equals(""), "", Static465.aString87);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)Z")
	public static boolean method3435(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!oh;IZ)V")
	public static void method3436(@OriginalArg(0) Class273 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(13) int local13 = arg0.anInt7379 == 0 ? arg0.anInt7402 : arg0.anInt7379;
		@Pc(30) int local30 = arg0.anInt7400 == 0 ? arg0.anInt7385 : arg0.anInt7400;
		Static287.method4060(local30, arg1, arg0.anInt7350, local13, Static581.aClass273ArrayArray2[arg0.anInt7350 >> 16]);
		if (arg0.aClass273Array3 != null) {
			Static287.method4060(local30, arg1, arg0.anInt7350, local13, arg0.aClass273Array3);
		}
		@Pc(67) Class2_Sub26 local67 = (Class2_Sub26) Static463.aClass218_36.method5095((long) arg0.anInt7350, 0);
		if (local67 != null) {
			Static724.method9629(local30, local13, arg1, local67.anInt3020);
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLclient!vj;Lclient!vj;)V")
	public static void method3437(@OriginalArg(1) Class4 arg0, @OriginalArg(2) Class4 arg1) {
		if (arg1.aClass4_68 != null) {
			arg1.method9416();
		}
		arg1.aClass4_67 = arg0;
		arg1.aClass4_68 = arg0.aClass4_68;
		arg1.aClass4_68.aClass4_67 = arg1;
		arg1.aClass4_67.aClass4_68 = arg1;
	}
}
