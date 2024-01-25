import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!hja", name = "g", descriptor = "Lclient!cd;")
	public static Class53 aClass53_7;

	@OriginalMember(owner = "client!hja", name = "h", descriptor = "Lclient!dp;")
	public static final Class82 aClass82_5 = new Class82();

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "(Lclient!fl;I[[B)V")
	public static void method4064(@OriginalArg(0) Class116_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(9) int local9;
		@Pc(13) int local13;
		@Pc(23) int local23;
		@Pc(33) int local33;
		for (@Pc(3) int local3 = 0; local3 < arg0.anInt3486; local3++) {
			Static302.method4850();
			for (local9 = 0; local9 < Static29.anInt380 >> 3; local9++) {
				for (local13 = 0; local13 < Static327.anInt5650 >> 3; local13++) {
					local23 = Static146.anIntArrayArrayArray8[local3][local9][local13];
					if (local23 != -1) {
						local33 = local23 >> 24 & 0x3;
						if (!arg0.aBoolean278 || local33 == 0) {
							@Pc(46) int local46 = local23 >> 1 & 0x3;
							@Pc(52) int local52 = local23 >> 14 & 0x3FF;
							@Pc(58) int local58 = local23 >> 3 & 0x7FF;
							@Pc(69) int local69 = (local52 / 8 << 8) + (local58 / 8);
							for (@Pc(71) int local71 = 0; local71 < Static617.anIntArray642.length; local71++) {
								if (local69 == Static617.anIntArray642[local71] && arg1[local71] != null) {
									@Pc(97) Class6_Sub15 local97 = new Class6_Sub15(arg1[local71]);
									arg0.method3280(local13 * 8, local58, local33, local97, local52, local9 * 8, Static669.aClass356Array1, local3, local46);
									arg0.method3290(local97, local46, local52, local58, local33, local9 * 8, Static202.aClass75_5, local3, local13 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (local9 = 0; local9 < arg0.anInt3486; local9++) {
			Static302.method4850();
			for (local13 = 0; local13 < Static29.anInt380 >> 3; local13++) {
				for (local23 = 0; local23 < Static327.anInt5650 >> 3; local23++) {
					local33 = Static146.anIntArrayArrayArray8[local9][local13][local23];
					if (local33 == -1) {
						arg0.method3284(8, local9, local23 * 8, local13 * 8, 8);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "(BLclient!ha;ZI)Lclient!ee;")
	public static Class92 method4065(@OriginalArg(1) Class75 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		if (arg2 == -1) {
			return null;
		}
		if (Static512.anIntArray533 != null) {
			for (@Pc(22) int local22 = 0; local22 < Static512.anIntArray533.length; local22++) {
				if (Static512.anIntArray533[local22] == arg2) {
					return Static82.aClass92Array1[local22];
				}
			}
		}
		@Pc(48) Class92 local48 = (Class92) Static688.aClass359_70.method8517((long) arg2);
		if (local48 != null) {
			if (arg1 && local48.aClass53_2 == null) {
				@Pc(64) Class53 local64 = Static287.method4708(arg2, Static57.aClass223_12);
				if (local64 == null) {
					return null;
				}
				local48.aClass53_2 = local64;
			}
			return local48;
		}
		@Pc(78) Class64[] local78 = Static691.method1247(Static173.aClass223_35, arg2);
		if (local78 == null) {
			return null;
		}
		@Pc(88) Class53 local88 = Static287.method4708(arg2, Static57.aClass223_12);
		if (local88 == null) {
			return null;
		}
		if (arg1) {
			local48 = new Class92(arg0.method6649(local88, local78), local88);
		} else {
			local48 = new Class92(arg0.method6649(local88, local78));
		}
		Static688.aClass359_70.method8515((long) arg2, local48);
		return local48;
	}
}
