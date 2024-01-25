import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!ll", name = "N", descriptor = "I")
	public static int anInt4521;

	@OriginalMember(owner = "client!ll", name = "L", descriptor = "I")
	public static int anInt4519 = 0;

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "(I)V")
	public static void method3682() {
		if (Static112.aBoolean440) {
			Static267.aClass22_13 = null;
			Static367.aClass22_18 = null;
			Static112.aBoolean440 = false;
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIILclient!wt;Lclient!mv;)V")
	public static void method3683(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub2_Sub2 arg2, @OriginalArg(4) Class1_Sub3_Sub3_Sub1 arg3) {
		@Pc(5) byte local5 = -1;
		if ((arg1 & 0x20000) != 0) {
			arg3.aByte79 = arg2.method6049();
			arg3.aByte82 = arg2.method6050();
			arg3.aByte80 = arg2.method6049();
			arg3.aByte81 = (byte) arg2.method5997();
			arg3.anInt6116 = Static290.anInt5325 + arg2.method6041();
			arg3.anInt6103 = Static290.anInt5325 + arg2.method6004();
		}
		if ((arg1 & 0x200) != 0) {
			arg3.aBoolean364 = arg2.method6044() == 1;
		}
		@Pc(70) int local70;
		@Pc(81) int local81;
		@Pc(85) int local85;
		if ((arg1 & 0x10000) != 0) {
			local70 = arg2.method6003();
			if (local70 == 65535) {
				local70 = -1;
			}
			local81 = arg2.method6051();
			local85 = arg2.method6013();
			arg3.method4834(true, local81, local70, local85);
		}
		if ((arg1 & 0x2000) != 0) {
			local70 = arg2.method6041();
			local81 = arg2.method6025();
			if (local70 == 65535) {
				local70 = -1;
			}
			local85 = arg2.method6044();
			arg3.method4834(false, local81, local70, local85);
		}
		if ((arg1 & 0x40000) != 0) {
			local70 = arg2.method6013();
			@Pc(133) int[] local133 = new int[local70];
			@Pc(136) int[] local136 = new int[local70];
			@Pc(139) int[] local139 = new int[local70];
			for (@Pc(141) int local141 = 0; local141 < local70; local141++) {
				@Pc(146) int local146 = arg2.method6003();
				if (local146 == 65535) {
					local146 = -1;
				}
				local133[local141] = local146;
				local136[local141] = arg2.method5997();
				local139[local141] = arg2.method6041();
			}
			Static372.method1265(arg3, local136, local139, local133);
		}
		if ((arg1 & 0x20) != 0) {
			local70 = arg2.method6041();
			if (local70 == 65535) {
				local70 = -1;
			}
			local81 = arg2.method6053();
			Static51.method1064(local81, local70, arg3);
		}
		if ((arg1 & 0x10) != 0) {
			local70 = arg2.method6003();
			local81 = arg2.method6053();
			local85 = arg2.method6044();
			@Pc(230) int local230 = arg2.anInt7620;
			@Pc(238) boolean local238 = (local70 & 0x8000) != 0;
			if (arg3.aString47 != null && arg3.aClass8_1 != null) {
				@Pc(246) boolean local246 = false;
				if (local81 <= 1) {
					if (!local238 && (Static269.aBoolean373 && !Static268.aBoolean372 || Static413.aBoolean307)) {
						local246 = true;
					} else if (Static55.method1113(arg3.aString47)) {
						local246 = true;
					}
				}
				if (!local246 && Static343.anInt6238 == 0) {
					Static87.aClass3_Sub2_7.anInt7620 = 0;
					arg2.method6009(Static87.aClass3_Sub2_7.aByteArray95, local85);
					Static87.aClass3_Sub2_7.anInt7620 = 0;
					@Pc(288) int local288 = -1;
					@Pc(307) String local307;
					if (local238) {
						local70 &= 0x7FFF;
						@Pc(298) Class204 local298 = Static299.method4438(Static87.aClass3_Sub2_7);
						local288 = local298.anInt6332;
						local307 = local298.aClass3_Sub3_Sub18_1.method4657(Static87.aClass3_Sub2_7);
					} else {
						local307 = Static80.method1411(Static248.method3803(Static87.aClass3_Sub2_7));
					}
					arg3.aString57 = local307.trim();
					arg3.anInt6125 = local70 & 0xFF;
					arg3.anInt6119 = 150;
					arg3.anInt6110 = local70 >> 8;
					@Pc(345) int local345;
					if (local81 == 1 || local81 == 2) {
						local345 = local238 ? 17 : 1;
					} else {
						local345 = local238 ? 17 : 2;
					}
					if (local81 == 2) {
						Static157.method2729(local307, "<img=1>" + arg3.method3930(), null, local345, 0, local288, "<img=1>" + arg3.method3935());
					} else if (local81 == 1) {
						Static157.method2729(local307, "<img=0>" + arg3.method3930(), null, local345, 0, local288, "<img=0>" + arg3.method3935());
					} else {
						Static157.method2729(local307, arg3.method3930(), null, local345, 0, local288, arg3.method3935());
					}
				}
			}
			arg2.anInt7620 = local230 + local85;
		}
		if ((arg1 & 0x1) != 0) {
			Static365.aByteArray71[arg0] = arg2.method6011();
		}
		if ((arg1 & 0x1000) != 0) {
			local5 = arg2.method6050();
		}
		if ((arg1 & 0x4) != 0) {
			local70 = arg2.method6040();
			local81 = arg2.method6013();
			arg3.method4843(local70, Static290.anInt5325, local81);
			arg3.anInt6059 = Static290.anInt5325 + 300;
			arg3.anInt6099 = arg2.method6044();
		}
		if ((arg1 & 0x2) != 0) {
			local70 = arg2.method6044();
			@Pc(500) byte[] local500 = new byte[local70];
			@Pc(505) Class3_Sub2 local505 = new Class3_Sub2(local500);
			arg2.method6032(local500, local70);
			Static319.aClass3_Sub2Array1[arg0] = local505;
			arg3.method3934(local505);
		}
		if ((arg1 & 0x4000) != 0) {
			arg3.aString57 = arg2.method6027();
			if (arg3.aString57.charAt(0) == '~') {
				arg3.aString57 = arg3.aString57.substring(1);
				Static304.method4490(arg3.method3930(), arg3.method3935(), 0, 2, arg3.aString57);
			} else if (Static113.aClass1_Sub3_Sub3_Sub1_4 == arg3) {
				Static304.method4490(arg3.method3930(), arg3.method3935(), 0, 2, arg3.aString57);
			}
			arg3.anInt6125 = 0;
			arg3.anInt6119 = 150;
			arg3.anInt6110 = 0;
		}
		if ((arg1 & 0x80) != 0) {
			local70 = arg2.method6006();
			if (local70 == 65535) {
				local70 = -1;
			}
			arg3.anInt6102 = local70;
		}
		if ((arg1 & 0x400) != 0) {
			local70 = Static290.anInt5325;
			local81 = arg2.method6040();
			local85 = arg2.method6013();
			arg3.method4843(local81, local70, local85);
		}
		if ((arg1 & 0x8000) != 0) {
			arg3.anInt6065 = arg2.method6050();
			arg3.anInt6061 = arg2.method6048();
			arg3.anInt6071 = arg2.method6050();
			arg3.anInt6085 = arg2.method6049();
			arg3.anInt6123 = arg2.method6003() + Static290.anInt5325;
			arg3.anInt6108 = arg2.method6041() + Static290.anInt5325;
			arg3.anInt6089 = arg2.method6053();
			if (arg3.aBoolean365) {
				arg3.anInt6085 += arg3.anInt4885;
				arg3.anInt6133 = 0;
				arg3.anInt6065 += arg3.anInt4899;
				arg3.anInt6061 += arg3.anInt4885;
				arg3.anInt6071 += arg3.anInt4899;
			} else {
				arg3.anInt6085 += arg3.anIntArray454[0];
				arg3.anInt6071 += arg3.anIntArray453[0];
				arg3.anInt6133 = 1;
				arg3.anInt6061 += arg3.anIntArray454[0];
				arg3.anInt6065 += arg3.anIntArray453[0];
			}
			arg3.anInt6136 = 0;
		}
		if ((arg1 & 0x40) != 0) {
			arg3.anInt4909 = arg2.method6004();
			if (arg3.anInt6133 == 0) {
				arg3.method4830(arg3.anInt4909);
				arg3.anInt4909 = -1;
			}
		}
		if ((arg1 & 0x800) != 0) {
			local70 = arg2.method6004();
			arg3.anInt6097 = arg2.method6044();
			arg3.anInt6107 = arg2.method6053();
			arg3.anInt6109 = local70 & 0x7FFF;
			arg3.aBoolean428 = (local70 & 0x8000) != 0;
			arg3.anInt6112 = Static290.anInt5325 + arg3.anInt6109 + arg3.anInt6097;
		}
		if (!arg3.aBoolean365) {
			return;
		}
		if (local5 == 127) {
			arg3.method3933(arg3.anInt4899, arg3.anInt4885);
			return;
		}
		@Pc(837) byte local837;
		if (local5 == -1) {
			local837 = Static365.aByteArray71[arg0];
		} else {
			local837 = local5;
		}
		arg3.method3927(local837, arg3.anInt4885, arg3.anInt4899);
	}

	@OriginalMember(owner = "client!ll", name = "h", descriptor = "(B)V")
	public static void method3684() {
		for (@Pc(18) Class3_Sub3_Sub14 local18 = (Class3_Sub3_Sub14) Static324.aClass229_4.method5328(); local18 != null; local18 = (Class3_Sub3_Sub14) Static324.aClass229_4.method5325()) {
			@Pc(23) Class1_Sub3_Sub4 local23 = local18.aClass1_Sub3_Sub4_1;
			if (local23.aBoolean355) {
				local18.method5987();
				local23.method3828();
			} else if (Static290.anInt5325 >= local23.anInt4695) {
				local23.method3829(Static429.anInt7317);
				if (local23.aBoolean355) {
					local18.method5987();
				} else {
					Static199.method3242(local23, true);
				}
			}
		}
	}
}
