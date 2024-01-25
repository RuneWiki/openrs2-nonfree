import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!om", name = "a", descriptor = "Lclient!ffa;")
	public static Class107 aClass107_2;

	@OriginalMember(owner = "client!om", name = "d", descriptor = "Lclient!efa;")
	public static final Class85 aClass85_3 = new Class85();

	@OriginalMember(owner = "client!om", name = "h", descriptor = "I")
	public static int anInt6365 = 0;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!sb;[Lclient!jr;B)Lclient!wga;")
	public static Class373 method5496(@OriginalArg(0) Class95_Sub3_Sub2 arg0, @OriginalArg(1) Class176[] arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1.length; local12++) {
			if (arg1[local12] == null || arg1[local12].aLong124 <= 0L) {
				return null;
			}
		}
		@Pc(36) long local36 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(38) int local38 = 0; local38 < arg1.length; local38++) {
			OpenGL.glAttachObjectARB(local36, arg1[local38].aLong124);
		}
		OpenGL.glLinkProgramARB(local36);
		OpenGL.glGetObjectParameterivARB(local36, 35714, Static152.anIntArray186, 0);
		if (Static152.anIntArray186[0] == 0) {
			if (Static152.anIntArray186[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local36, 35716, Static152.anIntArray186, 1);
			if (Static152.anIntArray186[1] > 1) {
				@Pc(94) byte[] local94 = new byte[Static152.anIntArray186[1]];
				OpenGL.glGetInfoLogARB(local36, Static152.anIntArray186[1], Static152.anIntArray186, 0, local94, 0);
				System.out.println(new String(local94));
			}
			if (Static152.anIntArray186[0] == 0) {
				for (@Pc(118) int local118 = 0; local118 < arg1.length; local118++) {
					OpenGL.glDetachObjectARB(local36, arg1[local118].aLong124);
				}
				OpenGL.glDeleteObjectARB(local36);
				return null;
			}
		}
		return new Class373(arg0, local36, arg1);
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V")
	public static void method5497() {
		if (!Static627.aBoolean736) {
			Static187.aBoolean234 = Static464.anInt7433 != -1 && Static464.anInt7433 <= Static474.anInt7600 || Static153.anInt2747 < (Static500.aBoolean612 ? 26 : 22) + Static474.anInt7600 * 16;
		}
		Static291.aClass109_15.method2329();
		Static231.aClass109_30.method2329();
		@Pc(51) int local51;
		for (@Pc(46) Class2_Sub2_Sub11 local46 = (Class2_Sub2_Sub11) Static115.aClass109_11.method2325(); local46 != null; local46 = (Class2_Sub2_Sub11) Static115.aClass109_11.method2318()) {
			local51 = local46.anInt4369;
			if (local51 < 1000) {
				local46.method8653();
				if (local51 == 4 || local51 == 6 || local51 == 20 || local51 == 47 || local51 == 17 || local51 == 49 || local51 == 9) {
					Static231.aClass109_30.method2323(local46);
				} else {
					Static291.aClass109_15.method2323(local46);
				}
			}
		}
		Static291.aClass109_15.method2330(Static115.aClass109_11);
		Static231.aClass109_30.method2330(Static115.aClass109_11);
		if (Static474.anInt7600 > 1) {
			if (Static341.aBoolean388 && Static16.aClass167_1.method3544(81) && Static474.anInt7600 > 2) {
				Static601.aClass2_Sub2_Sub11_4 = (Class2_Sub2_Sub11) Static115.aClass109_11.aClass2_78.aClass2_299.aClass2_299;
			} else {
				Static601.aClass2_Sub2_Sub11_4 = (Class2_Sub2_Sub11) Static115.aClass109_11.aClass2_78.aClass2_299;
			}
			Static432.aClass2_Sub2_Sub11_2 = (Class2_Sub2_Sub11) Static115.aClass109_11.aClass2_78.aClass2_299;
		} else {
			Static432.aClass2_Sub2_Sub11_2 = null;
			Static601.aClass2_Sub2_Sub11_4 = null;
		}
		local51 = -1;
		@Pc(159) Class2_Sub12 local159 = (Class2_Sub12) Static595.aClass109_69.method2325();
		if (local159 != null) {
			local51 = local159.method7241();
		}
		if (!Static627.aBoolean736) {
			if (local51 == 0 && (Static95.anInt1810 == 1 && Static474.anInt7600 > 2 || Static158.method2369())) {
				local51 = 2;
			}
			if (local51 == 2 && Static474.anInt7600 > 0 && local159 != null) {
				if (Static444.aClass261_9 == null && Static91.anInt1707 == 0) {
					Static565.method7738(local159.method7238(), local159.method7237());
				} else {
					Static615.anInt9912 = 2;
				}
			}
			if (local51 == 0) {
				if (Static601.aClass2_Sub2_Sub11_4 != null) {
					Static376.method5059();
				} else if (Static8.aBoolean11) {
					Static618.method8289();
				}
			}
			if (Static444.aClass261_9 != null || Static91.anInt1707 != 0) {
				return;
			}
			Static615.anInt9912 = 0;
			Static472.aClass2_Sub2_Sub11_3 = null;
			return;
		}
		@Pc(174) int local174;
		@Pc(178) int local178;
		@Pc(266) int local266;
		@Pc(268) int local268;
		@Pc(270) int local270;
		if (local51 == -1) {
			local174 = Static507.aClass335_1.method7811();
			local178 = Static507.aClass335_1.method7821();
			@Pc(180) boolean local180 = false;
			if (Static446.aClass2_Sub2_Sub12_2 != null) {
				if (local174 >= Static621.anInt9974 - 10 && Static351.anInt5494 + Static621.anInt9974 + 10 >= local174 && Static346.anInt5444 - 10 <= local178 && Static104.anInt1917 + Static346.anInt5444 + 10 >= local178) {
					local180 = true;
				} else {
					Static64.method918();
				}
			}
			if (!local180) {
				if (Static46.anInt975 - 10 > local174 || Static408.anInt6345 + Static46.anInt975 + 10 < local174 || Static139.anInt2567 - 10 > local178 || Static467.anInt7465 + Static139.anInt2567 + 10 < local178) {
					Static58.method901();
				} else if (Static187.aBoolean234) {
					local266 = -1;
					local268 = -1;
					@Pc(283) int local283;
					for (local270 = 0; local270 < Static121.anInt2166; local270++) {
						if (Static500.aBoolean612) {
							local283 = local270 * 16 + Static139.anInt2567 + 33;
							if (local283 - 13 < local178 && local283 + 4 > local178) {
								local268 = local283 - 13;
								local266 = local270;
								break;
							}
						} else {
							local283 = Static139.anInt2567 + local270 * 16 + 31;
							if (local178 > local283 - 13 && local178 < local283 + 3) {
								local268 = local283 - 13;
								local266 = local270;
								break;
							}
						}
					}
					if (local266 != -1) {
						local283 = 0;
						@Pc(361) Class304 local361 = new Class304(Static453.aClass75_10);
						for (@Pc(366) Class2_Sub2_Sub12 local366 = (Class2_Sub2_Sub12) local361.method6885(); local366 != null; local366 = (Class2_Sub2_Sub12) local361.method6886()) {
							if (local266 == local283) {
								if (local366.anInt4924 > 1) {
									Static316.method4247(local178, local366, local268);
								}
								break;
							}
							local283++;
						}
					}
				}
			}
		}
		if (local51 != 0) {
			return;
		}
		local174 = local159.method7237();
		local178 = local159.method7238();
		@Pc(436) int local436;
		@Pc(509) Class2_Sub2_Sub11 local509;
		if (Static446.aClass2_Sub2_Sub12_2 != null && Static621.anInt9974 <= local174 && Static621.anInt9974 + Static351.anInt5494 >= local174 && Static346.anInt5444 <= local178 && local178 <= Static104.anInt1917 + Static346.anInt5444) {
			local436 = -1;
			for (local266 = 0; local266 < Static446.aClass2_Sub2_Sub12_2.anInt4924; local266++) {
				if (Static500.aBoolean612) {
					local268 = Static346.anInt5444 + local266 * 16 + 33;
					if (local178 > local268 - 13 && local178 < local268 + 4) {
						local436 = local266;
					}
				} else {
					local268 = Static346.anInt5444 + local266 * 16 + 31;
					if (local268 - 13 < local178 && local178 < local268 + 3) {
						local436 = local266;
					}
				}
			}
			if (local436 != -1) {
				local268 = 0;
				@Pc(504) Class304 local504 = new Class304(Static446.aClass2_Sub2_Sub12_2.aClass75_9);
				for (local509 = (Class2_Sub2_Sub11) local504.method6885(); local509 != null; local509 = (Class2_Sub2_Sub11) local504.method6886()) {
					if (local436 == local268) {
						Static530.method7339(local509, local178, local174);
						break;
					}
					local268++;
				}
			}
			Static58.method901();
			return;
		}
		if (local174 < Static46.anInt975 || Static408.anInt6345 + Static46.anInt975 < local174 || local178 < Static139.anInt2567 || Static467.anInt7465 + Static139.anInt2567 < local178) {
			return;
		}
		if (!Static187.aBoolean234) {
			local436 = -1;
			for (local266 = 0; local266 < Static474.anInt7600; local266++) {
				if (Static500.aBoolean612) {
					local268 = Static139.anInt2567 + (Static474.anInt7600 + -1 + -local266) * 16 + 33;
					if (local178 > local268 - 13 && local178 < local268 + 4) {
						local436 = local266;
					}
				} else {
					local268 = (Static474.anInt7600 - local266 - 1) * 16 + Static139.anInt2567 + 31;
					if (local178 > local268 - 13 && local268 + 3 > local178) {
						local436 = local266;
					}
				}
			}
			if (local436 != -1) {
				local268 = 0;
				@Pc(632) Class140 local632 = new Class140(Static115.aClass109_11);
				for (local509 = (Class2_Sub2_Sub11) local632.method2965(); local509 != null; local509 = (Class2_Sub2_Sub11) local632.method2964()) {
					if (local268 == local436) {
						Static530.method7339(local509, local178, local174);
						break;
					}
					local268++;
				}
			}
			Static58.method901();
			return;
		}
		local436 = -1;
		local266 = -1;
		for (local268 = 0; local268 < Static121.anInt2166; local268++) {
			if (Static500.aBoolean612) {
				local270 = Static139.anInt2567 + local268 * 16 + 33;
				if (local178 > local270 - 13 && local178 < local270 + 4) {
					local436 = local268;
					local266 = local270 - 13;
					break;
				}
			} else {
				local270 = Static139.anInt2567 + local268 * 16 + 31;
				if (local178 > local270 - 13 && local270 + 3 > local178) {
					local266 = local270 - 13;
					local436 = local268;
					break;
				}
			}
		}
		if (local436 == -1) {
			return;
		}
		local270 = 0;
		@Pc(757) Class304 local757 = new Class304(Static453.aClass75_10);
		for (@Pc(762) Class2_Sub2_Sub12 local762 = (Class2_Sub2_Sub12) local757.method6885(); local762 != null; local762 = (Class2_Sub2_Sub12) local757.method6886()) {
			if (local270 == local436) {
				if (local762.anInt4924 != 1) {
					Static316.method4247(local178, local762, local266);
					return;
				}
				Static530.method7339((Class2_Sub2_Sub11) local762.aClass75_9.aClass2_Sub2_26.aClass2_Sub2_67, local178, local174);
				Static58.method901();
				return;
			}
			local270++;
		}
		return;
	}
}
