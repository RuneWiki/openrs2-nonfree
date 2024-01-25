import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
	public static int anInt10356;

	@OriginalMember(owner = "client!fe", name = "k", descriptor = "Lclient!wp;")
	public static Class376 aClass376_37;

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "Lclient!us;")
	public static final Class344 aClass344_125 = new Class344(55, 2);

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "[I")
	public static final int[] anIntArray620 = new int[16];

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "[[I")
	public static final int[][] anIntArrayArray101 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)Lclient!jaa;")
	public static Class153_Sub1 method8498() {
		Static258.anInt5693 = 0;
		return Static274.method4941();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIZLclient!qg;)V")
	public static void method8499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class272 arg3) {
		for (@Pc(15) Class3_Sub25 local15 = (Class3_Sub25) Static598.aClass276_62.method6907(); local15 != null; local15 = (Class3_Sub25) Static598.aClass276_62.method6912()) {
			if (local15.anInt4661 == arg1 && local15.anInt4649 == arg2 << 9 && arg0 << 9 == local15.anInt4655 && local15.aClass272_1.anInt8290 == arg3.anInt8290) {
				if (local15.aClass3_Sub7_Sub1_3 != null) {
					Static581.aClass3_Sub7_Sub3_2.method2210(local15.aClass3_Sub7_Sub1_3);
					local15.aClass3_Sub7_Sub1_3 = null;
				}
				if (local15.aClass3_Sub7_Sub1_2 != null) {
					Static581.aClass3_Sub7_Sub3_2.method2210(local15.aClass3_Sub7_Sub1_2);
					local15.aClass3_Sub7_Sub1_2 = null;
				}
				local15.method8671();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/lang/String;B)J")
	public static long method8504(@OriginalArg(0) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(21) int local21 = 0; local21 < local10; local21++) {
			local7 *= 37L;
			@Pc(31) char local31 = arg0.charAt(local21);
			if (local31 >= 'A' && local31 <= 'Z') {
				local7 += local31 + 1 - 65;
			} else if (local31 >= 'a' && local31 <= 'z') {
				local7 += local31 + 1 - 97;
			} else if (local31 >= '0' && local31 <= '9') {
				local7 += local31 + 27 - 48;
			}
			if (local7 >= 177917621779460413L) {
				break;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIII)V")
	public static void method8505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 != 8 && arg0 != 16) {
			@Pc(168) Class106 local168 = Static170.aClass106ArrayArrayArray1[arg1][arg5][arg2];
			if (local168 == null) {
				local168 = new Class106(arg1);
			}
			if (arg0 == 1) {
				local168.aShort36 = (short) arg4;
				local168.aShort34 = (short) arg3;
			} else if (arg0 == 2) {
				local168.aShort35 = (short) arg4;
				local168.aShort37 = (short) arg3;
			}
			if (Static301.aBoolean519) {
				Static106.method2586();
			}
			return;
		}
		@Pc(24) int local24;
		@Pc(29) int local29;
		@Pc(33) int local33;
		@Pc(38) int local38;
		@Pc(50) int local50;
		@Pc(60) int local60;
		if (arg0 != 8) {
			local24 = Static325.anInt6512 + (arg5 << Static276.anInt5846);
			local29 = local24 - Static325.anInt6512;
			local33 = arg2 << Static276.anInt5846;
			local38 = local33 + Static325.anInt6512;
			local50 = Static445.aClass274Array1[arg1].method8041(arg5 + 1, arg2);
			local60 = Static445.aClass274Array1[arg1].method8041(arg5, arg2 + 1);
			Static270.aClass92Array6[Static92.anInt2488++] = new Class92(arg0, arg1, local24, local29, local29, local24, local50, local60, local60 - arg3, -arg3 + local50, local33, local38, local38, local33);
			return;
		}
		local24 = arg5 << Static276.anInt5846;
		local29 = local24 + Static325.anInt6512;
		local33 = arg2 << Static276.anInt5846;
		local38 = Static325.anInt6512 + local33;
		local50 = Static445.aClass274Array1[arg1].method8041(arg5, arg2);
		local60 = Static445.aClass274Array1[arg1].method8041(arg5 + 1, arg2 + 1);
		Static270.aClass92Array6[Static92.anInt2488++] = new Class92(arg0, arg1, local24, local29, local29, local24, local50, local60, local60 - arg3, local50 + -arg3, local33, local38, local38, local33);
	}
}
