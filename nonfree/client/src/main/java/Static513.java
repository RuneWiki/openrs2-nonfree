import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static513 {

	@OriginalMember(owner = "client!vk", name = "S", descriptor = "I")
	public static int anInt9093;

	@OriginalMember(owner = "client!vk", name = "E", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray37 = new String[5];

	@OriginalMember(owner = "client!vk", name = "L", descriptor = "I")
	public static int anInt9088 = 0;

	@OriginalMember(owner = "client!vk", name = "N", descriptor = "[I")
	public static final int[] anIntArray788 = new int[32];

	@OriginalMember(owner = "client!vk", name = "Q", descriptor = "Lclient!ug;")
	public static final Class294 aClass294_15 = new Class294();

	@OriginalMember(owner = "client!vk", name = "T", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_134 = new Class45("Loading JAGGL - ", "Lade JAGGL - ", "Chargement JAGGL - ", "Carregando JAGGL - ");

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Z[B)Z")
	public static boolean method7850(@OriginalArg(1) byte[] arg0) {
		@Pc(15) Class1_Sub17 local15 = new Class1_Sub17(arg0);
		@Pc(19) int local19 = local15.method4487();
		if (local19 != 2) {
			return false;
		}
		@Pc(33) boolean local33 = local15.method4487() == 1;
		if (local33) {
			Static459.method7009(local15);
		}
		Static522.method7946(local15);
		return true;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIIIIIIIIIIII)V")
	public static void method7856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (Static296.aClass7Array11 == null) {
			return;
		}
		@Pc(8) Class20_Sub1_Sub1 local8 = null;
		@Pc(14) int local14;
		if (arg8 >= 0) {
			local14 = arg8 - 1;
			@Pc(21) Class1_Sub41 local21 = (Class1_Sub41) Static362.aClass230_46.method6144((long) local14);
			if (local21 != null) {
				local8 = local21.aClass20_Sub1_Sub1_Sub2_2;
			}
		} else {
			local14 = -arg8 - 1;
			if (Static16.anInt9513 == local14) {
				local8 = Static107.aClass20_Sub1_Sub1_Sub1_1;
			} else {
				local8 = Static511.aClass20_Sub1_Sub1_Sub1Array1[local14];
			}
		}
		if (local8 == null) {
			return;
		}
		@Pc(50) Class51 local50 = Static398.aClass18_4.method609(arg7);
		@Pc(64) int local64;
		@Pc(61) int local61;
		if (arg12 == 1 || arg12 == 3) {
			local61 = local50.anInt1615;
			local64 = local50.anInt1636;
		} else {
			local64 = local50.anInt1615;
			local61 = local50.anInt1636;
		}
		@Pc(78) int local78 = arg10 + (local61 >> 1);
		@Pc(87) int local87 = arg10 + (local61 + 1 >> 1);
		@Pc(102) int local102 = arg3 + (local64 >> 1);
		@Pc(110) int local110 = (local64 + 1 >> 1) + arg3;
		@Pc(114) Class7 local114 = Static296.aClass7Array11[arg4];
		@Pc(139) int local139 = local114.ba(local78, local102) + local114.ba(local87, local102) + local114.ba(local78, local110) + local114.ba(local87, local110) >> 2;
		@Pc(143) Class1_Sub27 local143 = new Class1_Sub27();
		local143.anInt4518 = arg10;
		local143.anInt4507 = Static445.anInt7791 + arg9;
		local143.anInt4504 = arg12;
		local143.anInt4517 = local8.aByte108;
		local143.anInt4515 = arg6;
		local143.anInt4509 = arg3;
		local143.anInt4512 = Static445.anInt7791 + arg5;
		local143.anInt4501 = arg7;
		@Pc(178) int local178;
		if (arg11 > arg1) {
			local178 = arg11;
			arg11 = arg1;
			arg1 = local178;
		}
		local143.anInt4516 = arg11 + arg10;
		if (arg2 < arg0) {
			local178 = arg0;
			arg0 = arg2;
			arg2 = local178;
		}
		local143.anInt4510 = arg10 + arg1;
		local143.anInt4502 = (local64 << 6) + (local143.anInt4509 << 7);
		local143.anInt4506 = local139;
		local143.anInt4514 = arg2 + arg3;
		local143.anInt4511 = arg0 + arg3;
		local143.anInt4508 = (local61 << 6) + (local143.anInt4518 << 7);
		Static365.aClass295_39.method7533(local143);
		local8.aClass1_Sub27_3 = local143;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(BI)I")
	public static int method7859(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(20) int local20 = local7 | local7 >>> 1;
		@Pc(26) int local26 = local20 | local20 >>> 2;
		@Pc(32) int local32 = local26 | local26 >>> 4;
		@Pc(38) int local38 = local32 | local32 >>> 8;
		@Pc(44) int local44 = local38 | local38 >>> 16;
		return ~local44 & arg0;
	}
}
