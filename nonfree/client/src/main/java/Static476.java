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

public final class Static476 {

	@OriginalMember(owner = "client!raa", name = "w", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!raa", name = "y", descriptor = "I")
	public static int anInt8913;

	@OriginalMember(owner = "client!raa", name = "p", descriptor = "Lclient!ol;")
	public static final Class247 aClass247_1 = new Class247();

	@OriginalMember(owner = "client!raa", name = "x", descriptor = "J")
	public static long aLong218 = 0L;

	@OriginalMember(owner = "client!raa", name = "A", descriptor = "J")
	public static long aLong219 = 0L;

	@OriginalMember(owner = "client!raa", name = "B", descriptor = "I")
	public static int anInt8915 = 0;

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(BLclient!ua;)V")
	public static void method7472(@OriginalArg(1) Class2_Sub11_Sub2 arg0) {
		@Pc(10) Class2_Sub10 local10 = (Class2_Sub10) Static489.aClass341_58.method8524();
		if (local10 == null) {
			return;
		}
		@Pc(15) boolean local15 = false;
		for (@Pc(17) int local17 = 0; local17 < local10.anInt1927; local17++) {
			if (local10.aClass240Array2[local17] != null) {
				if (local10.aClass240Array2[local17].anInt7566 == 2) {
					local10.anIntArray81[local17] = -5;
				}
				if (local10.aClass240Array2[local17].anInt7566 == 0) {
					local15 = true;
				}
			}
			if (local10.aClass240Array1[local17] != null) {
				if (local10.aClass240Array1[local17].anInt7566 == 2) {
					local10.anIntArray81[local17] = -6;
				}
				if (local10.aClass240Array1[local17].anInt7566 == 0) {
					local15 = true;
				}
			}
		}
		if (local15) {
			return;
		}
		@Pc(92) int local92 = arg0.anInt10066;
		arg0.method8387(local10.anInt1929);
		for (@Pc(99) int local99 = 0; local99 < local10.anInt1927; local99++) {
			if (local10.anIntArray81[local99] == 0) {
				try {
					@Pc(120) int local120 = local10.anIntArray82[local99];
					@Pc(137) Field local137;
					@Pc(163) int local163;
					if (local120 == 0) {
						local137 = (Field) local10.aClass240Array2[local99].anObject13;
						local163 = local137.getInt(null);
						arg0.method8374(0);
						arg0.method8387(local163);
					} else if (local120 == 1) {
						local137 = (Field) local10.aClass240Array2[local99].anObject13;
						local137.setInt(null, local10.anIntArray83[local99]);
						arg0.method8374(0);
					} else if (local120 == 2) {
						local137 = (Field) local10.aClass240Array2[local99].anObject13;
						local163 = local137.getModifiers();
						arg0.method8374(0);
						arg0.method8387(local163);
					}
					@Pc(202) Method local202;
					if (local120 == 3) {
						local202 = (Method) local10.aClass240Array1[local99].anObject13;
						@Pc(207) byte[][] local207 = local10.aByteArrayArrayArray3[local99];
						@Pc(211) Object[] local211 = new Object[local207.length];
						for (@Pc(213) int local213 = 0; local213 < local207.length; local213++) {
							@Pc(225) ObjectInputStream local225 = new ObjectInputStream(new ByteArrayInputStream(local207[local213]));
							local211[local213] = local225.readObject();
						}
						@Pc(240) Object local240 = local202.invoke(null, local211);
						if (local240 == null) {
							arg0.method8374(0);
						} else if (local240 instanceof Number) {
							arg0.method8374(1);
							arg0.method8388(((Number) local240).longValue());
						} else if (local240 instanceof String) {
							arg0.method8374(2);
							arg0.method8329((String) local240);
						} else {
							arg0.method8374(4);
						}
					} else if (local120 == 4) {
						local202 = (Method) local10.aClass240Array1[local99].anObject13;
						local163 = local202.getModifiers();
						arg0.method8374(0);
						arg0.method8387(local163);
					}
				} catch (@Pc(306) ClassNotFoundException local306) {
					arg0.method8374(-10);
				} catch (@Pc(312) InvalidClassException local312) {
					arg0.method8374(-11);
				} catch (@Pc(318) StreamCorruptedException local318) {
					arg0.method8374(-12);
				} catch (@Pc(324) OptionalDataException local324) {
					arg0.method8374(-13);
				} catch (@Pc(330) IllegalAccessException local330) {
					arg0.method8374(-14);
				} catch (@Pc(336) IllegalArgumentException local336) {
					arg0.method8374(-15);
				} catch (@Pc(342) InvocationTargetException local342) {
					arg0.method8374(-16);
				} catch (@Pc(348) SecurityException local348) {
					arg0.method8374(-17);
				} catch (@Pc(354) IOException local354) {
					arg0.method8374(-18);
				} catch (@Pc(360) NullPointerException local360) {
					arg0.method8374(-19);
				} catch (@Pc(366) Exception local366) {
					arg0.method8374(-20);
				} catch (@Pc(372) Throwable local372) {
					arg0.method8374(-21);
				}
			} else {
				arg0.method8374(local10.anIntArray81[local99]);
			}
		}
		arg0.method8340(local92);
		local10.method9253();
	}
}
