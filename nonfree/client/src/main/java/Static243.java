import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!io", name = "f", descriptor = "Lclient!qr;")
	public static final Class293 aClass293_29 = new Class293(3000000, 200);

	@OriginalMember(owner = "client!io", name = "k", descriptor = "Z")
	public static boolean aBoolean334 = false;

	@OriginalMember(owner = "client!io", name = "l", descriptor = "F")
	public static float aFloat48 = 1.0F;

	@OriginalMember(owner = "client!io", name = "m", descriptor = "Z")
	public static boolean aBoolean335 = false;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ZLclient!vfa;)Lclient!vfa;")
	public static Class357 method3688(@OriginalArg(1) Class357 arg0) {
		if (arg0.anInt9837 != -1) {
			return Static472.method6903(arg0.anInt9837);
		}
		@Pc(24) int local24 = arg0.anInt9804 >>> 16;
		@Pc(29) Class100 local29 = new Class100(Static183.aClass81_27);
		for (@Pc(34) Class5_Sub15 local34 = (Class5_Sub15) local29.method1996(); local34 != null; local34 = (Class5_Sub15) local29.method1995()) {
			if (local34.anInt2409 == local24) {
				return Static472.method6903((int) local34.aLong282);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(B)V")
	public static void method3689() {
		if (Static485.aClass126_17.method7006()) {
			Static485.aClass126_17.method7057(Static181.aCanvas3);
			Static600.method8381();
			if (Static144.aBoolean196) {
				Static103.method1501(Static181.aCanvas3);
			} else {
				@Pc(27) Dimension local27 = Static181.aCanvas3.getSize();
				Static485.aClass126_17.method6979(Static181.aCanvas3, local27.width, local27.height);
			}
			Static485.aClass126_17.method7036(Static181.aCanvas3);
		} else {
			Static590.method8288(false, Static627.aClass5_Sub46_31.aClass11_Sub15_2.method4289());
		}
		Static101.method1476();
		Static367.aBoolean541 = true;
	}

	@OriginalMember(owner = "client!io", name = "c", descriptor = "(B)V")
	public static void method3690() {
		if (!Static251.aBoolean343) {
			Static585.aBoolean771 = Static347.anInt9481 != -1 && Static347.anInt9481 <= Static642.anInt10370 || (Static405.aBoolean578 ? 26 : 22) + Static642.anInt10370 * 16 > Static438.anInt7403;
		}
		Static519.aClass306_38.method7315();
		Static28.aClass306_6.method7315();
		@Pc(45) int local45;
		for (@Pc(40) Class5_Sub4_Sub14 local40 = (Class5_Sub4_Sub14) Static607.aClass306_63.method7313(); local40 != null; local40 = (Class5_Sub4_Sub14) Static607.aClass306_63.method7301()) {
			local45 = local40.anInt5598;
			if (local45 < 1000) {
				local40.method8911();
				if (local45 == 21 || local45 == 46 || local45 == 9 || local45 == 44 || local45 == 60 || local45 == 22 || local45 == 25) {
					Static28.aClass306_6.method7303(local40);
				} else {
					Static519.aClass306_38.method7303(local40);
				}
			}
		}
		Static519.aClass306_38.method7308(Static607.aClass306_63);
		Static28.aClass306_6.method7308(Static607.aClass306_63);
		if (Static642.anInt10370 <= 1) {
			Static510.aClass5_Sub4_Sub14_1 = null;
			Static532.aClass5_Sub4_Sub14_2 = null;
		} else {
			if (Static473.aBoolean660 && Static600.aClass38_1.method799(81) && Static642.anInt10370 > 2) {
				Static510.aClass5_Sub4_Sub14_1 = (Class5_Sub4_Sub14) Static607.aClass306_63.aClass5_235.aClass5_300.aClass5_300;
			} else {
				Static510.aClass5_Sub4_Sub14_1 = (Class5_Sub4_Sub14) Static607.aClass306_63.aClass5_235.aClass5_300;
			}
			Static532.aClass5_Sub4_Sub14_2 = (Class5_Sub4_Sub14) Static607.aClass306_63.aClass5_235.aClass5_300;
		}
		local45 = -1;
		@Pc(154) Class5_Sub33 local154 = (Class5_Sub33) Static622.aClass306_65.method7313();
		if (local154 != null) {
			local45 = local154.method6097();
		}
		if (!Static251.aBoolean343) {
			if (local45 == 0 && (Static559.anInt9207 == 1 && Static642.anInt10370 > 2 || Static357.method5620())) {
				local45 = 2;
			}
			if (local45 == 2 && Static642.anInt10370 > 0 && local154 != null) {
				if (Static629.aClass357_15 == null && Static239.anInt4038 == 0) {
					Static605.method8435(local154.method6099(), local154.method6094());
				} else {
					Static344.anInt8343 = 2;
				}
			}
			if (local45 == 0) {
				if (Static510.aClass5_Sub4_Sub14_1 != null) {
					Static313.method4950();
				} else if (Static202.aBoolean295) {
					Static2.method24();
				}
			}
			if (Static629.aClass357_15 != null || Static239.anInt4038 != 0) {
				return;
			}
			Static344.anInt8343 = 0;
			Static552.aClass5_Sub4_Sub14_3 = null;
			return;
		}
		@Pc(169) int local169;
		@Pc(173) int local173;
		@Pc(253) int local253;
		@Pc(255) int local255;
		if (local45 == -1) {
			local169 = Static81.aClass13_1.method6355();
			local173 = Static81.aClass13_1.method6347();
			@Pc(175) boolean local175 = false;
			if (Static472.aClass5_Sub4_Sub6_1 != null) {
				if (local169 >= Static345.anInt5965 - 10 && local169 <= Static501.anInt9504 + Static345.anInt5965 + 10 && local173 >= Static537.anInt8920 - 10 && local173 <= Static266.anInt4412 + Static537.anInt8920 + 10) {
					local175 = true;
				} else {
					Static344.method7173();
				}
			}
			if (!local175) {
				if (local169 < Static403.anInt6941 - 10 || local169 > Static42.anInt712 + Static403.anInt6941 + 10 || Static649.anInt10496 - 10 > local173 || local173 > Static334.anInt5796 + Static649.anInt10496 + 10) {
					Static500.method7322();
				} else if (Static585.aBoolean771) {
					local253 = -1;
					local255 = -1;
					@Pc(269) int local269;
					for (@Pc(257) int local257 = 0; local257 < Static198.anInt3547; local257++) {
						if (Static405.aBoolean578) {
							local269 = Static649.anInt10496 + local257 * 16 + 33;
							if (local173 > local269 - 13 && local269 + 4 > local173) {
								local255 = local269 - 13;
								local253 = local257;
								break;
							}
						} else {
							local269 = Static649.anInt10496 + local257 * 16 + 31;
							if (local269 - 13 < local173 && local173 < local269 + 3) {
								local255 = local269 - 13;
								local253 = local257;
								break;
							}
						}
					}
					if (local253 != -1) {
						local269 = 0;
						@Pc(344) Class67 local344 = new Class67(Static616.aClass80_12);
						for (@Pc(349) Class5_Sub4_Sub6 local349 = (Class5_Sub4_Sub6) local344.method1348(); local349 != null; local349 = (Class5_Sub4_Sub6) local344.method1346()) {
							if (local253 == local269) {
								if (local349.anInt2325 > 1) {
									Static496.method7296(local349, local173, local255);
								}
								break;
							}
							local269++;
						}
					}
				}
			}
		}
		if (local45 != 0) {
			return;
		}
		local169 = local154.method6099();
		local173 = local154.method6094();
		@Pc(453) int local453;
		@Pc(640) Class67 local640;
		@Pc(542) Class5_Sub4_Sub14 local542;
		if (Static472.aClass5_Sub4_Sub6_1 != null && Static345.anInt5965 <= local169 && Static345.anInt5965 + Static501.anInt9504 >= local169 && local173 >= Static537.anInt8920 && local173 <= Static266.anInt4412 + Static537.anInt8920) {
			local453 = -1;
			for (local253 = 0; local253 < Static472.aClass5_Sub4_Sub6_1.anInt2325; local253++) {
				if (Static405.aBoolean578) {
					local255 = local253 * 16 + Static537.anInt8920 + 33;
					if (local255 - 13 < local173 && local173 < local255 + 4) {
						local453 = local253;
					}
				} else {
					local255 = Static537.anInt8920 + local253 * 16 + 31;
					if (local255 - 13 < local173 && local173 < local255 + 3) {
						local453 = local253;
					}
				}
			}
			if (local453 != -1) {
				local255 = 0;
				local640 = new Class67(Static472.aClass5_Sub4_Sub6_1.aClass80_3);
				for (local542 = (Class5_Sub4_Sub14) local640.method1348(); local542 != null; local542 = (Class5_Sub4_Sub14) local640.method1346()) {
					if (local255 == local453) {
						Static178.method2709(local173, local169, local542);
						break;
					}
					local255++;
				}
			}
			Static500.method7322();
			return;
		}
		if (local169 < Static403.anInt6941 || Static42.anInt712 + Static403.anInt6941 < local169 || Static649.anInt10496 > local173 || Static649.anInt10496 + Static334.anInt5796 < local173) {
			return;
		}
		if (!Static585.aBoolean771) {
			local453 = -1;
			for (local253 = 0; local253 < Static642.anInt10370; local253++) {
				if (Static405.aBoolean578) {
					local255 = Static649.anInt10496 + (-local253 + -1 + Static642.anInt10370) * 16 + 33;
					if (local173 > local255 - 13 && local255 + 4 > local173) {
						local453 = local253;
					}
				} else {
					local255 = Static649.anInt10496 + (Static642.anInt10370 + -1 - local253) * 16 + 31;
					if (local255 - 13 < local173 && local255 + 3 > local173) {
						local453 = local253;
					}
				}
			}
			if (local453 != -1) {
				local255 = 0;
				@Pc(537) Class268 local537 = new Class268(Static607.aClass306_63);
				for (local542 = (Class5_Sub4_Sub14) local537.method6394(); local542 != null; local542 = (Class5_Sub4_Sub14) local537.method6395()) {
					if (local255 == local453) {
						Static178.method2709(local173, local169, local542);
						break;
					}
					local255++;
				}
			}
			Static500.method7322();
			return;
		}
		local453 = -1;
		for (local253 = 0; local253 < Static198.anInt3547; local253++) {
			if (Static405.aBoolean578) {
				local255 = local253 * 16 + Static649.anInt10496 + 33;
				if (local255 - 13 < local173 && local173 < local255 + 4) {
					local453 = local253;
					break;
				}
			} else {
				local255 = local253 * 16 + Static649.anInt10496 + 31;
				if (local255 - 13 < local173 && local255 + 3 > local173) {
					local453 = local253;
					break;
				}
			}
		}
		if (local453 == -1) {
			return;
		}
		local255 = 0;
		local640 = new Class67(Static616.aClass80_12);
		for (@Pc(645) Class5_Sub4_Sub6 local645 = (Class5_Sub4_Sub6) local640.method1348(); local645 != null; local645 = (Class5_Sub4_Sub6) local640.method1346()) {
			if (local453 == local255) {
				Static178.method2709(local173, local169, (Class5_Sub4_Sub14) local645.aClass80_3.aClass5_Sub4_14.aClass5_Sub4_67);
				Static500.method7322();
				return;
			}
			local255++;
		}
		return;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIB)Z")
	public static boolean method3691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIII)Z")
	public static boolean method3693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static630.aClass117_10.method7250(arg1, arg0, arg2, Static511.anIntArray674);
		@Pc(21) int local21 = Static511.anIntArray674[2];
		if (local21 < 50) {
			return false;
		} else {
			Static511.anIntArray674[1] = Static511.anIntArray674[1] * Static254.anInt4286 / local21 + Static153.anInt2441;
			Static511.anIntArray674[0] = Static378.anInt6647 + Static511.anIntArray674[0] * Static376.anInt6613 / local21;
			Static511.anIntArray674[2] = local21;
			return true;
		}
	}
}
