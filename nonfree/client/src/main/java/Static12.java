import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
	public static int anInt187;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "Lclient!cu;")
	public static Class64 aClass64_1;

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray4 = new String[5];

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "Lclient!uu;")
	public static final Class369 aClass369_2 = new Class369(5, 1);

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(III[BII)Z")
	public static boolean method173(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class6_Sub15 local12 = new Class6_Sub15(arg2);
		@Pc(14) int local14 = -1;
		label70: while (true) {
			@Pc(18) int local18 = local12.method3007();
			if (local18 == 0) {
				return local7;
			}
			local14 += local18;
			@Pc(29) int local29 = 0;
			@Pc(33) boolean local33 = false;
			while (true) {
				@Pc(67) int local67;
				@Pc(99) Class125 local99;
				do {
					@Pc(72) int local72;
					@Pc(76) int local76;
					do {
						do {
							do {
								do {
									@Pc(39) int local39;
									while (local33) {
										local39 = local12.method2992();
										if (local39 == 0) {
											continue label70;
										}
										local12.method3030();
									}
									local39 = local12.method2992();
									if (local39 == 0) {
										continue label70;
									}
									local29 += local39 - 1;
									@Pc(55) int local55 = local29 & 0x3F;
									@Pc(61) int local61 = local29 >> 6 & 0x3F;
									local67 = local12.method3030() >> 2;
									local72 = local61 + arg1;
									local76 = arg3 + local55;
								} while (local72 <= 0);
							} while (local76 <= 0);
						} while (local72 >= arg4 - 1);
					} while (local76 >= arg0 - 1);
					local99 = Static290.aClass163_5.method4124(120, local14);
				} while (local67 == 22 && Static687.aClass6_Sub44_33.aClass7_Sub8_1.method1416() == 0 && local99.anInt3587 == 0 && local99.anInt3631 != 1 && !local99.aBoolean296);
				if (!local99.method3385()) {
					Static593.anInt9435++;
					local7 = false;
				}
				local33 = true;
			}
		}
	}
}
