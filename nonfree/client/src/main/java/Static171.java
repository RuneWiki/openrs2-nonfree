import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!go", name = "h", descriptor = "I")
	public static int anInt3218 = -1;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!vda;Lclient!r;ILclient!wp;)V")
	public static void method2747(@OriginalArg(0) Class345 arg0, @OriginalArg(1) Class78 arg1, @OriginalArg(3) Class1_Sub51 arg2) {
		@Pc(10) Class5 local10 = arg0.method7483(arg1);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.E();
		if (local16 < local10.u()) {
			local16 = local10.u();
		}
		@Pc(28) int local28 = arg2.anInt9676;
		@Pc(31) int local31 = arg2.anInt9677;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(51) int local51;
		@Pc(74) int local74;
		if (arg0.aString101 != null) {
			local33 = Static439.aClass352_23.method7575(null, null, Static218.aStringArray8, arg0.aString101);
			for (local51 = 0; local51 < local33; local51++) {
				@Pc(57) String local57 = Static218.aStringArray8[local51];
				if (local51 < local33 - 1) {
					local57 = local57.substring(0, local57.length() - 4);
				}
				local74 = Static476.aClass204_7.method4353(local57);
				if (local35 < local74) {
					local35 = local74;
				}
			}
			local37 = Static476.aClass204_7.method4356() * local33 + Static476.aClass204_7.method4354() / 2;
		}
		local51 = arg2.anInt9676 + local16 / 2;
		if (local28 < Static287.anInt3855 + local16) {
			local28 = Static287.anInt3855;
			local51 = Static287.anInt3855 + local16 / 2 + local35 / 2 + 10 + 5;
		} else if (local28 > Static287.anInt3854 - local16) {
			local28 = Static287.anInt3854 - local16;
			local51 = Static287.anInt3854 - local16 / 2 - local35 / 2 - 10 - 5;
		}
		@Pc(160) int local160 = arg2.anInt9677;
		if (Static287.anInt3858 + local16 > local31) {
			local31 = Static287.anInt3858;
			local160 = local16 / 2 + Static287.anInt3858 + 10;
		} else if (Static287.anInt3864 - local16 < local31) {
			local31 = Static287.anInt3864 - local16;
			local160 = Static287.anInt3864 - local37 - local16 / 2 - 10;
		}
		local74 = (int) (Math.atan2((double) (local28 - arg2.anInt9676), (double) (local31 - arg2.anInt9677)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method7797((float) local28 + (float) local16 / 2.0F, (float) local16 / 2.0F + (float) local31, 4096, local74);
		@Pc(246) int local246 = -2;
		@Pc(248) int local248 = -2;
		@Pc(250) int local250 = -2;
		@Pc(252) int local252 = -2;
		if (arg0.aString101 != null) {
			local248 = local160;
			local246 = local51 - local35 / 2 - 5;
			local252 = local33 * Static476.aClass204_7.method4356() + local160 + 3;
			local250 = local35 + local246 + 10;
			if (arg0.anInt9167 != 0) {
				arg1.method6800(arg0.anInt9167, local252 - local160, local246, local250 - local246, local160);
			}
			if (arg0.anInt9193 != 0) {
				arg1.method6779(local160, arg0.anInt9193, local246, local250 - local246, -local160 + local252);
			}
			for (@Pc(320) int local320 = 0; local320 < local33; local320++) {
				@Pc(326) String local326 = Static218.aStringArray8[local320];
				if (local33 - 1 > local320) {
					local326 = local326.substring(0, local326.length() - 4);
				}
				Static476.aClass204_7.method4357(arg1, local326, local51, local160, arg0.anInt9169);
				local160 += Static476.aClass204_7.method4356();
			}
		}
		if (arg0.anInt9195 == -1 && arg0.aString101 == null) {
			return;
		}
		@Pc(369) Class1_Sub39 local369 = new Class1_Sub39(arg2);
		local16 >>= 0x1;
		local369.anInt7787 = local252;
		local369.anInt7788 = local28 - local16;
		local369.anInt7791 = local250;
		local369.anInt7786 = local28 + local16;
		local369.anInt7783 = local246;
		local369.anInt7790 = local31 + local16;
		local369.anInt7789 = local248;
		local369.anInt7784 = local31 - local16;
		Static49.aClass111_4.method2552(local369);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ZZI)V")
	public static void method2748(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			Static236.anInt8914++;
			Static204.method3116();
		}
		if (arg0) {
			Static414.anInt7793++;
			Static306.method3919();
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(B)V")
	public static void method2749() {
		@Pc(15) int local15 = Static75.anInt1461;
		@Pc(17) int[] local17 = Static167.anIntArray145;
		for (@Pc(19) int local19 = 0; local19 < local15; local19++) {
			@Pc(27) Class11_Sub1_Sub1_Sub3_Sub1 local27 = Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local17[local19]];
			if (local27 != null) {
				Static556.method7539(local27.method6058(), local27);
			}
		}
	}
}
