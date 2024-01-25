import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static591 {

	@OriginalMember(owner = "client!wr", name = "e", descriptor = "I")
	public static int anInt9673;

	@OriginalMember(owner = "client!wr", name = "h", descriptor = "I")
	public static int anInt9676;

	@OriginalMember(owner = "client!wr", name = "j", descriptor = "Lclient!f;")
	public static Class14 aClass14_34;

	@OriginalMember(owner = "client!wr", name = "g", descriptor = "I")
	public static int anInt9675 = 0;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!tf;Ljava/lang/String;ZI)Lclient!wb;")
	public static Class355 method7906(@OriginalArg(0) Class322 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		@Pc(15) int local15 = arg0.method6823(arg1);
		if (local15 == -1) {
			return new Class355(0);
		}
		@Pc(29) int[] local29 = arg0.method6800(local15);
		@Pc(35) Class355 local35 = new Class355(local29.length);
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		while (true) {
			while (local37 < local35.anInt9289) {
				@Pc(53) Class3_Sub11 local53 = new Class3_Sub11(arg0.method6802(local15, local29[local39++]));
				@Pc(57) int local57 = local53.method5186();
				@Pc(61) int local61 = local53.method5198();
				@Pc(65) int local65 = local53.method5175();
				if (!arg2 && local65 == 1) {
					local35.anInt9289--;
				} else {
					local35.anIntArray592[local37] = local57;
					local35.anIntArray593[local37] = local61;
					local37++;
				}
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIIIIIII)Z")
	public static boolean method7907(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static304.method4456(arg1, arg6, arg2)) {
			return false;
		}
		@Pc(15) int local15 = Static398.anIntArray424[0];
		@Pc(19) int local19 = Static398.anIntArray424[1];
		@Pc(23) int local23 = Static398.anIntArray424[2];
		if (!Static304.method4456(arg3, arg4, arg8)) {
			return false;
		}
		@Pc(35) int local35 = Static398.anIntArray424[1];
		@Pc(39) int local39 = Static398.anIntArray424[0];
		@Pc(48) int local48 = Static398.anIntArray424[2];
		if (Static304.method4456(arg0, arg5, arg7)) {
			@Pc(60) int local60 = Static398.anIntArray424[1];
			@Pc(64) int local64 = Static398.anIntArray424[0];
			@Pc(68) int local68 = Static398.anIntArray424[2];
			return Static48.method753(local23, local64, local48, local39, local19, local35, local60, local68, local15);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!r;ILclient!qp;III)V")
	public static void method7909(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class280 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) Class120 local9 = Static350.aClass87_3.method2536(arg2.anInt7383);
		if (local9.anInt3558 == -1) {
			return;
		}
		if (arg2.aBoolean557) {
			@Pc(24) int local24 = arg1 + arg2.anInt7389;
			arg1 = local24 & 0x3;
		} else {
			arg1 = 0;
		}
		@Pc(40) Class14 local40 = local9.method3174(arg2.aBoolean553, arg0, arg1);
		if (local40 == null) {
			return;
		}
		@Pc(46) int local46 = arg2.anInt7391;
		@Pc(49) int local49 = arg2.anInt7396;
		if ((arg1 & 0x1) == 1) {
			local46 = arg2.anInt7396;
			local49 = arg2.anInt7391;
		}
		@Pc(63) int local63 = local40.A();
		@Pc(66) int local66 = local40.ca();
		if (local9.aBoolean272) {
			local66 = local49 * 4;
			local63 = local46 * 4;
		}
		if (local9.anInt3557 == 0) {
			local40.method7681(arg3, arg4 - (local49 - 1) * 4, local63, local66);
		} else {
			local40.method7676(arg3, arg4 + 4 - local49 * 4, local63, local66, 0, local9.anInt3557 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(BLclient!lw;Lclient!sb;)Lclient!qq;")
	public static Class3_Sub42 method7910(@OriginalArg(1) Class199 arg0, @OriginalArg(2) Class303 arg1) {
		@Pc(10) Class3_Sub42 local10 = Static168.method3021();
		local10.aClass303_79 = arg1;
		local10.anInt7409 = arg1.anInt7886;
		if (local10.anInt7409 == -1) {
			local10.aClass3_Sub11_Sub1_1 = new Class3_Sub11_Sub1(260);
		} else if (local10.anInt7409 == -2) {
			local10.aClass3_Sub11_Sub1_1 = new Class3_Sub11_Sub1(10000);
		} else if (local10.anInt7409 <= 18) {
			local10.aClass3_Sub11_Sub1_1 = new Class3_Sub11_Sub1(20);
		} else if (local10.anInt7409 > 98) {
			local10.aClass3_Sub11_Sub1_1 = new Class3_Sub11_Sub1(260);
		} else {
			local10.aClass3_Sub11_Sub1_1 = new Class3_Sub11_Sub1(100);
		}
		local10.aClass3_Sub11_Sub1_1.method1387(arg0);
		local10.aClass3_Sub11_Sub1_1.method1388(local10.aClass303_79.method6556());
		local10.anInt7408 = 0;
		return local10;
	}
}
