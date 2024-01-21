import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!db", name = "h", descriptor = "Lclient!ai;")
	public static Class3_Sub3_Sub3 aClass3_Sub3_Sub3_1;

	@OriginalMember(owner = "client!db", name = "p", descriptor = "I")
	public static int anInt722;

	@OriginalMember(owner = "client!db", name = "c", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_316 = Static193.method3027("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!db", name = "d", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_317 = Static193.method3027("Ablegen");

	@OriginalMember(owner = "client!db", name = "f", descriptor = "I")
	public static int anInt719 = 0;

	@OriginalMember(owner = "client!db", name = "k", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_320 = Static193.method3027("This world is full)3");

	@OriginalMember(owner = "client!db", name = "g", descriptor = "Lclient!oc;")
	public static Class70 aClass70_318 = aClass70_320;

	@OriginalMember(owner = "client!db", name = "j", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_319 = Static193.method3027("Hidden");

	@OriginalMember(owner = "client!db", name = "m", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_321 = Static193.method3027("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!db", name = "n", descriptor = "Lclient!oc;")
	public static Class70 aClass70_322 = aClass70_319;

	@OriginalMember(owner = "client!db", name = "s", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_324 = Static193.method3027("Connecting to update server");

	@OriginalMember(owner = "client!db", name = "o", descriptor = "Lclient!oc;")
	public static Class70 aClass70_323 = aClass70_324;

	@OriginalMember(owner = "client!db", name = "t", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_325 = Static193.method3027("_");

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIII)V")
	public static void method576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) long local8 = Static41.method681(arg2, arg4, arg3);
		@Pc(19) int local19;
		@Pc(26) int local26;
		@Pc(31) int local31;
		@Pc(47) int local47;
		@Pc(62) int local62;
		if (local8 != 0L) {
			local19 = (int) local8 >> 20 & 0x3;
			local26 = (int) local8 >> 14 & 0x1F;
			@Pc(29) int[] local29 = Static19.aClass3_Sub3_Sub2_Sub1_1.anIntArray6;
			local31 = arg0;
			local47 = (52736 - arg3 * 512) * 4 + arg4 * 4 + 24624;
			if (local8 > 0L) {
				local31 = arg1;
			}
			local62 = Integer.MAX_VALUE & (int) (local8 >>> 32);
			@Pc(66) Class3_Sub3_Sub9 local66 = Static161.method2421(local62);
			if (local66.anInt1007 == -1) {
				if (local26 == 0 || local26 == 2) {
					if (local19 == 0) {
						local29[local47] = local31;
						local29[local47 + 512] = local31;
						local29[local47 + 1024] = local31;
						local29[local47 + 1536] = local31;
					} else if (local19 == 1) {
						local29[local47] = local31;
						local29[local47 + 1] = local31;
						local29[local47 + 2] = local31;
						local29[local47 + 3] = local31;
					} else if (local19 == 2) {
						local29[local47 + 3] = local31;
						local29[local47 + 3 + 512] = local31;
						local29[local47 + 1024 + 3] = local31;
						local29[local47 + 1536 + 3] = local31;
					} else if (local19 == 3) {
						local29[local47 + 1536] = local31;
						local29[local47 + 1537] = local31;
						local29[local47 + 1536 + 2] = local31;
						local29[local47 + 3 + 1536] = local31;
					}
				}
				if (local26 == 3) {
					if (local19 == 0) {
						local29[local47] = local31;
					} else if (local19 == 1) {
						local29[local47 + 3] = local31;
					} else if (local19 == 2) {
						local29[local47 + 1536 + 3] = local31;
					} else if (local19 == 3) {
						local29[local47 + 1536] = local31;
					}
				}
				if (local26 == 2) {
					if (local19 == 3) {
						local29[local47] = local31;
						local29[local47 + 512] = local31;
						local29[local47 + 1024] = local31;
						local29[local47 + 1536] = local31;
					} else if (local19 == 0) {
						local29[local47] = local31;
						local29[local47 + 1] = local31;
						local29[local47 + 2] = local31;
						local29[local47 + 3] = local31;
					} else if (local19 == 1) {
						local29[local47 + 3] = local31;
						local29[local47 + 512 + 3] = local31;
						local29[local47 + 1027] = local31;
						local29[local47 + 1539] = local31;
					} else if (local19 == 2) {
						local29[local47 + 1536] = local31;
						local29[local47 + 1 + 1536] = local31;
						local29[local47 + 1536 + 2] = local31;
						local29[local47 + 3 + 1536] = local31;
					}
				}
			} else {
				@Pc(377) Class3_Sub3_Sub2_Sub2 local377 = Static186.aClass3_Sub3_Sub2_Sub2Array10[local66.anInt1007];
				if (local377 != null) {
					@Pc(390) int local390 = (local66.anInt1002 * 4 - local377.anInt3216) / 2;
					@Pc(401) int local401 = (local66.anInt1010 * 4 - local377.anInt3220) / 2;
					local377.method2333(local401 + arg4 * 4 + 48, local390 + (-local66.anInt1002 + 104 + -arg3) * 4 + 48);
				}
			}
		}
		local8 = Static159.method2398(arg2, arg4, arg3);
		if (local8 != 0L) {
			local19 = (int) local8 >> 20 & 0x3;
			local26 = (int) local8 >> 14 & 0x1F;
			local31 = Integer.MAX_VALUE & (int) (local8 >>> 32);
			@Pc(458) Class3_Sub3_Sub9 local458 = Static161.method2421(local31);
			@Pc(479) int local479;
			if (local458.anInt1007 != -1) {
				@Pc(467) Class3_Sub3_Sub2_Sub2 local467 = Static186.aClass3_Sub3_Sub2_Sub2Array10[local458.anInt1007];
				if (local467 != null) {
					local479 = (local458.anInt1002 * 4 - local467.anInt3216) / 2;
					local62 = (local458.anInt1010 * 4 - local467.anInt3220) / 2;
					local467.method2333(arg4 * 4 + local62 + 48, local479 + (-local458.anInt1002 + -arg3 + 104) * 4 + 48);
				}
			} else if (local26 == 9) {
				@Pc(523) int[] local523 = Static19.aClass3_Sub3_Sub2_Sub1_1.anIntArray6;
				local47 = 15658734;
				if (local8 > 0L) {
					local47 = 15597568;
				}
				local479 = arg4 * 4 + (-(arg3 * 512) + 52736) * 4 + 24624;
				if (local19 == 0 || local19 == 2) {
					local523[local479 + 1536] = local47;
					local523[local479 + 1024 + 1] = local47;
					local523[local479 + 512 + 2] = local47;
					local523[local479 + 3] = local47;
				} else {
					local523[local479] = local47;
					local523[local479 + 512 + 1] = local47;
					local523[local479 + 2 + 1024] = local47;
					local523[local479 + 1536 + 3] = local47;
				}
			}
		}
		local8 = Static157.method2364(arg2, arg4, arg3);
		if (local8 == 0L) {
			return;
		}
		local19 = Integer.MAX_VALUE & (int) (local8 >>> 32);
		@Pc(636) Class3_Sub3_Sub9 local636 = Static161.method2421(local19);
		if (local636.anInt1007 == -1) {
			return;
		}
		@Pc(646) Class3_Sub3_Sub2_Sub2 local646 = Static186.aClass3_Sub3_Sub2_Sub2Array10[local636.anInt1007];
		if (local646 != null) {
			@Pc(659) int local659 = (local636.anInt1010 * 4 - local646.anInt3220) / 2;
			local47 = (local636.anInt1002 * 4 - local646.anInt3216) / 2;
			local646.method2333(local659 + arg4 * 4 + 48, (-local636.anInt1002 + -arg3 + 104) * 4 + 48 + local47);
			return;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!ke;Lclient!ke;ZZI)Lclient!pg;")
	public static Class3_Sub3_Sub20 method578(@OriginalArg(0) Class52 arg0, @OriginalArg(1) Class52 arg1, @OriginalArg(4) int arg2) {
		@Pc(1) boolean local1 = true;
		@Pc(6) int[] local6 = arg0.method1553(arg2);
		for (@Pc(8) int local8 = 0; local8 < local6.length; local8++) {
			@Pc(17) byte[] local17 = arg0.method1568(local6[local8], arg2);
			if (local17 == null) {
				local1 = false;
			} else {
				@Pc(36) int local36 = (local17[0] & 0xFF) << 8 | local17[1] & 0xFF;
				@Pc(44) byte[] local44 = arg1.method1568(0, local36);
				if (local44 == null) {
					local1 = false;
				}
			}
		}
		if (!local1) {
			return null;
		}
		try {
			return new Class3_Sub3_Sub20(arg0, arg1, arg2, false);
		} catch (@Pc(77) Exception local77) {
			return null;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZLjava/lang/Object;B)[B")
	public static byte[] method579(@OriginalArg(0) boolean arg0, @OriginalArg(1) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static67.method2290(local13) : local13;
		} else if (arg1 instanceof Class72) {
			@Pc(37) Class72 local37 = (Class72) arg1;
			return local37.method2100();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
