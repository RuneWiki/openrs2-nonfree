import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!qa", name = "y", descriptor = "I")
	public static int anInt3478;

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
	public static int anInt3468 = 0;

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "S")
	public static short aShort29 = 256;

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "I")
	public static int anInt3474 = 0;

	@OriginalMember(owner = "client!qa", name = "w", descriptor = "I")
	public static volatile int anInt3476 = 0;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)Lclient!c;")
	public static Class1_Sub1_Sub5 method2633(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub5 local10 = (Class1_Sub1_Sub5) Static213.aClass39_28.method1161((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27;
		if (arg0 >= 32768) {
			local27 = Static159.aClass7_33.method3242(0, arg0 & 0x7FFF);
		} else {
			local27 = Static30.aClass7_8.method3242(0, arg0);
		}
		local10 = new Class1_Sub1_Sub5();
		if (local27 != null) {
			local10.method363(new Class1_Sub9(local27));
		}
		if (arg0 >= 32768) {
			local10.method365();
		}
		Static213.aClass39_28.method1152((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[Lclient!ah;I)V")
	public static void method2634(@OriginalArg(1) Class6[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(9) int local9 = 0; local9 < arg0.length; local9++) {
			@Pc(15) Class6 local15 = arg0[local9];
			if (local15 != null && arg1 == local15.anInt204 && (!local15.aBoolean13 || !Static132.method2209(local15))) {
				if (local15.anInt233 == 0) {
					if (!local15.aBoolean13 && Static132.method2209(local15) && Static173.aClass6_15 != local15) {
						continue;
					}
					method2634(arg0, local15.anInt229);
					if (local15.aClass6Array1 != null) {
						method2634(local15.aClass6Array1, local15.anInt229);
					}
					@Pc(63) Class1_Sub11 local63 = (Class1_Sub11) Static10.aClass33_1.method1071((long) local15.anInt229);
					if (local63 != null) {
						Static153.method2603(local63.anInt1626);
					}
				}
				if (local15.anInt233 == 6) {
					@Pc(96) int local96;
					if (local15.anInt264 != -1 || local15.anInt213 != -1) {
						@Pc(91) boolean local91 = Static3.method60(local15);
						if (local91) {
							local96 = local15.anInt213;
						} else {
							local96 = local15.anInt264;
						}
						if (local96 != -1) {
							@Pc(108) Class1_Sub1_Sub21 local108 = Static74.method1343(local96);
							if (local108 != null) {
								local15.anInt258 += Static26.anInt594;
								while (local108.anIntArray450[local15.anInt269] < local15.anInt258) {
									local15.anInt258 -= local108.anIntArray450[local15.anInt269];
									local15.anInt269++;
									if (local15.anInt269 >= local108.anIntArray449.length) {
										local15.anInt269 -= local108.anInt3439;
										if (local15.anInt269 < 0 || local15.anInt269 >= local108.anIntArray449.length) {
											local15.anInt269 = 0;
										}
									}
									Static57.method1068(local15);
								}
							}
						}
					}
					if (local15.anInt224 != 0 && !local15.aBoolean13) {
						@Pc(188) int local188 = local15.anInt224 >> 16;
						local96 = local15.anInt224 << 16 >> 16;
						local96 *= Static26.anInt594;
						local15.anInt223 = local96 + local15.anInt223 & 0x7FF;
						@Pc(211) int local211 = local188 * Static26.anInt594;
						local15.anInt237 = local211 + local15.anInt237 & 0x7FF;
						Static57.method1068(local15);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)Z")
	public static boolean method2635(@OriginalArg(0) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!kh;I)V")
	public static void method2636(@OriginalArg(0) Class60 arg0) {
		try {
			Static130.anApplet_Sub1_1.getAppletContext().showDocument(arg0.method1800(Static130.anApplet_Sub1_1.getCodeBase()), "_blank");
		} catch (@Pc(10) Exception local10) {
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([BI)Lclient!mg;")
	public static Class1_Sub1_Sub14 method2637(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(17) Class1_Sub1_Sub14_Sub1_Sub1 local17 = new Class1_Sub1_Sub14_Sub1_Sub1(arg0, Static91.anIntArray251, Static97.anIntArray263, Static181.anIntArray504, Static10.anIntArray46, Static96.aByteArrayArray4);
			Static43.method711();
			return local17;
		}
	}
}
