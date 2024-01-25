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

public final class Static305 {

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "[S")
	public static short[] aShortArray94;

	@OriginalMember(owner = "client!tp", name = "e", descriptor = "Z")
	public static boolean aBoolean515 = true;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(II)Lclient!sf;")
	public static Class1_Sub1_Sub18 method5149(@OriginalArg(1) int arg0) {
		@Pc(15) Class1_Sub1_Sub18 local15 = (Class1_Sub1_Sub18) Static13.aClass156_4.method4258((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static273.aClass165_81.method4508(arg0, 11);
		local15 = new Class1_Sub1_Sub18();
		if (local25 != null) {
			local15.method4875(new Class1_Sub7(local25));
		}
		Static13.aClass156_4.method4256(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(BI)V")
	public static void method5151(@OriginalArg(0) byte arg0) {
		if (Static186.aByteArrayArrayArray8 == null) {
			Static186.aByteArrayArrayArray8 = new byte[4][Static48.anInt1107][Static337.anInt6402];
		}
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			for (@Pc(23) int local23 = 0; local23 < Static48.anInt1107; local23++) {
				for (@Pc(27) int local27 = 0; local27 < Static337.anInt6402; local27++) {
					Static186.aByteArrayArrayArray8[local19][local23][local27] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lclient!bh;IB)V")
	public static void method5152(@OriginalArg(0) Class1_Sub7_Sub1 arg0) {
		while (true) {
			@Pc(18) Class1_Sub18 local18 = (Class1_Sub18) Static244.aClass195_42.method5029();
			if (local18 == null) {
				return;
			}
			@Pc(23) boolean local23 = false;
			for (@Pc(25) int local25 = 0; local25 < local18.anInt2722; local25++) {
				if (local18.aClass134Array1[local25] != null) {
					if (local18.aClass134Array1[local25].anInt4033 == 2) {
						local18.anIntArray321[local25] = -5;
					}
					if (local18.aClass134Array1[local25].anInt4033 == 0) {
						local23 = true;
					}
				}
				if (local18.aClass134Array2[local25] != null) {
					if (local18.aClass134Array2[local25].anInt4033 == 2) {
						local18.anIntArray321[local25] = -6;
					}
					if (local18.aClass134Array2[local25].anInt4033 == 0) {
						local23 = true;
					}
				}
			}
			if (local23) {
				return;
			}
			arg0.method728(55);
			arg0.method3108(0);
			@Pc(104) int local104 = arg0.anInt3368;
			arg0.method3098(local18.anInt2723);
			for (@Pc(111) int local111 = 0; local111 < local18.anInt2722; local111++) {
				if (local18.anIntArray321[local111] == 0) {
					try {
						@Pc(135) int local135 = local18.anIntArray320[local111];
						@Pc(150) Field local150;
						@Pc(176) int local176;
						if (local135 == 0) {
							local150 = (Field) local18.aClass134Array1[local111].anObject6;
							local176 = local150.getInt(null);
							arg0.method3108(0);
							arg0.method3098(local176);
						} else if (local135 == 1) {
							local150 = (Field) local18.aClass134Array1[local111].anObject6;
							local150.setInt(null, local18.anIntArray322[local111]);
							arg0.method3108(0);
						} else if (local135 == 2) {
							local150 = (Field) local18.aClass134Array1[local111].anObject6;
							local176 = local150.getModifiers();
							arg0.method3108(0);
							arg0.method3098(local176);
						}
						@Pc(215) Method local215;
						if (local135 == 3) {
							local215 = (Method) local18.aClass134Array2[local111].anObject6;
							@Pc(220) byte[][] local220 = local18.aByteArrayArrayArray4[local111];
							@Pc(224) Object[] local224 = new Object[local220.length];
							for (@Pc(226) int local226 = 0; local226 < local220.length; local226++) {
								@Pc(238) ObjectInputStream local238 = new ObjectInputStream(new ByteArrayInputStream(local220[local226]));
								local224[local226] = local238.readObject();
							}
							@Pc(253) Object local253 = local215.invoke(null, local224);
							if (local253 == null) {
								arg0.method3108(0);
							} else if (local253 instanceof Number) {
								arg0.method3108(1);
								arg0.method3121(((Number) local253).longValue());
							} else if (local253 instanceof String) {
								arg0.method3108(2);
								arg0.method3124((String) local253);
							} else {
								arg0.method3108(4);
							}
						} else if (local135 == 4) {
							local215 = (Method) local18.aClass134Array2[local111].anObject6;
							local176 = local215.getModifiers();
							arg0.method3108(0);
							arg0.method3098(local176);
						}
					} catch (@Pc(321) ClassNotFoundException local321) {
						arg0.method3108(-10);
					} catch (@Pc(327) InvalidClassException local327) {
						arg0.method3108(-11);
					} catch (@Pc(333) StreamCorruptedException local333) {
						arg0.method3108(-12);
					} catch (@Pc(339) OptionalDataException local339) {
						arg0.method3108(-13);
					} catch (@Pc(345) IllegalAccessException local345) {
						arg0.method3108(-14);
					} catch (@Pc(351) IllegalArgumentException local351) {
						arg0.method3108(-15);
					} catch (@Pc(357) InvocationTargetException local357) {
						arg0.method3108(-16);
					} catch (@Pc(363) SecurityException local363) {
						arg0.method3108(-17);
					} catch (@Pc(369) IOException local369) {
						arg0.method3108(-18);
					} catch (@Pc(375) NullPointerException local375) {
						arg0.method3108(-19);
					} catch (@Pc(381) Exception local381) {
						arg0.method3108(-20);
					} catch (@Pc(387) Throwable local387) {
						arg0.method3108(-21);
					}
				} else {
					arg0.method3108(local18.anIntArray321[local111]);
				}
			}
			arg0.method3097(local104);
			arg0.method3102(arg0.anInt3368 - local104);
			local18.method5710();
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIII)Lclient!cl;")
	public static Class32 method5153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class19[] local12 = null;
		@Pc(16) Class142 local16 = Static169.method4150(arg3);
		if (local16.anIntArray540 != null) {
			local12 = new Class19[local16.anIntArray540.length];
			for (@Pc(26) int local26 = 0; local26 < local12.length; local26++) {
				@Pc(35) Class66 local35 = Static263.method4606(local16.anIntArray540[local26]);
				local12[local26] = new Class19(local35.anInt1945, local35.anInt1949, local35.anInt1951, local35.anInt1943, local35.anInt1947, local35.anInt1948, local35.anInt1952, local35.aBoolean170);
			}
		}
		return new Class32(local16.anInt4236, local12, local16.anInt4239, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(BI)Ljava/lang/String;")
	public static String method5154(@OriginalArg(1) int arg0) {
		return arg0 < 999999999 ? Integer.toString(arg0) : "*";
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lclient!aa;Lclient!qh;III)V")
	public static void method5155(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class204 local12;
		if (arg3 < Static222.anInt4391) {
			local12 = Static138.aClass204ArrayArrayArray1[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass5_Sub5_1 != null && local12.aClass5_Sub5_1.method5681()) {
				arg1.method5677(true, 0, 128, arg0, 0, local12.aClass5_Sub5_1);
			}
		}
		if (arg4 < Static222.anInt4391) {
			local12 = Static138.aClass204ArrayArrayArray1[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass5_Sub5_1 != null && local12.aClass5_Sub5_1.method5681()) {
				arg1.method5677(true, 128, 0, arg0, 0, local12.aClass5_Sub5_1);
			}
		}
		if (arg3 < Static222.anInt4391 && arg4 < Static74.anInt3404) {
			local12 = Static138.aClass204ArrayArrayArray1[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass5_Sub5_1 != null && local12.aClass5_Sub5_1.method5681()) {
				arg1.method5677(true, 128, 128, arg0, 0, local12.aClass5_Sub5_1);
			}
		}
		if (arg3 < Static222.anInt4391 && arg4 > 0) {
			local12 = Static138.aClass204ArrayArrayArray1[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass5_Sub5_1 != null && local12.aClass5_Sub5_1.method5681()) {
				arg1.method5677(true, -128, 128, arg0, 0, local12.aClass5_Sub5_1);
			}
		}
	}
}
