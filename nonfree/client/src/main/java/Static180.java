import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!hi", name = "I", descriptor = "Lclient!e;")
	public static Interface4 anInterface4_8;

	@OriginalMember(owner = "client!hi", name = "G", descriptor = "Z")
	public static boolean aBoolean300 = false;

	@OriginalMember(owner = "client!hi", name = "H", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_55 = new Class67("Loaded shaders", "Shaders geladen", "Nuanceurs chargés", "Sombreamento carregado");

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "([IB)Ljava/lang/String;")
	public static String method3434(@OriginalArg(0) int[] arg0) {
		@Pc(14) StringBuffer local14 = new StringBuffer();
		@Pc(16) int local16 = Static256.anInt5195;
		for (@Pc(18) int local18 = 0; local18 < arg0.length; local18++) {
			@Pc(27) Class187 local27 = Static174.aClass282_1.method6983(arg0[local18]);
			if (local27.anInt5848 != -1) {
				@Pc(39) Class119 local39 = (Class119) Static301.aClass125_40.method3512((long) local27.anInt5848);
				if (local39 == null) {
					@Pc(47) Class9 local47 = Static551.method531(Static19.aClass161_7, local27.anInt5848, 0);
					if (local47 != null) {
						local39 = Static121.aClass5_7.method7425(local47);
						Static301.aClass125_40.method3519((long) local27.anInt5848, local39);
					}
				}
				if (local39 != null) {
					Static525.aClass119Array16[local16] = local39;
					local14.append(" <img=").append(local16).append(">");
					local16++;
				}
			}
		}
		return local14.toString();
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!bk;I)V")
	public static void method3435(@OriginalArg(0) Class3_Sub9 arg0) {
		if (arg0.aClass3_Sub42_5 != null) {
			arg0.aClass3_Sub42_5.anInt8316 = 0;
		}
		arg0.aBoolean591 = false;
		for (@Pc(22) Class3_Sub9 local22 = arg0.method6929(); local22 != null; local22 = arg0.method6928()) {
			method3435(local22);
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)Z")
	public static boolean method3436() throws IOException {
		if (Static467.aClass41_1 == null) {
			return false;
		}
		@Pc(73) int local73;
		if (Static522.aClass133_166 == null) {
			if (Static532.aBoolean677) {
				if (!Static467.aClass41_1.method1071(1)) {
					return false;
				}
				Static467.aClass41_1.method1068(0, Static90.aClass3_Sub27_Sub1_1.aByteArray114, 1);
				Static428.anInt7892++;
				Static335.anInt3040 = 0;
				Static532.aBoolean677 = false;
			}
			Static90.aClass3_Sub27_Sub1_1.anInt9191 = 0;
			if (Static90.aClass3_Sub27_Sub1_1.method4534()) {
				if (!Static467.aClass41_1.method1071(1)) {
					return false;
				}
				Static467.aClass41_1.method1068(1, Static90.aClass3_Sub27_Sub1_1.aByteArray114, 1);
				Static428.anInt7892++;
				Static335.anInt3040 = 0;
			}
			Static532.aBoolean677 = true;
			@Pc(69) Class133[] local69 = Static247.method4277();
			local73 = Static90.aClass3_Sub27_Sub1_1.method4545();
			if (local73 < 0 || local73 >= local69.length) {
				throw new IOException("invo:" + local73 + " ip:" + Static90.aClass3_Sub27_Sub1_1.anInt9191);
			}
			Static522.aClass133_166 = local69[local73];
			Static35.anInt921 = Static522.aClass133_166.anInt4521;
		}
		if (Static35.anInt921 == -1) {
			if (!Static467.aClass41_1.method1071(1)) {
				return false;
			}
			Static467.aClass41_1.method1068(0, Static90.aClass3_Sub27_Sub1_1.aByteArray114, 1);
			Static35.anInt921 = Static90.aClass3_Sub27_Sub1_1.aByteArray114[0] & 0xFF;
			Static428.anInt7892++;
			Static335.anInt3040 = 0;
		}
		if (Static35.anInt921 == -2) {
			if (!Static467.aClass41_1.method1071(2)) {
				return false;
			}
			Static467.aClass41_1.method1068(0, Static90.aClass3_Sub27_Sub1_1.aByteArray114, 2);
			Static90.aClass3_Sub27_Sub1_1.anInt9191 = 0;
			Static35.anInt921 = Static90.aClass3_Sub27_Sub1_1.method7591();
			Static335.anInt3040 = 0;
			Static428.anInt7892 += 2;
		}
		if (Static35.anInt921 > 0) {
			if (!Static467.aClass41_1.method1071(Static35.anInt921)) {
				return false;
			}
			Static90.aClass3_Sub27_Sub1_1.anInt9191 = 0;
			Static467.aClass41_1.method1068(0, Static90.aClass3_Sub27_Sub1_1.aByteArray114, Static35.anInt921);
			Static428.anInt7892 += Static35.anInt921;
			Static335.anInt3040 = 0;
		}
		Static159.aClass133_67 = Static358.aClass133_117;
		Static358.aClass133_117 = Static473.aClass133_147;
		Static473.aClass133_147 = Static522.aClass133_166;
		@Pc(221) int local221;
		@Pc(213) String local213;
		if (Static274.aClass133_97 == Static522.aClass133_166) {
			local213 = Static90.aClass3_Sub27_Sub1_1.method7589();
			local73 = Static90.aClass3_Sub27_Sub1_1.method7566();
			local221 = Static90.aClass3_Sub27_Sub1_1.method7610();
			if (Static46.method1003(local73)) {
				Static531.method7635(local213, local221);
			}
			Static522.aClass133_166 = null;
			return true;
		}
		@Pc(248) String local248;
		if (Static68.aClass133_31 == Static522.aClass133_166) {
			local213 = Static90.aClass3_Sub27_Sub1_1.method7589();
			local248 = Static128.method2260(Static118.method2163(Static90.aClass3_Sub27_Sub1_1));
			Static536.method7668(local213, 0, local248, local213, 6, local213);
			Static522.aClass133_166 = null;
			return true;
		}
		@Pc(267) int local267;
		if (Static49.aClass133_26 == Static522.aClass133_166) {
			local267 = Static90.aClass3_Sub27_Sub1_1.method7565();
			local73 = Static90.aClass3_Sub27_Sub1_1.method7548();
			local221 = Static90.aClass3_Sub27_Sub1_1.method7568();
			if (Static46.method1003(local221)) {
				Static422.method7126(local73, local267);
			}
			Static522.aClass133_166 = null;
			return true;
		} else if (Static66.aClass133_29 == Static522.aClass133_166) {
			Static6.method6473(Static256.aClass117_16);
			Static522.aClass133_166 = null;
			return true;
		} else {
			@Pc(321) int local321;
			if (Static522.aClass133_166 == Static249.aClass133_86) {
				local267 = Static90.aClass3_Sub27_Sub1_1.method7591();
				if (local267 == 65535) {
					local267 = -1;
				}
				local73 = Static90.aClass3_Sub27_Sub1_1.method7548();
				local221 = Static90.aClass3_Sub27_Sub1_1.method7591();
				local321 = Static90.aClass3_Sub27_Sub1_1.method7548();
				Static144.method2483(local321, local267, true, local221, local73);
				Static522.aClass133_166 = null;
				return true;
			} else if (Static522.aClass133_166 == Static218.aClass133_81) {
				local267 = Static90.aClass3_Sub27_Sub1_1.method7591();
				local73 = Static90.aClass3_Sub27_Sub1_1.method7566();
				if (local73 == 65535) {
					local73 = -1;
				}
				local221 = Static90.aClass3_Sub27_Sub1_1.method7549();
				if (Static46.method1003(local267)) {
					Static248.method4284(2, -1, local221, local73);
				}
				Static522.aClass133_166 = null;
				return true;
			} else if (Static522.aClass133_166 == Static442.aClass133_145) {
				Static357.method5611();
				Static522.aClass133_166 = null;
				return true;
			} else if (Static522.aClass133_166 == Static518.aClass133_39) {
				local267 = Static90.aClass3_Sub27_Sub1_1.method7591();
				local73 = Static90.aClass3_Sub27_Sub1_1.method7566();
				local221 = Static90.aClass3_Sub27_Sub1_1.method7568();
				if (Static46.method1003(local267)) {
					Static427.method6530(local73, local221);
				}
				Static522.aClass133_166 = null;
				return true;
			} else {
				@Pc(434) int local434;
				@Pc(440) int local440;
				if (Static522.aClass133_166 == Static218.aClass133_80) {
					local267 = Static90.aClass3_Sub27_Sub1_1.method7591();
					local73 = Static90.aClass3_Sub27_Sub1_1.method7548();
					local221 = Static90.aClass3_Sub27_Sub1_1.method7548();
					local321 = Static90.aClass3_Sub27_Sub1_1.method7591() << 2;
					local434 = Static90.aClass3_Sub27_Sub1_1.method7548();
					local440 = Static90.aClass3_Sub27_Sub1_1.method7548();
					if (Static46.method1003(local267)) {
						Static102.method4939(local73, local434, local221, local440, local321);
					}
					Static522.aClass133_166 = null;
					return true;
				}
				@Pc(511) long local511;
				@Pc(517) Class3_Sub13 local517;
				@Pc(532) Class3_Sub13 local532;
				if (Static430.aClass133_167 == Static522.aClass133_166) {
					local267 = Static90.aClass3_Sub27_Sub1_1.method7566();
					if (local267 == 65535) {
						local267 = -1;
					}
					local73 = Static90.aClass3_Sub27_Sub1_1.method7568();
					if (local73 == 65535) {
						local73 = -1;
					}
					local221 = Static90.aClass3_Sub27_Sub1_1.method7562();
					local321 = Static90.aClass3_Sub27_Sub1_1.method7568();
					local434 = Static90.aClass3_Sub27_Sub1_1.method7565();
					if (Static46.method1003(local321)) {
						for (local440 = local267; local440 <= local73; local440++) {
							local511 = ((long) local434 << 32) + ((long) local440);
							local517 = (Class3_Sub13) Static447.aClass267_39.method6644(local511);
							if (local517 != null) {
								local532 = new Class3_Sub13(local221, local517.anInt1864);
								local517.method7820();
							} else if (local440 == -1) {
								local532 = new Class3_Sub13(local221, Static46.method1005(local434).aClass3_Sub13_2.anInt1864);
							} else {
								local532 = new Class3_Sub13(local221, -1);
							}
							Static447.aClass267_39.method6640(local532, local511);
						}
					}
					Static522.aClass133_166 = null;
					return true;
				} else if (Static522.aClass133_166 == Static133.aClass133_54) {
					local267 = Static90.aClass3_Sub27_Sub1_1.method7548();
					if (Static90.aClass3_Sub27_Sub1_1.method7548() == 0) {
						Static469.aClass105Array1[local267] = new Class105();
					} else {
						Static90.aClass3_Sub27_Sub1_1.anInt9191--;
						Static469.aClass105Array1[local267] = new Class105(Static90.aClass3_Sub27_Sub1_1);
					}
					Static82.anInt1212 = Static446.anInt8177;
					Static522.aClass133_166 = null;
					return true;
				} else {
					@Pc(626) boolean local626;
					if (Static522.aClass133_166 == Static245.aClass133_85) {
						local626 = Static90.aClass3_Sub27_Sub1_1.method7548() == 1;
						@Pc(631) byte[] local631 = new byte[Static35.anInt921 - 1];
						Static90.aClass3_Sub27_Sub1_1.method7571(local631, Static35.anInt921 - 1);
						Static160.method3123(local626, local631);
						Static522.aClass133_166 = null;
						return true;
					} else if (Static522.aClass133_166 == Static205.aClass133_76) {
						local267 = Static90.aClass3_Sub27_Sub1_1.method7610();
						local73 = Static90.aClass3_Sub27_Sub1_1.method7610();
						local221 = Static90.aClass3_Sub27_Sub1_1.method7605();
						if (Static46.method1003(local73)) {
							Static122.method2338(local267, local221);
						}
						Static522.aClass133_166 = null;
						return true;
					} else {
						@Pc(691) String local691;
						if (Static522.aClass133_166 == Static426.aClass133_140) {
							local267 = Static90.aClass3_Sub27_Sub1_1.method7591();
							local73 = Static90.aClass3_Sub27_Sub1_1.method7565();
							local691 = Static90.aClass3_Sub27_Sub1_1.method7589();
							if (Static46.method1003(local267)) {
								Static506.method7260(local73, local691);
							}
							Static522.aClass133_166 = null;
							return true;
						}
						@Pc(751) int local751;
						@Pc(735) long local735;
						@Pc(740) long local740;
						@Pc(755) int local755;
						@Pc(747) long local747;
						if (Static5.aClass133_12 == Static522.aClass133_166) {
							local626 = Static90.aClass3_Sub27_Sub1_1.method7548() == 1;
							local248 = Static90.aClass3_Sub27_Sub1_1.method7589();
							local691 = local248;
							if (local626) {
								local691 = Static90.aClass3_Sub27_Sub1_1.method7589();
							}
							local735 = Static90.aClass3_Sub27_Sub1_1.method7555();
							local740 = Static90.aClass3_Sub27_Sub1_1.method7591();
							local747 = Static90.aClass3_Sub27_Sub1_1.method7551();
							local751 = Static90.aClass3_Sub27_Sub1_1.method7548();
							local755 = Static90.aClass3_Sub27_Sub1_1.method7591();
							@Pc(761) long local761 = local747 + (local740 << 32);
							@Pc(763) boolean local763 = false;
							@Pc(765) int local765 = 0;
							while (true) {
								if (local765 >= 100) {
									if (local751 <= 1 && Static430.method7558(local691)) {
										local763 = true;
									}
									break;
								}
								if (Static99.aLongArray19[local765] == local761) {
									local763 = true;
									break;
								}
								local765++;
							}
							if (!local763 && Static202.anInt4523 == 0) {
								Static99.aLongArray19[Static449.anInt8225] = local761;
								Static449.anInt8225 = (Static449.anInt8225 + 1) % 100;
								@Pc(817) String local817 = Static494.aClass227_2.method5726(local755).method1325(Static90.aClass3_Sub27_Sub1_1);
								if (local751 == 2) {
									Static220.method4021(local248, "<img=1>" + local691, 0, local817, local755, "<img=1>" + local248, 20, Static179.method4141(local735));
								} else if (local751 == 1) {
									Static220.method4021(local248, "<img=0>" + local691, 0, local817, local755, "<img=0>" + local248, 20, Static179.method4141(local735));
								} else {
									Static220.method4021(local248, local691, 0, local817, local755, local248, 20, Static179.method4141(local735));
								}
							}
							Static522.aClass133_166 = null;
							return true;
						}
						@Pc(929) boolean local929;
						@Pc(1219) String local1219;
						@Pc(927) String local927;
						@Pc(951) int local951;
						@Pc(968) boolean local968;
						@Pc(1183) String local1183;
						if (Static490.aClass133_154 == Static522.aClass133_166) {
							while (Static35.anInt921 > Static90.aClass3_Sub27_Sub1_1.anInt9191) {
								local626 = Static90.aClass3_Sub27_Sub1_1.method7548() == 1;
								local248 = Static90.aClass3_Sub27_Sub1_1.method7589();
								local691 = Static90.aClass3_Sub27_Sub1_1.method7589();
								local321 = Static90.aClass3_Sub27_Sub1_1.method7591();
								local434 = Static90.aClass3_Sub27_Sub1_1.method7548();
								local927 = "";
								local929 = false;
								if (local321 > 0) {
									local927 = Static90.aClass3_Sub27_Sub1_1.method7589();
									local929 = Static90.aClass3_Sub27_Sub1_1.method7548() == 1;
								}
								for (local951 = 0; local951 < Static178.anInt4133; local951++) {
									if (local626) {
										if (local691.equals(Static520.aStringArray49[local951])) {
											Static520.aStringArray49[local951] = local248;
											local248 = null;
											Static368.aStringArray40[local951] = local691;
											break;
										}
									} else if (local248.equals(Static520.aStringArray49[local951])) {
										if (Static463.anIntArray711[local951] != local321) {
											local968 = true;
											for (@Pc(973) Class4_Sub3_Sub2 local973 = (Class4_Sub3_Sub2) Static200.aClass90_19.method2326(); local973 != null; local973 = (Class4_Sub3_Sub2) Static200.aClass90_19.method2325()) {
												if (local973.aString48.equals(local248)) {
													if (local321 != 0 && local973.aShort100 == 0) {
														local973.method7407();
														local968 = false;
													} else if (local321 == 0 && local973.aShort100 != 0) {
														local973.method7407();
														local968 = false;
													}
												}
											}
											if (local968) {
												Static200.aClass90_19.method2322(new Class4_Sub3_Sub2(local248, local321));
											}
											Static463.anIntArray711[local951] = local321;
										}
										Static368.aStringArray40[local951] = local691;
										Static35.aStringArray7[local951] = local927;
										Static298.anIntArray775[local951] = local434;
										Static356.aBooleanArray31[local951] = local929;
										local248 = null;
										break;
									}
								}
								if (local248 != null && Static178.anInt4133 < 200) {
									Static520.aStringArray49[Static178.anInt4133] = local248;
									Static368.aStringArray40[Static178.anInt4133] = local691;
									Static463.anIntArray711[Static178.anInt4133] = local321;
									Static35.aStringArray7[Static178.anInt4133] = local927;
									Static298.anIntArray775[Static178.anInt4133] = local434;
									Static356.aBooleanArray31[Static178.anInt4133] = local929;
									Static178.anInt4133++;
								}
							}
							Static305.anInt5997 = Static446.anInt8177;
							Static210.anInt4631 = 2;
							local73 = Static178.anInt4133;
							while (local73 > 0) {
								local626 = true;
								local73--;
								for (local221 = 0; local221 < local73; local221++) {
									if (Static463.anIntArray711[local221] != Static81.aClass319_5.anInt9320 && Static463.anIntArray711[local221 + 1] == Static81.aClass319_5.anInt9320 || Static463.anIntArray711[local221] == 0 && Static463.anIntArray711[local221 + 1] != 0) {
										local321 = Static463.anIntArray711[local221];
										Static463.anIntArray711[local221] = Static463.anIntArray711[local221 + 1];
										Static463.anIntArray711[local221 + 1] = local321;
										local1183 = Static35.aStringArray7[local221];
										Static35.aStringArray7[local221] = Static35.aStringArray7[local221 + 1];
										Static35.aStringArray7[local221 + 1] = local1183;
										local927 = Static520.aStringArray49[local221];
										Static520.aStringArray49[local221] = Static520.aStringArray49[local221 + 1];
										Static520.aStringArray49[local221 + 1] = local927;
										local1219 = Static368.aStringArray40[local221];
										Static368.aStringArray40[local221] = Static368.aStringArray40[local221 + 1];
										Static368.aStringArray40[local221 + 1] = local1219;
										local951 = Static298.anIntArray775[local221];
										Static298.anIntArray775[local221] = Static298.anIntArray775[local221 + 1];
										Static298.anIntArray775[local221 + 1] = local951;
										local968 = Static356.aBooleanArray31[local221];
										Static356.aBooleanArray31[local221] = Static356.aBooleanArray31[local221 + 1];
										Static356.aBooleanArray31[local221 + 1] = local968;
										local626 = false;
									}
								}
								if (local626) {
									break;
								}
							}
							Static522.aClass133_166 = null;
							return true;
						} else if (Static522.aClass133_166 == Static67.aClass133_30) {
							local267 = Static90.aClass3_Sub27_Sub1_1.method7591();
							local248 = Static90.aClass3_Sub27_Sub1_1.method7589();
							@Pc(1306) Object[] local1306 = new Object[local248.length() + 1];
							for (local321 = local248.length() - 1; local321 >= 0; local321--) {
								if (local248.charAt(local321) == 's') {
									local1306[local321 + 1] = Static90.aClass3_Sub27_Sub1_1.method7589();
								} else {
									local1306[local321 + 1] = Integer.valueOf(Static90.aClass3_Sub27_Sub1_1.method7549());
								}
							}
							local1306[0] = Integer.valueOf(Static90.aClass3_Sub27_Sub1_1.method7549());
							if (Static46.method1003(local267)) {
								@Pc(1361) Class3_Sub21 local1361 = new Class3_Sub21();
								local1361.anObjectArray4 = local1306;
								Static60.method1227(local1361);
							}
							Static522.aClass133_166 = null;
							return true;
						} else if (Static404.aClass133_133 == Static522.aClass133_166) {
							method3441(Static501.aBoolean654);
							Static522.aClass133_166 = null;
							return false;
						} else if (Static146.aClass133_59 == Static522.aClass133_166) {
							local267 = Static90.aClass3_Sub27_Sub1_1.method7591();
							local73 = Static90.aClass3_Sub27_Sub1_1.method7548();
							local221 = Static90.aClass3_Sub27_Sub1_1.method7548();
							local321 = Static90.aClass3_Sub27_Sub1_1.method7548();
							local434 = Static90.aClass3_Sub27_Sub1_1.method7548();
							local440 = Static90.aClass3_Sub27_Sub1_1.method7591();
							if (Static46.method1003(local267)) {
								Static400.aBooleanArray34[local73] = true;
								Static98.anIntArray216[local73] = local221;
								Static204.anIntArray581[local73] = local321;
								Static545.anIntArray780[local73] = local434;
								Static267.anIntArray473[local73] = local440;
							}
							Static522.aClass133_166 = null;
							return true;
						} else if (Static522.aClass133_166 == Static343.aClass133_112) {
							local267 = Static90.aClass3_Sub27_Sub1_1.method7591();
							local73 = Static90.aClass3_Sub27_Sub1_1.method7610();
							local221 = Static90.aClass3_Sub27_Sub1_1.method7568();
							local321 = Static90.aClass3_Sub27_Sub1_1.method7610();
							local434 = Static90.aClass3_Sub27_Sub1_1.method7549();
							if (Static46.method1003(local321)) {
								Static248.method4284(7, local221, local434, local267 << 16 | local73);
							}
							Static522.aClass133_166 = null;
							return true;
						} else if (Static447.aClass133_148 == Static522.aClass133_166) {
							Static6.method6473(Static196.aClass117_13);
							Static522.aClass133_166 = null;
							return true;
						} else if (Static137.aClass133_57 == Static522.aClass133_166) {
							local267 = Static90.aClass3_Sub27_Sub1_1.method7548();
							local73 = local267 >> 5;
							local221 = local267 & 0x1F;
							if (local221 == 0) {
								Static518.aClass296Array2[local73] = null;
								Static522.aClass133_166 = null;
								return true;
							}
							@Pc(1517) Class296 local1517 = new Class296();
							local1517.anInt8744 = local221;
							local1517.anInt8747 = Static90.aClass3_Sub27_Sub1_1.method7548();
							if (local1517.anInt8747 >= 0 && Static51.aClass119Array4.length > local1517.anInt8747) {
								if (local1517.anInt8744 == 1 || local1517.anInt8744 == 10) {
									local1517.anInt8745 = Static90.aClass3_Sub27_Sub1_1.method7591();
									Static90.aClass3_Sub27_Sub1_1.anInt9191 += 6;
								} else if (local1517.anInt8744 >= 2 && local1517.anInt8744 <= 6) {
									if (local1517.anInt8744 == 2) {
										local1517.anInt8739 = 256;
										local1517.anInt8743 = 256;
									}
									if (local1517.anInt8744 == 3) {
										local1517.anInt8739 = 256;
										local1517.anInt8743 = 0;
									}
									if (local1517.anInt8744 == 4) {
										local1517.anInt8743 = 512;
										local1517.anInt8739 = 256;
									}
									if (local1517.anInt8744 == 5) {
										local1517.anInt8743 = 256;
										local1517.anInt8739 = 0;
									}
									if (local1517.anInt8744 == 6) {
										local1517.anInt8739 = 512;
										local1517.anInt8743 = 256;
									}
									local1517.anInt8744 = 2;
									local1517.anInt8740 = Static90.aClass3_Sub27_Sub1_1.method7548();
									local1517.anInt8743 += Static90.aClass3_Sub27_Sub1_1.method7591() - Static223.anInt4827 << 9;
									local1517.anInt8739 += Static90.aClass3_Sub27_Sub1_1.method7591() - Static150.anInt3027 << 9;
									local1517.anInt8746 = Static90.aClass3_Sub27_Sub1_1.method7548() << 2;
									local1517.anInt8741 = Static90.aClass3_Sub27_Sub1_1.method7591();
								}
								local1517.anInt8738 = Static90.aClass3_Sub27_Sub1_1.method7591();
								if (local1517.anInt8738 == 65535) {
									local1517.anInt8738 = -1;
								}
								Static518.aClass296Array2[local73] = local1517;
							}
							Static522.aClass133_166 = null;
							return true;
						} else if (Static522.aClass133_166 == Static70.aClass133_17) {
							Static6.method6473(Static432.aClass117_18);
							Static522.aClass133_166 = null;
							return true;
						} else if (Static522.aClass133_166 == Static85.aClass133_44) {
							method3441(false);
							Static522.aClass133_166 = null;
							return false;
						} else {
							@Pc(1734) String local1734;
							if (Static262.aClass133_94 == Static522.aClass133_166) {
								local267 = Static90.aClass3_Sub27_Sub1_1.method7547();
								local73 = Static90.aClass3_Sub27_Sub1_1.method7549();
								local221 = Static90.aClass3_Sub27_Sub1_1.method7548();
								local1734 = "";
								local1183 = local1734;
								if ((local221 & 0x1) != 0) {
									local1734 = Static90.aClass3_Sub27_Sub1_1.method7589();
									if ((local221 & 0x2) == 0) {
										local1183 = local1734;
									} else {
										local1183 = Static90.aClass3_Sub27_Sub1_1.method7589();
									}
								}
								local927 = Static90.aClass3_Sub27_Sub1_1.method7589();
								if (local267 == 99) {
									Static457.method6860(local927);
								} else if (local1183.equals("") || !Static430.method7558(local1183)) {
									Static536.method7668(local1734, local73, local927, local1734, local267, local1183);
								} else {
									Static522.aClass133_166 = null;
									return true;
								}
								Static522.aClass133_166 = null;
								return true;
							} else if (Static505.aClass133_157 == Static522.aClass133_166) {
								Static6.method6473(Static84.aClass117_4);
								Static522.aClass133_166 = null;
								return true;
							} else {
								@Pc(1861) Class47 local1861;
								@Pc(1886) int local1886;
								@Pc(1846) boolean local1846;
								@Pc(2005) int local2005;
								@Pc(1824) boolean local1824;
								if (Static522.aClass133_166 == Static449.aClass133_149) {
									local213 = Static90.aClass3_Sub27_Sub1_1.method7589();
									local1824 = Static90.aClass3_Sub27_Sub1_1.method7548() == 1;
									if (local1824) {
										local248 = Static90.aClass3_Sub27_Sub1_1.method7589();
									} else {
										local248 = local213;
									}
									local321 = Static90.aClass3_Sub27_Sub1_1.method7591();
									@Pc(1844) byte local1844 = Static90.aClass3_Sub27_Sub1_1.method7584();
									local1846 = false;
									if (local1844 == -128) {
										local1846 = true;
									}
									if (local1846) {
										if (Static476.anInt7744 == 0) {
											Static522.aClass133_166 = null;
											return true;
										}
										for (local2005 = 0; Static476.anInt7744 > local2005 && (!Static468.aClass47Array1[local2005].aString11.equals(local248) || local321 != Static468.aClass47Array1[local2005].anInt1204); local2005++) {
										}
										if (local2005 < Static476.anInt7744) {
											while (Static476.anInt7744 - 1 > local2005) {
												Static468.aClass47Array1[local2005] = Static468.aClass47Array1[local2005 + 1];
												local2005++;
											}
											Static476.anInt7744--;
											Static468.aClass47Array1[Static476.anInt7744] = null;
										}
									} else {
										local1219 = Static90.aClass3_Sub27_Sub1_1.method7589();
										local1861 = new Class47();
										local1861.aString11 = local248;
										local1861.aString13 = local213;
										local1861.aString14 = Static329.method5266(local1861.aString11);
										local1861.anInt1204 = local321;
										local1861.aString12 = local1219;
										local1861.aByte6 = local1844;
										for (local1886 = Static476.anInt7744 - 1; local1886 >= 0; local1886--) {
											local751 = Static468.aClass47Array1[local1886].aString14.compareTo(local1861.aString14);
											if (local751 == 0) {
												Static468.aClass47Array1[local1886].anInt1204 = local321;
												Static468.aClass47Array1[local1886].aByte6 = local1844;
												Static468.aClass47Array1[local1886].aString12 = local1219;
												if (local248.equals(Static111.aClass6_Sub1_Sub2_Sub1_3.aString27)) {
													Static270.aByte47 = local1844;
												}
												Static522.aClass133_166 = null;
												Static367.anInt6867 = Static446.anInt8177;
												return true;
											}
											if (local751 < 0) {
												break;
											}
										}
										if (Static476.anInt7744 >= Static468.aClass47Array1.length) {
											Static522.aClass133_166 = null;
											return true;
										}
										for (local751 = Static476.anInt7744 - 1; local751 > local1886; local751--) {
											Static468.aClass47Array1[local751 + 1] = Static468.aClass47Array1[local751];
										}
										if (Static476.anInt7744 == 0) {
											Static468.aClass47Array1 = new Class47[100];
										}
										Static468.aClass47Array1[local1886 + 1] = local1861;
										Static476.anInt7744++;
										if (local248.equals(Static111.aClass6_Sub1_Sub2_Sub1_3.aString27)) {
											Static270.aByte47 = local1844;
										}
									}
									Static522.aClass133_166 = null;
									Static367.anInt6867 = Static446.anInt8177;
									return true;
								} else if (Static522.aClass133_166 == Static391.aClass133_129) {
									Static6.method6473(Static461.aClass117_19);
									Static522.aClass133_166 = null;
									return true;
								} else {
									@Pc(2109) Class3_Sub29 local2109;
									if (Static522.aClass133_166 == Static339.aClass133_99) {
										local267 = Static90.aClass3_Sub27_Sub1_1.method7591();
										local73 = Static90.aClass3_Sub27_Sub1_1.method7566();
										local221 = Static90.aClass3_Sub27_Sub1_1.method7561();
										local321 = Static90.aClass3_Sub27_Sub1_1.method7565();
										if (Static46.method1003(local267)) {
											local2109 = (Class3_Sub29) Static156.aClass267_14.method6644((long) local321);
											if (local2109 != null) {
												Static361.method5656(false, local2109.anInt5522 != local73, local2109);
											}
											Static84.method1741(local73, local321, local221, false);
										}
										Static522.aClass133_166 = null;
										return true;
									} else if (Static522.aClass133_166 == Static281.aClass133_100) {
										local267 = Static90.aClass3_Sub27_Sub1_1.method7562();
										local73 = Static90.aClass3_Sub27_Sub1_1.method7591();
										local221 = Static90.aClass3_Sub27_Sub1_1.method7549();
										local321 = Static90.aClass3_Sub27_Sub1_1.method7566();
										if (Static46.method1003(local321)) {
											Static248.method4284(5, local221, local267, local73);
										}
										Static522.aClass133_166 = null;
										return true;
									} else if (Static522.aClass133_166 == Static318.aClass133_90) {
										local267 = Static90.aClass3_Sub27_Sub1_1.method7591();
										local73 = Static90.aClass3_Sub27_Sub1_1.method7548();
										local1824 = (local73 & 0x1) == 1;
										Static355.method5577(local1824, local267);
										local321 = Static90.aClass3_Sub27_Sub1_1.method7591();
										for (local434 = 0; local434 < local321; local434++) {
											local440 = Static90.aClass3_Sub27_Sub1_1.method7610();
											local2005 = Static90.aClass3_Sub27_Sub1_1.method7580();
											if (local2005 == 255) {
												local2005 = Static90.aClass3_Sub27_Sub1_1.method7562();
											}
											Static366.method5732(local267, local2005, local1824, local440 - 1, local434);
										}
										Static275.anIntArray508[Static339.anInt5659++ & 0x1F] = local267;
										Static522.aClass133_166 = null;
										return true;
									} else {
										@Pc(2308) int local2308;
										if (Static522.aClass133_166 == Static399.aClass133_132) {
											local626 = Static90.aClass3_Sub27_Sub1_1.method7548() == 1;
											local248 = Static90.aClass3_Sub27_Sub1_1.method7589();
											local691 = local248;
											if (local626) {
												local691 = Static90.aClass3_Sub27_Sub1_1.method7589();
											}
											local735 = Static90.aClass3_Sub27_Sub1_1.method7555();
											local740 = Static90.aClass3_Sub27_Sub1_1.method7591();
											local747 = Static90.aClass3_Sub27_Sub1_1.method7551();
											local751 = Static90.aClass3_Sub27_Sub1_1.method7548();
											@Pc(2304) long local2304 = (local740 << 32) + local747;
											@Pc(2306) boolean local2306 = false;
											local2308 = 0;
											while (true) {
												if (local2308 >= 100) {
													if (local751 <= 1) {
														if (Static350.aBoolean421 && !Static128.aBoolean199 || Static307.aBoolean339) {
															local2306 = true;
														} else if (Static430.method7558(local691)) {
															local2306 = true;
														}
													}
													break;
												}
												if (local2304 == Static99.aLongArray19[local2308]) {
													local2306 = true;
													break;
												}
												local2308++;
											}
											if (!local2306 && Static202.anInt4523 == 0) {
												Static99.aLongArray19[Static449.anInt8225] = local2304;
												Static449.anInt8225 = (Static449.anInt8225 + 1) % 100;
												@Pc(2369) String local2369 = Static128.method2260(Static118.method2163(Static90.aClass3_Sub27_Sub1_1));
												if (local751 == 2 || local751 == 3) {
													Static220.method4021(local248, "<img=1>" + local691, 0, local2369, -1, "<img=1>" + local248, 9, Static179.method4141(local735));
												} else if (local751 == 1) {
													Static220.method4021(local248, "<img=0>" + local691, 0, local2369, -1, "<img=0>" + local248, 9, Static179.method4141(local735));
												} else {
													Static220.method4021(local248, local691, 0, local2369, -1, local248, 9, Static179.method4141(local735));
												}
											}
											Static522.aClass133_166 = null;
											return true;
										} else if (Static522.aClass133_166 == Static164.aClass133_70) {
											Static25.method784();
											Static522.aClass133_166 = null;
											return false;
										} else if (Static27.aClass133_21 == Static522.aClass133_166) {
											local267 = Static90.aClass3_Sub27_Sub1_1.method7604();
											local73 = Static90.aClass3_Sub27_Sub1_1.method7579();
											local221 = Static90.aClass3_Sub27_Sub1_1.method7565();
											local321 = Static90.aClass3_Sub27_Sub1_1.method7568();
											if (Static46.method1003(local321)) {
												Static370.method5846(local221, local267, local73);
											}
											Static522.aClass133_166 = null;
											return true;
										} else if (Static72.aClass133_32 == Static522.aClass133_166) {
											if (Static258.aFrame2 != null) {
												Static295.method4940(-1, Static7.aClass3_Sub15_Sub1_1.anInt8369, false, -1);
											}
											@Pc(2508) byte[] local2508 = new byte[Static35.anInt921];
											Static90.aClass3_Sub27_Sub1_1.method4544(Static35.anInt921, local2508);
											local248 = Static77.method1559(0, local2508, Static35.anInt921);
											Static211.method3883(Static401.aClass285_11, Static382.anInt7091 == 1, true, local248);
											Static522.aClass133_166 = null;
											return true;
										} else if (Static522.aClass133_166 == Static53.aClass133_27) {
											Static6.method6473(Static169.aClass117_10);
											Static522.aClass133_166 = null;
											return true;
										} else if (Static522.aClass133_166 == Static391.aClass133_128) {
											if (Static422.anInt8667 != -1) {
												Static342.method5429(0, Static422.anInt8667);
											}
											Static522.aClass133_166 = null;
											return true;
										} else if (Static228.aClass133_83 == Static522.aClass133_166) {
											local267 = Static90.aClass3_Sub27_Sub1_1.method7562();
											local73 = local267 >> 28 & 0x3;
											local221 = local267 >> 14 & 0x3FFF;
											local321 = local267 & 0x3FFF;
											local434 = Static90.aClass3_Sub27_Sub1_1.method7568();
											if (local434 == 65535) {
												local434 = -1;
											}
											local440 = Static90.aClass3_Sub27_Sub1_1.method7597();
											local2005 = local440 >> 2;
											local951 = local440 & 0x3;
											local1886 = Static447.anIntArray696[local2005];
											local321 -= Static150.anInt3027;
											local221 -= Static223.anInt4827;
											Static187.method3526(local73, local434, local951, local2005, local1886, local321, local221);
											Static522.aClass133_166 = null;
											return true;
										} else if (Static518.aClass133_40 == Static522.aClass133_166) {
											local267 = Static90.aClass3_Sub27_Sub1_1.method7562();
											local73 = Static90.aClass3_Sub27_Sub1_1.method7591();
											local221 = Static90.aClass3_Sub27_Sub1_1.method7565();
											if (Static46.method1003(local73)) {
												@Pc(2663) Class3_Sub29 local2663 = (Class3_Sub29) Static156.aClass267_14.method6644((long) local221);
												local2109 = (Class3_Sub29) Static156.aClass267_14.method6644((long) local267);
												if (local2109 != null) {
													Static361.method5656(false, local2663 == null || local2663.anInt5522 != local2109.anInt5522, local2109);
												}
												if (local2663 != null) {
													local2663.method7820();
													Static156.aClass267_14.method6640(local2663, (long) local267);
												}
												@Pc(2705) Class245 local2705 = Static46.method1005(local221);
												if (local2705 != null) {
													Static31.method809(local2705);
												}
												local2705 = Static46.method1005(local267);
												if (local2705 != null) {
													Static31.method809(local2705);
													Static264.method4639(true, local2705);
												}
												if (Static422.anInt8667 != -1) {
													Static342.method5429(1, Static422.anInt8667);
												}
											}
											Static522.aClass133_166 = null;
											return true;
										} else if (Static522.aClass133_166 == Static349.aClass133_115) {
											local267 = Static90.aClass3_Sub27_Sub1_1.method7591();
											local73 = Static90.aClass3_Sub27_Sub1_1.method7591();
											local221 = Static90.aClass3_Sub27_Sub1_1.method7591();
											local321 = Static90.aClass3_Sub27_Sub1_1.method7591();
											if (Static46.method1003(local267) && Static459.aClass245ArrayArray2[local73] != null) {
												for (local434 = local221; local434 < local321; local434++) {
													local440 = Static90.aClass3_Sub27_Sub1_1.method7551();
													if (Static459.aClass245ArrayArray2[local73].length > local434 && Static459.aClass245ArrayArray2[local73][local434] != null) {
														Static459.aClass245ArrayArray2[local73][local434].anInt7237 = local440;
													}
												}
											}
											Static522.aClass133_166 = null;
											return true;
										} else if (Static522.aClass133_166 == Static112.aClass133_134) {
											local213 = Static90.aClass3_Sub27_Sub1_1.method7589();
											local73 = Static90.aClass3_Sub27_Sub1_1.method7610();
											local221 = Static90.aClass3_Sub27_Sub1_1.method7568();
											if (Static46.method1003(local73)) {
												Static531.method7635(local213, local221);
											}
											Static522.aClass133_166 = null;
											return true;
										} else if (Static440.aClass133_144 == Static522.aClass133_166) {
											local267 = Static90.aClass3_Sub27_Sub1_1.method7591();
											local73 = Static90.aClass3_Sub27_Sub1_1.method7610();
											local221 = Static90.aClass3_Sub27_Sub1_1.method7566();
											local321 = Static90.aClass3_Sub27_Sub1_1.method7565();
											if (Static46.method1003(local267)) {
												Static257.method4539(local321, local73 + (local221 << 16));
											}
											Static522.aClass133_166 = null;
											return true;
										} else if (Static522.aClass133_166 == Static518.aClass133_41) {
											local267 = Static90.aClass3_Sub27_Sub1_1.method7566();
											local73 = Static90.aClass3_Sub27_Sub1_1.method7580();
											if (Static46.method1003(local267)) {
												Static243.anInt5022 = local73;
											}
											Static522.aClass133_166 = null;
											return true;
										} else if (Static522.aClass133_166 == Static108.aClass133_50) {
											local267 = Static90.aClass3_Sub27_Sub1_1.method7568();
											local73 = Static90.aClass3_Sub27_Sub1_1.method7562();
											local221 = Static90.aClass3_Sub27_Sub1_1.method7568();
											if (Static46.method1003(local221)) {
												Static432.method6573(local267, local73);
											}
											Static522.aClass133_166 = null;
											return true;
										} else {
											@Pc(2975) int local2975;
											if (Static522.aClass133_166 == Static412.aClass133_136) {
												local626 = Static90.aClass3_Sub27_Sub1_1.method7548() == 1;
												local248 = Static90.aClass3_Sub27_Sub1_1.method7589();
												local691 = local248;
												if (local626) {
													local691 = Static90.aClass3_Sub27_Sub1_1.method7589();
												}
												local735 = Static90.aClass3_Sub27_Sub1_1.method7591();
												local740 = Static90.aClass3_Sub27_Sub1_1.method7551();
												local951 = Static90.aClass3_Sub27_Sub1_1.method7548();
												local1886 = Static90.aClass3_Sub27_Sub1_1.method7591();
												@Pc(2971) long local2971 = (local735 << 32) + local740;
												@Pc(2973) boolean local2973 = false;
												local2975 = 0;
												while (true) {
													if (local2975 >= 100) {
														if (local951 <= 1 && Static430.method7558(local691)) {
															local2973 = true;
														}
														break;
													}
													if (Static99.aLongArray19[local2975] == local2971) {
														local2973 = true;
														break;
													}
													local2975++;
												}
												if (!local2973 && Static202.anInt4523 == 0) {
													Static99.aLongArray19[Static449.anInt8225] = local2971;
													Static449.anInt8225 = (Static449.anInt8225 + 1) % 100;
													@Pc(3026) String local3026 = Static494.aClass227_2.method5726(local1886).method1325(Static90.aClass3_Sub27_Sub1_1);
													if (local951 == 2) {
														Static220.method4021(local248, "<img=1>" + local691, 0, local3026, local1886, "<img=1>" + local248, 18, null);
													} else if (local951 == 1) {
														Static220.method4021(local248, "<img=0>" + local691, 0, local3026, local1886, "<img=0>" + local248, 18, null);
													} else {
														Static220.method4021(local248, local691, 0, local3026, local1886, local248, 18, null);
													}
												}
												Static522.aClass133_166 = null;
												return true;
											} else if (Static316.aClass133_107 == Static522.aClass133_166) {
												Static522.aClass133_166 = null;
												return false;
											} else if (Static522.aClass133_166 == Static521.aClass133_164) {
												local267 = Static90.aClass3_Sub27_Sub1_1.method7562();
												local73 = Static90.aClass3_Sub27_Sub1_1.method7568();
												Static127.aClass215_1.method5542(local73, local267);
												Static522.aClass133_166 = null;
												return true;
											} else if (Static355.aClass133_116 == Static522.aClass133_166) {
												local267 = Static90.aClass3_Sub27_Sub1_1.method7566();
												local73 = Static90.aClass3_Sub27_Sub1_1.method7568();
												if (local73 == 65535) {
													local73 = -1;
												}
												local221 = Static90.aClass3_Sub27_Sub1_1.method7605();
												if (Static46.method1003(local267)) {
													Static517.method7379(local221, local73);
												}
												Static522.aClass133_166 = null;
												return true;
											} else if (Static522.aClass133_166 == Static120.aClass133_53) {
												local267 = Static90.aClass3_Sub27_Sub1_1.method7605();
												local73 = Static90.aClass3_Sub27_Sub1_1.method7610();
												if (local73 == 65535) {
													local73 = -1;
												}
												local221 = Static90.aClass3_Sub27_Sub1_1.method7605();
												local321 = Static90.aClass3_Sub27_Sub1_1.method7568();
												if (Static46.method1003(local321)) {
													Static523.method7511(local73, local221, local267);
													@Pc(3201) Class27 local3201 = Static99.aClass96_7.method2508(local73);
													Static362.method5703(local3201.anInt856, local221, local3201.anInt845, local3201.anInt814);
													Static249.method4289(local3201.anInt822, local3201.anInt871, local221, local3201.anInt864);
												}
												Static522.aClass133_166 = null;
												return true;
											} else if (Static522.aClass133_166 == Static269.aClass133_95) {
												Static295.method4942(Static90.aClass3_Sub27_Sub1_1.method7589());
												Static522.aClass133_166 = null;
												return true;
											} else if (Static390.aClass133_127 == Static522.aClass133_166) {
												local267 = Static90.aClass3_Sub27_Sub1_1.method7548();
												@Pc(3251) boolean local3251 = (local267 & 0x1) == 1;
												local691 = Static90.aClass3_Sub27_Sub1_1.method7589();
												local1734 = Static90.aClass3_Sub27_Sub1_1.method7589();
												if (local1734.equals("")) {
													local1734 = local691;
												}
												local1183 = Static90.aClass3_Sub27_Sub1_1.method7589();
												local927 = Static90.aClass3_Sub27_Sub1_1.method7589();
												if (local927.equals("")) {
													local927 = local1183;
												}
												if (local3251) {
													for (local2005 = 0; local2005 < Static41.anInt1004; local2005++) {
														if (Static147.aStringArray21[local2005].equals(local927)) {
															Static241.aStringArray51[local2005] = local691;
															Static147.aStringArray21[local2005] = local1734;
															Static65.aStringArray11[local2005] = local1183;
															Static516.aStringArray48[local2005] = local927;
															break;
														}
													}
												} else {
													Static241.aStringArray51[Static41.anInt1004] = local691;
													Static147.aStringArray21[Static41.anInt1004] = local1734;
													Static65.aStringArray11[Static41.anInt1004] = local1183;
													Static516.aStringArray48[Static41.anInt1004] = local927;
													Static196.aBooleanArray22[Static41.anInt1004] = (local267 & 0x2) == 2;
													Static41.anInt1004++;
												}
												Static522.aClass133_166 = null;
												Static305.anInt5997 = Static446.anInt8177;
												return true;
											} else if (Static522.aClass133_166 == Static500.aClass133_156) {
												Static6.method6473(Static108.aClass117_8);
												Static522.aClass133_166 = null;
												return true;
											} else if (Static520.aClass133_163 == Static522.aClass133_166) {
												local213 = Static90.aClass3_Sub27_Sub1_1.method7589();
												local73 = Static90.aClass3_Sub27_Sub1_1.method7548();
												local221 = Static90.aClass3_Sub27_Sub1_1.method7561();
												local321 = Static90.aClass3_Sub27_Sub1_1.method7568();
												if (local321 == 65535) {
													local321 = -1;
												}
												if (local73 >= 1 && local73 <= 8) {
													if (local213.equalsIgnoreCase("null")) {
														local213 = null;
													}
													Static521.aStringArray50[local73 - 1] = local213;
													Static486.anIntArray673[local73 - 1] = local321;
													Static184.aBooleanArray21[local73 - 1] = local221 == 0;
												}
												Static522.aClass133_166 = null;
												return true;
											} else if (Static522.aClass133_166 == Static477.aClass133_151) {
												Static6.method6473(Static272.aClass117_17);
												Static522.aClass133_166 = null;
												return true;
											} else if (Static384.aClass133_124 == Static522.aClass133_166) {
												local267 = Static90.aClass3_Sub27_Sub1_1.method7610();
												local73 = Static90.aClass3_Sub27_Sub1_1.method7605();
												if (Static46.method1003(local267)) {
													Static248.method4284(3, -1, local73, -1);
												}
												Static522.aClass133_166 = null;
												return true;
											} else if (Static436.aClass133_143 == Static522.aClass133_166) {
												for (local267 = 0; local267 < Static498.aClass6_Sub1_Sub2_Sub1Array1.length; local267++) {
													if (Static498.aClass6_Sub1_Sub2_Sub1Array1[local267] != null) {
														Static498.aClass6_Sub1_Sub2_Sub1Array1[local267].anInt8592 = -1;
													}
												}
												for (local73 = 0; local73 < Static183.anInt5938; local73++) {
													Static47.aClass3_Sub3Array4[local73].aClass6_Sub1_Sub2_Sub2_1.anInt8592 = -1;
												}
												Static522.aClass133_166 = null;
												return true;
											} else if (Static522.aClass133_166 == Static23.aClass133_120) {
												local267 = Static90.aClass3_Sub27_Sub1_1.method7610();
												local73 = Static90.aClass3_Sub27_Sub1_1.method7580();
												Static127.aClass215_1.method5544(local267, local73);
												Static522.aClass133_166 = null;
												return true;
											} else if (Static522.aClass133_166 == Static389.aClass133_126) {
												Static510.method7314(Static35.anInt921, Static90.aClass3_Sub27_Sub1_1);
												Static522.aClass133_166 = null;
												return true;
											} else if (Static522.aClass133_166 == Static411.aClass133_135) {
												Static41.anInt1004 = Static90.aClass3_Sub27_Sub1_1.method7548();
												for (local267 = 0; local267 < Static41.anInt1004; local267++) {
													Static241.aStringArray51[local267] = Static90.aClass3_Sub27_Sub1_1.method7589();
													Static147.aStringArray21[local267] = Static90.aClass3_Sub27_Sub1_1.method7589();
													if (Static147.aStringArray21[local267].equals("")) {
														Static147.aStringArray21[local267] = Static241.aStringArray51[local267];
													}
													Static65.aStringArray11[local267] = Static90.aClass3_Sub27_Sub1_1.method7589();
													Static516.aStringArray48[local267] = Static90.aClass3_Sub27_Sub1_1.method7589();
													if (Static516.aStringArray48[local267].equals("")) {
														Static516.aStringArray48[local267] = Static65.aStringArray11[local267];
													}
													Static196.aBooleanArray22[local267] = false;
												}
												Static305.anInt5997 = Static446.anInt8177;
												Static522.aClass133_166 = null;
												return true;
											} else if (Static522.aClass133_166 == Static38.aClass133_22) {
												Static514.anInt8961 = Static90.aClass3_Sub27_Sub1_1.method7548();
												Static483.anInt8679 = Static446.anInt8177;
												Static522.aClass133_166 = null;
												return true;
											} else if (Static244.aClass133_84 == Static522.aClass133_166) {
												Static8.aClass29_1 = Static305.method5021(Static90.aClass3_Sub27_Sub1_1.method7548());
												Static522.aClass133_166 = null;
												return true;
											} else if (Static522.aClass133_166 == Static367.aClass133_119) {
												local267 = Static90.aClass3_Sub27_Sub1_1.method7566();
												local73 = Static90.aClass3_Sub27_Sub1_1.method7610();
												local221 = Static90.aClass3_Sub27_Sub1_1.method7610();
												local321 = Static90.aClass3_Sub27_Sub1_1.method7605();
												local434 = Static90.aClass3_Sub27_Sub1_1.method7568();
												if (Static46.method1003(local221)) {
													Static362.method5703(local267, local321, local73, local434);
												}
												Static522.aClass133_166 = null;
												return true;
											} else if (Static181.aClass133_74 == Static522.aClass133_166) {
												local267 = Static90.aClass3_Sub27_Sub1_1.method7561();
												local73 = Static90.aClass3_Sub27_Sub1_1.method7566();
												local221 = Static90.aClass3_Sub27_Sub1_1.method7566();
												@Pc(3702) Class3_Sub3 local3702 = (Class3_Sub3) Static240.aClass267_20.method6644((long) local221);
												if (local3702 != null) {
													Static314.method5089(local73, local3702.aClass6_Sub1_Sub2_Sub2_1, local267);
												}
												Static522.aClass133_166 = null;
												return true;
											} else if (Static314.aClass133_106 == Static522.aClass133_166) {
												local267 = Static90.aClass3_Sub27_Sub1_1.method7591();
												if (local267 == 65535) {
													local267 = -1;
												}
												local73 = Static90.aClass3_Sub27_Sub1_1.method7548();
												local221 = Static90.aClass3_Sub27_Sub1_1.method7591();
												local321 = Static90.aClass3_Sub27_Sub1_1.method7548();
												Static270.method4700(local221, local321, local267, local73);
												Static522.aClass133_166 = null;
												return true;
											} else if (Static306.aClass133_103 == Static522.aClass133_166) {
												Static522.aClass133_166 = null;
												Static210.anInt4631 = 1;
												Static305.anInt5997 = Static446.anInt8177;
												return true;
											} else if (Static104.aClass133_48 == Static522.aClass133_166) {
												local267 = Static90.aClass3_Sub27_Sub1_1.method7610();
												local73 = Static90.aClass3_Sub27_Sub1_1.method7580();
												local1824 = (local73 & 0x1) == 1;
												Static538.method7695(local1824, local267);
												Static275.anIntArray508[Static339.anInt5659++ & 0x1F] = local267;
												Static522.aClass133_166 = null;
												return true;
											} else if (Static522.aClass133_166 == Static313.aClass133_105) {
												Static6.method6473(Static157.aClass117_9);
												Static522.aClass133_166 = null;
												return true;
											} else if (Static522.aClass133_166 == Static341.aClass133_165) {
												Static525.method7528(true);
												Static522.aClass133_166 = null;
												return true;
											} else if (Static522.aClass133_166 == Static173.aClass133_73) {
												local267 = Static90.aClass3_Sub27_Sub1_1.method7591();
												if (Static46.method1003(local267)) {
													Static510.method7311();
												}
												Static522.aClass133_166 = null;
												return true;
											} else if (Static522.aClass133_166 == Static116.aClass133_47) {
												if (Static173.method3293(Static512.anInt8932)) {
													Static270.anInt5584 = (int) ((float) Static90.aClass3_Sub27_Sub1_1.method7591() * 2.5F);
												} else {
													Static270.anInt5584 = Static90.aClass3_Sub27_Sub1_1.method7591() * 30;
												}
												Static483.anInt8679 = Static446.anInt8177;
												Static522.aClass133_166 = null;
												return true;
											} else if (Static522.aClass133_166 == Static24.aClass133_20) {
												Static6.method6473(Static223.aClass117_14);
												Static522.aClass133_166 = null;
												return true;
											} else if (Static474.aClass133_150 == Static522.aClass133_166) {
												Static262.anInt5487 = Static90.aClass3_Sub27_Sub1_1.method7548();
												Static522.aClass133_166 = null;
												return true;
											} else if (Static522.aClass133_166 == Static168.aClass133_72) {
												local267 = Static90.aClass3_Sub27_Sub1_1.method7591();
												local73 = Static90.aClass3_Sub27_Sub1_1.method7609();
												local221 = Static90.aClass3_Sub27_Sub1_1.method7549();
												if (Static46.method1003(local267)) {
													Static378.method5907(local221, local73);
												}
												Static522.aClass133_166 = null;
												return true;
											} else if (Static522.aClass133_166 == Static98.aClass133_45) {
												Static127.aClass215_1.method5538();
												Static522.aClass133_166 = null;
												Static345.anInt6584 += 32;
												return true;
											} else if (Static522.aClass133_166 == Static164.aClass133_71) {
												Static437.anInt7994 = Static90.aClass3_Sub27_Sub1_1.method7604();
												Static483.anInt8679 = Static446.anInt8177;
												Static522.aClass133_166 = null;
												return true;
											} else if (Static337.aClass133_111 == Static522.aClass133_166) {
												Static6.method6473(Static27.aClass117_1);
												Static522.aClass133_166 = null;
												return true;
											} else if (Static522.aClass133_166 == Static311.aClass133_104) {
												Static90.aClass3_Sub27_Sub1_1.anInt9191 += 28;
												if (Static90.aClass3_Sub27_Sub1_1.method7563()) {
													Static145.method2503(Static90.aClass3_Sub27_Sub1_1.anInt9191 - 28, Static90.aClass3_Sub27_Sub1_1);
												}
												Static522.aClass133_166 = null;
												return true;
											} else if (Static224.aClass133_82 == Static522.aClass133_166) {
												local267 = Static90.aClass3_Sub27_Sub1_1.method7591();
												if (local267 == 65535) {
													local267 = -1;
												}
												local73 = Static90.aClass3_Sub27_Sub1_1.method7591();
												local221 = Static90.aClass3_Sub27_Sub1_1.method7605();
												local321 = Static90.aClass3_Sub27_Sub1_1.method7610();
												local434 = Static90.aClass3_Sub27_Sub1_1.method7568();
												if (local434 == 65535) {
													local434 = -1;
												}
												if (Static46.method1003(local321)) {
													for (local440 = local267; local440 <= local434; local440++) {
														local511 = (long) local440 + ((long) local221 << 32);
														local517 = (Class3_Sub13) Static447.aClass267_39.method6644(local511);
														if (local517 != null) {
															local532 = new Class3_Sub13(local517.anInt1859, local73);
															local517.method7820();
														} else if (local440 == -1) {
															local532 = new Class3_Sub13(Static46.method1005(local221).aClass3_Sub13_2.anInt1859, local73);
														} else {
															local532 = new Class3_Sub13(0, local73);
														}
														Static447.aClass267_39.method6640(local532, local511);
													}
												}
												Static522.aClass133_166 = null;
												return true;
											} else if (Static512.aClass133_159 == Static522.aClass133_166) {
												Static224.method4060();
												Static522.aClass133_166 = null;
												return false;
											} else if (Static522.aClass133_166 == Static48.aClass133_25) {
												Static6.method6473(Static173.aClass117_11);
												Static522.aClass133_166 = null;
												return true;
											} else if (Static2.aClass133_9 == Static522.aClass133_166) {
												@Pc(4123) byte local4123 = Static90.aClass3_Sub27_Sub1_1.method7586();
												local73 = Static90.aClass3_Sub27_Sub1_1.method7591();
												Static127.aClass215_1.method5542(local73, local4123);
												Static522.aClass133_166 = null;
												return true;
											} else if (Static522.aClass133_166 == Static541.aClass133_171) {
												local213 = Static90.aClass3_Sub27_Sub1_1.method7589();
												local73 = Static90.aClass3_Sub27_Sub1_1.method7591();
												local691 = Static494.aClass227_2.method5726(local73).method1325(Static90.aClass3_Sub27_Sub1_1);
												Static220.method4021(local213, local213, 0, local691, local73, local213, 19, null);
												Static522.aClass133_166 = null;
												return true;
											} else if (Static522.aClass133_166 == Static122.aClass133_56) {
												Static393.anInt7219 = Static90.aClass3_Sub27_Sub1_1.method7554();
												Static350.aBoolean421 = Static90.aClass3_Sub27_Sub1_1.method7548() == 1;
												Static522.aClass133_166 = null;
												return true;
											} else if (Static522.aClass133_166 == Static57.aClass133_28) {
												local267 = Static90.aClass3_Sub27_Sub1_1.method7591();
												local73 = Static90.aClass3_Sub27_Sub1_1.method7548();
												local1824 = (local73 & 0x1) == 1;
												while (Static90.aClass3_Sub27_Sub1_1.anInt9191 < Static35.anInt921) {
													local321 = Static90.aClass3_Sub27_Sub1_1.method7547();
													local434 = Static90.aClass3_Sub27_Sub1_1.method7591();
													local440 = 0;
													if (local434 != 0) {
														local440 = Static90.aClass3_Sub27_Sub1_1.method7548();
														if (local440 == 255) {
															local440 = Static90.aClass3_Sub27_Sub1_1.method7549();
														}
													}
													Static366.method5732(local267, local440, local1824, local434 - 1, local321);
												}
												Static275.anIntArray508[Static339.anInt5659++ & 0x1F] = local267;
												Static522.aClass133_166 = null;
												return true;
											} else {
												@Pc(4319) boolean local4319;
												if (Static161.aClass133_68 == Static522.aClass133_166) {
													local267 = Static90.aClass3_Sub27_Sub1_1.method7591();
													@Pc(4288) Class6_Sub1_Sub2_Sub1 local4288;
													if (Static342.anInt6448 == local267) {
														local4288 = Static111.aClass6_Sub1_Sub2_Sub1_3;
													} else {
														local4288 = Static498.aClass6_Sub1_Sub2_Sub1Array1[local267];
													}
													if (local4288 == null) {
														Static522.aClass133_166 = null;
														return true;
													}
													local221 = Static90.aClass3_Sub27_Sub1_1.method7591();
													local321 = Static90.aClass3_Sub27_Sub1_1.method7548();
													local4319 = (local221 & 0x8000) != 0;
													if (local4288.aString27 != null && local4288.aClass312_1 != null) {
														local1846 = false;
														if (local321 <= 1) {
															if (!local4319 && (Static350.aBoolean421 && !Static128.aBoolean199 || Static307.aBoolean339)) {
																local1846 = true;
															} else if (Static430.method7558(local4288.aString27)) {
																local1846 = true;
															}
														}
														if (!local1846 && Static202.anInt4523 == 0) {
															local951 = -1;
															if (local4319) {
																local221 &= 0x7FFF;
																@Pc(4378) Class201 local4378 = Static77.method1563(Static90.aClass3_Sub27_Sub1_1);
																local951 = local4378.anInt6162;
																local1219 = local4378.aClass3_Sub10_Sub3_1.method1325(Static90.aClass3_Sub27_Sub1_1);
															} else {
																local1219 = Static128.method2260(Static118.method2163(Static90.aClass3_Sub27_Sub1_1));
															}
															local4288.aString80 = local1219.trim();
															local4288.anInt8528 = local221 >> 8;
															local4288.anInt8567 = 150;
															local4288.anInt8546 = local221 & 0xFF;
															if (local321 == 1 || local321 == 2) {
																local1886 = local4319 ? 17 : 1;
															} else {
																local1886 = local4319 ? 17 : 2;
															}
															if (local321 == 2) {
																Static220.method4021(local4288.aString28, "<img=1>" + local4288.method2051(), 0, local1219, local951, "<img=1>" + local4288.method2052(), local1886, null);
															} else if (local321 == 1) {
																Static220.method4021(local4288.aString28, "<img=0>" + local4288.method2051(), 0, local1219, local951, "<img=0>" + local4288.method2052(), local1886, null);
															} else {
																Static220.method4021(local4288.aString28, local4288.method2051(), 0, local1219, local951, local4288.method2052(), local1886, null);
															}
														}
													}
													Static522.aClass133_166 = null;
													return true;
												} else if (Static361.aClass133_118 == Static522.aClass133_166) {
													local267 = Static90.aClass3_Sub27_Sub1_1.method7549();
													Static289.aClass212_2 = Static401.aClass285_11.method7042(local267);
													Static522.aClass133_166 = null;
													return true;
												} else if (Static83.aClass133_43 == Static522.aClass133_166) {
													local267 = Static90.aClass3_Sub27_Sub1_1.method7597();
													local73 = Static90.aClass3_Sub27_Sub1_1.method7580();
													local221 = Static90.aClass3_Sub27_Sub1_1.method7605();
													Static403.anIntArray652[local267] = local221;
													Static437.anIntArray679[local267] = local73;
													Static82.anIntArray157[local267] = 1;
													local321 = Static150.anIntArray352[local267] - 1;
													for (local434 = 0; local434 < local321; local434++) {
														if (local221 >= Class3_Sub10_Sub4.anIntArray682[local434]) {
															Static82.anIntArray157[local267] = local434 + 2;
														}
													}
													Static45.anIntArray143[Static263.anInt5497++ & 0x1F] = local267;
													Static522.aClass133_166 = null;
													return true;
												} else if (Static522.aClass133_166 == Static41.aClass133_24) {
													local267 = Static90.aClass3_Sub27_Sub1_1.method7591();
													if (local267 == 65535) {
														local267 = -1;
													}
													local73 = Static90.aClass3_Sub27_Sub1_1.method7566();
													local221 = Static90.aClass3_Sub27_Sub1_1.method7562();
													if (Static46.method1003(local73)) {
														Static248.method4284(1, -1, local221, local267);
													}
													Static522.aClass133_166 = null;
													return true;
												} else if (Static419.aClass133_139 == Static522.aClass133_166) {
													Static441.aString63 = Static35.anInt921 <= 2 ? Static83.aClass67_24.method1934(Static193.anInt7803) : Static90.aClass3_Sub27_Sub1_1.method7589();
													Static54.anInt1188 = Static35.anInt921 > 0 ? Static90.aClass3_Sub27_Sub1_1.method7591() : -1;
													if (Static54.anInt1188 == 65535) {
														Static54.anInt1188 = -1;
													}
													Static522.aClass133_166 = null;
													return true;
												} else if (Static252.aClass133_87 == Static522.aClass133_166) {
													Static119.anInt2569 = Static90.aClass3_Sub27_Sub1_1.method7580();
													Static327.anInt6264 = Static90.aClass3_Sub27_Sub1_1.method7557() << 3;
													Static495.anInt5643 = Static90.aClass3_Sub27_Sub1_1.method7584() << 3;
													Static522.aClass133_166 = null;
													return true;
												} else if (Static522.aClass133_166 == Static396.aClass133_131) {
													local267 = Static90.aClass3_Sub27_Sub1_1.method7591();
													local73 = Static90.aClass3_Sub27_Sub1_1.method7591();
													local221 = Static90.aClass3_Sub27_Sub1_1.method7597();
													if (Static46.method1003(local267)) {
														if (local221 == 2) {
															Static440.method6637();
														}
														Static422.anInt8667 = local73;
														Static173.method3294(local73);
														Static47.method7753(false);
														Static60.method1219(Static422.anInt8667);
														for (local321 = 0; local321 < 100; local321++) {
															Static125.aBooleanArray12[local321] = true;
														}
													}
													Static522.aClass133_166 = null;
													return true;
												} else if (Static274.aClass133_98 == Static522.aClass133_166) {
													local267 = Static90.aClass3_Sub27_Sub1_1.method7549();
													local73 = Static90.aClass3_Sub27_Sub1_1.method7591();
													if (Static46.method1003(local73)) {
														Static248.method4284(5, 0, local267, Static342.anInt6448);
													}
													Static522.aClass133_166 = null;
													return true;
												} else if (Static384.aClass133_125 == Static522.aClass133_166) {
													local267 = Static90.aClass3_Sub27_Sub1_1.method7591();
													local73 = Static90.aClass3_Sub27_Sub1_1.method7549();
													if (Static46.method1003(local267)) {
														@Pc(4803) Class3_Sub29 local4803 = (Class3_Sub29) Static156.aClass267_14.method6644((long) local73);
														if (local4803 != null) {
															Static361.method5656(false, true, local4803);
														}
														if (Static140.aClass245_4 != null) {
															Static31.method809(Static140.aClass245_4);
															Static140.aClass245_4 = null;
														}
													}
													Static522.aClass133_166 = null;
													return true;
												} else if (Static514.aClass133_161 == Static522.aClass133_166) {
													Static12.anInt630 = Static90.aClass3_Sub27_Sub1_1.method7548();
													Static435.anInt7969 = Static90.aClass3_Sub27_Sub1_1.method7548();
													Static522.aClass133_166 = null;
													return true;
												} else if (Static522.aClass133_166 == Static489.aClass133_153) {
													local626 = Static90.aClass3_Sub27_Sub1_1.method7548() == 1;
													local248 = Static90.aClass3_Sub27_Sub1_1.method7589();
													local691 = local248;
													if (local626) {
														local691 = Static90.aClass3_Sub27_Sub1_1.method7589();
													}
													local321 = Static90.aClass3_Sub27_Sub1_1.method7548();
													local4319 = false;
													if (local321 <= 1) {
														if (Static350.aBoolean421 && !Static128.aBoolean199 || Static307.aBoolean339) {
															local4319 = true;
														} else if (local321 <= 1 && Static430.method7558(local691)) {
															local4319 = true;
														}
													}
													if (!local4319 && Static202.anInt4523 == 0) {
														local927 = Static128.method2260(Static118.method2163(Static90.aClass3_Sub27_Sub1_1));
														if (local321 == 2) {
															Static220.method4021(local248, "<img=1>" + local691, 0, local927, -1, "<img=1>" + local248, 24, null);
														} else if (local321 == 1) {
															Static220.method4021(local248, "<img=0>" + local691, 0, local927, -1, "<img=0>" + local248, 24, null);
														} else {
															Static220.method4021(local248, local691, 0, local927, -1, local248, 24, null);
														}
													}
													Static522.aClass133_166 = null;
													return true;
												} else if (Static163.aClass133_170 == Static522.aClass133_166) {
													local626 = Static90.aClass3_Sub27_Sub1_1.method7548() == 1;
													local248 = Static90.aClass3_Sub27_Sub1_1.method7589();
													local691 = local248;
													if (local626) {
														local691 = Static90.aClass3_Sub27_Sub1_1.method7589();
													}
													local321 = Static90.aClass3_Sub27_Sub1_1.method7548();
													local434 = Static90.aClass3_Sub27_Sub1_1.method7591();
													local1846 = false;
													if (local321 <= 1 && Static430.method7558(local691)) {
														local1846 = true;
													}
													if (!local1846 && Static202.anInt4523 == 0) {
														local1219 = Static494.aClass227_2.method5726(local434).method1325(Static90.aClass3_Sub27_Sub1_1);
														if (local321 == 2) {
															Static220.method4021(local248, "<img=1>" + local691, 0, local1219, local434, "<img=1>" + local248, 25, null);
														} else if (local321 == 1) {
															Static220.method4021(local248, "<img=0>" + local691, 0, local1219, local434, "<img=0>" + local248, 25, null);
														} else {
															Static220.method4021(local248, local691, 0, local1219, local434, local248, 25, null);
														}
													}
													Static522.aClass133_166 = null;
													return true;
												} else {
													@Pc(5157) int local5157;
													if (Static522.aClass133_166 == Static478.aClass133_152) {
														local626 = Static90.aClass3_Sub27_Sub1_1.method7548() == 1;
														local248 = Static90.aClass3_Sub27_Sub1_1.method7589();
														local691 = local248;
														if (local626) {
															local691 = Static90.aClass3_Sub27_Sub1_1.method7589();
														}
														local735 = Static90.aClass3_Sub27_Sub1_1.method7591();
														local740 = Static90.aClass3_Sub27_Sub1_1.method7551();
														local951 = Static90.aClass3_Sub27_Sub1_1.method7548();
														@Pc(5153) long local5153 = (local735 << 32) + local740;
														@Pc(5155) boolean local5155 = false;
														local5157 = 0;
														while (true) {
															if (local5157 >= 100) {
																if (local951 <= 1) {
																	if (Static350.aBoolean421 && !Static128.aBoolean199 || Static307.aBoolean339) {
																		local5155 = true;
																	} else if (Static430.method7558(local691)) {
																		local5155 = true;
																	}
																}
																break;
															}
															if (local5153 == Static99.aLongArray19[local5157]) {
																local5155 = true;
																break;
															}
															local5157++;
														}
														if (!local5155 && Static202.anInt4523 == 0) {
															Static99.aLongArray19[Static449.anInt8225] = local5153;
															Static449.anInt8225 = (Static449.anInt8225 + 1) % 100;
															@Pc(5223) String local5223 = Static128.method2260(Static118.method2163(Static90.aClass3_Sub27_Sub1_1));
															if (local951 == 2) {
																Static220.method4021(local248, "<img=1>" + local691, 0, local5223, -1, "<img=1>" + local248, 7, null);
															} else if (local951 == 1) {
																Static220.method4021(local248, "<img=0>" + local691, 0, local5223, -1, "<img=0>" + local248, 7, null);
															} else {
																Static220.method4021(local248, local691, 0, local5223, -1, local248, 3, null);
															}
														}
														Static522.aClass133_166 = null;
														return true;
													} else if (Static253.aClass133_88 == Static522.aClass133_166) {
														local267 = Static90.aClass3_Sub27_Sub1_1.method7610();
														local73 = Static90.aClass3_Sub27_Sub1_1.method7568();
														local221 = Static90.aClass3_Sub27_Sub1_1.method7610();
														local321 = Static90.aClass3_Sub27_Sub1_1.method7605();
														local434 = Static90.aClass3_Sub27_Sub1_1.method7561();
														local1846 = (local434 & 0x80) != 0;
														if (local321 >> 30 == 0) {
															@Pc(5411) Class122 local5411;
															@Pc(5391) Class186 local5391;
															@Pc(5405) Class122 local5405;
															if (local321 >> 29 != 0) {
																local2005 = local321 & 0xFFFF;
																@Pc(5660) Class3_Sub3 local5660 = (Class3_Sub3) Static240.aClass267_20.method6644((long) local2005);
																if (local5660 != null) {
																	if (local267 == 65535) {
																		local267 = -1;
																	}
																	@Pc(5670) Class6_Sub1_Sub2_Sub2 local5670 = local5660.aClass6_Sub1_Sub2_Sub2_1;
																	@Pc(5672) boolean local5672 = true;
																	local755 = local1846 ? local5670.anInt8526 : local5670.anInt8565;
																	if (local267 != -1 && local755 != -1) {
																		if (local267 == local755) {
																			local5391 = Static17.aClass231_2.method5905(local267);
																			if (local5391.aBoolean375 && local5391.anInt5838 != -1) {
																				local5405 = Static46.aClass247_1.method6029(local5391.anInt5838);
																				local2308 = local5405.anInt4145;
																				if (local2308 == 0 || local2308 == 2) {
																					local5672 = false;
																				} else if (local2308 == 1) {
																					local5672 = true;
																				}
																			}
																		} else {
																			local5391 = Static17.aClass231_2.method5905(local267);
																			@Pc(5699) Class186 local5699 = Static17.aClass231_2.method5905(local755);
																			if (local5391.anInt5838 != -1 && local5699.anInt5838 != -1) {
																				local5411 = Static46.aClass247_1.method6029(local5391.anInt5838);
																				@Pc(5719) Class122 local5719 = Static46.aClass247_1.method6029(local5699.anInt5838);
																				if (local5411.anInt4146 < local5719.anInt4146) {
																					local5672 = false;
																				}
																			}
																		}
																	}
																	if (local5672) {
																		if (local1846) {
																			local5670.anInt8526 = local267;
																			local5670.anInt8529 = 1;
																			local5670.anInt8569 = Static223.anInt4829 + local221;
																			local5670.anInt8524 = local73;
																			local5670.anInt8571 = local434 & 0x7;
																			local5670.anInt8543 = 0;
																			local5670.anInt8586 = 0;
																			if (local5670.anInt8569 > Static223.anInt4829) {
																				local5670.anInt8543 = -1;
																			}
																			if (local5670.anInt8526 != -1 && Static223.anInt4829 == local5670.anInt8569) {
																				local5157 = Static17.aClass231_2.method5905(local5670.anInt8526).anInt5838;
																				if (local5157 != -1) {
																					local5405 = Static46.aClass247_1.method6029(local5157);
																					if (local5405 != null && local5405.anIntArray396 != null) {
																						Static448.method6790(false, local5670.anInt8811, local5670.anInt8813, local5670.aByte100, local5405, 0);
																					}
																				}
																			}
																		} else {
																			local5670.anInt8562 = 0;
																			local5670.anInt8596 = local434 & 0x7;
																			local5670.anInt8578 = local73;
																			local5670.anInt8581 = 1;
																			local5670.anInt8549 = 0;
																			local5670.anInt8537 = local221 + Static223.anInt4829;
																			local5670.anInt8565 = local267;
																			if (Static223.anInt4829 < local5670.anInt8537) {
																				local5670.anInt8562 = -1;
																			}
																			if (local5670.anInt8565 != -1 && Static223.anInt4829 == local5670.anInt8537) {
																				local5157 = Static17.aClass231_2.method5905(local5670.anInt8565).anInt5838;
																				if (local5157 != -1) {
																					local5405 = Static46.aClass247_1.method6029(local5157);
																					if (local5405 != null && local5405.anIntArray396 != null) {
																						Static448.method6790(false, local5670.anInt8811, local5670.anInt8813, local5670.aByte100, local5405, 0);
																					}
																				}
																			}
																		}
																	}
																}
															} else if (local321 >> 28 != 0) {
																local2005 = local321 & 0xFFFF;
																@Pc(5350) Class6_Sub1_Sub2_Sub1 local5350;
																if (Static342.anInt6448 == local2005) {
																	local5350 = Static111.aClass6_Sub1_Sub2_Sub1_3;
																} else {
																	local5350 = Static498.aClass6_Sub1_Sub2_Sub1Array1[local2005];
																}
																if (local5350 != null) {
																	if (local267 == 65535) {
																		local267 = -1;
																	}
																	local968 = true;
																	local751 = local1846 ? local5350.anInt8526 : local5350.anInt8565;
																	@Pc(5442) Class122 local5442;
																	if (local267 != -1 && local751 != -1) {
																		@Pc(5386) Class186 local5386;
																		if (local267 == local751) {
																			local5386 = Static17.aClass231_2.method5905(local267);
																			if (local5386.aBoolean375 && local5386.anInt5838 != -1) {
																				local5442 = Static46.aClass247_1.method6029(local5386.anInt5838);
																				local2975 = local5442.anInt4145;
																				if (local2975 == 0 || local2975 == 2) {
																					local968 = false;
																				} else if (local2975 == 1) {
																					local968 = true;
																				}
																			}
																		} else {
																			local5386 = Static17.aClass231_2.method5905(local267);
																			local5391 = Static17.aClass231_2.method5905(local751);
																			if (local5386.anInt5838 != -1 && local5391.anInt5838 != -1) {
																				local5405 = Static46.aClass247_1.method6029(local5386.anInt5838);
																				local5411 = Static46.aClass247_1.method6029(local5391.anInt5838);
																				if (local5405.anInt4146 < local5411.anInt4146) {
																					local968 = false;
																				}
																			}
																		}
																	}
																	if (local968) {
																		if (local1846) {
																			local5350.anInt8543 = 0;
																			local5350.anInt8586 = 0;
																			local5350.anInt8529 = 1;
																			local5350.anInt8524 = local73;
																			local5350.anInt8571 = local434 & 0x7;
																			local5350.anInt8569 = local221 + Static223.anInt4829;
																			local5350.anInt8526 = local267;
																			if (local5350.anInt8526 == 65535) {
																				local5350.anInt8526 = -1;
																			}
																			if (Static223.anInt4829 < local5350.anInt8569) {
																				local5350.anInt8543 = -1;
																			}
																			if (local5350.anInt8526 != -1 && Static223.anInt4829 == local5350.anInt8569) {
																				local755 = Static17.aClass231_2.method5905(local5350.anInt8526).anInt5838;
																				if (local755 != -1) {
																					local5442 = Static46.aClass247_1.method6029(local755);
																					if (local5442 != null && local5442.anIntArray396 != null) {
																						Static448.method6790(local5350 == Static111.aClass6_Sub1_Sub2_Sub1_3, local5350.anInt8811, local5350.anInt8813, local5350.aByte100, local5442, 0);
																					}
																				}
																			}
																		} else {
																			local5350.anInt8565 = local267;
																			local5350.anInt8537 = local221 + Static223.anInt4829;
																			local5350.anInt8596 = local434 & 0x7;
																			local5350.anInt8562 = 0;
																			local5350.anInt8581 = 1;
																			local5350.anInt8578 = local73;
																			local5350.anInt8549 = 0;
																			if (local5350.anInt8565 == 65535) {
																				local5350.anInt8565 = -1;
																			}
																			if (local5350.anInt8537 > Static223.anInt4829) {
																				local5350.anInt8562 = -1;
																			}
																			if (local5350.anInt8565 != -1 && local5350.anInt8537 == Static223.anInt4829) {
																				local755 = Static17.aClass231_2.method5905(local5350.anInt8565).anInt5838;
																				if (local755 != -1) {
																					local5442 = Static46.aClass247_1.method6029(local755);
																					if (local5442 != null && local5442.anIntArray396 != null) {
																						Static448.method6790(Static111.aClass6_Sub1_Sub2_Sub1_3 == local5350, local5350.anInt8811, local5350.anInt8813, local5350.aByte100, local5442, 0);
																					}
																				}
																			}
																		}
																	}
																}
															}
														} else {
															local2005 = local321 >> 28 & 0x3;
															local951 = (local321 >> 14 & 0x3FFF) - Static223.anInt4827;
															local1886 = (local321 & 0x3FFF) - Static150.anInt3027;
															if (local951 >= 0 && local1886 >= 0 && Static118.anInt2527 > local951 && Static549.anInt9482 > local1886) {
																local751 = local951 * 512 + 256;
																local755 = local1886 * 512 + 256;
																local5157 = local2005;
																if (local2005 < 3 && Static307.method4073(local951, local1886)) {
																	local5157 = local2005 + 1;
																}
																@Pc(6024) Class6_Sub1_Sub1 local6024 = new Class6_Sub1_Sub1(local267, 0, Static223.anInt4829, local2005, local5157, local751, Static58.method1166(local755, local751, local2005) - local73, local755, local951, local951, local1886, local1886, local434 & 0x7);
																Static422.aClass71_65.method2076(new Class3_Sub10_Sub17(local6024));
															}
														}
														Static522.aClass133_166 = null;
														return true;
													} else if (Static81.aClass133_42 == Static522.aClass133_166) {
														local267 = Static90.aClass3_Sub27_Sub1_1.method7548();
														local73 = Static90.aClass3_Sub27_Sub1_1.method7561();
														if (local267 == 255) {
															local73 = -1;
															local267 = -1;
														}
														Static493.method7819(local73, local267);
														Static522.aClass133_166 = null;
														return true;
													} else if (Static544.aClass133_172 == Static522.aClass133_166) {
														Static367.anInt6867 = Static446.anInt8177;
														if (Static35.anInt921 == 0) {
															Static476.anInt7744 = 0;
															Static98.aString22 = null;
															Static522.aClass133_166 = null;
															Static468.aClass47Array1 = null;
															Static382.aString51 = null;
															return true;
														}
														Static382.aString51 = Static90.aClass3_Sub27_Sub1_1.method7589();
														local626 = Static90.aClass3_Sub27_Sub1_1.method7548() == 1;
														if (local626) {
															Static90.aClass3_Sub27_Sub1_1.method7589();
														}
														@Pc(6108) long local6108 = Static90.aClass3_Sub27_Sub1_1.method7555();
														Static98.aString22 = Static190.method3578(local6108);
														Static68.aByte7 = Static90.aClass3_Sub27_Sub1_1.method7584();
														local321 = Static90.aClass3_Sub27_Sub1_1.method7548();
														if (local321 == 255) {
															Static522.aClass133_166 = null;
															return true;
														}
														Static476.anInt7744 = local321;
														@Pc(6132) Class47[] local6132 = new Class47[100];
														for (local440 = 0; local440 < Static476.anInt7744; local440++) {
															local6132[local440] = new Class47();
															local6132[local440].aString13 = Static90.aClass3_Sub27_Sub1_1.method7589();
															local626 = Static90.aClass3_Sub27_Sub1_1.method7548() == 1;
															if (local626) {
																local6132[local440].aString11 = Static90.aClass3_Sub27_Sub1_1.method7589();
															} else {
																local6132[local440].aString11 = local6132[local440].aString13;
															}
															local6132[local440].aString14 = Static329.method5266(local6132[local440].aString11);
															local6132[local440].anInt1204 = Static90.aClass3_Sub27_Sub1_1.method7591();
															local6132[local440].aByte6 = Static90.aClass3_Sub27_Sub1_1.method7584();
															local6132[local440].aString12 = Static90.aClass3_Sub27_Sub1_1.method7589();
															if (local6132[local440].aString11.equals(Static111.aClass6_Sub1_Sub2_Sub1_3.aString27)) {
																Static270.aByte47 = local6132[local440].aByte6;
															}
														}
														local1886 = Static476.anInt7744;
														while (local1886 > 0) {
															local1886--;
															local929 = true;
															for (local751 = 0; local751 < local1886; local751++) {
																if (local6132[local751].aString14.compareTo(local6132[local751 + 1].aString14) > 0) {
																	local1861 = local6132[local751];
																	local6132[local751] = local6132[local751 + 1];
																	local6132[local751 + 1] = local1861;
																	local929 = false;
																}
															}
															if (local929) {
																break;
															}
														}
														Static522.aClass133_166 = null;
														Static468.aClass47Array1 = local6132;
														return true;
													} else if (Static522.aClass133_166 == Static534.aClass133_169) {
														Static6.method6473(Static38.aClass117_2);
														Static522.aClass133_166 = null;
														return true;
													} else if (Static193.aClass133_138 == Static522.aClass133_166) {
														Static525.method7528(false);
														Static522.aClass133_166 = null;
														return true;
													} else if (Static522.aClass133_166 == Static23.aClass133_121) {
														Static6.method6473(Static179.aClass117_15);
														Static522.aClass133_166 = null;
														return true;
													} else if (Static260.aClass133_93 == Static522.aClass133_166) {
														local267 = Static90.aClass3_Sub27_Sub1_1.method7580();
														local73 = Static90.aClass3_Sub27_Sub1_1.method7561();
														local221 = Static90.aClass3_Sub27_Sub1_1.method7566();
														if (local221 == 65535) {
															local221 = -1;
														}
														Static25.method783(local73, local267, local221);
														Static522.aClass133_166 = null;
														return true;
													} else if (Static295.aClass133_102 == Static522.aClass133_166) {
														local267 = Static90.aClass3_Sub27_Sub1_1.method7566();
														if (local267 == 65535) {
															local267 = -1;
														}
														local73 = Static90.aClass3_Sub27_Sub1_1.method7561();
														local221 = Static90.aClass3_Sub27_Sub1_1.method7575();
														Static222.method4040(local221, local267, local73);
														Static522.aClass133_166 = null;
														return true;
													} else if (Static375.aClass133_122 == Static522.aClass133_166) {
														Static327.anInt6264 = Static90.aClass3_Sub27_Sub1_1.method7584() << 3;
														Static119.anInt2569 = Static90.aClass3_Sub27_Sub1_1.method7580();
														Static495.anInt5643 = Static90.aClass3_Sub27_Sub1_1.method7598() << 3;
														while (Static35.anInt921 > Static90.aClass3_Sub27_Sub1_1.anInt9191) {
															@Pc(6412) Class117 local6412 = Static207.method3828()[Static90.aClass3_Sub27_Sub1_1.method7548()];
															Static6.method6473(local6412);
														}
														Static522.aClass133_166 = null;
														return true;
													} else if (Static522.aClass133_166 == Static376.aClass133_158) {
														local267 = Static90.aClass3_Sub27_Sub1_1.method7562();
														local73 = Static90.aClass3_Sub27_Sub1_1.method7591();
														Static127.aClass215_1.method5544(local73, local267);
														Static522.aClass133_166 = null;
														return true;
													} else if (Static522.aClass133_166 == Static287.aClass133_101) {
														Static495.anInt5643 = Static90.aClass3_Sub27_Sub1_1.method7586() << 3;
														Static327.anInt6264 = Static90.aClass3_Sub27_Sub1_1.method7557() << 3;
														Static119.anInt2569 = Static90.aClass3_Sub27_Sub1_1.method7597();
														for (@Pc(6475) Class3_Sub12 local6475 = (Class3_Sub12) Static476.aClass267_37.method6643(); local6475 != null; local6475 = (Class3_Sub12) Static476.aClass267_37.method6650()) {
															local73 = (int) (local6475.aLong285 >> 28 & 0x3L);
															local221 = (int) (local6475.aLong285 & 0x3FFFL);
															local321 = local221 - Static223.anInt4827;
															local434 = (int) (local6475.aLong285 >> 14 & 0x3FFFL);
															local440 = local434 - Static150.anInt3027;
															if (Static119.anInt2569 == local73 && local321 >= Static495.anInt5643 && Static495.anInt5643 + 8 > local321 && Static327.anInt6264 <= local440 && local440 < Static327.anInt6264 + 8) {
																local6475.method7820();
																if (local321 >= 0 && local440 >= 0 && local321 < Static118.anInt2527 && Static549.anInt9482 > local440) {
																	Static71.method1459(Static119.anInt2569, local321, local440);
																}
															}
														}
														for (@Pc(6581) Class3_Sub8 local6581 = (Class3_Sub8) Static536.aClass71_67.method2089(); local6581 != null; local6581 = (Class3_Sub8) Static536.aClass71_67.method2086()) {
															if (local6581.anInt789 >= Static495.anInt5643 && local6581.anInt789 < Static495.anInt5643 + 8 && Static327.anInt6264 <= local6581.anInt791 && local6581.anInt791 < Static327.anInt6264 + 8 && Static119.anInt2569 == local6581.anInt795) {
																local6581.anInt801 = 0;
															}
														}
														Static522.aClass133_166 = null;
														return true;
													} else if (Static522.aClass133_166 == Static429.aClass133_141) {
														local267 = Static90.aClass3_Sub27_Sub1_1.method7591();
														if (Static46.method1003(local267)) {
															Static345.method5498();
														}
														Static522.aClass133_166 = null;
														return true;
													} else if (Static514.aClass133_160 == Static522.aClass133_166) {
														local267 = Static90.aClass3_Sub27_Sub1_1.method7565();
														local73 = Static90.aClass3_Sub27_Sub1_1.method7568();
														local221 = Static90.aClass3_Sub27_Sub1_1.method7591();
														if (Static46.method1003(local73)) {
															Static232.method4125(local221, local267);
														}
														Static522.aClass133_166 = null;
														return true;
													} else if (Static522.aClass133_166 == Static133.aClass133_55) {
														local267 = Static90.aClass3_Sub27_Sub1_1.method7591();
														if (local267 == 65535) {
															local267 = -1;
														}
														local73 = Static90.aClass3_Sub27_Sub1_1.method7548();
														local221 = Static90.aClass3_Sub27_Sub1_1.method7591();
														local321 = Static90.aClass3_Sub27_Sub1_1.method7548();
														Static144.method2483(local321, local267, false, local221, local73);
														Static522.aClass133_166 = null;
														return true;
													} else if (Static387.aClass133_173 == Static522.aClass133_166) {
														Static274.method4754(Static401.aClass285_11, Static35.anInt921, Static90.aClass3_Sub27_Sub1_1);
														Static522.aClass133_166 = null;
														return true;
													} else if (Static522.aClass133_166 == Static147.aClass133_60) {
														local267 = Static90.aClass3_Sub27_Sub1_1.method7591();
														local73 = Static90.aClass3_Sub27_Sub1_1.method7548();
														local221 = Static90.aClass3_Sub27_Sub1_1.method7548();
														local321 = Static90.aClass3_Sub27_Sub1_1.method7591() << 2;
														local434 = Static90.aClass3_Sub27_Sub1_1.method7548();
														local440 = Static90.aClass3_Sub27_Sub1_1.method7548();
														if (Static46.method1003(local267)) {
															Static294.method4934(true, local221, local321, local73, local434, local440);
														}
														Static522.aClass133_166 = null;
														return true;
													} else if (Static522.aClass133_166 == Static319.aClass133_108) {
														local267 = Static90.aClass3_Sub27_Sub1_1.method7566();
														@Pc(6794) byte local6794 = Static90.aClass3_Sub27_Sub1_1.method7557();
														local221 = Static90.aClass3_Sub27_Sub1_1.method7566();
														if (Static46.method1003(local221)) {
															Static122.method2338(local267, local6794);
														}
														Static522.aClass133_166 = null;
														return true;
													} else if (Static377.aClass133_123 == Static522.aClass133_166) {
														local267 = Static90.aClass3_Sub27_Sub1_1.method7591();
														local73 = Static90.aClass3_Sub27_Sub1_1.method7591();
														local221 = Static90.aClass3_Sub27_Sub1_1.method7605();
														if (Static46.method1003(local73)) {
															Static372.method5864(local267, local221);
														}
														Static522.aClass133_166 = null;
														return true;
													} else if (Static522.aClass133_166 == Static394.aClass133_130) {
														Static6.method6473(Static97.aClass117_7);
														Static522.aClass133_166 = null;
														return true;
													} else if (Static522.aClass133_166 == Static38.aClass133_23) {
														Static6.method6473(Static54.aClass117_3);
														Static522.aClass133_166 = null;
														return true;
													} else {
														Static2.method220(null, "T1 - " + (Static522.aClass133_166 == null ? -1 : Static522.aClass133_166.method3770()) + "," + (Static358.aClass133_117 == null ? -1 : Static358.aClass133_117.method3770()) + "," + (Static159.aClass133_67 == null ? -1 : Static159.aClass133_67.method3770()) + " - " + Static35.anInt921);
														method3441(false);
														return true;
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IB)V")
	public static void method3437(@OriginalArg(0) int arg0) {
		@Pc(13) Class3_Sub10_Sub16 local13 = Static362.method5701(arg0, 10);
		local13.method6212();
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BI)Z")
	public static boolean method3438(@OriginalArg(1) int arg0) {
		return arg0 == 6 || arg0 == 8;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BZ)V")
	public static void method3441(@OriginalArg(1) boolean arg0) {
		if (Static467.aClass41_1 != null) {
			Static467.aClass41_1.method1066();
			Static467.aClass41_1 = null;
		}
		Static428.anInt7883 = 0;
		Static130.method2265();
		Static460.method3562();
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			Static95.aClass306Array1[local19].method7366();
		}
		Static308.method5029(false);
		System.gc();
		Static61.method1235();
		Static506.anInt8842 = -1;
		Static432.aBoolean563 = false;
		Static312.method5076(true);
		Static429.anInt7899 = 0;
		Static223.anInt4827 = 0;
		Static34.anInt888 = 0;
		Static318.anInt5230 = 0;
		Static340.anInt6418 = 0;
		Static150.anInt3027 = 0;
		for (@Pc(69) int local69 = 0; local69 < Static518.aClass296Array2.length; local69++) {
			Static518.aClass296Array2[local69] = null;
		}
		Static310.method5035();
		for (@Pc(84) int local84 = 0; local84 < 2048; local84++) {
			Static498.aClass6_Sub1_Sub2_Sub1Array1[local84] = null;
		}
		Static221.anInt4798 = 0;
		Static240.aClass267_20.method6648();
		Static183.anInt5938 = 0;
		Static476.aClass267_37.method6648();
		Static510.method7311();
		Static22.anInt8151 = 0;
		Static127.aClass215_1.method5538();
		Static356.method5584();
		Static477.method7099();
		Static361.aClass3_Sub40_2 = null;
		Static79.aLong58 = 0L;
		if (arg0) {
			Static333.method5283(11);
			return;
		}
		Static333.method5283(2);
		try {
			Static562.method7815("loggedout", Static370.anApplet1);
		} catch (@Pc(137) Throwable local137) {
		}
	}
}
