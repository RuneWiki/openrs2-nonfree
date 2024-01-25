import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!q", name = "R", descriptor = "I")
	public static int anInt5134;

	@OriginalMember(owner = "client!q", name = "Y", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!q", name = "K", descriptor = "Lclient!br;")
	public static Class21 aClass21_14 = null;

	@OriginalMember(owner = "client!q", name = "U", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!q", name = "W", descriptor = "[I")
	public static final int[] anIntArray419 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!q", name = "X", descriptor = "J")
	public static long aLong157 = -1L;

	@OriginalMember(owner = "client!q", name = "Z", descriptor = "I")
	public static int anInt5138 = 0;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(BIIII)V")
	public static void method4444(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = arg2;
		@Pc(16) int local16 = -arg2;
		Static135.method2878(Static223.anIntArrayArray124[arg0], arg1 + arg2, arg3, arg1 - arg2);
		@Pc(30) int local30 = -1;
		while (local11 < local13) {
			local30 += 2;
			local11++;
			local16 += local30;
			if (local16 >= 0) {
				local13--;
				local16 -= local13 << 1;
				@Pc(57) int[] local57 = Static223.anIntArrayArray124[arg0 + local13];
				@Pc(64) int[] local64 = Static223.anIntArrayArray124[arg0 - local13];
				@Pc(68) int local68 = local11 + arg1;
				@Pc(73) int local73 = arg1 - local11;
				Static135.method2878(local57, local68, arg3, local73);
				Static135.method2878(local64, local68, arg3, local73);
			}
			@Pc(89) int local89 = local13 + arg1;
			@Pc(94) int local94 = arg1 - local13;
			@Pc(100) int[] local100 = Static223.anIntArrayArray124[local11 + arg0];
			@Pc(107) int[] local107 = Static223.anIntArrayArray124[arg0 - local11];
			Static135.method2878(local100, local89, arg3, local94);
			Static135.method2878(local107, local89, arg3, local94);
		}
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(BI)V")
	public static void method4445() {
		Static278.aClass198_246.method5202(5);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4446(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 >= Static5.anInt2965 && Static220.anInt6565 >= arg3 && Static349.anInt6619 <= arg0 && arg2 <= Static195.anInt4097) {
			Static5.method2583(arg3, arg5, arg4, arg2, arg6, arg1, arg0);
		} else {
			Static350.method5565(arg6, arg1, arg4, arg3, arg0, arg2, arg5);
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4448(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static202.anInt4162 >= 100 && !Static25.aBoolean42 || Static202.anInt4162 >= 200) {
			Static282.method4191(Static43.aClass159_65.method4311(Static180.anInt3835));
			return;
		}
		@Pc(29) String local29 = Static252.method4449(arg0);
		if (local29 == null) {
			return;
		}
		@Pc(72) String local72;
		for (@Pc(34) int local34 = 0; local34 < Static202.anInt4162; local34++) {
			@Pc(42) String local42 = Static252.method4449(Static73.aStringArray21[local34]);
			if (local42 != null && local42.equals(local29)) {
				Static282.method4191(arg0 + Static314.aClass159_332.method4311(Static180.anInt3835));
				return;
			}
			if (Static345.aStringArray86[local34] != null) {
				local72 = Static252.method4449(Static345.aStringArray86[local34]);
				if (local72 != null && local72.equals(local29)) {
					Static282.method4191(arg0 + Static314.aClass159_332.method4311(Static180.anInt3835));
					return;
				}
			}
		}
		for (@Pc(98) int local98 = 0; local98 < Static129.anInt3035; local98++) {
			local72 = Static252.method4449(Static161.aStringArray39[local98]);
			if (local72 != null && local72.equals(local29)) {
				Static282.method4191(Static220.aClass159_358.method4311(Static180.anInt3835) + arg0 + Static276.aClass159_297.method4311(Static180.anInt3835));
				return;
			}
			if (Static45.aStringArray11[local98] != null) {
				@Pc(141) String local141 = Static252.method4449(Static45.aStringArray11[local98]);
				if (local141 != null && local141.equals(local29)) {
					Static282.method4191(Static220.aClass159_358.method4311(Static180.anInt3835) + arg0 + Static276.aClass159_297.method4311(Static180.anInt3835));
					return;
				}
			}
		}
		if (Static252.method4449(Static158.aClass8_Sub1_Sub2_Sub1_1.aString24).equals(local29)) {
			Static282.method4191(Static9.aClass159_14.method4311(Static180.anInt3835));
		} else {
			Static15.aClass4_Sub11_Sub1_2.method706(174);
			Static15.aClass4_Sub11_Sub1_2.method3434(Static294.method4905(arg0));
			Static15.aClass4_Sub11_Sub1_2.method3410(arg0);
		}
	}
}
