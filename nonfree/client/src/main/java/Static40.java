import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bt", name = "K", descriptor = "Z")
	public static final boolean aBoolean60 = false;

	@OriginalMember(owner = "client!bt", name = "N", descriptor = "[I")
	public static final int[] anIntArray35 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "([Lclient!fi;IB)V")
	public static void method654(@OriginalArg(0) Class76[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			@Pc(18) Class76 local18 = arg0[local12];
			if (local18 != null && local18.anInt2112 == arg1 && !Static55.method890(local18)) {
				if (local18.anInt2060 == 0) {
					method654(arg0, local18.anInt2100);
					if (local18.aClass76Array2 != null) {
						method654(local18.aClass76Array2, local18.anInt2100);
					}
					@Pc(52) Class5_Sub44 local52 = (Class5_Sub44) Static151.aClass252_42.method5659((long) local18.anInt2100);
					if (local52 != null) {
						Static308.method3811(local52.anInt6981);
					}
				}
				if (local18.anInt2060 == 6 && local18.anInt2084 != -1) {
					@Pc(72) Class143 local72 = Static271.aClass219_4.method4752(local18.anInt2084);
					if (local72 != null) {
						local18.anInt2064 += Static173.anInt2946;
						while (local72.anIntArray239[local18.anInt2050] < local18.anInt2064) {
							local18.anInt2064 -= local72.anIntArray239[local18.anInt2050];
							local18.anInt2050++;
							if (local72.anIntArray241.length <= local18.anInt2050) {
								local18.anInt2050 -= local72.anInt3784;
								if (local18.anInt2050 < 0 || local72.anIntArray241.length <= local18.anInt2050) {
									local18.anInt2050 = 0;
								}
							}
							local18.anInt2051 = local18.anInt2050 + 1;
							if (local18.anInt2051 >= local72.anIntArray241.length) {
								local18.anInt2051 -= local72.anInt3784;
								if (local18.anInt2051 < 0 || local18.anInt2051 >= local72.anIntArray241.length) {
									local18.anInt2051 = -1;
								}
							}
							Static53.method833(local18);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Z)Lclient!op;")
	public static Class86 method655() {
		try {
			return (Class86) Class.forName("Class86_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(III)V")
	public static void method656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static319.aClass258ArrayArrayArray3[0][arg1][arg2] != null && Static319.aClass258ArrayArrayArray3[0][arg1][arg2].aClass258_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static319.aClass258ArrayArrayArray3[local22][arg1][arg2] == null) {
				@Pc(46) Class258 local46 = Static319.aClass258ArrayArrayArray3[local22][arg1][arg2] = new Class258(local22, arg1, arg2);
				if (local20) {
					local46.aByte98++;
				}
			}
		}
	}
}
