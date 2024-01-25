import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static675 {

	@OriginalMember(owner = "client!ws", name = "r", descriptor = "I")
	public static int anInt10913;

	@OriginalMember(owner = "client!ws", name = "t", descriptor = "Lclient!jg;")
	public static final Class179 aClass179_1 = new Class179(14, 0);

	@OriginalMember(owner = "client!ws", name = "w", descriptor = "Lclient!jg;")
	public static final Class179 aClass179_2 = new Class179(15, 4);

	@OriginalMember(owner = "client!ws", name = "x", descriptor = "Lclient!jg;")
	public static final Class179 aClass179_3 = new Class179(16, -2);

	@OriginalMember(owner = "client!ws", name = "y", descriptor = "Lclient!jg;")
	public static final Class179 aClass179_4 = new Class179(17, 0);

	@OriginalMember(owner = "client!ws", name = "z", descriptor = "Lclient!jg;")
	public static final Class179 aClass179_5 = new Class179(18, -2);

	@OriginalMember(owner = "client!ws", name = "B", descriptor = "Lclient!jg;")
	public static final Class179 aClass179_6 = new Class179(19, -2);

	@OriginalMember(owner = "client!ws", name = "C", descriptor = "Lclient!jg;")
	public static final Class179 aClass179_7 = new Class179(22, -2);

	@OriginalMember(owner = "client!ws", name = "D", descriptor = "Lclient!jg;")
	public static final Class179 aClass179_8 = new Class179(23, 4);

	@OriginalMember(owner = "client!ws", name = "E", descriptor = "Lclient!jg;")
	public static final Class179 aClass179_9 = new Class179(24, -1);

	@OriginalMember(owner = "client!ws", name = "F", descriptor = "Lclient!jg;")
	public static final Class179 aClass179_10 = new Class179(26, 0);

	@OriginalMember(owner = "client!ws", name = "G", descriptor = "Lclient!jg;")
	public static final Class179 aClass179_11 = new Class179(27, 0);

	@OriginalMember(owner = "client!ws", name = "H", descriptor = "Lclient!jg;")
	public static final Class179 aClass179_12 = new Class179(28, -2);

	@OriginalMember(owner = "client!ws", name = "M", descriptor = "Lclient!qj;")
	public static final Class295 aClass295_73 = new Class295(8);

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(ILclient!qba;Z)V")
	public static void method8999(@OriginalArg(0) int arg0, @OriginalArg(1) Class34_Sub1_Sub1_Sub2 arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (arg1.anInt9685 > Static122.anInt2190) {
			Static639.method8630(arg1);
		} else if (arg1.anInt9642 >= Static122.anInt2190) {
			Static80.method1316(arg1);
		} else {
			Static121.method1827(false, arg1);
			local9 = Static211.anInt3663;
			local7 = Static521.anInt8227;
		}
		@Pc(117) int local117;
		if (arg1.anInt9614 < 512 || arg1.anInt9619 < 512 || (Static98.anInt361 - 1) * 512 <= arg1.anInt9614 || Static438.anInt7120 * 512 - 512 <= arg1.anInt9619) {
			local9 = 0;
			arg1.anInt9642 = 0;
			arg1.anIntArray527 = null;
			arg1.anInt9664 = -1;
			local7 = -1;
			arg1.anInt9685 = 0;
			arg1.anInt9614 = arg1.anIntArray529[0] * 512 + arg1.method7866() * 256;
			arg1.anInt9619 = arg1.anIntArray528[0] * 512 + arg1.method7866() * 256;
			arg1.method7868();
			for (local117 = 0; local117 < arg1.aClass190Array3.length; local117++) {
				arg1.aClass190Array3[local117].anInt5051 = -1;
			}
		}
		if (arg1 == Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1 && (arg1.anInt9614 < 6144 || arg1.anInt9619 < 6144 || Static98.anInt361 * 512 - 6144 <= arg1.anInt9614 || arg1.anInt9619 >= (Static438.anInt7120 - 12) * 512)) {
			arg1.anInt9642 = 0;
			local7 = -1;
			arg1.anInt9685 = 0;
			local9 = 0;
			arg1.anInt9664 = -1;
			arg1.anIntArray527 = null;
			arg1.anInt9614 = arg1.anIntArray529[0] * 512 + arg1.method7866() * 256;
			arg1.anInt9619 = arg1.anIntArray528[0] * 512 + arg1.method7866() * 256;
			arg1.method7868();
			for (local117 = 0; local117 < arg1.aClass190Array3.length; local117++) {
				arg1.aClass190Array3[local117].anInt5051 = -1;
			}
		}
		local117 = Static8.method117(arg1);
		Static527.method6833(arg1);
		Static628.method8495(local9, local117, arg1, local7);
		Static245.method3710(local7, arg1);
		Static236.method3579(arg1);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(BI)I")
	public static int method9000(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
