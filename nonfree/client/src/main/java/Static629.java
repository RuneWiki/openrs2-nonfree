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

public final class Static629 {

	@OriginalMember(owner = "client!vba", name = "c", descriptor = "I")
	public static int anInt10412 = 100;

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(ZLclient!uq;)V")
	public static void method8498(@OriginalArg(1) Class362 arg0) {
		Static544.aClass362_120 = arg0;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)V")
	public static void method8499() {
		while (true) {
			if (Static459.aClass3_Sub4_Sub1_1.method338(Static147.anInt2709) >= 15) {
				@Pc(16) int local16 = Static459.aClass3_Sub4_Sub1_1.method333(15);
				if (local16 != 32767) {
					@Pc(21) boolean local21 = false;
					@Pc(28) Class3_Sub52 local28 = (Class3_Sub52) Static105.aClass333_11.method7489((long) local16);
					@Pc(34) Class34_Sub1_Sub1_Sub2_Sub2 local34;
					if (local28 == null) {
						local34 = new Class34_Sub1_Sub1_Sub2_Sub2();
						local34.anInt9671 = local16;
						local28 = new Class3_Sub52(local34);
						Static105.aClass333_11.method7488((long) local16, local28);
						Static129.aClass3_Sub52Array3[Static331.anInt5501++] = local28;
						local21 = true;
					}
					local34 = local28.aClass34_Sub1_Sub1_Sub2_Sub2_2;
					Static603.anIntArray537[Static52.anInt1140++] = local16;
					local34.anInt9667 = Static630.anInt10418;
					if (local34.aClass261_1 != null && local34.aClass261_1.method5767()) {
						Static487.method6426(local34);
					}
					@Pc(90) int local90 = Static459.aClass3_Sub4_Sub1_1.method333(2);
					@Pc(101) int local101 = (Static459.aClass3_Sub4_Sub1_1.method333(3) + 4 & 0xA5200007) << 11;
					@Pc(106) int local106 = Static459.aClass3_Sub4_Sub1_1.method333(5);
					if (local106 > 15) {
						local106 -= 32;
					}
					@Pc(115) int local115 = Static459.aClass3_Sub4_Sub1_1.method333(1);
					if (local115 == 1) {
						Static388.anIntArray342[Static317.anInt5304++] = local16;
					}
					@Pc(131) int local131 = Static459.aClass3_Sub4_Sub1_1.method333(5);
					if (local131 > 15) {
						local131 -= 32;
					}
					@Pc(142) int local142 = Static459.aClass3_Sub4_Sub1_1.method333(1);
					local34.method7886(Static267.aClass196_1.method4478(Static459.aClass3_Sub4_Sub1_1.method333(14)));
					local34.method7862(local34.aClass261_1.anInt6807);
					local34.anInt9639 = local34.aClass261_1.anInt6806 << 3;
					if (local21) {
						local34.method7864(true, local101);
					}
					local34.method7879(local142 == 1, local34.method7866(), Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anIntArray528[0] + local131, local90, Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anIntArray529[0] + local106);
					if (local34.aClass261_1.method5767()) {
						Static266.method3928(0, local34.aByte132, (Class216) null, local34.anIntArray529[0], local34, local34.anIntArray528[0], (Class34_Sub1_Sub1_Sub2_Sub1) null);
					}
					continue;
				}
			}
			Static459.aClass3_Sub4_Sub1_1.method329();
			return;
		}
	}

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "(I)V")
	public static void method8500() {
		if (Static197.aClass159_1 != null) {
			Static74.aClass191_1 = new Class191();
			Static74.aClass191_1.method4363(Static197.aClass159_1.anInt4341, Static197.aClass159_1.aClass84_63.method1729(Static654.anInt10668), Static509.aLong223, Static197.aClass159_1);
			Static382.aThread4 = new Thread(Static74.aClass191_1, "");
			Static382.aThread4.start();
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(Lclient!af;I)V")
	public static void method8501(@OriginalArg(0) Class3_Sub4_Sub1 arg0) {
		@Pc(10) Class3_Sub43 local10 = (Class3_Sub43) Static174.aClass302_16.method6603();
		if (local10 == null) {
			return;
		}
		@Pc(15) boolean local15 = false;
		for (@Pc(17) int local17 = 0; local17 < local10.anInt8226; local17++) {
			if (local10.aClass338Array1[local17] != null) {
				if (local10.aClass338Array1[local17].anInt9321 == 2) {
					local10.anIntArray437[local17] = -5;
				}
				if (local10.aClass338Array1[local17].anInt9321 == 0) {
					local15 = true;
				}
			}
			if (local10.aClass338Array2[local17] != null) {
				if (local10.aClass338Array2[local17].anInt9321 == 2) {
					local10.anIntArray437[local17] = -6;
				}
				if (local10.aClass338Array2[local17].anInt9321 == 0) {
					local15 = true;
				}
			}
		}
		if (local15) {
			return;
		}
		@Pc(85) int local85 = arg0.anInt9739;
		arg0.method7909(local10.anInt8229);
		for (@Pc(98) int local98 = 0; local98 < local10.anInt8226; local98++) {
			if (local10.anIntArray437[local98] == 0) {
				try {
					@Pc(124) int local124 = local10.anIntArray438[local98];
					@Pc(139) Field local139;
					@Pc(142) int local142;
					if (local124 == 0) {
						local139 = (Field) local10.aClass338Array1[local98].anObject18;
						local142 = local139.getInt((Object) null);
						arg0.method7948(0);
						arg0.method7909(local142);
					} else if (local124 == 1) {
						local139 = (Field) local10.aClass338Array1[local98].anObject18;
						local139.setInt((Object) null, local10.anIntArray436[local98]);
						arg0.method7948(0);
					} else if (local124 == 2) {
						local139 = (Field) local10.aClass338Array1[local98].anObject18;
						local142 = local139.getModifiers();
						arg0.method7948(0);
						arg0.method7909(local142);
					}
					@Pc(210) Method local210;
					if (local124 == 3) {
						local210 = (Method) local10.aClass338Array2[local98].anObject18;
						@Pc(237) byte[][] local237 = local10.aByteArrayArrayArray15[local98];
						@Pc(241) Object[] local241 = new Object[local237.length];
						for (@Pc(243) int local243 = 0; local243 < local237.length; local243++) {
							@Pc(255) ObjectInputStream local255 = new ObjectInputStream(new ByteArrayInputStream(local237[local243]));
							local241[local243] = local255.readObject();
						}
						@Pc(274) Object local274 = local210.invoke((Object) null, local241);
						if (local274 == null) {
							arg0.method7948(0);
						} else if (local274 instanceof Number) {
							arg0.method7948(1);
							arg0.method7893(((Number) local274).longValue());
						} else if (local274 instanceof String) {
							arg0.method7948(2);
							arg0.method7901((String) local274);
						} else {
							arg0.method7948(4);
						}
					} else if (local124 == 4) {
						local210 = (Method) local10.aClass338Array2[local98].anObject18;
						local142 = local210.getModifiers();
						arg0.method7948(0);
						arg0.method7909(local142);
					}
				} catch (@Pc(319) ClassNotFoundException local319) {
					arg0.method7948(-10);
				} catch (@Pc(325) InvalidClassException local325) {
					arg0.method7948(-11);
				} catch (@Pc(331) StreamCorruptedException local331) {
					arg0.method7948(-12);
				} catch (@Pc(339) OptionalDataException local339) {
					arg0.method7948(-13);
				} catch (@Pc(345) IllegalAccessException local345) {
					arg0.method7948(-14);
				} catch (@Pc(353) IllegalArgumentException local353) {
					arg0.method7948(-15);
				} catch (@Pc(361) InvocationTargetException local361) {
					arg0.method7948(-16);
				} catch (@Pc(367) SecurityException local367) {
					arg0.method7948(-17);
				} catch (@Pc(375) IOException local375) {
					arg0.method7948(-18);
				} catch (@Pc(381) NullPointerException local381) {
					arg0.method7948(-19);
				} catch (@Pc(387) Exception local387) {
					arg0.method7948(-20);
				} catch (@Pc(393) Throwable local393) {
					arg0.method7948(-21);
				}
			} else {
				arg0.method7948(local10.anIntArray437[local98]);
			}
		}
		arg0.method7931(local85);
		local10.method9034();
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(III)V")
	public static void method8502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class368 local7 = Static254.aClass368ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static216.method3187(local7.aClass34_Sub1_Sub5_2);
		Static216.method3187(local7.aClass34_Sub1_Sub5_1);
		if (local7.aClass34_Sub1_Sub5_2 != null) {
			local7.aClass34_Sub1_Sub5_2 = null;
		}
		if (local7.aClass34_Sub1_Sub5_1 != null) {
			local7.aClass34_Sub1_Sub5_1 = null;
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IBI)V")
	public static void method8503(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class3_Sub37 local12 = Static90.method1509(Static247.aClass240_40, Static226.aClass144_2);
		local12.aClass3_Sub4_Sub1_2.method7913(arg0);
		local12.aClass3_Sub4_Sub1_2.method7920(arg1);
		Static301.method2678(local12);
	}
}
