import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!ii", name = "h", descriptor = "Lclient!jo;")
	public static final Class1_Sub27 aClass1_Sub27_3 = new Class1_Sub27(0, -1);

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)Z")
	public static boolean method5258() {
		return Static255.anInt1147 == 0 ? Static420.aClass1_Sub6_Sub2_3.method4461() : true;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)V")
	public static void method5259() {
		Static190.aClass102_23.method2262(50);
		Static370.aClass102_46.method2262(50);
		Static17.aClass102_3.method2262(50);
		Static36.aClass102_52.method2262(50);
		Static238.aClass102_28.method2262(50);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)Z")
	public static boolean method5260() throws IOException {
		if (Static395.aClass131_3 == null) {
			return false;
		}
		@Pc(15) int local15 = Static395.aClass131_3.method2932();
		if (local15 == 0) {
			return false;
		}
		@Pc(72) int local72;
		if (Static371.aClass12_160 == null) {
			if (Static130.aBoolean265) {
				local15--;
				Static395.aClass131_3.method2929(0, 1, Static336.aClass1_Sub28_Sub1_2.aByteArray86);
				Static130.aBoolean265 = false;
				Static60.anInt1170++;
			}
			Static336.aClass1_Sub28_Sub1_2.anInt6812 = 0;
			if (Static336.aClass1_Sub28_Sub1_2.method3085()) {
				if (local15 == 0) {
					return false;
				}
				Static395.aClass131_3.method2929(1, 1, Static336.aClass1_Sub28_Sub1_2.aByteArray86);
				local15--;
				Static60.anInt1170++;
			}
			Static130.aBoolean265 = true;
			@Pc(68) Class12[] local68 = Static355.method4785();
			local72 = Static336.aClass1_Sub28_Sub1_2.method3079();
			if (local72 < 0 || local68.length <= local72) {
				throw new IOException("invo:" + local72 + " ip:" + Static336.aClass1_Sub28_Sub1_2.anInt6812);
			}
			Static371.aClass12_160 = local68[local72];
			Static245.anInt4432 = Static371.aClass12_160.anInt299;
		}
		if (Static245.anInt4432 == -1) {
			if (local15 <= 0) {
				return false;
			}
			Static395.aClass131_3.method2929(0, 1, Static336.aClass1_Sub28_Sub1_2.aByteArray86);
			local15--;
			Static245.anInt4432 = Static336.aClass1_Sub28_Sub1_2.aByteArray86[0] & 0xFF;
			Static60.anInt1170++;
		}
		if (Static245.anInt4432 == -2) {
			if (local15 <= 1) {
				return false;
			}
			Static395.aClass131_3.method2929(0, 2, Static336.aClass1_Sub28_Sub1_2.aByteArray86);
			Static336.aClass1_Sub28_Sub1_2.anInt6812 = 0;
			local15 -= 2;
			Static245.anInt4432 = Static336.aClass1_Sub28_Sub1_2.method5335();
			Static60.anInt1170 += 2;
		}
		if (local15 < Static245.anInt4432) {
			return false;
		}
		Static336.aClass1_Sub28_Sub1_2.anInt6812 = 0;
		Static395.aClass131_3.method2929(0, Static245.anInt4432, Static336.aClass1_Sub28_Sub1_2.aByteArray86);
		Static60.anInt1170 += Static245.anInt4432;
		Static264.anInt4796 = 0;
		Static148.aClass12_78 = Static114.aClass12_56;
		Static114.aClass12_56 = Static231.aClass12_112;
		Static231.aClass12_112 = Static371.aClass12_160;
		@Pc(244) int local244;
		@Pc(236) int local236;
		if (Static87.aClass12_167 == Static371.aClass12_160) {
			Static158.anInt2209 = Static336.aClass1_Sub28_Sub1_2.method5353() << 3;
			Static295.anInt5146 = Static336.aClass1_Sub28_Sub1_2.method5367() << 3;
			Static79.anInt1472 = Static336.aClass1_Sub28_Sub1_2.method5396();
			for (@Pc(220) Class1_Sub2 local220 = (Class1_Sub2) Static425.aClass199_179.method4392(); local220 != null; local220 = (Class1_Sub2) Static425.aClass199_179.method4393()) {
				local72 = (int) (local220.aLong230 & 0x3FFFL);
				local236 = (int) (local220.aLong230 >> 14 & 0x3FFFL);
				local244 = (int) (local220.aLong230 >> 28 & 0x3L);
				if (local244 == Static79.anInt1472 && Static158.anInt2209 <= local72 && Static158.anInt2209 + 8 > local72 && Static295.anInt5146 <= local236 && Static295.anInt5146 + 8 > local236) {
					local220.method5915();
					Static133.method2055(Static79.anInt1472, local236, local72);
				}
			}
			for (@Pc(295) Class1_Sub3 local295 = (Class1_Sub3) Static413.aClass227_43.method4967(); local295 != null; local295 = (Class1_Sub3) Static413.aClass227_43.method4973()) {
				if (Static158.anInt2209 <= local295.anInt126 && local295.anInt126 < Static158.anInt2209 + 8 && local295.anInt121 >= Static295.anInt5146 && Static295.anInt5146 + 8 > local295.anInt121 && local295.anInt127 == Static79.anInt1472) {
					local295.anInt120 = 0;
				}
			}
			Static371.aClass12_160 = null;
			return true;
		} else if (Static371.aClass12_160 == Static131.aClass12_68) {
			if (Static40.method585(Static312.anInt5414)) {
				Static338.anInt5778 = (int) ((float) Static336.aClass1_Sub28_Sub1_2.method5335() * 2.5F);
			} else {
				Static338.anInt5778 = Static336.aClass1_Sub28_Sub1_2.method5335() * 30;
			}
			Static15.anInt300 = Static18.anInt379;
			Static371.aClass12_160 = null;
			return true;
		} else {
			@Pc(410) int local410;
			@Pc(383) int local383;
			@Pc(398) boolean local398;
			@Pc(416) int local416;
			@Pc(429) int local429;
			if (Static371.aClass12_160 == Static350.aClass12_152) {
				local383 = Static336.aClass1_Sub28_Sub1_2.method5335();
				local72 = Static336.aClass1_Sub28_Sub1_2.method5337();
				local398 = (local72 & 0x1) == 1;
				Static159.method2299(local398, local383);
				local244 = Static336.aClass1_Sub28_Sub1_2.method5335();
				for (local410 = 0; local410 < local244; local410++) {
					local416 = Static336.aClass1_Sub28_Sub1_2.method5363();
					if (local416 == 255) {
						local416 = Static336.aClass1_Sub28_Sub1_2.method5380();
					}
					local429 = Static336.aClass1_Sub28_Sub1_2.method5335();
					Static103.method1584(local429 - 1, local410, local416, local398, local383);
				}
				Static313.anIntArray356[Static360.anInt6141++ & 0x1F] = local383;
				Static371.aClass12_160 = null;
				return true;
			}
			@Pc(482) String local482;
			@Pc(500) String local500;
			@Pc(496) String local496;
			@Pc(486) String local486;
			if (Static371.aClass12_160 == Static114.aClass12_55) {
				local383 = Static336.aClass1_Sub28_Sub1_2.method5337();
				@Pc(478) boolean local478 = (local383 & 0x1) == 1;
				local482 = Static336.aClass1_Sub28_Sub1_2.method5381();
				local486 = Static336.aClass1_Sub28_Sub1_2.method5381();
				if (local486.equals("")) {
					local486 = local482;
				}
				local496 = Static336.aClass1_Sub28_Sub1_2.method5381();
				local500 = Static336.aClass1_Sub28_Sub1_2.method5381();
				if (local500.equals("")) {
					local500 = local496;
				}
				if (local478) {
					for (local429 = 0; local429 < Static446.anInt7396; local429++) {
						if (Static131.aStringArray13[local429].equals(local500)) {
							Static264.aStringArray29[local429] = local482;
							Static131.aStringArray13[local429] = local486;
							Static80.aStringArray10[local429] = local496;
							Static357.aStringArray42[local429] = local500;
							break;
						}
					}
				} else {
					Static264.aStringArray29[Static446.anInt7396] = local482;
					Static131.aStringArray13[Static446.anInt7396] = local486;
					Static80.aStringArray10[Static446.anInt7396] = local496;
					Static357.aStringArray42[Static446.anInt7396] = local500;
					Static294.aBooleanArray17[Static446.anInt7396] = (local383 & 0x2) == 2;
					Static446.anInt7396++;
				}
				Static183.anInt3199 = Static18.anInt379;
				Static371.aClass12_160 = null;
				return true;
			} else if (Static371.aClass12_160 == Static415.aClass12_171) {
				local383 = Static336.aClass1_Sub28_Sub1_2.method5335();
				local72 = Static336.aClass1_Sub28_Sub1_2.method5355();
				local236 = Static336.aClass1_Sub28_Sub1_2.method5335();
				if (local236 == 65535) {
					local236 = -1;
				}
				if (Static86.method1410(local383)) {
					Static284.method3915(2, local236, local72, -1);
				}
				Static371.aClass12_160 = null;
				return true;
			} else if (Static15.aClass12_13 == Static371.aClass12_160) {
				Static376.anInt6336 = Static336.aClass1_Sub28_Sub1_2.method5382();
				Static371.aClass12_160 = null;
				Static15.anInt300 = Static18.anInt379;
				return true;
			} else if (Static122.aClass12_58 == Static371.aClass12_160) {
				local383 = Static336.aClass1_Sub28_Sub1_2.method5335();
				local72 = Static336.aClass1_Sub28_Sub1_2.method5337();
				local398 = (local72 & 0x1) == 1;
				while (Static336.aClass1_Sub28_Sub1_2.anInt6812 < Static245.anInt4432) {
					local244 = Static336.aClass1_Sub28_Sub1_2.method5392();
					local410 = Static336.aClass1_Sub28_Sub1_2.method5335();
					local416 = 0;
					if (local410 != 0) {
						local416 = Static336.aClass1_Sub28_Sub1_2.method5337();
						if (local416 == 255) {
							local416 = Static336.aClass1_Sub28_Sub1_2.method5355();
						}
					}
					Static103.method1584(local410 - 1, local244, local416, local398, local383);
				}
				Static313.anIntArray356[Static360.anInt6141++ & 0x1F] = local383;
				Static371.aClass12_160 = null;
				return true;
			} else if (Static288.aClass12_134 == Static371.aClass12_160) {
				local383 = Static336.aClass1_Sub28_Sub1_2.method5341();
				local72 = Static336.aClass1_Sub28_Sub1_2.method5396();
				local236 = Static336.aClass1_Sub28_Sub1_2.method5361();
				if (Static86.method1410(local383)) {
					Static161.method2330(local236, local72);
				}
				Static371.aClass12_160 = null;
				return true;
			} else if (Static371.aClass12_160 == Static142.aClass12_76) {
				Static158.anInt2209 = Static336.aClass1_Sub28_Sub1_2.method5367() << 3;
				Static79.anInt1472 = Static336.aClass1_Sub28_Sub1_2.method5337();
				Static295.anInt5146 = Static336.aClass1_Sub28_Sub1_2.method5391() << 3;
				Static371.aClass12_160 = null;
				return true;
			} else if (Static371.aClass12_160 == Static3.aClass12_147) {
				Static89.method1424(Static293.aClass269_37);
				Static371.aClass12_160 = null;
				return true;
			} else if (Static371.aClass12_160 == Static129.aClass12_67) {
				local383 = Static336.aClass1_Sub28_Sub1_2.method5355();
				Static8.aClass232_1 = Static183.aClass83_2.method1880(local383);
				Static371.aClass12_160 = null;
				return true;
			} else {
				@Pc(798) boolean local798;
				@Pc(802) String local802;
				@Pc(814) long local814;
				@Pc(819) long local819;
				@Pc(824) long local824;
				@Pc(828) int local828;
				@Pc(832) int local832;
				if (Static371.aClass12_160 == Static286.aClass12_133) {
					local798 = Static336.aClass1_Sub28_Sub1_2.method5337() == 1;
					local802 = Static336.aClass1_Sub28_Sub1_2.method5381();
					local482 = local802;
					if (local798) {
						local482 = Static336.aClass1_Sub28_Sub1_2.method5381();
					}
					local814 = Static336.aClass1_Sub28_Sub1_2.method5340();
					local819 = Static336.aClass1_Sub28_Sub1_2.method5335();
					local824 = Static336.aClass1_Sub28_Sub1_2.method5345();
					local828 = Static336.aClass1_Sub28_Sub1_2.method5337();
					local832 = Static336.aClass1_Sub28_Sub1_2.method5335();
					@Pc(839) long local839 = (local819 << 32) + local824;
					@Pc(841) boolean local841 = false;
					@Pc(843) int local843 = 0;
					while (true) {
						if (local843 >= 100) {
							if (local828 <= 1 && Static406.method5265(local482)) {
								local841 = true;
							}
							break;
						}
						if (Static188.aLongArray7[local843] == local839) {
							local841 = true;
							break;
						}
						local843++;
					}
					if (!local841 && Static239.anInt5812 == 0) {
						Static188.aLongArray7[Static219.anInt3920] = local839;
						Static219.anInt3920 = (Static219.anInt3920 + 1) % 100;
						@Pc(901) String local901 = Static456.aClass9_2.method145(local832).method4898(Static336.aClass1_Sub28_Sub1_2);
						if (local828 == 2) {
							Static45.method4316(Static401.method5220(local814), local901, local832, "<img=1>" + local802, 20, "<img=1>" + local482, 0);
						} else if (local828 == 1) {
							Static45.method4316(Static401.method5220(local814), local901, local832, "<img=0>" + local802, 20, "<img=0>" + local482, 0);
						} else {
							Static45.method4316(Static401.method5220(local814), local901, local832, local802, 20, local482, 0);
						}
					}
					Static371.aClass12_160 = null;
					return true;
				} else if (Static335.aClass12_144 == Static371.aClass12_160) {
					Static89.method1424(Static415.aClass269_47);
					Static371.aClass12_160 = null;
					return true;
				} else if (Static93.aClass12_50 == Static371.aClass12_160) {
					Static320.aClass249_2.method5598();
					Static371.aClass12_160 = null;
					Static396.anInt6617 += 32;
					return true;
				} else {
					@Pc(1044) int local1044;
					@Pc(1054) int local1054;
					if (Static116.aClass12_57 == Static371.aClass12_160) {
						local798 = Static336.aClass1_Sub28_Sub1_2.method5337() == 1;
						local802 = Static336.aClass1_Sub28_Sub1_2.method5381();
						local482 = local802;
						if (local798) {
							local482 = Static336.aClass1_Sub28_Sub1_2.method5381();
						}
						local814 = Static336.aClass1_Sub28_Sub1_2.method5335();
						local819 = Static336.aClass1_Sub28_Sub1_2.method5345();
						local1044 = Static336.aClass1_Sub28_Sub1_2.method5337();
						@Pc(1050) long local1050 = (local814 << 32) + local819;
						@Pc(1052) boolean local1052 = false;
						local1054 = 0;
						while (true) {
							if (local1054 >= 100) {
								if (local1044 <= 1) {
									if (Static361.aBoolean690 && !Static241.aBoolean491 || Static336.aBoolean652) {
										local1052 = true;
									} else if (Static406.method5265(local482)) {
										local1052 = true;
									}
								}
								break;
							}
							if (Static188.aLongArray7[local1054] == local1050) {
								local1052 = true;
								break;
							}
							local1054++;
						}
						if (!local1052 && Static239.anInt5812 == 0) {
							Static188.aLongArray7[Static219.anInt3920] = local1050;
							Static219.anInt3920 = (Static219.anInt3920 + 1) % 100;
							@Pc(1113) String local1113 = Static328.method4413(Static365.method4855(Static336.aClass1_Sub28_Sub1_2));
							if (local1044 == 2) {
								Static45.method4316(null, local1113, -1, "<img=1>" + local802, 7, "<img=1>" + local482, 0);
							} else if (local1044 == 1) {
								Static45.method4316(null, local1113, -1, "<img=0>" + local802, 7, "<img=0>" + local482, 0);
							} else {
								Static45.method4316(null, local1113, -1, local802, 3, local482, 0);
							}
						}
						Static371.aClass12_160 = null;
						return true;
					}
					@Pc(1234) long local1234;
					@Pc(1240) Class1_Sub27 local1240;
					@Pc(1249) Class1_Sub27 local1249;
					if (Static376.aClass12_163 == Static371.aClass12_160) {
						local383 = Static336.aClass1_Sub28_Sub1_2.method5375();
						if (local383 == 65535) {
							local383 = -1;
						}
						local72 = Static336.aClass1_Sub28_Sub1_2.method5335();
						local236 = Static336.aClass1_Sub28_Sub1_2.method5375();
						if (local236 == 65535) {
							local236 = -1;
						}
						local244 = Static336.aClass1_Sub28_Sub1_2.method5380();
						local410 = Static336.aClass1_Sub28_Sub1_2.method5335();
						if (Static86.method1410(local72)) {
							for (local416 = local236; local416 <= local383; local416++) {
								local1234 = ((long) local244 << 32) + ((long) local416);
								local1240 = (Class1_Sub27) Static194.aClass199_186.method4387(local1234);
								if (local1240 != null) {
									local1249 = new Class1_Sub27(local1240.anInt3464, local410);
									local1240.method5915();
								} else if (local416 == -1) {
									local1249 = new Class1_Sub27(Static412.method5315(local244).aClass1_Sub27_2.anInt3464, local410);
								} else {
									local1249 = new Class1_Sub27(0, local410);
								}
								Static194.aClass199_186.method4383(local1234, local1249);
							}
						}
						Static371.aClass12_160 = null;
						return true;
					} else if (Static236.aClass12_115 == Static371.aClass12_160) {
						local798 = Static336.aClass1_Sub28_Sub1_2.method5337() == 1;
						local802 = Static336.aClass1_Sub28_Sub1_2.method5381();
						local482 = local802;
						if (local798) {
							local482 = Static336.aClass1_Sub28_Sub1_2.method5381();
						}
						local244 = Static336.aClass1_Sub28_Sub1_2.method5337();
						@Pc(1319) boolean local1319 = false;
						if (local244 <= 1) {
							if (Static361.aBoolean690 && !Static241.aBoolean491 || Static336.aBoolean652) {
								local1319 = true;
							} else if (local244 <= 1 && Static406.method5265(local482)) {
								local1319 = true;
							}
						}
						if (!local1319 && Static239.anInt5812 == 0) {
							local500 = Static328.method4413(Static365.method4855(Static336.aClass1_Sub28_Sub1_2));
							if (local244 == 2) {
								Static45.method4316(null, local500, -1, "<img=1>" + local802, 24, "<img=1>" + local482, 0);
							} else if (local244 == 1) {
								Static45.method4316(null, local500, -1, "<img=0>" + local802, 24, "<img=0>" + local482, 0);
							} else {
								Static45.method4316(null, local500, -1, local802, 24, local482, 0);
							}
						}
						Static371.aClass12_160 = null;
						return true;
					} else if (Static371.aClass12_160 == Static126.aClass12_61) {
						Static368.method4884(false);
						Static371.aClass12_160 = null;
						return false;
					} else if (Static371.aClass12_160 == Static415.aClass12_172) {
						local383 = Static336.aClass1_Sub28_Sub1_2.method5358();
						local72 = Static336.aClass1_Sub28_Sub1_2.method5335();
						local236 = Static336.aClass1_Sub28_Sub1_2.method5335();
						local244 = Static336.aClass1_Sub28_Sub1_2.method5336();
						local410 = Static336.aClass1_Sub28_Sub1_2.method5335();
						if (Static86.method1410(local236)) {
							Static421.method5602(local72, local383, local244, local410);
						}
						Static371.aClass12_160 = null;
						return true;
					} else if (Static371.aClass12_160 == Static242.aClass12_118) {
						if (Static207.anInt6026 != -1) {
							Static363.method4852(0, Static207.anInt6026);
						}
						Static371.aClass12_160 = null;
						return true;
					} else if (Static371.aClass12_160 == Static143.aClass12_63) {
						Static89.method1424(Static297.aClass269_45);
						Static371.aClass12_160 = null;
						return true;
					} else if (Static371.aClass12_160 == Static94.aClass12_52) {
						Static89.method1424(Static251.aClass269_31);
						Static371.aClass12_160 = null;
						return true;
					} else if (Static105.aClass12_54 == Static371.aClass12_160) {
						Static116.method1849(true);
						Static371.aClass12_160 = null;
						return true;
					} else if (Static191.aClass12_100 == Static371.aClass12_160) {
						local383 = Static336.aClass1_Sub28_Sub1_2.method5341();
						local72 = Static336.aClass1_Sub28_Sub1_2.method5361();
						Static320.aClass249_2.method5596(local383, local72);
						Static371.aClass12_160 = null;
						return true;
					} else {
						@Pc(1551) String local1551;
						if (Static371.aClass12_160 == Static142.aClass12_75) {
							local1551 = Static336.aClass1_Sub28_Sub1_2.method5381();
							local72 = Static336.aClass1_Sub28_Sub1_2.method5335();
							local482 = Static456.aClass9_2.method145(local72).method4898(Static336.aClass1_Sub28_Sub1_2);
							Static45.method4316(null, local482, local72, local1551, 19, local1551, 0);
							Static371.aClass12_160 = null;
							return true;
						}
						@Pc(1608) Class1_Sub14 local1608;
						if (Static147.aClass12_184 == Static371.aClass12_160) {
							local383 = Static336.aClass1_Sub28_Sub1_2.method5396();
							local72 = Static336.aClass1_Sub28_Sub1_2.method5335();
							local236 = Static336.aClass1_Sub28_Sub1_2.method5358();
							local244 = Static336.aClass1_Sub28_Sub1_2.method5335();
							if (Static86.method1410(local244)) {
								local1608 = (Class1_Sub14) Static94.aClass199_54.method4387((long) local236);
								if (local1608 != null) {
									Static452.method5911(false, local1608.anInt1425 != local72, local1608);
								}
								Static33.method428(local72, local383, false, local236);
							}
							Static371.aClass12_160 = null;
							return true;
						} else if (Static371.aClass12_160 == Static129.aClass12_66) {
							local383 = Static336.aClass1_Sub28_Sub1_2.method5361();
							local72 = Static336.aClass1_Sub28_Sub1_2.method5363();
							local236 = Static336.aClass1_Sub28_Sub1_2.method5396();
							Static411.anIntArray455[local236] = local383;
							Static132.anIntArray158[local236] = local72;
							Static53.anIntArray48[local236] = 1;
							local244 = Static39.anIntArray37[local236] - 1;
							for (local410 = 0; local410 < local244; local410++) {
								if (Class1_Sub5_Sub11.anIntArray206[local410] <= local383) {
									Static53.anIntArray48[local236] = local410 + 2;
								}
							}
							Static414.anIntArray462[Static36.anInt6548++ & 0x1F] = local236;
							Static371.aClass12_160 = null;
							return true;
						} else if (Static187.aClass12_98 == Static371.aClass12_160) {
							local383 = Static336.aClass1_Sub28_Sub1_2.method5363();
							local72 = Static336.aClass1_Sub28_Sub1_2.method5390();
							local236 = Static336.aClass1_Sub28_Sub1_2.method5341();
							if (local236 == 65535) {
								local236 = -1;
							}
							local486 = Static336.aClass1_Sub28_Sub1_2.method5381();
							if (local383 >= 1 && local383 <= 8) {
								if (local486.equalsIgnoreCase("null")) {
									local486 = null;
								}
								Static251.aStringArray25[local383 - 1] = local486;
								Static354.anIntArray416[local383 - 1] = local236;
								Static187.aBooleanArray10[local383 - 1] = local72 == 0;
							}
							Static371.aClass12_160 = null;
							return true;
						} else if (Static371.aClass12_160 == Static369.aClass12_158) {
							local383 = Static336.aClass1_Sub28_Sub1_2.method5341();
							if (local383 == 65535) {
								local383 = -1;
							}
							local72 = Static336.aClass1_Sub28_Sub1_2.method5335();
							local236 = Static336.aClass1_Sub28_Sub1_2.method5358();
							local244 = Static336.aClass1_Sub28_Sub1_2.method5341();
							if (local244 == 65535) {
								local244 = -1;
							}
							local410 = Static336.aClass1_Sub28_Sub1_2.method5361();
							if (Static86.method1410(local72)) {
								for (local416 = local244; local416 <= local383; local416++) {
									local1234 = ((long) local410 << 32) + ((long) local416);
									local1240 = (Class1_Sub27) Static194.aClass199_186.method4387(local1234);
									if (local1240 != null) {
										local1249 = new Class1_Sub27(local236, local1240.anInt3465);
										local1240.method5915();
									} else if (local416 == -1) {
										local1249 = new Class1_Sub27(local236, Static412.method5315(local410).aClass1_Sub27_2.anInt3465);
									} else {
										local1249 = new Class1_Sub27(local236, -1);
									}
									Static194.aClass199_186.method4383(local1234, local1249);
								}
							}
							Static371.aClass12_160 = null;
							return true;
						} else {
							@Pc(1934) String local1934;
							@Pc(1913) boolean local1913;
							if (Static192.aClass12_101 == Static371.aClass12_160) {
								local798 = Static336.aClass1_Sub28_Sub1_2.method5337() == 1;
								local802 = Static336.aClass1_Sub28_Sub1_2.method5381();
								local482 = local802;
								if (local798) {
									local482 = Static336.aClass1_Sub28_Sub1_2.method5381();
								}
								local244 = Static336.aClass1_Sub28_Sub1_2.method5337();
								local410 = Static336.aClass1_Sub28_Sub1_2.method5335();
								local1913 = false;
								if (local244 <= 1 && Static406.method5265(local482)) {
									local1913 = true;
								}
								if (!local1913 && Static239.anInt5812 == 0) {
									local1934 = Static456.aClass9_2.method145(local410).method4898(Static336.aClass1_Sub28_Sub1_2);
									if (local244 == 2) {
										Static45.method4316(null, local1934, local410, "<img=1>" + local802, 25, "<img=1>" + local482, 0);
									} else if (local244 == 1) {
										Static45.method4316(null, local1934, local410, "<img=0>" + local802, 25, "<img=0>" + local482, 0);
									} else {
										Static45.method4316(null, local1934, local410, local802, 25, local482, 0);
									}
								}
								Static371.aClass12_160 = null;
								return true;
							} else if (Static371.aClass12_160 == Static373.aClass12_161) {
								local383 = Static336.aClass1_Sub28_Sub1_2.method5335();
								local802 = Static336.aClass1_Sub28_Sub1_2.method5381();
								@Pc(2020) Object[] local2020 = new Object[local802.length() + 1];
								for (local244 = local802.length() - 1; local244 >= 0; local244--) {
									if (local802.charAt(local244) == 's') {
										local2020[local244 + 1] = Static336.aClass1_Sub28_Sub1_2.method5381();
									} else {
										local2020[local244 + 1] = Integer.valueOf(Static336.aClass1_Sub28_Sub1_2.method5355());
									}
								}
								local2020[0] = Integer.valueOf(Static336.aClass1_Sub28_Sub1_2.method5355());
								if (Static86.method1410(local383)) {
									@Pc(2075) Class1_Sub40 local2075 = new Class1_Sub40();
									local2075.anObjectArray36 = local2020;
									Static298.method4076(local2075);
								}
								Static371.aClass12_160 = null;
								return true;
							} else if (Static371.aClass12_160 == Static296.aClass12_137) {
								local383 = Static336.aClass1_Sub28_Sub1_2.method5335();
								local72 = Static336.aClass1_Sub28_Sub1_2.method5337();
								local236 = Static336.aClass1_Sub28_Sub1_2.method5337();
								local244 = Static336.aClass1_Sub28_Sub1_2.method5335() << 0;
								local410 = Static336.aClass1_Sub28_Sub1_2.method5337();
								local416 = Static336.aClass1_Sub28_Sub1_2.method5337();
								if (Static86.method1410(local383)) {
									Static156.method2286(local236, local410, true, local72, local416, local244);
								}
								Static371.aClass12_160 = null;
								return true;
							} else {
								@Pc(2177) int local2177;
								@Pc(2188) int local2188;
								if (Static371.aClass12_160 == Static270.aClass12_128) {
									local798 = Static336.aClass1_Sub28_Sub1_2.method5337() == 1;
									local802 = Static336.aClass1_Sub28_Sub1_2.method5381();
									local482 = local802;
									if (local798) {
										local482 = Static336.aClass1_Sub28_Sub1_2.method5381();
									}
									local814 = Static336.aClass1_Sub28_Sub1_2.method5335();
									local819 = Static336.aClass1_Sub28_Sub1_2.method5345();
									local1044 = Static336.aClass1_Sub28_Sub1_2.method5337();
									local2177 = Static336.aClass1_Sub28_Sub1_2.method5335();
									@Pc(2184) long local2184 = (local814 << 32) + local819;
									@Pc(2186) boolean local2186 = false;
									local2188 = 0;
									while (true) {
										if (local2188 >= 100) {
											if (local1044 <= 1 && Static406.method5265(local482)) {
												local2186 = true;
											}
											break;
										}
										if (Static188.aLongArray7[local2188] == local2184) {
											local2186 = true;
											break;
										}
										local2188++;
									}
									if (!local2186 && Static239.anInt5812 == 0) {
										Static188.aLongArray7[Static219.anInt3920] = local2184;
										Static219.anInt3920 = (Static219.anInt3920 + 1) % 100;
										@Pc(2241) String local2241 = Static456.aClass9_2.method145(local2177).method4898(Static336.aClass1_Sub28_Sub1_2);
										if (local1044 == 2) {
											Static45.method4316(null, local2241, local2177, "<img=1>" + local802, 18, "<img=1>" + local482, 0);
										} else if (local1044 == 1) {
											Static45.method4316(null, local2241, local2177, "<img=0>" + local802, 18, "<img=0>" + local482, 0);
										} else {
											Static45.method4316(null, local2241, local2177, local802, 18, local482, 0);
										}
									}
									Static371.aClass12_160 = null;
									return true;
								} else if (Static411.aClass12_168 == Static371.aClass12_160) {
									local1551 = Static336.aClass1_Sub28_Sub1_2.method5381();
									local72 = Static336.aClass1_Sub28_Sub1_2.method5336();
									local236 = Static336.aClass1_Sub28_Sub1_2.method5358();
									if (Static86.method1410(local72)) {
										Static111.method1778(local236, local1551);
									}
									Static371.aClass12_160 = null;
									return true;
								} else if (Static290.aClass12_135 == Static371.aClass12_160) {
									Static89.method1424(Static325.aClass269_42);
									Static371.aClass12_160 = null;
									return true;
								} else if (Static371.aClass12_160 == Static149.aClass12_79) {
									Static253.anInt4601 = Static336.aClass1_Sub28_Sub1_2.method5337();
									Static15.anInt300 = Static18.anInt379;
									Static371.aClass12_160 = null;
									return true;
								} else if (Static371.aClass12_160 == Static252.aClass12_124) {
									local383 = Static336.aClass1_Sub28_Sub1_2.method5390();
									local72 = Static336.aClass1_Sub28_Sub1_2.method5335();
									local236 = Static336.aClass1_Sub28_Sub1_2.method5336();
									if (Static86.method1410(local236)) {
										if (local383 == 2) {
											Static434.method5714();
										}
										Static207.anInt6026 = local72;
										Static106.method1699(local72);
										Static336.method4513(false);
										Static298.method4073(Static207.anInt6026);
										for (local244 = 0; local244 < 100; local244++) {
											Static369.aBooleanArray23[local244] = true;
										}
									}
									Static371.aClass12_160 = null;
									return true;
								} else if (Static371.aClass12_160 == Static281.aClass12_62) {
									Static79.anInt1472 = Static336.aClass1_Sub28_Sub1_2.method5363();
									Static295.anInt5146 = Static336.aClass1_Sub28_Sub1_2.method5377() << 3;
									Static158.anInt2209 = Static336.aClass1_Sub28_Sub1_2.method5353() << 3;
									while (Static336.aClass1_Sub28_Sub1_2.anInt6812 < Static245.anInt4432) {
										@Pc(2436) Class269 local2436 = Static224.method3253()[Static336.aClass1_Sub28_Sub1_2.method5337()];
										Static89.method1424(local2436);
									}
									Static371.aClass12_160 = null;
									return true;
								} else if (Static371.aClass12_160 == Static419.aClass12_174) {
									local383 = Static336.aClass1_Sub28_Sub1_2.method5335();
									local72 = Static336.aClass1_Sub28_Sub1_2.method5335();
									if (local72 == 65535) {
										local72 = -1;
									}
									local236 = Static336.aClass1_Sub28_Sub1_2.method5361();
									if (Static86.method1410(local383)) {
										Static284.method3915(1, local72, local236, -1);
									}
									Static371.aClass12_160 = null;
									return true;
								} else if (Static371.aClass12_160 == Static70.aClass12_40) {
									local383 = Static336.aClass1_Sub28_Sub1_2.method5341();
									local72 = Static336.aClass1_Sub28_Sub1_2.method5335();
									local236 = Static336.aClass1_Sub28_Sub1_2.method5361();
									if (Static86.method1410(local72)) {
										Static263.method3724(local383, local236);
									}
									Static371.aClass12_160 = null;
									return true;
								} else if (Static371.aClass12_160 == Static299.aClass12_180) {
									local383 = Static336.aClass1_Sub28_Sub1_2.method5341();
									local72 = Static336.aClass1_Sub28_Sub1_2.method5380();
									Static320.aClass249_2.method5601(local383, local72);
									Static371.aClass12_160 = null;
									return true;
								} else if (Static29.aClass12_16 == Static371.aClass12_160) {
									Static240.anInt6654 = 1;
									Static371.aClass12_160 = null;
									Static183.anInt3199 = Static18.anInt379;
									return true;
								} else if (Static371.aClass12_160 == Static247.aClass12_120) {
									Static355.aString69 = Static245.anInt4432 > 2 ? Static336.aClass1_Sub28_Sub1_2.method5381() : Static362.aClass119_39.method2673(Static394.anInt6582);
									Static299.anInt7360 = Static245.anInt4432 > 0 ? Static336.aClass1_Sub28_Sub1_2.method5335() : -1;
									if (Static299.anInt7360 == 65535) {
										Static299.anInt7360 = -1;
									}
									Static371.aClass12_160 = null;
									return true;
								} else if (Static371.aClass12_160 == Static210.aClass12_106) {
									local383 = Static336.aClass1_Sub28_Sub1_2.method5341();
									local72 = Static336.aClass1_Sub28_Sub1_2.method5375();
									local236 = Static336.aClass1_Sub28_Sub1_2.method5336();
									local244 = Static336.aClass1_Sub28_Sub1_2.method5380();
									local410 = Static336.aClass1_Sub28_Sub1_2.method5336();
									if (Static86.method1410(local383)) {
										Static284.method3915(7, local72 | local410 << 16, local244, local236);
									}
									Static371.aClass12_160 = null;
									return true;
								} else if (Static318.aClass12_105 == Static371.aClass12_160) {
									Static89.method1424(Static396.aClass269_46);
									Static371.aClass12_160 = null;
									return true;
								} else if (Static98.aClass12_53 == Static371.aClass12_160) {
									Static89.method1424(Static166.aClass269_18);
									Static371.aClass12_160 = null;
									return true;
								} else if (Static371.aClass12_160 == Static374.aClass12_162) {
									local383 = Static336.aClass1_Sub28_Sub1_2.method5341();
									if (local383 == 65535) {
										local383 = -1;
									}
									local72 = Static336.aClass1_Sub28_Sub1_2.method5335();
									local236 = Static336.aClass1_Sub28_Sub1_2.method5380();
									if (Static86.method1410(local72)) {
										Static134.method2064(local383, local236);
									}
									Static371.aClass12_160 = null;
									return true;
								} else if (Static128.aClass12_65 == Static371.aClass12_160) {
									local383 = Static336.aClass1_Sub28_Sub1_2.method5335();
									local72 = Static336.aClass1_Sub28_Sub1_2.method5337();
									local236 = Static336.aClass1_Sub28_Sub1_2.method5337();
									local244 = Static336.aClass1_Sub28_Sub1_2.method5337();
									local410 = Static336.aClass1_Sub28_Sub1_2.method5337();
									local416 = Static336.aClass1_Sub28_Sub1_2.method5335();
									if (Static86.method1410(local383)) {
										Static34.aBooleanArray2[local72] = true;
										Static344.anIntArray403[local72] = local236;
										Static244.anIntArray292[local72] = local244;
										Static323.anIntArray373[local72] = local410;
										Static3.anIntArray399[local72] = local416;
									}
									Static371.aClass12_160 = null;
									return true;
								} else if (Static371.aClass12_160 == Static60.aClass12_35) {
									local383 = Static336.aClass1_Sub28_Sub1_2.method5336();
									local72 = Static336.aClass1_Sub28_Sub1_2.method5341();
									local482 = Static336.aClass1_Sub28_Sub1_2.method5381();
									if (Static86.method1410(local383)) {
										Static308.method4205(local482, local72);
									}
									Static371.aClass12_160 = null;
									return true;
								} else if (Static371.aClass12_160 == Static363.aClass12_157) {
									local383 = Static336.aClass1_Sub28_Sub1_2.method5335();
									local72 = Static336.aClass1_Sub28_Sub1_2.method5337();
									local236 = Static336.aClass1_Sub28_Sub1_2.method5337();
									local244 = Static336.aClass1_Sub28_Sub1_2.method5335() << 0;
									local410 = Static336.aClass1_Sub28_Sub1_2.method5337();
									local416 = Static336.aClass1_Sub28_Sub1_2.method5337();
									if (Static86.method1410(local383)) {
										Static344.method4692(local236, local416, local72, local244, local410);
									}
									Static371.aClass12_160 = null;
									return true;
								} else if (Static279.aClass12_130 == Static371.aClass12_160) {
									local383 = Static336.aClass1_Sub28_Sub1_2.method5336();
									if (local383 == 65535) {
										local383 = -1;
									}
									local72 = Static336.aClass1_Sub28_Sub1_2.method5363();
									local236 = Static336.aClass1_Sub28_Sub1_2.method5337();
									Static217.method3178(local383, local236, local72);
									Static371.aClass12_160 = null;
									return true;
								} else if (Static452.aClass12_182 == Static371.aClass12_160) {
									local383 = Static336.aClass1_Sub28_Sub1_2.method5396();
									local72 = Static336.aClass1_Sub28_Sub1_2.method5341();
									if (local72 == 65535) {
										local72 = -1;
									}
									local236 = Static336.aClass1_Sub28_Sub1_2.method5342();
									Static263.method3725(local236, local383, local72);
									Static371.aClass12_160 = null;
									return true;
								} else if (Static371.aClass12_160 == Static143.aClass12_64) {
									local383 = Static336.aClass1_Sub28_Sub1_2.method5335();
									if (local383 == 65535) {
										local383 = -1;
									}
									local72 = Static336.aClass1_Sub28_Sub1_2.method5337();
									local236 = Static336.aClass1_Sub28_Sub1_2.method5335();
									local244 = Static336.aClass1_Sub28_Sub1_2.method5337();
									Static152.method2249(local383, local236, local244, local72);
									Static371.aClass12_160 = null;
									return true;
								} else {
									@Pc(3061) boolean local3061;
									if (Static232.aClass12_114 == Static371.aClass12_160) {
										local383 = Static336.aClass1_Sub28_Sub1_2.method5358();
										local72 = Static336.aClass1_Sub28_Sub1_2.method5335();
										local236 = Static336.aClass1_Sub28_Sub1_2.method5335();
										local244 = Static336.aClass1_Sub28_Sub1_2.method5337();
										local410 = Static336.aClass1_Sub28_Sub1_2.method5336();
										local1913 = (local244 & 0x80) != 0;
										if (local383 >> 30 == 0) {
											@Pc(3083) Class130 local3083;
											@Pc(3131) Class130 local3131;
											@Pc(3097) Class177 local3097;
											@Pc(3145) Class177 local3145;
											@Pc(3151) Class177 local3151;
											if (local383 >> 29 != 0) {
												local429 = local383 & 0xFFFF;
												@Pc(3052) Class25_Sub5_Sub1_Sub1 local3052 = Static87.aClass25_Sub5_Sub1_Sub1Array6[local429];
												if (local3052 != null) {
													if (local72 == 65535) {
														local72 = -1;
													}
													local3061 = true;
													local828 = local1913 ? local3052.anInt4267 : local3052.anInt4283;
													if (local72 != -1 && local828 != -1) {
														if (local828 == local72) {
															local3083 = Static88.aClass69_1.method1553(local72);
															if (local3083.aBoolean410 && local3083.anInt3576 != -1) {
																local3097 = Static174.aClass254_1.method5670(local3083.anInt3576);
																local2188 = local3097.anInt5037;
																if (local2188 == 0 || local2188 == 2) {
																	local3061 = false;
																} else if (local2188 == 1) {
																	local3061 = true;
																}
															}
														} else {
															local3083 = Static88.aClass69_1.method1553(local72);
															local3131 = Static88.aClass69_1.method1553(local828);
															if (local3083.anInt3576 != -1 && local3131.anInt3576 != -1) {
																local3145 = Static174.aClass254_1.method5670(local3083.anInt3576);
																local3151 = Static174.aClass254_1.method5670(local3131.anInt3576);
																if (local3151.anInt5039 > local3145.anInt5039) {
																	local3061 = false;
																}
															}
														}
													}
													if (local3061) {
														if (local1913) {
															local3052.anInt4281 = Static236.anInt4213 + local236;
															local3052.anInt4302 = local244 & 0x7;
															local3052.anInt4290 = 1;
															local3052.anInt4243 = local410;
															local3052.anInt4306 = 0;
															local3052.anInt4258 = 0;
															local3052.anInt4267 = local72;
															if (local3052.anInt4281 > Static236.anInt4213) {
																local3052.anInt4258 = -1;
															}
															if (local3052.anInt4267 != -1 && local3052.anInt4281 == Static236.anInt4213) {
																local832 = Static88.aClass69_1.method1553(local3052.anInt4267).anInt3576;
																if (local832 != -1) {
																	local3097 = Static174.aClass254_1.method5670(local832);
																	if (local3097 != null && local3097.anIntArray326 != null) {
																		Static70.method1141(local3097, local3052.aByte94, local3052.anInt5518, local3052.anInt5514, false, 0);
																	}
																}
															}
														} else {
															local3052.anInt4265 = local244 & 0x7;
															local3052.anInt4261 = Static236.anInt4213 + local236;
															local3052.anInt4283 = local72;
															local3052.anInt4257 = 0;
															local3052.anInt4252 = 0;
															local3052.anInt4276 = local410;
															local3052.anInt4300 = 1;
															if (local3052.anInt4261 > Static236.anInt4213) {
																local3052.anInt4252 = -1;
															}
															if (local3052.anInt4283 != -1 && local3052.anInt4261 == Static236.anInt4213) {
																local832 = Static88.aClass69_1.method1553(local3052.anInt4283).anInt3576;
																if (local832 != -1) {
																	local3097 = Static174.aClass254_1.method5670(local832);
																	if (local3097 != null && local3097.anIntArray326 != null) {
																		Static70.method1141(local3097, local3052.aByte94, local3052.anInt5518, local3052.anInt5514, false, 0);
																	}
																}
															}
														}
													}
												}
											} else if (local383 >> 28 != 0) {
												local429 = local383 & 0xFFFF;
												@Pc(3341) Class25_Sub5_Sub1_Sub2 local3341;
												if (local429 == Static296.anInt5181) {
													local3341 = Static447.aClass25_Sub5_Sub1_Sub2_4;
												} else {
													local3341 = Static28.aClass25_Sub5_Sub1_Sub2Array1[local429];
												}
												if (local3341 != null) {
													if (local72 == 65535) {
														local72 = -1;
													}
													local3061 = true;
													local828 = local1913 ? local3341.anInt4267 : local3341.anInt4283;
													if (local72 != -1 && local828 != -1) {
														if (local828 == local72) {
															local3083 = Static88.aClass69_1.method1553(local72);
															if (local3083.aBoolean410 && local3083.anInt3576 != -1) {
																local3097 = Static174.aClass254_1.method5670(local3083.anInt3576);
																local2188 = local3097.anInt5037;
																if (local2188 == 0 || local2188 == 2) {
																	local3061 = false;
																} else if (local2188 == 1) {
																	local3061 = true;
																}
															}
														} else {
															local3083 = Static88.aClass69_1.method1553(local72);
															local3131 = Static88.aClass69_1.method1553(local828);
															if (local3083.anInt3576 != -1 && local3131.anInt3576 != -1) {
																local3145 = Static174.aClass254_1.method5670(local3083.anInt3576);
																local3151 = Static174.aClass254_1.method5670(local3131.anInt3576);
																if (local3151.anInt5039 > local3145.anInt5039) {
																	local3061 = false;
																}
															}
														}
													}
													if (local3061) {
														if (local1913) {
															local3341.anInt4302 = local244 & 0x7;
															local3341.anInt4306 = 0;
															local3341.anInt4243 = local410;
															local3341.anInt4281 = local236 + Static236.anInt4213;
															local3341.anInt4258 = 0;
															local3341.anInt4290 = 1;
															local3341.anInt4267 = local72;
															if (local3341.anInt4267 == 65535) {
																local3341.anInt4267 = -1;
															}
															if (Static236.anInt4213 < local3341.anInt4281) {
																local3341.anInt4258 = -1;
															}
															if (local3341.anInt4267 != -1 && local3341.anInt4281 == Static236.anInt4213) {
																local832 = Static88.aClass69_1.method1553(local3341.anInt4267).anInt3576;
																if (local832 != -1) {
																	local3097 = Static174.aClass254_1.method5670(local832);
																	if (local3097 != null && local3097.anIntArray326 != null) {
																		Static70.method1141(local3097, local3341.aByte94, local3341.anInt5518, local3341.anInt5514, Static447.aClass25_Sub5_Sub1_Sub2_4 == local3341, 0);
																	}
																}
															}
														} else {
															local3341.anInt4257 = 0;
															local3341.anInt4283 = local72;
															local3341.anInt4252 = 0;
															local3341.anInt4300 = 1;
															local3341.anInt4261 = local236 + Static236.anInt4213;
															local3341.anInt4276 = local410;
															local3341.anInt4265 = local244 & 0x7;
															if (local3341.anInt4283 == 65535) {
																local3341.anInt4283 = -1;
															}
															if (Static236.anInt4213 < local3341.anInt4261) {
																local3341.anInt4252 = -1;
															}
															if (local3341.anInt4283 != -1 && local3341.anInt4261 == Static236.anInt4213) {
																local832 = Static88.aClass69_1.method1553(local3341.anInt4283).anInt3576;
																if (local832 != -1) {
																	local3097 = Static174.aClass254_1.method5670(local832);
																	if (local3097 != null && local3097.anIntArray326 != null) {
																		Static70.method1141(local3097, local3341.aByte94, local3341.anInt5518, local3341.anInt5514, local3341 == Static447.aClass25_Sub5_Sub1_Sub2_4, 0);
																	}
																}
															}
														}
													}
												}
											}
										} else {
											local429 = local383 >> 28 & 0x3;
											local1044 = (local383 >> 14 & 0x3FFF) - Static199.anInt3480;
											local2177 = (local383 & 0x3FFF) - Static164.anInt2731;
											if (local1044 >= 0 && local2177 >= 0 && local1044 < Static296.anInt5187 && local2177 < Static206.anInt3607) {
												local828 = local1044 * 128 + 64;
												local832 = local2177 * 128 + 64;
												local1054 = local429;
												if (local429 < 3 && Static183.method2654(local2177, local1044)) {
													local1054 = local429 + 1;
												}
												@Pc(3026) Class25_Sub5_Sub5 local3026 = new Class25_Sub5_Sub5(local72, 0, Static236.anInt4213, local429, local1054, local828, Static335.method4499(local429, local828, local832) - local410, local832, local1044, local1044, local2177, local2177, local244);
												Static340.aClass227_35.method4972(new Class1_Sub5_Sub6(local3026));
											}
										}
										Static371.aClass12_160 = null;
										return true;
									}
									@Pc(3818) boolean local3818;
									@Pc(3841) Class16 local3841;
									if (Static371.aClass12_160 == Static29.aClass12_17) {
										Static109.anInt4879 = Static18.anInt379;
										if (Static245.anInt4432 == 0) {
											Static400.aClass16Array1 = null;
											Static192.aString39 = null;
											Static371.aClass12_160 = null;
											Static199.aString45 = null;
											Static258.anInt7124 = 0;
											return true;
										}
										Static199.aString45 = Static336.aClass1_Sub28_Sub1_2.method5381();
										local798 = Static336.aClass1_Sub28_Sub1_2.method5337() == 1;
										if (local798) {
											Static336.aClass1_Sub28_Sub1_2.method5381();
										}
										@Pc(3690) long local3690 = Static336.aClass1_Sub28_Sub1_2.method5340();
										Static192.aString39 = Static444.method5831(local3690);
										Static24.aByte4 = Static336.aClass1_Sub28_Sub1_2.method5367();
										local244 = Static336.aClass1_Sub28_Sub1_2.method5337();
										if (local244 == 255) {
											Static371.aClass12_160 = null;
											return true;
										}
										Static258.anInt7124 = local244;
										@Pc(3714) Class16[] local3714 = new Class16[100];
										for (local416 = 0; local416 < Static258.anInt7124; local416++) {
											local3714[local416] = new Class16();
											local3714[local416].aString4 = Static336.aClass1_Sub28_Sub1_2.method5381();
											local798 = Static336.aClass1_Sub28_Sub1_2.method5337() == 1;
											if (local798) {
												local3714[local416].aString5 = Static336.aClass1_Sub28_Sub1_2.method5381();
											} else {
												local3714[local416].aString5 = local3714[local416].aString4;
											}
											local3714[local416].aString2 = Static440.method5809(local3714[local416].aString5);
											local3714[local416].anInt414 = Static336.aClass1_Sub28_Sub1_2.method5335();
											local3714[local416].aByte3 = Static336.aClass1_Sub28_Sub1_2.method5367();
											local3714[local416].aString3 = Static336.aClass1_Sub28_Sub1_2.method5381();
											if (local3714[local416].aString5.equals(Static447.aClass25_Sub5_Sub1_Sub2_4.aString51)) {
												Static384.aByte100 = local3714[local416].aByte3;
											}
										}
										local2177 = Static258.anInt7124;
										while (local2177 > 0) {
											local2177--;
											local3818 = true;
											for (local828 = 0; local828 < local2177; local828++) {
												if (local3714[local828].aString2.compareTo(local3714[local828 + 1].aString2) > 0) {
													local3841 = local3714[local828];
													local3714[local828] = local3714[local828 + 1];
													local3714[local828 + 1] = local3841;
													local3818 = false;
												}
											}
											if (local3818) {
												break;
											}
										}
										Static400.aClass16Array1 = local3714;
										Static371.aClass12_160 = null;
										return true;
									} else if (Static371.aClass12_160 == Static77.aClass12_44) {
										Static93.anInt1674 = Static336.aClass1_Sub28_Sub1_2.method5389();
										Static361.aBoolean690 = Static336.aClass1_Sub28_Sub1_2.method5337() == 1;
										Static371.aClass12_160 = null;
										return true;
									} else if (Static371.aClass12_160 == Static207.aClass12_153) {
										Static132.aClass129_1 = Static13.method207(Static336.aClass1_Sub28_Sub1_2.method5337());
										Static371.aClass12_160 = null;
										return true;
									} else if (Static433.aClass12_178 == Static371.aClass12_160) {
										local383 = Static336.aClass1_Sub28_Sub1_2.method5335();
										local72 = Static336.aClass1_Sub28_Sub1_2.method5337();
										Static320.aClass249_2.method5601(local383, local72);
										Static371.aClass12_160 = null;
										return true;
									} else if (Static76.aClass12_43 == Static371.aClass12_160) {
										local383 = Static336.aClass1_Sub28_Sub1_2.method5375();
										local72 = Static336.aClass1_Sub28_Sub1_2.method5380();
										local236 = Static336.aClass1_Sub28_Sub1_2.method5375();
										if (Static86.method1410(local236)) {
											Static411.method5301(local72, local383);
										}
										Static371.aClass12_160 = null;
										return true;
									} else {
										@Pc(3977) byte local3977;
										if (Static230.aClass12_111 == Static371.aClass12_160) {
											local383 = Static336.aClass1_Sub28_Sub1_2.method5341();
											local3977 = Static336.aClass1_Sub28_Sub1_2.method5377();
											Static320.aClass249_2.method5596(local383, local3977);
											Static371.aClass12_160 = null;
											return true;
										} else if (Static183.aClass12_95 == Static371.aClass12_160) {
											local383 = Static336.aClass1_Sub28_Sub1_2.method5335();
											if (Static86.method1410(local383)) {
												Static449.method5876();
											}
											Static371.aClass12_160 = null;
											return true;
										} else if (Static371.aClass12_160 == Static313.aClass12_140) {
											Static409.method5277(Static336.aClass1_Sub28_Sub1_2.method5381());
											Static371.aClass12_160 = null;
											return true;
										} else if (Static371.aClass12_160 == Static430.aClass12_177) {
											local383 = Static336.aClass1_Sub28_Sub1_2.method5337();
											local72 = local383 >> 5;
											local236 = local383 & 0x1F;
											if (local236 == 0) {
												Static133.aClass135Array1[local72] = null;
												Static371.aClass12_160 = null;
												return true;
											}
											@Pc(4044) Class135 local4044 = new Class135();
											local4044.anInt3824 = local236;
											local4044.anInt3816 = Static336.aClass1_Sub28_Sub1_2.method5337();
											if (local4044.anInt3816 >= 0 && local4044.anInt3816 < Static94.aClass6Array5.length) {
												if (local4044.anInt3824 == 1 || local4044.anInt3824 == 10) {
													local4044.anInt3817 = Static336.aClass1_Sub28_Sub1_2.method5335();
													Static336.aClass1_Sub28_Sub1_2.anInt6812 += 6;
												} else if (local4044.anInt3824 >= 2 && local4044.anInt3824 <= 6) {
													if (local4044.anInt3824 == 2) {
														local4044.anInt3814 = 64;
														local4044.anInt3818 = 64;
													}
													if (local4044.anInt3824 == 3) {
														local4044.anInt3818 = 0;
														local4044.anInt3814 = 64;
													}
													if (local4044.anInt3824 == 4) {
														local4044.anInt3814 = 64;
														local4044.anInt3818 = 128;
													}
													if (local4044.anInt3824 == 5) {
														local4044.anInt3818 = 64;
														local4044.anInt3814 = 0;
													}
													if (local4044.anInt3824 == 6) {
														local4044.anInt3818 = 64;
														local4044.anInt3814 = 128;
													}
													local4044.anInt3824 = 2;
													local4044.anInt3822 = Static336.aClass1_Sub28_Sub1_2.method5337();
													local4044.anInt3818 += Static336.aClass1_Sub28_Sub1_2.method5335() - Static199.anInt3480 << 7;
													local4044.anInt3814 += Static336.aClass1_Sub28_Sub1_2.method5335() - Static164.anInt2731 << 7;
													local4044.anInt3821 = Static336.aClass1_Sub28_Sub1_2.method5337() << 0;
													local4044.anInt3825 = Static336.aClass1_Sub28_Sub1_2.method5335();
												}
												local4044.anInt3823 = Static336.aClass1_Sub28_Sub1_2.method5335();
												if (local4044.anInt3823 == 65535) {
													local4044.anInt3823 = -1;
												}
												Static133.aClass135Array1[local72] = local4044;
											}
											Static371.aClass12_160 = null;
											return true;
										} else if (Static203.aClass12_155 == Static371.aClass12_160) {
											local383 = Static336.aClass1_Sub28_Sub1_2.method5358();
											local72 = Static336.aClass1_Sub28_Sub1_2.method5361();
											local236 = Static336.aClass1_Sub28_Sub1_2.method5336();
											if (Static86.method1410(local236)) {
												@Pc(4247) Class1_Sub14 local4247 = (Class1_Sub14) Static94.aClass199_54.method4387((long) local72);
												local1608 = (Class1_Sub14) Static94.aClass199_54.method4387((long) local383);
												if (local1608 != null) {
													Static452.method5911(false, local4247 == null || local4247.anInt1425 != local1608.anInt1425, local1608);
												}
												if (local4247 != null) {
													local4247.method5915();
													Static94.aClass199_54.method4383((long) local383, local4247);
												}
												@Pc(4293) Class124 local4293 = Static412.method5315(local72);
												if (local4293 != null) {
													Static160.method2323(local4293);
												}
												local4293 = Static412.method5315(local383);
												if (local4293 != null) {
													Static160.method2323(local4293);
													Static177.method2498(local4293, true);
												}
												if (Static207.anInt6026 != -1) {
													Static363.method4852(1, Static207.anInt6026);
												}
											}
											Static371.aClass12_160 = null;
											return true;
										} else if (Static371.aClass12_160 == Static22.aClass12_15) {
											Static390.method5105();
											Static371.aClass12_160 = null;
											return false;
										} else if (Static326.aClass12_143 == Static371.aClass12_160) {
											local383 = Static336.aClass1_Sub28_Sub1_2.method5355();
											local72 = Static336.aClass1_Sub28_Sub1_2.method5341();
											local236 = Static336.aClass1_Sub28_Sub1_2.method5336();
											if (Static86.method1410(local236)) {
												Static341.method4574(local383, local72);
											}
											Static371.aClass12_160 = null;
											return true;
										} else if (Static371.aClass12_160 == Static260.aClass12_59) {
											Static191.anInt3304 = Static336.aClass1_Sub28_Sub1_2.method5337();
											Static371.aClass12_160 = null;
											return true;
										} else if (Static371.aClass12_160 == Static93.aClass12_51) {
											local383 = Static336.aClass1_Sub28_Sub1_2.method5375();
											local72 = Static336.aClass1_Sub28_Sub1_2.method5361();
											local236 = Static336.aClass1_Sub28_Sub1_2.method5346();
											if (Static86.method1410(local383)) {
												Static243.method3502(local72, local236);
											}
											Static371.aClass12_160 = null;
											return true;
										} else if (Static371.aClass12_160 == Static22.aClass12_14) {
											local383 = Static336.aClass1_Sub28_Sub1_2.method5336();
											local72 = Static336.aClass1_Sub28_Sub1_2.method5336();
											local236 = Static336.aClass1_Sub28_Sub1_2.method5361();
											if (Static86.method1410(local383)) {
												Static97.method1504(local236, local72);
											}
											Static371.aClass12_160 = null;
											return true;
										} else if (Static151.aClass12_82 == Static371.aClass12_160) {
											local1551 = Static336.aClass1_Sub28_Sub1_2.method5381();
											local398 = Static336.aClass1_Sub28_Sub1_2.method5337() == 1;
											if (local398) {
												local802 = Static336.aClass1_Sub28_Sub1_2.method5381();
											} else {
												local802 = local1551;
											}
											local244 = Static336.aClass1_Sub28_Sub1_2.method5335();
											@Pc(4462) byte local4462 = Static336.aClass1_Sub28_Sub1_2.method5367();
											local1913 = false;
											if (local4462 == -128) {
												local1913 = true;
											}
											if (local1913) {
												if (Static258.anInt7124 == 0) {
													Static371.aClass12_160 = null;
													return true;
												}
												for (local429 = 0; local429 < Static258.anInt7124 && (!Static400.aClass16Array1[local429].aString5.equals(local802) || Static400.aClass16Array1[local429].anInt414 != local244); local429++) {
												}
												if (Static258.anInt7124 > local429) {
													while (local429 < Static258.anInt7124 - 1) {
														Static400.aClass16Array1[local429] = Static400.aClass16Array1[local429 + 1];
														local429++;
													}
													Static258.anInt7124--;
													Static400.aClass16Array1[Static258.anInt7124] = null;
												}
											} else {
												local1934 = Static336.aClass1_Sub28_Sub1_2.method5381();
												local3841 = new Class16();
												local3841.aString5 = local802;
												local3841.aString4 = local1551;
												local3841.aString2 = Static440.method5809(local3841.aString5);
												local3841.aString3 = local1934;
												local3841.aByte3 = local4462;
												local3841.anInt414 = local244;
												for (local2177 = Static258.anInt7124 - 1; local2177 >= 0; local2177--) {
													local828 = Static400.aClass16Array1[local2177].aString2.compareTo(local3841.aString2);
													if (local828 == 0) {
														Static400.aClass16Array1[local2177].anInt414 = local244;
														Static400.aClass16Array1[local2177].aByte3 = local4462;
														Static400.aClass16Array1[local2177].aString3 = local1934;
														if (local802.equals(Static447.aClass25_Sub5_Sub1_Sub2_4.aString51)) {
															Static384.aByte100 = local4462;
														}
														Static371.aClass12_160 = null;
														Static109.anInt4879 = Static18.anInt379;
														return true;
													}
													if (local828 < 0) {
														break;
													}
												}
												if (Static400.aClass16Array1.length <= Static258.anInt7124) {
													Static371.aClass12_160 = null;
													return true;
												}
												for (local828 = Static258.anInt7124 - 1; local828 > local2177; local828--) {
													Static400.aClass16Array1[local828 + 1] = Static400.aClass16Array1[local828];
												}
												if (Static258.anInt7124 == 0) {
													Static400.aClass16Array1 = new Class16[100];
												}
												Static400.aClass16Array1[local2177 + 1] = local3841;
												Static258.anInt7124++;
												if (local802.equals(Static447.aClass25_Sub5_Sub1_Sub2_4.aString51)) {
													Static384.aByte100 = local4462;
												}
											}
											Static371.aClass12_160 = null;
											Static109.anInt4879 = Static18.anInt379;
											return true;
										} else if (Static371.aClass12_160 == Static352.aClass12_154) {
											Static368.method4884(Static145.aBoolean233);
											Static371.aClass12_160 = null;
											return false;
										} else if (Static371.aClass12_160 == Static371.aClass12_159) {
											Static89.method1424(Static168.aClass269_19);
											Static371.aClass12_160 = null;
											return true;
										} else if (Static70.aClass12_39 == Static371.aClass12_160) {
											Static89.method1424(Static305.aClass269_38);
											Static371.aClass12_160 = null;
											return true;
										} else if (Static184.aClass12_97 == Static371.aClass12_160) {
											local383 = Static336.aClass1_Sub28_Sub1_2.method5392();
											local72 = Static336.aClass1_Sub28_Sub1_2.method5355();
											local236 = Static336.aClass1_Sub28_Sub1_2.method5337();
											local486 = "";
											local496 = local486;
											if ((local236 & 0x1) != 0) {
												local486 = Static336.aClass1_Sub28_Sub1_2.method5381();
												if ((local236 & 0x2) == 0) {
													local496 = local486;
												} else {
													local496 = Static336.aClass1_Sub28_Sub1_2.method5381();
												}
											}
											local500 = Static336.aClass1_Sub28_Sub1_2.method5381();
											if (local383 == 99) {
												Static324.method4374(local500);
											} else if (local496.equals("") || !Static406.method5265(local496)) {
												Static90.method1430(local500, local496, local383, local486, local72);
											} else {
												Static371.aClass12_160 = null;
												return true;
											}
											Static371.aClass12_160 = null;
											return true;
										} else if (Static371.aClass12_160 == Static150.aClass12_169) {
											local383 = Static336.aClass1_Sub28_Sub1_2.method5335();
											local72 = Static336.aClass1_Sub28_Sub1_2.method5355();
											if (Static86.method1410(local383)) {
												@Pc(4816) Class1_Sub14 local4816 = (Class1_Sub14) Static94.aClass199_54.method4387((long) local72);
												if (local4816 != null) {
													Static452.method5911(false, true, local4816);
												}
												if (Static395.aClass124_11 != null) {
													Static160.method2323(Static395.aClass124_11);
													Static395.aClass124_11 = null;
												}
											}
											Static371.aClass12_160 = null;
											return true;
										} else if (Static371.aClass12_160 == Static35.aClass12_22) {
											local383 = Static336.aClass1_Sub28_Sub1_2.method5390();
											local72 = Static336.aClass1_Sub28_Sub1_2.method5375();
											local236 = Static336.aClass1_Sub28_Sub1_2.method5341();
											@Pc(4853) Class25_Sub5_Sub1_Sub1 local4853 = Static87.aClass25_Sub5_Sub1_Sub1Array6[local72];
											if (local4853 != null) {
												Static322.method4325(local236, local4853, local383);
											}
											Static371.aClass12_160 = null;
											return true;
										} else if (Static37.aClass12_25 == Static371.aClass12_160) {
											local383 = Static336.aClass1_Sub28_Sub1_2.method5335();
											if (local383 == 65535) {
												local383 = -1;
											}
											local72 = Static336.aClass1_Sub28_Sub1_2.method5337();
											local236 = Static336.aClass1_Sub28_Sub1_2.method5335();
											local244 = Static336.aClass1_Sub28_Sub1_2.method5337();
											Static426.method5635(local244, local72, local236, local383);
											Static371.aClass12_160 = null;
											return true;
										} else if (Static371.aClass12_160 == Static410.aClass12_149) {
											local798 = Static336.aClass1_Sub28_Sub1_2.method5337() == 1;
											@Pc(4917) byte[] local4917 = new byte[Static245.anInt4432 - 1];
											Static336.aClass1_Sub28_Sub1_2.method5344(local4917, Static245.anInt4432 - 1);
											Static17.method266(local4917, local798);
											Static371.aClass12_160 = null;
											return true;
										} else if (Static10.aClass12_9 == Static371.aClass12_160) {
											local383 = Static336.aClass1_Sub28_Sub1_2.method5341();
											local3977 = Static336.aClass1_Sub28_Sub1_2.method5367();
											local236 = Static336.aClass1_Sub28_Sub1_2.method5335();
											if (Static86.method1410(local383)) {
												Static263.method3724(local236, local3977);
											}
											Static371.aClass12_160 = null;
											return true;
										} else if (Static371.aClass12_160 == Static71.aClass12_41) {
											Static330.method4430(Static183.aClass83_2, Static245.anInt4432, Static336.aClass1_Sub28_Sub1_2);
											Static371.aClass12_160 = null;
											return true;
										} else if (Static371.aClass12_160 == Static198.aClass12_102) {
											Static336.aClass1_Sub28_Sub1_2.anInt6812 += 28;
											if (Static336.aClass1_Sub28_Sub1_2.method5372()) {
												Static180.method2604(Static336.aClass1_Sub28_Sub1_2.anInt6812 - 28, Static336.aClass1_Sub28_Sub1_2);
											}
											Static371.aClass12_160 = null;
											return true;
										} else if (Static371.aClass12_160 == Static293.aClass12_136) {
											local383 = Static336.aClass1_Sub28_Sub1_2.method5361();
											local72 = Static336.aClass1_Sub28_Sub1_2.method5358();
											local236 = Static336.aClass1_Sub28_Sub1_2.method5335();
											local244 = Static336.aClass1_Sub28_Sub1_2.method5375();
											if (Static86.method1410(local236)) {
												Static284.method3915(5, local244, local72, local383);
											}
											Static371.aClass12_160 = null;
											return true;
										} else if (Static451.aClass12_181 == Static371.aClass12_160) {
											Static232.method3339();
											Static371.aClass12_160 = null;
											return false;
										} else if (Static312.aClass12_139 == Static371.aClass12_160) {
											local383 = Static336.aClass1_Sub28_Sub1_2.method5341();
											local72 = Static336.aClass1_Sub28_Sub1_2.method5358();
											if (Static86.method1410(local383)) {
												Static284.method3915(3, -1, local72, -1);
											}
											Static371.aClass12_160 = null;
											return true;
										} else if (Static371.aClass12_160 == Static53.aClass12_32) {
											local383 = Static336.aClass1_Sub28_Sub1_2.method5335();
											if (Static86.method1410(local383)) {
												Static3.method4552();
											}
											Static371.aClass12_160 = null;
											return true;
										} else if (Static371.aClass12_160 == Static168.aClass12_87) {
											local383 = Static336.aClass1_Sub28_Sub1_2.method5335();
											local72 = Static336.aClass1_Sub28_Sub1_2.method5375();
											local236 = Static336.aClass1_Sub28_Sub1_2.method5380();
											local244 = Static336.aClass1_Sub28_Sub1_2.method5336();
											if (Static86.method1410(local72)) {
												Static252.method3610(local236, local383 + (local244 << 16));
											}
											Static371.aClass12_160 = null;
											return true;
										} else if (Static64.aClass12_38 == Static371.aClass12_160) {
											Static5.method62();
											Static371.aClass12_160 = null;
											return true;
										} else if (Static58.aClass12_34 == Static371.aClass12_160) {
											local383 = Static336.aClass1_Sub28_Sub1_2.method5341();
											local72 = Static336.aClass1_Sub28_Sub1_2.method5361();
											if (Static86.method1410(local383)) {
												Static284.method3915(5, Static296.anInt5181, local72, 0);
											}
											Static371.aClass12_160 = null;
											return true;
										} else if (Static371.aClass12_160 == Static243.aClass12_119) {
											if (Static90.aFrame1 != null) {
												Static169.method2392(-1, Static453.aClass136_Sub1_1.anInt4455, -1, false);
											}
											@Pc(5174) byte[] local5174 = new byte[Static245.anInt4432];
											Static336.aClass1_Sub28_Sub1_2.method3087(local5174, Static245.anInt4432);
											local802 = Static312.method4243(Static245.anInt4432, 0, local5174);
											Static141.method3869(Static14.anInt293 == 1, local802, true, Static183.aClass83_2);
											Static371.aClass12_160 = null;
											return true;
										} else if (Static414.aClass12_170 == Static371.aClass12_160) {
											local798 = Static336.aClass1_Sub28_Sub1_2.method5337() == 1;
											local802 = Static336.aClass1_Sub28_Sub1_2.method5381();
											local482 = local802;
											if (local798) {
												local482 = Static336.aClass1_Sub28_Sub1_2.method5381();
											}
											local814 = Static336.aClass1_Sub28_Sub1_2.method5340();
											local819 = Static336.aClass1_Sub28_Sub1_2.method5335();
											local824 = Static336.aClass1_Sub28_Sub1_2.method5345();
											local828 = Static336.aClass1_Sub28_Sub1_2.method5337();
											@Pc(5251) long local5251 = local824 + (local819 << 32);
											@Pc(5253) boolean local5253 = false;
											@Pc(5255) int local5255 = 0;
											while (true) {
												if (local5255 >= 100) {
													if (local828 <= 1) {
														if (Static361.aBoolean690 && !Static241.aBoolean491 || Static336.aBoolean652) {
															local5253 = true;
														} else if (Static406.method5265(local482)) {
															local5253 = true;
														}
													}
													break;
												}
												if (local5251 == Static188.aLongArray7[local5255]) {
													local5253 = true;
													break;
												}
												local5255++;
											}
											if (!local5253 && Static239.anInt5812 == 0) {
												Static188.aLongArray7[Static219.anInt3920] = local5251;
												Static219.anInt3920 = (Static219.anInt3920 + 1) % 100;
												@Pc(5319) String local5319 = Static328.method4413(Static365.method4855(Static336.aClass1_Sub28_Sub1_2));
												if (local828 == 2 || local828 == 3) {
													Static45.method4316(Static401.method5220(local814), local5319, -1, "<img=1>" + local802, 9, "<img=1>" + local482, 0);
												} else if (local828 == 1) {
													Static45.method4316(Static401.method5220(local814), local5319, -1, "<img=0>" + local802, 9, "<img=0>" + local482, 0);
												} else {
													Static45.method4316(Static401.method5220(local814), local5319, -1, local802, 9, local482, 0);
												}
											}
											Static371.aClass12_160 = null;
											return true;
										} else if (Static371.aClass12_160 == Static71.aClass12_42) {
											local383 = Static336.aClass1_Sub28_Sub1_2.method5335();
											local72 = Static336.aClass1_Sub28_Sub1_2.method5396();
											local398 = (local72 & 0x1) == 1;
											Static33.method429(local383, local398);
											Static313.anIntArray356[Static360.anInt6141++ & 0x1F] = local383;
											Static371.aClass12_160 = null;
											return true;
										} else if (Static371.aClass12_160 == Static131.aClass12_69) {
											local383 = Static336.aClass1_Sub28_Sub1_2.method5355();
											local72 = local383 >> 28 & 0x3;
											local236 = local383 >> 14 & 0x3FFF;
											local244 = local383 & 0x3FFF;
											local410 = Static336.aClass1_Sub28_Sub1_2.method5396();
											local416 = local410 >> 2;
											local429 = local410 & 0x3;
											local1044 = Static258.anIntArray470[local416];
											local2177 = Static336.aClass1_Sub28_Sub1_2.method5375();
											local236 -= Static199.anInt3480;
											if (local2177 == 65535) {
												local2177 = -1;
											}
											local244 -= Static164.anInt2731;
											Static297.method4608(local72, local1044, local429, local416, local244, local2177, local236);
											Static371.aClass12_160 = null;
											return true;
										} else if (Static430.aClass12_176 == Static371.aClass12_160) {
											local383 = Static336.aClass1_Sub28_Sub1_2.method5375();
											local72 = Static336.aClass1_Sub28_Sub1_2.method5341();
											local236 = Static336.aClass1_Sub28_Sub1_2.method5335();
											if (Static86.method1410(local383)) {
												Static127.method2013(local72, local236);
											}
											Static371.aClass12_160 = null;
											return true;
										} else if (Static371.aClass12_160 == Static344.aClass12_150) {
											Static116.method1849(false);
											Static371.aClass12_160 = null;
											return true;
										} else if (Static184.aClass12_96 == Static371.aClass12_160) {
											Static89.method1424(Static56.aClass269_9);
											Static371.aClass12_160 = null;
											return true;
										} else if (Static371.aClass12_160 == Static41.aClass12_26) {
											Static114.method1813(Static336.aClass1_Sub28_Sub1_2, Static245.anInt4432);
											Static371.aClass12_160 = null;
											return true;
										} else if (Static371.aClass12_160 == Static199.aClass12_103) {
											local383 = Static336.aClass1_Sub28_Sub1_2.method5335();
											local72 = Static336.aClass1_Sub28_Sub1_2.method5375();
											local482 = Static336.aClass1_Sub28_Sub1_2.method5381();
											if (Static86.method1410(local383)) {
												Static308.method4205(local482, local72);
											}
											Static371.aClass12_160 = null;
											return true;
										} else if (Static434.aClass12_179 == Static371.aClass12_160) {
											local1551 = Static336.aClass1_Sub28_Sub1_2.method5381();
											local802 = Static328.method4413(Static365.method4855(Static336.aClass1_Sub28_Sub1_2));
											Static90.method1430(local802, local1551, 6, local1551, 0);
											Static371.aClass12_160 = null;
											return true;
										} else if (Static54.aClass12_33 == Static371.aClass12_160) {
											local383 = Static336.aClass1_Sub28_Sub1_2.method5396();
											local72 = Static336.aClass1_Sub28_Sub1_2.method5390();
											if (local383 == 255) {
												local72 = -1;
												local383 = -1;
											}
											Static347.method4707(local72, local383);
											Static371.aClass12_160 = null;
											return true;
										} else if (Static454.aClass12_183 == Static371.aClass12_160) {
											local383 = Static336.aClass1_Sub28_Sub1_2.method5341();
											if (local383 == 65535) {
												local383 = -1;
											}
											local72 = Static336.aClass1_Sub28_Sub1_2.method5380();
											local236 = Static336.aClass1_Sub28_Sub1_2.method5341();
											local244 = Static336.aClass1_Sub28_Sub1_2.method5358();
											if (Static86.method1410(local236)) {
												Static110.method1729(local72, local244, local383);
												@Pc(5686) Class162 local5686 = Static342.aClass155_2.method3548(local383);
												Static421.method5602(local5686.anInt4709, local244, local5686.anInt4697, local5686.anInt4730);
												Static36.method5121(local5686.anInt4718, local5686.anInt4743, local244, local5686.anInt4700);
											}
											Static371.aClass12_160 = null;
											return true;
										} else if (Static371.aClass12_160 == Static362.aClass12_46) {
											Static89.method1424(Static1.aClass269_1);
											Static371.aClass12_160 = null;
											return true;
										} else if (Static282.aClass12_131 == Static371.aClass12_160) {
											local383 = Static336.aClass1_Sub28_Sub1_2.method5375();
											local72 = Static336.aClass1_Sub28_Sub1_2.method5396();
											if (Static86.method1410(local383)) {
												Static332.anInt5660 = local72;
											}
											Static371.aClass12_160 = null;
											return true;
										} else if (Static166.aClass12_86 == Static371.aClass12_160) {
											local383 = Static336.aClass1_Sub28_Sub1_2.method5335();
											local72 = Static336.aClass1_Sub28_Sub1_2.method5335();
											local236 = Static336.aClass1_Sub28_Sub1_2.method5335();
											local244 = Static336.aClass1_Sub28_Sub1_2.method5335();
											if (Static86.method1410(local383) && Static87.aClass124ArrayArray7[local72] != null) {
												for (local410 = local236; local410 < local244; local410++) {
													local416 = Static336.aClass1_Sub28_Sub1_2.method5345();
													if (local410 < Static87.aClass124ArrayArray7[local72].length && Static87.aClass124ArrayArray7[local72][local410] != null) {
														Static87.aClass124ArrayArray7[local72][local410].anInt3364 = local416;
													}
												}
											}
											Static371.aClass12_160 = null;
											return true;
										} else if (Static417.aClass12_173 == Static371.aClass12_160) {
											Static89.method1424(Static223.aClass269_44);
											Static371.aClass12_160 = null;
											return true;
										} else if (Static371.aClass12_160 == Static210.aClass12_107) {
											local383 = Static336.aClass1_Sub28_Sub1_2.method5337();
											if (Static336.aClass1_Sub28_Sub1_2.method5337() == 0) {
												Static205.aClass179Array1[local383] = new Class179();
											} else {
												Static336.aClass1_Sub28_Sub1_2.anInt6812--;
												Static205.aClass179Array1[local383] = new Class179(Static336.aClass1_Sub28_Sub1_2);
											}
											Static371.aClass12_160 = null;
											Static193.anInt3424 = Static18.anInt379;
											return true;
										} else if (Static164.aClass12_84 == Static371.aClass12_160) {
											local383 = Static336.aClass1_Sub28_Sub1_2.method5346();
											local72 = Static336.aClass1_Sub28_Sub1_2.method5336();
											local236 = Static336.aClass1_Sub28_Sub1_2.method5358();
											local244 = Static336.aClass1_Sub28_Sub1_2.method5378();
											if (Static86.method1410(local72)) {
												Static151.method2245(local236, local383, local244);
											}
											Static371.aClass12_160 = null;
											return true;
										} else if (Static371.aClass12_160 == Static426.aClass12_175) {
											while (Static336.aClass1_Sub28_Sub1_2.anInt6812 < Static245.anInt4432) {
												local798 = Static336.aClass1_Sub28_Sub1_2.method5337() == 1;
												local802 = Static336.aClass1_Sub28_Sub1_2.method5381();
												local482 = Static336.aClass1_Sub28_Sub1_2.method5381();
												local244 = Static336.aClass1_Sub28_Sub1_2.method5335();
												local410 = Static336.aClass1_Sub28_Sub1_2.method5337();
												local500 = "";
												local3818 = false;
												if (local244 > 0) {
													local500 = Static336.aClass1_Sub28_Sub1_2.method5381();
													local3818 = Static336.aClass1_Sub28_Sub1_2.method5337() == 1;
												}
												for (local1044 = 0; local1044 < Static107.anInt2042; local1044++) {
													if (local798) {
														if (local482.equals(Static320.aStringArray44[local1044])) {
															Static320.aStringArray44[local1044] = local802;
															Static355.aStringArray41[local1044] = local482;
															local802 = null;
															break;
														}
													} else if (local802.equals(Static320.aStringArray44[local1044])) {
														if (local244 != Static434.anIntArray492[local1044]) {
															local3061 = true;
															for (@Pc(5979) Class4_Sub1_Sub1 local5979 = (Class4_Sub1_Sub1) Static341.aClass262_11.method5819(); local5979 != null; local5979 = (Class4_Sub1_Sub1) Static341.aClass262_11.method5813()) {
																if (local5979.aString46.equals(local802)) {
																	if (local244 != 0 && local5979.aShort57 == 0) {
																		local3061 = false;
																		local5979.method5572();
																	} else if (local244 == 0 && local5979.aShort57 != 0) {
																		local3061 = false;
																		local5979.method5572();
																	}
																}
															}
															if (local3061) {
																Static341.aClass262_11.method5815(new Class4_Sub1_Sub1(local802, local244));
															}
															Static434.anIntArray492[local1044] = local244;
														}
														Static355.aStringArray41[local1044] = local482;
														Static3.aStringArray39[local1044] = local500;
														Static71.anIntArray63[local1044] = local410;
														local802 = null;
														Static64.aBooleanArray3[local1044] = local3818;
														break;
													}
												}
												if (local802 != null && Static107.anInt2042 < 200) {
													Static320.aStringArray44[Static107.anInt2042] = local802;
													Static355.aStringArray41[Static107.anInt2042] = local482;
													Static434.anIntArray492[Static107.anInt2042] = local244;
													Static3.aStringArray39[Static107.anInt2042] = local500;
													Static71.anIntArray63[Static107.anInt2042] = local410;
													Static64.aBooleanArray3[Static107.anInt2042] = local3818;
													Static107.anInt2042++;
												}
											}
											Static183.anInt3199 = Static18.anInt379;
											Static240.anInt6654 = 2;
											local72 = Static107.anInt2042;
											while (local72 > 0) {
												local72--;
												local798 = true;
												for (local236 = 0; local236 < local72; local236++) {
													if (Static434.anIntArray492[local236] != Static259.aClass156_4.anInt4501 && Static259.aClass156_4.anInt4501 == Static434.anIntArray492[local236 + 1] || Static434.anIntArray492[local236] == 0 && Static434.anIntArray492[local236 + 1] != 0) {
														local244 = Static434.anIntArray492[local236];
														Static434.anIntArray492[local236] = Static434.anIntArray492[local236 + 1];
														Static434.anIntArray492[local236 + 1] = local244;
														local496 = Static3.aStringArray39[local236];
														Static3.aStringArray39[local236] = Static3.aStringArray39[local236 + 1];
														Static3.aStringArray39[local236 + 1] = local496;
														local500 = Static320.aStringArray44[local236];
														Static320.aStringArray44[local236] = Static320.aStringArray44[local236 + 1];
														Static320.aStringArray44[local236 + 1] = local500;
														local1934 = Static355.aStringArray41[local236];
														Static355.aStringArray41[local236] = Static355.aStringArray41[local236 + 1];
														Static355.aStringArray41[local236 + 1] = local1934;
														local1044 = Static71.anIntArray63[local236];
														Static71.anIntArray63[local236] = Static71.anIntArray63[local236 + 1];
														Static71.anIntArray63[local236 + 1] = local1044;
														local3061 = Static64.aBooleanArray3[local236];
														Static64.aBooleanArray3[local236] = Static64.aBooleanArray3[local236 + 1];
														local798 = false;
														Static64.aBooleanArray3[local236 + 1] = local3061;
													}
												}
												if (local798) {
													break;
												}
											}
											Static371.aClass12_160 = null;
											return true;
										} else if (Static371.aClass12_160 == Static30.aClass12_18) {
											Static446.anInt7396 = Static336.aClass1_Sub28_Sub1_2.method5337();
											for (local383 = 0; local383 < Static446.anInt7396; local383++) {
												Static264.aStringArray29[local383] = Static336.aClass1_Sub28_Sub1_2.method5381();
												Static131.aStringArray13[local383] = Static336.aClass1_Sub28_Sub1_2.method5381();
												if (Static131.aStringArray13[local383].equals("")) {
													Static131.aStringArray13[local383] = Static264.aStringArray29[local383];
												}
												Static80.aStringArray10[local383] = Static336.aClass1_Sub28_Sub1_2.method5381();
												Static357.aStringArray42[local383] = Static336.aClass1_Sub28_Sub1_2.method5381();
												if (Static357.aStringArray42[local383].equals("")) {
													Static357.aStringArray42[local383] = Static80.aStringArray10[local383];
												}
												Static294.aBooleanArray17[local383] = false;
											}
											Static183.anInt3199 = Static18.anInt379;
											Static371.aClass12_160 = null;
											return true;
										} else if (Static51.aClass12_27 == Static371.aClass12_160) {
											Static128.anInt2353 = Static336.aClass1_Sub28_Sub1_2.method5396();
											Static301.anInt5240 = Static336.aClass1_Sub28_Sub1_2.method5396();
											Static371.aClass12_160 = null;
											return true;
										} else if (Static371.aClass12_160 == Static297.aClass12_148) {
											Static89.method1424(Static305.aClass269_39);
											Static371.aClass12_160 = null;
											return true;
										} else if (Static371.aClass12_160 == Static381.aClass12_164) {
											Static89.method1424(Static328.aClass269_43);
											Static371.aClass12_160 = null;
											return true;
										} else if (Static339.aClass12_146 == Static371.aClass12_160) {
											Static89.method1424(Static438.aClass269_35);
											Static371.aClass12_160 = null;
											return true;
										} else if (Static389.aClass12_166 == Static371.aClass12_160) {
											for (local383 = 0; local383 < Static28.aClass25_Sub5_Sub1_Sub2Array1.length; local383++) {
												if (Static28.aClass25_Sub5_Sub1_Sub2Array1[local383] != null) {
													Static28.aClass25_Sub5_Sub1_Sub2Array1[local383].anInt4270 = -1;
												}
											}
											for (local72 = 0; local72 < Static87.aClass25_Sub5_Sub1_Sub1Array6.length; local72++) {
												if (Static87.aClass25_Sub5_Sub1_Sub1Array6[local72] != null) {
													Static87.aClass25_Sub5_Sub1_Sub1Array6[local72].anInt4270 = -1;
												}
											}
											Static371.aClass12_160 = null;
											return true;
										} else {
											Static55.method972(null, "T1 - " + (Static371.aClass12_160 == null ? -1 : Static371.aClass12_160.method231()) + "," + (Static114.aClass12_56 == null ? -1 : Static114.aClass12_56.method231()) + "," + (Static148.aClass12_78 == null ? -1 : Static148.aClass12_78.method231()) + " - " + Static245.anInt4432);
											Static368.method4884(false);
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
