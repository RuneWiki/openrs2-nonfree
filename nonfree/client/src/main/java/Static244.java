import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray37;

	@OriginalMember(owner = "client!ip", name = "o", descriptor = "[I")
	private static int[] anIntArray280;

	@OriginalMember(owner = "client!ip", name = "v", descriptor = "Lclient!sca;")
	private static Class302 aClass302_32;

	@OriginalMember(owner = "client!ip", name = "w", descriptor = "Lclient!sca;")
	private static Class302 aClass302_33;

	@OriginalMember(owner = "client!ip", name = "y", descriptor = "Lclient!vga;")
	private static Class358 aClass358_1;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar4 = Calendar.getInstance();

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "[I")
	private static final int[] anIntArray278 = new int[5];

	@OriginalMember(owner = "client!ip", name = "d", descriptor = "I")
	private static int anInt4839 = 0;

	@OriginalMember(owner = "client!ip", name = "f", descriptor = "[I")
	private static final int[] anIntArray279 = new int[1000];

	@OriginalMember(owner = "client!ip", name = "h", descriptor = "[Lclient!vv;")
	private static final Class366[] aClass366Array1 = new Class366[50];

	@OriginalMember(owner = "client!ip", name = "q", descriptor = "I")
	private static int anInt4849 = 0;

	@OriginalMember(owner = "client!ip", name = "s", descriptor = "[[I")
	private static final int[][] anIntArrayArray18 = new int[5][5000];

	@OriginalMember(owner = "client!ip", name = "t", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray38 = new String[1000];

	@OriginalMember(owner = "client!ip", name = "u", descriptor = "I")
	private static int anInt4851 = 0;

	@OriginalMember(owner = "client!ip", name = "z", descriptor = "Lclient!jt;")
	public static final Class166 aClass166_25 = new Class166(4);

	@OriginalMember(owner = "client!ip", name = "A", descriptor = "[I")
	private static final int[] anIntArray281 = new int[3];

	@OriginalMember(owner = "client!ip", name = "B", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray39 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ip", name = "C", descriptor = "I")
	private static int anInt4853 = 0;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IZ)V")
	private static void method4192(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class302 local137;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(35) Class302 local35;
		@Pc(13) int local13;
		@Pc(210) Class302 local210;
		@Pc(158) Class302 local158;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt4851 -= 3;
				local13 = anIntArray279[anInt4851];
				local19 = anIntArray279[anInt4851 + 1];
				local25 = anIntArray279[anInt4851 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static386.method4914(local13);
				if (local35.aClass302Array2 == null) {
					local35.aClass302Array2 = new Class302[local25 + 1];
				}
				if (local35.aClass302Array2.length <= local25) {
					@Pc(54) Class302[] local54 = new Class302[local25 + 1];
					for (local56 = 0; local56 < local35.aClass302Array2.length; local56++) {
						local54[local56] = local35.aClass302Array2[local56];
					}
					local35.aClass302Array2 = local54;
				}
				if (local25 > 0 && local35.aClass302Array2[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class302 local99 = new Class302();
				local99.anInt8816 = local19;
				local99.anInt8806 = local99.anInt8838 = local35.anInt8838;
				local99.anInt8834 = local25;
				local35.aClass302Array2[local25] = local99;
				if (arg1) {
					aClass302_32 = local99;
				} else {
					aClass302_33 = local99;
				}
				Static603.method8464(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass302_32 : aClass302_33;
				if (local137.anInt8834 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static386.method4914(local137.anInt8838);
				local158.aClass302Array2[local137.anInt8834] = null;
				Static603.method8464(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static386.method4914(anIntArray279[--anInt4851]);
				local137.aClass302Array2 = null;
				Static603.method8464(local137);
				return;
			}
			if (arg0 == 200) {
				anInt4851 -= 2;
				local13 = anIntArray279[anInt4851];
				local19 = anIntArray279[anInt4851 + 1];
				local210 = Static110.method1816(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray279[anInt4851++] = 1;
					if (arg1) {
						aClass302_32 = local210;
						return;
					}
					aClass302_33 = local210;
					return;
				}
				anIntArray279[anInt4851++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray279[--anInt4851];
				local158 = Static386.method4914(local13);
				if (local158 != null) {
					anIntArray279[anInt4851++] = 1;
					if (arg1) {
						aClass302_32 = local158;
						return;
					}
					aClass302_33 = local158;
					return;
				}
				anIntArray279[anInt4851++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray279[--anInt4851];
				method4194(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray279[--anInt4851];
				method4206(local13);
				return;
			}
		} else {
			@Pc(357) int local357;
			@Pc(420) boolean local420;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt4851 -= 2;
					local13 = anIntArray279[anInt4851];
					local19 = anIntArray279[anInt4851 + 1];
					if (Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aClass12_1 == null) {
						return;
					}
					for (local25 = 0; local25 < Static214.anIntArray246.length; local25++) {
						if (Static214.anIntArray246[local25] == local13) {
							Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aClass12_1.method279(local19, Static195.aClass58_1, local25);
							return;
						}
					}
					for (local357 = 0; local357 < Static639.anIntArray644.length; local357++) {
						if (Static639.anIntArray644[local357] == local13) {
							Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aClass12_1.method279(local19, Static195.aClass58_1, local357);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt4851 -= 2;
					local13 = anIntArray279[anInt4851];
					local19 = anIntArray279[anInt4851 + 1];
					if (Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aClass12_1 == null) {
						return;
					}
					Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aClass12_1.method275(local19, local13);
					return;
				}
				if (arg0 == 410) {
					local420 = anIntArray279[--anInt4851] != 0;
					if (Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aClass12_1 == null) {
						return;
					}
					Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aClass12_1.method274(local420);
					return;
				}
				if (arg0 == 411) {
					anInt4851 -= 2;
					local13 = anIntArray279[anInt4851];
					local19 = anIntArray279[anInt4851 + 1];
					if (Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aClass12_1 == null) {
						return;
					}
					Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aClass12_1.method272(local13, Static266.aClass138_1, local19);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1523) String local1523;
				@Pc(1161) String local1161;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static386.method4914(anIntArray279[--anInt4851]);
					} else {
						local137 = arg1 ? aClass302_32 : aClass302_33;
					}
					if (arg0 == 1100) {
						anInt4851 -= 2;
						local137.anInt8787 = anIntArray279[anInt4851];
						if (local137.anInt8787 > local137.anInt8812 - local137.anInt8801) {
							local137.anInt8787 = local137.anInt8812 - local137.anInt8801;
						}
						if (local137.anInt8787 < 0) {
							local137.anInt8787 = 0;
						}
						local137.anInt8804 = anIntArray279[anInt4851 + 1];
						if (local137.anInt8804 > local137.anInt8813 - local137.anInt8814) {
							local137.anInt8804 = local137.anInt8813 - local137.anInt8814;
						}
						if (local137.anInt8804 < 0) {
							local137.anInt8804 = 0;
						}
						Static603.method8464(local137);
						if (local137.anInt8834 == -1) {
							Static469.method7116(local137.anInt8838);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt8827 = anIntArray279[--anInt4851];
						Static603.method8464(local137);
						if (local137.anInt8834 == -1) {
							Static603.method8465(local137.anInt8838);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean589 = anIntArray279[--anInt4851] == 1;
						Static603.method8464(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt8858 = anIntArray279[--anInt4851];
						Static603.method8464(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt8781 = anIntArray279[--anInt4851];
						Static603.method8464(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray279[--anInt4851];
						if (local137.anInt8848 != local19) {
							local137.anInt8848 = local19;
							Static603.method8464(local137);
						}
						if (local137.anInt8834 == -1) {
							Static71.method1265(local137.anInt8838);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt8824 = anIntArray279[--anInt4851];
						Static603.method8464(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean596 = anIntArray279[--anInt4851] == 1;
						Static603.method8464(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt8823 = 1;
						local137.anInt8871 = anIntArray279[--anInt4851];
						Static603.method8464(local137);
						if (local137.anInt8834 == -1) {
							Static373.method5885(local137.anInt8838);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt4851 -= 6;
						local137.anInt8872 = anIntArray279[anInt4851];
						local137.anInt8842 = anIntArray279[anInt4851 + 1];
						local137.anInt8845 = anIntArray279[anInt4851 + 2];
						local137.anInt8786 = anIntArray279[anInt4851 + 3];
						local137.anInt8788 = anIntArray279[anInt4851 + 4];
						local137.anInt8876 = anIntArray279[anInt4851 + 5];
						Static603.method8464(local137);
						if (local137.anInt8834 == -1) {
							Static318.method5304(local137.anInt8838);
							Static198.method3519(local137.anInt8838);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray279[--anInt4851];
						if (local137.anInt8798 != local19) {
							local137.anInt8798 = local19;
							local137.anInt8841 = 0;
							local137.anInt8785 = 1;
							local137.anInt8836 = 0;
							@Pc(1110) Class21 local1110 = local137.anInt8798 == -1 ? null : Static294.aClass373_2.method8738(local137.anInt8798);
							if (local1110 != null) {
								Static215.method3663(local1110, local137.anInt8841);
							}
							Static603.method8464(local137);
						}
						if (local137.anInt8834 == -1) {
							Static83.method1433(local137.anInt8838);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean599 = anIntArray279[--anInt4851] == 1;
						Static603.method8464(local137);
						return;
					}
					if (arg0 == 1112) {
						local1161 = aStringArray38[--anInt4839];
						if (!local1161.equals(local137.aString105)) {
							local137.aString105 = local1161;
							Static603.method8464(local137);
						}
						if (local137.anInt8834 == -1) {
							Static395.method6363(local137.anInt8838);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt8867 = anIntArray279[--anInt4851];
						Static603.method8464(local137);
						if (local137.anInt8834 == -1) {
							Static626.method8715(local137.anInt8838);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt4851 -= 3;
						local137.anInt8857 = anIntArray279[anInt4851];
						local137.anInt8800 = anIntArray279[anInt4851 + 1];
						local137.anInt8839 = anIntArray279[anInt4851 + 2];
						Static603.method8464(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean597 = anIntArray279[--anInt4851] == 1;
						Static603.method8464(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt8874 = anIntArray279[--anInt4851];
						Static603.method8464(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt8844 = anIntArray279[--anInt4851];
						Static603.method8464(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean585 = anIntArray279[--anInt4851] == 1;
						Static603.method8464(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean586 = anIntArray279[--anInt4851] == 1;
						Static603.method8464(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt4851 -= 2;
						local137.anInt8812 = anIntArray279[anInt4851];
						local137.anInt8813 = anIntArray279[anInt4851 + 1];
						Static603.method8464(local137);
						if (local137.anInt8816 == 0) {
							Static409.method6504(local137, false);
						}
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean595 = anIntArray279[--anInt4851] == 1;
						Static603.method8464(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt8876 = anIntArray279[--anInt4851];
						Static603.method8464(local137);
						if (local137.anInt8834 == -1) {
							Static318.method5304(local137.anInt8838);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray279[--anInt4851];
						local137.aBoolean600 = local19 == 1;
						Static603.method8464(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt4851 -= 2;
						local137.anInt8828 = anIntArray279[anInt4851];
						local137.anInt8830 = anIntArray279[anInt4851 + 1];
						Static603.method8464(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt8821 = anIntArray279[--anInt4851];
						Static603.method8464(local137);
						return;
					}
					@Pc(1489) Class223 local1489;
					if (arg0 == 1127) {
						anInt4851 -= 2;
						local19 = anIntArray279[anInt4851];
						local25 = anIntArray279[anInt4851 + 1];
						local1489 = Static26.aClass179_1.method5148(local19);
						if (local25 != local1489.anInt6887) {
							local137.method7559(local19, local25);
							return;
						}
						local137.method7567(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray279[--anInt4851];
						local1523 = aStringArray38[--anInt4839];
						local1489 = Static26.aClass179_1.method5148(local19);
						if (!local1489.aString83.equals(local1523)) {
							local137.method7566(local19, local1523);
							return;
						}
						local137.method7567(local19);
						return;
					}
					if (arg0 == 1129 || arg0 == 1130) {
						local19 = anIntArray279[--anInt4851];
						if (local137.anInt8816 != 5 && arg0 == 1129 || local137.anInt8816 != 4 && arg0 == 1130) {
							return;
						}
						if (local137.anInt8783 != local19) {
							local137.anInt8783 = local19;
							Static603.method8464(local137);
						}
						if (local137.anInt8834 == -1) {
							Static429.method6718(local137.anInt8838);
						}
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2373) int local2373;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static386.method4914(anIntArray279[--anInt4851]);
						} else {
							local137 = arg1 ? aClass302_32 : aClass302_33;
						}
						if (arg0 == 1300) {
							local19 = anIntArray279[--anInt4851] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method7549(aStringArray38[--anInt4839], local19);
								return;
							}
							anInt4839--;
							return;
						}
						if (arg0 == 1301) {
							anInt4851 -= 2;
							local19 = anIntArray279[anInt4851];
							local25 = anIntArray279[anInt4851 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass302_52 = null;
								return;
							}
							local137.aClass302_52 = Static110.method1816(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray279[--anInt4851];
							if (local19 != Static56.anInt1199 && local19 != Static139.anInt2628 && local19 != Static538.anInt9298) {
								return;
							}
							local137.anInt8803 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt8792 = anIntArray279[--anInt4851];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt8831 = anIntArray279[--anInt4851];
							return;
						}
						if (arg0 == 1305) {
							local137.aString103 = aStringArray38[--anInt4839];
							return;
						}
						if (arg0 == 1306) {
							local137.aString101 = aStringArray38[--anInt4839];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray64 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt8861 = anIntArray279[--anInt4851];
							local137.anInt8865 = anIntArray279[--anInt4851];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray279[--anInt4851];
							local25 = anIntArray279[--anInt4851];
							if (local25 >= 1 && local25 <= 10) {
								local137.method7568(local19, local25 - 1);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString104 = aStringArray38[--anInt4839];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt8809 = anIntArray279[--anInt4851];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt4851 -= 3;
								local19 = anIntArray279[anInt4851] - 1;
								local25 = anIntArray279[anInt4851 + 1];
								local357 = anIntArray279[anInt4851 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt4851 -= 2;
								local19 = 10;
								local25 = anIntArray279[anInt4851];
								local357 = anIntArray279[anInt4851 + 1];
							}
							if (local137.aByteArray99 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray99 = new byte[11];
								local137.aByteArray100 = new byte[11];
								local137.anIntArray548 = new int[11];
							}
							local137.aByteArray99[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean591 = false;
								for (local2373 = 0; local2373 < local137.aByteArray99.length; local2373++) {
									if (local137.aByteArray99[local2373] != 0) {
										local137.aBoolean591 = true;
										break;
									}
								}
							} else {
								local137.aBoolean591 = true;
							}
							local137.aByteArray100[local19] = (byte) local357;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt8859 = anIntArray279[--anInt4851];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static386.method4914(anIntArray279[--anInt4851]);
						} else {
							local137 = arg1 ? aClass302_32 : aClass302_33;
						}
						if (arg0 == 1499) {
							local137.method7551();
							return;
						}
						local1161 = aStringArray38[--anInt4839];
						@Pc(2459) int[] local2459 = null;
						if (local1161.length() > 0 && local1161.charAt(local1161.length() - 1) == 'Y') {
							local357 = anIntArray279[--anInt4851];
							if (local357 > 0) {
								local2459 = new int[local357];
								while (local357-- > 0) {
									local2459[local357] = anIntArray279[--anInt4851];
								}
							}
							local1161 = local1161.substring(0, local1161.length() - 1);
						}
						@Pc(2511) Object[] local2511 = new Object[local1161.length() + 1];
						for (local2373 = local2511.length - 1; local2373 >= 1; local2373--) {
							if (local1161.charAt(local2373 - 1) == 's') {
								local2511[local2373] = aStringArray38[--anInt4839];
							} else {
								local2511[local2373] = Integer.valueOf(anIntArray279[--anInt4851]);
							}
						}
						local56 = anIntArray279[--anInt4851];
						if (local56 == -1) {
							local2511 = null;
						} else {
							local2511[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray24 = local2511;
						} else if (arg0 == 1401) {
							local137.anObjectArray3 = local2511;
						} else if (arg0 == 1402) {
							local137.anObjectArray14 = local2511;
						} else if (arg0 == 1403) {
							local137.anObjectArray27 = local2511;
						} else if (arg0 == 1404) {
							local137.anObjectArray31 = local2511;
						} else if (arg0 == 1405) {
							local137.anObjectArray19 = local2511;
						} else if (arg0 == 1406) {
							local137.anObjectArray26 = local2511;
						} else if (arg0 == 1407) {
							local137.anObjectArray11 = local2511;
							local137.anIntArray551 = local2459;
						} else if (arg0 == 1408) {
							local137.anObjectArray30 = local2511;
						} else if (arg0 == 1409) {
							local137.anObjectArray15 = local2511;
						} else if (arg0 == 1410) {
							local137.anObjectArray16 = local2511;
						} else if (arg0 == 1411) {
							local137.anObjectArray18 = local2511;
						} else if (arg0 == 1412) {
							local137.anObjectArray6 = local2511;
						} else if (arg0 == 1414) {
							local137.lb = local2511;
							local137.anIntArray547 = local2459;
						} else if (arg0 == 1415) {
							local137.anObjectArray2 = local2511;
							local137.anIntArray544 = local2459;
						} else if (arg0 == 1416) {
							local137.anObjectArray13 = local2511;
						} else if (arg0 == 1417) {
							local137.anObjectArray20 = local2511;
						} else if (arg0 == 1418) {
							local137.anObjectArray5 = local2511;
						} else if (arg0 == 1419) {
							local137.anObjectArray9 = local2511;
						} else if (arg0 == 1420) {
							local137.anObjectArray4 = local2511;
						} else if (arg0 == 1421) {
							local137.anObjectArray17 = local2511;
						} else if (arg0 == 1422) {
							local137.anObjectArray12 = local2511;
						} else if (arg0 == 1423) {
							local137.anObjectArray22 = local2511;
						} else if (arg0 == 1424) {
							local137.anObjectArray7 = local2511;
						} else if (arg0 == 1425) {
							local137.anObjectArray23 = local2511;
						} else if (arg0 == 1426) {
							local137.anObjectArray8 = local2511;
						} else if (arg0 == 1427) {
							local137.anObjectArray28 = local2511;
						} else if (arg0 == 1428) {
							local137.anObjectArray10 = local2511;
							local137.anIntArray543 = local2459;
						} else if (arg0 == 1429) {
							local137.anObjectArray21 = local2511;
							local137.anIntArray546 = local2459;
						} else if (arg0 == 1430) {
							local137.anObjectArray25 = local2511;
						}
						local137.aBoolean592 = true;
						return;
					} else if (arg0 < 1600) {
						local137 = arg1 ? aClass302_32 : aClass302_33;
						if (arg0 == 1500) {
							anIntArray279[anInt4851++] = local137.anInt8866;
							return;
						}
						if (arg0 == 1501) {
							anIntArray279[anInt4851++] = local137.anInt8854;
							return;
						}
						if (arg0 == 1502) {
							anIntArray279[anInt4851++] = local137.anInt8801;
							return;
						}
						if (arg0 == 1503) {
							anIntArray279[anInt4851++] = local137.anInt8814;
							return;
						}
						if (arg0 == 1504) {
							anIntArray279[anInt4851++] = local137.aBoolean601 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray279[anInt4851++] = local137.anInt8806;
							return;
						}
						if (arg0 == 1506) {
							local158 = Static129.method2117(local137);
							anIntArray279[anInt4851++] = local158 == null ? -1 : local158.anInt8838;
							return;
						}
					} else {
						@Pc(3107) Class223 local3107;
						if (arg0 < 1700) {
							local137 = arg1 ? aClass302_32 : aClass302_33;
							if (arg0 == 1600) {
								anIntArray279[anInt4851++] = local137.anInt8787;
								return;
							}
							if (arg0 == 1601) {
								anIntArray279[anInt4851++] = local137.anInt8804;
								return;
							}
							if (arg0 == 1602) {
								aStringArray38[anInt4839++] = local137.aString105;
								return;
							}
							if (arg0 == 1603) {
								anIntArray279[anInt4851++] = local137.anInt8812;
								return;
							}
							if (arg0 == 1604) {
								anIntArray279[anInt4851++] = local137.anInt8813;
								return;
							}
							if (arg0 == 1605) {
								anIntArray279[anInt4851++] = local137.anInt8876;
								return;
							}
							if (arg0 == 1606) {
								anIntArray279[anInt4851++] = local137.anInt8845;
								return;
							}
							if (arg0 == 1607) {
								anIntArray279[anInt4851++] = local137.anInt8788;
								return;
							}
							if (arg0 == 1608) {
								anIntArray279[anInt4851++] = local137.anInt8786;
								return;
							}
							if (arg0 == 1609) {
								anIntArray279[anInt4851++] = local137.anInt8858;
								return;
							}
							if (arg0 == 1610) {
								anIntArray279[anInt4851++] = local137.anInt8872;
								return;
							}
							if (arg0 == 1611) {
								anIntArray279[anInt4851++] = local137.anInt8842;
								return;
							}
							if (arg0 == 1612) {
								anIntArray279[anInt4851++] = local137.anInt8848;
								return;
							}
							if (arg0 == 1613) {
								local19 = anIntArray279[--anInt4851];
								local3107 = Static26.aClass179_1.method5148(local19);
								if (local3107.method5911()) {
									aStringArray38[anInt4839++] = local137.method7564(local19, local3107.aString83);
									return;
								}
								anIntArray279[anInt4851++] = local137.method7557(local3107.anInt6887, local19);
								return;
							}
							if (arg0 == 1614) {
								anIntArray279[anInt4851++] = local137.anInt8824;
								return;
							}
							if (arg0 == 2614) {
								anIntArray279[anInt4851++] = local137.anInt8823 == 1 ? local137.anInt8871 : -1;
								return;
							}
						} else if (arg0 < 1800) {
							local137 = arg1 ? aClass302_32 : aClass302_33;
							if (arg0 == 1700) {
								anIntArray279[anInt4851++] = local137.anInt8877;
								return;
							}
							if (arg0 == 1701) {
								if (local137.anInt8877 != -1) {
									anIntArray279[anInt4851++] = local137.anInt8808;
									return;
								}
								anIntArray279[anInt4851++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray279[anInt4851++] = local137.anInt8834;
								return;
							}
						} else if (arg0 < 1900) {
							local137 = arg1 ? aClass302_32 : aClass302_33;
							if (arg0 == 1800) {
								anIntArray279[anInt4851++] = Static78.method1364(local137).method8147();
								return;
							}
							if (arg0 == 1801) {
								local19 = anIntArray279[--anInt4851];
								local19--;
								if (local137.aStringArray64 != null && local19 < local137.aStringArray64.length && local137.aStringArray64[local19] != null) {
									aStringArray38[anInt4839++] = local137.aStringArray64[local19];
									return;
								}
								aStringArray38[anInt4839++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local137.aString103 == null) {
									aStringArray38[anInt4839++] = "";
									return;
								}
								aStringArray38[anInt4839++] = local137.aString103;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local137 = Static386.method4914(anIntArray279[--anInt4851]);
								arg0 -= 1000;
							} else {
								local137 = arg1 ? aClass302_32 : aClass302_33;
							}
							if (anInt4853 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local137.anObjectArray28 == null) {
									return;
								}
								@Pc(3376) Class6_Sub10 local3376 = new Class6_Sub10();
								local3376.aClass302_14 = local137;
								local3376.anObjectArray1 = local137.anObjectArray28;
								local3376.anInt1853 = anInt4853 + 1;
								Static218.aClass8_26.method157(local3376);
								return;
							}
						} else if (arg0 < 2600) {
							local137 = Static386.method4914(anIntArray279[--anInt4851]);
							if (arg0 == 2500) {
								anIntArray279[anInt4851++] = local137.anInt8866;
								return;
							}
							if (arg0 == 2501) {
								anIntArray279[anInt4851++] = local137.anInt8854;
								return;
							}
							if (arg0 == 2502) {
								anIntArray279[anInt4851++] = local137.anInt8801;
								return;
							}
							if (arg0 == 2503) {
								anIntArray279[anInt4851++] = local137.anInt8814;
								return;
							}
							if (arg0 == 2504) {
								anIntArray279[anInt4851++] = local137.aBoolean601 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray279[anInt4851++] = local137.anInt8806;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static129.method2117(local137);
								anIntArray279[anInt4851++] = local158 == null ? -1 : local158.anInt8838;
								return;
							}
						} else if (arg0 < 2700) {
							local137 = Static386.method4914(anIntArray279[--anInt4851]);
							if (arg0 == 2600) {
								anIntArray279[anInt4851++] = local137.anInt8787;
								return;
							}
							if (arg0 == 2601) {
								anIntArray279[anInt4851++] = local137.anInt8804;
								return;
							}
							if (arg0 == 2602) {
								aStringArray38[anInt4839++] = local137.aString105;
								return;
							}
							if (arg0 == 2603) {
								anIntArray279[anInt4851++] = local137.anInt8812;
								return;
							}
							if (arg0 == 2604) {
								anIntArray279[anInt4851++] = local137.anInt8813;
								return;
							}
							if (arg0 == 2605) {
								anIntArray279[anInt4851++] = local137.anInt8876;
								return;
							}
							if (arg0 == 2606) {
								anIntArray279[anInt4851++] = local137.anInt8845;
								return;
							}
							if (arg0 == 2607) {
								anIntArray279[anInt4851++] = local137.anInt8788;
								return;
							}
							if (arg0 == 2608) {
								anIntArray279[anInt4851++] = local137.anInt8786;
								return;
							}
							if (arg0 == 2609) {
								anIntArray279[anInt4851++] = local137.anInt8858;
								return;
							}
							if (arg0 == 2610) {
								anIntArray279[anInt4851++] = local137.anInt8872;
								return;
							}
							if (arg0 == 2611) {
								anIntArray279[anInt4851++] = local137.anInt8842;
								return;
							}
							if (arg0 == 2612) {
								anIntArray279[anInt4851++] = local137.anInt8848;
								return;
							}
							if (arg0 == 2613) {
								anIntArray279[anInt4851++] = local137.anInt8824;
								return;
							}
							if (arg0 == 2614) {
								anIntArray279[anInt4851++] = local137.anInt8823 == 1 ? local137.anInt8871 : -1;
								return;
							}
						} else {
							@Pc(3905) Class6_Sub29 local3905;
							@Pc(3803) Class6_Sub29 local3803;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local137 = Static386.method4914(anIntArray279[--anInt4851]);
									anIntArray279[anInt4851++] = local137.anInt8877;
									return;
								}
								if (arg0 == 2701) {
									local137 = Static386.method4914(anIntArray279[--anInt4851]);
									if (local137.anInt8877 != -1) {
										anIntArray279[anInt4851++] = local137.anInt8808;
										return;
									}
									anIntArray279[anInt4851++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local13 = anIntArray279[--anInt4851];
									local3803 = (Class6_Sub29) Static507.aClass128_42.method3560((long) local13);
									if (local3803 != null) {
										anIntArray279[anInt4851++] = 1;
										return;
									}
									anIntArray279[anInt4851++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local137 = Static386.method4914(anIntArray279[--anInt4851]);
									if (local137.aClass302Array2 == null) {
										anIntArray279[anInt4851++] = 0;
										return;
									}
									local19 = local137.aClass302Array2.length;
									for (local25 = 0; local25 < local137.aClass302Array2.length; local25++) {
										if (local137.aClass302Array2[local25] == null) {
											local19 = local25;
											break;
										}
									}
									anIntArray279[anInt4851++] = local19;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt4851 -= 2;
									local13 = anIntArray279[anInt4851];
									local19 = anIntArray279[anInt4851 + 1];
									local3905 = (Class6_Sub29) Static507.aClass128_42.method3560((long) local13);
									if (local3905 != null && local3905.anInt6361 == local19) {
										anIntArray279[anInt4851++] = 1;
										return;
									}
									anIntArray279[anInt4851++] = 0;
									return;
								}
							} else if (arg0 < 2900) {
								local137 = Static386.method4914(anIntArray279[--anInt4851]);
								if (arg0 == 2800) {
									anIntArray279[anInt4851++] = Static78.method1364(local137).method8147();
									return;
								}
								if (arg0 == 2801) {
									local19 = anIntArray279[--anInt4851];
									local19--;
									if (local137.aStringArray64 != null && local19 < local137.aStringArray64.length && local137.aStringArray64[local19] != null) {
										aStringArray38[anInt4839++] = local137.aStringArray64[local19];
										return;
									}
									aStringArray38[anInt4839++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local137.aString103 == null) {
										aStringArray38[anInt4839++] = "";
										return;
									}
									aStringArray38[anInt4839++] = local137.aString103;
									return;
								}
							} else {
								@Pc(4042) String local4042;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local4042 = aStringArray38[--anInt4839];
										Static587.method8269(local4042);
										return;
									}
									if (arg0 == 3101) {
										anInt4851 -= 2;
										Static347.method5618(Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1, anIntArray279[anInt4851], anIntArray279[anInt4851 + 1]);
										return;
									}
									if (arg0 == 3103) {
										Static320.method5325();
										return;
									}
									if (arg0 == 3104) {
										local4042 = aStringArray38[--anInt4839];
										local19 = 0;
										if (Static511.method7587(local4042)) {
											local19 = Static355.method5682(local4042);
										}
										@Pc(4102) Class6_Sub9 local4102 = Static560.method8089(Static391.aClass126_1, Static356.aClass208_59);
										local4102.aClass6_Sub40_Sub2_1.method8554(local19);
										Static263.method4681(local4102);
										return;
									}
									@Pc(4131) Class6_Sub9 local4131;
									if (arg0 == 3105) {
										local4042 = aStringArray38[--anInt4839];
										local4131 = Static560.method8089(Static391.aClass126_1, Static10.aClass208_4);
										local4131.aClass6_Sub40_Sub2_1.method8589(local4042.length() + 1);
										local4131.aClass6_Sub40_Sub2_1.method8551(local4042);
										Static263.method4681(local4131);
										return;
									}
									if (arg0 == 3106) {
										local4042 = aStringArray38[--anInt4839];
										local4131 = Static560.method8089(Static391.aClass126_1, Static480.aClass208_71);
										local4131.aClass6_Sub40_Sub2_1.method8589(local4042.length() + 1);
										local4131.aClass6_Sub40_Sub2_1.method8551(local4042);
										Static263.method4681(local4131);
										return;
									}
									if (arg0 == 3107) {
										local13 = anIntArray279[--anInt4851];
										local1161 = aStringArray38[--anInt4839];
										Static548.method7967(local1161, local13);
										return;
									}
									if (arg0 == 3108) {
										anInt4851 -= 3;
										local13 = anIntArray279[anInt4851];
										local19 = anIntArray279[anInt4851 + 1];
										local25 = anIntArray279[anInt4851 + 2];
										local35 = Static386.method4914(local25);
										Static288.method5010(local35, local19, local13);
										return;
									}
									if (arg0 == 3109) {
										anInt4851 -= 2;
										local13 = anIntArray279[anInt4851];
										local19 = anIntArray279[anInt4851 + 1];
										local210 = arg1 ? aClass302_32 : aClass302_33;
										Static288.method5010(local210, local19, local13);
										return;
									}
									if (arg0 == 3110) {
										local13 = anIntArray279[--anInt4851];
										local4131 = Static560.method8089(Static391.aClass126_1, Static357.aClass208_14);
										local4131.aClass6_Sub40_Sub2_1.method8561(local13);
										Static263.method4681(local4131);
										return;
									}
									if (arg0 == 3111) {
										anInt4851 -= 2;
										local13 = anIntArray279[anInt4851];
										local19 = anIntArray279[anInt4851 + 1];
										local3905 = (Class6_Sub29) Static507.aClass128_42.method3560((long) local13);
										if (local3905 != null) {
											Static221.method3774(true, local3905, local3905.anInt6361 != local19);
										}
										Static134.method2183(3, true, local13, local19);
										return;
									}
									if (arg0 == 3112) {
										anInt4851--;
										local13 = anIntArray279[anInt4851];
										local3803 = (Class6_Sub29) Static507.aClass128_42.method3560((long) local13);
										if (local3803 != null && local3803.anInt6363 == 3) {
											Static221.method3774(true, local3803, true);
										}
										return;
									}
									if (arg0 == 3113) {
										Static195.method3465(aStringArray38[--anInt4839]);
										return;
									}
									if (arg0 == 3114) {
										anInt4851 -= 2;
										local13 = anIntArray279[anInt4851];
										local19 = anIntArray279[anInt4851 + 1];
										local1523 = aStringArray38[--anInt4839];
										Static145.method2337(local19, "", local1523, local13, "", "");
										return;
									}
									if (arg0 == 3115) {
										anInt4851 -= 11;
										@Pc(4432) Class238[] local4432 = Static613.method8515();
										@Pc(4435) Class79[] local4435 = Static23.method3614();
										Static431.method6734(anIntArray279[anInt4851 + 8], local4432[anIntArray279[anInt4851]], anIntArray279[anInt4851 + 6], anIntArray279[anInt4851 + 2], anIntArray279[anInt4851 + 5], anIntArray279[anInt4851 + 10], anIntArray279[anInt4851 + 7], anIntArray279[anInt4851 + 3], local4435[anIntArray279[anInt4851 + 1]], anIntArray279[anInt4851 + 4], anIntArray279[anInt4851 + 9]);
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt4851 -= 3;
										Static513.method7613(256, 255, anIntArray279[anInt4851], anIntArray279[anInt4851 + 1], anIntArray279[anInt4851 + 2]);
										return;
									}
									if (arg0 == 3201) {
										Static333.method8039(255, anIntArray279[--anInt4851], 50);
										return;
									}
									if (arg0 == 3202) {
										anInt4851 -= 2;
										Static146.method4832(anIntArray279[anInt4851 + 1], 255, anIntArray279[anInt4851]);
										return;
									}
									if (arg0 == 3203) {
										anInt4851 -= 4;
										Static513.method7613(256, anIntArray279[anInt4851 + 3], anIntArray279[anInt4851], anIntArray279[anInt4851 + 1], anIntArray279[anInt4851 + 2]);
										return;
									}
									if (arg0 == 3204) {
										anInt4851 -= 3;
										Static333.method8039(anIntArray279[anInt4851 + 1], anIntArray279[anInt4851], anIntArray279[anInt4851 + 2]);
										return;
									}
									if (arg0 == 3205) {
										anInt4851 -= 3;
										Static146.method4832(anIntArray279[anInt4851 + 1], anIntArray279[anInt4851 + 2], anIntArray279[anInt4851]);
										return;
									}
									if (arg0 == 3206) {
										anInt4851 -= 4;
										Static4.method7049(256, false, anIntArray279[anInt4851 + 2], anIntArray279[anInt4851], anIntArray279[anInt4851 + 3], anIntArray279[anInt4851 + 1]);
										return;
									}
									if (arg0 == 3207) {
										anInt4851 -= 4;
										Static4.method7049(256, true, anIntArray279[anInt4851 + 2], anIntArray279[anInt4851], anIntArray279[anInt4851 + 3], anIntArray279[anInt4851 + 1]);
										return;
									}
									if (arg0 == 3208) {
										anInt4851 -= 5;
										Static513.method7613(anIntArray279[anInt4851 + 4], anIntArray279[anInt4851 + 3], anIntArray279[anInt4851], anIntArray279[anInt4851 + 1], anIntArray279[anInt4851 + 2]);
										return;
									}
									if (arg0 == 3209) {
										anInt4851 -= 5;
										Static4.method7049(anIntArray279[anInt4851 + 4], false, anIntArray279[anInt4851 + 2], anIntArray279[anInt4851], anIntArray279[anInt4851 + 3], anIntArray279[anInt4851 + 1]);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray279[anInt4851++] = Static113.anInt2243;
										return;
									}
									if (arg0 == 3301) {
										anInt4851 -= 2;
										local13 = anIntArray279[anInt4851];
										local19 = anIntArray279[anInt4851 + 1];
										anIntArray279[anInt4851++] = Static462.method7053(local13, local19, false);
										return;
									}
									if (arg0 == 3302) {
										anInt4851 -= 2;
										local13 = anIntArray279[anInt4851];
										local19 = anIntArray279[anInt4851 + 1];
										anIntArray279[anInt4851++] = Static363.method5757(local13, local19, false);
										return;
									}
									if (arg0 == 3303) {
										anInt4851 -= 2;
										local13 = anIntArray279[anInt4851];
										local19 = anIntArray279[anInt4851 + 1];
										anIntArray279[anInt4851++] = Static201.method3543(local13, false, local19);
										return;
									}
									if (arg0 == 3304) {
										local13 = anIntArray279[--anInt4851];
										anIntArray279[anInt4851++] = Static485.aClass265_1.method6938(local13).anInt8760;
										return;
									}
									if (arg0 == 3305) {
										local13 = anIntArray279[--anInt4851];
										anIntArray279[anInt4851++] = Static242.anIntArray277[local13];
										return;
									}
									if (arg0 == 3306) {
										local13 = anIntArray279[--anInt4851];
										anIntArray279[anInt4851++] = Static287.anIntArray534[local13];
										return;
									}
									if (arg0 == 3307) {
										local13 = anIntArray279[--anInt4851];
										anIntArray279[anInt4851++] = Static451.anIntArray512[local13];
										return;
									}
									if (arg0 == 3308) {
										@Pc(4960) byte local4960 = Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aByte131;
										local19 = (Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10725 >> 9) + Static606.anInt8651;
										local25 = (Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10729 >> 9) + Static195.anInt3961;
										anIntArray279[anInt4851++] = (local4960 << 28) + (local19 << 14) + local25;
										return;
									}
									if (arg0 == 3309) {
										local13 = anIntArray279[--anInt4851];
										anIntArray279[anInt4851++] = local13 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local13 = anIntArray279[--anInt4851];
										anIntArray279[anInt4851++] = local13 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local13 = anIntArray279[--anInt4851];
										anIntArray279[anInt4851++] = local13 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray279[anInt4851++] = Static265.aBoolean260 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt4851 -= 2;
										local13 = anIntArray279[anInt4851];
										local19 = anIntArray279[anInt4851 + 1];
										anIntArray279[anInt4851++] = Static462.method7053(local13, local19, true);
										return;
									}
									if (arg0 == 3314) {
										anInt4851 -= 2;
										local13 = anIntArray279[anInt4851];
										local19 = anIntArray279[anInt4851 + 1];
										anIntArray279[anInt4851++] = Static363.method5757(local13, local19, true);
										return;
									}
									if (arg0 == 3315) {
										anInt4851 -= 2;
										local13 = anIntArray279[anInt4851];
										local19 = anIntArray279[anInt4851 + 1];
										anIntArray279[anInt4851++] = Static201.method3543(local13, true, local19);
										return;
									}
									if (arg0 == 3316) {
										if (Static578.anInt6641 >= 2) {
											anIntArray279[anInt4851++] = Static578.anInt6641;
											return;
										}
										anIntArray279[anInt4851++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray279[anInt4851++] = Static328.anInt6241;
										return;
									}
									if (arg0 == 3318) {
										anIntArray279[anInt4851++] = Static315.aClass56_4.anInt1712;
										return;
									}
									if (arg0 == 3321) {
										anIntArray279[anInt4851++] = Static223.anInt4363;
										return;
									}
									if (arg0 == 3322) {
										anIntArray279[anInt4851++] = Static587.anInt9803;
										return;
									}
									if (arg0 == 3323) {
										if (Static616.anInt10722 >= 5 && Static616.anInt10722 <= 9) {
											anIntArray279[anInt4851++] = 1;
											return;
										}
										anIntArray279[anInt4851++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static616.anInt10722 >= 5 && Static616.anInt10722 <= 9) {
											anIntArray279[anInt4851++] = Static616.anInt10722;
											return;
										}
										anIntArray279[anInt4851++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray279[anInt4851++] = Static447.aBoolean546 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray279[anInt4851++] = Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt1210;
										return;
									}
									if (arg0 == 3327) {
										anIntArray279[anInt4851++] = Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aClass12_1 != null && Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aClass12_1.aBoolean7 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray279[anInt4851++] = Static441.aBoolean530 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local13 = anIntArray279[--anInt4851];
										anIntArray279[anInt4851++] = Static567.method8131(local13);
										return;
									}
									if (arg0 == 3331) {
										anInt4851 -= 2;
										local13 = anIntArray279[anInt4851];
										local19 = anIntArray279[anInt4851 + 1];
										anIntArray279[anInt4851++] = Static593.method8342(local19, false, local13);
										return;
									}
									if (arg0 == 3332) {
										anInt4851 -= 2;
										local13 = anIntArray279[anInt4851];
										local19 = anIntArray279[anInt4851 + 1];
										anIntArray279[anInt4851++] = Static593.method8342(local19, true, local13);
										return;
									}
									if (arg0 == 3333) {
										anIntArray279[anInt4851++] = Static19.anInt323;
										return;
									}
									if (arg0 == 3335) {
										anIntArray279[anInt4851++] = Static307.anInt5931;
										return;
									}
									if (arg0 == 3336) {
										anInt4851 -= 4;
										local13 = anIntArray279[anInt4851];
										local19 = anIntArray279[anInt4851 + 1];
										local25 = anIntArray279[anInt4851 + 2];
										local357 = anIntArray279[anInt4851 + 3];
										local13 += local19 << 14;
										local13 += local25 << 28;
										local13 += local357;
										anIntArray279[anInt4851++] = local13;
										return;
									}
									if (arg0 == 3337) {
										anIntArray279[anInt4851++] = Static364.anInt6726;
										return;
									}
									if (arg0 == 3338) {
										anIntArray279[anInt4851++] = Static175.method3218();
										return;
									}
									if (arg0 == 3339) {
										anIntArray279[anInt4851++] = 0;
										return;
									}
									if (arg0 == 3340) {
										anIntArray279[anInt4851++] = Static399.aBoolean503 ? 1 : 0;
										return;
									}
									if (arg0 == 3341) {
										anIntArray279[anInt4851++] = Static217.aBoolean305 ? 1 : 0;
										return;
									}
									if (arg0 == 3342) {
										anIntArray279[anInt4851++] = Static429.aClass71_1.method7701();
										return;
									}
									if (arg0 == 3343) {
										anIntArray279[anInt4851++] = Static429.aClass71_1.method7702();
										return;
									}
									if (arg0 == 3344) {
										aStringArray38[anInt4839++] = Static340.method5771();
										return;
									}
									if (arg0 == 3345) {
										aStringArray38[anInt4839++] = Static555.method8012();
										return;
									}
									if (arg0 == 3346) {
										anIntArray279[anInt4851++] = Static10.method214();
										return;
									}
									if (arg0 == 3347) {
										anIntArray279[anInt4851++] = Static495.anInt8594;
										return;
									}
									if (arg0 == 3349) {
										anIntArray279[anInt4851++] = Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aClass278_7.method7147() >> 3;
										return;
									}
								} else if (arg0 < 3500) {
									@Pc(5711) Class281 local5711;
									if (arg0 == 3400) {
										anInt4851 -= 2;
										local13 = anIntArray279[anInt4851];
										local19 = anIntArray279[anInt4851 + 1];
										local5711 = Static443.aClass59_1.method1520(local13);
										aStringArray38[anInt4839++] = local5711.method7164(local19);
										return;
									}
									if (arg0 == 3408) {
										anInt4851 -= 4;
										local13 = anIntArray279[anInt4851];
										local19 = anIntArray279[anInt4851 + 1];
										local25 = anIntArray279[anInt4851 + 2];
										local357 = anIntArray279[anInt4851 + 3];
										@Pc(5757) Class281 local5757 = Static443.aClass59_1.method1520(local25);
										if (local5757.aChar4 == local13 && local5757.aChar5 == local19) {
											if (local19 == 115) {
												aStringArray38[anInt4839++] = local5757.method7164(local357);
												return;
											}
											anIntArray279[anInt4851++] = local5757.method7172(local357);
											return;
										}
										throw new RuntimeException("C3408-1 " + local25 + "-" + local357);
									}
									if (arg0 == 3409) {
										anInt4851 -= 3;
										local13 = anIntArray279[anInt4851];
										local19 = anIntArray279[anInt4851 + 1];
										local25 = anIntArray279[anInt4851 + 2];
										if (local19 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(5843) Class281 local5843 = Static443.aClass59_1.method1520(local19);
										if (local5843.aChar5 != local13) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray279[anInt4851++] = local5843.method7169(local25) ? 1 : 0;
										return;
									}
									if (arg0 == 3410) {
										local13 = anIntArray279[--anInt4851];
										local1161 = aStringArray38[--anInt4839];
										if (local13 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local5711 = Static443.aClass59_1.method1520(local13);
										if (local5711.aChar5 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray279[anInt4851++] = local5711.method7167(local1161) ? 1 : 0;
										return;
									}
									if (arg0 == 3411) {
										local13 = anIntArray279[--anInt4851];
										@Pc(5941) Class281 local5941 = Static443.aClass59_1.method1520(local13);
										anIntArray279[anInt4851++] = local5941.aClass128_37.method3554();
										return;
									}
								} else if (arg0 < 3700) {
									if (arg0 == 3600) {
										if (Static579.anInt9657 == 0) {
											anIntArray279[anInt4851++] = -2;
											return;
										}
										if (Static579.anInt9657 == 1) {
											anIntArray279[anInt4851++] = -1;
											return;
										}
										anIntArray279[anInt4851++] = Static60.anInt1289;
										return;
									}
									if (arg0 == 3601) {
										local13 = anIntArray279[--anInt4851];
										if (Static579.anInt9657 == 2 && local13 < Static60.anInt1289) {
											aStringArray38[anInt4839++] = Static123.aStringArray27[local13];
											if (Static447.aStringArray56[local13] != null) {
												aStringArray38[anInt4839++] = Static447.aStringArray56[local13];
												return;
											}
											aStringArray38[anInt4839++] = "";
											return;
										}
										aStringArray38[anInt4839++] = "";
										aStringArray38[anInt4839++] = "";
										return;
									}
									if (arg0 == 3602) {
										local13 = anIntArray279[--anInt4851];
										if (Static579.anInt9657 == 2 && local13 < Static60.anInt1289) {
											anIntArray279[anInt4851++] = Static253.anIntArray289[local13];
											return;
										}
										anIntArray279[anInt4851++] = 0;
										return;
									}
									if (arg0 == 3603) {
										local13 = anIntArray279[--anInt4851];
										if (Static579.anInt9657 == 2 && local13 < Static60.anInt1289) {
											anIntArray279[anInt4851++] = Static208.anIntArray243[local13];
											return;
										}
										anIntArray279[anInt4851++] = 0;
										return;
									}
									if (arg0 == 3604) {
										local4042 = aStringArray38[--anInt4839];
										local19 = anIntArray279[--anInt4851];
										Static39.method757(local19, local4042);
										return;
									}
									if (arg0 == 3605) {
										local4042 = aStringArray38[--anInt4839];
										Static628.method8722(local4042);
										return;
									}
									if (arg0 == 3606) {
										local4042 = aStringArray38[--anInt4839];
										Static11.method217(local4042);
										return;
									}
									if (arg0 == 3607) {
										local4042 = aStringArray38[--anInt4839];
										Static255.method4578(local4042, false);
										return;
									}
									if (arg0 == 3608) {
										local4042 = aStringArray38[--anInt4839];
										Static275.method4850(local4042);
										return;
									}
									if (arg0 == 3609) {
										local4042 = aStringArray38[--anInt4839];
										if (local4042.startsWith("<img=0>") || local4042.startsWith("<img=1>")) {
											local4042 = local4042.substring(7);
										}
										anIntArray279[anInt4851++] = Static312.method5230(local4042) ? 1 : 0;
										return;
									}
									if (arg0 == 3610) {
										local13 = anIntArray279[--anInt4851];
										if (Static579.anInt9657 == 2 && local13 < Static60.anInt1289) {
											aStringArray38[anInt4839++] = Static333.aStringArray67[local13];
											return;
										}
										aStringArray38[anInt4839++] = "";
										return;
									}
									if (arg0 == 3611) {
										if (Static594.aString110 != null) {
											aStringArray38[anInt4839++] = Static317.method5301(Static594.aString110);
											return;
										}
										aStringArray38[anInt4839++] = "";
										return;
									}
									if (arg0 == 3612) {
										if (Static594.aString110 != null) {
											anIntArray279[anInt4851++] = Static301.anInt5871;
											return;
										}
										anIntArray279[anInt4851++] = 0;
										return;
									}
									if (arg0 == 3613) {
										local13 = anIntArray279[--anInt4851];
										if (Static594.aString110 != null && local13 < Static301.anInt5871) {
											aStringArray38[anInt4839++] = Static635.aClass17Array3[local13].aString5;
											return;
										}
										aStringArray38[anInt4839++] = "";
										return;
									}
									if (arg0 == 3614) {
										local13 = anIntArray279[--anInt4851];
										if (Static594.aString110 != null && local13 < Static301.anInt5871) {
											anIntArray279[anInt4851++] = Static635.aClass17Array3[local13].anInt327;
											return;
										}
										anIntArray279[anInt4851++] = 0;
										return;
									}
									if (arg0 == 3615) {
										local13 = anIntArray279[--anInt4851];
										if (Static594.aString110 != null && local13 < Static301.anInt5871) {
											anIntArray279[anInt4851++] = Static635.aClass17Array3[local13].aByte1;
											return;
										}
										anIntArray279[anInt4851++] = 0;
										return;
									}
									if (arg0 == 3616) {
										anIntArray279[anInt4851++] = Static165.aByte53;
										return;
									}
									if (arg0 == 3617) {
										local4042 = aStringArray38[--anInt4839];
										Static317.method5297(local4042);
										return;
									}
									if (arg0 == 3618) {
										anIntArray279[anInt4851++] = Static642.aByte128;
										return;
									}
									if (arg0 == 3619) {
										local4042 = aStringArray38[--anInt4839];
										Static101.method1631(local4042);
										return;
									}
									if (arg0 == 3620) {
										Static336.method5500();
										return;
									}
									if (arg0 == 3621) {
										if (Static579.anInt9657 == 0) {
											anIntArray279[anInt4851++] = -1;
											return;
										}
										anIntArray279[anInt4851++] = Static463.anInt8194;
										return;
									}
									if (arg0 == 3622) {
										local13 = anIntArray279[--anInt4851];
										if (Static579.anInt9657 != 0 && local13 < Static463.anInt8194) {
											aStringArray38[anInt4839++] = Static530.aStringArray60[local13];
											if (Static622.aStringArray74[local13] != null) {
												aStringArray38[anInt4839++] = Static622.aStringArray74[local13];
												return;
											}
											aStringArray38[anInt4839++] = "";
											return;
										}
										aStringArray38[anInt4839++] = "";
										aStringArray38[anInt4839++] = "";
										return;
									}
									if (arg0 == 3623) {
										local4042 = aStringArray38[--anInt4839];
										if (local4042.startsWith("<img=0>") || local4042.startsWith("<img=1>")) {
											local4042 = local4042.substring(7);
										}
										anIntArray279[anInt4851++] = Static407.method5571(local4042) ? 1 : 0;
										return;
									}
									if (arg0 == 3624) {
										local13 = anIntArray279[--anInt4851];
										if (Static635.aClass17Array3 != null && local13 < Static301.anInt5871 && Static635.aClass17Array3[local13].aString4.equalsIgnoreCase(Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aString12)) {
											anIntArray279[anInt4851++] = 1;
											return;
										}
										anIntArray279[anInt4851++] = 0;
										return;
									}
									if (arg0 == 3625) {
										if (Static64.aString116 != null) {
											aStringArray38[anInt4839++] = Static64.aString116;
											return;
										}
										aStringArray38[anInt4839++] = "";
										return;
									}
									if (arg0 == 3626) {
										local13 = anIntArray279[--anInt4851];
										if (Static594.aString110 != null && local13 < Static301.anInt5871) {
											aStringArray38[anInt4839++] = Static635.aClass17Array3[local13].aString3;
											return;
										}
										aStringArray38[anInt4839++] = "";
										return;
									}
									if (arg0 == 3627) {
										local13 = anIntArray279[--anInt4851];
										if (Static579.anInt9657 == 2 && local13 >= 0 && local13 < Static60.anInt1289) {
											anIntArray279[anInt4851++] = Static592.aBooleanArray54[local13] ? 1 : 0;
											return;
										}
										anIntArray279[anInt4851++] = 0;
										return;
									}
									if (arg0 == 3628) {
										local4042 = aStringArray38[--anInt4839];
										if (local4042.startsWith("<img=0>") || local4042.startsWith("<img=1>")) {
											local4042 = local4042.substring(7);
										}
										anIntArray279[anInt4851++] = Static276.method4854(local4042);
										return;
									}
									if (arg0 == 3629) {
										anIntArray279[anInt4851++] = Static195.anInt3958;
										return;
									}
									if (arg0 == 3630) {
										local4042 = aStringArray38[--anInt4839];
										Static255.method4578(local4042, true);
										return;
									}
									if (arg0 == 3631) {
										local13 = anIntArray279[--anInt4851];
										anIntArray279[anInt4851++] = Static124.aBooleanArray16[local13] ? 1 : 0;
										return;
									}
									if (arg0 == 3632) {
										local13 = anIntArray279[--anInt4851];
										if (Static594.aString110 != null && local13 < Static301.anInt5871) {
											aStringArray38[anInt4839++] = Static635.aClass17Array3[local13].aString4;
											return;
										}
										aStringArray38[anInt4839++] = "";
										return;
									}
									if (arg0 == 3633) {
										local13 = anIntArray279[--anInt4851];
										if (Static579.anInt9657 != 0 && local13 < Static463.anInt8194) {
											aStringArray38[anInt4839++] = Static234.aStringArray36[local13];
											return;
										}
										aStringArray38[anInt4839++] = "";
										return;
									}
								} else if (arg0 < 4000) {
									if (arg0 == 3903) {
										local13 = anIntArray279[--anInt4851];
										anIntArray279[anInt4851++] = Static114.aClass255Array1[local13].method6753();
										return;
									}
									if (arg0 == 3904) {
										local13 = anIntArray279[--anInt4851];
										anIntArray279[anInt4851++] = Static114.aClass255Array1[local13].anInt7862;
										return;
									}
									if (arg0 == 3905) {
										local13 = anIntArray279[--anInt4851];
										anIntArray279[anInt4851++] = Static114.aClass255Array1[local13].anInt7866;
										return;
									}
									if (arg0 == 3906) {
										local13 = anIntArray279[--anInt4851];
										anIntArray279[anInt4851++] = Static114.aClass255Array1[local13].anInt7867;
										return;
									}
									if (arg0 == 3907) {
										local13 = anIntArray279[--anInt4851];
										anIntArray279[anInt4851++] = Static114.aClass255Array1[local13].anInt7861;
										return;
									}
									if (arg0 == 3908) {
										local13 = anIntArray279[--anInt4851];
										anIntArray279[anInt4851++] = Static114.aClass255Array1[local13].anInt7864;
										return;
									}
									if (arg0 == 3910) {
										local13 = anIntArray279[--anInt4851];
										local19 = Static114.aClass255Array1[local13].method6752();
										anIntArray279[anInt4851++] = local19 == 0 ? 1 : 0;
										return;
									}
									if (arg0 == 3911) {
										local13 = anIntArray279[--anInt4851];
										local19 = Static114.aClass255Array1[local13].method6752();
										anIntArray279[anInt4851++] = local19 == 2 ? 1 : 0;
										return;
									}
									if (arg0 == 3912) {
										local13 = anIntArray279[--anInt4851];
										local19 = Static114.aClass255Array1[local13].method6752();
										anIntArray279[anInt4851++] = local19 == 5 ? 1 : 0;
										return;
									}
									if (arg0 == 3913) {
										local13 = anIntArray279[--anInt4851];
										local19 = Static114.aClass255Array1[local13].method6752();
										anIntArray279[anInt4851++] = local19 == 1 ? 1 : 0;
										return;
									}
								} else if (arg0 < 4100) {
									if (arg0 == 4000) {
										anInt4851 -= 2;
										local13 = anIntArray279[anInt4851];
										local19 = anIntArray279[anInt4851 + 1];
										anIntArray279[anInt4851++] = local13 + local19;
										return;
									}
									if (arg0 == 4001) {
										anInt4851 -= 2;
										local13 = anIntArray279[anInt4851];
										local19 = anIntArray279[anInt4851 + 1];
										anIntArray279[anInt4851++] = local13 - local19;
										return;
									}
									if (arg0 == 4002) {
										anInt4851 -= 2;
										local13 = anIntArray279[anInt4851];
										local19 = anIntArray279[anInt4851 + 1];
										anIntArray279[anInt4851++] = local13 * local19;
										return;
									}
									if (arg0 == 4003) {
										anInt4851 -= 2;
										local13 = anIntArray279[anInt4851];
										local19 = anIntArray279[anInt4851 + 1];
										anIntArray279[anInt4851++] = local13 / local19;
										return;
									}
									if (arg0 == 4004) {
										local13 = anIntArray279[--anInt4851];
										anIntArray279[anInt4851++] = (int) (Math.random() * (double) local13);
										return;
									}
									if (arg0 == 4005) {
										local13 = anIntArray279[--anInt4851];
										anIntArray279[anInt4851++] = (int) (Math.random() * (double) (local13 + 1));
										return;
									}
									if (arg0 == 4006) {
										anInt4851 -= 5;
										local13 = anIntArray279[anInt4851];
										local19 = anIntArray279[anInt4851 + 1];
										local25 = anIntArray279[anInt4851 + 2];
										local357 = anIntArray279[anInt4851 + 3];
										local2373 = anIntArray279[anInt4851 + 4];
										anIntArray279[anInt4851++] = local13 + (local19 - local13) * (local2373 - local25) / (local357 - local25);
										return;
									}
									@Pc(7451) long local7451;
									@Pc(7444) long local7444;
									if (arg0 == 4007) {
										anInt4851 -= 2;
										local7444 = (long) anIntArray279[anInt4851];
										local7451 = (long) anIntArray279[anInt4851 + 1];
										anIntArray279[anInt4851++] = (int) (local7444 + local7444 * local7451 / 100L);
										return;
									}
									if (arg0 == 4008) {
										anInt4851 -= 2;
										local13 = anIntArray279[anInt4851];
										local19 = anIntArray279[anInt4851 + 1];
										anIntArray279[anInt4851++] = local13 | 0x1 << local19;
										return;
									}
									if (arg0 == 4009) {
										anInt4851 -= 2;
										local13 = anIntArray279[anInt4851];
										local19 = anIntArray279[anInt4851 + 1];
										anIntArray279[anInt4851++] = local13 & -(0x1 << local19) - 1;
										return;
									}
									if (arg0 == 4010) {
										anInt4851 -= 2;
										local13 = anIntArray279[anInt4851];
										local19 = anIntArray279[anInt4851 + 1];
										anIntArray279[anInt4851++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
										return;
									}
									if (arg0 == 4011) {
										anInt4851 -= 2;
										local13 = anIntArray279[anInt4851];
										local19 = anIntArray279[anInt4851 + 1];
										anIntArray279[anInt4851++] = local13 % local19;
										return;
									}
									if (arg0 == 4012) {
										anInt4851 -= 2;
										local13 = anIntArray279[anInt4851];
										local19 = anIntArray279[anInt4851 + 1];
										if (local13 == 0) {
											anIntArray279[anInt4851++] = 0;
											return;
										}
										anIntArray279[anInt4851++] = (int) Math.pow((double) local13, (double) local19);
										return;
									}
									if (arg0 == 4013) {
										anInt4851 -= 2;
										local13 = anIntArray279[anInt4851];
										local19 = anIntArray279[anInt4851 + 1];
										if (local13 == 0) {
											anIntArray279[anInt4851++] = 0;
											return;
										}
										if (local19 == 0) {
											anIntArray279[anInt4851++] = Integer.MAX_VALUE;
											return;
										}
										anIntArray279[anInt4851++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
										return;
									}
									if (arg0 == 4014) {
										anInt4851 -= 2;
										local13 = anIntArray279[anInt4851];
										local19 = anIntArray279[anInt4851 + 1];
										anIntArray279[anInt4851++] = local13 & local19;
										return;
									}
									if (arg0 == 4015) {
										anInt4851 -= 2;
										local13 = anIntArray279[anInt4851];
										local19 = anIntArray279[anInt4851 + 1];
										anIntArray279[anInt4851++] = local13 | local19;
										return;
									}
									if (arg0 == 4016) {
										anInt4851 -= 2;
										local13 = anIntArray279[anInt4851];
										local19 = anIntArray279[anInt4851 + 1];
										anIntArray279[anInt4851++] = local13 < local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4017) {
										anInt4851 -= 2;
										local13 = anIntArray279[anInt4851];
										local19 = anIntArray279[anInt4851 + 1];
										anIntArray279[anInt4851++] = local13 > local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4018) {
										anInt4851 -= 3;
										local7444 = (long) anIntArray279[anInt4851];
										local7451 = (long) anIntArray279[anInt4851 + 1];
										@Pc(7832) long local7832 = (long) anIntArray279[anInt4851 + 2];
										anIntArray279[anInt4851++] = (int) (local7444 * local7832 / local7451);
										return;
									}
									if (arg0 == 4019) {
										anInt4851 -= 2;
										local13 = anIntArray279[anInt4851];
										local19 = anIntArray279[anInt4851 + 1];
										if (local13 > 700 || local19 > 700) {
											anIntArray279[anInt4851++] = 256;
										}
										@Pc(7891) double local7891 = (Math.random() * (double) (local19 + local13) + 800.0D - (double) local13) / 100.0D;
										anIntArray279[anInt4851++] = (int) (Math.pow(2.0D, local7891) + 0.5D);
										return;
									}
								} else if (arg0 < 4200) {
									if (arg0 == 4100) {
										local4042 = aStringArray38[--anInt4839];
										local19 = anIntArray279[--anInt4851];
										aStringArray38[anInt4839++] = local4042 + local19;
										return;
									}
									if (arg0 == 4101) {
										anInt4839 -= 2;
										local4042 = aStringArray38[anInt4839];
										local1161 = aStringArray38[anInt4839 + 1];
										aStringArray38[anInt4839++] = local4042 + local1161;
										return;
									}
									if (arg0 == 4102) {
										local4042 = aStringArray38[--anInt4839];
										local19 = anIntArray279[--anInt4851];
										aStringArray38[anInt4839++] = local4042 + Static372.method7365(true, local19);
										return;
									}
									if (arg0 == 4103) {
										local4042 = aStringArray38[--anInt4839];
										aStringArray38[anInt4839++] = local4042.toLowerCase();
										return;
									}
									if (arg0 == 4104) {
										aStringArray38[anInt4839++] = method4203(anIntArray279[--anInt4851]);
										return;
									}
									if (arg0 == 4105) {
										anInt4839 -= 2;
										local4042 = aStringArray38[anInt4839];
										local1161 = aStringArray38[anInt4839 + 1];
										if (Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aClass12_1 != null && Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aClass12_1.aBoolean7) {
											aStringArray38[anInt4839++] = local1161;
											return;
										}
										aStringArray38[anInt4839++] = local4042;
										return;
									}
									if (arg0 == 4106) {
										local13 = anIntArray279[--anInt4851];
										aStringArray38[anInt4839++] = Integer.toString(local13);
										return;
									}
									if (arg0 == 4107) {
										anInt4839 -= 2;
										anIntArray279[anInt4851++] = Static194.method3454(aStringArray38[anInt4839], Static307.anInt5931, aStringArray38[anInt4839 + 1]);
										return;
									}
									@Pc(8174) Class133 local8174;
									if (arg0 == 4108) {
										local4042 = aStringArray38[--anInt4839];
										anInt4851 -= 2;
										local19 = anIntArray279[anInt4851];
										local25 = anIntArray279[anInt4851 + 1];
										local8174 = Static247.method4287(Static483.aClass353_89, local25);
										anIntArray279[anInt4851++] = local8174.method3648(local19, Static553.aClass32Array19, local4042);
										return;
									}
									if (arg0 == 4109) {
										local4042 = aStringArray38[--anInt4839];
										anInt4851 -= 2;
										local19 = anIntArray279[anInt4851];
										local25 = anIntArray279[anInt4851 + 1];
										local8174 = Static247.method4287(Static483.aClass353_89, local25);
										anIntArray279[anInt4851++] = local8174.method3639(local19, Static553.aClass32Array19, local4042);
										return;
									}
									if (arg0 == 4110) {
										anInt4839 -= 2;
										local4042 = aStringArray38[anInt4839];
										local1161 = aStringArray38[anInt4839 + 1];
										if (anIntArray279[--anInt4851] == 1) {
											aStringArray38[anInt4839++] = local4042;
											return;
										}
										aStringArray38[anInt4839++] = local1161;
										return;
									}
									if (arg0 == 4111) {
										local4042 = aStringArray38[--anInt4839];
										aStringArray38[anInt4839++] = Static257.method4611(local4042);
										return;
									}
									if (arg0 == 4112) {
										local4042 = aStringArray38[--anInt4839];
										local19 = anIntArray279[--anInt4851];
										if (local19 == -1) {
											throw new RuntimeException("null char");
										}
										aStringArray38[anInt4839++] = local4042 + (char) local19;
										return;
									}
									if (arg0 == 4113) {
										local13 = anIntArray279[--anInt4851];
										anIntArray279[anInt4851++] = method4199((char) local13);
										return;
									}
									if (arg0 == 4114) {
										local13 = anIntArray279[--anInt4851];
										anIntArray279[anInt4851++] = Static214.method3650((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4115) {
										local13 = anIntArray279[--anInt4851];
										anIntArray279[anInt4851++] = Static585.method8233((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4116) {
										local13 = anIntArray279[--anInt4851];
										anIntArray279[anInt4851++] = Static95.method1538((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4117) {
										local4042 = aStringArray38[--anInt4839];
										if (local4042 != null) {
											anIntArray279[anInt4851++] = local4042.length();
											return;
										}
										anIntArray279[anInt4851++] = 0;
										return;
									}
									if (arg0 == 4118) {
										local4042 = aStringArray38[--anInt4839];
										anInt4851 -= 2;
										local19 = anIntArray279[anInt4851];
										local25 = anIntArray279[anInt4851 + 1];
										aStringArray38[anInt4839++] = local4042.substring(local19, local25);
										return;
									}
									if (arg0 == 4119) {
										local4042 = aStringArray38[--anInt4839];
										@Pc(8532) StringBuffer local8532 = new StringBuffer(local4042.length());
										@Pc(8534) boolean local8534 = false;
										for (local357 = 0; local357 < local4042.length(); local357++) {
											@Pc(8541) char local8541 = local4042.charAt(local357);
											if (local8541 == '<') {
												local8534 = true;
											} else if (local8541 == '>') {
												local8534 = false;
											} else if (!local8534) {
												local8532.append(local8541);
											}
										}
										aStringArray38[anInt4839++] = local8532.toString();
										return;
									}
									if (arg0 == 4120) {
										local4042 = aStringArray38[--anInt4839];
										anInt4851 -= 2;
										local19 = anIntArray279[anInt4851];
										local25 = anIntArray279[anInt4851 + 1];
										anIntArray279[anInt4851++] = local4042.indexOf(local19, local25);
										return;
									}
									if (arg0 == 4121) {
										anInt4839 -= 2;
										local4042 = aStringArray38[anInt4839];
										local1161 = aStringArray38[anInt4839 + 1];
										local25 = anIntArray279[--anInt4851];
										anIntArray279[anInt4851++] = local4042.indexOf(local1161, local25);
										return;
									}
									if (arg0 == 4122) {
										local13 = anIntArray279[--anInt4851];
										anIntArray279[anInt4851++] = Character.toLowerCase((char) local13);
										return;
									}
									if (arg0 == 4123) {
										local13 = anIntArray279[--anInt4851];
										anIntArray279[anInt4851++] = Character.toUpperCase((char) local13);
										return;
									}
									if (arg0 == 4124) {
										local420 = anIntArray279[--anInt4851] != 0;
										local19 = anIntArray279[--anInt4851];
										aStringArray38[anInt4839++] = Static579.method8181((long) local19, 0, Static307.anInt5931, local420);
										return;
									}
									if (arg0 == 4125) {
										local4042 = aStringArray38[--anInt4839];
										local19 = anIntArray279[--anInt4851];
										@Pc(8755) Class133 local8755 = Static247.method4287(Static483.aClass353_89, local19);
										anIntArray279[anInt4851++] = local8755.method3645(local4042, Static553.aClass32Array19);
										return;
									}
								} else if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = anIntArray279[--anInt4851];
										aStringArray38[anInt4839++] = Static266.aClass138_1.method3730(local13).aString109;
										return;
									}
									@Pc(8817) Class347 local8817;
									if (arg0 == 4201) {
										anInt4851 -= 2;
										local13 = anIntArray279[anInt4851];
										local19 = anIntArray279[anInt4851 + 1];
										local8817 = Static266.aClass138_1.method3730(local13);
										if (local19 >= 1 && local19 <= 5 && local8817.aStringArray70[local19 - 1] != null) {
											aStringArray38[anInt4839++] = local8817.aStringArray70[local19 - 1];
											return;
										}
										aStringArray38[anInt4839++] = "";
										return;
									}
									if (arg0 == 4202) {
										anInt4851 -= 2;
										local13 = anIntArray279[anInt4851];
										local19 = anIntArray279[anInt4851 + 1];
										local8817 = Static266.aClass138_1.method3730(local13);
										if (local19 >= 1 && local19 <= 5 && local8817.aStringArray71[local19 - 1] != null) {
											aStringArray38[anInt4839++] = local8817.aStringArray71[local19 - 1];
											return;
										}
										aStringArray38[anInt4839++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = anIntArray279[--anInt4851];
										anIntArray279[anInt4851++] = Static266.aClass138_1.method3730(local13).anInt9718;
										return;
									}
									if (arg0 == 4204) {
										local13 = anIntArray279[--anInt4851];
										anIntArray279[anInt4851++] = Static266.aClass138_1.method3730(local13).anInt9717 == 1 ? 1 : 0;
										return;
									}
									@Pc(8980) Class347 local8980;
									if (arg0 == 4205) {
										local13 = anIntArray279[--anInt4851];
										local8980 = Static266.aClass138_1.method3730(local13);
										if (local8980.anInt9773 == -1 && local8980.anInt9745 >= 0) {
											anIntArray279[anInt4851++] = local8980.anInt9745;
											return;
										}
										anIntArray279[anInt4851++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = anIntArray279[--anInt4851];
										local8980 = Static266.aClass138_1.method3730(local13);
										if (local8980.anInt9773 >= 0 && local8980.anInt9745 >= 0) {
											anIntArray279[anInt4851++] = local8980.anInt9745;
											return;
										}
										anIntArray279[anInt4851++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = anIntArray279[--anInt4851];
										anIntArray279[anInt4851++] = Static266.aClass138_1.method3730(local13).aBoolean672 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										anInt4851 -= 2;
										local13 = anIntArray279[anInt4851];
										local19 = anIntArray279[anInt4851 + 1];
										local3107 = Static26.aClass179_1.method5148(local19);
										if (local3107.method5911()) {
											aStringArray38[anInt4839++] = Static266.aClass138_1.method3730(local13).method8252(local3107.aString83, local19);
											return;
										}
										anIntArray279[anInt4851++] = Static266.aClass138_1.method3730(local13).method8245(local3107.anInt6887, local19);
										return;
									}
									if (arg0 == 4209) {
										anInt4851 -= 2;
										local13 = anIntArray279[anInt4851];
										local19 = anIntArray279[anInt4851 + 1] - 1;
										local8817 = Static266.aClass138_1.method3730(local13);
										if (local8817.anInt9749 == local19) {
											anIntArray279[anInt4851++] = local8817.anInt9747;
											return;
										}
										if (local8817.anInt9743 == local19) {
											anIntArray279[anInt4851++] = local8817.anInt9770;
											return;
										}
										anIntArray279[anInt4851++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local4042 = aStringArray38[--anInt4839];
										local19 = anIntArray279[--anInt4851];
										Static387.method6212(local19 == 1, local4042);
										anIntArray279[anInt4851++] = Static126.anInt2428;
										return;
									}
									if (arg0 == 4211) {
										if (Static293.aShortArray76 != null && Static3.anInt52 < Static126.anInt2428) {
											anIntArray279[anInt4851++] = Static293.aShortArray76[Static3.anInt52++] & 0xFFFF;
											return;
										}
										anIntArray279[anInt4851++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static3.anInt52 = 0;
										return;
									}
									if (arg0 == 4213) {
										local13 = anIntArray279[--anInt4851];
										anIntArray279[anInt4851++] = Static266.aClass138_1.method3730(local13).anInt9733;
										return;
									}
									if (arg0 == 4214) {
										local4042 = aStringArray38[--anInt4839];
										anInt4851 -= 3;
										local19 = anIntArray279[anInt4851];
										local25 = anIntArray279[anInt4851 + 1];
										local357 = anIntArray279[anInt4851 + 2];
										Static595.method8360(local19 == 1, local25, local357, local4042);
										anIntArray279[anInt4851++] = Static126.anInt2428;
										return;
									}
									if (arg0 == 4215) {
										anInt4839 -= 2;
										anInt4851 -= 2;
										local4042 = aStringArray38[anInt4839];
										local19 = anIntArray279[anInt4851];
										local25 = anIntArray279[anInt4851 + 1];
										@Pc(9379) String local9379 = aStringArray38[anInt4839 + 1];
										Static628.method8718(local25, local19 == 1, local4042, local9379);
										anIntArray279[anInt4851++] = Static126.anInt2428;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										anInt4851 -= 2;
										local13 = anIntArray279[anInt4851];
										local19 = anIntArray279[anInt4851 + 1];
										local3107 = Static26.aClass179_1.method5148(local19);
										if (local3107.method5911()) {
											aStringArray38[anInt4839++] = Static563.aClass346_2.method8199(local13).method6603(local3107.aString83, local19);
											return;
										}
										anIntArray279[anInt4851++] = Static563.aClass346_2.method8199(local13).method6600(local19, local3107.anInt6887);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										anInt4851 -= 2;
										local13 = anIntArray279[anInt4851];
										local19 = anIntArray279[anInt4851 + 1];
										local3107 = Static26.aClass179_1.method5148(local19);
										if (local3107.method5911()) {
											aStringArray38[anInt4839++] = Static283.aClass210_2.method5629(local13).method7857(local3107.aString83, local19);
											return;
										}
										anIntArray279[anInt4851++] = Static283.aClass210_2.method5629(local13).method7858(local3107.anInt6887, local19);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										anInt4851 -= 2;
										local13 = anIntArray279[anInt4851];
										local19 = anIntArray279[anInt4851 + 1];
										local3107 = Static26.aClass179_1.method5148(local19);
										if (local3107.method5911()) {
											aStringArray38[anInt4839++] = Static576.aClass324_2.method7966(local13).method6697(local3107.aString83, local19);
											return;
										}
										anIntArray279[anInt4851++] = Static576.aClass324_2.method7966(local13).method6702(local19, local3107.anInt6887);
										return;
									}
								} else if (arg0 < 4700 && arg0 == 4600) {
									local13 = anIntArray279[--anInt4851];
									@Pc(9607) Class201 local9607 = Static511.aClass34_1.method803(local13);
									if (local9607.anIntArray376 != null && local9607.anIntArray376.length > 0) {
										local25 = 0;
										local357 = local9607.anIntArray375[0];
										for (local2373 = 1; local2373 < local9607.anIntArray376.length; local2373++) {
											if (local9607.anIntArray375[local2373] > local357) {
												local25 = local2373;
												local357 = local9607.anIntArray375[local2373];
											}
										}
										anIntArray279[anInt4851++] = local9607.anIntArray376[local25];
										return;
									}
									anIntArray279[anInt4851++] = local9607.anInt6340;
									return;
								}
							}
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static386.method4914(anIntArray279[--anInt4851]);
					} else {
						local137 = arg1 ? aClass302_32 : aClass302_33;
					}
					Static603.method8464(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt4851 -= 2;
						local19 = anIntArray279[anInt4851];
						local25 = anIntArray279[anInt4851 + 1];
						if (local137.anInt8834 == -1) {
							Static15.method5158(local137.anInt8838);
							Static318.method5304(local137.anInt8838);
							Static198.method3519(local137.anInt8838);
						}
						if (local19 == -1) {
							local137.anInt8823 = 1;
							local137.anInt8871 = -1;
							local137.anInt8877 = -1;
							return;
						}
						local137.anInt8877 = local19;
						local137.anInt8808 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean587 = true;
						} else {
							local137.aBoolean587 = false;
						}
						@Pc(1713) Class347 local1713 = Static266.aClass138_1.method3730(local19);
						local137.anInt8845 = local1713.anInt9768;
						local137.anInt8786 = local1713.anInt9729;
						local137.anInt8788 = local1713.anInt9739;
						local137.anInt8872 = local1713.anInt9737;
						local137.anInt8842 = local1713.anInt9731;
						local137.anInt8876 = local1713.anInt9758;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt8794 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt8794 = 1;
						} else {
							local137.anInt8794 = 2;
						}
						if (local137.anInt8863 > 0) {
							local137.anInt8876 = local137.anInt8876 * 32 / local137.anInt8863;
							return;
						}
						if (local137.anInt8864 > 0) {
							local137.anInt8876 = local137.anInt8876 * 32 / local137.anInt8864;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt8823 = 2;
						local137.anInt8871 = anIntArray279[--anInt4851];
						if (local137.anInt8834 == -1) {
							Static373.method5885(local137.anInt8838);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt8823 = 3;
						local137.anInt8871 = -1;
						if (local137.anInt8834 == -1) {
							Static373.method5885(local137.anInt8838);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt8823 = 6;
						local137.anInt8871 = anIntArray279[--anInt4851];
						if (local137.anInt8834 == -1) {
							Static373.method5885(local137.anInt8838);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt8823 = 5;
						local137.anInt8871 = anIntArray279[--anInt4851];
						if (local137.anInt8834 == -1) {
							Static373.method5885(local137.anInt8838);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt4851 -= 4;
						local137.anInt8807 = anIntArray279[anInt4851];
						local137.anInt8849 = anIntArray279[anInt4851 + 1];
						local137.anInt8799 = anIntArray279[anInt4851 + 2];
						local137.anInt8868 = anIntArray279[anInt4851 + 3];
						Static603.method8464(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt4851 -= 2;
						local137.anInt8817 = anIntArray279[anInt4851];
						local137.anInt8869 = anIntArray279[anInt4851 + 1];
						Static603.method8464(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt4851 -= 4;
						local137.anInt8871 = anIntArray279[anInt4851];
						local137.anInt8789 = anIntArray279[anInt4851 + 1];
						if (anIntArray279[anInt4851 + 2] == 1) {
							local137.anInt8823 = 9;
						} else {
							local137.anInt8823 = 8;
						}
						if (anIntArray279[anInt4851 + 3] == 1) {
							local137.aBoolean587 = true;
						} else {
							local137.aBoolean587 = false;
						}
						if (local137.anInt8834 == -1) {
							Static373.method5885(local137.anInt8838);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt8823 = 5;
						local137.anInt8871 = Static229.anInt4561;
						local137.anInt8789 = 0;
						if (local137.anInt8834 == -1) {
							Static373.method5885(local137.anInt8838);
						}
						return;
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static386.method4914(anIntArray279[--anInt4851]);
				} else {
					local137 = arg1 ? aClass302_32 : aClass302_33;
				}
				if (arg0 == 1000) {
					anInt4851 -= 4;
					local137.anInt8873 = anIntArray279[anInt4851];
					local137.anInt8853 = anIntArray279[anInt4851 + 1];
					local19 = anIntArray279[anInt4851 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray279[anInt4851 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte104 = (byte) local19;
					local137.aByte105 = (byte) local25;
					Static603.method8464(local137);
					Static532.method7704(local137);
					if (local137.anInt8834 == -1) {
						Static649.method9044(local137.anInt8838);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt4851 -= 4;
					local137.anInt8864 = anIntArray279[anInt4851];
					local137.anInt8862 = anIntArray279[anInt4851 + 1];
					local137.anInt8863 = 0;
					local137.anInt8790 = 0;
					local19 = anIntArray279[anInt4851 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray279[anInt4851 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte102 = (byte) local19;
					local137.aByte103 = (byte) local25;
					Static603.method8464(local137);
					Static532.method7704(local137);
					if (local137.anInt8816 == 0) {
						Static409.method6504(local137, false);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(661) boolean local661 = anIntArray279[--anInt4851] == 1;
					if (local137.aBoolean601 != local661) {
						local137.aBoolean601 = local661;
						Static603.method8464(local137);
					}
					if (local137.anInt8834 == -1) {
						Static307.method5203(local137.anInt8838);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt4851 -= 2;
					local137.anInt8852 = anIntArray279[anInt4851];
					local137.anInt8791 = anIntArray279[anInt4851 + 1];
					Static603.method8464(local137);
					Static532.method7704(local137);
					if (local137.anInt8816 == 0) {
						Static409.method6504(local137, false);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean598 = anIntArray279[--anInt4851] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!dca;)V")
	public static void method4193(@OriginalArg(0) Class6_Sub10 arg0) {
		method4196(arg0, 200000);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V")
	private static void method4194(@OriginalArg(0) int arg0) {
		@Pc(3) Class302 local3 = Static386.method4914(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class302[] local13 = Static590.aClass302ArrayArray3[local9];
		if (local13 == null) {
			@Pc(19) Class302[] local19 = Static605.aClass302ArrayArray4[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static590.aClass302ArrayArray3[local9] = new Class302[local22];
			Static655.method5831(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static655.method5831(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(IZ)V")
	private static void method4195(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(83) String local83;
		@Pc(1496) boolean local1496;
		@Pc(97) int local97;
		@Pc(175) int local175;
		@Pc(776) int local776;
		@Pc(181) String local181;
		@Pc(103) int local103;
		@Pc(52) Class6_Sub9 local52;
		@Pc(89) String local89;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray279[anInt4851++] = Static231.anInt4574;
				return;
			}
			if (arg0 == 5001) {
				anInt4851 -= 3;
				Static231.anInt4574 = anIntArray279[anInt4851];
				Static213.aClass314_1 = Static279.method4876(anIntArray279[anInt4851 + 1]);
				if (Static213.aClass314_1 == null) {
					Static213.aClass314_1 = Static432.aClass314_4;
				}
				Static221.anInt4349 = anIntArray279[anInt4851 + 2];
				local52 = Static560.method8089(Static391.aClass126_1, Static349.aClass208_57);
				local52.aClass6_Sub40_Sub2_1.method8589(Static231.anInt4574);
				local52.aClass6_Sub40_Sub2_1.method8589(Static213.aClass314_1.anInt9276);
				local52.aClass6_Sub40_Sub2_1.method8589(Static221.anInt4349);
				Static263.method4681(local52);
				return;
			}
			if (arg0 == 5002) {
				anInt4839 -= 2;
				local83 = aStringArray38[anInt4839];
				local89 = aStringArray38[anInt4839 + 1];
				anInt4851 -= 2;
				local97 = anIntArray279[anInt4851];
				local103 = anIntArray279[anInt4851 + 1];
				if (local89 == null) {
					local89 = "";
				}
				if (local89.length() > 80) {
					local89 = local89.substring(0, 80);
				}
				@Pc(125) Class6_Sub9 local125 = Static560.method8089(Static391.aClass126_1, Static73.aClass208_12);
				local125.aClass6_Sub40_Sub2_1.method8589(Static583.method8194(local83) + Static583.method8194(local89) + 2);
				local125.aClass6_Sub40_Sub2_1.method8551(local83);
				local125.aClass6_Sub40_Sub2_1.method8589(local97 - 1);
				local125.aClass6_Sub40_Sub2_1.method8589(local103);
				local125.aClass6_Sub40_Sub2_1.method8551(local89);
				Static263.method4681(local125);
				return;
			}
			@Pc(179) Class173 local179;
			if (arg0 == 5003) {
				local175 = anIntArray279[--anInt4851];
				local179 = Static107.method1755(local175);
				local181 = "";
				if (local179 != null && local179.aString66 != null) {
					local181 = local179.aString66;
				}
				aStringArray38[anInt4839++] = local181;
				return;
			}
			if (arg0 == 5004) {
				local175 = anIntArray279[--anInt4851];
				local179 = Static107.method1755(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt5735;
				}
				anIntArray279[anInt4851++] = local97;
				return;
			}
			if (arg0 == 5005) {
				if (Static213.aClass314_1 == null) {
					anIntArray279[anInt4851++] = -1;
					return;
				}
				anIntArray279[anInt4851++] = Static213.aClass314_1.anInt9276;
				return;
			}
			@Pc(269) Class6_Sub9 local269;
			if (arg0 == 5006) {
				local175 = anIntArray279[--anInt4851];
				local269 = Static560.method8089(Static391.aClass126_1, Static530.aClass208_76);
				local269.aClass6_Sub40_Sub2_1.method8589(local175);
				Static263.method4681(local269);
				return;
			}
			if (arg0 == 5008) {
				local83 = aStringArray38[--anInt4839];
				method4198(local83, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt4839 -= 2;
				local83 = aStringArray38[anInt4839];
				local89 = aStringArray38[anInt4839 + 1];
				if (Static578.anInt6641 != 0 || (!Static461.aBoolean555 || Static279.aBoolean370) && !Static441.aBoolean530) {
					@Pc(328) Class6_Sub9 local328 = Static560.method8089(Static391.aClass126_1, Static145.aClass208_27);
					local328.aClass6_Sub40_Sub2_1.method8589(0);
					local103 = local328.aClass6_Sub40_Sub2_1.anInt10169;
					local328.aClass6_Sub40_Sub2_1.method8551(local83);
					Static267.method4762(local89, local328.aClass6_Sub40_Sub2_1);
					local328.aClass6_Sub40_Sub2_1.method8605(local328.aClass6_Sub40_Sub2_1.anInt10169 - local103);
					Static263.method4681(local328);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local175 = anIntArray279[--anInt4851];
				local179 = Static107.method1755(local175);
				local181 = "";
				if (local179 != null && local179.aString64 != null) {
					local181 = local179.aString64;
				}
				aStringArray38[anInt4839++] = local181;
				return;
			}
			if (arg0 == 5011) {
				local175 = anIntArray279[--anInt4851];
				local179 = Static107.method1755(local175);
				local181 = "";
				if (local179 != null && local179.aString67 != null) {
					local181 = local179.aString67;
				}
				aStringArray38[anInt4839++] = local181;
				return;
			}
			if (arg0 == 5012) {
				local175 = anIntArray279[--anInt4851];
				local179 = Static107.method1755(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt5736;
				}
				anIntArray279[anInt4851++] = local97;
				return;
			}
			if (arg0 == 5015) {
				if (Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1 == null || Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aString13 == null) {
					local83 = "";
				} else {
					local83 = Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.method1026();
				}
				aStringArray38[anInt4839++] = local83;
				return;
			}
			if (arg0 == 5016) {
				anIntArray279[anInt4851++] = Static221.anInt4349;
				return;
			}
			if (arg0 == 5017) {
				anIntArray279[anInt4851++] = Static233.method4069();
				return;
			}
			if (arg0 == 5018) {
				local175 = anIntArray279[--anInt4851];
				local179 = Static107.method1755(local175);
				local97 = 0;
				if (local179 != null) {
					local97 = local179.anInt5740;
				}
				anIntArray279[anInt4851++] = local97;
				return;
			}
			if (arg0 == 5019) {
				local175 = anIntArray279[--anInt4851];
				local179 = Static107.method1755(local175);
				local181 = "";
				if (local179 != null && local179.aString68 != null) {
					local181 = local179.aString68;
				}
				aStringArray38[anInt4839++] = local181;
				return;
			}
			if (arg0 == 5020) {
				if (Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1 == null || Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aString13 == null) {
					local83 = "";
				} else {
					local83 = Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.method1025();
				}
				aStringArray38[anInt4839++] = local83;
				return;
			}
			if (arg0 == 5023) {
				local175 = anIntArray279[--anInt4851];
				local179 = Static107.method1755(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt5741;
				}
				anIntArray279[anInt4851++] = local97;
				return;
			}
			if (arg0 == 5024) {
				local175 = anIntArray279[--anInt4851];
				local179 = Static107.method1755(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt5737;
				}
				anIntArray279[anInt4851++] = local97;
				return;
			}
			if (arg0 == 5025) {
				local175 = anIntArray279[--anInt4851];
				local179 = Static107.method1755(local175);
				local181 = "";
				if (local179 != null && local179.aString65 != null) {
					local181 = local179.aString65;
				}
				aStringArray38[anInt4839++] = local181;
				return;
			}
			if (arg0 == 5050) {
				local175 = anIntArray279[--anInt4851];
				aStringArray38[anInt4839++] = Static494.aClass118_1.method3366(local175).aString36;
				return;
			}
			@Pc(736) Class6_Sub2_Sub7 local736;
			if (arg0 == 5051) {
				local175 = anIntArray279[--anInt4851];
				local736 = Static494.aClass118_1.method3366(local175);
				if (local736.anIntArray210 == null) {
					anIntArray279[anInt4851++] = 0;
					return;
				}
				anIntArray279[anInt4851++] = local736.anIntArray210.length;
				return;
			}
			if (arg0 == 5052) {
				anInt4851 -= 2;
				local175 = anIntArray279[anInt4851];
				local776 = anIntArray279[anInt4851 + 1];
				@Pc(781) Class6_Sub2_Sub7 local781 = Static494.aClass118_1.method3366(local175);
				local103 = local781.anIntArray210[local776];
				anIntArray279[anInt4851++] = local103;
				return;
			}
			if (arg0 == 5053) {
				local175 = anIntArray279[--anInt4851];
				local736 = Static494.aClass118_1.method3366(local175);
				if (local736.anIntArray211 == null) {
					anIntArray279[anInt4851++] = 0;
					return;
				}
				anIntArray279[anInt4851++] = local736.anIntArray211.length;
				return;
			}
			if (arg0 == 5054) {
				anInt4851 -= 2;
				local175 = anIntArray279[anInt4851];
				local776 = anIntArray279[anInt4851 + 1];
				anIntArray279[anInt4851++] = Static494.aClass118_1.method3366(local175).anIntArray211[local776];
				return;
			}
			if (arg0 == 5055) {
				local175 = anIntArray279[--anInt4851];
				aStringArray38[anInt4839++] = Static337.aClass327_2.method7979(local175).method5406();
				return;
			}
			if (arg0 == 5056) {
				local175 = anIntArray279[--anInt4851];
				@Pc(907) Class6_Sub2_Sub14 local907 = Static337.aClass327_2.method7979(local175);
				if (local907.anIntArray367 == null) {
					anIntArray279[anInt4851++] = 0;
					return;
				}
				anIntArray279[anInt4851++] = local907.anIntArray367.length;
				return;
			}
			if (arg0 == 5057) {
				anInt4851 -= 2;
				local175 = anIntArray279[anInt4851];
				local776 = anIntArray279[anInt4851 + 1];
				anIntArray279[anInt4851++] = Static337.aClass327_2.method7979(local175).anIntArray367[local776];
				return;
			}
			if (arg0 == 5058) {
				aClass358_1 = new Class358();
				aClass358_1.anInt10061 = anIntArray279[--anInt4851];
				aClass358_1.aClass6_Sub2_Sub14_1 = Static337.aClass327_2.method7979(aClass358_1.anInt10061);
				aClass358_1.anIntArray611 = new int[aClass358_1.aClass6_Sub2_Sub14_1.method5404()];
				return;
			}
			if (arg0 == 5059) {
				local52 = Static560.method8089(Static391.aClass126_1, Static488.aClass208_96);
				local52.aClass6_Sub40_Sub2_1.method8589(0);
				local776 = local52.aClass6_Sub40_Sub2_1.anInt10169;
				local52.aClass6_Sub40_Sub2_1.method8589(0);
				local52.aClass6_Sub40_Sub2_1.method8561(aClass358_1.anInt10061);
				aClass358_1.aClass6_Sub2_Sub14_1.method5401(local52.aClass6_Sub40_Sub2_1, aClass358_1.anIntArray611);
				local52.aClass6_Sub40_Sub2_1.method8605(local52.aClass6_Sub40_Sub2_1.anInt10169 - local776);
				Static263.method4681(local52);
				return;
			}
			if (arg0 == 5060) {
				local83 = aStringArray38[--anInt4839];
				local269 = Static560.method8089(Static391.aClass126_1, Static160.aClass208_29);
				local269.aClass6_Sub40_Sub2_1.method8589(0);
				local97 = local269.aClass6_Sub40_Sub2_1.anInt10169;
				local269.aClass6_Sub40_Sub2_1.method8551(local83);
				local269.aClass6_Sub40_Sub2_1.method8561(aClass358_1.anInt10061);
				aClass358_1.aClass6_Sub2_Sub14_1.method5401(local269.aClass6_Sub40_Sub2_1, aClass358_1.anIntArray611);
				local269.aClass6_Sub40_Sub2_1.method8605(local269.aClass6_Sub40_Sub2_1.anInt10169 - local97);
				Static263.method4681(local269);
				return;
			}
			if (arg0 == 5061) {
				local52 = Static560.method8089(Static391.aClass126_1, Static488.aClass208_96);
				local52.aClass6_Sub40_Sub2_1.method8589(0);
				local776 = local52.aClass6_Sub40_Sub2_1.anInt10169;
				local52.aClass6_Sub40_Sub2_1.method8589(1);
				local52.aClass6_Sub40_Sub2_1.method8561(aClass358_1.anInt10061);
				aClass358_1.aClass6_Sub2_Sub14_1.method5401(local52.aClass6_Sub40_Sub2_1, aClass358_1.anIntArray611);
				local52.aClass6_Sub40_Sub2_1.method8605(local52.aClass6_Sub40_Sub2_1.anInt10169 - local776);
				Static263.method4681(local52);
				return;
			}
			if (arg0 == 5062) {
				anInt4851 -= 2;
				local175 = anIntArray279[anInt4851];
				local776 = anIntArray279[anInt4851 + 1];
				anIntArray279[anInt4851++] = Static494.aClass118_1.method3366(local175).aCharArray4[local776];
				return;
			}
			if (arg0 == 5063) {
				anInt4851 -= 2;
				local175 = anIntArray279[anInt4851];
				local776 = anIntArray279[anInt4851 + 1];
				anIntArray279[anInt4851++] = Static494.aClass118_1.method3366(local175).aCharArray5[local776];
				return;
			}
			if (arg0 == 5064) {
				anInt4851 -= 2;
				local175 = anIntArray279[anInt4851];
				local776 = anIntArray279[anInt4851 + 1];
				if (local776 == -1) {
					anIntArray279[anInt4851++] = -1;
					return;
				}
				anIntArray279[anInt4851++] = Static494.aClass118_1.method3366(local175).method3097((char) local776);
				return;
			}
			if (arg0 == 5065) {
				anInt4851 -= 2;
				local175 = anIntArray279[anInt4851];
				local776 = anIntArray279[anInt4851 + 1];
				if (local776 == -1) {
					anIntArray279[anInt4851++] = -1;
					return;
				}
				anIntArray279[anInt4851++] = Static494.aClass118_1.method3366(local175).method3098((char) local776);
				return;
			}
			if (arg0 == 5066) {
				local175 = anIntArray279[--anInt4851];
				anIntArray279[anInt4851++] = Static337.aClass327_2.method7979(local175).method5404();
				return;
			}
			if (arg0 == 5067) {
				anInt4851 -= 2;
				local175 = anIntArray279[anInt4851];
				local776 = anIntArray279[anInt4851 + 1];
				local97 = Static337.aClass327_2.method7979(local175).method5402(local776).anInt2681;
				anIntArray279[anInt4851++] = local97;
				return;
			}
			if (arg0 == 5068) {
				anInt4851 -= 2;
				local175 = anIntArray279[anInt4851];
				local776 = anIntArray279[anInt4851 + 1];
				aClass358_1.anIntArray611[local175] = local776;
				return;
			}
			if (arg0 == 5069) {
				anInt4851 -= 2;
				local175 = anIntArray279[anInt4851];
				local776 = anIntArray279[anInt4851 + 1];
				aClass358_1.anIntArray611[local175] = local776;
				return;
			}
			if (arg0 == 5070) {
				anInt4851 -= 3;
				local175 = anIntArray279[anInt4851];
				local776 = anIntArray279[anInt4851 + 1];
				local97 = anIntArray279[anInt4851 + 2];
				@Pc(1448) Class6_Sub2_Sub14 local1448 = Static337.aClass327_2.method7979(local175);
				if (local1448.method5402(local776).anInt2681 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray279[anInt4851++] = local1448.method5400(local776, local97);
				return;
			}
			if (arg0 == 5071) {
				local83 = aStringArray38[--anInt4839];
				local1496 = anIntArray279[--anInt4851] == 1;
				Static352.method5666(local1496, local83);
				anIntArray279[anInt4851++] = Static126.anInt2428;
				return;
			}
			if (arg0 == 5072) {
				if (Static293.aShortArray76 != null && Static3.anInt52 < Static126.anInt2428) {
					anIntArray279[anInt4851++] = Static293.aShortArray76[Static3.anInt52++] & 0xFFFF;
					return;
				}
				anIntArray279[anInt4851++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static3.anInt52 = 0;
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static647.aClass251_1.method6712(86)) {
					anIntArray279[anInt4851++] = 1;
					return;
				}
				anIntArray279[anInt4851++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static647.aClass251_1.method6712(82)) {
					anIntArray279[anInt4851++] = 1;
					return;
				}
				anIntArray279[anInt4851++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static647.aClass251_1.method6712(81)) {
					anIntArray279[anInt4851++] = 1;
					return;
				}
				anIntArray279[anInt4851++] = 0;
				return;
			}
		} else {
			@Pc(2833) int local2833;
			@Pc(2107) boolean local2107;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static92.method1521(anIntArray279[--anInt4851]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray279[anInt4851++] = Static189.method3370();
					return;
				}
				if (arg0 == 5205) {
					Static438.method6809(-1, anIntArray279[--anInt4851], false, -1);
					return;
				}
				@Pc(1696) Class6_Sub2_Sub11 local1696;
				if (arg0 == 5206) {
					local175 = anIntArray279[--anInt4851];
					local1696 = Static487.method6432(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					if (local1696 == null) {
						anIntArray279[anInt4851++] = -1;
						return;
					}
					anIntArray279[anInt4851++] = local1696.anInt5230;
					return;
				}
				@Pc(1729) Class6_Sub2_Sub11 local1729;
				if (arg0 == 5207) {
					local1729 = Static487.method6423(anIntArray279[--anInt4851]);
					if (local1729 != null && local1729.aString56 != null) {
						aStringArray38[anInt4839++] = local1729.aString56;
						return;
					}
					aStringArray38[anInt4839++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray279[anInt4851++] = Static122.anInt2384;
					anIntArray279[anInt4851++] = Static354.anInt1505;
					return;
				}
				if (arg0 == 5209) {
					anIntArray279[anInt4851++] = Static526.anInt9146 + Static487.anInt7459;
					anIntArray279[anInt4851++] = Static78.anInt1658 + Static487.anInt7453;
					return;
				}
				if (arg0 == 5210) {
					local175 = anIntArray279[--anInt4851];
					local1696 = Static487.method6423(local175);
					if (local1696 == null) {
						anIntArray279[anInt4851++] = 0;
						anIntArray279[anInt4851++] = 0;
						return;
					}
					anIntArray279[anInt4851++] = local1696.anInt5240 >> 14 & 0x3FFF;
					anIntArray279[anInt4851++] = local1696.anInt5240 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local175 = anIntArray279[--anInt4851];
					local1696 = Static487.method6423(local175);
					if (local1696 == null) {
						anIntArray279[anInt4851++] = 0;
						anIntArray279[anInt4851++] = 0;
						return;
					}
					anIntArray279[anInt4851++] = local1696.anInt5234 - local1696.anInt5238;
					anIntArray279[anInt4851++] = local1696.anInt5229 - local1696.anInt5233;
					return;
				}
				@Pc(1919) Class6_Sub45 local1919;
				if (arg0 == 5212) {
					local1919 = Static85.method1458();
					if (local1919 == null) {
						anIntArray279[anInt4851++] = -1;
						anIntArray279[anInt4851++] = -1;
						return;
					}
					anIntArray279[anInt4851++] = local1919.anInt9417;
					local776 = local1919.anInt9415 << 28 | local1919.anInt9419 + Static487.anInt7459 << 14 | local1919.anInt9422 + Static487.anInt7453;
					anIntArray279[anInt4851++] = local776;
					return;
				}
				if (arg0 == 5213) {
					local1919 = Static29.method526();
					if (local1919 == null) {
						anIntArray279[anInt4851++] = -1;
						anIntArray279[anInt4851++] = -1;
						return;
					}
					anIntArray279[anInt4851++] = local1919.anInt9417;
					local776 = local1919.anInt9415 << 28 | local1919.anInt9419 + Static487.anInt7459 << 14 | local1919.anInt9422 + Static487.anInt7453;
					anIntArray279[anInt4851++] = local776;
					return;
				}
				@Pc(2067) boolean local2067;
				if (arg0 == 5214) {
					local175 = anIntArray279[--anInt4851];
					local1696 = Static639.method8959();
					if (local1696 != null) {
						local2067 = local1696.method4682(local175 >> 28 & 0x3, local175 & 0x3FFF, local175 >> 14 & 0x3FFF, anIntArray281);
						if (local2067) {
							Static358.method5713(anIntArray281[2], anIntArray281[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt4851 -= 2;
					local175 = anIntArray279[anInt4851];
					local776 = anIntArray279[anInt4851 + 1];
					@Pc(2105) Class286 local2105 = Static487.method6440(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					local2107 = false;
					for (@Pc(2112) Class6_Sub2_Sub11 local2112 = (Class6_Sub2_Sub11) local2105.method7242(); local2112 != null; local2112 = (Class6_Sub2_Sub11) local2105.method7241()) {
						if (local2112.anInt5230 == local776) {
							local2107 = true;
							break;
						}
					}
					if (local2107) {
						anIntArray279[anInt4851++] = 1;
						return;
					}
					anIntArray279[anInt4851++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local175 = anIntArray279[--anInt4851];
					local1696 = Static487.method6423(local175);
					if (local1696 == null) {
						anIntArray279[anInt4851++] = -1;
						return;
					}
					anIntArray279[anInt4851++] = local1696.anInt5235;
					return;
				}
				if (arg0 == 5220) {
					anIntArray279[anInt4851++] = Static433.anInt7858 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local175 = anIntArray279[--anInt4851];
					Static358.method5713(local175 & 0x3FFF, local175 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1729 = Static639.method8959();
					if (local1729 != null) {
						local1496 = local1729.method4680(Static526.anInt9146 + Static487.anInt7459, Static78.anInt1658 + Static487.anInt7453, anIntArray281);
						if (local1496) {
							anIntArray279[anInt4851++] = anIntArray281[1];
							anIntArray279[anInt4851++] = anIntArray281[2];
							return;
						}
						anIntArray279[anInt4851++] = -1;
						anIntArray279[anInt4851++] = -1;
						return;
					}
					anIntArray279[anInt4851++] = -1;
					anIntArray279[anInt4851++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt4851 -= 2;
					local175 = anIntArray279[anInt4851];
					local776 = anIntArray279[anInt4851 + 1];
					Static438.method6809(local776 & 0x3FFF, local175, false, local776 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local175 = anIntArray279[--anInt4851];
					local1696 = Static639.method8959();
					if (local1696 != null) {
						local2067 = local1696.method4682(local175 >> 28 & 0x3, local175 & 0x3FFF, local175 >> 14 & 0x3FFF, anIntArray281);
						if (local2067) {
							anIntArray279[anInt4851++] = anIntArray281[1];
							anIntArray279[anInt4851++] = anIntArray281[2];
							return;
						}
						anIntArray279[anInt4851++] = -1;
						anIntArray279[anInt4851++] = -1;
						return;
					}
					anIntArray279[anInt4851++] = -1;
					anIntArray279[anInt4851++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local175 = anIntArray279[--anInt4851];
					local1696 = Static639.method8959();
					if (local1696 != null) {
						local2067 = local1696.method4680(local175 >> 14 & 0x3FFF, local175 & 0x3FFF, anIntArray281);
						if (local2067) {
							anIntArray279[anInt4851++] = anIntArray281[1];
							anIntArray279[anInt4851++] = anIntArray281[2];
							return;
						}
						anIntArray279[anInt4851++] = -1;
						anIntArray279[anInt4851++] = -1;
						return;
					}
					anIntArray279[anInt4851++] = -1;
					anIntArray279[anInt4851++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static522.method7785(anIntArray279[--anInt4851]);
					return;
				}
				if (arg0 == 5227) {
					anInt4851 -= 2;
					local175 = anIntArray279[anInt4851];
					local776 = anIntArray279[anInt4851 + 1];
					Static438.method6809(local776 & 0x3FFF, local175, true, local776 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static83.aBoolean118 = anIntArray279[--anInt4851] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray279[anInt4851++] = Static83.aBoolean118 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local175 = anIntArray279[--anInt4851];
					Static342.method5553(local175);
					return;
				}
				@Pc(2625) Class6 local2625;
				if (arg0 == 5231) {
					anInt4851 -= 2;
					local175 = anIntArray279[anInt4851];
					local1496 = anIntArray279[anInt4851 + 1] == 1;
					if (Static15.aClass128_18 != null) {
						local2625 = Static15.aClass128_18.method3560((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method9043();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class6();
							Static15.aClass128_18.method3551((long) local175, local2625);
						}
					}
					return;
				}
				@Pc(2667) Class6 local2667;
				if (arg0 == 5232) {
					local175 = anIntArray279[--anInt4851];
					if (Static15.aClass128_18 != null) {
						local2667 = Static15.aClass128_18.method3560((long) local175);
						anIntArray279[anInt4851++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray279[anInt4851++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt4851 -= 2;
					local175 = anIntArray279[anInt4851];
					local1496 = anIntArray279[anInt4851 + 1] == 1;
					if (Static553.aClass128_45 != null) {
						local2625 = Static553.aClass128_45.method3560((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method9043();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class6();
							Static553.aClass128_45.method3551((long) local175, local2625);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local175 = anIntArray279[--anInt4851];
					if (Static553.aClass128_45 != null) {
						local2667 = Static553.aClass128_45.method3560((long) local175);
						anIntArray279[anInt4851++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray279[anInt4851++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray279[anInt4851++] = Static487.aClass6_Sub2_Sub11_2 == null ? -1 : Static487.aClass6_Sub2_Sub11_2.anInt5230;
					return;
				}
				if (arg0 == 5236) {
					anInt4851 -= 2;
					local175 = anIntArray279[anInt4851];
					local776 = anIntArray279[anInt4851 + 1];
					local97 = local776 >> 14 & 0x3FFF;
					local103 = local776 & 0x3FFF;
					local2833 = Static530.method7403(local97, local103, local175);
					if (local2833 < 0) {
						anIntArray279[anInt4851++] = -1;
						return;
					}
					anIntArray279[anInt4851++] = local2833;
					return;
				}
				if (arg0 == 5237) {
					Static608.method8497();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt4851 -= 2;
					local175 = anIntArray279[anInt4851];
					local776 = anIntArray279[anInt4851 + 1];
					Static381.method5938(false, local175, 3, local776);
					anIntArray279[anInt4851++] = Static476.aFrame6 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static476.aFrame6 != null) {
						Static381.method5938(false, -1, Static348.aClass6_Sub22_19.aClass15_Sub17_1.method5501(), -1);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2919) Class125[] local2919 = Static67.method1170();
					anIntArray279[anInt4851++] = local2919.length;
					return;
				}
				if (arg0 == 5303) {
					local175 = anIntArray279[--anInt4851];
					@Pc(2943) Class125[] local2943 = Static67.method1170();
					anIntArray279[anInt4851++] = local2943[local175].anInt4044;
					anIntArray279[anInt4851++] = local2943[local175].anInt4045;
					return;
				}
				if (arg0 == 5305) {
					local175 = Static461.anInt8175;
					local776 = Static229.anInt4546;
					local97 = -1;
					@Pc(2978) Class125[] local2978 = Static67.method1170();
					for (local2833 = 0; local2833 < local2978.length; local2833++) {
						@Pc(2985) Class125 local2985 = local2978[local2833];
						if (local2985.anInt4044 == local175 && local2985.anInt4045 == local776) {
							local97 = local2833;
							break;
						}
					}
					anIntArray279[anInt4851++] = local97;
					return;
				}
				if (arg0 == 5306) {
					anIntArray279[anInt4851++] = Static323.method5374();
					return;
				}
				if (arg0 == 5307) {
					local175 = anIntArray279[--anInt4851];
					if (local175 >= 1 && local175 <= 2) {
						Static381.method5938(false, -1, local175, -1);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub17_1.method5501();
					return;
				}
				if (arg0 == 5309) {
					local175 = anIntArray279[--anInt4851];
					if (local175 >= 1 && local175 <= 2) {
						Static348.aClass6_Sub22_19.method3534(local175, Static348.aClass6_Sub22_19.aClass15_Sub17_1);
						Static348.aClass6_Sub22_19.method3534(local175, Static348.aClass6_Sub22_19.aClass15_Sub17_2);
						Static289.method5031();
						return;
					}
					return;
				}
			} else if (arg0 < 5500) {
				if (arg0 == 5400) {
					anInt4839 -= 2;
					local83 = aStringArray38[anInt4839];
					local89 = aStringArray38[anInt4839 + 1];
					local97 = anIntArray279[--anInt4851];
					@Pc(3133) Class6_Sub9 local3133 = Static560.method8089(Static391.aClass126_1, Static72.aClass208_11);
					local3133.aClass6_Sub40_Sub2_1.method8589(Static583.method8194(local83) + Static583.method8194(local89) + 1);
					local3133.aClass6_Sub40_Sub2_1.method8551(local83);
					local3133.aClass6_Sub40_Sub2_1.method8551(local89);
					local3133.aClass6_Sub40_Sub2_1.method8589(local97);
					Static263.method4681(local3133);
					return;
				}
				if (arg0 == 5401) {
					anInt4851 -= 2;
					Static354.aShortArray33[anIntArray279[anInt4851]] = (short) Static537.method7904(anIntArray279[anInt4851 + 1]);
					Static266.aClass138_1.method3734();
					Static266.aClass138_1.method3731();
					Static563.aClass346_2.method8195();
					Static643.method8977();
					return;
				}
				if (arg0 == 5405) {
					anInt4851 -= 2;
					local175 = anIntArray279[anInt4851];
					local776 = anIntArray279[anInt4851 + 1];
					if (local175 >= 0 && local175 < 2) {
						Static408.anIntArrayArrayArray16[local175] = new int[local776 << 1][4];
					}
					return;
				}
				if (arg0 == 5406) {
					anInt4851 -= 7;
					local175 = anIntArray279[anInt4851];
					local776 = anIntArray279[anInt4851 + 1] << 1;
					local97 = anIntArray279[anInt4851 + 2];
					local103 = anIntArray279[anInt4851 + 3];
					local2833 = anIntArray279[anInt4851 + 4];
					@Pc(3271) int local3271 = anIntArray279[anInt4851 + 5];
					@Pc(3277) int local3277 = anIntArray279[anInt4851 + 6];
					if (local175 >= 0 && local175 < 2 && Static408.anIntArrayArrayArray16[local175] != null && local776 >= 0 && local776 < Static408.anIntArrayArrayArray16[local175].length) {
						Static408.anIntArrayArrayArray16[local175][local776] = new int[] { (local97 >> 14 & 0x3FFF) << 9, local103 << 2, (local97 & 0x3FFF) << 9, local3277 };
						Static408.anIntArrayArrayArray16[local175][local776 + 1] = new int[] { (local2833 >> 14 & 0x3FFF) << 9, local3271 << 2, (local2833 & 0x3FFF) << 9 };
					}
					return;
				}
				if (arg0 == 5407) {
					local175 = Static408.anIntArrayArrayArray16[anIntArray279[--anInt4851]].length >> 1;
					anIntArray279[anInt4851++] = local175;
					return;
				}
				if (arg0 == 5411) {
					if (Static476.aFrame6 != null) {
						Static381.method5938(false, -1, Static348.aClass6_Sub22_19.aClass15_Sub17_1.method5501(), -1);
					}
					if (Static70.aFrame3 != null) {
						Static238.method4143();
						System.exit(0);
						return;
					}
					local83 = Static292.aString69 == null ? Static112.method1851() : Static292.aString69;
					Static205.method3578(Static529.aClass112_6, false, Static348.aClass6_Sub22_19.aClass15_Sub22_2.method6681() == 1, local83);
					return;
				}
				if (arg0 == 5419) {
					local83 = "";
					if (Static528.aClass328_7 != null) {
						if (Static528.aClass328_7.anObject21 == null) {
							local83 = Static473.method7152(Static528.aClass328_7.anInt9390);
						} else {
							local83 = (String) Static528.aClass328_7.anObject21;
						}
					}
					aStringArray38[anInt4839++] = local83;
					return;
				}
				if (arg0 == 5420) {
					anIntArray279[anInt4851++] = Static529.aClass112_6.aBoolean263 ? 0 : 1;
					return;
				}
				if (arg0 == 5421) {
					if (Static476.aFrame6 != null) {
						Static381.method5938(false, -1, Static348.aClass6_Sub22_19.aClass15_Sub17_1.method5501(), -1);
					}
					local83 = aStringArray38[--anInt4839];
					local1496 = anIntArray279[--anInt4851] == 1;
					local181 = Static112.method1851() + local83;
					Static205.method3578(Static529.aClass112_6, local1496, Static348.aClass6_Sub22_19.aClass15_Sub22_2.method6681() == 1, local181);
					return;
				}
				if (arg0 == 5422) {
					anInt4839 -= 2;
					local83 = aStringArray38[anInt4839];
					local89 = aStringArray38[anInt4839 + 1];
					local97 = anIntArray279[--anInt4851];
					if (local83.length() > 0) {
						if (Static563.aStringArray69 == null) {
							Static563.aStringArray69 = new String[Static290.anIntArray349[Static630.aClass271_17.anInt8162]];
						}
						Static563.aStringArray69[local97] = local83;
					}
					if (local89.length() > 0) {
						if (Static442.aStringArray55 == null) {
							Static442.aStringArray55 = new String[Static290.anIntArray349[Static630.aClass271_17.anInt8162]];
						}
						Static442.aStringArray55[local97] = local89;
					}
					return;
				}
				if (arg0 == 5423) {
					System.out.println(aStringArray38[--anInt4839]);
					return;
				}
				if (arg0 == 5424) {
					anInt4851 -= 11;
					Static614.anInt10096 = anIntArray279[anInt4851];
					Static228.anInt4473 = anIntArray279[anInt4851 + 1];
					Static54.anInt954 = anIntArray279[anInt4851 + 2];
					Static343.anInt6469 = anIntArray279[anInt4851 + 3];
					Static159.anInt3350 = anIntArray279[anInt4851 + 4];
					Static640.anInt10660 = anIntArray279[anInt4851 + 5];
					Static95.anInt1866 = anIntArray279[anInt4851 + 6];
					Static84.anInt1737 = anIntArray279[anInt4851 + 7];
					Static506.anInt8730 = anIntArray279[anInt4851 + 8];
					Static12.anInt226 = anIntArray279[anInt4851 + 9];
					Static531.anInt9189 = anIntArray279[anInt4851 + 10];
					Static540.aClass353_110.method8401(Static159.anInt3350);
					Static540.aClass353_110.method8401(Static640.anInt10660);
					Static540.aClass353_110.method8401(Static95.anInt1866);
					Static540.aClass353_110.method8401(Static84.anInt1737);
					Static540.aClass353_110.method8401(Static506.anInt8730);
					Static335.aClass32_15 = null;
					Static491.aClass32_37 = null;
					Static617.aClass32_40 = null;
					Static493.aClass32_38 = null;
					Static286.aClass32_13 = null;
					Static412.aClass32_12 = null;
					Static632.aClass32_41 = null;
					Static599.aClass32_39 = null;
					Static270.aBoolean364 = true;
					return;
				}
				if (arg0 == 5425) {
					Static614.method8520();
					Static270.aBoolean364 = false;
					return;
				}
				if (arg0 == 5426) {
					anInt4851 -= 2;
					Static648.anInt10745 = anIntArray279[anInt4851];
					Static8.anInt150 = anIntArray279[anInt4851 + 1];
					return;
				}
				if (arg0 == 5427) {
					anInt4851 -= 2;
					Static140.anInt2652 = anIntArray279[anInt4851 + 1];
					return;
				}
				if (arg0 == 5428) {
					anInt4851 -= 2;
					local175 = anIntArray279[anInt4851];
					local776 = anIntArray279[anInt4851 + 1];
					anIntArray279[anInt4851++] = Static520.method7763(local776, local175) ? 1 : 0;
					return;
				}
				if (arg0 == 5429) {
					Static525.method7812(false, false, aStringArray38[--anInt4839]);
					return;
				}
				if (arg0 == 5430) {
					try {
						Static654.method5164(Static42.anApplet1, "accountcreated");
						return;
					} catch (@Pc(3819) Throwable local3819) {
						return;
					}
				}
				if (arg0 == 5431) {
					try {
						Static654.method5164(Static42.anApplet1, "accountcreatestarted");
						return;
					} catch (@Pc(3830) Throwable local3830) {
						return;
					}
				}
				if (arg0 == 5432) {
					local83 = "";
					if (Static590.aClipboard3 != null) {
						@Pc(3842) Transferable local3842 = Static590.aClipboard3.getContents((Object) null);
						if (local3842 != null) {
							try {
								local83 = (String) local3842.getTransferData(DataFlavor.stringFlavor);
								if (local83 == null) {
									local83 = "";
								}
							} catch (@Pc(3855) Exception local3855) {
							}
						}
					}
					aStringArray38[anInt4839++] = local83;
					return;
				}
				if (arg0 == 5433) {
					Static339.anInt9927 = anIntArray279[--anInt4851];
					return;
				}
			} else if (arg0 < 5600) {
				if (arg0 == 5500) {
					anInt4851 -= 4;
					local175 = anIntArray279[anInt4851];
					local776 = anIntArray279[anInt4851 + 1];
					local97 = anIntArray279[anInt4851 + 2];
					local103 = anIntArray279[anInt4851 + 3];
					Static632.method8764((local175 & 0x3FFF) - Static195.anInt3961, (local175 >> 14 & 0x3FFF) - Static606.anInt8651, local776 << 2, local103, false, local97);
					return;
				}
				if (arg0 == 5501) {
					anInt4851 -= 4;
					local175 = anIntArray279[anInt4851];
					local776 = anIntArray279[anInt4851 + 1];
					local97 = anIntArray279[anInt4851 + 2];
					local103 = anIntArray279[anInt4851 + 3];
					Static461.method7050(local103, (local175 & 0x3FFF) - Static195.anInt3961, local97, local776 << 2, (local175 >> 14 & 0x3FFF) - Static606.anInt8651);
					return;
				}
				if (arg0 == 5502) {
					anInt4851 -= 6;
					local175 = anIntArray279[anInt4851];
					if (local175 >= 2) {
						throw new RuntimeException();
					}
					Static224.anInt4365 = local175;
					local776 = anIntArray279[anInt4851 + 1];
					if (local776 + 1 >= Static408.anIntArrayArrayArray16[Static224.anInt4365].length >> 1) {
						throw new RuntimeException();
					}
					Static322.anInt6164 = local776;
					Static318.anInt6085 = 0;
					Static67.anInt1402 = anIntArray279[anInt4851 + 2];
					Static519.anInt9081 = anIntArray279[anInt4851 + 3];
					local97 = anIntArray279[anInt4851 + 4];
					if (local97 >= 2) {
						throw new RuntimeException();
					}
					Static518.anInt9068 = local97;
					local103 = anIntArray279[anInt4851 + 5];
					if (local103 + 1 >= Static408.anIntArrayArrayArray16[Static518.anInt9068].length >> 1) {
						throw new RuntimeException();
					}
					Static42.anInt849 = local103;
					Static334.anInt6354 = 3;
					Static624.anInt10280 = -1;
					Static160.anInt3352 = -1;
					return;
				}
				if (arg0 == 5503) {
					Static272.method5664();
					return;
				}
				if (arg0 == 5504) {
					anInt4851 -= 2;
					Static117.method1944(anIntArray279[anInt4851 + 1], anIntArray279[anInt4851]);
					return;
				}
				if (arg0 == 5505) {
					anIntArray279[anInt4851++] = (int) Static591.aFloat197 >> 3;
					return;
				}
				if (arg0 == 5506) {
					anIntArray279[anInt4851++] = (int) Static284.aFloat164 >> 3;
					return;
				}
				if (arg0 == 5507) {
					Static113.method1877();
					return;
				}
				if (arg0 == 5508) {
					Static303.method5147();
					return;
				}
				if (arg0 == 5509) {
					Static314.method5238();
					return;
				}
				if (arg0 == 5510) {
					Static510.method7548();
					return;
				}
				if (arg0 == 5511) {
					local175 = anIntArray279[--anInt4851];
					local776 = local175 >> 14 & 0x3FFF;
					local97 = local175 & 0x3FFF;
					local776 -= Static606.anInt8651;
					if (local776 < 0) {
						local776 = 0;
					} else if (local776 >= Static442.anInt7975) {
						local776 = Static442.anInt7975;
					}
					local97 -= Static195.anInt3961;
					if (local97 < 0) {
						local97 = 0;
					} else if (local97 >= Static284.anInt7916) {
						local97 = Static284.anInt7916;
					}
					Static614.anInt10099 = (local776 << 9) + 256;
					Static559.anInt9491 = (local97 << 9) + 256;
					Static334.anInt6354 = 4;
					Static624.anInt10280 = -1;
					Static160.anInt3352 = -1;
					return;
				}
				if (arg0 == 5512) {
					Static427.method6695();
					return;
				}
				if (arg0 == 5514) {
					Static419.anInt7658 = anIntArray279[--anInt4851];
					return;
				}
				if (arg0 == 5516) {
					anIntArray279[anInt4851++] = Static419.anInt7658;
					return;
				}
				if (arg0 == 5517) {
					local175 = anIntArray279[--anInt4851];
					if (local175 == -1) {
						local776 = local175 >> 14 & 0x3FFF;
						local97 = local175 & 0x3FFF;
						local776 -= Static606.anInt8651;
						if (local776 < 0) {
							local776 = 0;
						} else if (local776 >= Static442.anInt7975) {
							local776 = Static442.anInt7975;
						}
						local97 -= Static195.anInt3961;
						if (local97 < 0) {
							local97 = 0;
						} else if (local97 >= Static284.anInt7916) {
							local97 = Static284.anInt7916;
						}
						Static160.anInt3352 = (local776 << 9) + 256;
						Static624.anInt10280 = (local97 << 9) + 256;
						return;
					}
					Static160.anInt3352 = -1;
					Static624.anInt10280 = -1;
					return;
				}
			} else if (arg0 < 5700) {
				if (arg0 == 5600) {
					anInt4839 -= 2;
					local83 = aStringArray38[anInt4839];
					local89 = aStringArray38[anInt4839 + 1];
					local97 = anIntArray279[--anInt4851];
					if (local83.length() > 320) {
						return;
					}
					if (Static554.anInt1821 != 3) {
						return;
					}
					if (Static572.anInt9602 == 0 && Static114.anInt2256 == 0) {
						Static459.aString91 = local83;
						Static286.aString63 = local89;
						Static19.anInt323 = local97;
						Static190.method3390(6);
						return;
					}
					return;
				}
				if (arg0 == 5601) {
					Static545.method7955();
					return;
				}
				if (arg0 == 5602) {
					if (Static572.anInt9602 == 0) {
						Static28.anInt5437 = -2;
						Static576.anInt4602 = -2;
					}
					return;
				}
				if (arg0 == 5604) {
					anInt4839--;
					if (Static554.anInt1821 != 3) {
						return;
					}
					if (Static572.anInt9602 == 0 && Static114.anInt2256 == 0) {
						Static482.method7216(aStringArray38[anInt4839]);
						return;
					}
					return;
				}
				if (arg0 == 5605) {
					anInt4839 -= 2;
					anInt4851 -= 2;
					if (Static554.anInt1821 != 3) {
						return;
					}
					if (Static572.anInt9602 == 0 && Static114.anInt2256 == 0) {
						Static419.method6599(anIntArray279[anInt4851 + 1] == 1, aStringArray38[anInt4839 + 1], anIntArray279[anInt4851], aStringArray38[anInt4839]);
						return;
					}
					return;
				}
				if (arg0 == 5606) {
					if (Static114.anInt2256 == 0) {
						Static612.anInt8715 = -2;
					}
					return;
				}
				if (arg0 == 5607) {
					anIntArray279[anInt4851++] = Static576.anInt4602;
					return;
				}
				if (arg0 == 5608) {
					anIntArray279[anInt4851++] = Static525.anInt9140;
					return;
				}
				if (arg0 == 5609) {
					anIntArray279[anInt4851++] = Static612.anInt8715;
					return;
				}
				if (arg0 == 5611) {
					anIntArray279[anInt4851++] = Static442.anInt7972;
					return;
				}
				if (arg0 == 5612) {
					local175 = anIntArray279[--anInt4851];
					if (Static554.anInt1821 != 7) {
						return;
					}
					if (Static572.anInt9602 == 0 && Static114.anInt2256 == 0) {
						if (Static97.aClass29_1 != null) {
							Static97.aClass29_1.method4606();
							Static97.aClass29_1 = null;
						}
						Static19.anInt323 = local175;
						Static190.method3390(9);
						return;
					}
					return;
				}
				if (arg0 == 5613) {
					anIntArray279[anInt4851++] = Static576.anInt4602;
					return;
				}
				if (arg0 == 5615) {
					anInt4839 -= 2;
					local83 = aStringArray38[anInt4839];
					local89 = aStringArray38[anInt4839 + 1];
					if (local83.length() > 320) {
						return;
					}
					if (Static554.anInt1821 != 3) {
						return;
					}
					if (Static572.anInt9602 == 0 && Static114.anInt2256 == 0) {
						if (Static97.aClass29_1 != null) {
							Static97.aClass29_1.method4606();
							Static97.aClass29_1 = null;
						}
						Static459.aString91 = local83;
						Static286.aString63 = local89;
						Static190.method3390(5);
						return;
					}
					return;
				}
				if (arg0 == 5616) {
					Static126.method2048(false);
					return;
				}
				if (arg0 == 5617) {
					anIntArray279[anInt4851++] = Static28.anInt5437;
					return;
				}
				if (arg0 == 5618) {
					anInt4851--;
					return;
				}
				if (arg0 == 5619) {
					anInt4851--;
					return;
				}
				if (arg0 == 5620) {
					anIntArray279[anInt4851++] = 0;
					return;
				}
				if (arg0 == 5621) {
					anInt4839 -= 2;
					anInt4851 -= 2;
					return;
				}
				if (arg0 == 5622) {
					return;
				}
				if (arg0 == 5623) {
					if (Static362.aString82 != null) {
						anIntArray279[anInt4851++] = 1;
						return;
					}
					anIntArray279[anInt4851++] = 0;
					return;
				}
				if (arg0 == 5624) {
					anIntArray279[anInt4851++] = (int) (Static548.aLong241 >> 32);
					anIntArray279[anInt4851++] = (int) (Static548.aLong241 & 0xFFFFL);
					return;
				}
				if (arg0 == 5625) {
					anIntArray279[anInt4851++] = Static555.aBoolean645 ? 1 : 0;
					return;
				}
				if (arg0 == 5626) {
					Static555.aBoolean645 = true;
					Static522.method7784();
					return;
				}
			} else if (arg0 < 6100) {
				if (arg0 == 6001) {
					local175 = anIntArray279[--anInt4851];
					Static348.aClass6_Sub22_19.method3534(local175, Static348.aClass6_Sub22_19.aClass15_Sub29_1);
					Static348.method5622();
					Static289.method5031();
					Static509.aBoolean584 = false;
					return;
				}
				@Pc(4786) boolean local4786;
				if (arg0 == 6002) {
					local4786 = anIntArray279[--anInt4851] == 1;
					Static348.aClass6_Sub22_19.method3534(local4786 ? 1 : 0, Static348.aClass6_Sub22_19.aClass15_Sub28_1);
					Static348.aClass6_Sub22_19.method3534(local4786 ? 1 : 0, Static348.aClass6_Sub22_19.aClass15_Sub28_2);
					Static348.method5622();
					Static485.method7236();
					Static289.method5031();
					Static509.aBoolean584 = false;
					return;
				}
				if (arg0 == 6003) {
					local4786 = anIntArray279[--anInt4851] == 1;
					Static348.aClass6_Sub22_19.method3534(local4786 ? 2 : 1, Static348.aClass6_Sub22_19.aClass15_Sub10_1);
					Static348.aClass6_Sub22_19.method3534(local4786 ? 2 : 1, Static348.aClass6_Sub22_19.aClass15_Sub10_2);
					Static485.method7236();
					Static289.method5031();
					Static509.aBoolean584 = false;
					return;
				}
				if (arg0 == 6005) {
					Static348.aClass6_Sub22_19.method3534(anIntArray279[--anInt4851] == 1 ? 1 : 0, Static348.aClass6_Sub22_19.aClass15_Sub2_1);
					Static348.method5622();
					Static289.method5031();
					Static509.aBoolean584 = false;
					return;
				}
				if (arg0 == 6007) {
					Static348.aClass6_Sub22_19.method3534(anIntArray279[--anInt4851], Static348.aClass6_Sub22_19.aClass15_Sub21_1);
					Static289.method5031();
					Static509.aBoolean584 = false;
					return;
				}
				if (arg0 == 6008) {
					Static348.aClass6_Sub22_19.method3534(anIntArray279[--anInt4851] == 1 ? 1 : 0, Static348.aClass6_Sub22_19.aClass15_Sub5_1);
					Static289.method5031();
					Static509.aBoolean584 = false;
					return;
				}
				if (arg0 == 6010) {
					Static348.aClass6_Sub22_19.method3534(anIntArray279[--anInt4851] == 1 ? 1 : 0, Static348.aClass6_Sub22_19.aClass15_Sub8_1);
					Static289.method5031();
					Static509.aBoolean584 = false;
					return;
				}
				if (arg0 == 6011) {
					Static348.aClass6_Sub22_19.method3534(anIntArray279[--anInt4851], Static348.aClass6_Sub22_19.aClass15_Sub26_1);
					Static348.method5622();
					Static289.method5031();
					Static509.aBoolean584 = false;
					return;
				}
				if (arg0 == 6012) {
					Static348.aClass6_Sub22_19.method3534(anIntArray279[--anInt4851] == 1 ? 1 : 0, Static348.aClass6_Sub22_19.aClass15_Sub1_1);
					Static499.method7443();
					Static245.method5548();
					Static289.method5031();
					Static509.aBoolean584 = false;
					return;
				}
				if (arg0 == 6014) {
					Static348.aClass6_Sub22_19.method3534(anIntArray279[--anInt4851] == 1 ? 2 : 0, Static348.aClass6_Sub22_19.aClass15_Sub6_1);
					Static348.method5622();
					Static289.method5031();
					Static509.aBoolean584 = false;
					return;
				}
				if (arg0 == 6015) {
					Static348.aClass6_Sub22_19.method3534(anIntArray279[--anInt4851] == 1 ? 1 : 0, Static348.aClass6_Sub22_19.aClass15_Sub23_1);
					Static348.method5622();
					Static289.method5031();
					Static509.aBoolean584 = false;
					return;
				}
				if (arg0 == 6016) {
					Static348.aClass6_Sub22_19.method3534(anIntArray279[--anInt4851], Static348.aClass6_Sub22_19.aClass15_Sub11_1);
					Static278.method4875(Static348.aClass6_Sub22_19.aClass15_Sub22_2.method6681(), false);
					Static289.method5031();
					return;
				}
				if (arg0 == 6017) {
					Static348.aClass6_Sub22_19.method3534(anIntArray279[--anInt4851] == 1 ? 1 : 0, Static348.aClass6_Sub22_19.aClass15_Sub3_1);
					Static167.method3082();
					Static289.method5031();
					Static509.aBoolean584 = false;
					return;
				}
				if (arg0 == 6018) {
					Static348.aClass6_Sub22_19.method3534(anIntArray279[--anInt4851], Static348.aClass6_Sub22_19.aClass15_Sub18_3);
					Static289.method5031();
					Static509.aBoolean584 = false;
					return;
				}
				if (arg0 == 6019) {
					local175 = anIntArray279[--anInt4851];
					local776 = Static348.aClass6_Sub22_19.aClass15_Sub18_2.method5678();
					if (local175 != local776) {
						if (Static283.method5439(Static554.anInt1821)) {
							if (local776 == 0 && Static152.anInt5128 != -1) {
								Static61.method1084(local175, Static364.aClass353_60, Static152.anInt5128);
								Static259.method4619();
								Static166.aBoolean250 = false;
							} else if (local175 == 0) {
								Static604.method8483();
								Static166.aBoolean250 = false;
							} else {
								Static476.method8762(local175);
							}
						}
						Static348.aClass6_Sub22_19.method3534(local175, Static348.aClass6_Sub22_19.aClass15_Sub18_2);
						Static289.method5031();
						Static509.aBoolean584 = false;
					}
					return;
				}
				if (arg0 == 6020) {
					Static348.aClass6_Sub22_19.method3534(anIntArray279[--anInt4851], Static348.aClass6_Sub22_19.lb);
					Static289.method5031();
					Static509.aBoolean584 = false;
					return;
				}
				if (arg0 == 6021) {
					local175 = Static348.aClass6_Sub22_19.aClass15_Sub10_1.method2360();
					Static348.aClass6_Sub22_19.method3534(anIntArray279[--anInt4851] == 1 ? 0 : local175, Static348.aClass6_Sub22_19.aClass15_Sub10_2);
					Static485.method7236();
					return;
				}
				if (arg0 == 6023) {
					local175 = anIntArray279[--anInt4851];
					Static348.aClass6_Sub22_19.method3534(local175, Static348.aClass6_Sub22_19.aClass15_Sub19_1);
					Static289.method5031();
					Static509.aBoolean584 = false;
					return;
				}
				if (arg0 == 6024) {
					Static348.aClass6_Sub22_19.method3534(anIntArray279[--anInt4851], Static348.aClass6_Sub22_19.aClass15_Sub11_2);
					Static289.method5031();
					return;
				}
				if (arg0 == 6025) {
					Static348.aClass6_Sub22_19.method3534(anIntArray279[--anInt4851], Static348.aClass6_Sub22_19.aClass15_Sub24_1);
					Static289.method5031();
					Static509.aBoolean584 = false;
					return;
				}
				if (arg0 == 6027) {
					local175 = anIntArray279[--anInt4851];
					if (local175 < 0 || local175 > 1) {
						local175 = 0;
					}
					Static448.method6930(local175 == 1);
					return;
				}
				if (arg0 == 6028) {
					Static348.aClass6_Sub22_19.method3534(anIntArray279[--anInt4851] == 0 ? 0 : 1, Static348.aClass6_Sub22_19.aClass15_Sub7_1);
					Static289.method5031();
					return;
				}
				if (arg0 == 6029) {
					Static348.aClass6_Sub22_19.method3534(anIntArray279[--anInt4851], Static348.aClass6_Sub22_19.aClass15_Sub21_1);
					Static289.method5031();
					return;
				}
				if (arg0 == 6030) {
					Static348.aClass6_Sub22_19.method3534(anIntArray279[--anInt4851] == 0 ? 0 : 1, Static348.aClass6_Sub22_19.aClass15_Sub14_1);
					Static289.method5031();
					Static348.method5622();
					return;
				}
				if (arg0 == 6031) {
					local175 = anIntArray279[--anInt4851];
					if (local175 < 0 || local175 > 5) {
						local175 = 2;
					}
					Static278.method4875(local175, false);
					return;
				}
				if (arg0 == 6032) {
					anInt4851 -= 2;
					local175 = anIntArray279[anInt4851];
					local1496 = anIntArray279[anInt4851 + 1] == 1;
					Static348.aClass6_Sub22_19.method3534(local175, Static348.aClass6_Sub22_19.aClass15_Sub22_1);
					if (!local1496) {
						Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub13_1);
					}
					Static289.method5031();
					Static509.aBoolean584 = false;
					return;
				}
				if (arg0 == 6033) {
					Static348.aClass6_Sub22_19.method3534(anIntArray279[--anInt4851], Static348.aClass6_Sub22_19.aClass15_Sub9_1);
					Static289.method5031();
					return;
				}
				if (arg0 == 6034) {
					Static348.aClass6_Sub22_19.method3534(anIntArray279[--anInt4851] == 1 ? 1 : 0, Static348.aClass6_Sub22_19.aClass15_Sub27_1);
					Static289.method5031();
					Static499.method7443();
					Static509.aBoolean584 = false;
					return;
				}
				if (arg0 == 6035) {
					local175 = Static348.aClass6_Sub22_19.aClass15_Sub28_1.method8677();
					Static348.aClass6_Sub22_19.method3534(anIntArray279[--anInt4851] == 1 ? 1 : local175, Static348.aClass6_Sub22_19.aClass15_Sub28_2);
					Static348.method5622();
					Static485.method7236();
					return;
				}
				if (arg0 == 6036) {
					Static348.aClass6_Sub22_19.method3534(anIntArray279[--anInt4851], Static348.aClass6_Sub22_19.aClass15_Sub16_1);
					Static289.method5031();
					Static585.aBoolean670 = true;
					return;
				}
				if (arg0 == 6037) {
					Static348.aClass6_Sub22_19.method3534(anIntArray279[--anInt4851], Static348.aClass6_Sub22_19.aClass15_Sub18_4);
					Static289.method5031();
					Static509.aBoolean584 = false;
					return;
				}
				if (arg0 == 6038) {
					local175 = anIntArray279[--anInt4851];
					local776 = Static348.aClass6_Sub22_19.aClass15_Sub18_1.method5678();
					if (local175 != local776 && Static152.anInt5128 == Static416.anInt7577) {
						if (!Static283.method5439(Static554.anInt1821)) {
							if (local776 == 0) {
								Static61.method1084(local175, Static364.aClass353_60, Static152.anInt5128);
								Static259.method4619();
								Static166.aBoolean250 = false;
							} else if (local175 == 0) {
								Static604.method8483();
								Static166.aBoolean250 = false;
							} else {
								Static476.method8762(local175);
							}
						}
						Static348.aClass6_Sub22_19.method3534(local175, Static348.aClass6_Sub22_19.aClass15_Sub18_1);
						Static289.method5031();
						Static509.aBoolean584 = false;
					}
					return;
				}
				if (arg0 == 6039) {
					local175 = anIntArray279[--anInt4851];
					if (local175 > 255 || local175 < 0) {
						local175 = 0;
					}
					if (local175 != Static348.aClass6_Sub22_19.aClass15_Sub4_1.method1204()) {
						Static348.aClass6_Sub22_19.method3534(local175, Static348.aClass6_Sub22_19.aClass15_Sub4_1);
						Static289.method5031();
						Static509.aBoolean584 = false;
					}
					return;
				}
				if (arg0 == 6040) {
					local175 = anIntArray279[--anInt4851];
					if (local175 != Static348.aClass6_Sub22_19.aClass15_Sub15_1.method5047()) {
						Static348.aClass6_Sub22_19.method3534(local175, Static348.aClass6_Sub22_19.aClass15_Sub15_1);
						Static289.method5031();
						Static509.aBoolean584 = false;
						Static350.method5633();
					}
					return;
				}
			} else if (arg0 < 6200) {
				if (arg0 == 6101) {
					anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub29_1.method8995();
					return;
				}
				if (arg0 == 6102) {
					anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub28_1.method8677() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6103) {
					anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub10_1.method2360() == 2 ? 1 : 0;
					return;
				}
				if (arg0 == 6105) {
					anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub2_1.method484() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6107) {
					anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub21_1.method6488();
					return;
				}
				if (arg0 == 6108) {
					anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub5_1.method1404() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6110) {
					anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub8_1.method2004() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6111) {
					anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub26_1.method8642();
					return;
				}
				if (arg0 == 6112) {
					anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub1_1.method331() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6114) {
					anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub6_1.method1414() == 2 ? 1 : 0;
					return;
				}
				if (arg0 == 6115) {
					anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub23_1.method8214() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6116) {
					anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub11_1.method4165();
					return;
				}
				if (arg0 == 6117) {
					anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub3_1.method1042() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6118) {
					anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub18_3.method5678();
					return;
				}
				if (arg0 == 6119) {
					anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub18_2.method5678();
					return;
				}
				if (arg0 == 6120) {
					anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.lb.method5678();
					return;
				}
				if (arg0 == 6123) {
					anIntArray279[anInt4851++] = Static556.method8014();
					return;
				}
				if (arg0 == 6124) {
					anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub11_2.method4165();
					return;
				}
				if (arg0 == 6125) {
					anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub24_1.method8343();
					return;
				}
				if (arg0 == 6127) {
					anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub25_1.method8355() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6128) {
					anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub7_1.method1752() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6129) {
					anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub21_1.method6488();
					return;
				}
				if (arg0 == 6130) {
					anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub14_1.method4651() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6131) {
					anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub22_2.method6681();
					return;
				}
				if (arg0 == 6132) {
					anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub22_1.method6681();
					return;
				}
				if (arg0 == 6133) {
					anIntArray279[anInt4851++] = Static529.aClass112_6.aBoolean263 && !Static529.aClass112_6.aBoolean264 ? 1 : 0;
					return;
				}
				if (arg0 == 6135) {
					anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub9_1.method2203();
					return;
				}
				if (arg0 == 6136) {
					anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub27_1.method8659() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6138) {
					anIntArray279[anInt4851++] = Static385.method6196(Static348.aClass6_Sub22_19.aClass15_Sub22_2.method6681(), 200);
					return;
				}
				if (arg0 == 6139) {
					anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub16_1.method5372();
					return;
				}
				if (arg0 == 6142) {
					anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub18_4.method5678();
					return;
				}
				if (arg0 == 6143) {
					anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub18_1.method5678();
					return;
				}
				if (arg0 == 6144) {
					anIntArray279[anInt4851++] = Static265.aBoolean261 ? 1 : 0;
					return;
				}
				if (arg0 == 6145) {
					anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub4_1.method1204();
					return;
				}
				if (arg0 == 6146) {
					anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub15_1.method5047();
					return;
				}
				if (arg0 == 6147) {
					anIntArray279[anInt4851++] = Static428.aClass6_Sub28_1.anInt6061 < 512 || Static265.aBoolean261 || Static441.aBoolean529 ? 1 : 0;
					return;
				}
				if (arg0 == 6148) {
					anIntArray279[anInt4851++] = Static536.aBoolean632 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6300) {
				if (arg0 == 6200) {
					anInt4851 -= 2;
					Static172.aShort45 = (short) anIntArray279[anInt4851];
					if (Static172.aShort45 <= 0) {
						Static172.aShort45 = 256;
					}
					Static261.aShort60 = (short) anIntArray279[anInt4851 + 1];
					if (Static261.aShort60 <= 0) {
						Static261.aShort60 = 205;
					}
					return;
				}
				if (arg0 == 6201) {
					anInt4851 -= 2;
					Static641.aShort121 = (short) anIntArray279[anInt4851];
					if (Static641.aShort121 <= 0) {
						Static641.aShort121 = 256;
					}
					Static509.aShort110 = (short) anIntArray279[anInt4851 + 1];
					if (Static509.aShort110 <= 0) {
						Static509.aShort110 = 320;
					}
					return;
				}
				if (arg0 == 6202) {
					anInt4851 -= 4;
					Static308.aShort65 = (short) anIntArray279[anInt4851];
					if (Static308.aShort65 <= 0) {
						Static308.aShort65 = 1;
					}
					Static425.aShort83 = (short) anIntArray279[anInt4851 + 1];
					if (Static425.aShort83 <= 0) {
						Static425.aShort83 = 32767;
					} else if (Static425.aShort83 < Static308.aShort65) {
						Static425.aShort83 = Static308.aShort65;
					}
					Static325.aShort70 = (short) anIntArray279[anInt4851 + 2];
					if (Static325.aShort70 <= 0) {
						Static325.aShort70 = 1;
					}
					Static554.aShort27 = (short) anIntArray279[anInt4851 + 3];
					if (Static554.aShort27 <= 0) {
						Static554.aShort27 = 32767;
						return;
					}
					if (Static554.aShort27 < Static325.aShort70) {
						Static554.aShort27 = Static325.aShort70;
					}
					return;
				}
				if (arg0 == 6203) {
					Static416.method6534(Static196.aClass302_28.anInt8814, 0, false, Static196.aClass302_28.anInt8801, 0);
					anIntArray279[anInt4851++] = Static552.anInt9421;
					anIntArray279[anInt4851++] = Static116.anInt2278;
					return;
				}
				if (arg0 == 6204) {
					anIntArray279[anInt4851++] = Static641.aShort121;
					anIntArray279[anInt4851++] = Static509.aShort110;
					return;
				}
				if (arg0 == 6205) {
					anIntArray279[anInt4851++] = Static172.aShort45;
					anIntArray279[anInt4851++] = Static261.aShort60;
					return;
				}
			} else if (arg0 < 6400) {
				if (arg0 == 6300) {
					anIntArray279[anInt4851++] = (int) (Static32.method595() / 60000L);
					return;
				}
				if (arg0 == 6301) {
					anIntArray279[anInt4851++] = (int) (Static32.method595() / 86400000L) - 11745;
					return;
				}
				if (arg0 == 6302) {
					anInt4851 -= 3;
					local175 = anIntArray279[anInt4851];
					local776 = anIntArray279[anInt4851 + 1];
					local97 = anIntArray279[anInt4851 + 2];
					aCalendar4.clear();
					aCalendar4.set(11, 12);
					aCalendar4.set(local97, local776, local175);
					local103 = (int) (aCalendar4.getTime().getTime() / 86400000L) - 11745;
					if (local97 < 1970) {
						local103--;
					}
					anIntArray279[anInt4851++] = local103;
					return;
				}
				if (arg0 == 6303) {
					aCalendar4.clear();
					aCalendar4.setTime(new Date(Static32.method595()));
					anIntArray279[anInt4851++] = aCalendar4.get(1);
					return;
				}
				if (arg0 == 6304) {
					local175 = anIntArray279[--anInt4851];
					local1496 = true;
					if (local175 < 0) {
						local1496 = (local175 + 1) % 4 == 0;
					} else if (local175 < 1582) {
						local1496 = local175 % 4 == 0;
					} else if (local175 % 4 != 0) {
						local1496 = false;
					} else if (local175 % 100 != 0) {
						local1496 = true;
					} else if (local175 % 400 != 0) {
						local1496 = false;
					}
					anIntArray279[anInt4851++] = local1496 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6500) {
				if (arg0 == 6405) {
					anIntArray279[anInt4851++] = Static340.method5774() ? 1 : 0;
					return;
				}
				if (arg0 == 6406) {
					anIntArray279[anInt4851++] = Static26.method457() ? 1 : 0;
					return;
				}
			} else if (arg0 < 6600) {
				if (arg0 == 6500) {
					if (Static554.anInt1821 == 7 && Static572.anInt9602 == 0 && Static114.anInt2256 == 0) {
						if (Static396.aBoolean501) {
							anIntArray279[anInt4851++] = 0;
							return;
						}
						if (Static257.aLong128 > Static32.method595() - 1000L) {
							anIntArray279[anInt4851++] = 1;
							return;
						}
						Static396.aBoolean501 = true;
						local52 = Static560.method8089(Static391.aClass126_1, Static313.aClass208_50);
						local52.aClass6_Sub40_Sub2_1.method8554(Static169.anInt3515);
						Static263.method4681(local52);
						anIntArray279[anInt4851++] = 0;
						return;
					}
					anIntArray279[anInt4851++] = 1;
					return;
				}
				@Pc(6862) Class367 local6862;
				@Pc(6829) Class51_Sub1 local6829;
				if (arg0 == 6501) {
					local6829 = Static420.method6604();
					if (local6829 != null) {
						anIntArray279[anInt4851++] = local6829.anInt1514;
						anIntArray279[anInt4851++] = local6829.anInt1504;
						aStringArray38[anInt4839++] = local6829.aString14;
						local6862 = local6829.method1289();
						anIntArray279[anInt4851++] = local6862.anInt10222;
						aStringArray38[anInt4839++] = local6862.aString115;
						anIntArray279[anInt4851++] = local6829.anInt1506;
						anIntArray279[anInt4851++] = local6829.anInt1513;
						aStringArray38[anInt4839++] = local6829.aString15;
						return;
					}
					anIntArray279[anInt4851++] = -1;
					anIntArray279[anInt4851++] = 0;
					aStringArray38[anInt4839++] = "";
					anIntArray279[anInt4851++] = 0;
					aStringArray38[anInt4839++] = "";
					anIntArray279[anInt4851++] = 0;
					anIntArray279[anInt4851++] = 0;
					aStringArray38[anInt4839++] = "";
					return;
				}
				if (arg0 == 6502) {
					local6829 = Static356.method5695();
					if (local6829 != null) {
						anIntArray279[anInt4851++] = local6829.anInt1514;
						anIntArray279[anInt4851++] = local6829.anInt1504;
						aStringArray38[anInt4839++] = local6829.aString14;
						local6862 = local6829.method1289();
						anIntArray279[anInt4851++] = local6862.anInt10222;
						aStringArray38[anInt4839++] = local6862.aString115;
						anIntArray279[anInt4851++] = local6829.anInt1506;
						anIntArray279[anInt4851++] = local6829.anInt1513;
						aStringArray38[anInt4839++] = local6829.aString15;
						return;
					}
					anIntArray279[anInt4851++] = -1;
					anIntArray279[anInt4851++] = 0;
					aStringArray38[anInt4839++] = "";
					anIntArray279[anInt4851++] = 0;
					aStringArray38[anInt4839++] = "";
					anIntArray279[anInt4851++] = 0;
					anIntArray279[anInt4851++] = 0;
					aStringArray38[anInt4839++] = "";
					return;
				}
				if (arg0 == 6503) {
					local175 = anIntArray279[--anInt4851];
					local89 = aStringArray38[--anInt4839];
					if (Static554.anInt1821 == 7 && Static572.anInt9602 == 0 && Static114.anInt2256 == 0) {
						anIntArray279[anInt4851++] = Static470.method7121(local175, local89) ? 1 : 0;
						return;
					}
					anIntArray279[anInt4851++] = 0;
					return;
				}
				if (arg0 == 6506) {
					local175 = anIntArray279[--anInt4851];
					@Pc(7189) Class51_Sub1 local7189 = Static499.method7445(local175);
					if (local7189 != null) {
						anIntArray279[anInt4851++] = local7189.anInt1504;
						aStringArray38[anInt4839++] = local7189.aString14;
						@Pc(7213) Class367 local7213 = local7189.method1289();
						anIntArray279[anInt4851++] = local7213.anInt10222;
						aStringArray38[anInt4839++] = local7213.aString115;
						anIntArray279[anInt4851++] = local7189.anInt1506;
						anIntArray279[anInt4851++] = local7189.anInt1513;
						aStringArray38[anInt4839++] = local7189.aString15;
						return;
					}
					anIntArray279[anInt4851++] = -1;
					aStringArray38[anInt4839++] = "";
					anIntArray279[anInt4851++] = 0;
					aStringArray38[anInt4839++] = "";
					anIntArray279[anInt4851++] = 0;
					anIntArray279[anInt4851++] = 0;
					aStringArray38[anInt4839++] = "";
					return;
				}
				if (arg0 == 6507) {
					anInt4851 -= 4;
					local175 = anIntArray279[anInt4851];
					local1496 = anIntArray279[anInt4851 + 1] == 1;
					local97 = anIntArray279[anInt4851 + 2];
					local2107 = anIntArray279[anInt4851 + 3] == 1;
					Static360.method5722(local1496, local175, local2107, local97);
					return;
				}
				if (arg0 == 6508) {
					Static60.method1080();
					return;
				}
				if (arg0 == 6509) {
					if (Static554.anInt1821 != 7) {
						return;
					}
					Static511.aBoolean603 = anIntArray279[--anInt4851] == 1;
					return;
				}
				if (arg0 == 6510) {
					anIntArray279[anInt4851++] = Static262.anInt5209;
					return;
				}
			} else if (arg0 >= 6700) {
				if (arg0 < 6800 && Static579.aClass47_6 == Static253.aClass47_5) {
					if (arg0 == 6700) {
						local175 = Static507.aClass128_42.method3554();
						if (Static554.anInt1822 != -1) {
							local175++;
						}
						anIntArray279[anInt4851++] = local175;
						return;
					}
					if (arg0 == 6701) {
						local175 = anIntArray279[--anInt4851];
						if (Static554.anInt1822 != -1) {
							if (local175 == 0) {
								anIntArray279[anInt4851++] = Static554.anInt1822;
								return;
							}
							local175--;
						}
						@Pc(7461) Class6_Sub29 local7461 = (Class6_Sub29) Static507.aClass128_42.method3556();
						while (local175-- > 0) {
							local7461 = (Class6_Sub29) Static507.aClass128_42.method3555();
						}
						anIntArray279[anInt4851++] = local7461.anInt6361;
						return;
					}
					if (arg0 == 6702) {
						local175 = anIntArray279[--anInt4851];
						if (Static605.aClass302ArrayArray4[local175] == null) {
							aStringArray38[anInt4839++] = "";
							return;
						}
						local89 = Static605.aClass302ArrayArray4[local175][0].aString102;
						if (local89 == null) {
							aStringArray38[anInt4839++] = "";
							return;
						}
						aStringArray38[anInt4839++] = local89.substring(0, local89.indexOf(58));
						return;
					}
					if (arg0 == 6703) {
						local175 = anIntArray279[--anInt4851];
						if (Static605.aClass302ArrayArray4[local175] == null) {
							anIntArray279[anInt4851++] = 0;
							return;
						}
						anIntArray279[anInt4851++] = Static605.aClass302ArrayArray4[local175].length;
						return;
					}
					if (arg0 == 6704) {
						anInt4851 -= 2;
						local175 = anIntArray279[anInt4851];
						local776 = anIntArray279[anInt4851 + 1];
						if (Static605.aClass302ArrayArray4[local175] == null) {
							aStringArray38[anInt4839++] = "";
							return;
						}
						local181 = Static605.aClass302ArrayArray4[local175][local776].aString102;
						if (local181 == null) {
							aStringArray38[anInt4839++] = "";
							return;
						}
						aStringArray38[anInt4839++] = local181;
						return;
					}
					if (arg0 == 6705) {
						anInt4851 -= 2;
						local175 = anIntArray279[anInt4851];
						local776 = anIntArray279[anInt4851 + 1];
						if (Static605.aClass302ArrayArray4[local175] == null) {
							anIntArray279[anInt4851++] = 0;
							return;
						}
						anIntArray279[anInt4851++] = Static605.aClass302ArrayArray4[local175][local776].anInt8797;
						return;
					}
					if (arg0 == 6706) {
						return;
					}
					if (arg0 == 6707) {
						anInt4851 -= 3;
						local175 = anIntArray279[anInt4851];
						local776 = anIntArray279[anInt4851 + 1];
						local97 = anIntArray279[anInt4851 + 2];
						Static418.method6583(local175 << 16 | local776, "", local97, 1);
						return;
					}
					if (arg0 == 6708) {
						anInt4851 -= 3;
						local175 = anIntArray279[anInt4851];
						local776 = anIntArray279[anInt4851 + 1];
						local97 = anIntArray279[anInt4851 + 2];
						Static418.method6583(local175 << 16 | local776, "", local97, 2);
						return;
					}
					if (arg0 == 6709) {
						anInt4851 -= 3;
						local175 = anIntArray279[anInt4851];
						local776 = anIntArray279[anInt4851 + 1];
						local97 = anIntArray279[anInt4851 + 2];
						Static418.method6583(local175 << 16 | local776, "", local97, 3);
						return;
					}
					if (arg0 == 6710) {
						anInt4851 -= 3;
						local175 = anIntArray279[anInt4851];
						local776 = anIntArray279[anInt4851 + 1];
						local97 = anIntArray279[anInt4851 + 2];
						Static418.method6583(local175 << 16 | local776, "", local97, 4);
						return;
					}
					if (arg0 == 6711) {
						anInt4851 -= 3;
						local175 = anIntArray279[anInt4851];
						local776 = anIntArray279[anInt4851 + 1];
						local97 = anIntArray279[anInt4851 + 2];
						Static418.method6583(local175 << 16 | local776, "", local97, 5);
						return;
					}
					if (arg0 == 6712) {
						anInt4851 -= 3;
						local175 = anIntArray279[anInt4851];
						local776 = anIntArray279[anInt4851 + 1];
						local97 = anIntArray279[anInt4851 + 2];
						Static418.method6583(local175 << 16 | local776, "", local97, 6);
						return;
					}
					if (arg0 == 6713) {
						anInt4851 -= 3;
						local175 = anIntArray279[anInt4851];
						local776 = anIntArray279[anInt4851 + 1];
						local97 = anIntArray279[anInt4851 + 2];
						Static418.method6583(local175 << 16 | local776, "", local97, 7);
						return;
					}
					if (arg0 == 6714) {
						anInt4851 -= 3;
						local175 = anIntArray279[anInt4851];
						local776 = anIntArray279[anInt4851 + 1];
						local97 = anIntArray279[anInt4851 + 2];
						Static418.method6583(local175 << 16 | local776, "", local97, 8);
						return;
					}
					if (arg0 == 6715) {
						anInt4851 -= 3;
						local175 = anIntArray279[anInt4851];
						local776 = anIntArray279[anInt4851 + 1];
						local97 = anIntArray279[anInt4851 + 2];
						Static418.method6583(local175 << 16 | local776, "", local97, 9);
						return;
					}
					if (arg0 == 6716) {
						anInt4851 -= 3;
						local175 = anIntArray279[anInt4851];
						local776 = anIntArray279[anInt4851 + 1];
						local97 = anIntArray279[anInt4851 + 2];
						Static418.method6583(local175 << 16 | local776, "", local97, 10);
						return;
					}
					if (arg0 == 6717) {
						anInt4851 -= 3;
						local175 = anIntArray279[anInt4851];
						local776 = anIntArray279[anInt4851 + 1];
						local97 = anIntArray279[anInt4851 + 2];
						@Pc(8049) Class302 local8049 = Static110.method1816(local175 << 16 | local776, local97);
						Static633.method8924();
						@Pc(8054) Class6_Sub47 local8054 = Static78.method1364(local8049);
						Static326.method5411(local8054.method8147(), local8049, local8054.anInt9598);
						return;
					}
				} else if (arg0 < 6900) {
					@Pc(8082) Class105 local8082;
					if (arg0 == 6800) {
						local175 = anIntArray279[--anInt4851];
						local8082 = Static184.aClass337_2.method8119(local175);
						if (local8082.aString35 == null) {
							aStringArray38[anInt4839++] = "";
							return;
						}
						aStringArray38[anInt4839++] = local8082.aString35;
						return;
					}
					if (arg0 == 6801) {
						local175 = anIntArray279[--anInt4851];
						local8082 = Static184.aClass337_2.method8119(local175);
						anIntArray279[anInt4851++] = local8082.anInt3413;
						return;
					}
					if (arg0 == 6802) {
						local175 = anIntArray279[--anInt4851];
						local8082 = Static184.aClass337_2.method8119(local175);
						anIntArray279[anInt4851++] = local8082.anInt3418;
						return;
					}
					if (arg0 == 6803) {
						local175 = anIntArray279[--anInt4851];
						local8082 = Static184.aClass337_2.method8119(local175);
						anIntArray279[anInt4851++] = local8082.anInt3392;
						return;
					}
					if (arg0 == 6804) {
						anInt4851 -= 2;
						local175 = anIntArray279[anInt4851];
						local776 = anIntArray279[anInt4851 + 1];
						@Pc(8204) Class223 local8204 = Static26.aClass179_1.method5148(local776);
						if (local8204.method5911()) {
							aStringArray38[anInt4839++] = Static184.aClass337_2.method8119(local175).method3043(local776, local8204.aString83);
							return;
						}
						anIntArray279[anInt4851++] = Static184.aClass337_2.method8119(local175).method3036(local8204.anInt6887, local776);
						return;
					}
				} else if (arg0 < 7000) {
					if (arg0 == 6900) {
						anIntArray279[anInt4851++] = Static461.aBoolean555 && !Static279.aBoolean370 ? 1 : 0;
						return;
					}
					if (arg0 == 6901) {
						anIntArray279[anInt4851++] = Static97.anInt1910;
						return;
					}
					if (arg0 == 6902) {
						anIntArray279[anInt4851++] = Static349.anInt6551;
						return;
					}
					if (arg0 == 6903) {
						anIntArray279[anInt4851++] = Static348.anInt6549;
						return;
					}
					if (arg0 == 6904) {
						anIntArray279[anInt4851++] = Static95.anInt1862;
						return;
					}
					if (arg0 == 6905) {
						local83 = "";
						if (Static528.aClass328_7 != null) {
							if (Static528.aClass328_7.anObject21 == null) {
								local83 = Static473.method7152(Static528.aClass328_7.anInt9390);
							} else {
								local83 = (String) Static528.aClass328_7.anObject21;
							}
						}
						aStringArray38[anInt4839++] = local83;
						return;
					}
					if (arg0 == 6906) {
						anIntArray279[anInt4851++] = Static16.anInt282;
						return;
					}
					if (arg0 == 6907) {
						anIntArray279[anInt4851++] = Static153.anInt2792;
						return;
					}
					if (arg0 == 6908) {
						anIntArray279[anInt4851++] = Static206.anInt4093;
						return;
					}
					if (arg0 == 6909) {
						anIntArray279[anInt4851++] = Static54.aBoolean51 ? 1 : 0;
						return;
					}
					if (arg0 == 6910) {
						anIntArray279[anInt4851++] = Static613.anInt10091;
						return;
					}
					if (arg0 == 6911) {
						anIntArray279[anInt4851++] = Static393.anInt7369;
						return;
					}
					if (arg0 == 6912) {
						anIntArray279[anInt4851++] = Static19.anInt324;
						return;
					}
				} else if (arg0 < 7100) {
					if (arg0 == 7000) {
						local175 = Static114.method1889();
						anIntArray279[anInt4851++] = Static65.anInt1391 = Static348.aClass6_Sub22_19.aClass15_Sub22_2.method6681();
						anIntArray279[anInt4851++] = local175;
						Static348.method5622();
						Static289.method5031();
						Static509.aBoolean584 = false;
						return;
					}
					if (arg0 == 7001) {
						Static308.method5205();
						Static348.method5622();
						Static289.method5031();
						Static509.aBoolean584 = false;
						return;
					}
					if (arg0 == 7002) {
						Static600.method8452();
						Static348.method5622();
						Static289.method5031();
						Static509.aBoolean584 = false;
						return;
					}
					if (arg0 == 7003) {
						Static112.method1848();
						Static348.method5622();
						Static289.method5031();
						Static509.aBoolean584 = false;
						return;
					}
					if (arg0 == 7004) {
						Static488.method8558();
						Static348.method5622();
						Static289.method5031();
						Static509.aBoolean584 = false;
						return;
					}
					if (arg0 == 7005) {
						Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub13_1);
						Static289.method5031();
						Static509.aBoolean584 = false;
						return;
					}
					if (arg0 == 7006) {
						if (Static65.anInt1391 == 2) {
							Static130.aBoolean182 = true;
							return;
						}
						if (Static65.anInt1391 == 1) {
							Static146.aBoolean366 = true;
							return;
						}
						if (Static65.anInt1391 == 3) {
							Static551.aBoolean641 = true;
						}
						return;
					}
					if (arg0 == 7007) {
						anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub13_1.method4270();
						return;
					}
				} else if (arg0 < 7200) {
					if (arg0 == 7100) {
						anInt4851 -= 2;
						local175 = anIntArray279[anInt4851];
						local776 = anIntArray279[anInt4851 + 1];
						if (local175 != -1) {
							if (local776 > 255) {
								local776 = 255;
							} else if (local776 < 0) {
								local776 = 0;
							}
							Static559.method8058(local776, false, local175);
						}
						return;
					}
					if (arg0 == 7101) {
						local175 = anIntArray279[--anInt4851];
						if (local175 != -1) {
							Static366.method5801(local175);
						}
						return;
					}
					if (arg0 == 7102) {
						local175 = anIntArray279[--anInt4851];
						if (local175 != -1) {
							Static258.method4616(local175);
						}
						return;
					}
					if (arg0 == 7103) {
						anIntArray279[anInt4851++] = Static227.method3878("jagtheora") ? 1 : 0;
						return;
					}
				} else if (arg0 < 7300) {
					if (arg0 == 7201) {
						anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub2_1.method483() ? 1 : 0;
						return;
					}
					if (arg0 == 7202) {
						anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub8_1.method2005() ? 1 : 0;
						return;
					}
					if (arg0 == 7203) {
						anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub26_1.method8641() ? 1 : 0;
						return;
					}
					if (arg0 == 7204) {
						anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub6_1.method1417() ? 1 : 0;
						return;
					}
					if (arg0 == 7205) {
						anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub11_2.method4160() && Static162.aClass100_7.method8840() ? 1 : 0;
						return;
					}
					if (arg0 == 7206) {
						anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub19_1.method5697() ? 1 : 0;
						return;
					}
					if (arg0 == 7207) {
						anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub24_1.method8341() ? 1 : 0;
						return;
					}
					if (arg0 == 7208) {
						anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub25_1.method8354() && Static162.aClass100_7.method8836() ? 1 : 0;
						return;
					}
					if (arg0 == 7209) {
						anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub14_1.method4649() ? 1 : 0;
						return;
					}
					if (arg0 == 7210) {
						anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub27_1.method8662() ? 1 : 0;
						return;
					}
					if (arg0 == 7211) {
						anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub16_1.method5377() ? 1 : 0;
						return;
					}
					if (arg0 == 7212) {
						anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub23_1.method8213() ? 1 : 0;
						return;
					}
					if (arg0 == 7213) {
						anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub15_1.method5049() ? 1 : 0;
						return;
					}
					if (arg0 == 7214) {
						anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub22_1.method6677() ? 1 : 0;
						return;
					}
				} else if (arg0 < 7400) {
					if (arg0 == 7301) {
						local175 = anIntArray279[--anInt4851];
						anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub2_1.method8990(local175);
						return;
					}
					if (arg0 == 7302) {
						local175 = anIntArray279[--anInt4851];
						anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub8_1.method8990(local175);
						return;
					}
					if (arg0 == 7303) {
						local175 = anIntArray279[--anInt4851];
						anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub26_1.method8990(local175);
						return;
					}
					if (arg0 == 7304) {
						local175 = anIntArray279[--anInt4851];
						anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub6_1.method8990(local175);
						return;
					}
					if (arg0 == 7305) {
						local175 = anIntArray279[--anInt4851];
						if (!Static162.aClass100_7.method8840()) {
							anIntArray279[anInt4851++] = 3;
							return;
						}
						anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub11_2.method8990(local175);
						return;
					}
					if (arg0 == 7306) {
						local175 = anIntArray279[--anInt4851];
						anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub19_1.method8990(local175);
						return;
					}
					if (arg0 == 7307) {
						local175 = anIntArray279[--anInt4851];
						anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub24_1.method8990(local175);
						return;
					}
					if (arg0 == 7308) {
						local175 = anIntArray279[--anInt4851];
						if (!Static162.aClass100_7.method8836()) {
							anIntArray279[anInt4851++] = 3;
							return;
						}
						anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub25_1.method8990(local175);
						return;
					}
					if (arg0 == 7309) {
						local175 = anIntArray279[--anInt4851];
						anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub14_1.method8990(local175);
						return;
					}
					if (arg0 == 7310) {
						local175 = anIntArray279[--anInt4851];
						anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub27_1.method8990(local175);
						return;
					}
					if (arg0 == 7311) {
						local175 = anIntArray279[--anInt4851];
						anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub16_1.method8990(local175);
						return;
					}
					if (arg0 == 7312) {
						local175 = anIntArray279[--anInt4851];
						anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub23_1.method8990(local175);
						return;
					}
					if (arg0 == 7313) {
						local175 = anIntArray279[--anInt4851];
						anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub15_1.method8990(local175);
						return;
					}
					if (arg0 == 7314) {
						local175 = anIntArray279[--anInt4851];
						anIntArray279[anInt4851++] = Static348.aClass6_Sub22_19.aClass15_Sub22_1.method8990(local175);
						return;
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!dca;I)V")
	private static void method4196(@OriginalArg(0) Class6_Sub10 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray1;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class6_Sub2_Sub18 local12 = Static620.method8991(local8);
		if (local12 == null) {
			return;
		}
		anIntArray280 = new int[local12.anInt8692];
		@Pc(21) int local21 = 0;
		aStringArray37 = new String[local12.anInt8695];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt1851;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt1847;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass302_14 == null ? -1 : arg0.aClass302_14.anInt8838;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt1848;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass302_14 == null ? -1 : arg0.aClass302_14.anInt8834;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass302_15 == null ? -1 : arg0.aClass302_15.anInt8838;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass302_15 == null ? -1 : arg0.aClass302_15.anInt8834;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt1850;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt1849;
				}
				anIntArray280[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString23;
				}
				aStringArray37[local27++] = local135;
			}
		}
		anInt4853 = arg0.anInt1853;
		method4202(local12, arg1);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method4198(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static578.anInt6641 == 0 && (Static461.aBoolean555 && !Static279.aBoolean370 || Static441.aBoolean530)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static317.aClass192_47.method5299(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static317.aClass192_47.method5299(0).length());
		} else if (local11.startsWith(Static317.aClass192_48.method5299(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static317.aClass192_48.method5299(0).length());
		} else if (local11.startsWith(Static317.aClass192_49.method5299(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static317.aClass192_49.method5299(0).length());
		} else if (local11.startsWith(Static317.aClass192_50.method5299(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static317.aClass192_50.method5299(0).length());
		} else if (local11.startsWith(Static317.aClass192_51.method5299(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static317.aClass192_51.method5299(0).length());
		} else if (local11.startsWith(Static317.aClass192_52.method5299(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static317.aClass192_52.method5299(0).length());
		} else if (local11.startsWith(Static317.aClass192_53.method5299(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static317.aClass192_53.method5299(0).length());
		} else if (local11.startsWith(Static317.aClass192_54.method5299(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static317.aClass192_54.method5299(0).length());
		} else if (local11.startsWith(Static317.aClass192_55.method5299(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static317.aClass192_55.method5299(0).length());
		} else if (local11.startsWith(Class192.lb.method5299(0))) {
			local13 = 9;
			arg0 = arg0.substring(Class192.lb.method5299(0).length());
		} else if (local11.startsWith(Static317.aClass192_56.method5299(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static317.aClass192_56.method5299(0).length());
		} else if (local11.startsWith(Static317.aClass192_57.method5299(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static317.aClass192_57.method5299(0).length());
		} else if (Static307.anInt5931 != 0) {
			if (local11.startsWith(Static317.aClass192_47.method5299(Static307.anInt5931))) {
				local13 = 0;
				arg0 = arg0.substring(Static317.aClass192_47.method5299(Static307.anInt5931).length());
			} else if (local11.startsWith(Static317.aClass192_48.method5299(Static307.anInt5931))) {
				local13 = 1;
				arg0 = arg0.substring(Static317.aClass192_48.method5299(Static307.anInt5931).length());
			} else if (local11.startsWith(Static317.aClass192_49.method5299(Static307.anInt5931))) {
				local13 = 2;
				arg0 = arg0.substring(Static317.aClass192_49.method5299(Static307.anInt5931).length());
			} else if (local11.startsWith(Static317.aClass192_50.method5299(Static307.anInt5931))) {
				local13 = 3;
				arg0 = arg0.substring(Static317.aClass192_50.method5299(Static307.anInt5931).length());
			} else if (local11.startsWith(Static317.aClass192_51.method5299(Static307.anInt5931))) {
				local13 = 4;
				arg0 = arg0.substring(Static317.aClass192_51.method5299(Static307.anInt5931).length());
			} else if (local11.startsWith(Static317.aClass192_52.method5299(Static307.anInt5931))) {
				local13 = 5;
				arg0 = arg0.substring(Static317.aClass192_52.method5299(Static307.anInt5931).length());
			} else if (local11.startsWith(Static317.aClass192_53.method5299(Static307.anInt5931))) {
				local13 = 6;
				arg0 = arg0.substring(Static317.aClass192_53.method5299(Static307.anInt5931).length());
			} else if (local11.startsWith(Static317.aClass192_54.method5299(Static307.anInt5931))) {
				local13 = 7;
				arg0 = arg0.substring(Static317.aClass192_54.method5299(Static307.anInt5931).length());
			} else if (local11.startsWith(Static317.aClass192_55.method5299(Static307.anInt5931))) {
				local13 = 8;
				arg0 = arg0.substring(Static317.aClass192_55.method5299(Static307.anInt5931).length());
			} else if (local11.startsWith(Class192.lb.method5299(Static307.anInt5931))) {
				local13 = 9;
				arg0 = arg0.substring(Class192.lb.method5299(Static307.anInt5931).length());
			} else if (local11.startsWith(Static317.aClass192_56.method5299(Static307.anInt5931))) {
				local13 = 10;
				arg0 = arg0.substring(Static317.aClass192_56.method5299(Static307.anInt5931).length());
			} else if (local11.startsWith(Static317.aClass192_57.method5299(Static307.anInt5931))) {
				local13 = 11;
				arg0 = arg0.substring(Static317.aClass192_57.method5299(Static307.anInt5931).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static317.aClass192_58.method5299(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static317.aClass192_58.method5299(0).length());
		} else if (local11.startsWith(Static317.aClass192_59.method5299(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static317.aClass192_59.method5299(0).length());
		} else if (local11.startsWith(Static317.aClass192_60.method5299(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static317.aClass192_60.method5299(0).length());
		} else if (local11.startsWith(Static317.aClass192_61.method5299(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static317.aClass192_61.method5299(0).length());
		} else if (local11.startsWith(Static317.aClass192_62.method5299(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static317.aClass192_62.method5299(0).length());
		} else if (Static307.anInt5931 != 0) {
			if (local11.startsWith(Static317.aClass192_58.method5299(Static307.anInt5931))) {
				local451 = 1;
				arg0 = arg0.substring(Static317.aClass192_58.method5299(Static307.anInt5931).length());
			} else if (local11.startsWith(Static317.aClass192_59.method5299(Static307.anInt5931))) {
				local451 = 2;
				arg0 = arg0.substring(Static317.aClass192_59.method5299(Static307.anInt5931).length());
			} else if (local11.startsWith(Static317.aClass192_60.method5299(Static307.anInt5931))) {
				local451 = 3;
				arg0 = arg0.substring(Static317.aClass192_60.method5299(Static307.anInt5931).length());
			} else if (local11.startsWith(Static317.aClass192_61.method5299(Static307.anInt5931))) {
				local451 = 4;
				arg0 = arg0.substring(Static317.aClass192_61.method5299(Static307.anInt5931).length());
			} else if (local11.startsWith(Static317.aClass192_62.method5299(Static307.anInt5931))) {
				local451 = 5;
				arg0 = arg0.substring(Static317.aClass192_62.method5299(Static307.anInt5931).length());
			}
		}
		@Pc(641) Class6_Sub9 local641 = Static560.method8089(Static391.aClass126_1, Static376.aClass208_63);
		local641.aClass6_Sub40_Sub2_1.method8589(0);
		@Pc(650) int local650 = local641.aClass6_Sub40_Sub2_1.anInt10169;
		local641.aClass6_Sub40_Sub2_1.method8589(local13);
		local641.aClass6_Sub40_Sub2_1.method8589(local451);
		Static267.method4762(arg0, local641.aClass6_Sub40_Sub2_1);
		local641.aClass6_Sub40_Sub2_1.method8605(local641.aClass6_Sub40_Sub2_1.anInt10169 - local650);
		Static263.method4681(local641);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(C)I")
	private static int method4199(@OriginalArg(0) char arg0) {
		return Static175.method3216(arg0) ? 1 : 0;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!oi;II)V")
	public static void method4200(@OriginalArg(0) Class240 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class6_Sub2_Sub18 local5 = Static318.method5303(arg0, arg1, arg2);
		if (local5 == null) {
			return;
		}
		anIntArray280 = new int[local5.anInt8692];
		aStringArray37 = new String[local5.anInt8695];
		if (local5.aClass240_12 == Static348.aClass240_9 || local5.aClass240_12 == Static154.aClass240_5 || local5.aClass240_12 == Static320.aClass240_7) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static176.aClass302_57 != null) {
				local30 = Static176.aClass302_57.anInt8866;
				local32 = Static176.aClass302_57.anInt8854;
			}
			anIntArray280[0] = Static429.aClass71_1.method7701() - local30;
			anIntArray280[1] = Static429.aClass71_1.method7702() - local32;
		}
		method4202(local5, 200000);
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "()V")
	public static void method4201() {
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!ru;I)V")
	private static void method4202(@OriginalArg(0) Class6_Sub2_Sub18 arg0, @OriginalArg(1) int arg1) {
		anInt4851 = 0;
		anInt4839 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray537;
		@Pc(11) int[] local11 = arg0.anIntArray538;
		@Pc(13) byte local13 = -1;
		anInt4849 = 0;
		@Pc(603) int local603;
		try {
			@Pc(17) int local17 = 0;
			label270: while (true) {
				local17++;
				if (local17 > arg1) {
					throw new RuntimeException("slow");
				}
				local5++;
				@Pc(31) int local31 = local8[local5];
				if (local31 >= 100) {
					@Pc(839) boolean local839;
					if (local11[local5] == 1) {
						local839 = true;
					} else {
						local839 = false;
					}
					if (local31 >= 100 && local31 < 5000) {
						method4192(local31, local839);
					} else if (local31 >= 5000 && local31 < 10000) {
						method4195(local31, local839);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray279[anInt4851++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray279[anInt4851++] = Static279.aClass294_1.anIntArray529[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static279.aClass294_1.method7420(anIntArray279[--anInt4851], local54);
					} else if (local31 == 3) {
						aStringArray38[anInt4839++] = arg0.aStringArray62[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt4851 -= 2;
						if (anIntArray279[anInt4851] != anIntArray279[anInt4851 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt4851 -= 2;
						if (anIntArray279[anInt4851] == anIntArray279[anInt4851 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt4851 -= 2;
						if (anIntArray279[anInt4851] < anIntArray279[anInt4851 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt4851 -= 2;
						if (anIntArray279[anInt4851] > anIntArray279[anInt4851 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt4849 == 0) {
							return;
						}
						@Pc(216) Class366 local216 = aClass366Array1[--anInt4849];
						arg0 = local216.aClass6_Sub2_Sub18_1;
						local8 = arg0.anIntArray537;
						local11 = arg0.anIntArray538;
						local5 = local216.anInt10221;
						anIntArray280 = local216.anIntArray615;
						aStringArray37 = local216.aStringArray73;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray279[anInt4851++] = Static279.aClass294_1.method7412(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static279.aClass294_1.method7414(local54, anIntArray279[--anInt4851]);
					} else if (local31 == 31) {
						anInt4851 -= 2;
						if (anIntArray279[anInt4851] <= anIntArray279[anInt4851 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt4851 -= 2;
						if (anIntArray279[anInt4851] >= anIntArray279[anInt4851 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray279[anInt4851++] = anIntArray280[local11[local5]];
					} else if (local31 == 34) {
						anIntArray280[local11[local5]] = anIntArray279[--anInt4851];
					} else if (local31 == 35) {
						aStringArray38[anInt4839++] = aStringArray37[local11[local5]];
					} else if (local31 == 36) {
						aStringArray37[local11[local5]] = aStringArray38[--anInt4839];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt4839 -= local54;
						@Pc(400) String local400 = Static296.method5098(aStringArray38, local54, anInt4839);
						aStringArray38[anInt4839++] = local400;
					} else if (local31 == 38) {
						anInt4851--;
					} else if (local31 == 39) {
						anInt4839--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class6_Sub2_Sub18 local436 = Static620.method8991(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt8692];
							@Pc(450) String[] local450 = new String[local436.anInt8695];
							for (local452 = 0; local452 < local436.anInt8693; local452++) {
								local446[local452] = anIntArray279[anInt4851 + local452 - local436.anInt8693];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt8696; local471++) {
								local450[local471] = aStringArray38[anInt4839 + local471 - local436.anInt8696];
							}
							anInt4851 -= local436.anInt8693;
							anInt4839 -= local436.anInt8696;
							@Pc(502) Class366 local502 = new Class366();
							local502.aClass6_Sub2_Sub18_1 = arg0;
							local502.anInt10221 = local5;
							local502.anIntArray615 = anIntArray280;
							local502.aStringArray73 = aStringArray37;
							if (anInt4849 >= aClass366Array1.length) {
								throw new RuntimeException();
							}
							aClass366Array1[anInt4849++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray537;
							local11 = local436.anIntArray538;
							local5 = -1;
							anIntArray280 = local446;
							aStringArray37 = local450;
						} else if (local31 == 42) {
							anIntArray279[anInt4851++] = Static522.anIntArray557[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static522.anIntArray557[local54] = anIntArray279[--anInt4851];
							Static600.method8446(local54);
							Static318.aBoolean410 |= Static211.aBooleanArray25[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray279[--anInt4851];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray278[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label270;
									}
									anIntArrayArray18[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray279[--anInt4851];
							if (local603 < 0 || local603 >= anIntArray278[local54]) {
								throw new RuntimeException();
							}
							anIntArray279[anInt4851++] = anIntArrayArray18[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt4851 -= 2;
							local603 = anIntArray279[anInt4851];
							if (local603 < 0 || local603 >= anIntArray278[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray18[local54][local603] = anIntArray279[anInt4851 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static101.aStringArray20[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray38[anInt4839++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static101.aStringArray20[local54] = aStringArray38[--anInt4839];
							Static627.method8755(local54);
						} else if (local31 == 51) {
							@Pc(774) Class128 local774 = arg0.aClass128Array1[local11[local5]];
							@Pc(787) Class6_Sub48 local787 = (Class6_Sub48) local774.method3560((long) anIntArray279[--anInt4851]);
							if (local787 != null) {
								local5 += local787.anInt9611;
							}
						} else if (local31 == 86) {
							if (anIntArray279[--anInt4851] == 1) {
								local5 += local11[local5];
							}
						} else if (local31 == 87 && anIntArray279[--anInt4851] == 0) {
							local5 += local11[local5];
						}
					}
				}
			}
		} catch (@Pc(874) Exception local874) {
			@Pc(893) StringBuffer local893;
			if (arg0.aString99 == null) {
				local893 = new StringBuffer(30);
				local893.append("CS2: ").append(arg0.aLong278).append(" ");
				for (local603 = anInt4849 - 1; local603 >= 0; local603--) {
					local893.append("v: ").append(aClass366Array1[local603].aClass6_Sub2_Sub18_1.aLong278).append(" ");
				}
				local893.append("op: ").append(local13);
				Static619.method8645(local874, local893.toString());
			} else {
				Static342.method5551("Clientscript error in: " + arg0.aString99);
				local893 = new StringBuffer(30);
				local893.append("Clientscript error in: ").append(arg0.aString99).append("\n");
				for (local603 = anInt4849 - 1; local603 >= 0; local603--) {
					local893.append("via: ").append(aClass366Array1[local603].aClass6_Sub2_Sub18_1.aString99).append("\n");
				}
				local893.append("Op: ").append(local13).append("\n");
				@Pc(933) String local933 = local874.getMessage();
				if (local933 != null && local933.length() > 0) {
					local893.append("Message: ").append(local933).append("\n");
				}
				Static619.method8645(local874, local893.toString());
				Static97.method1576(local893.toString());
			}
		}
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)Ljava/lang/String;")
	private static String method4203(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar4.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar4.get(5);
		@Pc(20) int local20 = aCalendar4.get(2);
		@Pc(24) int local24 = aCalendar4.get(1);
		return local16 + "-" + aStringArray39[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "(IZ)V")
	public static void method4204() {
	}

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "(I)V")
	public static void method4205(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static578.method5705(arg0)) {
			return;
		}
		@Pc(12) Class302[] local12 = Static605.aClass302ArrayArray4[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class302 local19 = local12[local14];
			if (local19.anObjectArray29 != null) {
				@Pc(26) Class6_Sub10 local26 = new Class6_Sub10();
				local26.aClass302_14 = local19;
				local26.anObjectArray1 = local19.anObjectArray29;
				method4196(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!ip", name = "d", descriptor = "(I)V")
	private static void method4206(@OriginalArg(0) int arg0) {
		@Pc(3) Class302 local3 = Static386.method4914(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class302[] local13 = Static590.aClass302ArrayArray3[local9];
		if (local13 == null) {
			@Pc(19) Class302[] local19 = Static605.aClass302ArrayArray4[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static590.aClass302ArrayArray3[local9] = new Class302[local22];
			Static655.method5831(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static655.method5831(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}
}
