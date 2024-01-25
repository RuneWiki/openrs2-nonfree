import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
	public static int anInt5703;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_130 = new Class180(96, -2);

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_131 = new Class180(58, 2);

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "([BIIIII)Z")
	public static boolean method5202(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class3_Sub25 local12 = new Class3_Sub25(arg0);
		@Pc(18) int local18 = -1;
		label68: while (true) {
			@Pc(22) int local22 = local12.method8619();
			if (local22 == 0) {
				return local7;
			}
			local18 += local22;
			@Pc(30) int local30 = 0;
			@Pc(32) boolean local32 = false;
			while (true) {
				@Pc(67) int local67;
				@Pc(101) Class277 local101;
				do {
					@Pc(71) int local71;
					@Pc(75) int local75;
					do {
						do {
							do {
								do {
									@Pc(40) int local40;
									while (local32) {
										local40 = local12.method8604();
										if (local40 == 0) {
											continue label68;
										}
										local12.method8632();
									}
									local40 = local12.method8604();
									if (local40 == 0) {
										continue label68;
									}
									local30 += local40 - 1;
									@Pc(55) int local55 = local30 & 0x3F;
									@Pc(61) int local61 = local30 >> 6 & 0x3F;
									local67 = local12.method8632() >> 2;
									local71 = local61 + arg1;
									local75 = arg4 + local55;
								} while (local71 <= 0);
							} while (local75 <= 0);
						} while (local71 >= arg2 - 1);
					} while (local75 >= arg3 - 1);
					local101 = Static652.aClass267_4.method6682(local18);
				} while (local67 == 22 && Static24.aClass3_Sub22_4.aClass6_Sub4_1.method2638() == 0 && local101.anInt7757 == 0 && local101.anInt7718 != 1 && !local101.lb);
				local32 = true;
				if (!local101.method6810()) {
					local7 = false;
					Static290.anInt4940++;
				}
			}
		}
	}
}
