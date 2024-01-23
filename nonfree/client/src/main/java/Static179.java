import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!ra", name = "jb", descriptor = "I")
	public static int anInt3924;

	@OriginalMember(owner = "client!ra", name = "bb", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger4 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!ra", name = "nb", descriptor = "Lclient!jd;")
	public static Class61 aClass61_69 = new Class61(4);

	@OriginalMember(owner = "client!ra", name = "ob", descriptor = "I")
	public static int anInt3927 = 0;

	@OriginalMember(owner = "client!ra", name = "pb", descriptor = "I")
	public static int anInt3928 = 0;

	@OriginalMember(owner = "client!ra", name = "tb", descriptor = "Z")
	public static boolean aBoolean356 = false;

	@OriginalMember(owner = "client!ra", name = "ub", descriptor = "[I")
	public static int[] anIntArray340 = new int[1000];

	@OriginalMember(owner = "client!ra", name = "vb", descriptor = "Z")
	public static boolean aBoolean357 = true;

	@OriginalMember(owner = "client!ra", name = "wb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1060 = Static231.method3737("blaugr-Un:");

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([Lclient!sc;[SIII)V")
	public static void method2842(@OriginalArg(0) Class107[] arg0, @OriginalArg(1) short[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg2) {
			return;
		}
		@Pc(23) int local23 = (arg3 + arg2) / 2;
		@Pc(27) Class107 local27 = arg0[local23];
		arg0[local23] = arg0[arg3];
		arg0[arg3] = local27;
		@Pc(39) int local39 = arg2;
		@Pc(43) short local43 = arg1[local23];
		arg1[local23] = arg1[arg3];
		arg1[arg3] = local43;
		for (@Pc(55) int local55 = arg2; local55 < arg3; local55++) {
			if (local27 == null || arg0[local55] != null && arg0[local55].method3078(local27) < (local55 & 0x1)) {
				@Pc(77) Class107 local77 = arg0[local55];
				arg0[local55] = arg0[local39];
				arg0[local39] = local77;
				@Pc(91) short local91 = arg1[local55];
				arg1[local55] = arg1[local39];
				arg1[local39++] = local91;
			}
		}
		arg0[arg3] = arg0[local39];
		arg0[local39] = local27;
		arg1[arg3] = arg1[local39];
		arg1[local39] = local43;
		method2842(arg0, arg1, arg2, local39 - 1);
		method2842(arg0, arg1, local39 + 1, arg3);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!eg;II)V")
	public static void method2850(@OriginalArg(0) Class5_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anInt3042 > Static128.anInt2802) {
			Static140.method657(arg0);
		} else if (arg0.anInt3024 < Static128.anInt2802) {
			Static193.method3151(arg0);
		} else {
			Static44.method872(arg0);
		}
		if (arg0.anInt3021 < 128 || arg0.anInt3044 < 128 || arg0.anInt3021 >= 13184 || arg0.anInt3044 >= 13184) {
			arg0.anInt3045 = -1;
			arg0.anInt3042 = 0;
			arg0.anInt3021 = arg0.anInt2997 * 64 + arg0.anIntArray260[0] * 128;
			arg0.anInt3024 = 0;
			arg0.anInt3048 = -1;
			arg0.anInt3044 = arg0.anIntArray256[0] * 128 + arg0.anInt2997 * 64;
			arg0.method2305();
		}
		if (arg0 == Static204.aClass5_Sub5_Sub1_2 && (arg0.anInt3021 < 1536 || arg0.anInt3044 < 1536 || arg0.anInt3021 >= 11776 || arg0.anInt3044 >= 11776)) {
			arg0.anInt3024 = 0;
			arg0.anInt3042 = 0;
			arg0.anInt3045 = -1;
			arg0.anInt3048 = -1;
			arg0.anInt3044 = arg0.anIntArray256[0] * 128 + arg0.anInt2997 * 64;
			arg0.anInt3021 = arg0.anInt2997 * 64 + arg0.anIntArray260[0] * 128;
			arg0.method2305();
		}
		Static209.method3310(arg0);
		Static215.method3501(arg0);
	}
}
