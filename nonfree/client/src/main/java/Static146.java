import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!is", name = "M", descriptor = "I")
	public static int anInt3013;

	@OriginalMember(owner = "client!is", name = "N", descriptor = "[[I")
	public static int[][] anIntArrayArray91;

	@OriginalMember(owner = "client!is", name = "X", descriptor = "F")
	public static float aFloat40;

	@OriginalMember(owner = "client!is", name = "Y", descriptor = "Lclient!tq;")
	public static Class191 aClass191_95;

	@OriginalMember(owner = "client!is", name = "S", descriptor = "I")
	public static int anInt3018 = 0;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)I")
	public static int method2859(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) int local11 = arg1.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local8 > local13 - local17 || local15 - local19 < local11) {
			if (local13 - local17 >= local8) {
				return -1;
			}
			if (local11 <= local15 - local19) {
				return 1;
			}
			@Pc(52) char local52;
			if (local17 == '\u0000') {
				local52 = arg0.charAt(local13++);
			} else {
				local52 = local17;
			}
			@Pc(65) char local65;
			if (local19 == '\u0000') {
				local65 = arg1.charAt(local15++);
			} else {
				local65 = local19;
			}
			local17 = Static208.method3728(local52);
			local19 = Static208.method3728(local65);
			local52 = Static171.method3202(arg2, local52);
			local65 = Static171.method3202(arg2, local65);
			if (local65 != local52 && Character.toUpperCase(local52) != Character.toUpperCase(local65)) {
				local52 = Character.toLowerCase(local52);
				local65 = Character.toLowerCase(local65);
				if (local52 != local65) {
					return Static70.method1574(local52, arg2) - Static70.method1574(local65, arg2);
				}
			}
		}
		@Pc(127) int local127 = Math.min(local8, local11);
		for (@Pc(129) int local129 = 0; local129 < local127; local129++) {
			if (arg2 == 2) {
				local13 = local8 - local129 - 1;
				local15 = local11 - local129 - 1;
			} else {
				local15 = local129;
				local13 = local129;
			}
			@Pc(160) char local160 = arg0.charAt(local13);
			@Pc(164) char local164 = arg1.charAt(local15);
			if (local160 != local164 && Character.toUpperCase(local160) != Character.toUpperCase(local164)) {
				local160 = Character.toLowerCase(local160);
				local164 = Character.toLowerCase(local164);
				if (local164 != local160) {
					return Static70.method1574(local160, arg2) - Static70.method1574(local164, arg2);
				}
			}
		}
		@Pc(213) int local213 = local8 - local11;
		if (local213 != 0) {
			return local213;
		}
		for (@Pc(219) int local219 = 0; local219 < local127; local219++) {
			@Pc(225) char local225 = arg0.charAt(local219);
			@Pc(229) char local229 = arg1.charAt(local219);
			if (local229 != local225) {
				return Static70.method1574(local225, arg2) - Static70.method1574(local229, arg2);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(ILjava/awt/Component;)Lclient!ji;")
	public static Class97 method2860(@OriginalArg(1) Component arg0) {
		return new Class97_Sub1(arg0);
	}

	@OriginalMember(owner = "client!is", name = "e", descriptor = "(I)V")
	public static void method2861() {
		for (@Pc(3) int local3 = 0; local3 < Static95.anInt6378; local3++) {
			@Pc(9) int local9 = Static102.anIntArray217[local3];
			@Pc(13) Class62_Sub1_Sub2_Sub1 local13 = Static37.aClass62_Sub1_Sub2_Sub1Array1[local9];
			@Pc(17) int local17 = Static269.aClass2_Sub10_Sub1_3.method4421();
			if ((local17 & 0x2) != 0) {
				local17 += Static269.aClass2_Sub10_Sub1_3.method4421() << 8;
			}
			@Pc(40) int local40;
			@Pc(51) int local51;
			@Pc(85) int local85;
			if ((local17 & 0x8) != 0) {
				local40 = Static269.aClass2_Sub10_Sub1_3.method4413();
				if (local40 == 65535) {
					local40 = -1;
				}
				local51 = Static269.aClass2_Sub10_Sub1_3.method4416();
				@Pc(53) boolean local53 = true;
				@Pc(82) Class107 local82;
				if (local40 != -1 && local13.anInt5321 != -1) {
					@Pc(69) Class215 local69;
					if (local40 == local13.anInt5321) {
						local69 = Static44.method1076(local40);
						if (local69.aBoolean621 && local69.anInt6968 != -1) {
							local82 = Static212.method3773(local69.anInt6968);
							local85 = local82.anInt3273;
							if (local85 == 0) {
								local53 = false;
							} else if (local85 == 1) {
								local53 = true;
							} else if (local85 == 2) {
								local53 = false;
								local13.anInt5349 = 0;
							}
						}
					} else {
						local69 = Static44.method1076(local40);
						@Pc(122) Class215 local122 = Static44.method1076(local13.anInt5321);
						if (local69.anInt6968 != -1 && local122.anInt6968 != -1) {
							@Pc(137) Class107 local137 = Static212.method3773(local69.anInt6968);
							@Pc(142) Class107 local142 = Static212.method3773(local122.anInt6968);
							if (local142.anInt3287 > local137.anInt3287) {
								local53 = false;
							}
						}
					}
				}
				if (local53) {
					local13.anInt5316 = local51 >> 16;
					local13.anInt5356 = 0;
					local13.anInt5307 = 1;
					local13.anInt5321 = local40;
					local13.anInt5357 = (local51 & 0xFFFF) + Static212.anInt4090;
					local13.anInt5317 = 0;
					if (local13.anInt5357 > Static212.anInt4090) {
						local13.anInt5356 = -1;
					}
					if (local13.anInt5321 != -1 && local13.anInt5357 == Static212.anInt4090) {
						@Pc(208) int local208 = Static44.method1076(local13.anInt5321).anInt6968;
						if (local208 != -1) {
							local82 = Static212.method3773(local208);
							if (local82 != null && local82.anIntArray280 != null) {
								Static343.method5928(false, local82, local13.anInt5289, 0, local13.anInt5280);
							}
						}
					}
				}
			}
			if ((local17 & 0x40) != 0) {
				local40 = Static269.aClass2_Sub10_Sub1_3.method4441();
				local51 = Static269.aClass2_Sub10_Sub1_3.method4403();
				local13.method4772(local51, Static212.anInt4090, local40);
			}
			if ((local17 & 0x80) != 0) {
				local13.aString46 = Static269.aClass2_Sub10_Sub1_3.method4409();
				local13.anInt5340 = 100;
			}
			if ((local17 & 0x100) != 0) {
				local40 = Static269.aClass2_Sub10_Sub1_3.method4421();
				@Pc(276) int[] local276 = new int[local40];
				@Pc(279) int[] local279 = new int[local40];
				@Pc(282) int[] local282 = new int[local40];
				for (@Pc(284) int local284 = 0; local284 < local40; local284++) {
					local85 = Static269.aClass2_Sub10_Sub1_3.method4437();
					if (local85 == 65535) {
						local85 = -1;
					}
					local276[local284] = local85;
					local279[local284] = Static269.aClass2_Sub10_Sub1_3.method4421();
					local282[local284] = Static269.aClass2_Sub10_Sub1_3.method4432();
				}
				Static101.method2253(local282, local13, local276, local279);
			}
			if ((local17 & 0x400) != 0) {
				local13.anInt5323 = Static269.aClass2_Sub10_Sub1_3.method4437();
				local13.anInt5346 = Static269.aClass2_Sub10_Sub1_3.method4437();
			}
			if ((local17 & 0x4) != 0) {
				if (local13.aClass186_1.method5203()) {
					Static18.method667(local13);
				}
				local13.method4723(Static83.method1900(Static269.aClass2_Sub10_Sub1_3.method4464()));
				local13.method4782(local13.aClass186_1.anInt5977);
				local13.anInt5294 = local13.aClass186_1.anInt5947 << 3;
				if (local13.aClass186_1.method5203()) {
					Static52.method1200(local13, Static182.anInt3603, null, 0, local13.anIntArray396[0], null, local13.anIntArray397[0]);
				}
			}
			if ((local17 & 0x20) != 0) {
				local40 = Static269.aClass2_Sub10_Sub1_3.method4441();
				local51 = Static269.aClass2_Sub10_Sub1_3.method4422();
				local13.method4772(local51, Static212.anInt4090, local40);
				local13.anInt5301 = Static212.anInt4090 + 300;
				local13.anInt5334 = Static269.aClass2_Sub10_Sub1_3.method4403();
			}
			if ((local17 & 0x1) != 0) {
				local13.anInt5292 = Static269.aClass2_Sub10_Sub1_3.method4413();
				if (local13.anInt5292 == 65535) {
					local13.anInt5292 = -1;
				}
			}
			if ((local17 & 0x10) != 0) {
				local40 = Static269.aClass2_Sub10_Sub1_3.method4464();
				if (local40 == 65535) {
					local40 = -1;
				}
				local51 = Static269.aClass2_Sub10_Sub1_3.method4422();
				Static103.method2285(local51, local13, local40);
			}
			if ((local17 & 0x200) != 0) {
				local40 = Static269.aClass2_Sub10_Sub1_3.method4464();
				local13.anInt5335 = Static269.aClass2_Sub10_Sub1_3.method4414();
				local13.anInt5359 = Static269.aClass2_Sub10_Sub1_3.method4422();
				local13.anInt5312 = local40 & 0x7FFF;
				local13.aBoolean481 = (local40 & 0x8000) != 0;
				local13.anInt5314 = local13.anInt5312 + Static212.anInt4090 + local13.anInt5335;
			}
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method2862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		Static88.anInt1903 = arg2;
		Static328.anInt6644 = arg3;
		Static224.anInt4296 = arg0;
		Static243.anInt679 = arg1;
		Static311.anInt6287 = arg4;
		if (arg5 && Static243.anInt679 >= 100) {
			Static287.anInt5819 = Static311.anInt6287 * 128 + 64;
			Static290.anInt5837 = Static88.anInt1903 * 128 + 64;
			Static163.anInt1495 = Static138.method2745(Static182.anInt3603, Static287.anInt5819, Static290.anInt5837) - Static224.anInt4296;
		}
		Static182.anInt3602 = 2;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(BLclient!tq;Lclient!ae;)V")
	public static void method2863(@OriginalArg(1) Class191 arg0, @OriginalArg(2) Class4 arg1) {
		if (Static114.aBoolean579) {
			return;
		}
		arg1.method4283(0);
		Static304.aClass31_123 = arg1.method4214(Static361.method2360(arg0, Static301.anInt5012));
		Static304.aClass31_123.method4377((Static136.anInt2829 - Static304.aClass31_123.method4376()) / 2, (Static198.anInt3876 - Static304.aClass31_123.method4378()) / 2);
		Static26.aClass31_16 = arg1.method4214(Static361.method2360(arg0, Static340.anInt6746));
		Static26.aClass31_16.method4377((Static136.anInt2829 - Static26.aClass31_16.method4376()) / 2, 18);
		Static114.aBoolean579 = true;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IBILclient!fj;III)V")
	public static void method2864(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class62_Sub1_Sub2 arg2, @OriginalArg(5) int arg3) {
		Static43.method1051(arg2.anInt5289, arg2.anInt5280, arg3, 0, arg0, arg1);
	}
}
