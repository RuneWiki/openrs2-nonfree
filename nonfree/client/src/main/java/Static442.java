import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!qn", name = "h", descriptor = "I")
	public static int anInt7095;

	@OriginalMember(owner = "client!qn", name = "i", descriptor = "[I")
	public static int[] anIntArray480;

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_100 = new Class154(33, 7);

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "Lclient!dc;")
	public static final Class70 aClass70_45 = new Class70();

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)I")
	public static int method5787(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V")
	public static void method5788() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static416.aBooleanArray7[local3] = false;
		}
		Static582.anInt9451 = 0;
		Static2.anInt12 = -1;
		Static181.anInt2686 = 0;
		Static203.anInt2978 = -1;
		Static148.anInt2359 = -1;
		Static415.anInt1625 = Static584.anInt9487;
		Static427.anInt6931 = Static151.anInt2436;
		Static489.anInt7763 = 5;
		Static215.anInt3119 = Static396.anInt6527;
		Static272.anInt4717 = Static285.anInt2206;
		Static285.anInt2210 = Static532.anInt8757;
		Static360.anInt6111 = Static469.anInt7519;
		Static264.anInt4328 = -1;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZLclient!r;)V")
	public static void method5789(@OriginalArg(1) Class162 arg0) {
		arg0.da(0, 0, Static172.anInt2621, 350);
		arg0.J(0, 0, Static172.anInt2621, 350, Static240.anInt9590 << 24 | 0x332277, 1);
		@Pc(27) int local27 = 350 / Static276.anInt4774;
		@Pc(36) int local36;
		if (Static77.anInt1385 > 0) {
			local36 = 342 - Static276.anInt4774;
			@Pc(46) int local46 = local36 * local27 / (Static77.anInt1385 + local27 - 1);
			@Pc(48) int local48 = 4;
			if (Static77.anInt1385 > 1) {
				local48 = (local36 - local46) * (Static77.anInt1385 + -1 - Static533.anInt8769) / (Static77.anInt1385 - 1) + 4;
			}
			arg0.J(Static172.anInt2621 - 16, local48, 12, local46, Static240.anInt9590 << 24 | 0x332277, 2);
			for (@Pc(86) int local86 = Static533.anInt8769; local86 < Static533.anInt8769 + local27 && Static77.anInt1385 > local86; local86++) {
				@Pc(95) String[] local95 = Static439.method5762(Static311.aStringArray28[local86], '\b');
				@Pc(104) int local104 = (Static172.anInt2621 - 8 - 16) / local95.length;
				for (@Pc(106) int local106 = 0; local106 < local95.length; local106++) {
					@Pc(114) int local114 = local106 * local104 + 8;
					arg0.da(local114, 0, local114 + local104 - 8, 350);
					Static322.aClass37_20.method7723(local114, Static553.method7237(local95[local106]), -1, 350 - (local86 - Static533.anInt8769) * Static276.anInt4774 - Static266.aClass112_7.anInt2430 - Static64.anInt1146 - 2, -16777216);
				}
			}
		}
		Static71.aClass37_11.method7709(-1, "Build: 627", -16777216, Static172.anInt2621 - 25, 330);
		arg0.da(0, 0, Static172.anInt2621, 350);
		arg0.method6873(-1, 350 - Static64.anInt1146, 0, Static172.anInt2621);
		Static81.aClass37_16.method7723(10, "--> " + Static553.method7237(Static280.aString57), -1, 349 - Static537.aClass112_11.anInt2430, -16777216);
		if (!Static287.aBoolean374) {
			return;
		}
		local36 = -1;
		if (Static532.anInt8757 % 30 > 15) {
			local36 = 16777215;
		}
		arg0.method6834(local36, 12, 350 - Static537.aClass112_11.anInt2430 - 11, Static537.aClass112_11.method2078("--> " + Static553.method7237(Static280.aString57).substring(0, Static27.anInt452)) + 10);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IZIIIILclient!r;II)V")
	public static void method5790(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class162 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(18) Interface14 local18 = (Interface14) Static389.method5373(arg4, arg7, arg6);
		@Pc(27) Class216 local27;
		@Pc(33) int local33;
		@Pc(37) int local37;
		@Pc(44) int local44;
		if (local18 != null) {
			local27 = Static362.aClass290_2.method5799(local18.method7094());
			local33 = local18.method7093() & 0x3;
			local37 = local18.method7091();
			if (local27.anInt5273 == -1) {
				local44 = arg0;
				if (local27.anInt5275 > 0) {
					local44 = arg2;
				}
				if (local37 == 0 || local37 == 2) {
					if (local33 == 0) {
						arg5.method6834(local44, 4, arg1, arg3);
					} else if (local33 == 1) {
						arg5.method6873(local44, arg1, arg3, 4);
					} else if (local33 == 2) {
						arg5.method6834(local44, 4, arg1, arg3 + 3);
					} else if (local33 == 3) {
						arg5.method6873(local44, arg1 + 3, arg3, 4);
					}
				}
				if (local37 == 3) {
					if (local33 == 0) {
						arg5.method6885(arg1, local44, 1, arg3, 1);
					} else if (local33 == 1) {
						arg5.method6885(arg1, local44, 1, arg3 + 3, 1);
					} else if (local33 == 2) {
						arg5.method6885(arg1 + 3, local44, 1, arg3 + 3, 1);
					} else if (local33 == 3) {
						arg5.method6885(arg1 + 3, local44, 1, arg3, 1);
					}
				}
				if (local37 == 2) {
					if (local33 == 0) {
						arg5.method6873(local44, arg1, arg3, 4);
					} else if (local33 == 1) {
						arg5.method6834(local44, 4, arg1, arg3 + 3);
					} else if (local33 == 2) {
						arg5.method6873(local44, arg1 + 3, arg3, 4);
					} else if (local33 == 3) {
						arg5.method6834(local44, 4, arg1, arg3);
					}
				}
			} else {
				Static585.method7586(local33, arg5, local27, arg3, arg1);
			}
		}
		local18 = (Interface14) Static32.method551(arg4, arg7, arg6, je.class);
		if (local18 != null) {
			local27 = Static362.aClass290_2.method5799(local18.method7094());
			local33 = local18.method7093() & 0x3;
			local37 = local18.method7091();
			if (local27.anInt5273 != -1) {
				Static585.method7586(local33, arg5, local27, arg3, arg1);
			} else if (local37 == 9) {
				local44 = -1118482;
				if (local27.anInt5275 > 0) {
					local44 = -1179648;
				}
				if (local33 == 0 || local33 == 2) {
					arg5.method6849(arg3, arg1, arg1 + 3, arg3 - -3, local44);
				} else {
					arg5.method6849(arg3, arg1 + 3, arg1, arg3 + 3, local44);
				}
			}
		}
		local18 = (Interface14) Static347.method5019(arg4, arg7, arg6);
		if (local18 == null) {
			return;
		}
		local27 = Static362.aClass290_2.method5799(local18.method7094());
		local33 = local18.method7093() & 0x3;
		if (local27.anInt5273 != -1) {
			Static585.method7586(local33, arg5, local27, arg3, arg1);
			return;
		}
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(II)Z")
	public static boolean method5791(@OriginalArg(1) int arg0) {
		return arg0 == 4 || arg0 == 8 || arg0 == 11;
	}
}
