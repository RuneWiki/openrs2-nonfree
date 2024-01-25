import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "Lclient!gh;")
	public static Class118 aClass118_1;

	@OriginalMember(owner = "client!bq", name = "k", descriptor = "Lclient!oca;")
	public static Class235 aClass235_2;

	@OriginalMember(owner = "client!bq", name = "u", descriptor = "Lclient!uw;")
	public static Class348 aClass348_2;

	@OriginalMember(owner = "client!bq", name = "v", descriptor = "Lclient!oh;")
	public static Class237 aClass237_16;

	@OriginalMember(owner = "client!bq", name = "h", descriptor = "Lclient!uw;")
	public static final Class348 aClass348_1 = new Class348("RC", 1);

	@OriginalMember(owner = "client!bq", name = "w", descriptor = "Lclient!gt;")
	public static final Class123 aClass123_1 = new Class123();

	@OriginalMember(owner = "client!bq", name = "y", descriptor = "I")
	public static int anInt1659 = 0;

	@OriginalMember(owner = "client!bq", name = "z", descriptor = "Lclient!gt;")
	public static final Class123 aClass123_2 = new Class123();

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!pia;ILclient!ub;)Lclient!kw;")
	public static Class8_Sub31 method1418(@OriginalArg(0) Class257 arg0, @OriginalArg(2) Class336 arg1) {
		@Pc(8) Class8_Sub31 local8 = Static366.method5703();
		local8.anInt5975 = arg0.anInt8007;
		local8.aClass257_56 = arg0;
		if (local8.anInt5975 == -1) {
			local8.aClass8_Sub8_Sub2_1 = new Class8_Sub8_Sub2(260);
		} else if (local8.anInt5975 == -2) {
			local8.aClass8_Sub8_Sub2_1 = new Class8_Sub8_Sub2(10000);
		} else if (local8.anInt5975 <= 18) {
			local8.aClass8_Sub8_Sub2_1 = new Class8_Sub8_Sub2(20);
		} else if (local8.anInt5975 > 98) {
			local8.aClass8_Sub8_Sub2_1 = new Class8_Sub8_Sub2(260);
		} else {
			local8.aClass8_Sub8_Sub2_1 = new Class8_Sub8_Sub2(100);
		}
		local8.aClass8_Sub8_Sub2_1.method8588(arg1);
		local8.aClass8_Sub8_Sub2_1.method8591(local8.aClass257_56.method6642());
		local8.anInt5971 = 0;
		return local8;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(B)V")
	public static void method1419() {
		if (Static211.anInt4955 < 0) {
			return;
		}
		@Pc(15) long local15 = Static342.method5463();
		Static211.anInt4955 = (int) ((long) Static211.anInt4955 + Static37.aLong31 - local15);
		if (Static211.anInt4955 <= 0) {
			Static237.anInt5337 = Static323.aClass216_1.anInt6825;
			Static111.aFloat62 = Static323.aClass216_1.aFloat133;
			Static278.aFloat109 = Static323.aClass216_1.aFloat130;
			Static291.aClass40_2 = Static323.aClass216_1.aClass40_3;
			Static227.aFloat100 = Static323.aClass216_1.aFloat129;
			Static540.anInt9398 = Static323.aClass216_1.anInt6823;
			Static564.aFloat190 = Static323.aClass216_1.aFloat134;
			Static119.aFloat75 = Static323.aClass216_1.aFloat135;
			Static211.anInt4955 = -1;
			Static382.anInt7435 = Static323.aClass216_1.anInt6833;
			Static623.aFloat127 = Static323.aClass216_1.aFloat132;
		} else {
			@Pc(69) int local69 = (Static211.anInt4955 << 8) / Static523.anInt9088;
			@Pc(73) int local73 = 255 - local69;
			@Pc(78) float local78 = (float) local69 / 255.0F;
			Static382.anInt7435 = (local73 * (Static323.aClass216_1.anInt6833 & 0xFF00) + (Static254.anInt4211 & 0xFF00) * local69 & 0xFF0000) + (local73 * (Static323.aClass216_1.anInt6833 & 0xFF00FF) + (Static254.anInt4211 & 0xFF00FF) * local69 & 0xFF00FF00) >>> 8;
			@Pc(115) float local115 = 1.0F - local78;
			Static278.aFloat109 = local115 * (Static323.aClass216_1.aFloat130 - Static2.aFloat99) + Static2.aFloat99;
			Static119.aFloat75 = Static300.aFloat111 + (Static323.aClass216_1.aFloat135 - Static300.aFloat111) * local115;
			Static237.anInt5337 = ((Static165.anInt4065 & 0xFF00FF) * local69 + (Static323.aClass216_1.anInt6825 & 0xFF00FF) * local73 & 0xFF00FF00) + (local69 * (Static165.anInt4065 & 0xFF00) + local73 * (Static323.aClass216_1.anInt6825 & 0xFF00) & 0xFF0000) >>> 8;
			Static564.aFloat190 = (Static323.aClass216_1.aFloat134 - Static394.aFloat173) * local115 + Static394.aFloat173;
			Static623.aFloat127 = Static622.aFloat198 + (Static323.aClass216_1.aFloat132 - Static622.aFloat198) * local115;
			Static111.aFloat62 = Static596.aFloat195 + (Static323.aClass216_1.aFloat133 - Static596.aFloat195) * local115;
			Static540.anInt9398 = Static575.anInt9880 * local69 + local73 * Static323.aClass216_1.anInt6823 >> 8;
			Static227.aFloat100 = Static616.aFloat197 + (Static323.aClass216_1.aFloat129 - Static616.aFloat197) * local115;
			if (Static323.aClass216_1.aClass40_3 != Static220.aClass40_1) {
				Static291.aClass40_2 = Static274.aClass16_12.method6067(Static220.aClass40_1, Static323.aClass216_1.aClass40_3, local115, Static291.aClass40_2);
			}
		}
		Static37.aLong31 = local15;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IILclient!wi;Lclient!ha;)V")
	public static void method1423(@OriginalArg(1) int arg0, @OriginalArg(2) Class372 arg1, @OriginalArg(3) Class16 arg2) {
		@Pc(13) int local13;
		if (Static336.anIntArray371 != null && arg0 <= arg1.aByte128) {
			for (local13 = 0; local13 < Static336.anIntArray371.length; local13++) {
				if (Static336.anIntArray371[local13] != -1000000 && (Static336.anIntArray371[local13] >= arg1.anIntArray617[0] || Static336.anIntArray371[local13] >= arg1.anIntArray617[1] || arg1.anIntArray617[2] <= Static336.anIntArray371[local13] || arg1.anIntArray617[3] <= Static336.anIntArray371[local13]) && (arg1.anIntArray618[0] <= Static573.anIntArray544[local13] || Static573.anIntArray544[local13] >= arg1.anIntArray618[1] || arg1.anIntArray618[2] <= Static573.anIntArray544[local13] || arg1.anIntArray618[3] <= Static573.anIntArray544[local13]) && (arg1.anIntArray618[0] >= Static595.anIntArray595[local13] || arg1.anIntArray618[1] >= Static595.anIntArray595[local13] || Static595.anIntArray595[local13] <= arg1.anIntArray618[2] || arg1.anIntArray618[3] >= Static595.anIntArray595[local13]) && (Static265.anIntArray331[local13] >= arg1.anIntArray619[0] || arg1.anIntArray619[1] <= Static265.anIntArray331[local13] || Static265.anIntArray331[local13] >= arg1.anIntArray619[2] || arg1.anIntArray619[3] <= Static265.anIntArray331[local13]) && (arg1.anIntArray619[0] >= Static260.anIntArray324[local13] || arg1.anIntArray619[1] >= Static260.anIntArray324[local13] || arg1.anIntArray619[2] >= Static260.anIntArray324[local13] || arg1.anIntArray619[3] >= Static260.anIntArray324[local13])) {
					return;
				}
			}
		}
		@Pc(264) int local264;
		@Pc(284) int local284;
		@Pc(301) boolean local301;
		@Pc(329) float local329;
		if (arg1.aByte129 == 1) {
			local13 = Static183.anInt4307 + arg1.aShort125 - Static603.anInt10257;
			if (local13 >= 0 && local13 <= Static183.anInt4307 + Static183.anInt4307) {
				local264 = arg1.aShort123 + Static183.anInt4307 - Static470.anInt8495;
				if (local264 < 0) {
					local264 = 0;
				} else if (local264 > Static183.anInt4307 + Static183.anInt4307) {
					return;
				}
				local284 = Static183.anInt4307 + arg1.aShort122 - Static470.anInt8495;
				if (local284 > Static183.anInt4307 + Static183.anInt4307) {
					local284 = Static183.anInt4307 + Static183.anInt4307;
				} else if (local284 < 0) {
					return;
				}
				local301 = false;
				while (local264 <= local284) {
					if (Static100.aBooleanArrayArray3[local13][local264++]) {
						local301 = true;
						break;
					}
				}
				if (local301) {
					local329 = Static143.anInt3624 - arg1.anIntArray618[0];
					if (local329 < 0.0F) {
						local329 *= -1.0F;
					}
					if (!local329 < (float) Static468.anInt10546 && (Static184.method3506(0, arg1) && (Static184.method3506(1, arg1) && (Static184.method3506(2, arg1) && Static184.method3506(3, arg1))))) {
						Static16.aClass372Array1[Static396.anInt9377++] = arg1;
					}
				}
			}
		} else if (arg1.aByte129 == 2) {
			local13 = arg1.aShort123 + Static183.anInt4307 - Static470.anInt8495;
			if (local13 >= 0 && Static183.anInt4307 + Static183.anInt4307 >= local13) {
				local264 = Static183.anInt4307 + arg1.aShort125 - Static603.anInt10257;
				if (local264 < 0) {
					local264 = 0;
				} else if (Static183.anInt4307 + Static183.anInt4307 < local264) {
					return;
				}
				local284 = arg1.aShort124 + Static183.anInt4307 - Static603.anInt10257;
				if (local284 > Static183.anInt4307 + Static183.anInt4307) {
					local284 = Static183.anInt4307 + Static183.anInt4307;
				} else if (local284 < 0) {
					return;
				}
				local301 = false;
				while (local284 >= local264) {
					if (Static100.aBooleanArrayArray3[local264++][local13]) {
						local301 = true;
						break;
					}
				}
				if (local301) {
					local329 = Static11.anInt160 - arg1.anIntArray619[0];
					if (local329 < 0.0F) {
						local329 *= -1.0F;
					}
					if (!(local329 < (float) Static468.anInt10546) && (Static184.method3506(0, arg1) && (Static184.method3506(1, arg1) && (Static184.method3506(2, arg1) && Static184.method3506(3, arg1))))) {
						Static16.aClass372Array1[Static396.anInt9377++] = arg1;
					}
				}
			}
		} else if (arg1.aByte129 == 16 || arg1.aByte129 == 8) {
			local13 = arg1.aShort125 + Static183.anInt4307 - Static603.anInt10257;
			if (local13 >= 0 && local13 <= Static183.anInt4307 + Static183.anInt4307) {
				local264 = Static183.anInt4307 + arg1.aShort123 - Static470.anInt8495;
				if (local264 >= 0 && Static183.anInt4307 + Static183.anInt4307 >= local264 && Static100.aBooleanArrayArray3[local13][local264]) {
					@Pc(594) float local594 = (float) (Static143.anInt3624 - arg1.anIntArray618[0]);
					if (local594 < 0.0F) {
						local594 *= -1.0F;
					}
					@Pc(611) float local611 = (float) (Static11.anInt160 - arg1.anIntArray619[0]);
					if (local611 < 0.0F) {
						local611 *= -1.0F;
					}
					if ((!(local594 < (float) Static468.anInt10546) || !(local611 < (float) Static468.anInt10546)) && (Static184.method3506(0, arg1) && (Static184.method3506(1, arg1) && (Static184.method3506(2, arg1) && Static184.method3506(3, arg1))))) {
						Static16.aClass372Array1[Static396.anInt9377++] = arg1;
					}
				}
			}
		} else if (arg1.aByte129 == 4) {
			@Pc(681) float local681 = (float) (arg1.anIntArray617[0] - Static564.anInt9725);
			if (!(local681 <= (float) Static340.anInt6654)) {
				local264 = arg1.aShort123 + Static183.anInt4307 - Static470.anInt8495;
				if (local264 < 0) {
					local264 = 0;
				} else if (local264 > Static183.anInt4307 + Static183.anInt4307) {
					return;
				}
				local284 = arg1.aShort122 + Static183.anInt4307 - Static470.anInt8495;
				if (local284 > Static183.anInt4307 + Static183.anInt4307) {
					local284 = Static183.anInt4307 + Static183.anInt4307;
				} else if (local284 < 0) {
					return;
				}
				@Pc(749) int local749 = Static183.anInt4307 + arg1.aShort125 - Static603.anInt10257;
				if (local749 < 0) {
					local749 = 0;
				} else if (local749 > Static183.anInt4307 + Static183.anInt4307) {
					return;
				}
				@Pc(770) int local770 = Static183.anInt4307 + arg1.aShort124 - Static603.anInt10257;
				if (local770 > Static183.anInt4307 + Static183.anInt4307) {
					local770 = Static183.anInt4307 + Static183.anInt4307;
				} else if (local770 < 0) {
					return;
				}
				@Pc(790) boolean local790 = false;
				label283: for (@Pc(792) int local792 = local749; local792 <= local770; local792++) {
					for (@Pc(796) int local796 = local264; local796 <= local284; local796++) {
						if (Static100.aBooleanArrayArray3[local792][local796]) {
							local790 = true;
							break label283;
						}
					}
				}
				if (local790 && (Static184.method3506(0, arg1) && (Static184.method3506(1, arg1) && (Static184.method3506(2, arg1) && Static184.method3506(3, arg1))))) {
					Static16.aClass372Array1[Static396.anInt9377++] = arg1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IBI)Z")
	public static boolean method1425(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}
}
