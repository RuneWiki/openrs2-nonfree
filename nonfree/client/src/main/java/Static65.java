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

public final class Static65 {

	@OriginalMember(owner = "client!gf", name = "n", descriptor = "[Lclient!le;")
	public static Class1_Sub2_Sub8_Sub2[] aClass1_Sub2_Sub8_Sub2Array8;

	@OriginalMember(owner = "client!gf", name = "o", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_464 = Static81.method1507("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
	public static int anInt1646 = 0;

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_470 = Static81.method1507("white:");

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "Lclient!dj;")
	public static Class24 aClass24_465 = aClass24_470;

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_466 = aClass24_470;

	@OriginalMember(owner = "client!gf", name = "h", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_468 = Static81.method1507("Please remove ");

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "Lclient!dj;")
	public static Class24 aClass24_467 = aClass24_468;

	@OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
	public static int anInt1649 = 0;

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
	public static int anInt1650 = 0;

	@OriginalMember(owner = "client!gf", name = "k", descriptor = "Z")
	public static boolean aBoolean84 = false;

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "Lclient!dj;")
	public static Class24 aClass24_469 = aClass24_468;

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)Lclient!ac;")
	public static Class3 method1310() {
		try {
			return (Class3) Class.forName("Class3_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class3_Sub2();
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!wd;IIIII)V")
	public static void method1311(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static143.anInt3201) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static60.anInt3602) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static18.anInt3874 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class1_Sub8 local62 = Static29.aClass1_Sub8ArrayArrayArray1[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static181.anIntArrayArrayArray10[local17][local23][local32] + Static181.anIntArrayArrayArray10[local17][local23 + 1][local32] + Static181.anIntArrayArrayArray10[local17][local23][local32 + 1] + Static181.anIntArrayArrayArray10[local17][local23 + 1][local32 + 1]) / 4 - (Static181.anIntArrayArrayArray10[arg1][arg2][arg3] + Static181.anIntArrayArrayArray10[arg1][arg2 + 1][arg3] + Static181.anIntArrayArrayArray10[arg1][arg2][arg3 + 1] + Static181.anIntArrayArrayArray10[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(151) Class19 local151 = local62.aClass19_1;
									if (local151 != null) {
										if (local151.aClass5_1.method3166()) {
											arg0.method3165(local151.aClass5_1, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local151.aClass5_2 != null && local151.aClass5_2.method3166()) {
											arg0.method3165(local151.aClass5_2, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(222) int local222 = 0; local222 < local62.anInt1550; local222++) {
										@Pc(228) Class51 local228 = local62.aClass51Array1[local222];
										if (local228 != null && local228.aClass5_6.method3166() && (local23 == local228.anInt2213 || local23 == local3) && (local32 == local228.anInt2218 || local32 == local11)) {
											@Pc(257) int local257 = local228.anInt2208 + 1 - local228.anInt2213;
											@Pc(265) int local265 = local228.anInt2205 + 1 - local228.anInt2218;
											arg0.method3165(local228.aClass5_6, (local228.anInt2213 - arg2) * 128 + (local257 - arg4) * 64, local148, (local228.anInt2218 - arg3) * 128 + (local265 - arg5) * 64, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)V")
	public static void method1312(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(2) int[] local2 = new int[4];
		local2[0] = arg1;
		@Pc(13) int[] local13 = new int[4];
		@Pc(15) int local15 = 1;
		local13[0] = arg0;
		for (@Pc(21) int local21 = 0; local21 < 4; local21++) {
			if (arg1 != Static15.anIntArray36[local21]) {
				local2[local15] = Static15.anIntArray36[local21];
				local13[local15] = Static136.anIntArray250[local21];
				local15++;
			}
		}
		Static15.anIntArray36 = local2;
		Static136.anIntArray250 = local13;
		Static173.method2980(0, Static160.aClass63Array105.length - 1, Static160.aClass63Array105, Static15.anIntArray36, Static136.anIntArray250);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BLclient!rh;I)V")
	public static void method1313(@OriginalArg(1) Class1_Sub7_Sub1 arg0) {
		while (true) {
			@Pc(19) Class1_Sub20 local19 = (Class1_Sub20) Static121.aClass87_18.method2827();
			if (local19 == null) {
				return;
			}
			@Pc(24) boolean local24 = false;
			for (@Pc(26) int local26 = 0; local26 < local19.anInt3264; local26++) {
				if (local19.aClass82Array1[local26] != null) {
					if (local19.aClass82Array1[local26].anInt3421 == 2) {
						local19.anIntArray275[local26] = -5;
					}
					if (local19.aClass82Array1[local26].anInt3421 == 0) {
						local24 = true;
					}
				}
				if (local19.aClass82Array2[local26] != null) {
					if (local19.aClass82Array2[local26].anInt3421 == 2) {
						local19.anIntArray275[local26] = -6;
					}
					if (local19.aClass82Array2[local26].anInt3421 == 0) {
						local24 = true;
					}
				}
			}
			if (local24) {
				return;
			}
			arg0.method2808(22);
			arg0.method2753(0);
			@Pc(99) int local99 = arg0.anInt3592;
			arg0.method2754(local19.anInt3263);
			for (@Pc(106) int local106 = 0; local106 < local19.anInt3264; local106++) {
				if (local19.anIntArray275[local106] == 0) {
					try {
						@Pc(130) int local130 = local19.anIntArray276[local106];
						@Pc(142) Field local142;
						@Pc(146) int local146;
						if (local130 == 0) {
							local142 = (Field) local19.aClass82Array1[local106].anObject2;
							local146 = local142.getInt(null);
							arg0.method2753(0);
							arg0.method2754(local146);
						} else if (local130 == 1) {
							local142 = (Field) local19.aClass82Array1[local106].anObject2;
							local142.setInt(null, local19.anIntArray273[local106]);
							arg0.method2753(0);
						} else if (local130 == 2) {
							local142 = (Field) local19.aClass82Array1[local106].anObject2;
							local146 = local142.getModifiers();
							arg0.method2753(0);
							arg0.method2754(local146);
						}
						@Pc(217) Method local217;
						if (local130 == 3) {
							local217 = (Method) local19.aClass82Array2[local106].anObject2;
							@Pc(246) byte[][] local246 = local19.aByteArrayArrayArray9[local106];
							@Pc(250) Object[] local250 = new Object[local246.length];
							for (@Pc(252) int local252 = 0; local252 < local246.length; local252++) {
								@Pc(264) ObjectInputStream local264 = new ObjectInputStream(new ByteArrayInputStream(local246[local252]));
								local250[local252] = local264.readObject();
							}
							@Pc(279) Object local279 = local217.invoke(null, local250);
							if (local279 == null) {
								arg0.method2753(0);
							} else if (local279 instanceof Number) {
								arg0.method2753(1);
								arg0.method2801(((Number) local279).longValue());
							} else if (local279 instanceof Class24) {
								arg0.method2753(2);
								arg0.method2757((Class24) local279);
							} else {
								arg0.method2753(4);
							}
						} else if (local130 == 4) {
							local217 = (Method) local19.aClass82Array2[local106].anObject2;
							local146 = local217.getModifiers();
							arg0.method2753(0);
							arg0.method2754(local146);
						}
					} catch (@Pc(324) ClassNotFoundException local324) {
						arg0.method2753(-10);
					} catch (@Pc(332) InvalidClassException local332) {
						arg0.method2753(-11);
					} catch (@Pc(338) StreamCorruptedException local338) {
						arg0.method2753(-12);
					} catch (@Pc(346) OptionalDataException local346) {
						arg0.method2753(-13);
					} catch (@Pc(352) IllegalAccessException local352) {
						arg0.method2753(-14);
					} catch (@Pc(358) IllegalArgumentException local358) {
						arg0.method2753(-15);
					} catch (@Pc(366) InvocationTargetException local366) {
						arg0.method2753(-16);
					} catch (@Pc(372) SecurityException local372) {
						arg0.method2753(-17);
					} catch (@Pc(380) IOException local380) {
						arg0.method2753(-18);
					} catch (@Pc(386) NullPointerException local386) {
						arg0.method2753(-19);
					} catch (@Pc(394) Exception local394) {
						arg0.method2753(-20);
					} catch (@Pc(400) Throwable local400) {
						arg0.method2753(-21);
					}
				} else {
					arg0.method2753(local19.anIntArray275[local106]);
				}
			}
			arg0.method2783(local99);
			arg0.method2773(arg0.anInt3592 - local99);
			local19.method3563();
		}
	}
}
