import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!ji", name = "O", descriptor = "[Lclient!f;")
	public static Class80[] aClass80Array4;

	@OriginalMember(owner = "client!ji", name = "S", descriptor = "I")
	public static int anInt3535;

	@OriginalMember(owner = "client!ji", name = "H", descriptor = "Z")
	public static boolean aBoolean209 = false;

	@OriginalMember(owner = "client!ji", name = "M", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger3 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!ji", name = "P", descriptor = "[I")
	public static final int[] anIntArray291 = new int[1000];

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!tf;I)I")
	public static int method2960(@OriginalArg(0) Class26_Sub2_Sub2_Sub1 arg0) {
		@Pc(13) int local13 = arg0.anInt6629;
		@Pc(17) Class164 local17 = arg0.method5533();
		if (arg0.aBoolean458) {
			local13 = arg0.anInt6662;
		} else if (local17.anInt4695 == arg0.anInt7122 || arg0.anInt7122 == local17.anInt4680 || arg0.anInt7122 == local17.anInt4676 || local17.anInt4698 == arg0.anInt7122) {
			local13 = arg0.anInt6638;
		} else if (arg0.anInt7122 == local17.anInt4697 || arg0.anInt7122 == local17.anInt4701 || arg0.anInt7122 == local17.anInt4669 || arg0.anInt7122 == local17.anInt4666) {
			local13 = arg0.anInt6648;
		}
		return local13;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 == arg7 && arg0 == arg1 && arg6 == arg3 && arg8 == arg2) {
			Static198.method3010(arg8, arg1, arg5, arg7, arg3);
			return;
		}
		@Pc(40) int local40 = arg7;
		@Pc(42) int local42 = arg1;
		@Pc(46) int local46 = arg7 * 3;
		@Pc(50) int local50 = arg1 * 3;
		@Pc(54) int local54 = arg4 * 3;
		@Pc(58) int local58 = arg0 * 3;
		@Pc(62) int local62 = arg6 * 3;
		@Pc(66) int local66 = arg2 * 3;
		@Pc(74) int local74 = arg3 + local54 - local62 - arg7;
		@Pc(84) int local84 = arg8 + local58 - arg1 - local66;
		@Pc(94) int local94 = local62 + local46 - local54 - local54;
		@Pc(105) int local105 = local66 + local50 - local58 - local58;
		@Pc(110) int local110 = local54 - local46;
		@Pc(115) int local115 = local58 - local50;
		for (@Pc(117) int local117 = 128; local117 <= 4096; local117 += 128) {
			@Pc(125) int local125 = local117 * local117 >> 12;
			@Pc(131) int local131 = local117 * local125 >> 12;
			@Pc(135) int local135 = local74 * local131;
			@Pc(139) int local139 = local131 * local84;
			@Pc(143) int local143 = local125 * local94;
			@Pc(147) int local147 = local105 * local125;
			@Pc(151) int local151 = local110 * local117;
			@Pc(155) int local155 = local117 * local115;
			@Pc(166) int local166 = arg7 + (local151 + local135 + local143 >> 12);
			@Pc(178) int local178 = arg1 + (local155 + local139 + local147 >> 12);
			Static198.method3010(local178, local42, arg5, local40, local166);
			local42 = local178;
			local40 = local166;
		}
	}
}
