import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "Lclient!hg;")
	public static Class72 aClass72_1 = Static196.method3521();

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "Lclient!tl;")
	public static Class155 aClass155_5 = new Class155(50);

	@OriginalMember(owner = "client!bg", name = "j", descriptor = "Lclient!tl;")
	public static Class155 aClass155_6 = new Class155(100);

	@OriginalMember(owner = "client!bg", name = "k", descriptor = "F")
	public static float aFloat18 = 0.0F;

	@OriginalMember(owner = "client!bg", name = "l", descriptor = "Lclient!nb;")
	public static Class104 aClass104_1 = new Class104();

	@OriginalMember(owner = "client!bg", name = "m", descriptor = "Z")
	public static boolean aBoolean23 = false;

	@OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
	public static int anInt460 = 0;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "([[IIIIII)I")
	public static int method376(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(35) int local35 = arg0[arg4 + 1][arg1 + 1] * arg2 + (128 - arg2) * arg0[arg4][arg1 + 1] >> 7;
		@Pc(58) int local58 = (128 - arg2) * arg0[arg4][arg1] + arg2 * arg0[arg4 + 1][arg1] >> 7;
		return arg3 * local35 + (128 - arg3) * local58 >> 7;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIILclient!h;Lclient!h;IIIIJ)V")
	public static void method377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class25 arg4, @OriginalArg(5) Class25 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class101 local6 = new Class101();
		local6.aLong131 = arg10;
		local6.anInt3754 = arg1 * 128 + 64;
		local6.anInt3746 = arg2 * 128 + 64;
		local6.anInt3755 = arg3;
		local6.aClass25_3 = arg4;
		local6.aClass25_2 = arg5;
		local6.anInt3745 = arg6;
		local6.anInt3752 = arg7;
		local6.anInt3748 = arg8;
		local6.anInt3753 = arg9;
		for (@Pc(46) int local46 = arg0; local46 >= 0; local46--) {
			if (Static132.aClass1_Sub14ArrayArrayArray2[local46][arg1][arg2] == null) {
				Static132.aClass1_Sub14ArrayArrayArray2[local46][arg1][arg2] = new Class1_Sub14(local46, arg1, arg2);
			}
		}
		Static132.aClass1_Sub14ArrayArrayArray2[arg0][arg1][arg2].aClass101_1 = local6;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIZZZ)Lclient!kb;")
	public static Class83 method378(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(5) Class90 local5 = null;
		if (Static271.aClass14_5 != null) {
			local5 = new Class90(arg0, Static271.aClass14_5, Static16.aClass14Array1[arg0], 1000000);
		}
		Static179.aClass85_Sub1Array2[arg0] = Static66.aClass79_2.method2202(Static40.aClass90_3, arg0, local5);
		if (arg1) {
			Static179.aClass85_Sub1Array2[arg0].method2513();
		}
		return new Class83(Static179.aClass85_Sub1Array2[arg0], arg2, arg3);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)I")
	public static int method379() {
		if (Static172.aBoolean201) {
			return 0;
		} else if (Static40.method1450()) {
			return Static53.aBoolean84 ? 2 : 1;
		} else {
			return 1;
		}
	}
}
