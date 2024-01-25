import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
	public static int anInt4061 = 0;

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "Z")
	public static boolean aBoolean286 = false;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!qa;ZLclient!raa;Lclient!bl;)V")
	public static void method3557(@OriginalArg(0) Class122 arg0, @OriginalArg(2) Class1_Sub39 arg1, @OriginalArg(3) Class30 arg2) {
		@Pc(10) Class2 local10 = arg2.method908(arg0);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.c();
		if (local16 < local10.la()) {
			local16 = local10.la();
		}
		@Pc(28) int local28 = arg1.anInt7252;
		@Pc(31) int local31 = arg1.anInt7251;
		@Pc(33) int local33 = 0;
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		@Pc(59) int local59;
		@Pc(82) int local82;
		if (arg2.aString5 != null) {
			local33 = Static454.aClass232_8.method5435(arg2.aString5, null, null, Static101.aStringArray40);
			for (local59 = 0; local59 < local33; local59++) {
				@Pc(65) String local65 = Static101.aStringArray40[local59];
				if (local59 < local33 - 1) {
					local65 = local65.substring(0, local65.length() - 4);
				}
				local82 = Static97.aClass226_3.method5328(local65);
				if (local82 > local43) {
					local43 = local82;
				}
			}
			local45 = Static97.aClass226_3.method5327() * local33 + Static97.aClass226_3.method5326() / 2;
		}
		local59 = arg1.anInt7252 + local16 / 2;
		if (local28 < local16 + Static118.anInt817) {
			local28 = Static118.anInt817;
			local59 = local43 / 2 + Static118.anInt817 + local16 / 2 + 5 + 10;
		} else if (Static118.anInt812 - local16 < local28) {
			local59 = Static118.anInt812 - local16 / 2 - local43 / 2 - 10 - 5;
			local28 = Static118.anInt812 - local16;
		}
		@Pc(176) int local176 = arg1.anInt7251;
		if (Static118.anInt819 + local16 > local31) {
			local31 = Static118.anInt819;
			local176 = local16 / 2 + Static118.anInt819 + 10;
		} else if (local31 > Static118.anInt821 - local16) {
			local176 = Static118.anInt821 - local45 - local16 / 2 - 10;
			local31 = Static118.anInt821 - local16;
		}
		local82 = (int) (Math.atan2((double) (local28 - arg1.anInt7252), (double) (local31 - arg1.anInt7251)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method7359((float) local16 / 2.0F + (float) local28, (float) local16 / 2.0F + (float) local31, 4096, local82);
		@Pc(262) int local262 = -2;
		@Pc(264) int local264 = -2;
		@Pc(266) int local266 = -2;
		@Pc(268) int local268 = -2;
		if (arg2.aString5 != null) {
			local262 = local59 - local43 / 2 - 5;
			local264 = local176;
			local268 = Static97.aClass226_3.method5327() * local33 + local176 + 3;
			local266 = local262 + local43 + 10;
			if (arg2.anInt875 != 0) {
				arg0.method7265(arg2.anInt875, local268 - local176, local262, local266 - local262, local176);
			}
			if (arg2.anInt897 != 0) {
				arg0.method7223(local262, local268 - local176, local266 + -local262, arg2.anInt897, local176);
			}
			for (@Pc(339) int local339 = 0; local339 < local33; local339++) {
				@Pc(345) String local345 = Static101.aStringArray40[local339];
				if (local339 < local33 - 1) {
					local345 = local345.substring(0, local345.length() - 4);
				}
				Static97.aClass226_3.method5325(arg0, local345, local59, local176, arg2.anInt872);
				local176 += Static97.aClass226_3.method5327();
			}
		}
		if (arg2.anInt873 == -1 && arg2.aString5 == null) {
			return;
		}
		local16 >>= 0x1;
		@Pc(401) Class1_Sub43 local401 = new Class1_Sub43(arg1);
		local401.anInt7893 = local16 + local31;
		local401.anInt7890 = local262;
		local401.anInt7894 = local16 + local28;
		local401.anInt7896 = local31 - local16;
		local401.anInt7898 = local264;
		local401.anInt7900 = local266;
		local401.anInt7892 = local268;
		local401.anInt7891 = local28 - local16;
		Static442.aClass37_83.method970(local401);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIZ)Z")
	public static boolean method3558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static51.method986(arg0, arg1) & Static525.method1314(arg1, arg0);
	}
}
