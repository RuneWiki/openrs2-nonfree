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

public final class Static253 {

	@OriginalMember(owner = "client!pp", name = "L", descriptor = "Lclient!mo;")
	public static Class143 aClass143_27;

	@OriginalMember(owner = "client!pp", name = "M", descriptor = "Lclient!vq;")
	public static Class208 aClass208_2;

	@OriginalMember(owner = "client!pp", name = "P", descriptor = "Z")
	private static boolean aBoolean63;

	@OriginalMember(owner = "client!pp", name = "Q", descriptor = "Z")
	private static boolean aBoolean64;

	@OriginalMember(owner = "client!pp", name = "R", descriptor = "Z")
	private static boolean aBoolean65;

	@OriginalMember(owner = "client!pp", name = "S", descriptor = "Z")
	private static boolean aBoolean66;

	@OriginalMember(owner = "client!pp", name = "u", descriptor = "Lclient!gi;")
	public static Class77 aClass77_2 = new Class77(8);

	@OriginalMember(owner = "client!pp", name = "J", descriptor = "I")
	public static int anInt1051 = 0;

	@OriginalMember(owner = "client!pp", name = "providesignlink", descriptor = "(Lclient!ap;)V")
	private static void method1013(@OriginalArg(0) Class15 arg0) {
		Static105.aClass15_2 = arg0;
		Static103.aClass15_1 = arg0;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IILclient!hj;)V")
	public static void method1018(@OriginalArg(2) Class14_Sub4_Sub2 arg0) {
		while (true) {
			@Pc(15) Class14_Sub22 local15 = (Class14_Sub22) Static279.aClass18_33.method459();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt3715; local22++) {
				if (local15.aClass205Array1[local22] != null) {
					if (local15.aClass205Array1[local22].anInt6370 == 2) {
						local15.anIntArray320[local22] = -5;
					}
					if (local15.aClass205Array1[local22].anInt6370 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass205Array2[local22] != null) {
					if (local15.aClass205Array2[local22].anInt6370 == 2) {
						local15.anIntArray320[local22] = -6;
					}
					if (local15.aClass205Array2[local22].anInt6370 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg0.method2557(244);
			arg0.method2538(0);
			@Pc(95) int local95 = arg0.anInt2637;
			arg0.method2541(local15.anInt3714);
			for (@Pc(102) int local102 = 0; local102 < local15.anInt3715; local102++) {
				if (local15.anIntArray320[local102] == 0) {
					try {
						@Pc(123) int local123 = local15.anIntArray322[local102];
						@Pc(132) Field local132;
						@Pc(136) int local136;
						if (local123 == 0) {
							local132 = (Field) local15.aClass205Array1[local102].anObject7;
							local136 = local132.getInt(null);
							arg0.method2538(0);
							arg0.method2541(local136);
						} else if (local123 == 1) {
							local132 = (Field) local15.aClass205Array1[local102].anObject7;
							local132.setInt(null, local15.anIntArray321[local102]);
							arg0.method2538(0);
						} else if (local123 == 2) {
							local132 = (Field) local15.aClass205Array1[local102].anObject7;
							local136 = local132.getModifiers();
							arg0.method2538(0);
							arg0.method2541(local136);
						}
						@Pc(207) Method local207;
						if (local123 == 3) {
							local207 = (Method) local15.aClass205Array2[local102].anObject7;
							@Pc(232) byte[][] local232 = local15.aByteArrayArrayArray7[local102];
							@Pc(236) Object[] local236 = new Object[local232.length];
							for (@Pc(238) int local238 = 0; local238 < local232.length; local238++) {
								@Pc(250) ObjectInputStream local250 = new ObjectInputStream(new ByteArrayInputStream(local232[local238]));
								local236[local238] = local250.readObject();
							}
							@Pc(269) Object local269 = local207.invoke(null, local236);
							if (local269 == null) {
								arg0.method2538(0);
							} else if (local269 instanceof Number) {
								arg0.method2538(1);
								arg0.method2544(((Number) local269).longValue());
							} else if (local269 instanceof String) {
								arg0.method2538(2);
								arg0.method2527((String) local269);
							} else {
								arg0.method2538(4);
							}
						} else if (local123 == 4) {
							local207 = (Method) local15.aClass205Array2[local102].anObject7;
							local136 = local207.getModifiers();
							arg0.method2538(0);
							arg0.method2541(local136);
						}
					} catch (@Pc(316) ClassNotFoundException local316) {
						arg0.method2538(-10);
					} catch (@Pc(322) InvalidClassException local322) {
						arg0.method2538(-11);
					} catch (@Pc(328) StreamCorruptedException local328) {
						arg0.method2538(-12);
					} catch (@Pc(336) OptionalDataException local336) {
						arg0.method2538(-13);
					} catch (@Pc(342) IllegalAccessException local342) {
						arg0.method2538(-14);
					} catch (@Pc(348) IllegalArgumentException local348) {
						arg0.method2538(-15);
					} catch (@Pc(354) InvocationTargetException local354) {
						arg0.method2538(-16);
					} catch (@Pc(360) SecurityException local360) {
						arg0.method2538(-17);
					} catch (@Pc(366) IOException local366) {
						arg0.method2538(-18);
					} catch (@Pc(372) NullPointerException local372) {
						arg0.method2538(-19);
					} catch (@Pc(378) Exception local378) {
						arg0.method2538(-20);
					} catch (@Pc(384) Throwable local384) {
						arg0.method2538(-21);
					}
				} else {
					arg0.method2538(local15.anIntArray320[local102]);
				}
			}
			arg0.method2530(local95);
			arg0.method2523(arg0.anInt2637 - local95);
			local15.method5986();
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIBII)Lclient!vq;")
	public static Class208 method1022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class63[] local12 = null;
		@Pc(16) Class151 local16 = Static26.method681(arg0);
		if (local16.anIntArray383 != null) {
			local12 = new Class63[local16.anIntArray383.length];
			for (@Pc(26) int local26 = 0; local26 < local12.length; local26++) {
				@Pc(35) Class20 local35 = Static101.method2251(local16.anIntArray383[local26]);
				local12[local26] = new Class63(local35.anInt440, local35.anInt446, local35.anInt442, local35.anInt444, local35.anInt447, local35.anInt449, local35.anInt441, local35.aBoolean23);
			}
		}
		return new Class208(local16.anInt4254, local12, local16.anInt4248, arg1, arg3, arg2);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lclient!mo;IBIIZI)V")
	public static void method1024(@OriginalArg(0) Class143 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static270.anInt5151 = arg1;
		Static106.anInt2365 = 1;
		Static285.aClass143_100 = arg0;
		Static104.anInt2321 = 0;
		Static185.anInt3817 = 2;
		Static355.anInt6755 = arg2;
		Static99.aBoolean159 = false;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)V")
	public static void method1025(@OriginalArg(1) int arg0) {
		Static262.method4488();
		Static349.method5911();
		Static71.method5021(true, arg0);
		Static328.method5650(Static218.aClass46_5, Static348.aClass143_98, Static332.aClass143_111);
		Static153.method3015(Static348.aClass143_98, Static218.aClass46_5);
		Static145.method5357(Static18.aClass2Array3);
		Static272.method4617();
		Static7.method206();
		if (Static302.anInt5842 == 10) {
			Static351.method5919(false);
		} else if (Static302.anInt5842 == 30) {
			Static67.method1662(25);
		} else if (Static302.anInt5842 == 5) {
			Static92.method2160(Static348.aClass143_98, Static218.aClass46_5);
			return;
		}
	}
}
