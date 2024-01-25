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

public final class Static360 {

	@OriginalMember(owner = "client!us", name = "ib", descriptor = "Lclient!ms;")
	public static Class155 aClass155_37;

	@OriginalMember(owner = "client!us", name = "jb", descriptor = "I")
	public static int anInt6350;

	@OriginalMember(owner = "client!us", name = "H", descriptor = "[S")
	public static final short[] aShortArray111 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!us", name = "K", descriptor = "[I")
	public static final int[] anIntArray765 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!us", name = "M", descriptor = "[I")
	public static final int[] anIntArray766 = new int[50];

	@OriginalMember(owner = "client!us", name = "P", descriptor = "Lclient!sq;")
	public static final Class214 aClass214_31 = new Class214(512);

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!pf;II)V")
	public static void method5466(@OriginalArg(0) Class2_Sub13_Sub2 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(15) Class2_Sub17 local15 = (Class2_Sub17) Static79.aClass210_13.method5035();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt2475; local22++) {
				if (local15.aClass1Array2[local22] != null) {
					if (local15.aClass1Array2[local22].anInt2 == 2) {
						local15.anIntArray282[local22] = -5;
					}
					if (local15.aClass1Array2[local22].anInt2 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass1Array1[local22] != null) {
					if (local15.aClass1Array1[local22].anInt2 == 2) {
						local15.anIntArray282[local22] = -6;
					}
					if (local15.aClass1Array1[local22].anInt2 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg0.method4253(arg1);
			arg0.method4207(0);
			@Pc(100) int local100 = arg0.anInt4788;
			arg0.method4218(local15.anInt2471);
			for (@Pc(107) int local107 = 0; local107 < local15.anInt2475; local107++) {
				if (local15.anIntArray282[local107] == 0) {
					try {
						@Pc(131) int local131 = local15.anIntArray280[local107];
						@Pc(143) Field local143;
						@Pc(147) int local147;
						if (local131 == 0) {
							local143 = (Field) local15.aClass1Array2[local107].anObject1;
							local147 = local143.getInt(null);
							arg0.method4207(0);
							arg0.method4218(local147);
						} else if (local131 == 1) {
							local143 = (Field) local15.aClass1Array2[local107].anObject1;
							local143.setInt(null, local15.anIntArray279[local107]);
							arg0.method4207(0);
						} else if (local131 == 2) {
							local143 = (Field) local15.aClass1Array2[local107].anObject1;
							local147 = local143.getModifiers();
							arg0.method4207(0);
							arg0.method4218(local147);
						}
						@Pc(218) Method local218;
						if (local131 == 3) {
							local218 = (Method) local15.aClass1Array1[local107].anObject1;
							@Pc(243) byte[][] local243 = local15.aByteArrayArrayArray6[local107];
							@Pc(247) Object[] local247 = new Object[local243.length];
							for (@Pc(249) int local249 = 0; local249 < local243.length; local249++) {
								@Pc(261) ObjectInputStream local261 = new ObjectInputStream(new ByteArrayInputStream(local243[local249]));
								local247[local249] = local261.readObject();
							}
							@Pc(280) Object local280 = local218.invoke(null, local247);
							if (local280 == null) {
								arg0.method4207(0);
							} else if (local280 instanceof Number) {
								arg0.method4207(1);
								arg0.method4208(((Number) local280).longValue());
							} else if (local280 instanceof String) {
								arg0.method4207(2);
								arg0.method4230((String) local280);
							} else {
								arg0.method4207(4);
							}
						} else if (local131 == 4) {
							local218 = (Method) local15.aClass1Array1[local107].anObject1;
							local147 = local218.getModifiers();
							arg0.method4207(0);
							arg0.method4218(local147);
						}
					} catch (@Pc(323) ClassNotFoundException local323) {
						arg0.method4207(-10);
					} catch (@Pc(329) InvalidClassException local329) {
						arg0.method4207(-11);
					} catch (@Pc(335) StreamCorruptedException local335) {
						arg0.method4207(-12);
					} catch (@Pc(341) OptionalDataException local341) {
						arg0.method4207(-13);
					} catch (@Pc(347) IllegalAccessException local347) {
						arg0.method4207(-14);
					} catch (@Pc(353) IllegalArgumentException local353) {
						arg0.method4207(-15);
					} catch (@Pc(359) InvocationTargetException local359) {
						arg0.method4207(-16);
					} catch (@Pc(365) SecurityException local365) {
						arg0.method4207(-17);
					} catch (@Pc(371) IOException local371) {
						arg0.method4207(-18);
					} catch (@Pc(377) NullPointerException local377) {
						arg0.method4207(-19);
					} catch (@Pc(383) Exception local383) {
						arg0.method4207(-20);
					} catch (@Pc(389) Throwable local389) {
						arg0.method4207(-21);
					}
				} else {
					arg0.method4207(local15.anIntArray282[local107]);
				}
			}
			arg0.method4242(local100);
			arg0.method4241(arg0.anInt4788 - local100);
			local15.method5745();
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IILjava/lang/String;II)V")
	public static void method5471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class155 local8 = Static257.method5607(arg1, arg3);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray34 != null) {
			@Pc(18) Class2_Sub24 local18 = new Class2_Sub24();
			local18.aString30 = arg2;
			local18.anObjectArray5 = local8.anObjectArray34;
			local18.aClass155_23 = local8;
			local18.anInt3671 = arg0;
			Static157.method2604(local18);
		}
		@Pc(39) boolean local39 = true;
		if (local8.anInt4155 != 0) {
			local39 = Static171.method2805(local8);
		}
		if (!local39 || !Static41.method878(local8).method5119(arg0 - 1)) {
			return;
		}
		if (arg0 == 1) {
			Static19.method552(Static292.aClass41_158);
			Static381.method5020(arg1, arg3, local8.anInt4212);
		}
		if (arg0 == 2) {
			Static19.method552(Static212.aClass41_120);
			Static381.method5020(arg1, arg3, local8.anInt4212);
		}
		if (arg0 == 3) {
			Static19.method552(Static61.aClass41_27);
			Static381.method5020(arg1, arg3, local8.anInt4212);
		}
		if (arg0 == 4) {
			Static19.method552(Static45.aClass41_74);
			Static381.method5020(arg1, arg3, local8.anInt4212);
		}
		if (arg0 == 5) {
			Static19.method552(Static195.aClass41_108);
			Static381.method5020(arg1, arg3, local8.anInt4212);
		}
		if (arg0 == 6) {
			Static19.method552(Static379.aClass41_26);
			Static381.method5020(arg1, arg3, local8.anInt4212);
		}
		if (arg0 == 7) {
			Static19.method552(Static216.aClass41_123);
			Static381.method5020(arg1, arg3, local8.anInt4212);
		}
		if (arg0 == 8) {
			Static19.method552(Static285.aClass41_155);
			Static381.method5020(arg1, arg3, local8.anInt4212);
		}
		if (arg0 == 9) {
			Static19.method552(Static330.aClass41_173);
			Static381.method5020(arg1, arg3, local8.anInt4212);
		}
		if (arg0 == 10) {
			Static19.method552(Static128.aClass41_66);
			Static381.method5020(arg1, arg3, local8.anInt4212);
		}
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(I)V")
	public static void method5472() {
		Static19.method552(Static259.aClass41_138);
		Static39.aClass2_Sub13_Sub2_4.method4207(Static238.method3868());
		Static39.aClass2_Sub13_Sub2_4.method4199(Static335.anInt5875);
		Static39.aClass2_Sub13_Sub2_4.method4199(Static263.anInt4662);
		Static39.aClass2_Sub13_Sub2_4.method4207(Static34.anInt734);
	}
}
