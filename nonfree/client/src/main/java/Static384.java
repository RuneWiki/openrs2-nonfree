import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!ow", name = "y", descriptor = "Lclient!uj;")
	public static final Class321 aClass321_5 = new Class321();

	@OriginalMember(owner = "client!ow", name = "Q", descriptor = "[I")
	public static final int[] anIntArray497 = new int[50];

	@OriginalMember(owner = "client!ow", name = "ab", descriptor = "I")
	public static int anInt7048 = 0;

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(IIIII[B)Z")
	public static boolean method5631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class6_Sub12 local12 = new Class6_Sub12(arg4);
		@Pc(19) int local19 = -1;
		label54: while (true) {
			@Pc(23) int local23 = local12.method6003();
			if (local23 == 0) {
				return local7;
			}
			local19 += local23;
			@Pc(31) int local31 = 0;
			@Pc(33) boolean local33 = false;
			while (true) {
				@Pc(39) int local39;
				while (!local33) {
					local39 = local12.method6034();
					if (local39 == 0) {
						continue label54;
					}
					local31 += local39 - 1;
					@Pc(63) int local63 = local31 & 0x3F;
					@Pc(69) int local69 = local31 >> 6 & 0x3F;
					@Pc(75) int local75 = local12.method6019() >> 2;
					@Pc(79) int local79 = local69 + arg1;
					@Pc(83) int local83 = arg2 + local63;
					if (local79 > 0 && local83 > 0 && local79 < arg3 - 1 && arg0 - 1 > local83) {
						@Pc(109) Class192 local109 = Static85.aClass27_1.method516(local19);
						if (local75 != 22 || Static58.aClass6_Sub17_Sub1_1.aBoolean614 || local109.anInt5582 != 0 || local109.anInt5604 == 1 || local109.aBoolean390) {
							local33 = true;
							if (!local109.method4592()) {
								local7 = false;
								Static39.anInt748++;
							}
						}
					}
				}
				local39 = local12.method6034();
				if (local39 == 0) {
					break;
				}
				local12.method6019();
			}
		}
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(IIII)I")
	public static int method5632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg1;
		}
	}
}
