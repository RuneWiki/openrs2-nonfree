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

public final class Static165 {

	@OriginalMember(owner = "client!ue", name = "eb", descriptor = "[Lclient!na;")
	public static Class3_Sub2_Sub3_Sub2[] aClass3_Sub2_Sub3_Sub2Array8;

	@OriginalMember(owner = "client!ue", name = "N", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1315 = Static65.method1172("nav");

	@OriginalMember(owner = "client!ue", name = "bb", descriptor = "Z")
	public static boolean aBoolean157 = false;

	@OriginalMember(owner = "client!ue", name = "jb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1316 = Static65.method1172("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V")
	public static void method2648() {
		Static32.method577();
		Static127.method2153();
		Static43.method872();
		Static125.method2145();
		Static135.method2286();
		Static9.method257();
		Static86.method1430();
		Static150.method2482();
		Static80.method1346();
		Static3.method59();
		Static22.method412();
		Static151.method2492();
		((Class88) Static132.anInterface3_1).method2825();
		Static21.aClass57_20.method1715();
		Static95.aClass44_Sub1_10.method1628();
		Static178.aClass44_Sub1_16.method1628();
		Static160.aClass44_Sub1_15.method1628();
		Static65.aClass44_Sub1_8.method1628();
		Static51.aClass44_Sub1_3.method1628();
		Static53.aClass44_Sub1_5.method1628();
		Static24.aClass44_Sub1_1.method1628();
		Static181.aClass44_Sub1_18.method1628();
		Static56.aClass44_Sub1_6.method1628();
		Static91.aClass44_Sub1_9.method1628();
		Static153.aClass44_Sub1_14.method1628();
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILclient!ag;I)V")
	public static void method2651(@OriginalArg(1) Class3_Sub4_Sub1 arg0) {
		while (true) {
			@Pc(14) Class3_Sub6 local14 = (Class3_Sub6) Static145.aClass59_8.method1731();
			if (local14 == null) {
				return;
			}
			@Pc(19) boolean local19 = false;
			for (@Pc(21) int local21 = 0; local21 < local14.anInt612; local21++) {
				if (local14.aClass14Array2[local21] != null) {
					if (local14.aClass14Array2[local21].anInt516 == 2) {
						local14.anIntArray43[local21] = -5;
					}
					if (local14.aClass14Array2[local21].anInt516 == 0) {
						local19 = true;
					}
				}
				if (local14.aClass14Array1[local21] != null) {
					if (local14.aClass14Array1[local21].anInt516 == 2) {
						local14.anIntArray43[local21] = -6;
					}
					if (local14.aClass14Array1[local21].anInt516 == 0) {
						local19 = true;
					}
				}
			}
			if (local19) {
				return;
			}
			arg0.method233(34);
			arg0.method206(0);
			@Pc(102) int local102 = arg0.anInt232;
			arg0.method188(local14.anInt608);
			for (@Pc(109) int local109 = 0; local109 < local14.anInt612; local109++) {
				if (local14.anIntArray43[local109] == 0) {
					try {
						@Pc(133) int local133 = local14.anIntArray42[local109];
						@Pc(145) Field local145;
						@Pc(149) int local149;
						if (local133 == 0) {
							local145 = (Field) local14.aClass14Array2[local109].anObject1;
							local149 = local145.getInt(null);
							arg0.method206(0);
							arg0.method188(local149);
						} else if (local133 == 1) {
							local145 = (Field) local14.aClass14Array2[local109].anObject1;
							local145.setInt(null, local14.anIntArray44[local109]);
							arg0.method206(0);
						} else if (local133 == 2) {
							local145 = (Field) local14.aClass14Array2[local109].anObject1;
							local149 = local145.getModifiers();
							arg0.method206(0);
							arg0.method188(local149);
						}
						@Pc(220) Method local220;
						if (local133 == 3) {
							local220 = (Method) local14.aClass14Array1[local109].anObject1;
							@Pc(245) byte[][] local245 = local14.aByteArrayArrayArray1[local109];
							@Pc(249) Object[] local249 = new Object[local245.length];
							for (@Pc(251) int local251 = 0; local251 < local245.length; local251++) {
								@Pc(263) ObjectInputStream local263 = new ObjectInputStream(new ByteArrayInputStream(local245[local251]));
								local249[local251] = local263.readObject();
							}
							@Pc(282) Object local282 = local220.invoke(null, local249);
							if (local282 == null) {
								arg0.method206(0);
							} else if (local282 instanceof Number) {
								arg0.method206(1);
								arg0.method201(((Number) local282).longValue());
							} else if (local282 instanceof Class46) {
								arg0.method206(2);
								arg0.method189((Class46) local282);
							} else {
								arg0.method206(4);
							}
						} else if (local133 == 4) {
							local220 = (Method) local14.aClass14Array1[local109].anObject1;
							local149 = local220.getModifiers();
							arg0.method206(0);
							arg0.method188(local149);
						}
					} catch (@Pc(325) ClassNotFoundException local325) {
						arg0.method206(-10);
					} catch (@Pc(331) InvalidClassException local331) {
						arg0.method206(-11);
					} catch (@Pc(337) StreamCorruptedException local337) {
						arg0.method206(-12);
					} catch (@Pc(343) OptionalDataException local343) {
						arg0.method206(-13);
					} catch (@Pc(349) IllegalAccessException local349) {
						arg0.method206(-14);
					} catch (@Pc(355) IllegalArgumentException local355) {
						arg0.method206(-15);
					} catch (@Pc(361) InvocationTargetException local361) {
						arg0.method206(-16);
					} catch (@Pc(367) SecurityException local367) {
						arg0.method206(-17);
					} catch (@Pc(373) IOException local373) {
						arg0.method206(-18);
					} catch (@Pc(379) NullPointerException local379) {
						arg0.method206(-19);
					} catch (@Pc(385) Exception local385) {
						arg0.method206(-20);
					} catch (@Pc(391) Throwable local391) {
						arg0.method206(-21);
					}
				} else {
					arg0.method206(local14.anIntArray43[local109]);
				}
			}
			arg0.method195(local102);
			arg0.method222(arg0.anInt232 - local102);
			local14.method2900();
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIZI)Lclient!ob;")
	public static Class3_Sub2_Sub3_Sub3 method2652(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(24) long local24 = ((long) arg2 << 38) + ((long) arg4 << 16) + (long) arg1 + ((long) arg0 << 40);
		@Pc(32) Class3_Sub2_Sub3_Sub3 local32;
		if (!arg3) {
			local32 = (Class3_Sub2_Sub3_Sub3) Static65.aClass57_15.method1719(local24);
			if (local32 != null) {
				return local32;
			}
		}
		@Pc(40) Class3_Sub2_Sub14 local40 = Static146.method2432(arg1);
		if (arg4 > 1 && local40.anIntArray388 != null) {
			@Pc(50) int local50 = -1;
			for (@Pc(52) int local52 = 0; local52 < 10; local52++) {
				if (arg4 >= local40.anIntArray387[local52] && local40.anIntArray387[local52] != 0) {
					local50 = local40.anIntArray388[local52];
				}
			}
			if (local50 != -1) {
				local40 = Static146.method2432(local50);
			}
		}
		@Pc(91) Class3_Sub2_Sub1_Sub2_Sub1 local91 = local40.method2424();
		if (local91 == null) {
			return null;
		}
		@Pc(97) Class3_Sub2_Sub3_Sub3 local97 = null;
		if (local40.anInt3337 != -1) {
			local97 = method2652(0, local40.anInt3336, 1, true, 10);
			if (local97 == null) {
				return null;
			}
		}
		@Pc(116) int[] local116 = Static103.anIntArray344;
		@Pc(118) int local118 = Static103.anInt3089;
		@Pc(120) int local120 = Static103.anInt3088;
		@Pc(123) int[] local123 = new int[4];
		Static103.method2222(local123);
		local32 = new Class3_Sub2_Sub3_Sub3(36, 32);
		Static103.method2226(local32.anIntArray301, 36, 32);
		Static103.method2221();
		Static132.method2230();
		Static132.method2233(16, 16);
		Static132.aBoolean130 = false;
		@Pc(146) int local146 = local40.anInt3309;
		if (arg3) {
			local146 = (int) ((double) local146 * 1.5D);
		} else if (arg2 == 2) {
			local146 = (int) ((double) local146 * 1.04D);
		}
		@Pc(174) int local174 = local146 * Class3_Sub2_Sub3_Sub4.anIntArray346[local40.anInt3323] >> 16;
		@Pc(183) int local183 = local146 * Class3_Sub2_Sub3_Sub4.anIntArray347[local40.anInt3323] >> 16;
		local91.method1785();
		local91.method1788(local40.anInt3322, local40.anInt3316, local40.anInt3323, local40.anInt3346, local183 + local40.anInt3314 - local91.aShort34 / 2, local40.anInt3314 + local174);
		if (arg2 >= 1) {
			local32.method1899(1);
		}
		if (arg2 >= 2) {
			local32.method1899(16777215);
		}
		if (arg0 != 0) {
			local32.method1896(arg0);
		}
		Static103.method2226(local32.anIntArray301, 36, 32);
		if (local40.anInt3337 != -1) {
			local97.method1880(0, 0);
		}
		if (!arg3 && (local40.anInt3324 == 1 || arg4 != 1) && arg4 != -1) {
			Static9.aClass3_Sub2_Sub3_Sub1_Sub1_1.method821(Static23.method413(arg4), 0, 9, 16776960, 1);
		}
		if (!arg3) {
			Static65.aClass57_15.method1717(local32, local24);
		}
		Static103.method2226(local116, local118, local120);
		Static103.method2224(local123);
		Static132.method2230();
		Static132.aBoolean130 = true;
		return local32;
	}

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "(I)V")
	public static void method2654() {
		aClass3_Sub2_Sub3_Sub2Array8 = null;
		aClass46_1315 = null;
		aClass46_1316 = null;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(III)I")
	public static int method2655(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = arg0 >>> 31;
		return (arg0 + local3) / arg1 - local3;
	}
}
