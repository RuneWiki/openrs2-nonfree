import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!paa", name = "C", descriptor = "Lclient!vo;")
	public static Class348 aClass348_96;

	@OriginalMember(owner = "client!paa", name = "B", descriptor = "I")
	public static int anInt7652 = 0;

	@OriginalMember(owner = "client!paa", name = "E", descriptor = "I")
	public static int anInt7654 = 104;

	@OriginalMember(owner = "client!paa", name = "K", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_65 = new Class344(45, 2);

	@OriginalMember(owner = "client!paa", name = "M", descriptor = "Lclient!jn;")
	public static final Class167 aClass167_42 = new Class167(3000000, 200);

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(B[B)Ljava/lang/String;")
	public static String method6003(@OriginalArg(1) byte[] arg0) {
		return Static158.method2662(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(B[Lclient!is;I)V")
	public static void method6004(@OriginalArg(1) Class155[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class155 local13 = arg0[local7];
			if (local13 != null) {
				if (local13.anInt4796 == 0) {
					if (local13.aClass155Array2 != null) {
						method6004(local13.aClass155Array2, arg1);
					}
					@Pc(34) Class4_Sub45 local34 = (Class4_Sub45) Static569.aClass221_27.method5075((long) local13.anInt4793);
					if (local34 != null) {
						Static396.method6077(arg1, local34.anInt9096);
					}
				}
				@Pc(50) Class4_Sub37 local50;
				if (arg1 == 0 && local13.anObjectArray8 != null) {
					local50 = new Class4_Sub37();
					local50.aClass155_10 = local13;
					local50.anObjectArray31 = local13.anObjectArray8;
					Static471.method6884(local50);
				}
				if (arg1 == 1 && local13.anObjectArray6 != null) {
					if (local13.anInt4765 >= 0) {
						@Pc(75) Class155 local75 = Static558.method7916(local13.anInt4793);
						if (local75 == null || local75.aClass155Array2 == null || local75.aClass155Array2.length <= local13.anInt4765 || local75.aClass155Array2[local13.anInt4765] != local13) {
							continue;
						}
					}
					local50 = new Class4_Sub37();
					local50.aClass155_10 = local13;
					local50.anObjectArray31 = local13.anObjectArray6;
					Static471.method6884(local50);
				}
			}
		}
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(IZIII)V")
	public static void method6005(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(23) Class182 local23 = Static571.aClass182ArrayArrayArray3[arg1][arg3][arg2];
		if (local23 != null) {
			if (arg0 == 1) {
				local23.aShort77 = 0;
			} else if (arg0 == 2) {
				local23.aShort78 = 0;
			}
		}
		Static232.method3764();
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lclient!kfa;[III[II)Lclient!db;")
	public static Class67_Sub1 method6006(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		@Pc(15) byte[] local15 = new byte[arg4 * arg2];
		for (@Pc(17) int local17 = 0; local17 < arg2; local17++) {
			@Pc(28) int local28 = arg4 * local17 + arg1[local17];
			for (@Pc(30) int local30 = 0; local30 < arg3[local17]; local30++) {
				local15[local28++] = -1;
			}
		}
		return new Class67_Sub1(arg0, arg4, arg2, local15);
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(IIIIII)V")
	public static void method6008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg1 - arg2;
		@Pc(14) int local14 = arg3 - arg4;
		if (local14 == 0) {
			if (local10 != 0) {
				Static97.method1898(arg1, arg2, arg0, arg4);
			}
		} else if (local10 == 0) {
			Static455.method6676(arg0, arg3, arg2, arg4);
		} else {
			if (local10 < 0) {
				local10 = -local10;
			}
			if (local14 < 0) {
				local14 = -local14;
			}
			@Pc(70) boolean local70 = local14 < local10;
			@Pc(74) int local74;
			@Pc(78) int local78;
			if (local70) {
				local74 = arg4;
				arg4 = arg2;
				local78 = arg3;
				arg2 = local74;
				arg3 = arg1;
				arg1 = local78;
			}
			if (arg4 > arg3) {
				local74 = arg4;
				arg4 = arg3;
				local78 = arg2;
				arg3 = local74;
				arg2 = arg1;
				arg1 = local78;
			}
			local74 = arg2;
			local78 = arg3 - arg4;
			@Pc(111) int local111 = arg1 - arg2;
			@Pc(116) int local116 = -(local78 >> 1);
			@Pc(123) int local123 = arg2 < arg1 ? 1 : -1;
			if (local111 < 0) {
				local111 = -local111;
			}
			@Pc(132) int local132;
			if (local70) {
				for (local132 = arg4; local132 <= arg3; local132++) {
					local116 += local111;
					Static442.anIntArrayArray48[local132][local74] = arg0;
					if (local116 > 0) {
						local74 += local123;
						local116 -= local78;
					}
				}
			} else {
				for (local132 = arg4; local132 <= arg3; local132++) {
					local116 += local111;
					Static442.anIntArrayArray48[local74][local132] = arg0;
					if (local116 > 0) {
						local116 -= local78;
						local74 += local123;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(BLclient!hi;III)V")
	public static void method6009(@OriginalArg(1) Class4_Sub23 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) (arg1 | arg3 << 28 | arg2 << 14);
		@Pc(22) Class4_Sub32 local22 = (Class4_Sub32) Static17.aClass221_1.method5075(local16);
		if (local22 == null) {
			local22 = new Class4_Sub32();
			Static17.aClass221_1.method5073(local22, local16);
			local22.aClass22_44.method894(arg0);
			return;
		}
		@Pc(45) Class236 local45 = Static338.aClass29_1.method977(arg0.anInt3993);
		@Pc(48) int local48 = local45.anInt6814;
		if (local45.anInt6824 == 1) {
			local48 *= arg0.anInt3992 + 1;
		}
		for (@Pc(74) Class4_Sub23 local74 = (Class4_Sub23) local22.aClass22_44.method895(); local74 != null; local74 = (Class4_Sub23) local22.aClass22_44.method889()) {
			local45 = Static338.aClass29_1.method977(local74.anInt3993);
			@Pc(85) int local85 = local45.anInt6814;
			if (local45.anInt6824 == 1) {
				local85 *= local74.anInt3992 + 1;
			}
			if (local48 > local85) {
				Static246.method3938(arg0, local74);
				return;
			}
		}
		local22.aClass22_44.method894(arg0);
	}
}
