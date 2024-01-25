import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
	public static int anInt7672;

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString66 = null;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIII[BI)Z")
	public static boolean method6688(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class3_Sub9 local12 = new Class3_Sub9(arg3);
		@Pc(14) int local14 = -1;
		label70: while (true) {
			@Pc(26) int local26 = local12.method5587();
			if (local26 == 0) {
				return local7;
			}
			local14 += local26;
			@Pc(37) int local37 = 0;
			@Pc(39) boolean local39 = false;
			while (true) {
				@Pc(69) int local69;
				@Pc(105) Class330 local105;
				do {
					@Pc(74) int local74;
					@Pc(79) int local79;
					do {
						do {
							do {
								do {
									@Pc(45) int local45;
									while (local39) {
										local45 = local12.method5606();
										if (local45 == 0) {
											continue label70;
										}
										local12.method5633();
									}
									local45 = local12.method5606();
									if (local45 == 0) {
										continue label70;
									}
									local37 += local45 - 1;
									@Pc(57) int local57 = local37 & 0x3F;
									@Pc(63) int local63 = local37 >> 6 & 0x3F;
									local69 = local12.method5633() >> 2;
									local74 = local63 + arg2;
									local79 = local57 + arg1;
								} while (local74 <= 0);
							} while (local79 <= 0);
						} while (local74 >= arg4 - 1);
					} while (local79 >= arg0 - 1);
					local105 = Static370.aClass284_3.method6915(local14);
				} while (local69 == 22 && Static32.aClass3_Sub41_3.aClass7_Sub29_1.method8579() == 0 && local105.anInt9228 == 0 && local105.anInt9191 != 1 && !local105.aBoolean686);
				if (!local105.method7883()) {
					local7 = false;
					Static586.anInt9503++;
				}
				local39 = true;
			}
		}
	}
}
