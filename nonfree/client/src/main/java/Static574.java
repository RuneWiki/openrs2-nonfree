import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static574 {

	@OriginalMember(owner = "client!tl", name = "M", descriptor = "[I")
	public static final int[] anIntArray513 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method7927(@OriginalArg(0) String arg0) {
		if (Static352.aStringArray61 == null) {
			Static584.method8023();
		}
		Static358.aCalendar3.setTime(new Date(Static547.method7619()));
		@Pc(18) int local18 = Static358.aCalendar3.get(11);
		@Pc(22) int local22 = Static358.aCalendar3.get(12);
		@Pc(26) int local26 = Static358.aCalendar3.get(13);
		@Pc(60) String local60 = Integer.toString(local18 / 10) + local18 % 10 + ":" + local22 / 10 + local22 % 10 + ":" + local26 / 10 + local26 % 10;
		@Pc(65) String[] local65 = Static147.method2668('\n', arg0);
		for (@Pc(67) int local67 = 0; local67 < local65.length; local67++) {
			for (@Pc(73) int local73 = Static6.anInt66; local73 > 0; local73--) {
				Static352.aStringArray61[local73] = Static352.aStringArray61[local73 - 1];
			}
			Static352.aStringArray61[0] = local60 + ": " + local65[local67];
			if (Static64.aFileOutputStream1 != null) {
				try {
					Static64.aFileOutputStream1.write(Static43.method601(Static352.aStringArray61[0] + "\n"));
				} catch (@Pc(121) IOException local121) {
				}
			}
			if (Static6.anInt66 < Static352.aStringArray61.length - 1) {
				Static6.anInt66++;
				if (Static151.anInt3096 > 0) {
					Static151.anInt3096++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tl", name = "g", descriptor = "(I)I")
	public static int method7929() {
		if (Static383.aClass345_10 == null) {
			if (!Static493.aBoolean702 && Static355.aClass5_Sub3_Sub20_3 != null) {
				return Static355.aClass5_Sub3_Sub20_3.anInt10173;
			}
			@Pc(23) int local23 = Static359.aClass11_1.method6141();
			@Pc(29) int local29 = Static359.aClass11_1.method6144();
			@Pc(45) int local45;
			@Pc(47) int local47;
			@Pc(64) int local64;
			@Pc(136) Class5_Sub3_Sub20 local136;
			if (Static364.aBoolean585) {
				@Pc(255) Class90 local255;
				if (Static477.anInt8042 < local23 && local23 < Static477.anInt8042 + Static633.anInt10304) {
					local45 = -1;
					for (local47 = 0; local47 < Static248.anInt4552; local47++) {
						if (Static375.aBoolean592) {
							local64 = Static542.anInt6468 + local47 * 16 + 33;
							if (local64 - 13 < local29 && local64 + 3 >= local29) {
								local45 = local47;
							}
						} else {
							local64 = local47 * 16 + Static542.anInt6468 + 31;
							if (local29 > local64 - 13 && local29 <= local64 + 3) {
								local45 = local47;
							}
						}
					}
					if (local45 != -1) {
						local64 = 0;
						local255 = new Class90(Static609.aClass358_13);
						for (@Pc(359) Class5_Sub3_Sub15 local359 = (Class5_Sub3_Sub15) local255.method2234(); local359 != null; local359 = (Class5_Sub3_Sub15) local255.method2235()) {
							if (local64++ == local45) {
								return ((Class5_Sub3_Sub20) local359.aClass358_7.aClass5_Sub3_60.aClass5_Sub3_66).anInt10173;
							}
						}
					}
				} else if (Static345.aClass5_Sub3_Sub15_1 != null && local23 > Static556.anInt9088 && local23 < Static260.anInt4826 + Static556.anInt9088) {
					local45 = -1;
					for (local47 = 0; local47 < Static345.aClass5_Sub3_Sub15_1.anInt8017; local47++) {
						if (Static375.aBoolean592) {
							local64 = local47 * 16 + Static220.anInt4457 + 33;
							if (local29 > local64 - 13 && local29 <= local64 + 3) {
								local45 = local47;
							}
						} else {
							local64 = Static220.anInt4457 + local47 * 16 + 31;
							if (local64 - 13 < local29 && local29 <= local64 + 3) {
								local45 = local47;
							}
						}
					}
					if (local45 != -1) {
						local64 = 0;
						local255 = new Class90(Static345.aClass5_Sub3_Sub15_1.aClass358_7);
						for (local136 = (Class5_Sub3_Sub20) local255.method2234(); local136 != null; local136 = (Class5_Sub3_Sub20) local255.method2235()) {
							if (local64++ == local45) {
								return local136.anInt10173;
							}
						}
					}
				}
			} else if (local23 > Static477.anInt8042 && local23 < Static633.anInt10304 + Static477.anInt8042) {
				local45 = -1;
				for (local47 = 0; local47 < Static483.anInt8099; local47++) {
					if (Static375.aBoolean592) {
						local64 = Static542.anInt6468 + (-local47 + -1 + Static483.anInt8099) * 16 + 33;
						if (local64 - 13 < local29 && local29 <= local64 + 3) {
							local45 = local47;
						}
					} else {
						local64 = Static542.anInt6468 + (Static483.anInt8099 + -1 + -local47) * 16 + 31;
						if (local64 - 13 < local29 && local29 <= local64 + 3) {
							local45 = local47;
						}
					}
				}
				if (local45 != -1) {
					local64 = 0;
					@Pc(131) Class47 local131 = new Class47(Static231.aClass114_24);
					for (local136 = (Class5_Sub3_Sub20) local131.method749(); local136 != null; local136 = (Class5_Sub3_Sub20) local131.method746()) {
						if (local45 == local64++) {
							return local136.anInt10173;
						}
					}
				}
			}
		}
		return -1;
	}
}
