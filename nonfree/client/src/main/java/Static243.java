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

public final class Static243 {

	@OriginalMember(owner = "client!rl", name = "o", descriptor = "I")
	public static int anInt4616;

	@OriginalMember(owner = "client!rl", name = "q", descriptor = "Lclient!kk;")
	public static Class108 aClass108_8;

	@OriginalMember(owner = "client!rl", name = "s", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!rl", name = "r", descriptor = "I")
	public static int anInt4618 = 0;

	@OriginalMember(owner = "client!rl", name = "t", descriptor = "I")
	public static int anInt4619 = 0;

	@OriginalMember(owner = "client!rl", name = "u", descriptor = "[I")
	public static int[] anIntArray494 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!rl", name = "x", descriptor = "Lclient!ll;")
	public static Class114 aClass114_28 = new Class114();

	@OriginalMember(owner = "client!rl", name = "y", descriptor = "I")
	public static int anInt4622 = 10;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!wa;ZI)V")
	public static void method3790(@OriginalArg(0) Class4_Sub10_Sub1 arg0) {
		while (true) {
			@Pc(16) Class4_Sub29 local16 = (Class4_Sub29) aClass114_28.method2623();
			if (local16 == null) {
				return;
			}
			@Pc(22) boolean local22 = false;
			@Pc(24) int local24;
			for (local24 = 0; local24 < local16.anInt4858; local24++) {
				if (local16.aClass185Array1[local24] != null) {
					if (local16.aClass185Array1[local24].anInt5623 == 2) {
						local16.anIntArray529[local24] = -5;
					}
					if (local16.aClass185Array1[local24].anInt5623 == 0) {
						local22 = true;
					}
				}
				if (local16.aClass185Array2[local24] != null) {
					if (local16.aClass185Array2[local24].anInt5623 == 2) {
						local16.anIntArray529[local24] = -6;
					}
					if (local16.aClass185Array2[local24].anInt5623 == 0) {
						local22 = true;
					}
				}
			}
			if (local22) {
				return;
			}
			arg0.method4687(78);
			arg0.method4618(0);
			local24 = arg0.anInt5713;
			arg0.method4654(local16.anInt4859);
			for (@Pc(114) int local114 = 0; local114 < local16.anInt4858; local114++) {
				if (local16.anIntArray529[local114] == 0) {
					try {
						@Pc(140) int local140 = local16.anIntArray527[local114];
						@Pc(149) Field local149;
						@Pc(153) int local153;
						if (local140 == 0) {
							local149 = (Field) local16.aClass185Array1[local114].anObject7;
							local153 = local149.getInt(null);
							arg0.method4618(0);
							arg0.method4654(local153);
						} else if (local140 == 1) {
							local149 = (Field) local16.aClass185Array1[local114].anObject7;
							local149.setInt(null, local16.anIntArray526[local114]);
							arg0.method4618(0);
						} else if (local140 == 2) {
							local149 = (Field) local16.aClass185Array1[local114].anObject7;
							local153 = local149.getModifiers();
							arg0.method4618(0);
							arg0.method4654(local153);
						}
						@Pc(222) Method local222;
						if (local140 == 3) {
							local222 = (Method) local16.aClass185Array2[local114].anObject7;
							@Pc(247) byte[][] local247 = local16.aByteArrayArrayArray19[local114];
							@Pc(251) Object[] local251 = new Object[local247.length];
							for (@Pc(253) int local253 = 0; local253 < local247.length; local253++) {
								@Pc(271) ObjectInputStream local271 = new ObjectInputStream(new ByteArrayInputStream(local247[local253]));
								local251[local253] = local271.readObject();
							}
							@Pc(284) Object local284 = local222.invoke(null, local251);
							if (local284 == null) {
								arg0.method4618(0);
							} else if (local284 instanceof Number) {
								arg0.method4618(1);
								arg0.method4619(((Number) local284).longValue());
							} else if (local284 instanceof String) {
								arg0.method4618(2);
								arg0.method4612((String) local284);
							} else {
								arg0.method4618(4);
							}
						} else if (local140 == 4) {
							local222 = (Method) local16.aClass185Array2[local114].anObject7;
							local153 = local222.getModifiers();
							arg0.method4618(0);
							arg0.method4654(local153);
						}
					} catch (@Pc(327) ClassNotFoundException local327) {
						arg0.method4618(-10);
					} catch (@Pc(333) InvalidClassException local333) {
						arg0.method4618(-11);
					} catch (@Pc(339) StreamCorruptedException local339) {
						arg0.method4618(-12);
					} catch (@Pc(345) OptionalDataException local345) {
						arg0.method4618(-13);
					} catch (@Pc(351) IllegalAccessException local351) {
						arg0.method4618(-14);
					} catch (@Pc(357) IllegalArgumentException local357) {
						arg0.method4618(-15);
					} catch (@Pc(363) InvocationTargetException local363) {
						arg0.method4618(-16);
					} catch (@Pc(369) SecurityException local369) {
						arg0.method4618(-17);
					} catch (@Pc(375) IOException local375) {
						arg0.method4618(-18);
					} catch (@Pc(381) NullPointerException local381) {
						arg0.method4618(-19);
					} catch (@Pc(387) Exception local387) {
						arg0.method4618(-20);
					} catch (@Pc(393) Throwable local393) {
						arg0.method4618(-21);
					}
				} else {
					arg0.method4618(local16.anIntArray529[local114]);
				}
			}
			arg0.method4658(local24);
			arg0.method4675(arg0.anInt5713 - local24);
			local16.method4854();
		}
	}
}
