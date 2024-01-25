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

public final class Static108 {

	@OriginalMember(owner = "client!gn", name = "h", descriptor = "[Lclient!vj;")
	public static Class58[] aClass58Array44;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "Lclient!lm;")
	public static final Class124 aClass124_2 = new Class124(64);

	@OriginalMember(owner = "client!gn", name = "g", descriptor = "Lclient!ub;")
	public static final Class198 aClass198_91 = new Class198(10);

	@OriginalMember(owner = "client!gn", name = "j", descriptor = "Lclient!dj;")
	public static Class43 aClass43_13 = new Class43(128);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(BILclient!cb;)V")
	public static void method2352(@OriginalArg(2) Class4_Sub11_Sub1 arg0) {
		while (true) {
			@Pc(18) Class4_Sub17 local18 = (Class4_Sub17) Static199.aClass116_35.method3270();
			if (local18 == null) {
				return;
			}
			@Pc(23) boolean local23 = false;
			for (@Pc(25) int local25 = 0; local25 < local18.anInt2443; local25++) {
				if (local18.aClass185Array2[local25] != null) {
					if (local18.aClass185Array2[local25].anInt5682 == 2) {
						local18.anIntArray211[local25] = -5;
					}
					if (local18.aClass185Array2[local25].anInt5682 == 0) {
						local23 = true;
					}
				}
				if (local18.aClass185Array1[local25] != null) {
					if (local18.aClass185Array1[local25].anInt5682 == 2) {
						local18.anIntArray211[local25] = -6;
					}
					if (local18.aClass185Array1[local25].anInt5682 == 0) {
						local23 = true;
					}
				}
			}
			if (local23) {
				return;
			}
			arg0.method706(142);
			arg0.method3434(0);
			@Pc(108) int local108 = arg0.anInt3768;
			arg0.method3452(local18.anInt2445);
			for (@Pc(115) int local115 = 0; local115 < local18.anInt2443; local115++) {
				if (local18.anIntArray211[local115] == 0) {
					try {
						@Pc(139) int local139 = local18.anIntArray210[local115];
						@Pc(154) Field local154;
						@Pc(157) int local157;
						if (local139 == 0) {
							local154 = (Field) local18.aClass185Array2[local115].anObject4;
							local157 = local154.getInt(null);
							arg0.method3434(0);
							arg0.method3452(local157);
						} else if (local139 == 1) {
							local154 = (Field) local18.aClass185Array2[local115].anObject4;
							local154.setInt(null, local18.anIntArray209[local115]);
							arg0.method3434(0);
						} else if (local139 == 2) {
							local154 = (Field) local18.aClass185Array2[local115].anObject4;
							local157 = local154.getModifiers();
							arg0.method3434(0);
							arg0.method3452(local157);
						}
						@Pc(218) Method local218;
						if (local139 == 3) {
							local218 = (Method) local18.aClass185Array1[local115].anObject4;
							@Pc(223) byte[][] local223 = local18.aByteArrayArrayArray7[local115];
							@Pc(227) Object[] local227 = new Object[local223.length];
							for (@Pc(229) int local229 = 0; local229 < local223.length; local229++) {
								@Pc(241) ObjectInputStream local241 = new ObjectInputStream(new ByteArrayInputStream(local223[local229]));
								local227[local229] = local241.readObject();
							}
							@Pc(256) Object local256 = local218.invoke(null, local227);
							if (local256 == null) {
								arg0.method3434(0);
							} else if (local256 instanceof Number) {
								arg0.method3434(1);
								arg0.method3435(((Number) local256).longValue());
							} else if (local256 instanceof String) {
								arg0.method3434(2);
								arg0.method3410((String) local256);
							} else {
								arg0.method3434(4);
							}
						} else if (local139 == 4) {
							local218 = (Method) local18.aClass185Array1[local115].anObject4;
							local157 = local218.getModifiers();
							arg0.method3434(0);
							arg0.method3452(local157);
						}
					} catch (@Pc(324) ClassNotFoundException local324) {
						arg0.method3434(-10);
					} catch (@Pc(330) InvalidClassException local330) {
						arg0.method3434(-11);
					} catch (@Pc(336) StreamCorruptedException local336) {
						arg0.method3434(-12);
					} catch (@Pc(342) OptionalDataException local342) {
						arg0.method3434(-13);
					} catch (@Pc(348) IllegalAccessException local348) {
						arg0.method3434(-14);
					} catch (@Pc(354) IllegalArgumentException local354) {
						arg0.method3434(-15);
					} catch (@Pc(360) InvocationTargetException local360) {
						arg0.method3434(-16);
					} catch (@Pc(366) SecurityException local366) {
						arg0.method3434(-17);
					} catch (@Pc(372) IOException local372) {
						arg0.method3434(-18);
					} catch (@Pc(378) NullPointerException local378) {
						arg0.method3434(-19);
					} catch (@Pc(384) Exception local384) {
						arg0.method3434(-20);
					} catch (@Pc(390) Throwable local390) {
						arg0.method3434(-21);
					}
				} else {
					arg0.method3434(local18.anIntArray211[local115]);
				}
			}
			arg0.method3437(local108);
			arg0.method3458(arg0.anInt3768 - local108);
			local18.method5687();
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIIII)V")
	public static void method2354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static149.anInt3929 = arg3;
		Static63.anInt1629 = arg0;
		Static23.anInt459 = arg4;
		Static30.anInt779 = arg1;
		Static124.anInt2958 = arg2;
		if (Static30.anInt779 >= 100) {
			@Pc(29) int local29 = Static63.anInt1629 * 128 + 64;
			@Pc(35) int local35 = Static124.anInt2958 * 128 + 64;
			@Pc(44) int local44 = Static81.method2010(Static12.anInt267, local35, local29) - Static149.anInt3929;
			@Pc(49) int local49 = local29 - Static240.anInt4829;
			@Pc(54) int local54 = local44 - Static112.anInt2705;
			@Pc(59) int local59 = local35 - Static129.anInt3039;
			@Pc(70) int local70 = (int) Math.sqrt((double) (local59 * local59 + local49 * local49));
			Static337.anInt6445 = (int) (Math.atan2((double) local54, (double) local70) * 2607.5945876176133D) & 0x3FFF;
			Static217.anInt4437 = (int) (-2607.5945876176133D * Math.atan2((double) local49, (double) local59)) & 0x3FFF;
			Static80.anInt2124 = 0;
			if (Static337.anInt6445 < 1024) {
				Static337.anInt6445 = 1024;
			}
			if (Static337.anInt6445 > 3072) {
				Static337.anInt6445 = 3072;
			}
		}
		Static353.anInt2640 = 2;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIIIBI)V")
	public static void method2355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg3 - arg4;
		@Pc(19) int local19 = arg4 + arg2;
		for (@Pc(21) int local21 = arg2; local21 < local19; local21++) {
			Static135.method2878(Static223.anIntArrayArray124[local21], arg5, arg0, arg1);
		}
		@Pc(43) int local43 = arg5 - arg4;
		@Pc(47) int local47 = arg1 + arg4;
		for (@Pc(49) int local49 = arg3; local49 > local10; local49--) {
			Static135.method2878(Static223.anIntArrayArray124[local49], arg5, arg0, arg1);
		}
		for (@Pc(69) int local69 = local19; local69 <= local10; local69++) {
			@Pc(75) int[] local75 = Static223.anIntArrayArray124[local69];
			Static135.method2878(local75, local47, arg0, arg1);
			Static135.method2878(local75, arg5, arg0, local43);
		}
	}
}
