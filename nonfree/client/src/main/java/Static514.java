import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static514 {

	@OriginalMember(owner = "client!rh", name = "N", descriptor = "Lclient!jia;")
	public static final Class193 aClass193_56 = new Class193();

	@OriginalMember(owner = "client!rh", name = "Q", descriptor = "Z")
	public static boolean aBoolean645 = false;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II[BIII)Z")
	public static boolean method7282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) boolean local12 = true;
		@Pc(17) Class3_Sub17 local17 = new Class3_Sub17(arg2);
		@Pc(19) int local19 = -1;
		label68: while (true) {
			@Pc(23) int local23 = local17.method4856();
			if (local23 == 0) {
				return local12;
			}
			local19 += local23;
			@Pc(31) int local31 = 0;
			@Pc(33) boolean local33 = false;
			while (true) {
				@Pc(63) int local63;
				@Pc(93) Class178 local93;
				do {
					@Pc(67) int local67;
					@Pc(71) int local71;
					do {
						do {
							do {
								do {
									@Pc(39) int local39;
									while (local33) {
										local39 = local17.method4841();
										if (local39 == 0) {
											continue label68;
										}
										local17.method4888();
									}
									local39 = local17.method4841();
									if (local39 == 0) {
										continue label68;
									}
									local31 += local39 - 1;
									@Pc(51) int local51 = local31 & 0x3F;
									@Pc(57) int local57 = local31 >> 6 & 0x3F;
									local63 = local17.method4888() >> 2;
									local67 = arg1 + local57;
									local71 = arg3 + local51;
								} while (local67 <= 0);
							} while (local71 <= 0);
						} while (local67 >= arg0 - 1);
					} while (local71 >= arg4 - 1);
					local93 = Static349.aClass374_2.method8357(local19);
				} while (local63 == 22 && Static227.aClass3_Sub15_11.aClass17_Sub23_1.method7173() == 0 && local93.anInt4743 == 0 && local93.anInt4737 != 1 && !local93.aBoolean384);
				local33 = true;
				if (!local93.method4024()) {
					Static8.anInt100++;
					local12 = false;
				}
			}
		}
	}
}
