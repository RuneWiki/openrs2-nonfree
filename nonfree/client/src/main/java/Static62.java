import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!eg", name = "I", descriptor = "[Lclient!db;")
	public static Class1_Sub5_Sub4[] aClass1_Sub5_Sub4Array3 = new Class1_Sub5_Sub4[14];

	@OriginalMember(owner = "client!eg", name = "Q", descriptor = "Z")
	public static boolean aBoolean129 = false;

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(BI)Z")
	public static boolean method1102(@OriginalArg(1) int arg0) {
		@Pc(40) int local40;
		@Pc(42) int local42;
		@Pc(85) int local85;
		@Pc(89) int local89;
		if (Static209.aClass1_Sub5_Sub6_Sub1_3 == null) {
			if (Static71.aBoolean165 || Static263.aClass1_Sub5_Sub6_9 == null) {
				Static209.aClass1_Sub5_Sub6_Sub1_3 = new Class1_Sub5_Sub6_Sub1(512, 512);
			} else {
				Static209.aClass1_Sub5_Sub6_Sub1_3 = (Class1_Sub5_Sub6_Sub1) Static263.aClass1_Sub5_Sub6_9;
			}
			@Pc(37) int[] local37 = Static209.aClass1_Sub5_Sub6_Sub1_3.anIntArray117;
			local40 = local37.length;
			for (local42 = 0; local42 < local40; local42++) {
				local37[local42] = 1;
			}
			for (local42 = 1; local42 < 103; local42++) {
				local85 = (103 - local42) * 512 * 4 + 24628;
				for (local89 = 1; local89 < 103; local89++) {
					if ((Static17.aByteArrayArrayArray1[arg0][local89][local42] & 0x18) == 0) {
						Static94.method1803(local37, local85, arg0, local89, local42);
					}
					if (arg0 < 3 && (Static17.aByteArrayArrayArray1[arg0 + 1][local89][local42] & 0x8) != 0) {
						Static94.method1803(local37, local85, arg0 + 1, local89, local42);
					}
					local85 += 4;
				}
			}
			Static183.anInt3509 = 0;
			for (local42 = 0; local42 < 104; local42++) {
				for (local85 = 0; local85 < 104; local85++) {
					@Pc(173) long local173 = Static277.method4241(arg0, local42 + 0, local85);
					if (local173 == 0L) {
						local173 = Static209.method3471(arg0, local42 + 0, local85);
					}
					if (local173 == 0L) {
						local173 = Static234.method3768(arg0, local42 + 0, local85);
					}
					if (local173 == 0L) {
						local173 = Static295.method4410(arg0, local42 + 0, local85);
					}
					if (local173 != 0L) {
						@Pc(228) Class150 local228 = Static160.method2744((int) (local173 >>> 32) & Integer.MAX_VALUE);
						if (!local228.aBoolean422 || Static217.aBoolean369) {
							@Pc(236) int local236 = local228.anInt4544;
							if (local228.anIntArray507 != null) {
								for (@Pc(242) int local242 = 0; local242 < local228.anIntArray507.length; local242++) {
									if (local228.anIntArray507[local242] != -1) {
										@Pc(262) Class150 local262 = Static160.method2744(local228.anIntArray507[local242]);
										if (local262.anInt4544 >= 0) {
											local236 = local262.anInt4544;
										}
									}
								}
							}
							if (local236 >= 0) {
								@Pc(279) boolean local279 = false;
								@Pc(283) Class136 local283 = Static160.method2739(local236);
								if (local283 != null && local283.aBoolean365) {
									local279 = true;
								}
								@Pc(294) int local294 = local42;
								@Pc(299) int local299 = local85;
								if (local279) {
									@Pc(307) int[][] local307 = Static122.aClass60Array1[arg0].anIntArrayArray12;
									for (@Pc(309) int local309 = 0; local309 < 10; local309++) {
										@Pc(319) int local319 = (int) (Math.random() * 4.0D);
										if (local319 == 0 && local294 > 0 && local42 - 3 < local294 && (local307[local294 - 1][local299] & 0x2C0108) == 0) {
											local294--;
										}
										if (local319 == 1 && local294 < 103 && local42 + 3 > local294 && (local307[local294 + 1][local299] & 0x2C0180) == 0) {
											local294++;
										}
										if (local319 == 2 && local299 > 0 && local299 > local85 - 3 && (local307[local294][local299 - 1] & 0x2C0102) == 0) {
											local299--;
										}
										if (local319 == 3 && local299 < 103 && local85 + 3 > local299 && (local307[local294][local299 + 1] & 0x2C0120) == 0) {
											local299++;
										}
									}
								}
								Static146.anIntArray257[Static183.anInt3509] = local228.anInt4558;
								Static209.anIntArray439[Static183.anInt3509] = local294;
								Static133.anIntArray208[Static183.anInt3509] = local299;
								Static183.anInt3509++;
							}
						}
					}
				}
			}
		}
		@Pc(486) int local486 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (int) (Math.random() * 20.0D) + 238 - 10;
		Static209.aClass1_Sub5_Sub6_Sub1_3.method1281();
		local40 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		for (local42 = 1; local42 < 103; local42++) {
			for (local85 = 1; local85 < 103; local85++) {
				if ((Static17.aByteArrayArrayArray1[arg0][local85][local42] & 0x18) == 0 && !Static166.method2827(local40, local85, local42, local486, arg0)) {
					if (Static71.aBoolean165) {
						Static77.anIntArray131 = null;
					} else {
						Static82.aClass130_1.method4485();
					}
					return false;
				}
				if (arg0 < 3 && (Static17.aByteArrayArrayArray1[arg0 + 1][local85][local42] & 0x8) != 0 && !Static166.method2827(local40, local85, local42, local486, arg0 + 1)) {
					if (Static71.aBoolean165) {
						Static77.anIntArray131 = null;
					} else {
						Static82.aClass130_1.method4485();
					}
					return false;
				}
			}
		}
		if (Static71.aBoolean165) {
			@Pc(606) int[] local606 = Static209.aClass1_Sub5_Sub6_Sub1_3.anIntArray117;
			local85 = local606.length;
			for (local89 = 0; local89 < local85; local89++) {
				if (local606[local89] == 0) {
					local606[local89] = 1;
				}
			}
			Static263.aClass1_Sub5_Sub6_9 = new Class1_Sub5_Sub6_Sub2(Static209.aClass1_Sub5_Sub6_Sub1_3);
		} else {
			Static263.aClass1_Sub5_Sub6_9 = Static209.aClass1_Sub5_Sub6_Sub1_3;
		}
		if (Static71.aBoolean165) {
			Static77.anIntArray131 = null;
		} else {
			Static82.aClass130_1.method4485();
		}
		Static209.aClass1_Sub5_Sub6_Sub1_3 = null;
		return true;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "()V")
	public static void method1103() {
		@Pc(1) GL local1 = Static71.aGL1;
		local1.glDisableClientState(32886);
		Static71.method1411(false);
		local1.glDisable(2929);
		local1.glPushAttrib(128);
		local1.glFogf(2915, 3072.0F);
		Static71.method1384();
		for (@Pc(19) int local19 = 0; local19 < Static213.aClass1_Sub15ArrayArray37[0].length; local19++) {
			@Pc(31) Class1_Sub15 local31 = Static213.aClass1_Sub15ArrayArray37[0][local19];
			if (local31.anInt2503 >= 0 && Static89.method1730(Static119.anInterface5_1.method1483(local31.anInt2503))) {
				local1.glColor4fv(Static265.method4106(local31.anInt2505), 0);
				@Pc(58) float local58 = 201.5F - (local31.aBoolean219 ? 1.0F : 0.5F);
				local31.method2228(Static254.aClass1_Sub16ArrayArrayArray3, local58, true);
			}
		}
		local1.glEnableClientState(32886);
		Static71.method1394();
		local1.glEnable(2929);
		local1.glPopAttrib();
		Static71.method1395();
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "([Ljava/lang/Object;[II)V")
	public static void method1106(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int[] arg1) {
		Static199.method3413(arg0, arg1, arg1.length - 1, 0);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!si;IIBZ)V")
	public static void method1107(@OriginalArg(0) Class157 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) int local8 = arg0.anInt4689;
		@Pc(11) int local11 = arg0.anInt4680;
		if (arg0.aByte14 == 0) {
			arg0.anInt4689 = arg0.anInt4704;
		} else if (arg0.aByte14 == 1) {
			arg0.anInt4689 = arg2 - arg0.anInt4704;
		} else if (arg0.aByte14 == 2) {
			arg0.anInt4689 = arg2 * arg0.anInt4704 >> 14;
		} else if (arg0.aByte14 == 3) {
			if (arg0.anInt4748 == 2) {
				arg0.anInt4689 = arg0.anInt4741 * (arg0.anInt4704 - 1) + arg0.anInt4704 * 32;
			} else if (arg0.anInt4748 == 7) {
				arg0.anInt4689 = arg0.anInt4704 * 12 + (arg0.anInt4704 - 1) * arg0.anInt4741;
			}
		}
		if (arg0.aByte17 == 0) {
			arg0.anInt4680 = arg0.anInt4665;
		} else if (arg0.aByte17 == 1) {
			arg0.anInt4680 = arg1 - arg0.anInt4665;
		} else if (arg0.aByte17 == 2) {
			arg0.anInt4680 = arg1 * arg0.anInt4665 >> 14;
		} else if (arg0.aByte17 == 3) {
			if (arg0.anInt4748 == 2) {
				arg0.anInt4680 = arg0.anInt4665 * 32 + (arg0.anInt4665 - 1) * arg0.anInt4734;
			} else if (arg0.anInt4748 == 7) {
				arg0.anInt4680 = arg0.anInt4665 * 115 + (arg0.anInt4665 - 1) * arg0.anInt4734;
			}
		}
		if (arg0.aByte17 == 4) {
			arg0.anInt4680 = arg0.anInt4689 * arg0.anInt4719 / arg0.anInt4685;
		}
		if (arg0.aByte14 == 4) {
			arg0.anInt4689 = arg0.anInt4680 * arg0.anInt4685 / arg0.anInt4719;
		}
		if (Static26.aBoolean54 && (Static42.method777(arg0).anInt1322 != 0 || arg0.anInt4748 == 0)) {
			if (arg0.anInt4689 < 5 && arg0.anInt4680 < 5) {
				arg0.anInt4689 = 5;
				arg0.anInt4680 = 5;
			} else {
				if (arg0.anInt4689 <= 0) {
					arg0.anInt4689 = 5;
				}
				if (arg0.anInt4680 <= 0) {
					arg0.anInt4680 = 5;
				}
			}
		}
		if (arg0.anInt4686 == 1337) {
			Static273.aClass157_18 = arg0;
		}
		if (arg3 && arg0.anObjectArray3 != null && (arg0.anInt4680 != local11 || local8 != arg0.anInt4689)) {
			@Pc(296) Class1_Sub29 local296 = new Class1_Sub29();
			local296.anObjectArray2 = arg0.anObjectArray3;
			local296.aClass157_13 = arg0;
			Static145.aClass96_8.method2336(local296);
		}
	}

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "(III)V")
	public static void method1108(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10;
		if (arg1 != Static6.anInt4960) {
			Static298.anIntArray589 = new int[arg1];
			for (local10 = 0; local10 < arg1; local10++) {
				Static298.anIntArray589[local10] = (local10 << 12) / arg1;
			}
			Static6.anInt4960 = arg1;
			Static53.anInt1156 = arg1 * 32;
			Static274.anInt5042 = arg1 - 1;
		}
		if (arg0 == Static213.anInt5511) {
			return;
		}
		if (Static6.anInt4960 == arg0) {
			Static10.anIntArray604 = Static298.anIntArray589;
		} else {
			Static10.anIntArray604 = new int[arg0];
			for (local10 = 0; local10 < arg0; local10++) {
				Static10.anIntArray604[local10] = (local10 << 12) / arg0;
			}
		}
		Static202.anInt3956 = arg0 - 1;
		Static213.anInt5511 = arg0;
	}
}
