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

public final class Static349 {

	@OriginalMember(owner = "client!nm", name = "p", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_96 = new Class98(116, 0);

	@OriginalMember(owner = "client!nm", name = "s", descriptor = "[Lclient!lv;")
	public static final Class193[] aClass193Array1 = new Class193[34];

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIIIBII)V")
	public static void method5297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 < 1 || arg3 < 1 || Static18.anInt5706 - 2 < arg7 || arg3 > Static80.anInt1367 - 2) {
			return;
		}
		@Pc(25) int local25 = arg2;
		if (arg2 < 3 && Static77.method1114(arg3, arg7)) {
			local25 = arg2 + 1;
		}
		if (!Static58.aClass6_Sub17_Sub1_1.method7353(Static79.anInt2700) && !Static163.method2600(arg7, Static558.anInt9704, arg3, local25)) {
			return;
		}
		if (Static113.aClass133ArrayArrayArray1 == null) {
			return;
		}
		Static375.aClass238_Sub1_5.method5551(arg6, arg7, Static554.aClass90_12, arg2, Static30.aClass138Array1[arg2], arg3);
		if (arg1 >= 0) {
			@Pc(66) boolean local66 = Static58.aClass6_Sub17_Sub1_1.aBoolean614;
			Static58.aClass6_Sub17_Sub1_1.aBoolean614 = true;
			Static375.aClass238_Sub1_5.method5552(Static554.aClass90_12, arg5, arg2, arg0, arg3, local25, arg4, arg7, arg1, Static30.aClass138Array1[arg2]);
			Static58.aClass6_Sub17_Sub1_1.aBoolean614 = local66;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)I")
	public static int method5298() {
		if (Static266.aBoolean351) {
			return 6;
		} else if (Static222.aClass6_Sub26_1 == null) {
			return 0;
		} else {
			@Pc(19) int local19 = Static222.aClass6_Sub26_1.anInt5472;
			if (Static180.method2997(local19)) {
				return 1;
			} else if (Static452.method6341(local19)) {
				return 2;
			} else if (Static252.method3929(local19)) {
				return 3;
			} else if (Static543.method7377(local19)) {
				return 4;
			} else {
				return 5;
			}
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!ql;IB)V")
	public static void method5299(@OriginalArg(0) Class6_Sub12_Sub2 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(14) Class6_Sub11 local14 = (Class6_Sub11) Static467.aClass298_177.method6809();
			if (local14 == null) {
				return;
			}
			@Pc(19) boolean local19 = false;
			for (@Pc(21) int local21 = 0; local21 < local14.anInt1399; local21++) {
				if (local14.aClass224Array1[local21] != null) {
					if (local14.aClass224Array1[local21].anInt6632 == 2) {
						local14.anIntArray129[local21] = -5;
					}
					if (local14.aClass224Array1[local21].anInt6632 == 0) {
						local19 = true;
					}
				}
				if (local14.aClass224Array2[local21] != null) {
					if (local14.aClass224Array2[local21].anInt6632 == 2) {
						local14.anIntArray129[local21] = -6;
					}
					if (local14.aClass224Array2[local21].anInt6632 == 0) {
						local19 = true;
					}
				}
			}
			if (local19) {
				return;
			}
			arg0.method6062(arg1);
			arg0.method6047(0);
			@Pc(103) int local103 = arg0.anInt7556;
			arg0.method6042(local14.anInt1397);
			for (@Pc(110) int local110 = 0; local110 < local14.anInt1399; local110++) {
				if (local14.anIntArray129[local110] == 0) {
					try {
						@Pc(131) int local131 = local14.anIntArray131[local110];
						@Pc(143) Field local143;
						@Pc(147) int local147;
						if (local131 == 0) {
							local143 = (Field) local14.aClass224Array1[local110].anObject14;
							local147 = local143.getInt(null);
							arg0.method6047(0);
							arg0.method6042(local147);
						} else if (local131 == 1) {
							local143 = (Field) local14.aClass224Array1[local110].anObject14;
							local143.setInt(null, local14.anIntArray130[local110]);
							arg0.method6047(0);
						} else if (local131 == 2) {
							local143 = (Field) local14.aClass224Array1[local110].anObject14;
							local147 = local143.getModifiers();
							arg0.method6047(0);
							arg0.method6042(local147);
						}
						@Pc(218) Method local218;
						if (local131 == 3) {
							local218 = (Method) local14.aClass224Array2[local110].anObject14;
							@Pc(243) byte[][] local243 = local14.aByteArrayArrayArray1[local110];
							@Pc(247) Object[] local247 = new Object[local243.length];
							for (@Pc(249) int local249 = 0; local249 < local243.length; local249++) {
								@Pc(261) ObjectInputStream local261 = new ObjectInputStream(new ByteArrayInputStream(local243[local249]));
								local247[local249] = local261.readObject();
							}
							@Pc(276) Object local276 = local218.invoke(null, local247);
							if (local276 == null) {
								arg0.method6047(0);
							} else if (local276 instanceof Number) {
								arg0.method6047(1);
								arg0.method6026(((Number) local276).longValue());
							} else if (local276 instanceof String) {
								arg0.method6047(2);
								arg0.method6009((String) local276);
							} else {
								arg0.method6047(4);
							}
						} else if (local131 == 4) {
							local218 = (Method) local14.aClass224Array2[local110].anObject14;
							local147 = local218.getModifiers();
							arg0.method6047(0);
							arg0.method6042(local147);
						}
					} catch (@Pc(319) ClassNotFoundException local319) {
						arg0.method6047(-10);
					} catch (@Pc(325) InvalidClassException local325) {
						arg0.method6047(-11);
					} catch (@Pc(331) StreamCorruptedException local331) {
						arg0.method6047(-12);
					} catch (@Pc(337) OptionalDataException local337) {
						arg0.method6047(-13);
					} catch (@Pc(343) IllegalAccessException local343) {
						arg0.method6047(-14);
					} catch (@Pc(349) IllegalArgumentException local349) {
						arg0.method6047(-15);
					} catch (@Pc(355) InvocationTargetException local355) {
						arg0.method6047(-16);
					} catch (@Pc(361) SecurityException local361) {
						arg0.method6047(-17);
					} catch (@Pc(367) IOException local367) {
						arg0.method6047(-18);
					} catch (@Pc(373) NullPointerException local373) {
						arg0.method6047(-19);
					} catch (@Pc(379) Exception local379) {
						arg0.method6047(-20);
					} catch (@Pc(385) Throwable local385) {
						arg0.method6047(-21);
					}
				} else {
					arg0.method6047(local14.anIntArray129[local110]);
				}
			}
			arg0.method6005(local103);
			arg0.method6056(arg0.anInt7556 - local103);
			local14.method7948();
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!jr;B)Lclient!pl;")
	public static Class250 method5300(@OriginalArg(0) Class6_Sub12 arg0) {
		@Pc(12) int local12 = arg0.method6015();
		return new Class250(local12);
	}
}
