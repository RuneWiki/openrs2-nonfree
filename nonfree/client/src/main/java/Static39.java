import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bt", name = "L", descriptor = "Lclient!ya;")
	public static Class135 aClass135_1;

	@OriginalMember(owner = "client!bt", name = "G", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_30 = new Class56(0, -1);

	@OriginalMember(owner = "client!bt", name = "O", descriptor = "Lclient!ni;")
	public static final Class178 aClass178_7 = new Class178("WTI", 5);

	@OriginalMember(owner = "client!bt", name = "Q", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_31 = new Class56(71, -2);

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BILjava/lang/String;)V")
	public static void method542(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		Static448.method5935(Static68.aClass146_26);
		Static247.aClass4_Sub9_Sub2_2.method4999(Static109.method5003(arg1) + 1);
		Static247.aClass4_Sub9_Sub2_2.method4999(arg0);
		Static247.aClass4_Sub9_Sub2_2.method5039(arg1);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIII)V")
	public static void method543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static169.anIntArrayArray37 != null) {
			Static169.anIntArrayArray37[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static240.aShortArrayArray4 != null) {
			Static240.aShortArrayArray4[arg0][arg1] = (short) arg3;
		}
		if (Static436.aByteArrayArray19 != null) {
			Static436.aByteArrayArray19[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIB)I")
	public static int method544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 >= arg1) {
			return arg0 > arg2 ? arg2 : arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(B)V")
	public static void method545() {
		for (@Pc(14) Class4_Sub3 local14 = (Class4_Sub3) Static297.aClass244_26.method5263(); local14 != null; local14 = (Class4_Sub3) Static297.aClass244_26.method5271()) {
			if (Static432.aClass75ArrayArrayArray6 == null) {
				local14.method6059();
			} else {
				@Pc(36) int local36;
				@Pc(57) Class8_Sub4 local57;
				@Pc(70) Class8_Sub4_Sub2 local70;
				@Pc(100) Class8_Sub3 local100;
				@Pc(139) Class8_Sub5 local139;
				@Pc(175) Class8_Sub2 local175;
				@Pc(152) Class8_Sub5_Sub1 local152;
				@Pc(188) Class8_Sub2_Sub3 local188;
				if (Static265.anInt4371 >= local14.anInt156) {
					local36 = Static33.anIntArray43[local14.anInt147];
					if (local36 == 0) {
						local175 = Static14.method170(local14.anInt155, local14.anInt149, local14.anInt150);
						if (local175 instanceof Class8_Sub2_Sub3) {
							Static72.method1176(local14.anInt155, local14.anInt149, local14.anInt150);
							local188 = (Class8_Sub2_Sub3) local175;
							if (local188.aClass8_Sub2_3 != null) {
								Static380.method4987(local14.anInt155, local14.anInt149, local14.anInt150, local188.aClass8_Sub2_3, null);
							}
						}
					} else if (local36 == 1) {
						local139 = Static169.method2325(local14.anInt155, local14.anInt149, local14.anInt150);
						if (local139 instanceof Class8_Sub5_Sub1) {
							Static44.method583(local14.anInt155, local14.anInt149, local14.anInt150);
							local152 = (Class8_Sub5_Sub1) local139;
							if (local152.aClass8_Sub5_3 != null) {
								Static3.method36(local14.anInt155, local14.anInt149, local14.anInt150, local152.aClass8_Sub5_3, null);
							}
						}
					} else if (local36 == 2) {
						local100 = Static64.method926(local14.anInt155, local14.anInt149, local14.anInt150, fw.class);
						if (local100 instanceof Class8_Sub3_Sub3) {
							Static218.method2968(local14.anInt155, local14.anInt149, local14.anInt150, fw.class);
							@Pc(121) Class8_Sub3_Sub3 local121 = (Class8_Sub3_Sub3) local100;
							if (local121.aClass8_Sub3_1 != null) {
								Static160.method3989(local121.aClass8_Sub3_1, false);
							}
						}
					} else if (local36 == 3) {
						local57 = Static190.method2771(local14.anInt155, local14.anInt149, local14.anInt150);
						if (local57 instanceof Class8_Sub4_Sub2) {
							Static426.method3626(local14.anInt155, local14.anInt149, local14.anInt150);
							local70 = (Class8_Sub4_Sub2) local57;
							if (local70.aClass8_Sub4_2 != null) {
								Static276.method3664(local14.anInt155, local14.anInt149, local14.anInt150, local70.aClass8_Sub4_2);
							}
						}
					}
					local14.method6059();
				} else if (Static265.anInt4371 == local14.anInt157) {
					local36 = Static33.anIntArray43[local14.anInt147];
					if (local36 == 0) {
						local175 = Static14.method170(local14.anInt155, local14.anInt149, local14.anInt150);
						if (local175 instanceof Class8_Sub2_Sub3) {
							local14.method6059();
						} else if (Static298.method3888(local14.anInt155, local14.anInt149, local14.anInt150) == null) {
							local188 = new Class8_Sub2_Sub3(local14.anInt147, local14.anInt146, local14.anInt153, local14.anInt148, local14.anInt152, local175);
							Static380.method4987(local14.anInt155, local14.anInt149, local14.anInt150, local188, null);
						} else {
							local14.method6059();
						}
					} else if (local36 == 1) {
						local139 = Static169.method2325(local14.anInt155, local14.anInt149, local14.anInt150);
						if (local139 instanceof Class8_Sub5_Sub1) {
							local14.method6059();
						} else if (Static351.method4659(local14.anInt155, local14.anInt149, local14.anInt150) == null) {
							local152 = new Class8_Sub5_Sub1(local14.anInt147, local14.anInt146, local14.anInt153, local14.anInt148, local14.anInt152, local139);
							Static3.method36(local14.anInt155, local14.anInt149, local14.anInt150, local152, null);
						} else {
							local14.method6059();
						}
					} else if (local36 == 2) {
						local100 = Static64.method926(local14.anInt155, local14.anInt149, local14.anInt150, fw.class);
						if (local100 instanceof Class8_Sub3_Sub3) {
							local14.method6059();
						} else {
							Static218.method2968(local14.anInt155, local14.anInt149, local14.anInt150, fw.class);
							@Pc(330) Class114 local330 = Static51.aClass151_1.method2917(local14.anInt158);
							@Pc(341) int local341;
							@Pc(344) int local344;
							if (local14.anInt146 == 1 || local14.anInt146 == 3) {
								local344 = local330.anInt2851;
								local341 = local330.anInt2857;
							} else {
								local341 = local330.anInt2851;
								local344 = local330.anInt2857;
							}
							@Pc(385) Class8_Sub3_Sub3 local385 = new Class8_Sub3_Sub3(local14.anInt147, local14.anInt146, local14.anInt155, local14.anInt153, local14.anInt148, local14.anInt152, local14.anInt149, local341 + local14.anInt149 - 1, local14.anInt150, local344 + local14.anInt150 - 1, local100);
							Static160.method3989(local385, false);
						}
					} else if (local36 == 3) {
						local57 = Static190.method2771(local14.anInt155, local14.anInt149, local14.anInt150);
						if (local57 instanceof Class8_Sub4_Sub2) {
							local14.method6059();
						} else {
							local70 = new Class8_Sub4_Sub2(local14.anInt153, local14.anInt148, local14.anInt152, local57);
							Static276.method3664(local14.anInt155, local14.anInt149, local14.anInt150, local70);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BIII)V")
	public static void method546(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static432.aClass75ArrayArrayArray6 == null) {
			return;
		}
		@Pc(27) long local27 = (long) (arg2 << 14 | arg1 << 28 | arg0);
		@Pc(35) Class4_Sub6 local35 = (Class4_Sub6) Static41.aClass67_2.method1429(local27);
		if (local35 == null) {
			Static411.method5584(arg1, arg0, arg2);
			return;
		}
		@Pc(49) Class4_Sub36 local49 = (Class4_Sub36) local35.aClass244_3.method5263();
		if (local49 == null) {
			Static411.method5584(arg1, arg0, arg2);
			return;
		}
		@Pc(63) Class8_Sub1_Sub1 local63 = (Class8_Sub1_Sub1) Static411.method5584(arg1, arg0, arg2);
		if (local63 == null) {
			local63 = new Class8_Sub1_Sub1();
		} else {
			local63.anInt4934 = local63.anInt4930 = -1;
		}
		local63.anInt4929 = local49.anInt5280;
		local63.anInt4935 = local49.anInt5276;
		label44: while (true) {
			@Pc(91) Class4_Sub36 local91 = (Class4_Sub36) local35.aClass244_3.method5271();
			if (local91 == null) {
				break;
			}
			if (local63.anInt4935 != local91.anInt5276) {
				local63.anInt4934 = local91.anInt5276;
				local63.anInt4931 = local91.anInt5280;
				while (true) {
					@Pc(112) Class4_Sub36 local112 = (Class4_Sub36) local35.aClass244_3.method5271();
					if (local112 == null) {
						break label44;
					}
					if (local63.anInt4935 != local112.anInt5276 && local63.anInt4934 != local112.anInt5276) {
						local63.anInt4932 = local112.anInt5280;
						local63.anInt4930 = local112.anInt5276;
					}
				}
			}
		}
		@Pc(156) int local156 = Static94.method4425((arg2 << 7) + 64, arg1, (arg0 << 7) + 64);
		Static25.method341(arg1, arg0, arg2, local156, local63);
	}
}
