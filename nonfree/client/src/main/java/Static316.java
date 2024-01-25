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

public final class Static316 {

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "I")
	public static int anInt5908;

	@OriginalMember(owner = "client!pq", name = "i", descriptor = "[Lclient!sh;")
	public static Class230[] aClass230Array2;

	@OriginalMember(owner = "client!pq", name = "u", descriptor = "F")
	public static float aFloat91;

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "Z")
	public static boolean aBoolean374 = false;

	@OriginalMember(owner = "client!pq", name = "j", descriptor = "I")
	public static int anInt5912 = 0;

	@OriginalMember(owner = "client!pq", name = "o", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_141 = new Class263(62, 12);

	@OriginalMember(owner = "client!pq", name = "q", descriptor = "I")
	public static int anInt5918 = 0;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IBLclient!ap;)V")
	public static void method4522(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub3_Sub1 arg1) {
		while (true) {
			@Pc(18) Class1_Sub13 local18 = (Class1_Sub13) Static277.aClass203_41.method4548();
			if (local18 == null) {
				return;
			}
			@Pc(23) boolean local23 = false;
			for (@Pc(25) int local25 = 0; local25 < local18.anInt2345; local25++) {
				if (local18.aClass157Array2[local25] != null) {
					if (local18.aClass157Array2[local25].anInt4667 == 2) {
						local18.anIntArray262[local25] = -5;
					}
					if (local18.aClass157Array2[local25].anInt4667 == 0) {
						local23 = true;
					}
				}
				if (local18.aClass157Array1[local25] != null) {
					if (local18.aClass157Array1[local25].anInt4667 == 2) {
						local18.anIntArray262[local25] = -6;
					}
					if (local18.aClass157Array1[local25].anInt4667 == 0) {
						local23 = true;
					}
				}
			}
			if (local23) {
				return;
			}
			arg1.method322(arg0);
			arg1.method1208(0);
			@Pc(107) int local107 = arg1.anInt1710;
			arg1.method1197(local18.anInt2343);
			for (@Pc(114) int local114 = 0; local114 < local18.anInt2345; local114++) {
				if (local18.anIntArray262[local114] == 0) {
					try {
						@Pc(138) int local138 = local18.anIntArray261[local114];
						@Pc(150) Field local150;
						@Pc(154) int local154;
						if (local138 == 0) {
							local150 = (Field) local18.aClass157Array2[local114].anObject13;
							local154 = local150.getInt(null);
							arg1.method1208(0);
							arg1.method1197(local154);
						} else if (local138 == 1) {
							local150 = (Field) local18.aClass157Array2[local114].anObject13;
							local150.setInt(null, local18.anIntArray260[local114]);
							arg1.method1208(0);
						} else if (local138 == 2) {
							local150 = (Field) local18.aClass157Array2[local114].anObject13;
							local154 = local150.getModifiers();
							arg1.method1208(0);
							arg1.method1197(local154);
						}
						@Pc(222) Method local222;
						if (local138 == 3) {
							local222 = (Method) local18.aClass157Array1[local114].anObject13;
							@Pc(227) byte[][] local227 = local18.aByteArrayArrayArray13[local114];
							@Pc(231) Object[] local231 = new Object[local227.length];
							for (@Pc(233) int local233 = 0; local233 < local227.length; local233++) {
								@Pc(245) ObjectInputStream local245 = new ObjectInputStream(new ByteArrayInputStream(local227[local233]));
								local231[local233] = local245.readObject();
							}
							@Pc(260) Object local260 = local222.invoke(null, local231);
							if (local260 == null) {
								arg1.method1208(0);
							} else if (local260 instanceof Number) {
								arg1.method1208(1);
								arg1.method1180(((Number) local260).longValue());
							} else if (local260 instanceof String) {
								arg1.method1208(2);
								arg1.method1190((String) local260);
							} else {
								arg1.method1208(4);
							}
						} else if (local138 == 4) {
							local222 = (Method) local18.aClass157Array1[local114].anObject13;
							local154 = local222.getModifiers();
							arg1.method1208(0);
							arg1.method1197(local154);
						}
					} catch (@Pc(326) ClassNotFoundException local326) {
						arg1.method1208(-10);
					} catch (@Pc(332) InvalidClassException local332) {
						arg1.method1208(-11);
					} catch (@Pc(338) StreamCorruptedException local338) {
						arg1.method1208(-12);
					} catch (@Pc(344) OptionalDataException local344) {
						arg1.method1208(-13);
					} catch (@Pc(350) IllegalAccessException local350) {
						arg1.method1208(-14);
					} catch (@Pc(356) IllegalArgumentException local356) {
						arg1.method1208(-15);
					} catch (@Pc(362) InvocationTargetException local362) {
						arg1.method1208(-16);
					} catch (@Pc(368) SecurityException local368) {
						arg1.method1208(-17);
					} catch (@Pc(374) IOException local374) {
						arg1.method1208(-18);
					} catch (@Pc(380) NullPointerException local380) {
						arg1.method1208(-19);
					} catch (@Pc(386) Exception local386) {
						arg1.method1208(-20);
					} catch (@Pc(392) Throwable local392) {
						arg1.method1208(-21);
					}
				} else {
					arg1.method1208(local18.anIntArray262[local114]);
				}
			}
			arg1.method1192(local107);
			arg1.method1185(arg1.anInt1710 - local107);
			local18.method6178();
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IBI)I")
	public static int method4526(@OriginalArg(2) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(41) int local41 = (arg0 & 0x7F) * 96 >> 7;
			if (local41 < 2) {
				local41 = 2;
			} else if (local41 > 126) {
				local41 = 126;
			}
			return (arg0 & 0xFF80) + local41;
		}
	}
}
