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

public final class Static7 {

	@OriginalMember(owner = "client!ag", name = "K", descriptor = "Lclient!nb;")
	public static Class1_Sub1_Sub6_Sub1 aClass1_Sub1_Sub6_Sub1_1;

	@OriginalMember(owner = "client!ag", name = "R", descriptor = "I")
	public static int anInt189;

	@OriginalMember(owner = "client!ag", name = "v", descriptor = "Lclient!kh;")
	public static Class60 aClass60_70 = Static200.method3116("Mem:");

	@OriginalMember(owner = "client!ag", name = "C", descriptor = "I")
	public static int anInt182 = 0;

	@OriginalMember(owner = "client!ag", name = "D", descriptor = "I")
	public static int anInt183 = 0;

	@OriginalMember(owner = "client!ag", name = "F", descriptor = "Lclient!kh;")
	public static Class60 aClass60_71 = Static200.method3116("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!ag", name = "H", descriptor = "[[I")
	public static int[][] anIntArrayArray5 = new int[104][104];

	@OriginalMember(owner = "client!ag", name = "J", descriptor = "I")
	public static int anInt185 = 50;

	@OriginalMember(owner = "client!ag", name = "M", descriptor = "Lclient!kh;")
	public static Class60 aClass60_72 = Static200.method3116("<col=ffffff> )4 ");

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)I")
	public static int method142(@OriginalArg(0) int arg0) {
		@Pc(7) Class1_Sub1_Sub28 local7 = Static143.method2450(arg0);
		@Pc(10) int local10 = local7.anInt4659;
		@Pc(18) int local18 = local7.anInt4665;
		@Pc(21) int local21 = local7.anInt4662;
		@Pc(28) int local28 = Class1_Sub10.anIntArray187[local18 - local21];
		return local28 & Static126.anIntArray358[local10] >> local21;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILclient!eg;I)V")
	public static void method143(@OriginalArg(1) Class1_Sub9_Sub1 arg0) {
		while (true) {
			@Pc(14) Class1_Sub18 local14 = (Class1_Sub18) Static13.aClass19_1.method609();
			if (local14 == null) {
				return;
			}
			@Pc(19) boolean local19 = false;
			for (@Pc(21) int local21 = 0; local21 < local14.anInt2895; local21++) {
				if (local14.aClass36Array2[local21] != null) {
					if (local14.aClass36Array2[local21].anInt1500 == 2) {
						local14.anIntArray378[local21] = -5;
					}
					if (local14.aClass36Array2[local21].anInt1500 == 0) {
						local19 = true;
					}
				}
				if (local14.aClass36Array1[local21] != null) {
					if (local14.aClass36Array1[local21].anInt1500 == 2) {
						local14.anIntArray378[local21] = -6;
					}
					if (local14.aClass36Array1[local21].anInt1500 == 0) {
						local19 = true;
					}
				}
			}
			if (local19) {
				return;
			}
			arg0.method953(56);
			arg0.method899(0);
			@Pc(102) int local102 = arg0.anInt1192;
			arg0.method921(local14.anInt2896);
			for (@Pc(109) int local109 = 0; local109 < local14.anInt2895; local109++) {
				if (local14.anIntArray378[local109] == 0) {
					try {
						@Pc(133) int local133 = local14.anIntArray377[local109];
						@Pc(142) Field local142;
						@Pc(146) int local146;
						if (local133 == 0) {
							local142 = (Field) local14.aClass36Array2[local109].anObject2;
							local146 = local142.getInt(null);
							arg0.method899(0);
							arg0.method921(local146);
						} else if (local133 == 1) {
							local142 = (Field) local14.aClass36Array2[local109].anObject2;
							local142.setInt(null, local14.anIntArray379[local109]);
							arg0.method899(0);
						} else if (local133 == 2) {
							local142 = (Field) local14.aClass36Array2[local109].anObject2;
							local146 = local142.getModifiers();
							arg0.method899(0);
							arg0.method921(local146);
						}
						@Pc(219) Method local219;
						if (local133 == 3) {
							local219 = (Method) local14.aClass36Array1[local109].anObject2;
							@Pc(244) byte[][] local244 = local14.aByteArrayArrayArray5[local109];
							@Pc(248) Object[] local248 = new Object[local244.length];
							for (@Pc(250) int local250 = 0; local250 < local244.length; local250++) {
								@Pc(262) ObjectInputStream local262 = new ObjectInputStream(new ByteArrayInputStream(local244[local250]));
								local248[local250] = local262.readObject();
							}
							@Pc(281) Object local281 = local219.invoke(null, local248);
							if (local281 == null) {
								arg0.method899(0);
							} else if (local281 instanceof Number) {
								arg0.method899(1);
								arg0.method897(((Number) local281).longValue());
							} else if (local281 instanceof Class60) {
								arg0.method899(2);
								arg0.method924((Class60) local281);
							} else {
								arg0.method899(4);
							}
						} else if (local133 == 4) {
							local219 = (Method) local14.aClass36Array1[local109].anObject2;
							local146 = local219.getModifiers();
							arg0.method899(0);
							arg0.method921(local146);
						}
					} catch (@Pc(326) ClassNotFoundException local326) {
						arg0.method899(-10);
					} catch (@Pc(332) InvalidClassException local332) {
						arg0.method899(-11);
					} catch (@Pc(338) StreamCorruptedException local338) {
						arg0.method899(-12);
					} catch (@Pc(344) OptionalDataException local344) {
						arg0.method899(-13);
					} catch (@Pc(350) IllegalAccessException local350) {
						arg0.method899(-14);
					} catch (@Pc(356) IllegalArgumentException local356) {
						arg0.method899(-15);
					} catch (@Pc(362) InvocationTargetException local362) {
						arg0.method899(-16);
					} catch (@Pc(368) SecurityException local368) {
						arg0.method899(-17);
					} catch (@Pc(374) IOException local374) {
						arg0.method899(-18);
					} catch (@Pc(380) NullPointerException local380) {
						arg0.method899(-19);
					} catch (@Pc(386) Exception local386) {
						arg0.method899(-20);
					} catch (@Pc(392) Throwable local392) {
						arg0.method899(-21);
					}
				} else {
					arg0.method899(local14.anIntArray378[local109]);
				}
			}
			arg0.method918(local102);
			arg0.method904(arg0.anInt1192 - local102);
			local14.method3530();
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLclient!nc;)Lclient!kh;")
	public static Class60 method144(@OriginalArg(1) Class1_Sub9 arg0) {
		return Static126.method2126(arg0);
	}

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "(B)V")
	public static void method146() {
		Static52.aClass39_9.method1158();
	}
}
