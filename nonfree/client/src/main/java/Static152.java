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

public final class Static152 {

	@OriginalMember(owner = "client!gaa", name = "n", descriptor = "[[[Lclient!br;")
	public static Class37[][][] aClass37ArrayArrayArray1;

	@OriginalMember(owner = "client!gaa", name = "d", descriptor = "Lclient!cb;")
	public static final Class42 aClass42_10 = new Class42(16);

	@OriginalMember(owner = "client!gaa", name = "m", descriptor = "I")
	public static int anInt3130 = 0;

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(II[BI)Ljava/lang/String;")
	public static String method2790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(8) char[] local8 = new char[arg0];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0; local12++) {
			@Pc(22) int local22 = arg2[local12 + arg1] & 0xFF;
			if (local22 != 0) {
				if (local22 >= 128 && local22 < 160) {
					@Pc(39) char local39 = Static395.aCharArray7[local22 - 128];
					if (local39 == '\u0000') {
						local39 = '?';
					}
					local22 = local39;
				}
				local8[local10++] = (char) local22;
			}
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BI)V")
	public static void method2792(@OriginalArg(1) int arg0) {
		if (Static442.anIntArray584 == null || Static442.anIntArray584.length < arg0) {
			Static442.anIntArray584 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(II)V")
	public static void method2793() {
		Static289.anInt5853 = -1;
		Static431.aBoolean537 = false;
		Static235.anInt4584 = -1;
		Static296.anInt5926 = 0;
		Static409.aClass117_173 = null;
		Static456.anInt7875 = 2;
		Static332.anInt6296 = 1;
	}

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "(B)V")
	public static void method2795() {
		Static206.aClass62_24.M(((float) Static300.aClass5_Sub28_Sub1_1.anInt4878 * 0.1F + 0.7F) * 1.1523438F);
		Static206.aClass62_24.m(Static449.anInt7818, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
		Static206.aClass62_24.E(Static435.anInt7660, -1, 256);
		Static206.aClass62_24.method7067(Static465.aClass92_4);
	}

	@OriginalMember(owner = "client!gaa", name = "c", descriptor = "(B)V")
	public static void method2796() {
		Static164.aClass5_Sub3_Sub1_2.anInt4960 = 0;
		Static13.aClass150_11 = null;
		Static385.anInt7006 = 0;
		Static319.anInt6170 = 0;
		Static473.aClass150_200 = null;
		Static448.aClass150_190 = null;
		Static203.aClass150_90 = null;
		Static34.anInt869 = 0;
		Static131.aClass5_Sub3_Sub1_1.anInt4960 = 0;
		Static272.method4492();
		Static303.method4987();
		for (@Pc(31) int local31 = 0; local31 < 2048; local31++) {
			Static10.aClass15_Sub2_Sub1_Sub1Array1[local31] = null;
		}
		Static35.aClass15_Sub2_Sub1_Sub1_1 = null;
		for (@Pc(45) int local45 = 0; local45 < Static310.anInt6066; local45++) {
			@Pc(52) Class15_Sub2_Sub1_Sub2 local52 = Static275.aClass5_Sub51Array1[local45].aClass15_Sub2_Sub1_Sub2_2;
			if (local52 != null) {
				local52.anInt4720 = -1;
			}
		}
		Static259.method4374();
		Static166.anInt3343 = 1;
		Static287.method4831(9);
		for (@Pc(74) int local74 = 0; local74 < 100; local74++) {
			Static345.aBooleanArray24[local74] = true;
		}
		Static439.method7184();
		Static485.aClass5_Sub38_2 = null;
		Static287.aLong157 = 0L;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Lclient!aj;II)V")
	public static void method2797(@OriginalArg(0) Class5_Sub3_Sub1 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(15) Class5_Sub41 local15 = (Class5_Sub41) Static451.aClass99_69.method2526();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt7534; local22++) {
				if (local15.aClass83Array1[local22] != null) {
					if (local15.aClass83Array1[local22].anInt2495 == 2) {
						local15.anIntArray573[local22] = -5;
					}
					if (local15.aClass83Array1[local22].anInt2495 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass83Array2[local22] != null) {
					if (local15.aClass83Array2[local22].anInt2495 == 2) {
						local15.anIntArray573[local22] = -6;
					}
					if (local15.aClass83Array2[local22].anInt2495 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg0.method527(arg1);
			arg0.method4192(0);
			@Pc(97) int local97 = arg0.anInt4960;
			arg0.method4184(local15.anInt7532);
			for (@Pc(104) int local104 = 0; local104 < local15.anInt7534; local104++) {
				if (local15.anIntArray573[local104] == 0) {
					try {
						@Pc(125) int local125 = local15.anIntArray572[local104];
						@Pc(144) Field local144;
						@Pc(147) int local147;
						if (local125 == 0) {
							local144 = (Field) local15.aClass83Array1[local104].anObject8;
							local147 = local144.getInt(null);
							arg0.method4192(0);
							arg0.method4184(local147);
						} else if (local125 == 1) {
							local144 = (Field) local15.aClass83Array1[local104].anObject8;
							local144.setInt(null, local15.anIntArray571[local104]);
							arg0.method4192(0);
						} else if (local125 == 2) {
							local144 = (Field) local15.aClass83Array1[local104].anObject8;
							local147 = local144.getModifiers();
							arg0.method4192(0);
							arg0.method4184(local147);
						}
						@Pc(212) Method local212;
						if (local125 == 3) {
							local212 = (Method) local15.aClass83Array2[local104].anObject8;
							@Pc(217) byte[][] local217 = local15.aByteArrayArrayArray16[local104];
							@Pc(221) Object[] local221 = new Object[local217.length];
							for (@Pc(223) int local223 = 0; local223 < local217.length; local223++) {
								@Pc(235) ObjectInputStream local235 = new ObjectInputStream(new ByteArrayInputStream(local217[local223]));
								local221[local223] = local235.readObject();
							}
							@Pc(254) Object local254 = local212.invoke(null, local221);
							if (local254 == null) {
								arg0.method4192(0);
							} else if (local254 instanceof Number) {
								arg0.method4192(1);
								arg0.method4203(((Number) local254).longValue());
							} else if (local254 instanceof String) {
								arg0.method4192(2);
								arg0.method4208((String) local254);
							} else {
								arg0.method4192(4);
							}
						} else if (local125 == 4) {
							local212 = (Method) local15.aClass83Array2[local104].anObject8;
							local147 = local212.getModifiers();
							arg0.method4192(0);
							arg0.method4184(local147);
						}
					} catch (@Pc(324) ClassNotFoundException local324) {
						arg0.method4192(-10);
					} catch (@Pc(330) InvalidClassException local330) {
						arg0.method4192(-11);
					} catch (@Pc(336) StreamCorruptedException local336) {
						arg0.method4192(-12);
					} catch (@Pc(342) OptionalDataException local342) {
						arg0.method4192(-13);
					} catch (@Pc(348) IllegalAccessException local348) {
						arg0.method4192(-14);
					} catch (@Pc(356) IllegalArgumentException local356) {
						arg0.method4192(-15);
					} catch (@Pc(362) InvocationTargetException local362) {
						arg0.method4192(-16);
					} catch (@Pc(368) SecurityException local368) {
						arg0.method4192(-17);
					} catch (@Pc(374) IOException local374) {
						arg0.method4192(-18);
					} catch (@Pc(380) NullPointerException local380) {
						arg0.method4192(-19);
					} catch (@Pc(386) Exception local386) {
						arg0.method4192(-20);
					} catch (@Pc(392) Throwable local392) {
						arg0.method4192(-21);
					}
				} else {
					arg0.method4192(local15.anIntArray573[local104]);
				}
			}
			arg0.method4216(local97);
			arg0.method4170(arg0.anInt4960 - local97);
			local15.method7425();
		}
	}
}
