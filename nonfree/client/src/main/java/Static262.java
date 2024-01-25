import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BLclient!hq;I)V")
	public static void method3938(@OriginalArg(1) Class2_Sub20_Sub1 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(14) Class2_Sub36 local14 = (Class2_Sub36) Static201.aClass265_30.method6005();
			if (local14 == null) {
				return;
			}
			@Pc(19) boolean local19 = false;
			for (@Pc(21) int local21 = 0; local21 < local14.anInt6098; local21++) {
				if (local14.aClass128Array2[local21] != null) {
					if (local14.aClass128Array2[local21].anInt3727 == 2) {
						local14.anIntArray409[local21] = -5;
					}
					if (local14.aClass128Array2[local21].anInt3727 == 0) {
						local19 = true;
					}
				}
				if (local14.aClass128Array1[local21] != null) {
					if (local14.aClass128Array1[local21].anInt3727 == 2) {
						local14.anIntArray409[local21] = -6;
					}
					if (local14.aClass128Array1[local21].anInt3727 == 0) {
						local19 = true;
					}
				}
			}
			if (local19) {
				return;
			}
			arg0.method2498(arg1);
			arg0.method3699(0);
			@Pc(102) int local102 = arg0.anInt4608;
			arg0.method3713(local14.anInt6099);
			for (@Pc(109) int local109 = 0; local109 < local14.anInt6098; local109++) {
				if (local14.anIntArray409[local109] == 0) {
					try {
						@Pc(130) int local130 = local14.anIntArray410[local109];
						@Pc(147) Field local147;
						@Pc(175) int local175;
						if (local130 == 0) {
							local147 = (Field) local14.aClass128Array2[local109].anObject4;
							local175 = local147.getInt(null);
							arg0.method3699(0);
							arg0.method3713(local175);
						} else if (local130 == 1) {
							local147 = (Field) local14.aClass128Array2[local109].anObject4;
							local147.setInt(null, local14.anIntArray408[local109]);
							arg0.method3699(0);
						} else if (local130 == 2) {
							local147 = (Field) local14.aClass128Array2[local109].anObject4;
							local175 = local147.getModifiers();
							arg0.method3699(0);
							arg0.method3713(local175);
						}
						@Pc(221) Method local221;
						if (local130 == 3) {
							local221 = (Method) local14.aClass128Array1[local109].anObject4;
							@Pc(246) byte[][] local246 = local14.aByteArrayArrayArray15[local109];
							@Pc(250) Object[] local250 = new Object[local246.length];
							for (@Pc(252) int local252 = 0; local252 < local246.length; local252++) {
								@Pc(264) ObjectInputStream local264 = new ObjectInputStream(new ByteArrayInputStream(local246[local252]));
								local250[local252] = local264.readObject();
							}
							@Pc(279) Object local279 = local221.invoke(null, local250);
							if (local279 == null) {
								arg0.method3699(0);
							} else if (local279 instanceof Number) {
								arg0.method3699(1);
								arg0.method3692(((Number) local279).longValue());
							} else if (local279 instanceof String) {
								arg0.method3699(2);
								arg0.method3715((String) local279);
							} else {
								arg0.method3699(4);
							}
						} else if (local130 == 4) {
							local221 = (Method) local14.aClass128Array1[local109].anObject4;
							local175 = local221.getModifiers();
							arg0.method3699(0);
							arg0.method3713(local175);
						}
					} catch (@Pc(322) ClassNotFoundException local322) {
						arg0.method3699(-10);
					} catch (@Pc(328) InvalidClassException local328) {
						arg0.method3699(-11);
					} catch (@Pc(334) StreamCorruptedException local334) {
						arg0.method3699(-12);
					} catch (@Pc(340) OptionalDataException local340) {
						arg0.method3699(-13);
					} catch (@Pc(346) IllegalAccessException local346) {
						arg0.method3699(-14);
					} catch (@Pc(352) IllegalArgumentException local352) {
						arg0.method3699(-15);
					} catch (@Pc(358) InvocationTargetException local358) {
						arg0.method3699(-16);
					} catch (@Pc(364) SecurityException local364) {
						arg0.method3699(-17);
					} catch (@Pc(370) IOException local370) {
						arg0.method3699(-18);
					} catch (@Pc(376) NullPointerException local376) {
						arg0.method3699(-19);
					} catch (@Pc(382) Exception local382) {
						arg0.method3699(-20);
					} catch (@Pc(388) Throwable local388) {
						arg0.method3699(-21);
					}
				} else {
					arg0.method3699(local14.anIntArray409[local109]);
				}
			}
			arg0.method3733(local102);
			arg0.method3709(arg0.anInt4608 - local102);
			local14.method6072();
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIII)I")
	public static int method3939(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static430.anInt7475 < 100) {
			return -2;
		}
		@Pc(12) int local12 = -2;
		@Pc(19) int local19 = Integer.MAX_VALUE;
		@Pc(24) int local24 = arg2 - Static169.anInt3161;
		@Pc(28) int local28 = arg1 - Static169.anInt3159;
		for (@Pc(33) Class2_Sub38 local33 = (Class2_Sub38) Static169.aClass265_27.method6005(); local33 != null; local33 = (Class2_Sub38) Static169.aClass265_27.method6001()) {
			if (local33.anInt6772 == arg0) {
				@Pc(42) int local42 = local33.anInt6767;
				@Pc(45) int local45 = local33.anInt6760;
				@Pc(57) int local57 = local45 + Static169.anInt3159 | local42 - -Static169.anInt3161 << 14;
				@Pc(78) int local78 = (local24 - local42) * (-local42 + local24) + (local28 - local45) * (local28 + -local45);
				if (local12 < 0 || local19 > local78) {
					local19 = local78;
					local12 = local57;
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIIII)V")
	public static void method3940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static374.method5252(arg0);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg0 - arg3;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(23) int local23 = arg0;
		@Pc(34) int local34 = -arg0;
		@Pc(36) int local36 = local14;
		@Pc(39) int local39 = -local14;
		@Pc(41) int local41 = -1;
		@Pc(43) int local43 = -1;
		@Pc(62) int local62;
		@Pc(70) int local70;
		@Pc(79) int local79;
		@Pc(87) int local87;
		if (Static75.anInt1858 <= arg4 && Static175.anInt3399 >= arg4) {
			@Pc(53) int[] local53 = Static277.anIntArrayArray40[arg4];
			local62 = Static440.method5950(arg1 - arg0, Static351.anInt6176, Static331.anInt5894);
			local70 = Static440.method5950(arg0 + arg1, Static351.anInt6176, Static331.anInt5894);
			local79 = Static440.method5950(arg1 - local14, Static351.anInt6176, Static331.anInt5894);
			local87 = Static440.method5950(local14 + arg1, Static351.anInt6176, Static331.anInt5894);
			Static49.method990(local53, local79, local62, arg2);
			Static49.method990(local53, local87, local79, arg5);
			Static49.method990(local53, local70, local87, arg2);
		}
		while (local23 > local10) {
			local41 += 2;
			local43 += 2;
			local34 += local41;
			local39 += local43;
			if (local39 >= 0 && local36 >= 1) {
				local36--;
				Static447.anIntArray321[local36] = local10;
				local39 -= local36 << 1;
			}
			local10++;
			@Pc(246) int local246;
			@Pc(255) int local255;
			@Pc(266) int[] local266;
			@Pc(153) int local153;
			if (local34 >= 0) {
				local23--;
				local34 -= local23 << 1;
				local153 = arg4 - local23;
				local62 = arg4 + local23;
				if (Static75.anInt1858 <= local62 && local153 <= Static175.anInt3399) {
					if (local14 <= local23) {
						local70 = Static440.method5950(arg1 + local10, Static351.anInt6176, Static331.anInt5894);
						local79 = Static440.method5950(arg1 - local10, Static351.anInt6176, Static331.anInt5894);
						if (Static175.anInt3399 >= local62) {
							Static49.method990(Static277.anIntArrayArray40[local62], local70, local79, arg2);
						}
						if (Static75.anInt1858 <= local153) {
							Static49.method990(Static277.anIntArrayArray40[local153], local70, local79, arg2);
						}
					} else {
						local70 = Static447.anIntArray321[local23];
						local79 = Static440.method5950(local10 + arg1, Static351.anInt6176, Static331.anInt5894);
						local87 = Static440.method5950(arg1 - local10, Static351.anInt6176, Static331.anInt5894);
						local246 = Static440.method5950(arg1 + local70, Static351.anInt6176, Static331.anInt5894);
						local255 = Static440.method5950(arg1 - local70, Static351.anInt6176, Static331.anInt5894);
						if (local62 <= Static175.anInt3399) {
							local266 = Static277.anIntArrayArray40[local62];
							Static49.method990(local266, local255, local87, arg2);
							Static49.method990(local266, local246, local255, arg5);
							Static49.method990(local266, local79, local246, arg2);
						}
						if (local153 >= Static75.anInt1858) {
							local266 = Static277.anIntArrayArray40[local153];
							Static49.method990(local266, local255, local87, arg2);
							Static49.method990(local266, local246, local255, arg5);
							Static49.method990(local266, local79, local246, arg2);
						}
					}
				}
			}
			local153 = arg4 - local10;
			local62 = local10 + arg4;
			if (Static75.anInt1858 <= local62 && Static175.anInt3399 >= local153) {
				local70 = arg1 + local23;
				local79 = arg1 - local23;
				if (local70 >= Static331.anInt5894 && local79 <= Static351.anInt6176) {
					local70 = Static440.method5950(local70, Static351.anInt6176, Static331.anInt5894);
					local79 = Static440.method5950(local79, Static351.anInt6176, Static331.anInt5894);
					if (local14 <= local10) {
						if (local62 <= Static175.anInt3399) {
							Static49.method990(Static277.anIntArrayArray40[local62], local70, local79, arg2);
						}
						if (local153 >= Static75.anInt1858) {
							Static49.method990(Static277.anIntArrayArray40[local153], local70, local79, arg2);
						}
					} else {
						local87 = local36 >= local10 ? local36 : Static447.anIntArray321[local10];
						local246 = Static440.method5950(arg1 + local87, Static351.anInt6176, Static331.anInt5894);
						local255 = Static440.method5950(arg1 - local87, Static351.anInt6176, Static331.anInt5894);
						if (Static175.anInt3399 >= local62) {
							local266 = Static277.anIntArrayArray40[local62];
							Static49.method990(local266, local255, local79, arg2);
							Static49.method990(local266, local246, local255, arg5);
							Static49.method990(local266, local70, local246, arg2);
						}
						if (local153 >= Static75.anInt1858) {
							local266 = Static277.anIntArrayArray40[local153];
							Static49.method990(local266, local255, local79, arg2);
							Static49.method990(local266, local246, local255, arg5);
							Static49.method990(local266, local70, local246, arg2);
						}
					}
				}
			}
		}
	}
}
