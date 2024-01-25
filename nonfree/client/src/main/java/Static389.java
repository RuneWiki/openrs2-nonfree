import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!wq", name = "j", descriptor = "Lclient!fc;")
	public static Class71 aClass71_92;

	@OriginalMember(owner = "client!wq", name = "g", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_177 = new Class77(50, 2);

	@OriginalMember(owner = "client!wq", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString64 = null;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IC)Z")
	public static boolean method5717(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method5718(@OriginalArg(0) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			local7 *= 37L;
			@Pc(22) char local22 = arg0.charAt(local12);
			if (local22 >= 'A' && local22 <= 'Z') {
				local7 += local22 - 64;
			} else if (local22 >= 'a' && local22 <= 'z') {
				local7 += local22 + 1 - 97;
			} else if (local22 >= '0' && local22 <= '9') {
				local7 += local22 + 27 - 48;
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

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "(II)V")
	public static void method5721(@OriginalArg(1) int arg0) {
		@Pc(1) Class2_Sub1_Sub6 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class33 local8 = Static39.aClass33Array2[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static244.anInt1024; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static166.anInt2967; local15++) {
						local1 = local8.method4069(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static315.anInt5584;
							@Pc(32) int local32 = local12 << Static315.anInt5584;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class33 local41 = Static39.aClass33Array2[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.method4057(local15, local12) - local41.method4057(local15, local12);
									@Pc(67) int local67 = local8.method4057(local15 + 1, local12) - local41.method4057(local15 + 1, local12);
									@Pc(85) int local85 = local8.method4057(local15 + 1, local12 + 1) - local41.method4057(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.method4057(local15, local12 + 1) - local41.method4057(local15, local12 + 1);
									local41.method4059(local1, local28, (local53 + local67 + local85 + local99) / 4, local32);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(BLclient!ms;II)V")
	public static void method5722(@OriginalArg(1) Class155 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static243.aClass155_26 != null || Static48.aBoolean87 || (arg0 == null || Static326.method5046(arg0) == null)) {
			return;
		}
		Static243.aClass155_26 = arg0;
		Static380.aClass155_38 = Static326.method5046(arg0);
		Static137.anInt2566 = 0;
		Static47.aBoolean86 = false;
		Static22.anInt540 = arg1;
		Static366.anInt6415 = arg2;
	}
}
