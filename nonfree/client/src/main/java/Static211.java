import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "Lclient!wu;")
	public static Class384 aClass384_51;

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
	public static int anInt3647;

	@OriginalMember(owner = "client!hh", name = "i", descriptor = "[[Lclient!nt;")
	public static Class248[][] aClass248ArrayArray1;

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "Lclient!dia;")
	public static final Class74 aClass74_20 = new Class74("", 16);

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IB)I")
	public static int method3220(@OriginalArg(0) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I[Lclient!vfa;I)V")
	public static void method3222(@OriginalArg(1) Class357[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class357 local13 = arg0[local7];
			if (local13 != null) {
				if (local13.anInt9828 == 0) {
					if (local13.aClass357Array2 != null) {
						method3222(local13.aClass357Array2, arg1);
					}
					@Pc(37) Class5_Sub15 local37 = (Class5_Sub15) Static183.aClass81_27.method1599((long) local13.anInt9804);
					if (local37 != null) {
						Static499.method7310(arg1, local37.anInt2409);
					}
				}
				@Pc(53) Class5_Sub9 local53;
				if (arg1 == 0 && local13.anObjectArray10 != null) {
					local53 = new Class5_Sub9();
					local53.aClass357_2 = local13;
					local53.anObjectArray1 = local13.anObjectArray10;
					Static82.method1317(local53);
				}
				if (arg1 == 1 && local13.anObjectArray16 != null) {
					if (local13.anInt9846 >= 0) {
						@Pc(79) Class357 local79 = Static472.method6903(local13.anInt9804);
						if (local79 == null || local79.aClass357Array2 == null || local79.aClass357Array2.length <= local13.anInt9846 || local79.aClass357Array2[local13.anInt9846] != local13) {
							continue;
						}
					}
					local53 = new Class5_Sub9();
					local53.aClass357_2 = local13;
					local53.anObjectArray1 = local13.anObjectArray16;
					Static82.method1317(local53);
				}
			}
		}
	}
}
