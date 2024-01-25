import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!nga", name = "I", descriptor = "F")
	public static float aFloat186;

	@OriginalMember(owner = "client!nga", name = "D", descriptor = "I")
	public static int anInt9628 = 0;

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "([Ljava/lang/String;ZII)Ljava/lang/String;")
	public static String method7854(@OriginalArg(0) String[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(16) String local16 = arg0[arg1];
			return local16 == null ? "null" : local16.toString();
		} else {
			@Pc(27) int local27 = arg2 + arg1;
			@Pc(29) int local29 = 0;
			for (@Pc(31) int local31 = arg1; local31 < local27; local31++) {
				@Pc(37) String local37 = arg0[local31];
				if (local37 == null) {
					local29 += 4;
				} else {
					local29 += local37.length();
				}
			}
			@Pc(56) StringBuffer local56 = new StringBuffer(local29);
			for (@Pc(63) int local63 = arg1; local63 < local27; local63++) {
				@Pc(69) String local69 = arg0[local63];
				if (local69 == null) {
					local56.append("null");
				} else {
					local56.append(local69);
				}
			}
			return local56.toString();
		}
	}

	@OriginalMember(owner = "client!nga", name = "j", descriptor = "(I)V")
	public static void method7855() {
		Static64.anInt1323 = 200;
		Static166.anInt3035 = (int) ((double) Static98.anInt361 * 34.46D);
		Static166.anInt3035 <<= 0x2;
		if (Static119.aClass95_4.method7999()) {
			Static166.anInt3035 += 512;
		}
		Static498.method9017(false);
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lclient!su;ILclient!js;Lclient!ha;)V")
	public static void method7857(@OriginalArg(0) Class3_Sub46 arg0, @OriginalArg(2) Class188 arg1, @OriginalArg(3) Class95 arg2) {
		@Pc(10) Class6 local10 = arg1.method4287(arg2);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.method5119();
		if (local16 < local10.method5136()) {
			local16 = local10.method5136();
		}
		@Pc(32) int local32 = arg0.anInt9115;
		@Pc(35) int local35 = arg0.anInt9113;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(55) int local55;
		@Pc(78) int local78;
		if (arg1.aString62 != null) {
			local37 = Static285.aClass91_8.method1851((Class6[]) null, (int[]) null, Static307.aStringArray39, arg1.aString62);
			for (local55 = 0; local55 < local37; local55++) {
				@Pc(61) String local61 = Static307.aStringArray39[local55];
				if (local55 < local37 - 1) {
					local61 = local61.substring(0, local61.length() - 4);
				}
				local78 = Static635.aClass97_7.method2240(local61);
				if (local39 < local78) {
					local39 = local78;
				}
			}
			local41 = Static635.aClass97_7.method2241() * local37 + Static635.aClass97_7.method2239() / 2;
		}
		local55 = local16 / 2 + arg0.anInt9115;
		@Pc(115) int local115 = arg0.anInt9113;
		if (local32 < Static671.anInt9355 + local16) {
			local32 = Static671.anInt9355;
			local55 = local39 / 2 + local16 / 2 + Static671.anInt9355 + 10 + 5;
		} else if (Static671.anInt9352 - local16 < local32) {
			local55 = Static671.anInt9352 - local16 / 2 - local39 / 2 - 10 - 5;
			local32 = Static671.anInt9352 - local16;
		}
		if (local35 < local16 + Static671.anInt9362) {
			local115 = local16 / 2 + Static671.anInt9362 + 10;
			local35 = Static671.anInt9362;
		} else if (Static671.anInt9354 - local16 < local35) {
			local115 = Static671.anInt9354 - local16 / 2 - local41 - 10;
			local35 = Static671.anInt9354 - local16;
		}
		local78 = (int) (Math.atan2((double) (local32 - arg0.anInt9115), (double) (local35 - arg0.anInt9113)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method5126((float) local32 + (float) local16 / 2.0F, (float) local16 / 2.0F + (float) local35, 4096, local78);
		@Pc(256) int local256 = -2;
		@Pc(258) int local258 = -2;
		@Pc(260) int local260 = -2;
		@Pc(262) int local262 = -2;
		if (arg1.aString62 != null) {
			local258 = local115;
			local256 = local55 - local39 / 2 - 5;
			local262 = local37 * Static635.aClass97_7.method2241() + local115 + 3;
			local260 = local39 + local256 + 10;
			if (arg1.anInt4949 != 0) {
				arg2.method8054(local262 - local115, local115, local260 - local256, local256, arg1.anInt4949);
			}
			if (arg1.anInt4983 != 0) {
				arg2.method8071(local260 - local256, local256, local115, arg1.anInt4983, local262 - local115);
			}
			for (@Pc(329) int local329 = 0; local329 < local37; local329++) {
				@Pc(335) String local335 = Static307.aStringArray39[local329];
				if (local37 - 1 > local329) {
					local335 = local335.substring(0, local335.length() - 4);
				}
				Static635.aClass97_7.method2245(arg2, local335, local55, local115, arg1.anInt4960);
				local115 += Static635.aClass97_7.method2241();
			}
		}
		if (arg1.anInt4962 == -1 && arg1.aString62 == null) {
			return;
		}
		@Pc(387) Class3_Sub3 local387 = new Class3_Sub3(arg0);
		local16 >>= 0x1;
		local387.anInt102 = local258;
		local387.anInt97 = local262;
		local387.anInt104 = local35 - local16;
		local387.anInt98 = local256;
		local387.anInt95 = local35 + local16;
		local387.anInt103 = local16 + local32;
		local387.anInt99 = local32 - local16;
		local387.anInt107 = local260;
		Static310.aClass302_27.method6613(local387);
	}
}
