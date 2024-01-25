import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
	public static int anInt7991;

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "Lclient!ega;")
	public static final Class79 aClass79_17 = new Class79();

	@OriginalMember(owner = "client!ka", name = "m", descriptor = "[C")
	public static final char[] aCharArray12 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)Z")
	public static boolean method6846(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIII[B)Z")
	public static boolean method6868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class6_Sub40 local12 = new Class6_Sub40(arg4);
		@Pc(14) int local14 = -1;
		label68: while (true) {
			@Pc(18) int local18 = local12.method8597();
			if (local18 == 0) {
				return local7;
			}
			local14 += local18;
			@Pc(26) int local26 = 0;
			@Pc(28) boolean local28 = false;
			while (true) {
				@Pc(58) int local58;
				@Pc(89) Class312 local89;
				do {
					@Pc(63) int local63;
					@Pc(67) int local67;
					do {
						do {
							do {
								do {
									@Pc(34) int local34;
									while (local28) {
										local34 = local12.method8587();
										if (local34 == 0) {
											continue label68;
										}
										local12.method8604();
									}
									local34 = local12.method8587();
									if (local34 == 0) {
										continue label68;
									}
									local26 += local34 - 1;
									@Pc(46) int local46 = local26 & 0x3F;
									@Pc(52) int local52 = local26 >> 6 & 0x3F;
									local58 = local12.method8604() >> 2;
									local63 = local52 + arg1;
									local67 = arg2 + local46;
								} while (local63 <= 0);
							} while (local67 <= 0);
						} while (local63 >= arg0 - 1);
					} while (local67 >= arg3 - 1);
					local89 = Static283.aClass210_2.method5629(local14);
				} while (local58 == 22 && Static348.aClass6_Sub22_19.aClass15_Sub2_1.method484() == 0 && local89.anInt9207 == 0 && local89.anInt9233 != 1 && !local89.aBoolean627);
				local28 = true;
				if (!local89.method7856()) {
					local7 = false;
					Static57.anInt1236++;
				}
			}
		}
	}
}
