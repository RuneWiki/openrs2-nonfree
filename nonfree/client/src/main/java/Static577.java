import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static577 {

	@OriginalMember(owner = "client!um", name = "k", descriptor = "I")
	public static int anInt9531;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "Lclient!cv;")
	public static final Class62 aClass62_4 = new Class62();

	@OriginalMember(owner = "client!um", name = "h", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_162 = new Class274(82, 6);

	@OriginalMember(owner = "client!um", name = "a", descriptor = "([ILclient!fca;II)V")
	public static void method8014(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class11_Sub1_Sub1_Sub2_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) boolean local10;
		@Pc(12) int local12;
		if (arg1.anIntArray226 != null) {
			local10 = true;
			for (local12 = 0; local12 < arg1.anIntArray226.length; local12++) {
				if (arg1.anIntArray226[local12] != arg0[local12]) {
					local10 = false;
					break;
				}
			}
			if (local10 && arg1.anInt3258 != -1) {
				@Pc(48) Class149 local48 = Static185.aClass303_1.method7201(arg1.anInt3258);
				@Pc(51) int local51 = local48.anInt4516;
				if (local51 == 1) {
					arg1.anInt3225 = 0;
					arg1.anInt3263 = 0;
					arg1.anInt3235 = 1;
					arg1.anInt3232 = arg2;
					arg1.anInt3257 = 0;
					if (!arg1.aBoolean276) {
						Static330.method3630(arg1.anInt3263, local48, arg1);
					}
				}
				if (local51 == 2) {
					arg1.anInt3257 = 0;
				}
			}
		}
		local10 = true;
		for (local12 = 0; local12 < arg0.length; local12++) {
			if (arg0[local12] != -1) {
				local10 = false;
			}
			if (arg1.anIntArray226 == null || arg1.anIntArray226[local12] == -1 || Static185.aClass303_1.method7201(arg0[local12]).anInt4518 >= Static185.aClass303_1.method7201(arg1.anIntArray226[local12]).anInt4518) {
				arg1.anIntArray226 = arg0;
				arg1.anInt3232 = arg2;
				arg1.anInt3294 = arg1.anInt3296;
			}
		}
		if (local10) {
			arg1.anInt3294 = arg1.anInt3296;
			arg1.anInt3232 = arg2;
			arg1.anIntArray226 = arg0;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method8015(@OriginalArg(1) Class87 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static558.aBoolean680) {
			local7 = Static257.method4233();
			local9 = Static290.method4545();
		}
		arg0.KA(local7, local9, local7 + Static571.anInt9399, local9 + 350);
		arg0.aa(local7, local9, Static571.anInt9399, 350, Static436.anInt7762 << 24 | 0x332277, 1);
		Static233.method3884(local9 + 350, local9, local7, local7 + Static571.anInt9399);
		@Pc(53) int local53 = 350 / Static60.anInt1261;
		@Pc(63) int local63;
		if (Static534.anInt8920 > 0) {
			local63 = 342 - Static60.anInt1261;
			@Pc(73) int local73 = local53 * local63 / (Static534.anInt8920 + local53 - 1);
			@Pc(75) int local75 = 4;
			if (Static534.anInt8920 > 1) {
				local75 = (local63 - local73) * ((Static534.anInt8920 - Static195.anInt9449) + -1) / (Static534.anInt8920 - 1) + 4;
			}
			arg0.aa(Static571.anInt9399 + local7 - 16, local9 + local75, 12, local73, Static436.anInt7762 << 24 | 0x332277, 2);
			for (@Pc(114) int local114 = Static195.anInt9449; local114 < local53 + Static195.anInt9449 && local114 < Static534.anInt8920; local114++) {
				@Pc(123) String[] local123 = Static218.method3754('\b', Static177.aStringArray9[local114]);
				@Pc(130) int local130 = (Static571.anInt9399 - 24) / local123.length;
				for (@Pc(132) int local132 = 0; local132 < local123.length; local132++) {
					@Pc(140) int local140 = local132 * local130 + 8;
					arg0.KA(local140 + local7, local9, local140 + local7 + local130 - 8, local9 - -350);
					Static428.aClass64_11.method7508(local9 + 350 - Static60.anInt1261 * (local114 - Static195.anInt9449) - Static305.aClass114_29.anInt3631 - Static581.anInt9556 - 2, Static451.method6638(local123[local132]), -16777216, local140 + local7, -1);
				}
			}
		}
		Static573.aClass64_15.method7504(Static571.anInt9399 + local7 - 25, -16777216, -1, "Build: 629", local9 + 330);
		arg0.KA(local7, local9, Static571.anInt9399 + local7, local9 + 350);
		arg0.method7888(local9 + 350 - Static581.anInt9556, Static571.anInt9399, -1, local7);
		Static4.aClass64_1.method7508(local9 + 350 - Static240.aClass114_19.anInt3631 - 1, "--> " + Static451.method6638(Static216.aString49), -16777216, local7 + 10, -1);
		if (!Static540.aBoolean661) {
			return;
		}
		local63 = -1;
		if (Static325.anInt5888 % 30 > 15) {
			local63 = 16777215;
		}
		arg0.method7921(local7 + Static240.aClass114_19.method3015("--> " + Static451.method6638(Static216.aString49).substring(0, Static209.anInt4374)) + 10, local63, local9 + 350 - Static240.aClass114_19.anInt3631 - 11, 12);
	}
}
