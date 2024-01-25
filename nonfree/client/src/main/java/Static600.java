import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static600 {

	@OriginalMember(owner = "client!tt", name = "J", descriptor = "Lclient!gd;")
	public static Class130 aClass130_8;

	@OriginalMember(owner = "client!tt", name = "Q", descriptor = "[I")
	public static int[] anIntArray615;

	@OriginalMember(owner = "client!tt", name = "j", descriptor = "(I)V")
	public static void method8278() {
		if (!Static484.aBoolean623) {
			Static84.aBoolean110 = Static382.anInt6644 != -1 && Static382.anInt6644 <= Static539.anInt8776 || Static539.anInt8776 * 16 + (Static356.aBoolean442 ? 26 : 22) > Static274.anInt3226;
		}
		Static677.aClass340_73.method8129();
		Static472.aClass340_62.method8129();
		@Pc(59) int local59;
		for (@Pc(52) Class6_Sub2_Sub11 local52 = (Class6_Sub2_Sub11) Static116.aClass340_17.method8124(); local52 != null; local52 = (Class6_Sub2_Sub11) Static116.aClass340_17.method8134()) {
			local59 = local52.anInt5173;
			if (local59 < 1000) {
				local52.method9051();
				if (local59 == 44 || local59 == 3 || local59 == 19 || local59 == 47 || local59 == 48 || local59 == 21 || local59 == 45) {
					Static472.aClass340_62.method8131(local52);
				} else {
					Static677.aClass340_73.method8131(local52);
				}
			}
		}
		Static677.aClass340_73.method8126(Static116.aClass340_17);
		Static472.aClass340_62.method8126(Static116.aClass340_17);
		if (Static539.anInt8776 > 1) {
			if (Static28.aBoolean30 && Static435.aClass148_1.method3952(81) && Static539.anInt8776 > 2) {
				Static197.aClass6_Sub2_Sub11_2 = (Class6_Sub2_Sub11) Static116.aClass340_17.aClass6_283.aClass6_340.aClass6_340;
			} else {
				Static197.aClass6_Sub2_Sub11_2 = (Class6_Sub2_Sub11) Static116.aClass340_17.aClass6_283.aClass6_340;
			}
			Static392.aClass6_Sub2_Sub11_4 = (Class6_Sub2_Sub11) Static116.aClass340_17.aClass6_283.aClass6_340;
		} else {
			Static197.aClass6_Sub2_Sub11_2 = null;
			Static392.aClass6_Sub2_Sub11_4 = null;
		}
		local59 = -1;
		@Pc(199) Class6_Sub9 local199 = (Class6_Sub9) Static518.aClass340_65.method8124();
		if (local199 != null) {
			local59 = local199.method7140();
		}
		if (!Static484.aBoolean623) {
			if (local59 == 0 && (Static76.anInt1069 == 1 && Static539.anInt8776 > 2 || Static144.method7095())) {
				local59 = 2;
			}
			if (local59 == 2 && Static539.anInt8776 > 0 && local199 != null) {
				if (Static637.aClass381_13 == null && Static102.anInt2058 == 0) {
					Static629.method8575(local199.method7137(), local199.method7139());
				} else {
					Static673.anInt10331 = 2;
				}
			}
			if (local59 == 0) {
				if (Static197.aClass6_Sub2_Sub11_2 != null) {
					Static404.method6214();
				} else if (Static162.aBoolean266) {
					Static565.method7967();
				}
			}
			if (Static637.aClass381_13 != null || Static102.anInt2058 != 0) {
				return;
			}
			Static673.anInt10331 = 0;
			Static47.aClass6_Sub2_Sub11_1 = null;
			return;
		}
		@Pc(222) int local222;
		@Pc(226) int local226;
		@Pc(335) int local335;
		@Pc(337) int local337;
		if (local59 == -1) {
			local222 = Static331.aClass42_8.method6019();
			local226 = Static331.aClass42_8.method6014();
			@Pc(228) boolean local228 = false;
			if (Static310.aClass6_Sub2_Sub2_1 != null) {
				if (Static421.anInt7230 - 10 <= local222 && local222 <= Static69.anInt919 + Static421.anInt7230 + 10 && Static145.anInt3045 - 10 <= local226 && local226 <= Static145.anInt3045 + Static587.anInt9342 + 10) {
					local228 = true;
				} else {
					Static404.method6212();
				}
			}
			if (!local228) {
				if (Static25.anInt354 - 10 > local222 || local222 > Static406.anInt7073 + Static25.anInt354 + 10 || Static243.anInt4678 - 10 > local226 || local226 > Static243.anInt4678 + Static49.anInt592 + 10) {
					Static90.method8269();
				} else if (Static84.aBoolean110) {
					local335 = -1;
					local337 = -1;
					@Pc(353) int local353;
					for (@Pc(339) int local339 = 0; local339 < Static574.anInt9192; local339++) {
						if (Static356.aBoolean442) {
							local353 = local339 * 16 + Static243.anInt4678 + 33;
							if (local353 - 13 < local226 && local226 < local353 + 4) {
								local335 = local339;
								local337 = local353 - 13;
								break;
							}
						} else {
							local353 = local339 * 16 + Static243.anInt4678 + 31;
							if (local353 - 13 < local226 && local353 + 3 > local226) {
								local335 = local339;
								local337 = local353 - 13;
								break;
							}
						}
					}
					if (local335 != -1) {
						local353 = 0;
						@Pc(434) Class131 local434 = new Class131(Static228.aClass82_5);
						for (@Pc(439) Class6_Sub2_Sub2 local439 = (Class6_Sub2_Sub2) local434.method3484(); local439 != null; local439 = (Class6_Sub2_Sub2) local434.method3483()) {
							if (local335 == local353) {
								if (local439.anInt618 > 1) {
									Static495.method7301(local226, local337, local439);
								}
								break;
							}
							local353++;
						}
					}
				}
			}
		}
		if (local59 != 0) {
			return;
		}
		local222 = local199.method7137();
		local226 = local199.method7139();
		@Pc(565) int local565;
		@Pc(775) Class131 local775;
		@Pc(661) Class6_Sub2_Sub11 local661;
		if (Static310.aClass6_Sub2_Sub2_1 != null && local222 >= Static421.anInt7230 && Static421.anInt7230 + Static69.anInt919 >= local222 && local226 >= Static145.anInt3045 && local226 <= Static587.anInt9342 + Static145.anInt3045) {
			local565 = -1;
			for (local335 = 0; local335 < Static310.aClass6_Sub2_Sub2_1.anInt618; local335++) {
				if (Static356.aBoolean442) {
					local337 = Static145.anInt3045 + local335 * 16 + 33;
					if (local226 > local337 - 13 && local226 < local337 + 4) {
						local565 = local335;
					}
				} else {
					local337 = local335 * 16 + Static145.anInt3045 + 31;
					if (local226 > local337 - 13 && local337 + 3 > local226) {
						local565 = local335;
					}
				}
			}
			if (local565 != -1) {
				local337 = 0;
				local775 = new Class131(Static310.aClass6_Sub2_Sub2_1.aClass82_1);
				for (local661 = (Class6_Sub2_Sub11) local775.method3484(); local661 != null; local661 = (Class6_Sub2_Sub11) local775.method3483()) {
					if (local565 == local337) {
						Static444.method6881(local661, local226, local222);
						break;
					}
					local337++;
				}
			}
			Static90.method8269();
			return;
		}
		if (local222 < Static25.anInt354 || Static25.anInt354 + Static406.anInt7073 < local222 || Static243.anInt4678 > local226 || local226 > Static243.anInt4678 + Static49.anInt592) {
			return;
		}
		if (!Static84.aBoolean110) {
			local565 = -1;
			for (local335 = 0; local335 < Static539.anInt8776; local335++) {
				if (Static356.aBoolean442) {
					local337 = (Static539.anInt8776 - local335 - 1) * 16 + Static243.anInt4678 + 33;
					if (local337 - 13 < local226 && local226 < local337 + 4) {
						local565 = local335;
					}
				} else {
					local337 = (Static539.anInt8776 - local335 - 1) * 16 + Static243.anInt4678 + 31;
					if (local226 > local337 - 13 && local337 + 3 > local226) {
						local565 = local335;
					}
				}
			}
			if (local565 != -1) {
				local337 = 0;
				@Pc(656) Class167 local656 = new Class167(Static116.aClass340_17);
				for (local661 = (Class6_Sub2_Sub11) local656.method4235(); local661 != null; local661 = (Class6_Sub2_Sub11) local656.method4236()) {
					if (local337 == local565) {
						Static444.method6881(local661, local226, local222);
						break;
					}
					local337++;
				}
			}
			Static90.method8269();
			return;
		}
		local565 = -1;
		for (local335 = 0; local335 < Static574.anInt9192; local335++) {
			if (Static356.aBoolean442) {
				local337 = Static243.anInt4678 + local335 * 16 + 33;
				if (local337 - 13 < local226 && local226 < local337 + 4) {
					local565 = local335;
					break;
				}
			} else {
				local337 = Static243.anInt4678 + local335 * 16 + 31;
				if (local337 - 13 < local226 && local337 + 3 > local226) {
					local565 = local335;
					break;
				}
			}
		}
		if (local565 == -1) {
			return;
		}
		local337 = 0;
		local775 = new Class131(Static228.aClass82_5);
		for (@Pc(780) Class6_Sub2_Sub2 local780 = (Class6_Sub2_Sub2) local775.method3484(); local780 != null; local780 = (Class6_Sub2_Sub2) local775.method3483()) {
			if (local337 == local565) {
				Static444.method6881((Class6_Sub2_Sub11) local780.aClass82_1.aClass6_Sub2_17.aClass6_Sub2_65, local226, local222);
				Static90.method8269();
				return;
			}
			local337++;
		}
		return;
	}

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "(B)V")
	public static void method8279() {
		Static329.aClass49Array8 = null;
		Static180.aClass67_5 = null;
		Static386.aClass49_27 = null;
		Static22.aClass49Array5 = null;
		Static519.aClass49Array13 = null;
		Static626.aClass49Array16 = null;
		Static406.aClass49Array10 = null;
		Static607.aClass49Array15 = null;
		Static552.aClass49_35 = null;
		Static305.aClass49Array9 = null;
		Static648.aClass49Array17 = null;
		Static205.aClass67_6 = null;
		Static43.aClass49Array2 = null;
		Static684.aClass49Array19 = null;
		Static690.aClass49Array20 = null;
		Static323.aClass49Array7 = null;
		Static448.aClass49Array12 = null;
		Static23.aClass67_1 = null;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method8280(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		Static291.method4770(arg1, -1, arg0, -1);
	}
}
