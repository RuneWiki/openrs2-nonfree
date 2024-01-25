import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!mt", name = "d", descriptor = "I")
	public static int anInt4442;

	@OriginalMember(owner = "client!mt", name = "f", descriptor = "[I")
	public static int[] anIntArray391;

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "Lclient!gf;")
	public static final Class91 aClass91_10 = new Class91("", 16);

	@OriginalMember(owner = "client!mt", name = "g", descriptor = "I")
	public static int anInt4444 = 0;

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIIIIIIIIIBII)V")
	public static void method3557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (Static241.aClass22Array3 == null) {
			return;
		}
		@Pc(8) Class11_Sub5_Sub2 local8 = null;
		@Pc(18) int local18;
		if (arg7 < 0) {
			local18 = -arg7 - 1;
			if (local18 == Static94.anInt5592) {
				local8 = Static127.aClass11_Sub5_Sub2_Sub1_2;
			} else {
				local8 = Static435.aClass11_Sub5_Sub2_Sub1Array1[local18];
			}
		} else {
			local18 = arg7 - 1;
			@Pc(44) Class2_Sub34 local44 = (Class2_Sub34) Static400.aClass220_41.method5099((long) local18);
			if (local44 != null) {
				local8 = local44.aClass11_Sub5_Sub2_Sub2_2;
			}
		}
		if (local8 == null) {
			return;
		}
		@Pc(57) Class192 local57 = Static249.aClass39_2.method748(arg11);
		@Pc(66) int local66;
		@Pc(69) int local69;
		if (arg10 == 1 || arg10 == 3) {
			local66 = local57.anInt5455;
			local69 = local57.anInt5446;
		} else {
			local69 = local57.anInt5455;
			local66 = local57.anInt5446;
		}
		@Pc(83) int local83 = arg8 + (local69 >> 1);
		@Pc(91) int local91 = (local69 + 1 >> 1) + arg8;
		@Pc(98) int local98 = arg12 + (local66 >> 1);
		@Pc(107) int local107 = arg12 + (local66 + 1 >> 1);
		@Pc(111) Class22 local111 = Static241.aClass22Array3[arg1];
		@Pc(134) int local134 = local111.ua(local83, local98) + local111.ua(local91, local98) + local111.ua(local83, local107) + local111.ua(local91, local107) >> 2;
		@Pc(138) Class2_Sub28 local138 = new Class2_Sub28();
		local138.anInt5060 = arg11;
		local138.anInt5055 = arg10;
		local138.anInt5052 = arg5 + Static277.anInt5022;
		@Pc(154) int local154;
		if (arg0 > arg6) {
			local154 = arg0;
			arg0 = arg6;
			arg6 = local154;
		}
		local138.anInt5062 = arg9;
		local138.anInt5053 = arg12;
		local138.anInt5064 = local8.aByte101;
		local138.anInt5066 = arg8;
		local138.anInt5050 = Static277.anInt5022 + arg3;
		if (arg2 > arg4) {
			local154 = arg2;
			arg2 = arg4;
			arg4 = local154;
		}
		local138.anInt5065 = arg0 + arg8;
		local138.anInt5063 = arg6 + arg8;
		local138.anInt5051 = arg2 + arg12;
		local138.anInt5059 = (local66 << 6) + (local138.anInt5053 << 7);
		local138.anInt5061 = local134;
		local138.anInt5056 = (local69 << 6) + (local138.anInt5066 << 7);
		local138.anInt5058 = arg4 + arg12;
		Static345.aClass181_32.method3973(local138);
		local8.aClass2_Sub28_3 = local138;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(CB)Z")
	public static boolean method3558(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIII)I")
	public static int method3559(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static382.anInt6617 < 100) {
			return -2;
		}
		@Pc(14) int local14 = -2;
		@Pc(16) int local16 = Integer.MAX_VALUE;
		@Pc(26) int local26 = arg1 - Static5.anInt6721;
		@Pc(31) int local31 = arg2 - Static5.anInt6729;
		for (@Pc(36) Class2_Sub16 local36 = (Class2_Sub16) Static5.aClass181_45.method3972(); local36 != null; local36 = (Class2_Sub16) Static5.aClass181_45.method3975()) {
			if (local36.anInt2880 == arg0) {
				@Pc(45) int local45 = local36.anInt2879;
				@Pc(48) int local48 = local36.anInt2882;
				@Pc(59) int local59 = local48 + Static5.anInt6729 | local45 + Static5.anInt6721 << 14;
				@Pc(76) int local76 = (local26 - local45) * (local26 - local45) + (local31 - local48) * (local31 - local48);
				if (local14 < 0 || local16 > local76) {
					local16 = local76;
					local14 = local59;
				}
			}
		}
		return local14;
	}
}
