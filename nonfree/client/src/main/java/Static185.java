import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!lk", name = "h", descriptor = "[I")
	private static int[] anIntArray212;

	@OriginalMember(owner = "client!lk", name = "o", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray30;

	@OriginalMember(owner = "client!lk", name = "r", descriptor = "Lclient!gr;")
	private static Class86 aClass86_1;

	@OriginalMember(owner = "client!lk", name = "v", descriptor = "Lclient!nk;")
	private static Class161 aClass161_9;

	@OriginalMember(owner = "client!lk", name = "w", descriptor = "Lclient!nk;")
	private static Class161 aClass161_10;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V", line = 20)
	private static void method3591(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = Static6.method140(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class161[] local13 = Static106.aClass161ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class161[] local19 = Static25.aClass161ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static106.aClass161ArrayArray2[local9] = new Class161[local22];
			Static390.method4610(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static390.method4610(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!fn;)V", line = 58)
	public static void method3592(@OriginalArg(0) Class2_Sub13 arg0) {
		method3594(arg0, 200000);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 62)
	private static void method3593(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Class3_Sub1.anInt90 == 0 && (Class43.aBoolean123 && !Class73.aBoolean159 || Class78_Sub1.aBoolean166)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Class2_Sub9.aClass79_38.method2269(0))) {
			local13 = 0;
			arg0 = arg0.substring(Class2_Sub9.aClass79_38.method2269(0).length());
		} else if (local11.startsWith(Class2_Sub7.aClass79_28.method2269(0))) {
			local13 = 1;
			arg0 = arg0.substring(Class2_Sub7.aClass79_28.method2269(0).length());
		} else if (local11.startsWith(Class2_Sub2_Sub1.aClass79_1.method2269(0))) {
			local13 = 2;
			arg0 = arg0.substring(Class2_Sub2_Sub1.aClass79_1.method2269(0).length());
		} else if (local11.startsWith(Class109.aClass79_66.method2269(0))) {
			local13 = 3;
			arg0 = arg0.substring(Class109.aClass79_66.method2269(0).length());
		} else if (local11.startsWith(Class2_Sub3_Sub26.aClass79_110.method2269(0))) {
			local13 = 4;
			arg0 = arg0.substring(Class2_Sub3_Sub26.aClass79_110.method2269(0).length());
		} else if (local11.startsWith(Class20.aClass79_17.method2269(0))) {
			local13 = 5;
			arg0 = arg0.substring(Class20.aClass79_17.method2269(0).length());
		} else if (local11.startsWith(Class2_Sub3_Sub11.aClass79_45.method2269(0))) {
			local13 = 6;
			arg0 = arg0.substring(Class2_Sub3_Sub11.aClass79_45.method2269(0).length());
		} else if (local11.startsWith(Class92.aClass79_57.method2269(0))) {
			local13 = 7;
			arg0 = arg0.substring(Class92.aClass79_57.method2269(0).length());
		} else if (local11.startsWith(Class2_Sub24.aClass79_120.method2269(0))) {
			local13 = 8;
			arg0 = arg0.substring(Class2_Sub24.aClass79_120.method2269(0).length());
		} else if (local11.startsWith(Class11_Sub2_Sub2.aClass79_24.method2269(0))) {
			local13 = 9;
			arg0 = arg0.substring(Class11_Sub2_Sub2.aClass79_24.method2269(0).length());
		} else if (local11.startsWith(Class191.aClass79_113.method2269(0))) {
			local13 = 10;
			arg0 = arg0.substring(Class191.aClass79_113.method2269(0).length());
		} else if (local11.startsWith(Class97.aClass79_62.method2269(0))) {
			local13 = 11;
			arg0 = arg0.substring(Class97.aClass79_62.method2269(0).length());
		} else if (Class197.anInt5569 != 0) {
			if (local11.startsWith(Class2_Sub9.aClass79_38.method2269(Class197.anInt5569))) {
				local13 = 0;
				arg0 = arg0.substring(Class2_Sub9.aClass79_38.method2269(Class197.anInt5569).length());
			} else if (local11.startsWith(Class2_Sub7.aClass79_28.method2269(Class197.anInt5569))) {
				local13 = 1;
				arg0 = arg0.substring(Class2_Sub7.aClass79_28.method2269(Class197.anInt5569).length());
			} else if (local11.startsWith(Class2_Sub2_Sub1.aClass79_1.method2269(Class197.anInt5569))) {
				local13 = 2;
				arg0 = arg0.substring(Class2_Sub2_Sub1.aClass79_1.method2269(Class197.anInt5569).length());
			} else if (local11.startsWith(Class109.aClass79_66.method2269(Class197.anInt5569))) {
				local13 = 3;
				arg0 = arg0.substring(Class109.aClass79_66.method2269(Class197.anInt5569).length());
			} else if (local11.startsWith(Class2_Sub3_Sub26.aClass79_110.method2269(Class197.anInt5569))) {
				local13 = 4;
				arg0 = arg0.substring(Class2_Sub3_Sub26.aClass79_110.method2269(Class197.anInt5569).length());
			} else if (local11.startsWith(Class20.aClass79_17.method2269(Class197.anInt5569))) {
				local13 = 5;
				arg0 = arg0.substring(Class20.aClass79_17.method2269(Class197.anInt5569).length());
			} else if (local11.startsWith(Class2_Sub3_Sub11.aClass79_45.method2269(Class197.anInt5569))) {
				local13 = 6;
				arg0 = arg0.substring(Class2_Sub3_Sub11.aClass79_45.method2269(Class197.anInt5569).length());
			} else if (local11.startsWith(Class92.aClass79_57.method2269(Class197.anInt5569))) {
				local13 = 7;
				arg0 = arg0.substring(Class92.aClass79_57.method2269(Class197.anInt5569).length());
			} else if (local11.startsWith(Class2_Sub24.aClass79_120.method2269(Class197.anInt5569))) {
				local13 = 8;
				arg0 = arg0.substring(Class2_Sub24.aClass79_120.method2269(Class197.anInt5569).length());
			} else if (local11.startsWith(Class11_Sub2_Sub2.aClass79_24.method2269(Class197.anInt5569))) {
				local13 = 9;
				arg0 = arg0.substring(Class11_Sub2_Sub2.aClass79_24.method2269(Class197.anInt5569).length());
			} else if (local11.startsWith(Class191.aClass79_113.method2269(Class197.anInt5569))) {
				local13 = 10;
				arg0 = arg0.substring(Class191.aClass79_113.method2269(Class197.anInt5569).length());
			} else if (local11.startsWith(Class97.aClass79_62.method2269(Class197.anInt5569))) {
				local13 = 11;
				arg0 = arg0.substring(Class97.aClass79_62.method2269(Class197.anInt5569).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Class11.aClass79_141.method2269(0))) {
			local451 = 1;
			arg0 = arg0.substring(Class11.aClass79_141.method2269(0).length());
		} else if (local11.startsWith(Class2_Sub2_Sub14.aClass79_114.method2269(0))) {
			local451 = 2;
			arg0 = arg0.substring(Class2_Sub2_Sub14.aClass79_114.method2269(0).length());
		} else if (local11.startsWith(Class60.aClass79_39.method2269(0))) {
			local451 = 3;
			arg0 = arg0.substring(Class60.aClass79_39.method2269(0).length());
		} else if (local11.startsWith(Class119.aClass79_70.method2269(0))) {
			local451 = 4;
			arg0 = arg0.substring(Class119.aClass79_70.method2269(0).length());
		} else if (local11.startsWith(Class156.aClass79_87.method2269(0))) {
			local451 = 5;
			arg0 = arg0.substring(Class156.aClass79_87.method2269(0).length());
		} else if (Class197.anInt5569 != 0) {
			if (local11.startsWith(Class11.aClass79_141.method2269(Class197.anInt5569))) {
				local451 = 1;
				arg0 = arg0.substring(Class11.aClass79_141.method2269(Class197.anInt5569).length());
			} else if (local11.startsWith(Class2_Sub2_Sub14.aClass79_114.method2269(Class197.anInt5569))) {
				local451 = 2;
				arg0 = arg0.substring(Class2_Sub2_Sub14.aClass79_114.method2269(Class197.anInt5569).length());
			} else if (local11.startsWith(Class60.aClass79_39.method2269(Class197.anInt5569))) {
				local451 = 3;
				arg0 = arg0.substring(Class60.aClass79_39.method2269(Class197.anInt5569).length());
			} else if (local11.startsWith(Class119.aClass79_70.method2269(Class197.anInt5569))) {
				local451 = 4;
				arg0 = arg0.substring(Class119.aClass79_70.method2269(Class197.anInt5569).length());
			} else if (local11.startsWith(Class156.aClass79_87.method2269(Class197.anInt5569))) {
				local451 = 5;
				arg0 = arg0.substring(Class156.aClass79_87.method2269(Class197.anInt5569).length());
			}
		}
		Static85.method1962(Class57_Sub2.aClass145_141);
		Class14.aClass2_Sub4_Sub2_4.method4843(0);
		@Pc(646) int local646 = Class14.aClass2_Sub4_Sub2_4.anInt5289;
		if (arg1 == 5021) {
			Class14.aClass2_Sub4_Sub2_4.method4843(1);
		} else {
			Class14.aClass2_Sub4_Sub2_4.method4843(0);
		}
		Class14.aClass2_Sub4_Sub2_4.method4843(local13);
		Class14.aClass2_Sub4_Sub2_4.method4843(local451);
		Static113.method2381(arg0, Class14.aClass2_Sub4_Sub2_4);
		Class14.aClass2_Sub4_Sub2_4.method4862(Class14.aClass2_Sub4_Sub2_4.anInt5289 - local646);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!fn;I)V", line = 335)
	private static void method3594(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray4;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class2_Sub2_Sub11 local12 = Static272.method5101(local8);
		if (local12 == null) {
			return;
		}
		anIntArray212 = new int[local12.anInt3221];
		@Pc(21) int local21 = 0;
		aStringArray30 = new String[local12.anInt3224];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt2113;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt2114;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass161_3 == null ? -1 : arg0.aClass161_3.anInt4310;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt2115;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass161_3 == null ? -1 : arg0.aClass161_3.anInt4290;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass161_4 == null ? -1 : arg0.aClass161_4.anInt4310;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass161_4 == null ? -1 : arg0.aClass161_4.anInt4290;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt2111;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt2112;
				}
				anIntArray212[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString20;
				}
				aStringArray30[local27++] = local135;
			}
		}
		method3601(local12, arg1);
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)Ljava/lang/String;", line = 417)
	private static String method3595(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		Class139.aCalendar1.setTime(new Date(local6));
		@Pc(16) int local16 = Class139.aCalendar1.get(5);
		@Pc(20) int local20 = Class139.aCalendar1.get(2);
		@Pc(24) int local24 = Class139.aCalendar1.get(1);
		return local16 + "-" + Class139.aStringArray31[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZ)V", line = 431)
	private static void method3596(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class161 local137;
		@Pc(25) int local25;
		@Pc(35) Class161 local35;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(210) Class161 local210;
		@Pc(13) int local13;
		if (arg0 < 300) {
			if (arg0 == 100) {
				Class139.anInt3646 -= 3;
				local13 = Class139.anIntArray213[Class139.anInt3646];
				local19 = Class139.anIntArray213[Class139.anInt3646 + 1];
				local25 = Class139.anIntArray213[Class139.anInt3646 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static6.method140(local13);
				if (local35.aClass161Array2 == null) {
					local35.aClass161Array2 = new Class161[local25 + 1];
				}
				if (local35.aClass161Array2.length <= local25) {
					@Pc(54) Class161[] local54 = new Class161[local25 + 1];
					for (local56 = 0; local56 < local35.aClass161Array2.length; local56++) {
						local54[local56] = local35.aClass161Array2[local56];
					}
					local35.aClass161Array2 = local54;
				}
				if (local25 > 0 && local35.aClass161Array2[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class161 local99 = new Class161();
				local99.anInt4265 = local19;
				local99.anInt4268 = local99.anInt4310 = local35.anInt4310;
				local99.anInt4290 = local25;
				local35.aClass161Array2[local25] = local99;
				if (arg1) {
					aClass161_10 = local99;
				} else {
					aClass161_9 = local99;
				}
				Static187.method3646(local35);
				return;
			}
			@Pc(158) Class161 local158;
			if (arg0 == 101) {
				local137 = arg1 ? aClass161_10 : aClass161_9;
				if (local137.anInt4290 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static6.method140(local137.anInt4310);
				local158.aClass161Array2[local137.anInt4290] = null;
				Static187.method3646(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static6.method140(Class139.anIntArray213[--Class139.anInt3646]);
				local137.aClass161Array2 = null;
				Static187.method3646(local137);
				return;
			}
			if (arg0 == 200) {
				Class139.anInt3646 -= 2;
				local13 = Class139.anIntArray213[Class139.anInt3646];
				local19 = Class139.anIntArray213[Class139.anInt3646 + 1];
				local210 = Static193.method3706(local13, local19);
				if (local210 != null && local19 != -1) {
					Class139.anIntArray213[Class139.anInt3646++] = 1;
					if (arg1) {
						aClass161_10 = local210;
						return;
					}
					aClass161_9 = local210;
					return;
				}
				Class139.anIntArray213[Class139.anInt3646++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = Class139.anIntArray213[--Class139.anInt3646];
				local158 = Static6.method140(local13);
				if (local158 != null) {
					Class139.anIntArray213[Class139.anInt3646++] = 1;
					if (arg1) {
						aClass161_10 = local158;
						return;
					}
					aClass161_9 = local158;
					return;
				}
				Class139.anIntArray213[Class139.anInt3646++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = Class139.anIntArray213[--Class139.anInt3646];
				method3591(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = Class139.anIntArray213[--Class139.anInt3646];
				method3598(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					Class139.anInt3646 -= 2;
					local13 = Class139.anIntArray213[Class139.anInt3646];
					local19 = Class139.anIntArray213[Class139.anInt3646 + 1];
					for (local25 = 0; local25 < Class4.anIntArray3.length; local25++) {
						if (Class4.anIntArray3[local25] == local13) {
							Static17.aClass11_Sub5_Sub2_Sub1_3.aClass117_1.method3182(Static21.aClass55_1, local25, local19);
							return;
						}
					}
					for (local353 = 0; local353 < Class235.anIntArray457.length; local353++) {
						if (Class235.anIntArray457[local353] == local13) {
							Static17.aClass11_Sub5_Sub2_Sub1_3.aClass117_1.method3182(Static21.aClass55_1, local353, local19);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					Class139.anInt3646 -= 2;
					local13 = Class139.anIntArray213[Class139.anInt3646];
					local19 = Class139.anIntArray213[Class139.anInt3646 + 1];
					Static17.aClass11_Sub5_Sub2_Sub1_3.aClass117_1.method3188(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local412 = Class139.anIntArray213[--Class139.anInt3646] != 0;
					Static17.aClass11_Sub5_Sub2_Sub1_3.aClass117_1.method3184(local412);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1101) String local1101;
				if (arg0 >= 1100 && arg0 < 1200 || !(arg0 < 2100 || arg0 >= 2200)) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static6.method140(Class139.anIntArray213[--Class139.anInt3646]);
					} else {
						local137 = arg1 ? aClass161_10 : aClass161_9;
					}
					if (arg0 == 1100) {
						Class139.anInt3646 -= 2;
						local137.anInt4252 = Class139.anIntArray213[Class139.anInt3646];
						if (local137.anInt4252 > local137.anInt4274 - local137.anInt4242) {
							local137.anInt4252 = local137.anInt4274 - local137.anInt4242;
						}
						if (local137.anInt4252 < 0) {
							local137.anInt4252 = 0;
						}
						local137.anInt4253 = Class139.anIntArray213[Class139.anInt3646 + 1];
						if (local137.anInt4253 > local137.anInt4260 - local137.anInt4255) {
							local137.anInt4253 = local137.anInt4260 - local137.anInt4255;
						}
						if (local137.anInt4253 < 0) {
							local137.anInt4253 = 0;
						}
						Static187.method3646(local137);
						if (local137.anInt4290 == -1) {
							Static344.method6221(local137.anInt4310);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt4283 = Class139.anIntArray213[--Class139.anInt3646];
						Static187.method3646(local137);
						if (local137.anInt4290 == -1) {
							Static255.method4724(local137.anInt4310);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean293 = Class139.anIntArray213[--Class139.anInt3646] == 1;
						Static187.method3646(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt4304 = Class139.anIntArray213[--Class139.anInt3646];
						Static187.method3646(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt4231 = Class139.anIntArray213[--Class139.anInt3646];
						Static187.method3646(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = Class139.anIntArray213[--Class139.anInt3646];
						if (local137.anInt4288 != local19) {
							local137.anInt4288 = local19;
							Static187.method3646(local137);
						}
						if (local137.anInt4290 == -1) {
							Static128.method2554(local137.anInt4310);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt4301 = Class139.anIntArray213[--Class139.anInt3646];
						Static187.method3646(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean286 = Class139.anIntArray213[--Class139.anInt3646] == 1;
						Static187.method3646(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt4281 = 1;
						local137.anInt4306 = Class139.anIntArray213[--Class139.anInt3646];
						Static187.method3646(local137);
						if (local137.anInt4290 == -1) {
							Static17.method4214(local137.anInt4310);
						}
						return;
					}
					if (arg0 == 1109) {
						Class139.anInt3646 -= 6;
						local137.anInt4271 = Class139.anIntArray213[Class139.anInt3646];
						local137.anInt4244 = Class139.anIntArray213[Class139.anInt3646 + 1];
						local137.anInt4313 = Class139.anIntArray213[Class139.anInt3646 + 2];
						local137.anInt4267 = Class139.anIntArray213[Class139.anInt3646 + 3];
						local137.anInt4312 = Class139.anIntArray213[Class139.anInt3646 + 4];
						local137.anInt4249 = Class139.anIntArray213[Class139.anInt3646 + 5];
						Static187.method3646(local137);
						if (local137.anInt4290 == -1) {
							Static162.method3323(local137.anInt4310);
							Static82.method1936(local137.anInt4310);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = Class139.anIntArray213[--Class139.anInt3646];
						if (local137.anInt4292 != local19) {
							local137.anInt4292 = local19;
							local137.anInt4241 = 0;
							local137.anInt4309 = 1;
							local137.anInt4276 = 0;
							Static187.method3646(local137);
						}
						if (local137.anInt4290 == -1) {
							Static231.method4344(local137.anInt4310);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean290 = Class139.anIntArray213[--Class139.anInt3646] == 1;
						Static187.method3646(local137);
						return;
					}
					if (arg0 == 1112) {
						local1101 = Class139.aStringArray29[--Class139.anInt3648];
						if (!local1101.equals(local137.aString47)) {
							local137.aString47 = local1101;
							Static187.method3646(local137);
						}
						if (local137.anInt4290 == -1) {
							Static167.method3365(local137.anInt4310);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt4311 = Class139.anIntArray213[--Class139.anInt3646];
						Static187.method3646(local137);
						if (local137.anInt4290 == -1) {
							Static121.method2441(local137.anInt4310);
						}
						return;
					}
					if (arg0 == 1114) {
						Class139.anInt3646 -= 3;
						local137.anInt4291 = Class139.anIntArray213[Class139.anInt3646];
						local137.anInt4286 = Class139.anIntArray213[Class139.anInt3646 + 1];
						local137.anInt4296 = Class139.anIntArray213[Class139.anInt3646 + 2];
						Static187.method3646(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean291 = Class139.anIntArray213[--Class139.anInt3646] == 1;
						Static187.method3646(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt4272 = Class139.anIntArray213[--Class139.anInt3646];
						Static187.method3646(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt4246 = Class139.anIntArray213[--Class139.anInt3646];
						Static187.method3646(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean281 = Class139.anIntArray213[--Class139.anInt3646] == 1;
						Static187.method3646(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean285 = Class139.anIntArray213[--Class139.anInt3646] == 1;
						Static187.method3646(local137);
						return;
					}
					if (arg0 == 1120) {
						Class139.anInt3646 -= 2;
						local137.anInt4274 = Class139.anIntArray213[Class139.anInt3646];
						local137.anInt4260 = Class139.anIntArray213[Class139.anInt3646 + 1];
						Static187.method3646(local137);
						if (local137.anInt4265 == 0) {
							Static81.method1913(false, local137);
						}
						return;
					}
					if (arg0 == 1121) {
						Class139.anInt3646 -= 2;
						local137.aShort62 = (short) Class139.anIntArray213[Class139.anInt3646];
						local137.aShort61 = (short) Class139.anIntArray213[Class139.anInt3646 + 1];
						Static187.method3646(local137);
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean283 = Class139.anIntArray213[--Class139.anInt3646] == 1;
						Static187.method3646(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt4249 = Class139.anIntArray213[--Class139.anInt3646];
						Static187.method3646(local137);
						if (local137.anInt4290 == -1) {
							Static162.method3323(local137.anInt4310);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = Class139.anIntArray213[--Class139.anInt3646];
						local137.aBoolean292 = local19 == 1;
						Static187.method3646(local137);
						return;
					}
					if (arg0 == 1125) {
						Class139.anInt3646 -= 2;
						local137.anInt4300 = Class139.anIntArray213[Class139.anInt3646];
						local137.anInt4247 = Class139.anIntArray213[Class139.anInt3646 + 1];
						Static187.method3646(local137);
						return;
					}
				} else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static6.method140(Class139.anIntArray213[--Class139.anInt3646]);
					} else {
						local137 = arg1 ? aClass161_10 : aClass161_9;
					}
					Static187.method3646(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						Class139.anInt3646 -= 2;
						local19 = Class139.anIntArray213[Class139.anInt3646];
						local25 = Class139.anIntArray213[Class139.anInt3646 + 1];
						if (local137.anInt4290 == -1) {
							Static295.method5429(local137.anInt4310);
							Static162.method3323(local137.anInt4310);
							Static82.method1936(local137.anInt4310);
						}
						if (local19 == -1) {
							local137.anInt4281 = 1;
							local137.anInt4306 = -1;
							local137.anInt4293 = -1;
							return;
						}
						local137.anInt4293 = local19;
						local137.anInt4234 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean280 = true;
						} else {
							local137.aBoolean280 = false;
						}
						@Pc(1537) Class188 local1537 = Static290.aClass107_2.method2761(local19);
						local137.anInt4313 = local1537.anInt5235;
						local137.anInt4267 = local1537.anInt5205;
						local137.anInt4312 = local1537.anInt5238;
						local137.anInt4271 = local1537.anInt5241;
						local137.anInt4244 = local1537.anInt5222;
						local137.anInt4249 = local1537.anInt5231;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt4299 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt4299 = 1;
						} else {
							local137.anInt4299 = 2;
						}
						if (local137.anInt4245 > 0) {
							local137.anInt4249 = local137.anInt4249 * 32 / local137.anInt4245;
							return;
						}
						if (local137.anInt4287 > 0) {
							local137.anInt4249 = local137.anInt4249 * 32 / local137.anInt4287;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt4281 = 2;
						local137.anInt4306 = Class139.anIntArray213[--Class139.anInt3646];
						if (local137.anInt4290 == -1) {
							Static17.method4214(local137.anInt4310);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt4281 = 3;
						local137.anInt4306 = -1;
						if (local137.anInt4290 == -1) {
							Static17.method4214(local137.anInt4310);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt4281 = 6;
						local137.anInt4306 = Class139.anIntArray213[--Class139.anInt3646];
						if (local137.anInt4290 == -1) {
							Static17.method4214(local137.anInt4310);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt4281 = 5;
						local137.anInt4306 = Class139.anIntArray213[--Class139.anInt3646];
						if (local137.anInt4290 == -1) {
							Static17.method4214(local137.anInt4310);
						}
						return;
					}
					if (arg0 == 1206) {
						Class139.anInt3646 -= 4;
						local137.anInt4273 = Class139.anIntArray213[Class139.anInt3646];
						local137.anInt4261 = Class139.anIntArray213[Class139.anInt3646 + 1];
						local137.anInt4229 = Class139.anIntArray213[Class139.anInt3646 + 2];
						local137.anInt4236 = Class139.anIntArray213[Class139.anInt3646 + 3];
						Static187.method3646(local137);
						return;
					}
					if (arg0 == 1207) {
						Class139.anInt3646 -= 2;
						local137.anInt4263 = Class139.anIntArray213[Class139.anInt3646];
						local137.anInt4295 = Class139.anIntArray213[Class139.anInt3646 + 1];
						Static187.method3646(local137);
						return;
					}
					if (arg0 == 1210) {
						Class139.anInt3646 -= 4;
						local137.anInt4306 = Class139.anIntArray213[Class139.anInt3646];
						local137.anInt4230 = Class139.anIntArray213[Class139.anInt3646 + 1];
						if (Class139.anIntArray213[Class139.anInt3646 + 2] == 1) {
							local137.anInt4281 = 9;
						} else {
							local137.anInt4281 = 8;
						}
						if (Class139.anIntArray213[Class139.anInt3646 + 3] == 1) {
							local137.aBoolean280 = true;
						} else {
							local137.aBoolean280 = false;
						}
						if (local137.anInt4290 == -1) {
							Static17.method4214(local137.anInt4310);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt4281 = 5;
						local137.anInt4306 = Class11_Sub3_Sub2.anInt4220;
						local137.anInt4230 = 0;
						if (local137.anInt4290 == -1) {
							Static17.method4214(local137.anInt4310);
						}
						return;
					}
				} else if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static6.method140(Class139.anIntArray213[--Class139.anInt3646]);
					} else {
						local137 = arg1 ? aClass161_10 : aClass161_9;
					}
					if (arg0 == 1300) {
						local19 = Class139.anIntArray213[--Class139.anInt3646] - 1;
						if (local19 >= 0 && local19 <= 9) {
							local137.method4104(local19, Class139.aStringArray29[--Class139.anInt3648]);
							return;
						}
						Class139.anInt3648--;
						return;
					}
					if (arg0 == 1301) {
						Class139.anInt3646 -= 2;
						local19 = Class139.anIntArray213[Class139.anInt3646];
						local25 = Class139.anIntArray213[Class139.anInt3646 + 1];
						local137.aClass161_12 = Static193.method3706(local19, local25);
						return;
					}
					if (arg0 == 1302) {
						local19 = Class139.anIntArray213[--Class139.anInt3646];
						if (local19 != Class2_Sub3_Sub17.anInt3134 && local19 != Class2_Sub19.anInt2892 && local19 != Class62.anInt1836) {
							return;
						}
						local137.anInt4278 = local19;
						return;
					}
					if (arg0 == 1303) {
						local137.anInt4233 = Class139.anIntArray213[--Class139.anInt3646];
						return;
					}
					if (arg0 == 1304) {
						local137.anInt4264 = Class139.anIntArray213[--Class139.anInt3646];
						return;
					}
					if (arg0 == 1305) {
						local137.aString45 = Class139.aStringArray29[--Class139.anInt3648];
						return;
					}
					if (arg0 == 1306) {
						local137.aString44 = Class139.aStringArray29[--Class139.anInt3648];
						return;
					}
					if (arg0 == 1307) {
						local137.aStringArray40 = null;
						return;
					}
					if (arg0 == 1308) {
						local137.anInt4279 = Class139.anIntArray213[--Class139.anInt3646];
						local137.anInt4232 = Class139.anIntArray213[--Class139.anInt3646];
						return;
					}
					if (arg0 == 1309) {
						local19 = Class139.anIntArray213[--Class139.anInt3646];
						local25 = Class139.anIntArray213[--Class139.anInt3646];
						if (local25 >= 1 && local25 <= 10) {
							local137.method4111(local19, local25 - 1);
						}
						return;
					}
					if (arg0 == 1310) {
						local137.aString46 = Class139.aStringArray29[--Class139.anInt3648];
						return;
					}
					if (arg0 == 1311) {
						local137.anInt4254 = Class139.anIntArray213[--Class139.anInt3646];
						return;
					}
				} else {
					@Pc(2194) int local2194;
					if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static6.method140(Class139.anIntArray213[--Class139.anInt3646]);
						} else {
							local137 = arg1 ? aClass161_10 : aClass161_9;
						}
						local1101 = Class139.aStringArray29[--Class139.anInt3648];
						@Pc(2137) int[] local2137 = null;
						if (local1101.length() > 0 && local1101.charAt(local1101.length() - 1) == 'Y') {
							local353 = Class139.anIntArray213[--Class139.anInt3646];
							if (local353 > 0) {
								local2137 = new int[local353];
								while (local353-- > 0) {
									local2137[local353] = Class139.anIntArray213[--Class139.anInt3646];
								}
							}
							local1101 = local1101.substring(0, local1101.length() - 1);
						}
						@Pc(2189) Object[] local2189 = new Object[local1101.length() + 1];
						for (local2194 = local2189.length - 1; local2194 >= 1; local2194--) {
							if (local1101.charAt(local2194 - 1) == 's') {
								local2189[local2194] = Class139.aStringArray29[--Class139.anInt3648];
							} else {
								local2189[local2194] = Integer.valueOf(Class139.anIntArray213[--Class139.anInt3646]);
							}
						}
						local56 = Class139.anIntArray213[--Class139.anInt3646];
						if (local56 == -1) {
							local2189 = null;
						} else {
							local2189[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray14 = local2189;
						} else if (arg0 == 1401) {
							local137.anObjectArray16 = local2189;
						} else if (arg0 == 1402) {
							local137.anObjectArray30 = local2189;
						} else if (arg0 == 1403) {
							local137.anObjectArray13 = local2189;
						} else if (arg0 == 1404) {
							local137.anObjectArray9 = local2189;
						} else if (arg0 == 1405) {
							local137.anObjectArray31 = local2189;
						} else if (arg0 == 1406) {
							local137.anObjectArray32 = local2189;
						} else if (arg0 == 1407) {
							local137.anObjectArray10 = local2189;
							local137.anIntArray273 = local2137;
						} else if (arg0 == 1408) {
							local137.anObjectArray23 = local2189;
						} else if (arg0 == 1409) {
							local137.anObjectArray27 = local2189;
						} else if (arg0 == 1410) {
							local137.anObjectArray8 = local2189;
						} else if (arg0 == 1411) {
							local137.anObjectArray28 = local2189;
						} else if (arg0 == 1412) {
							local137.anObjectArray12 = local2189;
						} else if (arg0 == 1414) {
							local137.anObjectArray29 = local2189;
							local137.anIntArray281 = local2137;
						} else if (arg0 == 1415) {
							local137.anObjectArray5 = local2189;
							local137.anIntArray274 = local2137;
						} else if (arg0 == 1416) {
							local137.anObjectArray15 = local2189;
						} else if (arg0 == 1417) {
							local137.anObjectArray21 = local2189;
						} else if (arg0 == 1418) {
							local137.anObjectArray26 = local2189;
						} else if (arg0 == 1419) {
							local137.anObjectArray17 = local2189;
						} else if (arg0 == 1420) {
							local137.anObjectArray25 = local2189;
						} else if (arg0 == 1421) {
							local137.anObjectArray18 = local2189;
						} else if (arg0 == 1422) {
							local137.anObjectArray24 = local2189;
						} else if (arg0 == 1423) {
							local137.anObjectArray34 = local2189;
						} else if (arg0 == 1424) {
							local137.anObjectArray11 = local2189;
						} else if (arg0 == 1425) {
							local137.anObjectArray33 = local2189;
						} else if (arg0 == 1426) {
							local137.anObjectArray20 = local2189;
						} else if (arg0 == 1427) {
							local137.anObjectArray6 = local2189;
						} else if (arg0 == 1428) {
							local137.anObjectArray19 = local2189;
							local137.anIntArray278 = local2137;
						} else if (arg0 == 1429) {
							local137.anObjectArray7 = local2189;
							local137.anIntArray277 = local2137;
						}
						local137.aBoolean296 = true;
						return;
					}
					if (arg0 < 1600) {
						local137 = arg1 ? aClass161_10 : aClass161_9;
						if (arg0 == 1500) {
							Class139.anIntArray213[Class139.anInt3646++] = local137.anInt4298;
							return;
						}
						if (arg0 == 1501) {
							Class139.anIntArray213[Class139.anInt3646++] = local137.anInt4248;
							return;
						}
						if (arg0 == 1502) {
							Class139.anIntArray213[Class139.anInt3646++] = local137.anInt4242;
							return;
						}
						if (arg0 == 1503) {
							Class139.anIntArray213[Class139.anInt3646++] = local137.anInt4255;
							return;
						}
						if (arg0 == 1504) {
							Class139.anIntArray213[Class139.anInt3646++] = local137.aBoolean284 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							Class139.anIntArray213[Class139.anInt3646++] = local137.anInt4268;
							return;
						}
					} else if (arg0 < 1700) {
						local137 = arg1 ? aClass161_10 : aClass161_9;
						if (arg0 == 1600) {
							Class139.anIntArray213[Class139.anInt3646++] = local137.anInt4252;
							return;
						}
						if (arg0 == 1601) {
							Class139.anIntArray213[Class139.anInt3646++] = local137.anInt4253;
							return;
						}
						if (arg0 == 1602) {
							Class139.aStringArray29[Class139.anInt3648++] = local137.aString47;
							return;
						}
						if (arg0 == 1603) {
							Class139.anIntArray213[Class139.anInt3646++] = local137.anInt4274;
							return;
						}
						if (arg0 == 1604) {
							Class139.anIntArray213[Class139.anInt3646++] = local137.anInt4260;
							return;
						}
						if (arg0 == 1605) {
							Class139.anIntArray213[Class139.anInt3646++] = local137.anInt4249;
							return;
						}
						if (arg0 == 1606) {
							Class139.anIntArray213[Class139.anInt3646++] = local137.anInt4313;
							return;
						}
						if (arg0 == 1607) {
							Class139.anIntArray213[Class139.anInt3646++] = local137.anInt4312;
							return;
						}
						if (arg0 == 1608) {
							Class139.anIntArray213[Class139.anInt3646++] = local137.anInt4267;
							return;
						}
						if (arg0 == 1609) {
							Class139.anIntArray213[Class139.anInt3646++] = local137.anInt4304;
							return;
						}
						if (arg0 == 1610) {
							Class139.anIntArray213[Class139.anInt3646++] = local137.anInt4271;
							return;
						}
						if (arg0 == 1611) {
							Class139.anIntArray213[Class139.anInt3646++] = local137.anInt4244;
							return;
						}
						if (arg0 == 1612) {
							Class139.anIntArray213[Class139.anInt3646++] = local137.anInt4288;
							return;
						}
					} else if (arg0 < 1800) {
						local137 = arg1 ? aClass161_10 : aClass161_9;
						if (arg0 == 1700) {
							Class139.anIntArray213[Class139.anInt3646++] = local137.anInt4293;
							return;
						}
						if (arg0 == 1701) {
							if (local137.anInt4293 != -1) {
								Class139.anIntArray213[Class139.anInt3646++] = local137.anInt4234;
								return;
							}
							Class139.anIntArray213[Class139.anInt3646++] = 0;
							return;
						}
						if (arg0 == 1702) {
							Class139.anIntArray213[Class139.anInt3646++] = local137.anInt4290;
							return;
						}
					} else if (arg0 < 1900) {
						local137 = arg1 ? aClass161_10 : aClass161_9;
						if (arg0 == 1800) {
							Class139.anIntArray213[Class139.anInt3646++] = Static42.method1406(local137).method1854();
							return;
						}
						if (arg0 == 1801) {
							local19 = Class139.anIntArray213[--Class139.anInt3646];
							local19--;
							if (local137.aStringArray40 != null && local19 < local137.aStringArray40.length && local137.aStringArray40[local19] != null) {
								Class139.aStringArray29[Class139.anInt3648++] = local137.aStringArray40[local19];
								return;
							}
							Class139.aStringArray29[Class139.anInt3648++] = "";
							return;
						}
						if (arg0 == 1802) {
							if (local137.aString45 == null) {
								Class139.aStringArray29[Class139.anInt3648++] = "";
								return;
							}
							Class139.aStringArray29[Class139.anInt3648++] = local137.aString45;
							return;
						}
					} else if (arg0 < 2600) {
						local137 = Static6.method140(Class139.anIntArray213[--Class139.anInt3646]);
						if (arg0 == 2500) {
							Class139.anIntArray213[Class139.anInt3646++] = local137.anInt4298;
							return;
						}
						if (arg0 == 2501) {
							Class139.anIntArray213[Class139.anInt3646++] = local137.anInt4248;
							return;
						}
						if (arg0 == 2502) {
							Class139.anIntArray213[Class139.anInt3646++] = local137.anInt4242;
							return;
						}
						if (arg0 == 2503) {
							Class139.anIntArray213[Class139.anInt3646++] = local137.anInt4255;
							return;
						}
						if (arg0 == 2504) {
							Class139.anIntArray213[Class139.anInt3646++] = local137.aBoolean284 ? 1 : 0;
							return;
						}
						if (arg0 == 2505) {
							Class139.anIntArray213[Class139.anInt3646++] = local137.anInt4268;
							return;
						}
					} else if (arg0 < 2700) {
						local137 = Static6.method140(Class139.anIntArray213[--Class139.anInt3646]);
						if (arg0 == 2600) {
							Class139.anIntArray213[Class139.anInt3646++] = local137.anInt4252;
							return;
						}
						if (arg0 == 2601) {
							Class139.anIntArray213[Class139.anInt3646++] = local137.anInt4253;
							return;
						}
						if (arg0 == 2602) {
							Class139.aStringArray29[Class139.anInt3648++] = local137.aString47;
							return;
						}
						if (arg0 == 2603) {
							Class139.anIntArray213[Class139.anInt3646++] = local137.anInt4274;
							return;
						}
						if (arg0 == 2604) {
							Class139.anIntArray213[Class139.anInt3646++] = local137.anInt4260;
							return;
						}
						if (arg0 == 2605) {
							Class139.anIntArray213[Class139.anInt3646++] = local137.anInt4249;
							return;
						}
						if (arg0 == 2606) {
							Class139.anIntArray213[Class139.anInt3646++] = local137.anInt4313;
							return;
						}
						if (arg0 == 2607) {
							Class139.anIntArray213[Class139.anInt3646++] = local137.anInt4312;
							return;
						}
						if (arg0 == 2608) {
							Class139.anIntArray213[Class139.anInt3646++] = local137.anInt4267;
							return;
						}
						if (arg0 == 2609) {
							Class139.anIntArray213[Class139.anInt3646++] = local137.anInt4304;
							return;
						}
						if (arg0 == 2610) {
							Class139.anIntArray213[Class139.anInt3646++] = local137.anInt4271;
							return;
						}
						if (arg0 == 2611) {
							Class139.anIntArray213[Class139.anInt3646++] = local137.anInt4244;
							return;
						}
						if (arg0 == 2612) {
							Class139.anIntArray213[Class139.anInt3646++] = local137.anInt4288;
							return;
						}
					} else {
						@Pc(3356) Class2_Sub7 local3356;
						@Pc(3254) Class2_Sub7 local3254;
						if (arg0 < 2800) {
							if (arg0 == 2700) {
								local137 = Static6.method140(Class139.anIntArray213[--Class139.anInt3646]);
								Class139.anIntArray213[Class139.anInt3646++] = local137.anInt4293;
								return;
							}
							if (arg0 == 2701) {
								local137 = Static6.method140(Class139.anIntArray213[--Class139.anInt3646]);
								if (local137.anInt4293 != -1) {
									Class139.anIntArray213[Class139.anInt3646++] = local137.anInt4234;
									return;
								}
								Class139.anIntArray213[Class139.anInt3646++] = 0;
								return;
							}
							if (arg0 == 2702) {
								local13 = Class139.anIntArray213[--Class139.anInt3646];
								local3254 = (Class2_Sub7) Class2_Sub3_Sub34.aClass4_130.method90((long) local13);
								if (local3254 != null) {
									Class139.anIntArray213[Class139.anInt3646++] = 1;
									return;
								}
								Class139.anIntArray213[Class139.anInt3646++] = 0;
								return;
							}
							if (arg0 == 2703) {
								local137 = Static6.method140(Class139.anIntArray213[--Class139.anInt3646]);
								if (local137.aClass161Array2 == null) {
									Class139.anIntArray213[Class139.anInt3646++] = 0;
									return;
								}
								local19 = local137.aClass161Array2.length;
								for (local25 = 0; local25 < local137.aClass161Array2.length; local25++) {
									if (local137.aClass161Array2[local25] == null) {
										local19 = local25;
										break;
									}
								}
								Class139.anIntArray213[Class139.anInt3646++] = local19;
								return;
							}
							if (arg0 == 2704 || arg0 == 2705) {
								Class139.anInt3646 -= 2;
								local13 = Class139.anIntArray213[Class139.anInt3646];
								local19 = Class139.anIntArray213[Class139.anInt3646 + 1];
								local3356 = (Class2_Sub7) Class2_Sub3_Sub34.aClass4_130.method90((long) local13);
								if (local3356 != null && local3356.anInt1368 == local19) {
									Class139.anIntArray213[Class139.anInt3646++] = 1;
									return;
								} else {
									Class139.anIntArray213[Class139.anInt3646++] = 0;
									return;
								}
							}
						} else if (arg0 < 2900) {
							local137 = Static6.method140(Class139.anIntArray213[--Class139.anInt3646]);
							if (arg0 == 2800) {
								Class139.anIntArray213[Class139.anInt3646++] = Static42.method1406(local137).method1854();
								return;
							}
							if (arg0 == 2801) {
								local19 = Class139.anIntArray213[--Class139.anInt3646];
								local19--;
								if (local137.aStringArray40 != null && local19 < local137.aStringArray40.length && local137.aStringArray40[local19] != null) {
									Class139.aStringArray29[Class139.anInt3648++] = local137.aStringArray40[local19];
									return;
								}
								Class139.aStringArray29[Class139.anInt3648++] = "";
								return;
							}
							if (arg0 == 2802) {
								if (local137.aString45 == null) {
									Class139.aStringArray29[Class139.anInt3648++] = "";
									return;
								}
								Class139.aStringArray29[Class139.anInt3648++] = local137.aString45;
								return;
							}
						} else {
							@Pc(3493) String local3493;
							if (arg0 < 3200) {
								if (arg0 == 3100) {
									local3493 = Class139.aStringArray29[--Class139.anInt3648];
									Static193.method3701(local3493);
									return;
								}
								if (arg0 == 3101) {
									Class139.anInt3646 -= 2;
									Static314.method5708(Static17.aClass11_Sub5_Sub2_Sub1_3, Class139.anIntArray213[Class139.anInt3646 + 1], Class139.anIntArray213[Class139.anInt3646]);
									return;
								}
								if (arg0 == 3103) {
									Static78.method1906();
									return;
								}
								if (arg0 == 3104) {
									local3493 = Class139.aStringArray29[--Class139.anInt3648];
									local19 = 0;
									if (Static123.method2487(local3493)) {
										local19 = Static137.method2700(local3493);
									}
									Static85.method1962(Class11_Sub5_Sub6.aClass145_239);
									Class14.aClass2_Sub4_Sub2_4.method4814(local19);
									return;
								}
								if (arg0 == 3105) {
									local3493 = Class139.aStringArray29[--Class139.anInt3648];
									Static85.method1962(Class40.aClass145_44);
									Class14.aClass2_Sub4_Sub2_4.method4843(local3493.length() + 1);
									Class14.aClass2_Sub4_Sub2_4.method4823(local3493);
									return;
								}
								if (arg0 == 3106) {
									local3493 = Class139.aStringArray29[--Class139.anInt3648];
									Static85.method1962(Class11_Sub5_Sub2.aClass145_164);
									Class14.aClass2_Sub4_Sub2_4.method4843(local3493.length() + 1);
									Class14.aClass2_Sub4_Sub2_4.method4823(local3493);
									return;
								}
								if (arg0 == 3107) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									local1101 = Class139.aStringArray29[--Class139.anInt3648];
									Static318.method5770(local13, local1101);
									return;
								}
								if (arg0 == 3108) {
									Class139.anInt3646 -= 3;
									local13 = Class139.anIntArray213[Class139.anInt3646];
									local19 = Class139.anIntArray213[Class139.anInt3646 + 1];
									local25 = Class139.anIntArray213[Class139.anInt3646 + 2];
									local35 = Static6.method140(local25);
									Static354.method6336(local13, local19, local35);
									return;
								}
								if (arg0 == 3109) {
									Class139.anInt3646 -= 2;
									local13 = Class139.anIntArray213[Class139.anInt3646];
									local19 = Class139.anIntArray213[Class139.anInt3646 + 1];
									local210 = arg1 ? aClass161_10 : aClass161_9;
									Static354.method6336(local13, local19, local210);
									return;
								}
								if (arg0 == 3110) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									Static85.method1962(Class2_Sub3_Sub20.aClass145_138);
									Class14.aClass2_Sub4_Sub2_4.method4844(local13);
									return;
								}
								if (arg0 == 3111) {
									Class139.anInt3646 -= 2;
									local13 = Class139.anIntArray213[Class139.anInt3646];
									local19 = Class139.anIntArray213[Class139.anInt3646 + 1];
									local3356 = (Class2_Sub7) Class2_Sub3_Sub34.aClass4_130.method90((long) local13);
									if (local3356 != null) {
										Static253.method4656(true, local3356, local3356.anInt1368 != local19);
									}
									Static356.method6366(local13, 3, true, local19);
									return;
								}
								if (arg0 == 3112) {
									Class139.anInt3646--;
									local13 = Class139.anIntArray213[Class139.anInt3646];
									local3254 = (Class2_Sub7) Class2_Sub3_Sub34.aClass4_130.method90((long) local13);
									if (local3254 != null && local3254.anInt1371 == 3) {
										Static253.method4656(true, local3254, true);
									}
									return;
								}
							} else if (arg0 < 3300) {
								if (arg0 == 3200) {
									Class139.anInt3646 -= 3;
									Static28.method939(Class139.anIntArray213[Class139.anInt3646 + 1], 255, Class139.anIntArray213[Class139.anInt3646 + 2], Class139.anIntArray213[Class139.anInt3646]);
									return;
								}
								if (arg0 == 3201) {
									Static129.method2580(50, 255, Class139.anIntArray213[--Class139.anInt3646]);
									return;
								}
								if (arg0 == 3202) {
									Class139.anInt3646 -= 2;
									Static164.method3325(Class139.anIntArray213[Class139.anInt3646], Class139.anIntArray213[Class139.anInt3646 + 1], 255);
									return;
								}
								if (arg0 == 3203) {
									Class139.anInt3646 -= 4;
									Static28.method939(Class139.anIntArray213[Class139.anInt3646 + 1], Class139.anIntArray213[Class139.anInt3646 + 3], Class139.anIntArray213[Class139.anInt3646 + 2], Class139.anIntArray213[Class139.anInt3646]);
									return;
								}
								if (arg0 == 3204) {
									Class139.anInt3646 -= 3;
									Static129.method2580(Class139.anIntArray213[Class139.anInt3646 + 2], Class139.anIntArray213[Class139.anInt3646 + 1], Class139.anIntArray213[Class139.anInt3646]);
									return;
								}
								if (arg0 == 3205) {
									Class139.anInt3646 -= 3;
									Static164.method3325(Class139.anIntArray213[Class139.anInt3646], Class139.anIntArray213[Class139.anInt3646 + 1], Class139.anIntArray213[Class139.anInt3646 + 2]);
									return;
								}
							} else if (arg0 < 3400) {
								if (arg0 == 3300) {
									Class139.anIntArray213[Class139.anInt3646++] = Class83.anInt2345;
									return;
								}
								if (arg0 == 3301) {
									Class139.anInt3646 -= 2;
									local13 = Class139.anIntArray213[Class139.anInt3646];
									local19 = Class139.anIntArray213[Class139.anInt3646 + 1];
									Class139.anIntArray213[Class139.anInt3646++] = Static38.method1305(false, local13, local19);
									return;
								}
								if (arg0 == 3302) {
									Class139.anInt3646 -= 2;
									local13 = Class139.anIntArray213[Class139.anInt3646];
									local19 = Class139.anIntArray213[Class139.anInt3646 + 1];
									Class139.anIntArray213[Class139.anInt3646++] = Static226.method4239(local19, false, local13);
									return;
								}
								if (arg0 == 3303) {
									Class139.anInt3646 -= 2;
									local13 = Class139.anIntArray213[Class139.anInt3646];
									local19 = Class139.anIntArray213[Class139.anInt3646 + 1];
									Class139.anIntArray213[Class139.anInt3646++] = Static179.method3507(local13, false, local19);
									return;
								}
								if (arg0 == 3304) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									Class139.anIntArray213[Class139.anInt3646++] = Static166.aClass51_3.method1708(local13).anInt2485;
									return;
								}
								if (arg0 == 3305) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									Class139.anIntArray213[Class139.anInt3646++] = Class2_Sub3_Sub24.anIntArray338[local13];
									return;
								}
								if (arg0 == 3306) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									Class139.anIntArray213[Class139.anInt3646++] = Class218.anIntArray414[local13];
									return;
								}
								if (arg0 == 3307) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									Class139.anIntArray213[Class139.anInt3646++] = Class2_Sub3_Sub10.anIntArray464[local13];
									return;
								}
								if (arg0 == 3308) {
									@Pc(4136) byte local4136 = Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78;
									local19 = (Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6768 >> 7) + Static154.anInt3136;
									local25 = (Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6770 >> 7) + Static139.anInt2716;
									Class139.anIntArray213[Class139.anInt3646++] = (local4136 << 28) + (local19 << 14) + local25;
									return;
								}
								if (arg0 == 3309) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									Class139.anIntArray213[Class139.anInt3646++] = local13 >> 14 & 0x3FFF;
									return;
								}
								if (arg0 == 3310) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									Class139.anIntArray213[Class139.anInt3646++] = local13 >> 28;
									return;
								}
								if (arg0 == 3311) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									Class139.anIntArray213[Class139.anInt3646++] = local13 & 0x3FFF;
									return;
								}
								if (arg0 == 3312) {
									Class139.anIntArray213[Class139.anInt3646++] = Class144.aBoolean241 ? 1 : 0;
									return;
								}
								if (arg0 == 3313) {
									Class139.anInt3646 -= 2;
									local13 = Class139.anIntArray213[Class139.anInt3646];
									local19 = Class139.anIntArray213[Class139.anInt3646 + 1];
									Class139.anIntArray213[Class139.anInt3646++] = Static38.method1305(true, local13, local19);
									return;
								}
								if (arg0 == 3314) {
									Class139.anInt3646 -= 2;
									local13 = Class139.anIntArray213[Class139.anInt3646];
									local19 = Class139.anIntArray213[Class139.anInt3646 + 1];
									Class139.anIntArray213[Class139.anInt3646++] = Static226.method4239(local19, true, local13);
									return;
								}
								if (arg0 == 3315) {
									Class139.anInt3646 -= 2;
									local13 = Class139.anIntArray213[Class139.anInt3646];
									local19 = Class139.anIntArray213[Class139.anInt3646 + 1];
									Class139.anIntArray213[Class139.anInt3646++] = Static179.method3507(local13, true, local19);
									return;
								}
								if (arg0 == 3316) {
									if (Class3_Sub1.anInt90 >= 2) {
										Class139.anIntArray213[Class139.anInt3646++] = Class3_Sub1.anInt90;
										return;
									}
									Class139.anIntArray213[Class139.anInt3646++] = 0;
									return;
								}
								if (arg0 == 3317) {
									Class139.anIntArray213[Class139.anInt3646++] = Class2_Sub2_Sub9.anInt2770;
									return;
								}
								if (arg0 == 3318) {
									Class139.anIntArray213[Class139.anInt3646++] = Class87.anInt2382;
									return;
								}
								if (arg0 == 3321) {
									Class139.anIntArray213[Class139.anInt3646++] = Class70.anInt2000;
									return;
								}
								if (arg0 == 3322) {
									Class139.anIntArray213[Class139.anInt3646++] = Class2_Sub3_Sub6.anInt1047;
									return;
								}
								if (arg0 == 3323) {
									if (Class148.anInt3770 >= 5 && Class148.anInt3770 <= 9) {
										Class139.anIntArray213[Class139.anInt3646++] = 1;
										return;
									}
									Class139.anIntArray213[Class139.anInt3646++] = 0;
									return;
								}
								if (arg0 == 3324) {
									if (Class148.anInt3770 >= 5 && Class148.anInt3770 <= 9) {
										Class139.anIntArray213[Class139.anInt3646++] = Class148.anInt3770;
										return;
									}
									Class139.anIntArray213[Class139.anInt3646++] = 0;
									return;
								}
								if (arg0 == 3325) {
									Class139.anIntArray213[Class139.anInt3646++] = Class90_Sub1.aBoolean482 ? 1 : 0;
									return;
								}
								if (arg0 == 3326) {
									Class139.anIntArray213[Class139.anInt3646++] = Static17.aClass11_Sub5_Sub2_Sub1_3.anInt4173;
									return;
								}
								if (arg0 == 3327) {
									Class139.anIntArray213[Class139.anInt3646++] = Static17.aClass11_Sub5_Sub2_Sub1_3.aClass117_1.aBoolean220 ? 1 : 0;
									return;
								}
								if (arg0 == 3328) {
									Class139.anIntArray213[Class139.anInt3646++] = Class43.aBoolean123 && !Class73.aBoolean159 ? 1 : 0;
									return;
								}
								if (arg0 == 3329) {
									Class139.anIntArray213[Class139.anInt3646++] = Class78_Sub1.aBoolean166 ? 1 : 0;
									return;
								}
								if (arg0 == 3330) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									Class139.anIntArray213[Class139.anInt3646++] = Static145.method2786(local13);
									return;
								}
								if (arg0 == 3331) {
									Class139.anInt3646 -= 2;
									local13 = Class139.anIntArray213[Class139.anInt3646];
									local19 = Class139.anIntArray213[Class139.anInt3646 + 1];
									Class139.anIntArray213[Class139.anInt3646++] = Static155.method3151(local19, false, local13);
									return;
								}
								if (arg0 == 3332) {
									Class139.anInt3646 -= 2;
									local13 = Class139.anIntArray213[Class139.anInt3646];
									local19 = Class139.anIntArray213[Class139.anInt3646 + 1];
									Class139.anIntArray213[Class139.anInt3646++] = Static155.method3151(local19, true, local13);
									return;
								}
								if (arg0 == 3333) {
									Class139.anIntArray213[Class139.anInt3646++] = Class11_Sub2_Sub3.anInt3710;
									return;
								}
								if (arg0 == 3335) {
									Class139.anIntArray213[Class139.anInt3646++] = Class197.anInt5569;
									return;
								}
								if (arg0 == 3336) {
									Class139.anInt3646 -= 4;
									local13 = Class139.anIntArray213[Class139.anInt3646];
									local19 = Class139.anIntArray213[Class139.anInt3646 + 1];
									local25 = Class139.anIntArray213[Class139.anInt3646 + 2];
									local353 = Class139.anIntArray213[Class139.anInt3646 + 3];
									local13 += local19 << 14;
									local13 += local25 << 28;
									local13 += local353;
									Class139.anIntArray213[Class139.anInt3646++] = local13;
									return;
								}
								if (arg0 == 3337) {
									Class139.anIntArray213[Class139.anInt3646++] = Class116.anInt3145;
									return;
								}
								if (arg0 == 3338) {
									Class139.anIntArray213[Class139.anInt3646++] = Static349.method6274();
									return;
								}
							} else if (arg0 < 3500) {
								@Pc(4761) Class52 local4761;
								if (arg0 == 3400) {
									Class139.anInt3646 -= 2;
									local13 = Class139.anIntArray213[Class139.anInt3646];
									local19 = Class139.anIntArray213[Class139.anInt3646 + 1];
									local4761 = Static131.aClass109_1.method2781(local13);
									Class139.aStringArray29[Class139.anInt3648++] = local4761.method1777(local19);
									return;
								}
								if (arg0 == 3408) {
									Class139.anInt3646 -= 4;
									local13 = Class139.anIntArray213[Class139.anInt3646];
									local19 = Class139.anIntArray213[Class139.anInt3646 + 1];
									local25 = Class139.anIntArray213[Class139.anInt3646 + 2];
									local353 = Class139.anIntArray213[Class139.anInt3646 + 3];
									@Pc(4807) Class52 local4807 = Static131.aClass109_1.method2781(local25);
									if (local4807.aChar4 == local13 && local4807.aChar3 == local19) {
										if (local19 == 115) {
											Class139.aStringArray29[Class139.anInt3648++] = local4807.method1777(local353);
											return;
										}
										Class139.anIntArray213[Class139.anInt3646++] = local4807.method1768(local353);
										return;
									}
									throw new RuntimeException("C3408-1");
								}
								if (arg0 == 3409) {
									Class139.anInt3646 -= 3;
									local13 = Class139.anIntArray213[Class139.anInt3646];
									local19 = Class139.anIntArray213[Class139.anInt3646 + 1];
									local25 = Class139.anIntArray213[Class139.anInt3646 + 2];
									if (local19 == -1) {
										throw new RuntimeException("C3409-2");
									}
									@Pc(4883) Class52 local4883 = Static131.aClass109_1.method2781(local19);
									if (local4883.aChar3 != local13) {
										throw new RuntimeException("C3409-1");
									}
									Class139.anIntArray213[Class139.anInt3646++] = local4883.method1773(local25) ? 1 : 0;
									return;
								}
								if (arg0 == 3410) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									local1101 = Class139.aStringArray29[--Class139.anInt3648];
									if (local13 == -1) {
										throw new RuntimeException("C3410-2");
									}
									local4761 = Static131.aClass109_1.method2781(local13);
									if (local4761.aChar3 != 's') {
										throw new RuntimeException("C3410-1");
									}
									Class139.anIntArray213[Class139.anInt3646++] = local4761.method1771(local1101) ? 1 : 0;
									return;
								}
								if (arg0 == 3411) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									@Pc(4981) Class52 local4981 = Static131.aClass109_1.method2781(local13);
									Class139.anIntArray213[Class139.anInt3646++] = local4981.aClass4_31.method83();
									return;
								}
							} else if (arg0 < 3700) {
								if (arg0 == 3600) {
									if (Class123.anInt3359 == 0) {
										Class139.anIntArray213[Class139.anInt3646++] = -2;
										return;
									}
									if (Class123.anInt3359 == 1) {
										Class139.anIntArray213[Class139.anInt3646++] = -1;
										return;
									}
									Class139.anIntArray213[Class139.anInt3646++] = Class2_Sub43.anInt7165;
									return;
								}
								if (arg0 == 3601) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									if (Class123.anInt3359 == 2 && local13 < Class2_Sub43.anInt7165) {
										Class139.aStringArray29[Class139.anInt3648++] = Class12_Sub1_Sub1.aStringArray43[local13];
										if (Class214.aStringArray54[local13] != null) {
											Class139.aStringArray29[Class139.anInt3648++] = Class214.aStringArray54[local13];
											return;
										}
										Class139.aStringArray29[Class139.anInt3648++] = "";
										return;
									}
									Class139.aStringArray29[Class139.anInt3648++] = "";
									Class139.aStringArray29[Class139.anInt3648++] = "";
									return;
								}
								if (arg0 == 3602) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									if (Class123.anInt3359 == 2 && local13 < Class2_Sub43.anInt7165) {
										Class139.anIntArray213[Class139.anInt3646++] = Class173_Sub2.anIntArray333[local13];
										return;
									}
									Class139.anIntArray213[Class139.anInt3646++] = 0;
									return;
								}
								if (arg0 == 3603) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									if (Class123.anInt3359 == 2 && local13 < Class2_Sub43.anInt7165) {
										Class139.anIntArray213[Class139.anInt3646++] = Class83.anIntArray148[local13];
										return;
									}
									Class139.anIntArray213[Class139.anInt3646++] = 0;
									return;
								}
								if (arg0 == 3604) {
									local3493 = Class139.aStringArray29[--Class139.anInt3648];
									local19 = Class139.anIntArray213[--Class139.anInt3646];
									Static160.method3257(local19, local3493);
									return;
								}
								if (arg0 == 3605) {
									local3493 = Class139.aStringArray29[--Class139.anInt3648];
									Static57.method1671(local3493);
									return;
								}
								if (arg0 == 3606) {
									local3493 = Class139.aStringArray29[--Class139.anInt3648];
									Static33.method4829(local3493);
									return;
								}
								if (arg0 == 3607) {
									local3493 = Class139.aStringArray29[--Class139.anInt3648];
									Static286.method5280(local3493, false);
									return;
								}
								if (arg0 == 3608) {
									local3493 = Class139.aStringArray29[--Class139.anInt3648];
									Static238.method4405(local3493);
									return;
								}
								if (arg0 == 3609) {
									local3493 = Class139.aStringArray29[--Class139.anInt3648];
									if (local3493.startsWith("<img=0>") || local3493.startsWith("<img=1>")) {
										local3493 = local3493.substring(7);
									}
									Class139.anIntArray213[Class139.anInt3646++] = Static365.method6452(local3493) ? 1 : 0;
									return;
								}
								if (arg0 == 3610) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									if (Class123.anInt3359 == 2 && local13 < Class2_Sub43.anInt7165) {
										Class139.aStringArray29[Class139.anInt3648++] = Class147.aStringArray32[local13];
										return;
									}
									Class139.aStringArray29[Class139.anInt3648++] = "";
									return;
								}
								if (arg0 == 3611) {
									if (Class177.aString53 != null) {
										Class139.aStringArray29[Class139.anInt3648++] = Static307.method5658(Class177.aString53);
										return;
									}
									Class139.aStringArray29[Class139.anInt3648++] = "";
									return;
								}
								if (arg0 == 3612) {
									if (Class177.aString53 != null) {
										Class139.anIntArray213[Class139.anInt3646++] = Static174.anInt3726;
										return;
									}
									Class139.anIntArray213[Class139.anInt3646++] = 0;
									return;
								}
								if (arg0 == 3613) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									if (Class177.aString53 != null && local13 < Static174.anInt3726) {
										Class139.aStringArray29[Class139.anInt3648++] = Static44.aClass214Array1[local13].aString58;
										return;
									}
									Class139.aStringArray29[Class139.anInt3648++] = "";
									return;
								}
								if (arg0 == 3614) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									if (Class177.aString53 != null && local13 < Static174.anInt3726) {
										Class139.anIntArray213[Class139.anInt3646++] = Static44.aClass214Array1[local13].anInt5966;
										return;
									}
									Class139.anIntArray213[Class139.anInt3646++] = 0;
									return;
								}
								if (arg0 == 3615) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									if (Class177.aString53 != null && local13 < Static174.anInt3726) {
										Class139.anIntArray213[Class139.anInt3646++] = Static44.aClass214Array1[local13].aByte65;
										return;
									}
									Class139.anIntArray213[Class139.anInt3646++] = 0;
									return;
								}
								if (arg0 == 3616) {
									Class139.anIntArray213[Class139.anInt3646++] = Static244.aByte54;
									return;
								}
								if (arg0 == 3617) {
									local3493 = Class139.aStringArray29[--Class139.anInt3648];
									Static153.method3103(local3493);
									return;
								}
								if (arg0 == 3618) {
									Class139.anIntArray213[Class139.anInt3646++] = Static112.aByte25;
									return;
								}
								if (arg0 == 3619) {
									local3493 = Class139.aStringArray29[--Class139.anInt3648];
									Static108.method3842(local3493);
									return;
								}
								if (arg0 == 3620) {
									Static267.method5027();
									return;
								}
								if (arg0 == 3621) {
									if (Class123.anInt3359 == 0) {
										Class139.anIntArray213[Class139.anInt3646++] = -1;
										return;
									}
									Class139.anIntArray213[Class139.anInt3646++] = Class2_Sub3_Sub30.anInt5688;
									return;
								}
								if (arg0 == 3622) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									if (Class123.anInt3359 != 0 && local13 < Class2_Sub3_Sub30.anInt5688) {
										Class139.aStringArray29[Class139.anInt3648++] = Class2_Sub3_Sub22.aStringArray35[local13];
										if (Class173_Sub4.aStringArray66[local13] != null) {
											Class139.aStringArray29[Class139.anInt3648++] = Class173_Sub4.aStringArray66[local13];
											return;
										}
										Class139.aStringArray29[Class139.anInt3648++] = "";
										return;
									}
									Class139.aStringArray29[Class139.anInt3648++] = "";
									Class139.aStringArray29[Class139.anInt3648++] = "";
									return;
								}
								if (arg0 == 3623) {
									local3493 = Class139.aStringArray29[--Class139.anInt3648];
									if (local3493.startsWith("<img=0>") || local3493.startsWith("<img=1>")) {
										local3493 = local3493.substring(7);
									}
									Class139.anIntArray213[Class139.anInt3646++] = Static98.method2210(local3493) ? 1 : 0;
									return;
								}
								if (arg0 == 3624) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									if (Static44.aClass214Array1 != null && local13 < Static174.anInt3726 && Static44.aClass214Array1[local13].aString60.equalsIgnoreCase(Static17.aClass11_Sub5_Sub2_Sub1_3.aString41)) {
										Class139.anIntArray213[Class139.anInt3646++] = 1;
										return;
									}
									Class139.anIntArray213[Class139.anInt3646++] = 0;
									return;
								}
								if (arg0 == 3625) {
									if (Class12_Sub3.aString25 != null) {
										Class139.aStringArray29[Class139.anInt3648++] = Class12_Sub3.aString25;
										return;
									}
									Class139.aStringArray29[Class139.anInt3648++] = "";
									return;
								}
								if (arg0 == 3626) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									if (Class177.aString53 != null && local13 < Static174.anInt3726) {
										Class139.aStringArray29[Class139.anInt3648++] = Static44.aClass214Array1[local13].aString61;
										return;
									}
									Class139.aStringArray29[Class139.anInt3648++] = "";
									return;
								}
								if (arg0 == 3627) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									if (Class123.anInt3359 == 2 && local13 >= 0 && local13 < Class2_Sub43.anInt7165) {
										Class139.anIntArray213[Class139.anInt3646++] = Class37.aBooleanArray13[local13] ? 1 : 0;
										return;
									}
									Class139.anIntArray213[Class139.anInt3646++] = 0;
									return;
								}
								if (arg0 == 3628) {
									local3493 = Class139.aStringArray29[--Class139.anInt3648];
									if (local3493.startsWith("<img=0>") || local3493.startsWith("<img=1>")) {
										local3493 = local3493.substring(7);
									}
									Class139.anIntArray213[Class139.anInt3646++] = Static110.method2374(local3493);
									return;
								}
								if (arg0 == 3629) {
									Class139.anIntArray213[Class139.anInt3646++] = Static297.anInt5995;
									return;
								}
								if (arg0 == 3630) {
									local3493 = Class139.aStringArray29[--Class139.anInt3648];
									Static286.method5280(local3493, true);
									return;
								}
								if (arg0 == 3631) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									Class139.anIntArray213[Class139.anInt3646++] = Class119.aBooleanArray31[local13] ? 1 : 0;
									return;
								}
								if (arg0 == 3632) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									if (Class177.aString53 != null && local13 < Static174.anInt3726) {
										Class139.aStringArray29[Class139.anInt3648++] = Static44.aClass214Array1[local13].aString60;
										return;
									}
									Class139.aStringArray29[Class139.anInt3648++] = "";
									return;
								}
								if (arg0 == 3633) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									if (Class123.anInt3359 != 0 && local13 < Class2_Sub3_Sub30.anInt5688) {
										Class139.aStringArray29[Class139.anInt3648++] = Class11_Sub3_Sub2.aStringArray39[local13];
										return;
									}
									Class139.aStringArray29[Class139.anInt3648++] = "";
									return;
								}
							} else if (arg0 < 4000) {
								if (arg0 == 3903) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									Class139.anIntArray213[Class139.anInt3646++] = Class194.aClass187Array1[local13].method4684();
									return;
								}
								if (arg0 == 3904) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									Class139.anIntArray213[Class139.anInt3646++] = Class194.aClass187Array1[local13].anInt5095;
									return;
								}
								if (arg0 == 3905) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									Class139.anIntArray213[Class139.anInt3646++] = Class194.aClass187Array1[local13].anInt5098;
									return;
								}
								if (arg0 == 3906) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									Class139.anIntArray213[Class139.anInt3646++] = Class194.aClass187Array1[local13].anInt5101;
									return;
								}
								if (arg0 == 3907) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									Class139.anIntArray213[Class139.anInt3646++] = Class194.aClass187Array1[local13].anInt5096;
									return;
								}
								if (arg0 == 3908) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									Class139.anIntArray213[Class139.anInt3646++] = Class194.aClass187Array1[local13].anInt5104;
									return;
								}
								if (arg0 == 3910) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									local19 = Class194.aClass187Array1[local13].method4680();
									Class139.anIntArray213[Class139.anInt3646++] = local19 == 0 ? 1 : 0;
									return;
								}
								if (arg0 == 3911) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									local19 = Class194.aClass187Array1[local13].method4680();
									Class139.anIntArray213[Class139.anInt3646++] = local19 == 2 ? 1 : 0;
									return;
								}
								if (arg0 == 3912) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									local19 = Class194.aClass187Array1[local13].method4680();
									Class139.anIntArray213[Class139.anInt3646++] = local19 == 5 ? 1 : 0;
									return;
								}
								if (arg0 == 3913) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									local19 = Class194.aClass187Array1[local13].method4680();
									Class139.anIntArray213[Class139.anInt3646++] = local19 == 1 ? 1 : 0;
									return;
								}
							} else if (arg0 < 4100) {
								if (arg0 == 4000) {
									Class139.anInt3646 -= 2;
									local13 = Class139.anIntArray213[Class139.anInt3646];
									local19 = Class139.anIntArray213[Class139.anInt3646 + 1];
									Class139.anIntArray213[Class139.anInt3646++] = local13 + local19;
									return;
								}
								if (arg0 == 4001) {
									Class139.anInt3646 -= 2;
									local13 = Class139.anIntArray213[Class139.anInt3646];
									local19 = Class139.anIntArray213[Class139.anInt3646 + 1];
									Class139.anIntArray213[Class139.anInt3646++] = local13 - local19;
									return;
								}
								if (arg0 == 4002) {
									Class139.anInt3646 -= 2;
									local13 = Class139.anIntArray213[Class139.anInt3646];
									local19 = Class139.anIntArray213[Class139.anInt3646 + 1];
									Class139.anIntArray213[Class139.anInt3646++] = local13 * local19;
									return;
								}
								if (arg0 == 4003) {
									Class139.anInt3646 -= 2;
									local13 = Class139.anIntArray213[Class139.anInt3646];
									local19 = Class139.anIntArray213[Class139.anInt3646 + 1];
									Class139.anIntArray213[Class139.anInt3646++] = local13 / local19;
									return;
								}
								if (arg0 == 4004) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									Class139.anIntArray213[Class139.anInt3646++] = (int) (Math.random() * (double) local13);
									return;
								}
								if (arg0 == 4005) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									Class139.anIntArray213[Class139.anInt3646++] = (int) (Math.random() * (double) (local13 + 1));
									return;
								}
								if (arg0 == 4006) {
									Class139.anInt3646 -= 5;
									local13 = Class139.anIntArray213[Class139.anInt3646];
									local19 = Class139.anIntArray213[Class139.anInt3646 + 1];
									local25 = Class139.anIntArray213[Class139.anInt3646 + 2];
									local353 = Class139.anIntArray213[Class139.anInt3646 + 3];
									local2194 = Class139.anIntArray213[Class139.anInt3646 + 4];
									Class139.anIntArray213[Class139.anInt3646++] = local13 + (local19 - local13) * (local2194 - local25) / (local353 - local25);
									return;
								}
								@Pc(6491) long local6491;
								@Pc(6484) long local6484;
								if (arg0 == 4007) {
									Class139.anInt3646 -= 2;
									local6484 = Class139.anIntArray213[Class139.anInt3646];
									local6491 = Class139.anIntArray213[Class139.anInt3646 + 1];
									Class139.anIntArray213[Class139.anInt3646++] = (int) (local6484 + local6484 * local6491 / 100L);
									return;
								}
								if (arg0 == 4008) {
									Class139.anInt3646 -= 2;
									local13 = Class139.anIntArray213[Class139.anInt3646];
									local19 = Class139.anIntArray213[Class139.anInt3646 + 1];
									Class139.anIntArray213[Class139.anInt3646++] = local13 | 0x1 << local19;
									return;
								}
								if (arg0 == 4009) {
									Class139.anInt3646 -= 2;
									local13 = Class139.anIntArray213[Class139.anInt3646];
									local19 = Class139.anIntArray213[Class139.anInt3646 + 1];
									Class139.anIntArray213[Class139.anInt3646++] = local13 & -(0x1 << local19) - 1;
									return;
								}
								if (arg0 == 4010) {
									Class139.anInt3646 -= 2;
									local13 = Class139.anIntArray213[Class139.anInt3646];
									local19 = Class139.anIntArray213[Class139.anInt3646 + 1];
									Class139.anIntArray213[Class139.anInt3646++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
									return;
								}
								if (arg0 == 4011) {
									Class139.anInt3646 -= 2;
									local13 = Class139.anIntArray213[Class139.anInt3646];
									local19 = Class139.anIntArray213[Class139.anInt3646 + 1];
									Class139.anIntArray213[Class139.anInt3646++] = local13 % local19;
									return;
								}
								if (arg0 == 4012) {
									Class139.anInt3646 -= 2;
									local13 = Class139.anIntArray213[Class139.anInt3646];
									local19 = Class139.anIntArray213[Class139.anInt3646 + 1];
									if (local13 == 0) {
										Class139.anIntArray213[Class139.anInt3646++] = 0;
										return;
									}
									Class139.anIntArray213[Class139.anInt3646++] = (int) Math.pow((double) local13, (double) local19);
									return;
								}
								if (arg0 == 4013) {
									Class139.anInt3646 -= 2;
									local13 = Class139.anIntArray213[Class139.anInt3646];
									local19 = Class139.anIntArray213[Class139.anInt3646 + 1];
									if (local13 == 0) {
										Class139.anIntArray213[Class139.anInt3646++] = 0;
										return;
									}
									if (local19 == 0) {
										Class139.anIntArray213[Class139.anInt3646++] = Integer.MAX_VALUE;
										return;
									}
									Class139.anIntArray213[Class139.anInt3646++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
									return;
								}
								if (arg0 == 4014) {
									Class139.anInt3646 -= 2;
									local13 = Class139.anIntArray213[Class139.anInt3646];
									local19 = Class139.anIntArray213[Class139.anInt3646 + 1];
									Class139.anIntArray213[Class139.anInt3646++] = local13 & local19;
									return;
								}
								if (arg0 == 4015) {
									Class139.anInt3646 -= 2;
									local13 = Class139.anIntArray213[Class139.anInt3646];
									local19 = Class139.anIntArray213[Class139.anInt3646 + 1];
									Class139.anIntArray213[Class139.anInt3646++] = local13 | local19;
									return;
								}
								if (arg0 == 4016) {
									Class139.anInt3646 -= 2;
									local13 = Class139.anIntArray213[Class139.anInt3646];
									local19 = Class139.anIntArray213[Class139.anInt3646 + 1];
									Class139.anIntArray213[Class139.anInt3646++] = local13 < local19 ? local13 : local19;
									return;
								}
								if (arg0 == 4017) {
									Class139.anInt3646 -= 2;
									local13 = Class139.anIntArray213[Class139.anInt3646];
									local19 = Class139.anIntArray213[Class139.anInt3646 + 1];
									Class139.anIntArray213[Class139.anInt3646++] = local13 > local19 ? local13 : local19;
									return;
								}
								if (arg0 == 4018) {
									Class139.anInt3646 -= 3;
									local6484 = Class139.anIntArray213[Class139.anInt3646];
									local6491 = Class139.anIntArray213[Class139.anInt3646 + 1];
									@Pc(6872) long local6872 = (long) Class139.anIntArray213[Class139.anInt3646 + 2];
									Class139.anIntArray213[Class139.anInt3646++] = (int) (local6484 * local6872 / local6491);
									return;
								}
							} else if (arg0 < 4200) {
								if (arg0 == 4100) {
									local3493 = Class139.aStringArray29[--Class139.anInt3648];
									local19 = Class139.anIntArray213[--Class139.anInt3646];
									Class139.aStringArray29[Class139.anInt3648++] = local3493 + local19;
									return;
								}
								if (arg0 == 4101) {
									Class139.anInt3648 -= 2;
									local3493 = Class139.aStringArray29[Class139.anInt3648];
									local1101 = Class139.aStringArray29[Class139.anInt3648 + 1];
									Class139.aStringArray29[Class139.anInt3648++] = local3493 + local1101;
									return;
								}
								if (arg0 == 4102) {
									local3493 = Class139.aStringArray29[--Class139.anInt3648];
									local19 = Class139.anIntArray213[--Class139.anInt3646];
									Class139.aStringArray29[Class139.anInt3648++] = local3493 + Static297.method5463(local19);
									return;
								}
								if (arg0 == 4103) {
									local3493 = Class139.aStringArray29[--Class139.anInt3648];
									Class139.aStringArray29[Class139.anInt3648++] = local3493.toLowerCase();
									return;
								}
								if (arg0 == 4104) {
									Class139.aStringArray29[Class139.anInt3648++] = method3595(Class139.anIntArray213[--Class139.anInt3646]);
									return;
								}
								if (arg0 == 4105) {
									Class139.anInt3648 -= 2;
									local3493 = Class139.aStringArray29[Class139.anInt3648];
									local1101 = Class139.aStringArray29[Class139.anInt3648 + 1];
									if (Static17.aClass11_Sub5_Sub2_Sub1_3.aClass117_1 != null && Static17.aClass11_Sub5_Sub2_Sub1_3.aClass117_1.aBoolean220) {
										Class139.aStringArray29[Class139.anInt3648++] = local1101;
										return;
									}
									Class139.aStringArray29[Class139.anInt3648++] = local3493;
									return;
								}
								if (arg0 == 4106) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									Class139.aStringArray29[Class139.anInt3648++] = Integer.toString(local13);
									return;
								}
								if (arg0 == 4107) {
									Class139.anInt3648 -= 2;
									Class139.anIntArray213[Class139.anInt3646++] = Static216.method4070(Class139.aStringArray29[Class139.anInt3648 + 1], Class139.aStringArray29[Class139.anInt3648], Class197.anInt5569);
									return;
								}
								@Pc(7155) Class239 local7155;
								if (arg0 == 4108) {
									local3493 = Class139.aStringArray29[--Class139.anInt3648];
									Class139.anInt3646 -= 2;
									local19 = Class139.anIntArray213[Class139.anInt3646];
									local25 = Class139.anIntArray213[Class139.anInt3646 + 1];
									local7155 = Static94.method2167(local25, Static235.aClass197_64);
									Class139.anIntArray213[Class139.anInt3646++] = local7155.method6124(local3493, local19, Static117.aClass13Array27);
									return;
								}
								if (arg0 == 4109) {
									local3493 = Class139.aStringArray29[--Class139.anInt3648];
									Class139.anInt3646 -= 2;
									local19 = Class139.anIntArray213[Class139.anInt3646];
									local25 = Class139.anIntArray213[Class139.anInt3646 + 1];
									local7155 = Static94.method2167(local25, Static235.aClass197_64);
									Class139.anIntArray213[Class139.anInt3646++] = local7155.method6125(Static117.aClass13Array27, local3493, local19);
									return;
								}
								if (arg0 == 4110) {
									Class139.anInt3648 -= 2;
									local3493 = Class139.aStringArray29[Class139.anInt3648];
									local1101 = Class139.aStringArray29[Class139.anInt3648 + 1];
									if (Class139.anIntArray213[--Class139.anInt3646] == 1) {
										Class139.aStringArray29[Class139.anInt3648++] = local3493;
										return;
									}
									Class139.aStringArray29[Class139.anInt3648++] = local1101;
									return;
								}
								if (arg0 == 4111) {
									local3493 = Class139.aStringArray29[--Class139.anInt3648];
									Class139.aStringArray29[Class139.anInt3648++] = Static144.method2774(local3493);
									return;
								}
								if (arg0 == 4112) {
									local3493 = Class139.aStringArray29[--Class139.anInt3648];
									local19 = Class139.anIntArray213[--Class139.anInt3646];
									if (local19 == -1) {
										throw new RuntimeException("null char");
									}
									Class139.aStringArray29[Class139.anInt3648++] = local3493 + (char) local19;
									return;
								}
								if (arg0 == 4113) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									Class139.anIntArray213[Class139.anInt3646++] = Static137.method2699((char) local13) ? 1 : 0;
									return;
								}
								if (arg0 == 4114) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									Class139.anIntArray213[Class139.anInt3646++] = Static83.method1941((char) local13) ? 1 : 0;
									return;
								}
								if (arg0 == 4115) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									Class139.anIntArray213[Class139.anInt3646++] = Static34.method1103((char) local13) ? 1 : 0;
									return;
								}
								if (arg0 == 4116) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									Class139.anIntArray213[Class139.anInt3646++] = Static305.method5599((char) local13) ? 1 : 0;
									return;
								}
								if (arg0 == 4117) {
									local3493 = Class139.aStringArray29[--Class139.anInt3648];
									if (local3493 != null) {
										Class139.anIntArray213[Class139.anInt3646++] = local3493.length();
										return;
									}
									Class139.anIntArray213[Class139.anInt3646++] = 0;
									return;
								}
								if (arg0 == 4118) {
									local3493 = Class139.aStringArray29[--Class139.anInt3648];
									Class139.anInt3646 -= 2;
									local19 = Class139.anIntArray213[Class139.anInt3646];
									local25 = Class139.anIntArray213[Class139.anInt3646 + 1];
									Class139.aStringArray29[Class139.anInt3648++] = local3493.substring(local19, local25);
									return;
								}
								if (arg0 == 4119) {
									local3493 = Class139.aStringArray29[--Class139.anInt3648];
									@Pc(7518) StringBuffer local7518 = new StringBuffer(local3493.length());
									@Pc(7520) boolean local7520 = false;
									for (local353 = 0; local353 < local3493.length(); local353++) {
										@Pc(7527) char local7527 = local3493.charAt(local353);
										if (local7527 == '<') {
											local7520 = true;
										} else if (local7527 == '>') {
											local7520 = false;
										} else if (!local7520) {
											local7518.append(local7527);
										}
									}
									Class139.aStringArray29[Class139.anInt3648++] = local7518.toString();
									return;
								}
								if (arg0 == 4120) {
									local3493 = Class139.aStringArray29[--Class139.anInt3648];
									Class139.anInt3646 -= 2;
									local19 = Class139.anIntArray213[Class139.anInt3646];
									local25 = Class139.anIntArray213[Class139.anInt3646 + 1];
									Class139.anIntArray213[Class139.anInt3646++] = local3493.indexOf(local19, local25);
									return;
								}
								if (arg0 == 4121) {
									Class139.anInt3648 -= 2;
									local3493 = Class139.aStringArray29[Class139.anInt3648];
									local1101 = Class139.aStringArray29[Class139.anInt3648 + 1];
									local25 = Class139.anIntArray213[--Class139.anInt3646];
									Class139.anIntArray213[Class139.anInt3646++] = local3493.indexOf(local1101, local25);
									return;
								}
								if (arg0 == 4122) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									Class139.anIntArray213[Class139.anInt3646++] = Character.toLowerCase((char) local13);
									return;
								}
								if (arg0 == 4123) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									Class139.anIntArray213[Class139.anInt3646++] = Character.toUpperCase((char) local13);
									return;
								}
								if (arg0 == 4124) {
									local412 = Class139.anIntArray213[--Class139.anInt3646] != 0;
									local19 = Class139.anIntArray213[--Class139.anInt3646];
									Class139.aStringArray29[Class139.anInt3648++] = Static161.method3290((long) local19, Class197.anInt5569, local412, 0);
									return;
								}
								if (arg0 == 4125) {
									local3493 = Class139.aStringArray29[--Class139.anInt3648];
									local19 = Class139.anIntArray213[--Class139.anInt3646];
									@Pc(7741) Class239 local7741 = Static94.method2167(local19, Static235.aClass197_64);
									Class139.anIntArray213[Class139.anInt3646++] = local7741.method6128(Static117.aClass13Array27, local3493);
									return;
								}
							} else {
								@Pc(8083) Class240 local8083;
								if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = Class139.anIntArray213[--Class139.anInt3646];
										Class139.aStringArray29[Class139.anInt3648++] = Static290.aClass107_2.method2761(local13).aString55;
										return;
									}
									@Pc(7803) Class188 local7803;
									if (arg0 == 4201) {
										Class139.anInt3646 -= 2;
										local13 = Class139.anIntArray213[Class139.anInt3646];
										local19 = Class139.anIntArray213[Class139.anInt3646 + 1];
										local7803 = Static290.aClass107_2.method2761(local13);
										if (local19 >= 1 && local19 <= 5 && local7803.aStringArray50[local19 - 1] != null) {
											Class139.aStringArray29[Class139.anInt3648++] = local7803.aStringArray50[local19 - 1];
											return;
										}
										Class139.aStringArray29[Class139.anInt3648++] = "";
										return;
									}
									if (arg0 == 4202) {
										Class139.anInt3646 -= 2;
										local13 = Class139.anIntArray213[Class139.anInt3646];
										local19 = Class139.anIntArray213[Class139.anInt3646 + 1];
										local7803 = Static290.aClass107_2.method2761(local13);
										if (local19 >= 1 && local19 <= 5 && local7803.aStringArray51[local19 - 1] != null) {
											Class139.aStringArray29[Class139.anInt3648++] = local7803.aStringArray51[local19 - 1];
											return;
										}
										Class139.aStringArray29[Class139.anInt3648++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = Class139.anIntArray213[--Class139.anInt3646];
										Class139.anIntArray213[Class139.anInt3646++] = Static290.aClass107_2.method2761(local13).anInt5210;
										return;
									}
									if (arg0 == 4204) {
										local13 = Class139.anIntArray213[--Class139.anInt3646];
										Class139.anIntArray213[Class139.anInt3646++] = Static290.aClass107_2.method2761(local13).lb == 1 ? 1 : 0;
										return;
									}
									@Pc(7966) Class188 local7966;
									if (arg0 == 4205) {
										local13 = Class139.anIntArray213[--Class139.anInt3646];
										local7966 = Static290.aClass107_2.method2761(local13);
										if (local7966.anInt5247 == -1 && local7966.anInt5192 >= 0) {
											Class139.anIntArray213[Class139.anInt3646++] = local7966.anInt5192;
											return;
										}
										Class139.anIntArray213[Class139.anInt3646++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = Class139.anIntArray213[--Class139.anInt3646];
										local7966 = Static290.aClass107_2.method2761(local13);
										if (local7966.anInt5247 >= 0 && local7966.anInt5192 >= 0) {
											Class139.anIntArray213[Class139.anInt3646++] = local7966.anInt5192;
											return;
										}
										Class139.anIntArray213[Class139.anInt3646++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = Class139.anIntArray213[--Class139.anInt3646];
										Class139.anIntArray213[Class139.anInt3646++] = Static290.aClass107_2.method2761(local13).aBoolean382 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										Class139.anInt3646 -= 2;
										local13 = Class139.anIntArray213[Class139.anInt3646];
										local19 = Class139.anIntArray213[Class139.anInt3646 + 1];
										local8083 = Static338.aClass18_2.method565(local19);
										if (local8083.method6264()) {
											Class139.aStringArray29[Class139.anInt3648++] = Static290.aClass107_2.method2761(local13).method4774(local8083.aString69, local19);
											return;
										}
										Class139.anIntArray213[Class139.anInt3646++] = Static290.aClass107_2.method2761(local13).method4773(local8083.anInt7010, local19);
										return;
									}
									if (arg0 == 4209) {
										Class139.anInt3646 -= 2;
										local13 = Class139.anIntArray213[Class139.anInt3646];
										local19 = Class139.anIntArray213[Class139.anInt3646 + 1] - 1;
										local7803 = Static290.aClass107_2.method2761(local13);
										if (local7803.anInt5234 == local19) {
											Class139.anIntArray213[Class139.anInt3646++] = local7803.anInt5194;
											return;
										}
										if (local7803.anInt5211 == local19) {
											Class139.anIntArray213[Class139.anInt3646++] = local7803.anInt5230;
											return;
										}
										Class139.anIntArray213[Class139.anInt3646++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local3493 = Class139.aStringArray29[--Class139.anInt3648];
										local19 = Class139.anIntArray213[--Class139.anInt3646];
										Static122.method3698(local3493, local19 == 1);
										Class139.anIntArray213[Class139.anInt3646++] = Static305.anInt6115;
										return;
									}
									if (arg0 == 4211) {
										if (Static165.aShortArray55 != null && Static12.anInt266 < Static305.anInt6115) {
											Class139.anIntArray213[Class139.anInt3646++] = Static165.aShortArray55[Static12.anInt266++] & 0xFFFF;
											return;
										}
										Class139.anIntArray213[Class139.anInt3646++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static12.anInt266 = 0;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										Class139.anInt3646 -= 2;
										local13 = Class139.anIntArray213[Class139.anInt3646];
										local19 = Class139.anIntArray213[Class139.anInt3646 + 1];
										local8083 = Static338.aClass18_2.method565(local19);
										if (local8083.method6264()) {
											Class139.aStringArray29[Class139.anInt3648++] = Static6.aClass219_1.method5571(local13).method2092(local8083.aString69, local19);
											return;
										}
										Class139.anIntArray213[Class139.anInt3646++] = Static6.aClass219_1.method5571(local13).method2100(local8083.anInt7010, local19);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										Class139.anInt3646 -= 2;
										local13 = Class139.anIntArray213[Class139.anInt3646];
										local19 = Class139.anIntArray213[Class139.anInt3646 + 1];
										local8083 = Static338.aClass18_2.method565(local19);
										if (local8083.method6264()) {
											Class139.aStringArray29[Class139.anInt3648++] = Static334.aClass202_4.method5164(local13).method1522(local8083.aString69, local19);
											return;
										}
										Class139.anIntArray213[Class139.anInt3646++] = Static334.aClass202_4.method5164(local13).method1534(local8083.anInt7010, local19);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										Class139.anInt3646 -= 2;
										local13 = Class139.anIntArray213[Class139.anInt3646];
										local19 = Class139.anIntArray213[Class139.anInt3646 + 1];
										local8083 = Static338.aClass18_2.method565(local19);
										if (local8083.method6264()) {
											Class139.aStringArray29[Class139.anInt3648++] = Static342.aClass132_1.method3472(local13).method1346(local19, local8083.aString69);
											return;
										}
										Class139.anIntArray213[Class139.anInt3646++] = Static342.aClass132_1.method3472(local13).method1343(local19, local8083.anInt7010);
										return;
									}
								} else if (arg0 < 4700 && arg0 == 4600) {
									local13 = Class139.anIntArray213[--Class139.anInt3646];
									@Pc(8467) Class222 local8467 = Static55.aClass7_1.method245(local13);
									if (local8467.anIntArray426 != null && local8467.anIntArray426.length > 0) {
										local25 = 0;
										local353 = local8467.anIntArray427[0];
										for (local2194 = 1; local2194 < local8467.anIntArray426.length; local2194++) {
											if (local8467.anIntArray427[local2194] > local353) {
												local25 = local2194;
												local353 = local8467.anIntArray427[local2194];
											}
										}
										Class139.anIntArray213[Class139.anInt3646++] = local8467.anIntArray426[local25];
										return;
									}
									Class139.anIntArray213[Class139.anInt3646++] = local8467.anInt6279;
									return;
								}
							}
						}
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static6.method140(Class139.anIntArray213[--Class139.anInt3646]);
				} else {
					local137 = arg1 ? aClass161_10 : aClass161_9;
				}
				if (arg0 == 1000) {
					Class139.anInt3646 -= 4;
					local137.anInt4235 = Class139.anIntArray213[Class139.anInt3646];
					local137.anInt4243 = Class139.anIntArray213[Class139.anInt3646 + 1];
					local19 = Class139.anIntArray213[Class139.anInt3646 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = Class139.anIntArray213[Class139.anInt3646 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte45 = (byte) local19;
					local137.aByte46 = (byte) local25;
					Static187.method3646(local137);
					Static54.method1626(local137);
					if (local137.anInt4290 == -1) {
						Static130.method2587(local137.anInt4310);
					}
					return;
				}
				if (arg0 == 1001) {
					Class139.anInt3646 -= 4;
					local137.anInt4287 = Class139.anIntArray213[Class139.anInt3646];
					local137.anInt4282 = Class139.anIntArray213[Class139.anInt3646 + 1];
					local137.anInt4245 = 0;
					local137.anInt4262 = 0;
					local19 = Class139.anIntArray213[Class139.anInt3646 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = Class139.anIntArray213[Class139.anInt3646 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte47 = (byte) local19;
					local137.aByte44 = (byte) local25;
					Static187.method3646(local137);
					Static54.method1626(local137);
					if (local137.anInt4265 == 0) {
						Static81.method1913(false, local137);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(620) boolean local620 = Class139.anIntArray213[--Class139.anInt3646] == 1;
					if (local137.aBoolean284 != local620) {
						local137.aBoolean284 = local620;
						Static187.method3646(local137);
					}
					if (local137.anInt4290 == -1) {
						Static201.method3779(local137.anInt4310);
					}
					return;
				}
				if (arg0 == 1004) {
					Class139.anInt3646 -= 2;
					local137.anInt4237 = Class139.anIntArray213[Class139.anInt3646];
					local137.anInt4284 = Class139.anIntArray213[Class139.anInt3646 + 1];
					Static187.method3646(local137);
					Static54.method1626(local137);
					if (local137.anInt4265 == 0) {
						Static81.method1913(false, local137);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean295 = Class139.anIntArray213[--Class139.anInt3646] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!bc;II)V", line = 3821)
	public static void method3597(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class2_Sub2_Sub11 local5 = Static173.method3400(arg2, arg0, arg1);
		if (local5 == null) {
			return;
		}
		anIntArray212 = new int[local5.anInt3221];
		aStringArray30 = new String[local5.anInt3224];
		if (local5.aClass16_4 == Class2_Sub42.aClass16_9 || local5.aClass16_4 == Class208.aClass16_7 || local5.aClass16_4 == Class2_Sub2_Sub1.aClass16_1) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static211.aClass161_11 != null) {
				local30 = Static211.aClass161_11.anInt4298;
				local32 = Static211.aClass161_11.anInt4248;
			}
			anIntArray212[0] = Static210.aClass119_1.method3305() - local30;
			anIntArray212[1] = Static210.aClass119_1.method3314() - local32;
		}
		method3601(local5, 200000);
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(I)V", line = 3850)
	private static void method3598(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = Static6.method140(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class161[] local13 = Static106.aClass161ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class161[] local19 = Static25.aClass161ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static106.aClass161ArrayArray2[local9] = new Class161[local22];
			Static390.method4610(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static390.method4610(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "(I)V", line = 3892)
	public static void method3599(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static207.method3917(arg0)) {
			return;
		}
		@Pc(12) Class161[] local12 = Static25.aClass161ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class161 local19 = local12[local14];
			if (local19.anObjectArray22 != null) {
				@Pc(26) Class2_Sub13 local26 = new Class2_Sub13();
				local26.aClass161_3 = local19;
				local26.anObjectArray4 = local19.anObjectArray22;
				method3594(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(IZ)V", line = 3928)
	private static void method3600(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(157) int local157;
		@Pc(1292) boolean local1292;
		@Pc(192) int local192;
		@Pc(95) int local95;
		@Pc(89) int local89;
		@Pc(81) String local81;
		@Pc(75) String local75;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				Class139.anIntArray213[Class139.anInt3646++] = Class17.anInt545;
				return;
			}
			if (arg0 == 5001) {
				Class139.anInt3646 -= 3;
				Class17.anInt545 = Class139.anIntArray213[Class139.anInt3646];
				Static145.aClass170_2 = Static312.method5696(Class139.anIntArray213[Class139.anInt3646 + 1]);
				if (Static145.aClass170_2 == null) {
					Static145.aClass170_2 = Class2_Sub3_Sub34.aClass170_4;
				}
				Class220.anInt6194 = Class139.anIntArray213[Class139.anInt3646 + 2];
				Static85.method1962(Class2_Sub3_Sub5.aClass145_32);
				Class14.aClass2_Sub4_Sub2_4.method4843(Class17.anInt545);
				Class14.aClass2_Sub4_Sub2_4.method4843(Static145.aClass170_2.anInt4681);
				Class14.aClass2_Sub4_Sub2_4.method4843(Class220.anInt6194);
				return;
			}
			if (arg0 == 5002) {
				Class139.anInt3648 -= 2;
				local75 = Class139.aStringArray29[Class139.anInt3648];
				local81 = Class139.aStringArray29[Class139.anInt3648 + 1];
				Class139.anInt3646 -= 2;
				local89 = Class139.anIntArray213[Class139.anInt3646];
				local95 = Class139.anIntArray213[Class139.anInt3646 + 1];
				if (local81 == null) {
					local81 = "";
				}
				if (local81.length() > 80) {
					local81 = local81.substring(0, 80);
				}
				Static85.method1962(Class219.aClass145_222);
				Class14.aClass2_Sub4_Sub2_4.method4843(Static26.method872(local75) + Static26.method872(local81) + 2);
				Class14.aClass2_Sub4_Sub2_4.method4823(local75);
				Class14.aClass2_Sub4_Sub2_4.method4843(local89 - 1);
				Class14.aClass2_Sub4_Sub2_4.method4843(local95);
				Class14.aClass2_Sub4_Sub2_4.method4823(local81);
				return;
			}
			if (arg0 == 5003) {
				local157 = Class139.anIntArray213[--Class139.anInt3646];
				local81 = null;
				if (local157 < 100) {
					local81 = Class65.aStringArray13[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				Class139.aStringArray29[Class139.anInt3648++] = local81;
				return;
			}
			if (arg0 == 5004) {
				local157 = Class139.anIntArray213[--Class139.anInt3646];
				local192 = -1;
				if (local157 < 100 && Class65.aStringArray13[local157] != null) {
					local192 = Class195.anIntArray373[local157];
				}
				Class139.anIntArray213[Class139.anInt3646++] = local192;
				return;
			}
			if (arg0 == 5005) {
				if (Static145.aClass170_2 == null) {
					Class139.anIntArray213[Class139.anInt3646++] = -1;
					return;
				}
				Class139.anIntArray213[Class139.anInt3646++] = Static145.aClass170_2.anInt4681;
				return;
			}
			if (arg0 == 5008 || arg0 == 5021) {
				local75 = Class139.aStringArray29[--Class139.anInt3648];
				method3593(local75, arg0);
				return;
			}
			if (arg0 == 5009) {
				Class139.anInt3648 -= 2;
				local75 = Class139.aStringArray29[Class139.anInt3648];
				local81 = Class139.aStringArray29[Class139.anInt3648 + 1];
				if (Class3_Sub1.anInt90 != 0 || (!Class43.aBoolean123 || Class73.aBoolean159) && !Class78_Sub1.aBoolean166) {
					Static85.method1962(Class2_Sub41.aClass145_261);
					Class14.aClass2_Sub4_Sub2_4.method4843(0);
					local89 = Class14.aClass2_Sub4_Sub2_4.anInt5289;
					Class14.aClass2_Sub4_Sub2_4.method4823(local75);
					Static113.method2381(local81, Class14.aClass2_Sub4_Sub2_4);
					Class14.aClass2_Sub4_Sub2_4.method4862(Class14.aClass2_Sub4_Sub2_4.anInt5289 - local89);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local157 = Class139.anIntArray213[--Class139.anInt3646];
				local81 = null;
				if (local157 < 100) {
					local81 = Class11_Sub3.aStringArray59[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				Class139.aStringArray29[Class139.anInt3648++] = local81;
				return;
			}
			if (arg0 == 5011) {
				local157 = Class139.anIntArray213[--Class139.anInt3646];
				local81 = null;
				if (local157 < 100) {
					local81 = Class2_Sub3_Sub13.aStringArray20[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				Class139.aStringArray29[Class139.anInt3648++] = local81;
				return;
			}
			if (arg0 == 5012) {
				local157 = Class139.anIntArray213[--Class139.anInt3646];
				local192 = -1;
				if (local157 < 100) {
					local192 = RuntimeException_Sub1.anIntArray162[local157];
				}
				Class139.anIntArray213[Class139.anInt3646++] = local192;
				return;
			}
			if (arg0 == 5015) {
				if (Static17.aClass11_Sub5_Sub2_Sub1_3 == null || Static17.aClass11_Sub5_Sub2_Sub1_3.aString42 == null) {
					local75 = Class242.aString70;
				} else {
					local75 = Static17.aClass11_Sub5_Sub2_Sub1_3.method4073();
				}
				Class139.aStringArray29[Class139.anInt3648++] = local75;
				return;
			}
			if (arg0 == 5016) {
				Class139.anIntArray213[Class139.anInt3646++] = Class220.anInt6194;
				return;
			}
			if (arg0 == 5017) {
				Class139.anIntArray213[Class139.anInt3646++] = Class2_Sub3_Sub22.anInt4011;
				return;
			}
			if (arg0 == 5018) {
				local157 = Class139.anIntArray213[--Class139.anInt3646];
				local192 = 0;
				if (local157 < 100 && Class65.aStringArray13[local157] != null) {
					local192 = Class195.anIntArray373[local157];
				}
				Class139.anIntArray213[Class139.anInt3646++] = local192;
				return;
			}
			if (arg0 == 5019) {
				local157 = Class139.anIntArray213[--Class139.anInt3646];
				local81 = null;
				if (local157 < 100) {
					local81 = Class12_Sub3.aStringArray26[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				Class139.aStringArray29[Class139.anInt3648++] = local81;
				return;
			}
			if (arg0 == 5020) {
				if (Static17.aClass11_Sub5_Sub2_Sub1_3 == null || Static17.aClass11_Sub5_Sub2_Sub1_3.aString42 == null) {
					local75 = Class242.aString70;
				} else {
					local75 = Static17.aClass11_Sub5_Sub2_Sub1_3.method4071();
				}
				Class139.aStringArray29[Class139.anInt3648++] = local75;
				return;
			}
			if (arg0 == 5050) {
				local157 = Class139.anIntArray213[--Class139.anInt3646];
				Class139.aStringArray29[Class139.anInt3648++] = Static129.method2583(local157).aString37;
				return;
			}
			@Pc(584) Class2_Sub2_Sub12 local584;
			if (arg0 == 5051) {
				local157 = Class139.anIntArray213[--Class139.anInt3646];
				local584 = Static129.method2583(local157);
				if (local584.anIntArray233 == null) {
					Class139.anIntArray213[Class139.anInt3646++] = 0;
					return;
				}
				Class139.anIntArray213[Class139.anInt3646++] = local584.anIntArray233.length;
				return;
			}
			if (arg0 == 5052) {
				Class139.anInt3646 -= 2;
				local157 = Class139.anIntArray213[Class139.anInt3646];
				local192 = Class139.anIntArray213[Class139.anInt3646 + 1];
				@Pc(628) Class2_Sub2_Sub12 local628 = Static129.method2583(local157);
				local95 = local628.anIntArray233[local192];
				Class139.anIntArray213[Class139.anInt3646++] = local95;
				return;
			}
			if (arg0 == 5053) {
				local157 = Class139.anIntArray213[--Class139.anInt3646];
				local584 = Static129.method2583(local157);
				if (local584.anIntArray232 == null) {
					Class139.anIntArray213[Class139.anInt3646++] = 0;
					return;
				}
				Class139.anIntArray213[Class139.anInt3646++] = local584.anIntArray232.length;
				return;
			}
			if (arg0 == 5054) {
				Class139.anInt3646 -= 2;
				local157 = Class139.anIntArray213[Class139.anInt3646];
				local192 = Class139.anIntArray213[Class139.anInt3646 + 1];
				Class139.anIntArray213[Class139.anInt3646++] = Static129.method2583(local157).anIntArray232[local192];
				return;
			}
			if (arg0 == 5055) {
				local157 = Class139.anIntArray213[--Class139.anInt3646];
				Class139.aStringArray29[Class139.anInt3648++] = Static137.method2701(local157).method5602();
				return;
			}
			if (arg0 == 5056) {
				local157 = Class139.anIntArray213[--Class139.anInt3646];
				@Pc(750) Class2_Sub2_Sub16 local750 = Static137.method2701(local157);
				if (local750.anIntArray418 == null) {
					Class139.anIntArray213[Class139.anInt3646++] = 0;
					return;
				}
				Class139.anIntArray213[Class139.anInt3646++] = local750.anIntArray418.length;
				return;
			}
			if (arg0 == 5057) {
				Class139.anInt3646 -= 2;
				local157 = Class139.anIntArray213[Class139.anInt3646];
				local192 = Class139.anIntArray213[Class139.anInt3646 + 1];
				Class139.anIntArray213[Class139.anInt3646++] = Static137.method2701(local157).anIntArray418[local192];
				return;
			}
			if (arg0 == 5058) {
				aClass86_1 = new Class86();
				aClass86_1.anInt2374 = Class139.anIntArray213[--Class139.anInt3646];
				aClass86_1.aClass2_Sub2_Sub16_1 = Static137.method2701(aClass86_1.anInt2374);
				aClass86_1.anIntArray151 = new int[aClass86_1.aClass2_Sub2_Sub16_1.method5604()];
				return;
			}
			if (arg0 == 5059) {
				Static85.method1962(Class2_Sub3_Sub37.aClass145_248);
				Class14.aClass2_Sub4_Sub2_4.method4843(0);
				local157 = Class14.aClass2_Sub4_Sub2_4.anInt5289;
				Class14.aClass2_Sub4_Sub2_4.method4843(0);
				Class14.aClass2_Sub4_Sub2_4.method4844(aClass86_1.anInt2374);
				aClass86_1.aClass2_Sub2_Sub16_1.method5598(Class14.aClass2_Sub4_Sub2_4, aClass86_1.anIntArray151);
				Class14.aClass2_Sub4_Sub2_4.method4862(Class14.aClass2_Sub4_Sub2_4.anInt5289 - local157);
				return;
			}
			if (arg0 == 5060) {
				local75 = Class139.aStringArray29[--Class139.anInt3648];
				Static85.method1962(Class218.aClass145_220);
				Class14.aClass2_Sub4_Sub2_4.method4843(0);
				local192 = Class14.aClass2_Sub4_Sub2_4.anInt5289;
				Class14.aClass2_Sub4_Sub2_4.method4823(local75);
				Class14.aClass2_Sub4_Sub2_4.method4844(aClass86_1.anInt2374);
				aClass86_1.aClass2_Sub2_Sub16_1.method5598(Class14.aClass2_Sub4_Sub2_4, aClass86_1.anIntArray151);
				Class14.aClass2_Sub4_Sub2_4.method4862(Class14.aClass2_Sub4_Sub2_4.anInt5289 - local192);
				return;
			}
			if (arg0 == 5061) {
				Static85.method1962(Class2_Sub3_Sub37.aClass145_248);
				Class14.aClass2_Sub4_Sub2_4.method4843(0);
				local157 = Class14.aClass2_Sub4_Sub2_4.anInt5289;
				Class14.aClass2_Sub4_Sub2_4.method4843(1);
				Class14.aClass2_Sub4_Sub2_4.method4844(aClass86_1.anInt2374);
				aClass86_1.aClass2_Sub2_Sub16_1.method5598(Class14.aClass2_Sub4_Sub2_4, aClass86_1.anIntArray151);
				Class14.aClass2_Sub4_Sub2_4.method4862(Class14.aClass2_Sub4_Sub2_4.anInt5289 - local157);
				return;
			}
			if (arg0 == 5062) {
				Class139.anInt3646 -= 2;
				local157 = Class139.anIntArray213[Class139.anInt3646];
				local192 = Class139.anIntArray213[Class139.anInt3646 + 1];
				Class139.anIntArray213[Class139.anInt3646++] = Static129.method2583(local157).aCharArray4[local192];
				return;
			}
			if (arg0 == 5063) {
				Class139.anInt3646 -= 2;
				local157 = Class139.anIntArray213[Class139.anInt3646];
				local192 = Class139.anIntArray213[Class139.anInt3646 + 1];
				Class139.anIntArray213[Class139.anInt3646++] = Static129.method2583(local157).aCharArray5[local192];
				return;
			}
			if (arg0 == 5064) {
				Class139.anInt3646 -= 2;
				local157 = Class139.anIntArray213[Class139.anInt3646];
				local192 = Class139.anIntArray213[Class139.anInt3646 + 1];
				if (local192 == -1) {
					Class139.anIntArray213[Class139.anInt3646++] = -1;
					return;
				}
				Class139.anIntArray213[Class139.anInt3646++] = Static129.method2583(local157).method3795((char) local192);
				return;
			}
			if (arg0 == 5065) {
				Class139.anInt3646 -= 2;
				local157 = Class139.anIntArray213[Class139.anInt3646];
				local192 = Class139.anIntArray213[Class139.anInt3646 + 1];
				if (local192 == -1) {
					Class139.anIntArray213[Class139.anInt3646++] = -1;
					return;
				}
				Class139.anIntArray213[Class139.anInt3646++] = Static129.method2583(local157).method3799((char) local192);
				return;
			}
			if (arg0 == 5066) {
				local157 = Class139.anIntArray213[--Class139.anInt3646];
				Class139.anIntArray213[Class139.anInt3646++] = Static137.method2701(local157).method5604();
				return;
			}
			if (arg0 == 5067) {
				Class139.anInt3646 -= 2;
				local157 = Class139.anIntArray213[Class139.anInt3646];
				local192 = Class139.anIntArray213[Class139.anInt3646 + 1];
				local89 = Static137.method2701(local157).method5597(local192);
				Class139.anIntArray213[Class139.anInt3646++] = local89;
				return;
			}
			if (arg0 == 5068) {
				Class139.anInt3646 -= 2;
				local157 = Class139.anIntArray213[Class139.anInt3646];
				local192 = Class139.anIntArray213[Class139.anInt3646 + 1];
				aClass86_1.anIntArray151[local157] = local192;
				return;
			}
			if (arg0 == 5069) {
				Class139.anInt3646 -= 2;
				local157 = Class139.anIntArray213[Class139.anInt3646];
				local192 = Class139.anIntArray213[Class139.anInt3646 + 1];
				aClass86_1.anIntArray151[local157] = local192;
				return;
			}
			if (arg0 == 5070) {
				Class139.anInt3646 -= 3;
				local157 = Class139.anIntArray213[Class139.anInt3646];
				local192 = Class139.anIntArray213[Class139.anInt3646 + 1];
				local89 = Class139.anIntArray213[Class139.anInt3646 + 2];
				@Pc(1245) Class2_Sub2_Sub16 local1245 = Static137.method2701(local157);
				if (local1245.method5597(local192) != 0) {
					throw new RuntimeException("bad command");
				}
				Class139.anIntArray213[Class139.anInt3646++] = local1245.method5601(local192, local89);
				return;
			}
			if (arg0 == 5071) {
				local75 = Class139.aStringArray29[--Class139.anInt3648];
				local1292 = Class139.anIntArray213[--Class139.anInt3646] == 1;
				Static250.method4594(local1292, local75);
				Class139.anIntArray213[Class139.anInt3646++] = Static305.anInt6115;
				return;
			}
			if (arg0 == 5072) {
				if (Static165.aShortArray55 != null && Static12.anInt266 < Static305.anInt6115) {
					Class139.anIntArray213[Class139.anInt3646++] = Static165.aShortArray55[Static12.anInt266++] & 0xFFFF;
					return;
				}
				Class139.anIntArray213[Class139.anInt3646++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static12.anInt266 = 0;
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static163.aClass123_2.method3344(86)) {
					Class139.anIntArray213[Class139.anInt3646++] = 1;
					return;
				}
				Class139.anIntArray213[Class139.anInt3646++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static163.aClass123_2.method3344(82)) {
					Class139.anIntArray213[Class139.anInt3646++] = 1;
					return;
				}
				Class139.anIntArray213[Class139.anInt3646++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static163.aClass123_2.method3344(81)) {
					Class139.anIntArray213[Class139.anInt3646++] = 1;
					return;
				}
				Class139.anIntArray213[Class139.anInt3646++] = 0;
				return;
			}
		} else {
			@Pc(1903) boolean local1903;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static197.method3723(Class139.anIntArray213[--Class139.anInt3646]);
					return;
				}
				if (arg0 == 5201) {
					Class139.anIntArray213[Class139.anInt3646++] = Static310.method6332();
					return;
				}
				if (arg0 == 5205) {
					Static238.method4403(false, -1, Class139.anIntArray213[--Class139.anInt3646], -1);
					return;
				}
				@Pc(1492) Class2_Sub2_Sub17 local1492;
				if (arg0 == 5206) {
					local157 = Class139.anIntArray213[--Class139.anInt3646];
					local1492 = Static321.method5528(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					if (local1492 == null) {
						Class139.anIntArray213[Class139.anInt3646++] = -1;
						return;
					}
					Class139.anIntArray213[Class139.anInt3646++] = local1492.anInt6856;
					return;
				}
				@Pc(1525) Class2_Sub2_Sub17 local1525;
				if (arg0 == 5207) {
					local1525 = Static321.method5515(Class139.anIntArray213[--Class139.anInt3646]);
					if (local1525 != null && local1525.aString66 != null) {
						Class139.aStringArray29[Class139.anInt3648++] = local1525.aString66;
						return;
					}
					Class139.aStringArray29[Class139.anInt3648++] = "";
					return;
				}
				if (arg0 == 5208) {
					Class139.anIntArray213[Class139.anInt3646++] = Static41.anInt1104;
					Class139.anIntArray213[Class139.anInt3646++] = Static343.anInt6917;
					return;
				}
				if (arg0 == 5209) {
					Class139.anIntArray213[Class139.anInt3646++] = Static142.anInt2769 + Static321.anInt6045;
					Class139.anIntArray213[Class139.anInt3646++] = Static89.anInt2001 + Static321.anInt6043;
					return;
				}
				if (arg0 == 5210) {
					local157 = Class139.anIntArray213[--Class139.anInt3646];
					local1492 = Static321.method5515(local157);
					if (local1492 == null) {
						Class139.anIntArray213[Class139.anInt3646++] = 0;
						Class139.anIntArray213[Class139.anInt3646++] = 0;
						return;
					}
					Class139.anIntArray213[Class139.anInt3646++] = local1492.anInt6859 >> 14 & 0x3FFF;
					Class139.anIntArray213[Class139.anInt3646++] = local1492.anInt6859 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local157 = Class139.anIntArray213[--Class139.anInt3646];
					local1492 = Static321.method5515(local157);
					if (local1492 == null) {
						Class139.anIntArray213[Class139.anInt3646++] = 0;
						Class139.anIntArray213[Class139.anInt3646++] = 0;
						return;
					}
					Class139.anIntArray213[Class139.anInt3646++] = local1492.anInt6855 - local1492.anInt6857;
					Class139.anIntArray213[Class139.anInt3646++] = local1492.anInt6861 - local1492.anInt6850;
					return;
				}
				@Pc(1715) Class2_Sub20 local1715;
				if (arg0 == 5212) {
					local1715 = Static195.method3714();
					if (local1715 == null) {
						Class139.anIntArray213[Class139.anInt3646++] = -1;
						Class139.anIntArray213[Class139.anInt3646++] = -1;
						return;
					}
					Class139.anIntArray213[Class139.anInt3646++] = local1715.anInt2944;
					local192 = local1715.anInt2943 << 28 | local1715.anInt2946 + Static321.anInt6045 << 14 | local1715.anInt2949 + Static321.anInt6043;
					Class139.anIntArray213[Class139.anInt3646++] = local192;
					return;
				}
				if (arg0 == 5213) {
					local1715 = Static108.method3830();
					if (local1715 == null) {
						Class139.anIntArray213[Class139.anInt3646++] = -1;
						Class139.anIntArray213[Class139.anInt3646++] = -1;
						return;
					}
					Class139.anIntArray213[Class139.anInt3646++] = local1715.anInt2944;
					local192 = local1715.anInt2943 << 28 | local1715.anInt2946 + Static321.anInt6045 << 14 | local1715.anInt2949 + Static321.anInt6043;
					Class139.anIntArray213[Class139.anInt3646++] = local192;
					return;
				}
				@Pc(1863) boolean local1863;
				if (arg0 == 5214) {
					local157 = Class139.anIntArray213[--Class139.anInt3646];
					local1492 = Static352.method6313();
					if (local1492 != null) {
						local1863 = local1492.method6146(local157 >> 28 & 0x3, Class139.anIntArray215, local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
						if (local1863) {
							Static15.method394(Class139.anIntArray215[2], Class139.anIntArray215[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					Class139.anInt3646 -= 2;
					local157 = Class139.anIntArray213[Class139.anInt3646];
					local192 = Class139.anIntArray213[Class139.anInt3646 + 1];
					@Pc(1901) Class246 local1901 = Static321.method5517(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					local1903 = false;
					for (@Pc(1908) Class2_Sub2_Sub17 local1908 = (Class2_Sub2_Sub17) local1901.method6338(); local1908 != null; local1908 = (Class2_Sub2_Sub17) local1901.method6337()) {
						if (local1908.anInt6856 == local192) {
							local1903 = true;
							break;
						}
					}
					if (local1903) {
						Class139.anIntArray213[Class139.anInt3646++] = 1;
						return;
					}
					Class139.anIntArray213[Class139.anInt3646++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local157 = Class139.anIntArray213[--Class139.anInt3646];
					local1492 = Static321.method5515(local157);
					if (local1492 == null) {
						Class139.anIntArray213[Class139.anInt3646++] = -1;
						return;
					}
					Class139.anIntArray213[Class139.anInt3646++] = local1492.anInt6862;
					return;
				}
				if (arg0 == 5220) {
					Class139.anIntArray213[Class139.anInt3646++] = Class235.anInt6569 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local157 = Class139.anIntArray213[--Class139.anInt3646];
					Static15.method394(local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1525 = Static352.method6313();
					if (local1525 != null) {
						local1292 = local1525.method6150(Class139.anIntArray215, Static89.anInt2001 + Static321.anInt6043, Static142.anInt2769 + Static321.anInt6045);
						if (local1292) {
							Class139.anIntArray213[Class139.anInt3646++] = Class139.anIntArray215[1];
							Class139.anIntArray213[Class139.anInt3646++] = Class139.anIntArray215[2];
							return;
						}
						Class139.anIntArray213[Class139.anInt3646++] = -1;
						Class139.anIntArray213[Class139.anInt3646++] = -1;
						return;
					}
					Class139.anIntArray213[Class139.anInt3646++] = -1;
					Class139.anIntArray213[Class139.anInt3646++] = -1;
					return;
				}
				if (arg0 == 5223) {
					Class139.anInt3646 -= 2;
					local157 = Class139.anIntArray213[Class139.anInt3646];
					local192 = Class139.anIntArray213[Class139.anInt3646 + 1];
					Static238.method4403(false, local192 >> 14 & 0x3FFF, local157, local192 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local157 = Class139.anIntArray213[--Class139.anInt3646];
					local1492 = Static352.method6313();
					if (local1492 != null) {
						local1863 = local1492.method6146(local157 >> 28 & 0x3, Class139.anIntArray215, local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
						if (local1863) {
							Class139.anIntArray213[Class139.anInt3646++] = Class139.anIntArray215[1];
							Class139.anIntArray213[Class139.anInt3646++] = Class139.anIntArray215[2];
							return;
						}
						Class139.anIntArray213[Class139.anInt3646++] = -1;
						Class139.anIntArray213[Class139.anInt3646++] = -1;
						return;
					}
					Class139.anIntArray213[Class139.anInt3646++] = -1;
					Class139.anIntArray213[Class139.anInt3646++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local157 = Class139.anIntArray213[--Class139.anInt3646];
					local1492 = Static352.method6313();
					if (local1492 != null) {
						local1863 = local1492.method6150(Class139.anIntArray215, local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
						if (local1863) {
							Class139.anIntArray213[Class139.anInt3646++] = Class139.anIntArray215[1];
							Class139.anIntArray213[Class139.anInt3646++] = Class139.anIntArray215[2];
							return;
						}
						Class139.anIntArray213[Class139.anInt3646++] = -1;
						Class139.anIntArray213[Class139.anInt3646++] = -1;
						return;
					}
					Class139.anIntArray213[Class139.anInt3646++] = -1;
					Class139.anIntArray213[Class139.anInt3646++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static209.method3956(Class139.anIntArray213[--Class139.anInt3646]);
					return;
				}
				if (arg0 == 5227) {
					Class139.anInt3646 -= 2;
					local157 = Class139.anIntArray213[Class139.anInt3646];
					local192 = Class139.anIntArray213[Class139.anInt3646 + 1];
					Static238.method4403(true, local192 >> 14 & 0x3FFF, local157, local192 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Class121.aBoolean225 = Class139.anIntArray213[--Class139.anInt3646] == 1;
					return;
				}
				if (arg0 == 5229) {
					Class139.anIntArray213[Class139.anInt3646++] = Class121.aBoolean225 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local157 = Class139.anIntArray213[--Class139.anInt3646];
					Static215.method4028(local157);
					return;
				}
				@Pc(2421) Class2 local2421;
				if (arg0 == 5231) {
					Class139.anInt3646 -= 2;
					local157 = Class139.anIntArray213[Class139.anInt3646];
					local1292 = Class139.anIntArray213[Class139.anInt3646 + 1] == 1;
					if (Class2_Sub3_Sub15.aClass4_58 != null) {
						local2421 = Class2_Sub3_Sub15.aClass4_58.method90((long) local157);
						if (local2421 != null && !local1292) {
							local2421.method6469();
							return;
						}
						if (local2421 == null && local1292) {
							local2421 = new Class2();
							Class2_Sub3_Sub15.aClass4_58.method87(local2421, (long) local157);
						}
					}
					return;
				}
				@Pc(2463) Class2 local2463;
				if (arg0 == 5232) {
					local157 = Class139.anIntArray213[--Class139.anInt3646];
					if (Class2_Sub3_Sub15.aClass4_58 != null) {
						local2463 = Class2_Sub3_Sub15.aClass4_58.method90((long) local157);
						Class139.anIntArray213[Class139.anInt3646++] = local2463 == null ? 0 : 1;
						return;
					}
					Class139.anIntArray213[Class139.anInt3646++] = 0;
					return;
				}
				if (arg0 == 5233) {
					Class139.anInt3646 -= 2;
					local157 = Class139.anIntArray213[Class139.anInt3646];
					local1292 = Class139.anIntArray213[Class139.anInt3646 + 1] == 1;
					if (Class154.aClass4_83 != null) {
						local2421 = Class154.aClass4_83.method90((long) local157);
						if (local2421 != null && !local1292) {
							local2421.method6469();
							return;
						}
						if (local2421 == null && local1292) {
							local2421 = new Class2();
							Class154.aClass4_83.method87(local2421, (long) local157);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local157 = Class139.anIntArray213[--Class139.anInt3646];
					if (Class154.aClass4_83 != null) {
						local2463 = Class154.aClass4_83.method90((long) local157);
						Class139.anIntArray213[Class139.anInt3646++] = local2463 == null ? 0 : 1;
						return;
					}
					Class139.anIntArray213[Class139.anInt3646++] = 0;
					return;
				}
				if (arg0 == 5235) {
					Class139.anIntArray213[Class139.anInt3646++] = Static321.aClass2_Sub2_Sub17_3 == null ? -1 : Static321.aClass2_Sub2_Sub17_3.anInt6856;
					return;
				}
			} else {
				@Pc(2717) int local2717;
				if (arg0 < 5400) {
					if (arg0 == 5300) {
						Class139.anInt3646 -= 2;
						local157 = Class139.anIntArray213[Class139.anInt3646];
						local192 = Class139.anIntArray213[Class139.anInt3646 + 1];
						Static134.method2679(local192, 3, false, local157);
						Class139.anIntArray213[Class139.anInt3646++] = Static338.aFrame2 == null ? 0 : 1;
						return;
					}
					if (arg0 == 5301) {
						if (Static338.aFrame2 != null) {
							Static134.method2679(-1, Static203.aClass177_Sub1_2.anInt4884, false, -1);
						}
						return;
					}
					if (arg0 == 5302) {
						@Pc(2654) Class169[] local2654 = Static59.method1705();
						Class139.anIntArray213[Class139.anInt3646++] = local2654.length;
						return;
					}
					if (arg0 == 5303) {
						local157 = Class139.anIntArray213[--Class139.anInt3646];
						@Pc(2678) Class169[] local2678 = Static59.method1705();
						Class139.anIntArray213[Class139.anInt3646++] = local2678[local157].anInt4676;
						Class139.anIntArray213[Class139.anInt3646++] = local2678[local157].anInt4675;
						return;
					}
					if (arg0 == 5305) {
						local157 = Static203.aClass177_Sub1_2.anInt4874;
						local192 = Static203.aClass177_Sub1_2.anInt4883;
						local89 = -1;
						@Pc(2715) Class169[] local2715 = Static59.method1705();
						for (local2717 = 0; local2717 < local2715.length; local2717++) {
							@Pc(2722) Class169 local2722 = local2715[local2717];
							if (local2722.anInt4676 == local157 && local2722.anInt4675 == local192) {
								local89 = local2717;
								break;
							}
						}
						Class139.anIntArray213[Class139.anInt3646++] = local89;
						return;
					}
					if (arg0 == 5306) {
						Class139.anIntArray213[Class139.anInt3646++] = Static135.method2694();
						return;
					}
					if (arg0 == 5307) {
						local157 = Class139.anIntArray213[--Class139.anInt3646];
						if (local157 >= 1 && local157 <= 2) {
							Static134.method2679(-1, local157, false, -1);
							return;
						}
						return;
					}
					if (arg0 == 5308) {
						Class139.anIntArray213[Class139.anInt3646++] = Static203.aClass177_Sub1_2.anInt4884;
						return;
					}
					if (arg0 == 5309) {
						local157 = Class139.anIntArray213[--Class139.anInt3646];
						if (local157 >= 1 && local157 <= 2) {
							Static203.aClass177_Sub1_2.anInt4884 = local157;
							Static203.aClass177_Sub1_2.method4498(Static305.aClass152_5);
							return;
						}
						return;
					}
				} else {
					@Pc(3230) String local3230;
					if (arg0 < 5500) {
						if (arg0 == 5400) {
							Class139.anInt3648 -= 2;
							local75 = Class139.aStringArray29[Class139.anInt3648];
							local81 = Class139.aStringArray29[Class139.anInt3648 + 1];
							local89 = Class139.anIntArray213[--Class139.anInt3646];
							Static85.method1962(Class216_Sub1.aClass145_219);
							Class14.aClass2_Sub4_Sub2_4.method4843(Static26.method872(local75) + Static26.method872(local81) + 1);
							Class14.aClass2_Sub4_Sub2_4.method4823(local75);
							Class14.aClass2_Sub4_Sub2_4.method4823(local81);
							Class14.aClass2_Sub4_Sub2_4.method4843(local89);
							return;
						}
						if (arg0 == 5401) {
							Class139.anInt3646 -= 2;
							Static237.aShortArray78[Class139.anIntArray213[Class139.anInt3646]] = (short) Static351.method6286(Class139.anIntArray213[Class139.anInt3646 + 1]);
							Static290.aClass107_2.method2769();
							Static290.aClass107_2.method2762();
							Static6.aClass219_1.method5573();
							Static91.method2109();
							return;
						}
						if (arg0 == 5405) {
							Class139.anInt3646 -= 2;
							local157 = Class139.anIntArray213[Class139.anInt3646];
							local192 = Class139.anIntArray213[Class139.anInt3646 + 1];
							if (local157 >= 0 && local157 < 2) {
								Class2_Sub39.anIntArrayArrayArray13[local157] = new int[local192 << 1][4];
							}
							return;
						}
						if (arg0 == 5406) {
							Class139.anInt3646 -= 7;
							local157 = Class139.anIntArray213[Class139.anInt3646];
							local192 = Class139.anIntArray213[Class139.anInt3646 + 1] << 1;
							local89 = Class139.anIntArray213[Class139.anInt3646 + 2];
							local95 = Class139.anIntArray213[Class139.anInt3646 + 3];
							local2717 = Class139.anIntArray213[Class139.anInt3646 + 4];
							@Pc(2990) int local2990 = Class139.anIntArray213[Class139.anInt3646 + 5];
							@Pc(2996) int local2996 = Class139.anIntArray213[Class139.anInt3646 + 6];
							if (local157 >= 0 && local157 < 2 && Class2_Sub39.anIntArrayArrayArray13[local157] != null && local192 >= 0 && local192 < Class2_Sub39.anIntArrayArrayArray13[local157].length) {
								Class2_Sub39.anIntArrayArrayArray13[local157][local192] = new int[] { (local89 >> 14 & 0x3FFF) * 128, local95, (local89 & 0x3FFF) * 128, local2996 };
								Class2_Sub39.anIntArrayArrayArray13[local157][local192 + 1] = new int[] { (local2717 >> 14 & 0x3FFF) * 128, local2990, (local2717 & 0x3FFF) * 128 };
							}
							return;
						}
						if (arg0 == 5407) {
							local157 = Class2_Sub39.anIntArrayArrayArray13[Class139.anIntArray213[--Class139.anInt3646]].length >> 1;
							Class139.anIntArray213[Class139.anInt3646++] = local157;
							return;
						}
						if (arg0 == 5411) {
							if (Static338.aFrame2 != null) {
								Static134.method2679(-1, Static203.aClass177_Sub1_2.anInt4884, false, -1);
							}
							if (Static207.aFrame1 != null) {
								Static317.method5766();
								System.exit(0);
								return;
							}
							local75 = Static284.aString57 == null ? Static187.method3651() : Static284.aString57;
							Static257.method4766(local75, Static305.aClass152_5, Class2_Sub10.anInt1760 == 1, false);
							return;
						}
						if (arg0 == 5419) {
							local75 = "";
							if (Static329.aClass32_5 != null) {
								if (Static329.aClass32_5.anObject2 == null) {
									local75 = Static141.method2741(Static329.aClass32_5.anInt991);
								} else {
									local75 = (String) Static329.aClass32_5.anObject2;
								}
							}
							Class139.aStringArray29[Class139.anInt3648++] = local75;
							return;
						}
						if (arg0 == 5420) {
							Class139.anIntArray213[Class139.anInt3646++] = Class152.anInt3791 == 3 ? 1 : 0;
							return;
						}
						if (arg0 == 5421) {
							if (Static338.aFrame2 != null) {
								Static134.method2679(-1, Static203.aClass177_Sub1_2.anInt4884, false, -1);
							}
							local75 = Class139.aStringArray29[--Class139.anInt3648];
							local1292 = Class139.anIntArray213[--Class139.anInt3646] == 1;
							local3230 = Static187.method3651() + local75;
							Static257.method4766(local3230, Static305.aClass152_5, Class2_Sub10.anInt1760 == 1, local1292);
							return;
						}
						if (arg0 == 5422) {
							Class139.anInt3648 -= 2;
							local75 = Class139.aStringArray29[Class139.anInt3648];
							local81 = Class139.aStringArray29[Class139.anInt3648 + 1];
							local89 = Class139.anIntArray213[--Class139.anInt3646];
							if (local75.length() > 0) {
								if (Static121.aStringArray19 == null) {
									Static121.aStringArray19 = new String[Class155.anIntArray384[Class226.aClass50_4.anInt1551]];
								}
								Static121.aStringArray19[local89] = local75;
							}
							if (local81.length() > 0) {
								if (Static310.aStringArray67 == null) {
									Static310.aStringArray67 = new String[Class155.anIntArray384[Class226.aClass50_4.anInt1551]];
								}
								Static310.aStringArray67[local89] = local81;
							}
							return;
						}
						if (arg0 == 5423) {
							System.out.println(Class139.aStringArray29[--Class139.anInt3648]);
							return;
						}
						if (arg0 == 5424) {
							Class139.anInt3646 -= 11;
							Static225.anInt4439 = Class139.anIntArray213[Class139.anInt3646];
							Static240.anInt6704 = Class139.anIntArray213[Class139.anInt3646 + 1];
							Static187.anInt3693 = Class139.anIntArray213[Class139.anInt3646 + 2];
							Static82.anInt1866 = Class139.anIntArray213[Class139.anInt3646 + 3];
							Static174.anInt3727 = Class139.anIntArray213[Class139.anInt3646 + 4];
							Static63.anInt1634 = Class139.anIntArray213[Class139.anInt3646 + 5];
							Static70.anInt1720 = Class139.anIntArray213[Class139.anInt3646 + 6];
							Static338.anInt6791 = Class139.anIntArray213[Class139.anInt3646 + 7];
							Static364.anInt7198 = Class139.anIntArray213[Class139.anInt3646 + 8];
							Static299.anInt6018 = Class139.anIntArray213[Class139.anInt3646 + 9];
							Static355.anInt7105 = Class139.anIntArray213[Class139.anInt3646 + 10];
							Static29.aClass197_5.method5088(Static174.anInt3727);
							Static29.aClass197_5.method5088(Static63.anInt1634);
							Static29.aClass197_5.method5088(Static70.anInt1720);
							Static29.aClass197_5.method5088(Static338.anInt6791);
							Static29.aClass197_5.method5088(Static364.anInt7198);
							Static314.aClass13_17 = null;
							Static103.aClass13_6 = null;
							Static34.aClass13_3 = null;
							Static71.aClass13_5 = null;
							Static129.aClass13_8 = null;
							Static184.aClass13_12 = null;
							Static316.aClass13_18 = null;
							Static197.aClass13_13 = null;
							Class179.aBoolean371 = true;
							return;
						}
						if (arg0 == 5425) {
							Static177.method3503();
							Class179.aBoolean371 = false;
							return;
						}
						if (arg0 == 5426) {
							Class139.anInt3646 -= 2;
							Class2_Sub3_Sub39.anInt7250 = Class139.anIntArray213[Class139.anInt3646];
							Class67.anInt1908 = Class139.anIntArray213[Class139.anInt3646 + 1];
							return;
						}
						if (arg0 == 5427) {
							Class139.anInt3646 -= 2;
							Class2_Sub3_Sub13.anInt2520 = Class139.anIntArray213[Class139.anInt3646 + 1];
							return;
						}
						if (arg0 == 5428) {
							Class139.anInt3646 -= 2;
							local157 = Class139.anIntArray213[Class139.anInt3646];
							local192 = Class139.anIntArray213[Class139.anInt3646 + 1];
							Class139.anIntArray213[Class139.anInt3646++] = Static258.method4786(local192, local157) ? 1 : 0;
							return;
						}
						if (arg0 == 5429) {
							Static151.method2973(Class139.aStringArray29[--Class139.anInt3648], false);
							return;
						}
					} else if (arg0 < 5600) {
						if (arg0 == 5500) {
							Class139.anInt3646 -= 4;
							local157 = Class139.anIntArray213[Class139.anInt3646];
							local192 = Class139.anIntArray213[Class139.anInt3646 + 1];
							local89 = Class139.anIntArray213[Class139.anInt3646 + 2];
							local95 = Class139.anIntArray213[Class139.anInt3646 + 3];
							Static48.method1547((local157 & 0x3FFF) - Static139.anInt2716, local89, local95, false, local192, (local157 >> 14 & 0x3FFF) - Static154.anInt3136);
							return;
						}
						if (arg0 == 5501) {
							Class139.anInt3646 -= 4;
							local157 = Class139.anIntArray213[Class139.anInt3646];
							local192 = Class139.anIntArray213[Class139.anInt3646 + 1];
							local89 = Class139.anIntArray213[Class139.anInt3646 + 2];
							local95 = Class139.anIntArray213[Class139.anInt3646 + 3];
							Static32.method4204(local89, local192, (local157 & 0x3FFF) - Static139.anInt2716, local95, (local157 >> 14 & 0x3FFF) - Static154.anInt3136);
							return;
						}
						if (arg0 == 5502) {
							Class139.anInt3646 -= 6;
							local157 = Class139.anIntArray213[Class139.anInt3646];
							if (local157 >= 2) {
								throw new RuntimeException();
							}
							Class104.anInt2714 = local157;
							local192 = Class139.anIntArray213[Class139.anInt3646 + 1];
							if (local192 + 1 >= Class2_Sub39.anIntArrayArrayArray13[Class104.anInt2714].length >> 1) {
								throw new RuntimeException();
							}
							Class197.anInt5555 = local192;
							Class233.anInt6521 = 0;
							Class2_Sub3_Sub6.anInt1037 = Class139.anIntArray213[Class139.anInt3646 + 2];
							Class2_Sub2_Sub12.anInt3817 = Class139.anIntArray213[Class139.anInt3646 + 3];
							local89 = Class139.anIntArray213[Class139.anInt3646 + 4];
							if (local89 >= 2) {
								throw new RuntimeException();
							}
							Class230.anInt6443 = local89;
							local95 = Class139.anIntArray213[Class139.anInt3646 + 5];
							if (local95 + 1 >= Class2_Sub39.anIntArrayArrayArray13[Class230.anInt6443].length >> 1) {
								throw new RuntimeException();
							}
							Class226.anInt6386 = local95;
							Static291.anInt5899 = 3;
							return;
						}
						if (arg0 == 5503) {
							Static110.method2371();
							return;
						}
						if (arg0 == 5504) {
							Class139.anInt3646 -= 2;
							Static214.method4023(Class139.anIntArray213[Class139.anInt3646], Class139.anIntArray213[Class139.anInt3646 + 1]);
							return;
						}
						if (arg0 == 5505) {
							Class139.anIntArray213[Class139.anInt3646++] = (int) Class28.aFloat27 >> 3;
							return;
						}
						if (arg0 == 5506) {
							Class139.anIntArray213[Class139.anInt3646++] = (int) Class187.aFloat66 >> 3;
							return;
						}
						if (arg0 == 5507) {
							Static325.method5838();
							return;
						}
						if (arg0 == 5508) {
							Static114.method2398();
							return;
						}
						if (arg0 == 5509) {
							Static327.method5881();
							return;
						}
						if (arg0 == 5510) {
							Static25.method862();
							return;
						}
						if (arg0 == 5511) {
							local157 = Class139.anIntArray213[--Class139.anInt3646];
							local192 = local157 >> 14 & 0x3FFF;
							local89 = local157 & 0x3FFF;
							local192 -= Static154.anInt3136;
							if (local192 < 0) {
								local192 = 0;
							} else if (local192 >= Class241.anInt7020) {
								local192 = Class241.anInt7020;
							}
							local89 -= Static139.anInt2716;
							if (local89 < 0) {
								local89 = 0;
							} else if (local89 >= OutputStream_Sub1.anInt4442) {
								local89 = OutputStream_Sub1.anInt4442;
							}
							Class2_Sub3_Sub39.anInt7251 = local192 * 128 + 64;
							Class229.anInt6436 = local89 * 128 + 64;
							Static291.anInt5899 = 4;
							return;
						}
						if (arg0 == 5512) {
							Static326.method5860();
							return;
						}
					} else if (arg0 < 5700) {
						if (arg0 == 5600) {
							Class139.anInt3648 -= 2;
							local75 = Class139.aStringArray29[Class139.anInt3648];
							local81 = Class139.aStringArray29[Class139.anInt3648 + 1];
							local89 = Class139.anIntArray213[--Class139.anInt3646];
							if (Class2_Sub3_Sub35.anInt6430 != 10) {
								return;
							}
							if (Class109.anInt2800 == 0 && Class2_Sub3_Sub35.anInt6429 == 0 && Class2_Sub3_Sub15.anInt2649 == 0 && Class2_Sub10.anInt1749 == 0) {
								Static90.method2089(local81, local75, local89);
								return;
							}
							return;
						}
						if (arg0 == 5601) {
							Static296.method5436();
							return;
						}
						if (arg0 == 5602) {
							if (Class2_Sub3_Sub35.anInt6429 == 0) {
								Class2_Sub3_Sub6.anInt1045 = -2;
							}
							return;
						}
						if (arg0 == 5603) {
							Class139.anInt3646 -= 4;
							if (Class2_Sub3_Sub35.anInt6430 != 10) {
								return;
							}
							if (Class109.anInt2800 == 0 && Class2_Sub3_Sub35.anInt6429 == 0 && Class2_Sub3_Sub15.anInt2649 == 0 && Class2_Sub10.anInt1749 == 0) {
								Static327.method5877(Class139.anIntArray213[Class139.anInt3646 + 3], Class139.anIntArray213[Class139.anInt3646 + 2], Class139.anIntArray213[Class139.anInt3646], Class139.anIntArray213[Class139.anInt3646 + 1]);
								return;
							}
							return;
						}
						if (arg0 == 5604) {
							Class139.anInt3648--;
							if (Class2_Sub3_Sub35.anInt6430 != 10) {
								return;
							}
							if (Class109.anInt2800 == 0 && Class2_Sub3_Sub35.anInt6429 == 0 && Class2_Sub3_Sub15.anInt2649 == 0 && Class2_Sub10.anInt1749 == 0) {
								Static68.method1811(Static76.method5986(Class139.aStringArray29[Class139.anInt3648]));
								return;
							}
							return;
						}
						if (arg0 == 5605) {
							Class139.anInt3648 -= 3;
							Class139.anInt3646 -= 7;
							if (Class2_Sub3_Sub35.anInt6430 != 10) {
								return;
							}
							if (Class109.anInt2800 == 0 && Class2_Sub3_Sub35.anInt6429 == 0 && Class2_Sub3_Sub15.anInt2649 == 0 && Class2_Sub10.anInt1749 == 0) {
								Static363.method4489(Class139.aStringArray29[Class139.anInt3648 + 1], Class139.anIntArray213[Class139.anInt3646], Class139.anIntArray213[Class139.anInt3646 + 3], Class139.anIntArray213[Class139.anInt3646 + 4] == 1, Static76.method5986(Class139.aStringArray29[Class139.anInt3648]), Class139.anIntArray213[Class139.anInt3646 + 2], Class139.anIntArray213[Class139.anInt3646 + 1], Class139.anIntArray213[Class139.anInt3646 + 6] == 1, Class139.anIntArray213[Class139.anInt3646 + 5] == 1, Class139.aStringArray29[Class139.anInt3648 + 2]);
								return;
							}
							return;
						}
						if (arg0 == 5606) {
							if (Class2_Sub3_Sub15.anInt2649 == 0) {
								Class213.anInt5956 = -2;
							}
							return;
						}
						if (arg0 == 5607) {
							Class139.anIntArray213[Class139.anInt3646++] = Class2_Sub3_Sub6.anInt1045;
							return;
						}
						if (arg0 == 5608) {
							Class139.anIntArray213[Class139.anInt3646++] = Class37_Sub1.anInt1247;
							return;
						}
						if (arg0 == 5609) {
							Class139.anIntArray213[Class139.anInt3646++] = Class213.anInt5956;
							return;
						}
						if (arg0 == 5610) {
							for (local157 = 0; local157 < 5; local157++) {
								Class139.aStringArray29[Class139.anInt3648++] = Static153.aStringArray23.length > local157 ? Static307.method5658(Static153.aStringArray23[local157]) : "";
							}
							Static153.aStringArray23 = null;
							return;
						}
						if (arg0 == 5611) {
							Class139.anIntArray213[Class139.anInt3646++] = Class2_Sub2_Sub10.anInt6174;
							return;
						}
					} else if (arg0 < 6100) {
						if (arg0 == 6001) {
							local157 = Class139.anIntArray213[--Class139.anInt3646];
							if (local157 < 1) {
								local157 = 1;
							}
							if (local157 > 4) {
								local157 = 4;
							}
							Static203.aClass177_Sub1_2.anInt4869 = local157;
							Static322.method5828();
							Static203.aClass177_Sub1_2.method4498(Static305.aClass152_5);
							Class161.aBoolean288 = false;
							return;
						}
						if (arg0 == 6002) {
							Static203.aClass177_Sub1_2.method4494(Class139.anIntArray213[--Class139.anInt3646] == 1);
							Static322.method5828();
							Static210.method3983();
							Static203.aClass177_Sub1_2.method4498(Static305.aClass152_5);
							Class161.aBoolean288 = false;
							return;
						}
						if (arg0 == 6003) {
							Static203.aClass177_Sub1_2.aBoolean349 = Class139.anIntArray213[--Class139.anInt3646] == 1;
							Static210.method3983();
							Static203.aClass177_Sub1_2.method4498(Static305.aClass152_5);
							Class161.aBoolean288 = false;
							return;
						}
						if (arg0 == 6005) {
							Static203.aClass177_Sub1_2.aBoolean359 = Class139.anIntArray213[--Class139.anInt3646] == 1;
							Static322.method5828();
							Static203.aClass177_Sub1_2.method4498(Static305.aClass152_5);
							Class161.aBoolean288 = false;
							return;
						}
						if (arg0 == 6006) {
							Static203.aClass177_Sub1_2.aBoolean350 = Class139.anIntArray213[--Class139.anInt3646] == 1;
							Static177.aClass19_8.method2876(!Static203.aClass177_Sub1_2.aBoolean350);
							Static203.aClass177_Sub1_2.method4498(Static305.aClass152_5);
							Class161.aBoolean288 = false;
							return;
						}
						if (arg0 == 6007) {
							Static203.aClass177_Sub1_2.anInt4885 = Class139.anIntArray213[--Class139.anInt3646];
							Static203.aClass177_Sub1_2.method4498(Static305.aClass152_5);
							Class161.aBoolean288 = false;
							return;
						}
						if (arg0 == 6008) {
							Static203.aClass177_Sub1_2.aBoolean353 = Class139.anIntArray213[--Class139.anInt3646] == 1;
							Static203.aClass177_Sub1_2.method4498(Static305.aClass152_5);
							Class161.aBoolean288 = false;
							return;
						}
						if (arg0 == 6009) {
							Static203.aClass177_Sub1_2.aBoolean355 = Class139.anIntArray213[--Class139.anInt3646] == 1;
							Static322.method5828();
							Static203.aClass177_Sub1_2.method4498(Static305.aClass152_5);
							Class161.aBoolean288 = false;
							return;
						}
						if (arg0 == 6010) {
							Static203.aClass177_Sub1_2.aBoolean358 = Class139.anIntArray213[--Class139.anInt3646] == 1;
							Static203.aClass177_Sub1_2.method4498(Static305.aClass152_5);
							Class161.aBoolean288 = false;
							return;
						}
						if (arg0 == 6011) {
							local157 = Class139.anIntArray213[--Class139.anInt3646];
							if (local157 < 0 || local157 > 2) {
								local157 = 0;
							}
							Static203.aClass177_Sub1_2.anInt4876 = local157;
							Static322.method5828();
							Static203.aClass177_Sub1_2.method4498(Static305.aClass152_5);
							Class161.aBoolean288 = false;
							return;
						}
						if (arg0 == 6012) {
							Static203.aClass177_Sub1_2.aBoolean364 = Class139.anIntArray213[--Class139.anInt3646] == 1;
							Static163.method1508();
							Static203.aClass177_Sub1_2.method4498(Static305.aClass152_5);
							Class161.aBoolean288 = false;
							return;
						}
						if (arg0 == 6014) {
							Static203.aClass177_Sub1_2.aBoolean361 = Class139.anIntArray213[--Class139.anInt3646] == 1;
							Static322.method5828();
							Static203.aClass177_Sub1_2.method4498(Static305.aClass152_5);
							Class161.aBoolean288 = false;
							return;
						}
						if (arg0 == 6015) {
							Static203.aClass177_Sub1_2.aBoolean348 = Class139.anIntArray213[--Class139.anInt3646] == 1;
							Static322.method5828();
							Static203.aClass177_Sub1_2.method4498(Static305.aClass152_5);
							Class161.aBoolean288 = false;
							return;
						}
						if (arg0 == 6016) {
							local157 = Class139.anIntArray213[--Class139.anInt3646];
							if (local157 < 0 || local157 > 2) {
								local157 = 0;
							}
							Static203.aClass177_Sub1_2.anInt4875 = local157;
							Static328.method5884();
							Static203.aClass177_Sub1_2.method4498(Static305.aClass152_5);
							return;
						}
						if (arg0 == 6017) {
							Static203.aClass177_Sub1_2.aBoolean352 = Class139.anIntArray213[--Class139.anInt3646] == 1;
							Static166.method2344();
							Static203.aClass177_Sub1_2.method4498(Static305.aClass152_5);
							Class161.aBoolean288 = false;
							return;
						}
						if (arg0 == 6018) {
							local157 = Class139.anIntArray213[--Class139.anInt3646];
							if (local157 < 0) {
								local157 = 0;
							}
							if (local157 > 127) {
								local157 = 127;
							}
							Static203.aClass177_Sub1_2.anInt4878 = local157;
							Static203.aClass177_Sub1_2.method4498(Static305.aClass152_5);
							Class161.aBoolean288 = false;
							return;
						}
						if (arg0 == 6019) {
							local157 = Class139.anIntArray213[--Class139.anInt3646];
							if (local157 < 0) {
								local157 = 0;
							}
							if (local157 > 255) {
								local157 = 255;
							}
							if (local157 != Static203.aClass177_Sub1_2.anInt4879) {
								if (Static203.aClass177_Sub1_2.anInt4879 == 0 && Class2_Sub3_Sub18.anInt3264 != -1) {
									Static88.method2044(local157, Class2_Sub3_Sub18.anInt3264, Static94.aClass197_23);
									Class252.aBoolean486 = false;
								} else if (local157 == 0) {
									Static343.method6193();
									Class252.aBoolean486 = false;
								} else {
									Static280.method5212(local157);
								}
								Static203.aClass177_Sub1_2.anInt4879 = local157;
							}
							Static203.aClass177_Sub1_2.method4498(Static305.aClass152_5);
							Class161.aBoolean288 = false;
							return;
						}
						if (arg0 == 6020) {
							local157 = Class139.anIntArray213[--Class139.anInt3646];
							if (local157 < 0) {
								local157 = 0;
							}
							if (local157 > 127) {
								local157 = 127;
							}
							Static203.aClass177_Sub1_2.anInt4872 = local157;
							Static203.aClass177_Sub1_2.method4498(Static305.aClass152_5);
							Class161.aBoolean288 = false;
							return;
						}
						if (arg0 == 6021) {
							Static203.aClass177_Sub1_2.aBoolean366 = Class139.anIntArray213[--Class139.anInt3646] == 1;
							Static210.method3983();
							return;
						}
						if (arg0 == 6023) {
							local157 = Class139.anIntArray213[--Class139.anInt3646];
							local1292 = false;
							if (local157 < 0) {
								local157 = 0;
							}
							if (local157 > 2) {
								local157 = 2;
							}
							if (Class208.anInt5790 < 96) {
								local157 = 0;
								local1292 = true;
							}
							Static25.method864(local157);
							Static203.aClass177_Sub1_2.method4498(Static305.aClass152_5);
							Class161.aBoolean288 = false;
							Class139.anIntArray213[Class139.anInt3646++] = local1292 ? 0 : 1;
							return;
						}
						if (arg0 == 6024) {
							local157 = Class139.anIntArray213[--Class139.anInt3646];
							if (local157 < 0 || local157 > 2) {
								local157 = 0;
							}
							Static203.aClass177_Sub1_2.anInt4881 = local157;
							Static203.aClass177_Sub1_2.method4498(Static305.aClass152_5);
							return;
						}
						if (arg0 == 6025) {
							local157 = Class139.anIntArray213[--Class139.anInt3646];
							if (local157 < 0 || local157 > Static266.method5020(Class208.anInt5790)) {
								local157 = 0;
							}
							Static203.aClass177_Sub1_2.anInt4873 = local157;
							Static203.aClass177_Sub1_2.method4498(Static305.aClass152_5);
							Class161.aBoolean288 = false;
							return;
						}
						if (arg0 == 6027) {
							local157 = Class139.anIntArray213[--Class139.anInt3646];
							if (local157 < 0 || local157 > 1) {
								local157 = 0;
							}
							Static261.method4883(local157 == 1);
							return;
						}
						if (arg0 == 6028) {
							Static203.aClass177_Sub1_2.aBoolean363 = Class139.anIntArray213[--Class139.anInt3646] != 0;
							Static203.aClass177_Sub1_2.method4498(Static305.aClass152_5);
							return;
						}
						if (arg0 == 6029) {
							Static203.aClass177_Sub1_2.anInt4885 = Class139.anIntArray213[--Class139.anInt3646];
							Static203.aClass177_Sub1_2.method4498(Static305.aClass152_5);
							return;
						}
						if (arg0 == 6030) {
							Static203.aClass177_Sub1_2.aBoolean357 = Class139.anIntArray213[--Class139.anInt3646] != 0;
							Static203.aClass177_Sub1_2.method4498(Static305.aClass152_5);
							Static322.method5828();
							return;
						}
						if (arg0 == 6031) {
							local157 = Class139.anIntArray213[--Class139.anInt3646];
							if (local157 < 0 || local157 > 3) {
								local157 = 2;
							}
							Static74.method5702(local157);
							return;
						}
						if (arg0 == 6032) {
							local157 = Class139.anIntArray213[--Class139.anInt3646];
							if (local157 < 0 || local157 > 3) {
								local157 = 2;
							}
							Static203.aClass177_Sub1_2.anInt4868 = local157;
							Static203.aClass177_Sub1_2.method4498(Static305.aClass152_5);
							Class161.aBoolean288 = false;
							return;
						}
						if (arg0 == 6033) {
							local157 = Class139.anIntArray213[--Class139.anInt3646];
							if (local157 < 0 || local157 > 4) {
								local157 = 2;
							}
							Static203.aClass177_Sub1_2.anInt4871 = local157;
							Static203.aClass177_Sub1_2.method4498(Static305.aClass152_5);
							return;
						}
						if (arg0 == 6035) {
							Static203.aClass177_Sub1_2.aBoolean365 = Class139.anIntArray213[--Class139.anInt3646] == 1;
							Static322.method5828();
							Static210.method3983();
							return;
						}
					} else if (arg0 < 6200) {
						if (arg0 == 6101) {
							Class139.anIntArray213[Class139.anInt3646++] = Static203.aClass177_Sub1_2.anInt4869;
							return;
						}
						if (arg0 == 6102) {
							Class139.anIntArray213[Class139.anInt3646++] = Static203.aClass177_Sub1_2.method4497(Class2_Sub10.anInt1760) ? 1 : 0;
							return;
						}
						if (arg0 == 6103) {
							Class139.anIntArray213[Class139.anInt3646++] = Static203.aClass177_Sub1_2.aBoolean349 ? 1 : 0;
							return;
						}
						if (arg0 == 6105) {
							Class139.anIntArray213[Class139.anInt3646++] = Static203.aClass177_Sub1_2.aBoolean359 ? 1 : 0;
							return;
						}
						if (arg0 == 6106) {
							Class139.anIntArray213[Class139.anInt3646++] = Static203.aClass177_Sub1_2.aBoolean350 ? 1 : 0;
							return;
						}
						if (arg0 == 6107) {
							Class139.anIntArray213[Class139.anInt3646++] = Static203.aClass177_Sub1_2.anInt4885;
							return;
						}
						if (arg0 == 6108) {
							Class139.anIntArray213[Class139.anInt3646++] = Static203.aClass177_Sub1_2.aBoolean353 ? 1 : 0;
							return;
						}
						if (arg0 == 6109) {
							Class139.anIntArray213[Class139.anInt3646++] = Static203.aClass177_Sub1_2.aBoolean355 ? 1 : 0;
							return;
						}
						if (arg0 == 6110) {
							Class139.anIntArray213[Class139.anInt3646++] = Static203.aClass177_Sub1_2.aBoolean358 ? 1 : 0;
							return;
						}
						if (arg0 == 6111) {
							Class139.anIntArray213[Class139.anInt3646++] = Static203.aClass177_Sub1_2.anInt4876;
							return;
						}
						if (arg0 == 6112) {
							Class139.anIntArray213[Class139.anInt3646++] = Static203.aClass177_Sub1_2.aBoolean364 ? 1 : 0;
							return;
						}
						if (arg0 == 6114) {
							Class139.anIntArray213[Class139.anInt3646++] = Static203.aClass177_Sub1_2.aBoolean361 ? 1 : 0;
							return;
						}
						if (arg0 == 6115) {
							Class139.anIntArray213[Class139.anInt3646++] = Static203.aClass177_Sub1_2.aBoolean348 ? 1 : 0;
							return;
						}
						if (arg0 == 6116) {
							Class139.anIntArray213[Class139.anInt3646++] = Static203.aClass177_Sub1_2.anInt4875;
							return;
						}
						if (arg0 == 6117) {
							Class139.anIntArray213[Class139.anInt3646++] = Static203.aClass177_Sub1_2.aBoolean352 ? 1 : 0;
							return;
						}
						if (arg0 == 6118) {
							Class139.anIntArray213[Class139.anInt3646++] = Static203.aClass177_Sub1_2.anInt4878;
							return;
						}
						if (arg0 == 6119) {
							Class139.anIntArray213[Class139.anInt3646++] = Static203.aClass177_Sub1_2.anInt4879;
							return;
						}
						if (arg0 == 6120) {
							Class139.anIntArray213[Class139.anInt3646++] = Static203.aClass177_Sub1_2.anInt4872;
							return;
						}
						if (arg0 == 6121) {
							Class139.anIntArray213[Class139.anInt3646++] = Static177.aClass19_8.method2896() ? 1 : 0;
							return;
						}
						if (arg0 == 6123) {
							Class139.anIntArray213[Class139.anInt3646++] = Static172.method3392();
							return;
						}
						if (arg0 == 6124) {
							Class139.anIntArray213[Class139.anInt3646++] = Static203.aClass177_Sub1_2.anInt4881;
							return;
						}
						if (arg0 == 6125) {
							Class139.anIntArray213[Class139.anInt3646++] = Static203.aClass177_Sub1_2.anInt4873;
							return;
						}
						if (arg0 == 6126) {
							Class139.anIntArray213[Class139.anInt3646++] = Static177.aClass19_8.method2860() ? 1 : 0;
							return;
						}
						if (arg0 == 6127) {
							Class139.anIntArray213[Class139.anInt3646++] = Static203.aClass177_Sub1_2.aBoolean356 ? 1 : 0;
							return;
						}
						if (arg0 == 6128) {
							Class139.anIntArray213[Class139.anInt3646++] = Static203.aClass177_Sub1_2.aBoolean363 ? 1 : 0;
							return;
						}
						if (arg0 == 6129) {
							Class139.anIntArray213[Class139.anInt3646++] = Static203.aClass177_Sub1_2.anInt4885;
							return;
						}
						if (arg0 == 6130) {
							Class139.anIntArray213[Class139.anInt3646++] = Static203.aClass177_Sub1_2.aBoolean357 ? 1 : 0;
							return;
						}
						if (arg0 == 6131) {
							Class139.anIntArray213[Class139.anInt3646++] = Class2_Sub10.anInt1760;
							return;
						}
						if (arg0 == 6132) {
							Class139.anIntArray213[Class139.anInt3646++] = Static203.aClass177_Sub1_2.anInt4868;
							return;
						}
						if (arg0 == 6133) {
							Class139.anIntArray213[Class139.anInt3646++] = Class152.anInt3791 == 1 || Class152.anInt3791 == 4 ? 1 : 0;
							return;
						}
						if (arg0 == 6134) {
							Class139.anIntArray213[Class139.anInt3646++] = Static266.method5020(Class208.anInt5790);
							return;
						}
						if (arg0 == 6135) {
							Class139.anIntArray213[Class139.anInt3646++] = Static203.aClass177_Sub1_2.anInt4871;
							return;
						}
					} else if (arg0 < 6300) {
						if (arg0 == 6200) {
							Class139.anInt3646 -= 2;
							Class171.aShort73 = (short) Class139.anIntArray213[Class139.anInt3646];
							if (Class171.aShort73 <= 0) {
								Class171.aShort73 = 256;
							}
							Class12_Sub6.aShort78 = (short) Class139.anIntArray213[Class139.anInt3646 + 1];
							if (Class12_Sub6.aShort78 <= 0) {
								Class12_Sub6.aShort78 = 205;
							}
							return;
						}
						if (arg0 == 6201) {
							Class139.anInt3646 -= 2;
							Class2_Sub28.aShort79 = (short) Class139.anIntArray213[Class139.anInt3646];
							if (Class2_Sub28.aShort79 <= 0) {
								Class2_Sub28.aShort79 = 256;
							}
							Class87.aShort36 = (short) Class139.anIntArray213[Class139.anInt3646 + 1];
							if (Class87.aShort36 <= 0) {
								Class87.aShort36 = 320;
							}
							return;
						}
						if (arg0 == 6202) {
							Class139.anInt3646 -= 4;
							Class49.aShort86 = (short) Class139.anIntArray213[Class139.anInt3646];
							if (Class49.aShort86 <= 0) {
								Class49.aShort86 = 1;
							}
							Class87.aShort35 = (short) Class139.anIntArray213[Class139.anInt3646 + 1];
							if (Class87.aShort35 <= 0) {
								Class87.aShort35 = 32767;
							} else if (Class87.aShort35 < Class49.aShort86) {
								Class87.aShort35 = Class49.aShort86;
							}
							Class233.aShort92 = (short) Class139.anIntArray213[Class139.anInt3646 + 2];
							if (Class233.aShort92 <= 0) {
								Class233.aShort92 = 1;
							}
							Class53.aShort19 = (short) Class139.anIntArray213[Class139.anInt3646 + 3];
							if (Class53.aShort19 <= 0) {
								Class53.aShort19 = 32767;
								return;
							}
							if (Class53.aShort19 < Class233.aShort92) {
								Class53.aShort19 = Class233.aShort92;
							}
							return;
						}
						if (arg0 == 6203) {
							Static285.method5274(0, Class17.aClass161_1.anInt4255, false, Class17.aClass161_1.anInt4242, 0);
							Class139.anIntArray213[Class139.anInt3646++] = Class110.anInt2805;
							Class139.anIntArray213[Class139.anInt3646++] = Class124.anInt3404;
							return;
						}
						if (arg0 == 6204) {
							Class139.anIntArray213[Class139.anInt3646++] = Class2_Sub28.aShort79;
							Class139.anIntArray213[Class139.anInt3646++] = Class87.aShort36;
							return;
						}
						if (arg0 == 6205) {
							Class139.anIntArray213[Class139.anInt3646++] = Class171.aShort73;
							Class139.anIntArray213[Class139.anInt3646++] = Class12_Sub6.aShort78;
							return;
						}
					} else if (arg0 < 6400) {
						if (arg0 == 6300) {
							Class139.anIntArray213[Class139.anInt3646++] = (int) (Static190.method3686() / 60000L);
							return;
						}
						if (arg0 == 6301) {
							Class139.anIntArray213[Class139.anInt3646++] = (int) (Static190.method3686() / 86400000L) - 11745;
							return;
						}
						if (arg0 == 6302) {
							Class139.anInt3646 -= 3;
							local157 = Class139.anIntArray213[Class139.anInt3646];
							local192 = Class139.anIntArray213[Class139.anInt3646 + 1];
							local89 = Class139.anIntArray213[Class139.anInt3646 + 2];
							Class139.aCalendar1.clear();
							Class139.aCalendar1.set(11, 12);
							Class139.aCalendar1.set(local89, local192, local157);
							Class139.anIntArray213[Class139.anInt3646++] = (int) (Class139.aCalendar1.getTime().getTime() / 86400000L) - 11745;
							return;
						}
						if (arg0 == 6303) {
							Class139.aCalendar1.clear();
							Class139.aCalendar1.setTime(new Date(Static190.method3686()));
							Class139.anIntArray213[Class139.anInt3646++] = Class139.aCalendar1.get(1);
							return;
						}
						if (arg0 == 6304) {
							local157 = Class139.anIntArray213[--Class139.anInt3646];
							local1292 = true;
							if (local157 < 0) {
								local1292 = (local157 + 1) % 4 == 0;
							} else if (local157 < 1582) {
								local1292 = local157 % 4 == 0;
							} else if (local157 % 4 != 0) {
								local1292 = false;
							} else if (local157 % 100 != 0) {
								local1292 = true;
							} else if (local157 % 400 != 0) {
								local1292 = false;
							}
							Class139.anIntArray213[Class139.anInt3646++] = local1292 ? 1 : 0;
							return;
						}
					} else if (arg0 < 6500) {
						if (arg0 == 6405) {
							Class139.anIntArray213[Class139.anInt3646++] = Static75.method1872() ? 1 : 0;
							return;
						}
						if (arg0 == 6406) {
							Class139.anIntArray213[Class139.anInt3646++] = Static308.method5661() ? 1 : 0;
							return;
						}
					} else if (arg0 < 6600) {
						if (arg0 == 6500) {
							if (Class2_Sub3_Sub35.anInt6430 == 10 && Class109.anInt2800 == 0 && Class2_Sub3_Sub35.anInt6429 == 0 && Class2_Sub3_Sub15.anInt2649 == 0) {
								Class139.anIntArray213[Class139.anInt3646++] = Static296.method5431() == -1 ? 0 : 1;
								return;
							}
							Class139.anIntArray213[Class139.anInt3646++] = 1;
							return;
						}
						@Pc(5979) Class124 local5979;
						@Pc(5946) Class3_Sub1 local5946;
						if (arg0 == 6501) {
							local5946 = Static19.method559();
							if (local5946 != null) {
								Class139.anIntArray213[Class139.anInt3646++] = local5946.anInt81;
								Class139.anIntArray213[Class139.anInt3646++] = local5946.anInt74;
								Class139.aStringArray29[Class139.anInt3648++] = local5946.aString1;
								local5979 = local5946.method75();
								Class139.anIntArray213[Class139.anInt3646++] = local5979.anInt3401;
								Class139.aStringArray29[Class139.anInt3648++] = local5979.aString28;
								Class139.anIntArray213[Class139.anInt3646++] = local5946.anInt78;
								Class139.anIntArray213[Class139.anInt3646++] = local5946.anInt83;
								return;
							}
							Class139.anIntArray213[Class139.anInt3646++] = -1;
							Class139.anIntArray213[Class139.anInt3646++] = 0;
							Class139.aStringArray29[Class139.anInt3648++] = "";
							Class139.anIntArray213[Class139.anInt3646++] = 0;
							Class139.aStringArray29[Class139.anInt3648++] = "";
							Class139.anIntArray213[Class139.anInt3646++] = 0;
							Class139.anIntArray213[Class139.anInt3646++] = 0;
							return;
						}
						if (arg0 == 6502) {
							local5946 = Static247.method4549();
							if (local5946 != null) {
								Class139.anIntArray213[Class139.anInt3646++] = local5946.anInt81;
								Class139.anIntArray213[Class139.anInt3646++] = local5946.anInt74;
								Class139.aStringArray29[Class139.anInt3648++] = local5946.aString1;
								local5979 = local5946.method75();
								Class139.anIntArray213[Class139.anInt3646++] = local5979.anInt3401;
								Class139.aStringArray29[Class139.anInt3648++] = local5979.aString28;
								Class139.anIntArray213[Class139.anInt3646++] = local5946.anInt78;
								Class139.anIntArray213[Class139.anInt3646++] = local5946.anInt83;
								return;
							}
							Class139.anIntArray213[Class139.anInt3646++] = -1;
							Class139.anIntArray213[Class139.anInt3646++] = 0;
							Class139.aStringArray29[Class139.anInt3648++] = "";
							Class139.anIntArray213[Class139.anInt3646++] = 0;
							Class139.aStringArray29[Class139.anInt3648++] = "";
							Class139.anIntArray213[Class139.anInt3646++] = 0;
							Class139.anIntArray213[Class139.anInt3646++] = 0;
							return;
						}
						if (arg0 == 6503) {
							local157 = Class139.anIntArray213[--Class139.anInt3646];
							if (Class2_Sub3_Sub35.anInt6430 == 10 && Class109.anInt2800 == 0 && Class2_Sub3_Sub35.anInt6429 == 0 && Class2_Sub3_Sub15.anInt2649 == 0) {
								Class139.anIntArray213[Class139.anInt3646++] = Static350.method6280(local157) ? 1 : 0;
								return;
							}
							Class139.anIntArray213[Class139.anInt3646++] = 0;
							return;
						}
						if (arg0 == 6504) {
							Static203.aClass177_Sub1_2.anInt4877 = Class139.anIntArray213[--Class139.anInt3646];
							Static203.aClass177_Sub1_2.method4498(Static305.aClass152_5);
							return;
						}
						if (arg0 == 6505) {
							Class139.anIntArray213[Class139.anInt3646++] = Static203.aClass177_Sub1_2.anInt4877;
							return;
						}
						if (arg0 == 6506) {
							local157 = Class139.anIntArray213[--Class139.anInt3646];
							@Pc(6295) Class3_Sub1 local6295 = Static7.method6468(local157);
							if (local6295 != null) {
								Class139.anIntArray213[Class139.anInt3646++] = local6295.anInt74;
								Class139.aStringArray29[Class139.anInt3648++] = local6295.aString1;
								@Pc(6319) Class124 local6319 = local6295.method75();
								Class139.anIntArray213[Class139.anInt3646++] = local6319.anInt3401;
								Class139.aStringArray29[Class139.anInt3648++] = local6319.aString28;
								Class139.anIntArray213[Class139.anInt3646++] = local6295.anInt78;
								Class139.anIntArray213[Class139.anInt3646++] = local6295.anInt83;
								return;
							}
							Class139.anIntArray213[Class139.anInt3646++] = -1;
							Class139.aStringArray29[Class139.anInt3648++] = "";
							Class139.anIntArray213[Class139.anInt3646++] = 0;
							Class139.aStringArray29[Class139.anInt3648++] = "";
							Class139.anIntArray213[Class139.anInt3646++] = 0;
							Class139.anIntArray213[Class139.anInt3646++] = 0;
							return;
						}
						if (arg0 == 6507) {
							Class139.anInt3646 -= 4;
							local157 = Class139.anIntArray213[Class139.anInt3646];
							local1292 = Class139.anIntArray213[Class139.anInt3646 + 1] == 1;
							local89 = Class139.anIntArray213[Class139.anInt3646 + 2];
							local1903 = Class139.anIntArray213[Class139.anInt3646 + 3] == 1;
							Static320.method5785(local1292, local1903, local89, local157);
							return;
						}
						if (arg0 == 6508) {
							Static187.method3645();
							return;
						}
						if (arg0 == 6509) {
							if (Class2_Sub3_Sub35.anInt6430 != 10) {
								return;
							}
							Class30.aBoolean74 = Class139.anIntArray213[--Class139.anInt3646] == 1;
							return;
						}
					} else if (arg0 < 6700) {
						if (arg0 == 6600) {
							Static203.aClass177_Sub1_2.aBoolean351 = Class139.anIntArray213[--Class139.anInt3646] == 1;
							Static203.aClass177_Sub1_2.method4498(Static305.aClass152_5);
							return;
						}
						if (arg0 == 6601) {
							Class139.anIntArray213[Class139.anInt3646++] = Static203.aClass177_Sub1_2.aBoolean351 ? 1 : 0;
							return;
						}
					} else if (arg0 < 6800 && Static189.aClass209_2 == Class11_Sub5_Sub5.aClass209_4) {
						if (arg0 == 6700) {
							local157 = Class2_Sub3_Sub34.aClass4_130.method83();
							if (Class97.anInt2592 != -1) {
								local157++;
							}
							Class139.anIntArray213[Class139.anInt3646++] = local157;
							return;
						}
						if (arg0 == 6701) {
							local157 = Class139.anIntArray213[--Class139.anInt3646];
							if (Class97.anInt2592 != -1) {
								if (local157 == 0) {
									Class139.anIntArray213[Class139.anInt3646++] = Class97.anInt2592;
									return;
								}
								local157--;
							}
							@Pc(6577) Class2_Sub7 local6577 = (Class2_Sub7) Class2_Sub3_Sub34.aClass4_130.method80();
							while (local157-- > 0) {
								local6577 = (Class2_Sub7) Class2_Sub3_Sub34.aClass4_130.method79();
							}
							Class139.anIntArray213[Class139.anInt3646++] = local6577.anInt1368;
							return;
						}
						if (arg0 == 6702) {
							local157 = Class139.anIntArray213[--Class139.anInt3646];
							if (Static25.aClass161ArrayArray1[local157] == null) {
								Class139.aStringArray29[Class139.anInt3648++] = "";
								return;
							}
							local81 = Static25.aClass161ArrayArray1[local157][0].aString43;
							if (local81 == null) {
								Class139.aStringArray29[Class139.anInt3648++] = "";
								return;
							}
							Class139.aStringArray29[Class139.anInt3648++] = local81.substring(0, local81.indexOf(58));
							return;
						}
						if (arg0 == 6703) {
							local157 = Class139.anIntArray213[--Class139.anInt3646];
							if (Static25.aClass161ArrayArray1[local157] == null) {
								Class139.anIntArray213[Class139.anInt3646++] = 0;
								return;
							}
							Class139.anIntArray213[Class139.anInt3646++] = Static25.aClass161ArrayArray1[local157].length;
							return;
						}
						if (arg0 == 6704) {
							Class139.anInt3646 -= 2;
							local157 = Class139.anIntArray213[Class139.anInt3646];
							local192 = Class139.anIntArray213[Class139.anInt3646 + 1];
							if (Static25.aClass161ArrayArray1[local157] == null) {
								Class139.aStringArray29[Class139.anInt3648++] = "";
								return;
							}
							local3230 = Static25.aClass161ArrayArray1[local157][local192].aString43;
							if (local3230 == null) {
								Class139.aStringArray29[Class139.anInt3648++] = "";
								return;
							}
							Class139.aStringArray29[Class139.anInt3648++] = local3230;
							return;
						}
						if (arg0 == 6705) {
							Class139.anInt3646 -= 2;
							local157 = Class139.anIntArray213[Class139.anInt3646];
							local192 = Class139.anIntArray213[Class139.anInt3646 + 1];
							if (Static25.aClass161ArrayArray1[local157] == null) {
								Class139.anIntArray213[Class139.anInt3646++] = 0;
								return;
							}
							Class139.anIntArray213[Class139.anInt3646++] = Static25.aClass161ArrayArray1[local157][local192].anInt4240;
							return;
						}
						if (arg0 == 6706) {
							return;
						}
						if (arg0 == 6707) {
							Class139.anInt3646 -= 3;
							local157 = Class139.anIntArray213[Class139.anInt3646];
							local192 = Class139.anIntArray213[Class139.anInt3646 + 1];
							local89 = Class139.anIntArray213[Class139.anInt3646 + 2];
							Static254.method4682(local157 << 16 | local192, 1, "", local89);
							return;
						}
						if (arg0 == 6708) {
							Class139.anInt3646 -= 3;
							local157 = Class139.anIntArray213[Class139.anInt3646];
							local192 = Class139.anIntArray213[Class139.anInt3646 + 1];
							local89 = Class139.anIntArray213[Class139.anInt3646 + 2];
							Static254.method4682(local157 << 16 | local192, 2, "", local89);
							return;
						}
						if (arg0 == 6709) {
							Class139.anInt3646 -= 3;
							local157 = Class139.anIntArray213[Class139.anInt3646];
							local192 = Class139.anIntArray213[Class139.anInt3646 + 1];
							local89 = Class139.anIntArray213[Class139.anInt3646 + 2];
							Static254.method4682(local157 << 16 | local192, 3, "", local89);
							return;
						}
						if (arg0 == 6710) {
							Class139.anInt3646 -= 3;
							local157 = Class139.anIntArray213[Class139.anInt3646];
							local192 = Class139.anIntArray213[Class139.anInt3646 + 1];
							local89 = Class139.anIntArray213[Class139.anInt3646 + 2];
							Static254.method4682(local157 << 16 | local192, 4, "", local89);
							return;
						}
						if (arg0 == 6711) {
							Class139.anInt3646 -= 3;
							local157 = Class139.anIntArray213[Class139.anInt3646];
							local192 = Class139.anIntArray213[Class139.anInt3646 + 1];
							local89 = Class139.anIntArray213[Class139.anInt3646 + 2];
							Static254.method4682(local157 << 16 | local192, 5, "", local89);
							return;
						}
						if (arg0 == 6712) {
							Class139.anInt3646 -= 3;
							local157 = Class139.anIntArray213[Class139.anInt3646];
							local192 = Class139.anIntArray213[Class139.anInt3646 + 1];
							local89 = Class139.anIntArray213[Class139.anInt3646 + 2];
							Static254.method4682(local157 << 16 | local192, 6, "", local89);
							return;
						}
						if (arg0 == 6713) {
							Class139.anInt3646 -= 3;
							local157 = Class139.anIntArray213[Class139.anInt3646];
							local192 = Class139.anIntArray213[Class139.anInt3646 + 1];
							local89 = Class139.anIntArray213[Class139.anInt3646 + 2];
							Static254.method4682(local157 << 16 | local192, 7, "", local89);
							return;
						}
						if (arg0 == 6714) {
							Class139.anInt3646 -= 3;
							local157 = Class139.anIntArray213[Class139.anInt3646];
							local192 = Class139.anIntArray213[Class139.anInt3646 + 1];
							local89 = Class139.anIntArray213[Class139.anInt3646 + 2];
							Static254.method4682(local157 << 16 | local192, 8, "", local89);
							return;
						}
						if (arg0 == 6715) {
							Class139.anInt3646 -= 3;
							local157 = Class139.anIntArray213[Class139.anInt3646];
							local192 = Class139.anIntArray213[Class139.anInt3646 + 1];
							local89 = Class139.anIntArray213[Class139.anInt3646 + 2];
							Static254.method4682(local157 << 16 | local192, 9, "", local89);
							return;
						}
						if (arg0 == 6716) {
							Class139.anInt3646 -= 3;
							local157 = Class139.anIntArray213[Class139.anInt3646];
							local192 = Class139.anIntArray213[Class139.anInt3646 + 1];
							local89 = Class139.anIntArray213[Class139.anInt3646 + 2];
							Static254.method4682(local157 << 16 | local192, 10, "", local89);
							return;
						}
						if (arg0 == 6717) {
							Class139.anInt3646 -= 3;
							local157 = Class139.anIntArray213[Class139.anInt3646];
							local192 = Class139.anIntArray213[Class139.anInt3646 + 1];
							local89 = Class139.anIntArray213[Class139.anInt3646 + 2];
							@Pc(7165) Class161 local7165 = Static193.method3706(local157 << 16 | local192, local89);
							Static193.method3700();
							@Pc(7170) Class2_Sub10 local7170 = Static42.method1406(local7165);
							Static173.method3401(local7165.anInt4232, local7170.method1854(), local157 << 16 | local192, local89, local7165.anInt4279, local7170.anInt1757);
							return;
						}
					} else if (arg0 < 6900) {
						@Pc(7207) Class164 local7207;
						if (arg0 == 6800) {
							local157 = Class139.anIntArray213[--Class139.anInt3646];
							local7207 = Static219.aClass125_1.method3380(local157);
							if (local7207.aString48 == null) {
								Class139.aStringArray29[Class139.anInt3648++] = "";
								return;
							}
							Class139.aStringArray29[Class139.anInt3648++] = local7207.aString48;
							return;
						}
						if (arg0 == 6801) {
							local157 = Class139.anIntArray213[--Class139.anInt3646];
							local7207 = Static219.aClass125_1.method3380(local157);
							Class139.anIntArray213[Class139.anInt3646++] = local7207.anInt4413;
							return;
						}
						if (arg0 == 6802) {
							local157 = Class139.anIntArray213[--Class139.anInt3646];
							local7207 = Static219.aClass125_1.method3380(local157);
							Class139.anIntArray213[Class139.anInt3646++] = local7207.anInt4411;
							return;
						}
						if (arg0 == 6803) {
							local157 = Class139.anIntArray213[--Class139.anInt3646];
							local7207 = Static219.aClass125_1.method3380(local157);
							Class139.anIntArray213[Class139.anInt3646++] = local7207.anInt4417;
							return;
						}
						if (arg0 == 6804) {
							Class139.anInt3646 -= 2;
							local157 = Class139.anIntArray213[Class139.anInt3646];
							local192 = Class139.anIntArray213[Class139.anInt3646 + 1];
							@Pc(7329) Class240 local7329 = Static338.aClass18_2.method565(local192);
							if (local7329.method6264()) {
								Class139.aStringArray29[Class139.anInt3648++] = Static219.aClass125_1.method3380(local157).method4186(local192, local7329.aString69);
								return;
							}
							Class139.anIntArray213[Class139.anInt3646++] = Static219.aClass125_1.method3380(local157).method4189(local7329.anInt7010, local192);
							return;
						}
					}
				}
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!js;I)V", line = 6847)
	private static void method3601(@OriginalArg(0) Class2_Sub2_Sub11 arg0, @OriginalArg(1) int arg1) {
		Class139.anInt3646 = 0;
		Class139.anInt3648 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray199;
		@Pc(11) int[] local11 = arg0.anIntArray200;
		@Pc(13) byte local13 = -1;
		Class139.anInt3657 = 0;
		@Pc(603) int local603;
		try {
			@Pc(17) int local17 = 0;
			label260: while (true) {
				local17++;
				if (local17 > arg1) {
					throw new RuntimeException("slow");
				}
				local5++;
				@Pc(31) int local31 = local8[local5];
				if (local31 >= 100) {
					@Pc(802) boolean local802;
					if (local11[local5] == 1) {
						local802 = true;
					} else {
						local802 = false;
					}
					if (local31 >= 100 && local31 < 5000) {
						method3596(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method3600(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					Class139.anIntArray213[Class139.anInt3646++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						Class139.anIntArray213[Class139.anInt3646++] = Static199.aClass226_1.anIntArray430[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static199.aClass226_1.method5781(local54, Class139.anIntArray213[--Class139.anInt3646]);
					} else if (local31 == 3) {
						Class139.aStringArray29[Class139.anInt3648++] = arg0.aStringArray27[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						Class139.anInt3646 -= 2;
						if (Class139.anIntArray213[Class139.anInt3646] != Class139.anIntArray213[Class139.anInt3646 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						Class139.anInt3646 -= 2;
						if (Class139.anIntArray213[Class139.anInt3646] == Class139.anIntArray213[Class139.anInt3646 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						Class139.anInt3646 -= 2;
						if (Class139.anIntArray213[Class139.anInt3646] < Class139.anIntArray213[Class139.anInt3646 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						Class139.anInt3646 -= 2;
						if (Class139.anIntArray213[Class139.anInt3646] > Class139.anIntArray213[Class139.anInt3646 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (Class139.anInt3657 == 0) {
							return;
						}
						@Pc(216) Class172 local216 = Class139.aClass172Array1[--Class139.anInt3657];
						arg0 = local216.aClass2_Sub2_Sub11_1;
						local8 = arg0.anIntArray199;
						local11 = arg0.anIntArray200;
						local5 = local216.anInt4695;
						anIntArray212 = local216.anIntArray319;
						aStringArray30 = local216.aStringArray47;
					} else if (local31 == 25) {
						local54 = local11[local5];
						Class139.anIntArray213[Class139.anInt3646++] = Static199.aClass226_1.method5779(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static199.aClass226_1.method5780(local54, Class139.anIntArray213[--Class139.anInt3646]);
					} else if (local31 == 31) {
						Class139.anInt3646 -= 2;
						if (Class139.anIntArray213[Class139.anInt3646] <= Class139.anIntArray213[Class139.anInt3646 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						Class139.anInt3646 -= 2;
						if (Class139.anIntArray213[Class139.anInt3646] >= Class139.anIntArray213[Class139.anInt3646 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						Class139.anIntArray213[Class139.anInt3646++] = anIntArray212[local11[local5]];
					} else if (local31 == 34) {
						anIntArray212[local11[local5]] = Class139.anIntArray213[--Class139.anInt3646];
					} else if (local31 == 35) {
						Class139.aStringArray29[Class139.anInt3648++] = aStringArray30[local11[local5]];
					} else if (local31 == 36) {
						aStringArray30[local11[local5]] = Class139.aStringArray29[--Class139.anInt3648];
					} else if (local31 == 37) {
						local54 = local11[local5];
						Class139.anInt3648 -= local54;
						@Pc(400) String local400 = Static83.method1942(Class139.anInt3648, Class139.aStringArray29, local54);
						Class139.aStringArray29[Class139.anInt3648++] = local400;
					} else if (local31 == 38) {
						Class139.anInt3646--;
					} else if (local31 == 39) {
						Class139.anInt3648--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class2_Sub2_Sub11 local436 = Static272.method5101(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt3221];
							@Pc(450) String[] local450 = new String[local436.anInt3224];
							for (local452 = 0; local452 < local436.anInt3226; local452++) {
								local446[local452] = Class139.anIntArray213[Class139.anInt3646 + local452 - local436.anInt3226];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt3223; local471++) {
								local450[local471] = Class139.aStringArray29[Class139.anInt3648 + local471 - local436.anInt3223];
							}
							Class139.anInt3646 -= local436.anInt3226;
							Class139.anInt3648 -= local436.anInt3223;
							@Pc(502) Class172 local502 = new Class172();
							local502.aClass2_Sub2_Sub11_1 = arg0;
							local502.anInt4695 = local5;
							local502.anIntArray319 = anIntArray212;
							local502.aStringArray47 = aStringArray30;
							if (Class139.anInt3657 >= Class139.aClass172Array1.length) {
								throw new RuntimeException();
							}
							Class139.aClass172Array1[Class139.anInt3657++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray199;
							local11 = local436.anIntArray200;
							local5 = -1;
							anIntArray212 = local446;
							aStringArray30 = local450;
						} else if (local31 == 42) {
							Class139.anIntArray213[Class139.anInt3646++] = Static71.anIntArray117[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static71.anIntArray117[local54] = Class139.anIntArray213[--Class139.anInt3646];
							Static210.method3984(local54);
							Class2_Sub2_Sub2_Sub2.aBoolean374 |= Static83.aBooleanArray18[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = Class139.anIntArray213[--Class139.anInt3646];
							if (local611 >= 0 && local611 <= 5000) {
								Class139.anIntArray214[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									Class139.anIntArrayArray27[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = Class139.anIntArray213[--Class139.anInt3646];
							if (local603 < 0 || local603 >= Class139.anIntArray214[local54]) {
								throw new RuntimeException();
							}
							Class139.anIntArray213[Class139.anInt3646++] = Class139.anIntArrayArray27[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							Class139.anInt3646 -= 2;
							local603 = Class139.anIntArray213[Class139.anInt3646];
							if (local603 < 0 || local603 >= Class139.anIntArray214[local54]) {
								throw new RuntimeException();
							}
							Class139.anIntArrayArray27[local54][local603] = Class139.anIntArray213[Class139.anInt3646 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static71.aStringArray11[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							Class139.aStringArray29[Class139.anInt3648++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static71.aStringArray11[local54] = Class139.aStringArray29[--Class139.anInt3648];
							Static267.method5024(local54);
						} else if (local31 == 51) {
							@Pc(774) Class4 local774 = arg0.aClass4Array1[local11[local5]];
							@Pc(787) Class2_Sub39 local787 = (Class2_Sub39) local774.method90((long) Class139.anIntArray213[--Class139.anInt3646]);
							if (local787 != null) {
								local5 += local787.anInt6805;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(855) StringBuffer local855;
			if (arg0.aString27 == null) {
				local855 = new StringBuffer(30);
				local855.append("CS2: ").append(arg0.aLong232).append(" ");
				for (local603 = Class139.anInt3657 - 1; local603 >= 0; local603--) {
					local855.append("v: ").append(Class139.aClass172Array1[local603].aClass2_Sub2_Sub11_1.aLong232).append(" ");
				}
				local855.append("op: ").append(local13);
				Static241.method6254(local837, local855.toString());
			} else {
				Static193.method3701("Clientscript error in: " + arg0.aString27);
				local855 = new StringBuffer(30);
				local855.append("Clientscript error in: ").append(arg0.aString27).append("\n");
				for (local603 = Class139.anInt3657 - 1; local603 >= 0; local603--) {
					local855.append("via: ").append(Class139.aClass172Array1[local603].aClass2_Sub2_Sub11_1.aString27).append("\n");
				}
				local855.append("Op: ").append(local13).append("\n");
				@Pc(895) String local895 = local837.getMessage();
				if (local895 != null && local895.length() > 0) {
					local855.append("Message: ").append(local895).append("\n");
				}
				Static241.method6254(local837, local855.toString());
				Static149.method2941(local855.toString());
			}
		}
	}
}
