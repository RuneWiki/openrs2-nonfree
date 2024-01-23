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

public final class Static14 {

	@OriginalMember(owner = "client!an", name = "u", descriptor = "Lclient!rn;")
	public static Class155 aClass155_11;

	@OriginalMember(owner = "client!an", name = "G", descriptor = "[S")
	public static short[] aShortArray3;

	@OriginalMember(owner = "client!an", name = "Q", descriptor = "Z")
	public static boolean aBoolean22 = false;

	@OriginalMember(owner = "client!an", name = "T", descriptor = "J")
	public static long aLong8 = 0L;

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(III)I")
	public static int method222(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 + arg0 * 57;
		@Pc(16) int local16 = local10 ^ local10 << 13;
		@Pc(35) int local35 = Integer.MAX_VALUE & local16 * (local16 * local16 * 15731 + 789221) + 1376312589;
		return local35 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(BD)V")
	public static void method224(@OriginalArg(1) double arg0) {
		if (arg0 == Static49.aDouble1) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 256; local16++) {
			@Pc(31) int local31 = (int) (Math.pow((double) local16 / 255.0D, arg0) * 255.0D);
			Static163.anIntArray352[local16] = local31 > 255 ? 255 : local31;
		}
		Static49.aDouble1 = arg0;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(II)V")
	public static void method225() {
		Static157.aClass98_24.method2565(5);
		Static148.aClass98_20.method2565(5);
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIILclient!nn;)V")
	public static void method227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class124 arg3) {
		if (Static152.anInt2876 >= 400) {
			return;
		}
		if (arg3.anIntArray432 != null) {
			arg3 = arg3.method3191();
		}
		if (arg3 == null || !arg3.aBoolean271) {
			return;
		}
		@Pc(28) String local28 = arg3.aString132;
		if (arg3.anInt3784 != 0) {
			@Pc(44) String local44 = Static47.anInt5990 == 1 ? Static148.aString102 : Static3.aString3;
			local28 = local28 + Static82.method1264(Static136.aClass10_Sub5_Sub1_1.anInt3590, arg3.anInt3784) + " (" + local44 + arg3.anInt3784 + ")";
		}
		if (Static153.anInt2895 == 1) {
			Static167.method2784((short) 1, Static246.aString173 + " -> <col=ffff00>" + local28, arg0, Static270.anInt5516, Static149.aString103, (long) arg1, arg2);
		} else if (Static39.aBoolean56) {
			@Pc(85) Class3_Sub4_Sub6 local85 = Static78.anInt1479 == -1 ? null : Static6.method109(Static78.anInt1479);
			if ((Static75.anInt1408 & 0x2) != 0 && (local85 == null || arg3.method3188(local85.anInt1108, Static78.anInt1479) != local85.anInt1108)) {
				Static167.method2784((short) 37, Static286.aString205 + " -> <col=ffff00>" + local28, arg0, Static269.anInt5498, Static26.aString14, (long) arg1, arg2);
			}
		} else {
			@Pc(140) String[] local140 = arg3.aStringArray26;
			if (Static208.aBoolean293) {
				local140 = Static113.method1828(local140);
			}
			@Pc(154) int local154;
			if (local140 != null) {
				for (local154 = 4; local154 >= 0; local154--) {
					if (local140[local154] != null && (Static47.anInt5990 != 0 || !local140[local154].equalsIgnoreCase(Static108.aString79))) {
						@Pc(175) int local175 = -1;
						if (local154 == arg3.anInt3762) {
							local175 = arg3.anInt3782;
						}
						@Pc(188) byte local188 = 0;
						if (local154 == 0) {
							local188 = 6;
						}
						if (local154 == 1) {
							local188 = 31;
						}
						if (local154 == arg3.anInt3790) {
							local175 = arg3.anInt3763;
						}
						if (local154 == 2) {
							local188 = 30;
						}
						if (local154 == 3) {
							local188 = 59;
						}
						if (local154 == 4) {
							local188 = 10;
						}
						Static167.method2784(local188, "<col=ffff00>" + local28, arg0, local175, local140[local154], (long) arg1, arg2);
					}
				}
			}
			if (Static47.anInt5990 == 0 && local140 != null) {
				for (local154 = 4; local154 >= 0; local154--) {
					if (local140[local154] != null && local140[local154].equalsIgnoreCase(Static108.aString79)) {
						@Pc(287) short local287 = 0;
						@Pc(289) short local289 = 0;
						if (local154 == 0) {
							local289 = 6;
						}
						if (local154 == 1) {
							local289 = 31;
						}
						if (Static136.aClass10_Sub5_Sub1_1.anInt3590 < arg3.anInt3784) {
							local287 = 2000;
						}
						if (local154 == 2) {
							local289 = 30;
						}
						if (local154 == 3) {
							local289 = 59;
						}
						if (local154 == 4) {
							local289 = 10;
						}
						if (local289 != 0) {
							local289 += local287;
						}
						Static167.method2784(local289, "<col=ffff00>" + local28, arg0, arg3.anInt3775, local140[local154], (long) arg1, arg2);
					}
				}
			}
			Static167.method2784((short) 1006, "<col=ffff00>" + local28, arg0, Static229.anInt4480, Static181.aString126, (long) arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!rn;Lclient!rn;I)V")
	public static void method230(@OriginalArg(0) Class155 arg0, @OriginalArg(1) Class155 arg1) {
		Static224.aClass155_121 = arg1;
		Static90.aClass155_39 = arg0;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!rc;BI)V")
	public static void method231(@OriginalArg(0) Class3_Sub26_Sub1 arg0) {
		while (true) {
			@Pc(18) Class3_Sub19 local18 = (Class3_Sub19) Static155.aClass56_10.method1281();
			if (local18 == null) {
				return;
			}
			@Pc(25) boolean local25 = false;
			@Pc(27) int local27;
			for (local27 = 0; local27 < local18.anInt2790; local27++) {
				if (local18.aClass178Array1[local27] != null) {
					if (local18.aClass178Array1[local27].anInt5649 == 2) {
						local18.anIntArray324[local27] = -5;
					}
					if (local18.aClass178Array1[local27].anInt5649 == 0) {
						local25 = true;
					}
				}
				if (local18.aClass178Array2[local27] != null) {
					if (local18.aClass178Array2[local27].anInt5649 == 2) {
						local18.anIntArray324[local27] = -6;
					}
					if (local18.aClass178Array2[local27].anInt5649 == 0) {
						local25 = true;
					}
				}
			}
			if (local25) {
				return;
			}
			arg0.method3958(57);
			arg0.method3907(0);
			local27 = arg0.anInt4615;
			arg0.method3944(local18.anInt2792);
			for (@Pc(114) int local114 = 0; local114 < local18.anInt2790; local114++) {
				if (local18.anIntArray324[local114] == 0) {
					try {
						@Pc(144) int local144 = local18.anIntArray322[local114];
						@Pc(156) Field local156;
						@Pc(182) int local182;
						if (local144 == 0) {
							local156 = (Field) local18.aClass178Array1[local114].anObject6;
							local182 = local156.getInt(null);
							arg0.method3907(0);
							arg0.method3944(local182);
						} else if (local144 == 1) {
							local156 = (Field) local18.aClass178Array1[local114].anObject6;
							local156.setInt(null, local18.anIntArray323[local114]);
							arg0.method3907(0);
						} else if (local144 == 2) {
							local156 = (Field) local18.aClass178Array1[local114].anObject6;
							local182 = local156.getModifiers();
							arg0.method3907(0);
							arg0.method3944(local182);
						}
						@Pc(230) Method local230;
						if (local144 == 3) {
							@Pc(219) byte[][] local219 = local18.aByteArrayArrayArray16[local114];
							@Pc(223) Object[] local223 = new Object[local219.length];
							local230 = (Method) local18.aClass178Array2[local114].anObject6;
							for (@Pc(232) int local232 = 0; local232 < local219.length; local232++) {
								@Pc(250) ObjectInputStream local250 = new ObjectInputStream(new ByteArrayInputStream(local219[local232]));
								local223[local232] = local250.readObject();
							}
							@Pc(263) Object local263 = local230.invoke(null, local223);
							if (local263 == null) {
								arg0.method3907(0);
							} else if (local263 instanceof Number) {
								arg0.method3907(1);
								arg0.method3913(((Number) local263).longValue());
							} else if (local263 instanceof String) {
								arg0.method3907(2);
								arg0.method3914((String) local263);
							} else {
								arg0.method3907(4);
							}
						} else if (local144 == 4) {
							local230 = (Method) local18.aClass178Array2[local114].anObject6;
							local182 = local230.getModifiers();
							arg0.method3907(0);
							arg0.method3944(local182);
						}
					} catch (@Pc(331) ClassNotFoundException local331) {
						arg0.method3907(-10);
					} catch (@Pc(337) InvalidClassException local337) {
						arg0.method3907(-11);
					} catch (@Pc(343) StreamCorruptedException local343) {
						arg0.method3907(-12);
					} catch (@Pc(349) OptionalDataException local349) {
						arg0.method3907(-13);
					} catch (@Pc(355) IllegalAccessException local355) {
						arg0.method3907(-14);
					} catch (@Pc(361) IllegalArgumentException local361) {
						arg0.method3907(-15);
					} catch (@Pc(367) InvocationTargetException local367) {
						arg0.method3907(-16);
					} catch (@Pc(373) SecurityException local373) {
						arg0.method3907(-17);
					} catch (@Pc(379) IOException local379) {
						arg0.method3907(-18);
					} catch (@Pc(385) NullPointerException local385) {
						arg0.method3907(-19);
					} catch (@Pc(391) Exception local391) {
						arg0.method3907(-20);
					} catch (@Pc(397) Throwable local397) {
						arg0.method3907(-21);
					}
				} else {
					arg0.method3907(local18.anIntArray324[local114]);
				}
			}
			arg0.method3917(local27);
			arg0.method3936(arg0.anInt4615 - local27);
			local18.method5013();
		}
	}
}
