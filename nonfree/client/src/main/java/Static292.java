import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!oq", name = "i", descriptor = "I")
	public static int anInt5205;

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "Lclient!fe;")
	public static final Class74 aClass74_22 = new Class74(8);

	@OriginalMember(owner = "client!oq", name = "f", descriptor = "[I")
	public static final int[] anIntArray349 = new int[25];

	@OriginalMember(owner = "client!oq", name = "g", descriptor = "Lclient!tq;")
	public static final Class238 aClass238_21 = new Class238(10, 6);

	@OriginalMember(owner = "client!oq", name = "h", descriptor = "Lclient!um;")
	public static final Class244 aClass244_25 = new Class244();

	@OriginalMember(owner = "client!oq", name = "k", descriptor = "[I")
	public static final int[] anIntArray350 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!oq", name = "l", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILclient!eq;)V")
	public static void method4379(@OriginalArg(1) Class66 arg0) {
		if (Static302.aClass3_Sub2_Sub1_Sub2_2.aByte103 != Static344.anInt6358 && (Static409.aClass101ArrayArrayArray3 != null && Static265.method4077(Static302.aClass3_Sub2_Sub1_Sub2_2.aByte103, arg0))) {
			Static344.anInt6358 = Static302.aClass3_Sub2_Sub1_Sub2_2.aByte103;
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(BIIIII)V")
	public static void method4380(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg2 - arg1;
		@Pc(15) int local15 = arg3 - arg4;
		if (local10 == 0) {
			if (local15 != 0) {
				Static14.method390(arg1, arg4, arg3, arg0);
			}
		} else if (local15 == 0) {
			Static409.method6044(arg1, arg0, arg2, arg4);
		} else {
			@Pc(53) int local53 = (local15 << 12) / local10;
			@Pc(62) int local62 = arg4 - (local53 * arg1 >> 12);
			@Pc(86) int local86;
			@Pc(84) int local84;
			if (arg1 < Static165.anInt3313) {
				local86 = Static165.anInt3313;
				local84 = (Static165.anInt3313 * local53 >> 12) + local62;
			} else if (Static152.anInt3132 < arg1) {
				local84 = (Static152.anInt3132 * local53 >> 12) + local62;
				local86 = Static152.anInt3132;
			} else {
				local84 = arg4;
				local86 = arg1;
			}
			@Pc(120) int local120;
			@Pc(122) int local122;
			if (arg2 < Static165.anInt3313) {
				local122 = (local53 * Static165.anInt3313 >> 12) + local62;
				local120 = Static165.anInt3313;
			} else if (Static152.anInt3132 >= arg2) {
				local120 = arg2;
				local122 = arg3;
			} else {
				local120 = Static152.anInt3132;
				local122 = local62 + (local53 * Static152.anInt3132 >> 12);
			}
			if (Static172.anInt3442 > local122) {
				local122 = Static172.anInt3442;
				local120 = (Static172.anInt3442 - local62 << 12) / local53;
			} else if (Static324.anInt5590 < local122) {
				local122 = Static324.anInt5590;
				local120 = (Static324.anInt5590 - local62 << 12) / local53;
			}
			if (Static172.anInt3442 > local84) {
				local84 = Static172.anInt3442;
				local86 = (Static172.anInt3442 - local62 << 12) / local53;
			} else if (local84 > Static324.anInt5590) {
				local84 = Static324.anInt5590;
				local86 = (Static324.anInt5590 - local62 << 12) / local53;
			}
			Static159.method4801(local84, local122, local120, local86, arg0);
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ZI)V")
	public static void method4381(@OriginalArg(1) int arg0) {
		Static138.anInt4528 = arg0;
		Static224.anInt4061 = 3;
		Static224.anInt4054 = -1;
		Static373.anInt6709 = 100;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ZZIIIIIII)Z")
	public static boolean method4382(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static302.aClass3_Sub2_Sub1_Sub2_2.anIntArray458[0];
		@Pc(13) int local13 = Static302.aClass3_Sub2_Sub1_Sub2_2.anIntArray459[0];
		if (local8 < 0 || Static181.anInt3574 <= local8 || local13 < 0 || local13 >= Static117.anInt2450) {
			return false;
		} else if (arg1 >= 0 && arg1 < Static181.anInt3574 && arg3 >= 0 && arg3 < Static117.anInt2450) {
			@Pc(68) int local68 = Static51.method1172(Static302.aClass3_Sub2_Sub1_Sub2_2.method5521(), Static209.aClass210Array2[Static302.aClass3_Sub2_Sub1_Sub2_2.aByte103], arg6, arg7, arg5, local13, local8, arg2, arg4, arg3, Static265.anIntArray325, Static298.anIntArray357, arg1, arg0);
			if (local68 < 1) {
				return false;
			}
			Static114.anInt5655 = Static265.anIntArray325[local68 - 1];
			Static346.anInt6243 = Static298.anIntArray357[local68 - 1];
			Static409.aBoolean467 = false;
			Static97.method1811();
			return true;
		} else {
			return false;
		}
	}
}
