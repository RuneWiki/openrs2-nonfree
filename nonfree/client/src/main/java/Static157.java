import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!th", name = "i", descriptor = "I")
	public static int anInt3889;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!th", name = "b", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1329 = Static146.method2172("Loading fonts )2 ");

	@OriginalMember(owner = "client!th", name = "f", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1330 = aClass77_1329;

	@OriginalMember(owner = "client!th", name = "h", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1331 = Static146.method2172(" )2> <col=00ffff>");

	@OriginalMember(owner = "client!th", name = "j", descriptor = "Lclient!ua;")
	public static Class82 aClass82_55 = new Class82(200);

	@OriginalMember(owner = "client!th", name = "k", descriptor = "[Lclient!wh;")
	public static Class89[] aClass89Array1 = new Class89[16];

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
	public static void method2671() {
		aClass77_1330 = null;
		aClass89Array1 = null;
		aClass77_1331 = null;
		aClass82_55 = null;
		aClass77_1329 = null;
		aCRC32_2 = null;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILclient!oa;)V")
	public static void method2672(@OriginalArg(1) Class2_Sub18 arg0) {
		@Pc(9) byte[] local9 = new byte[24];
		if (Static159.aClass89_5 != null) {
			@Pc(17) int local17;
			try {
				local17 = 0;
				Static159.aClass89_5.method3019(0L);
				Static159.aClass89_5.method3009(local9);
				while (local17 < 24 && local9[local17] == 0) {
					local17++;
				}
				if (local17 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(48) Exception local48) {
				for (local17 = 0; local17 < 24; local17++) {
					local9[local17] = -1;
				}
			}
		}
		arg0.method2340(local9, 24);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IBLclient!rg;)V")
	public static void method2673(@OriginalArg(2) Class2_Sub18_Sub1 arg0) {
		while (true) {
			@Pc(15) Class2_Sub15 local15 = (Class2_Sub15) Static13.aClass10_15.method444();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt2057; local22++) {
				if (local15.aClass78Array1[local22] != null) {
					if (local15.aClass78Array1[local22].anInt3646 == 2) {
						local15.anIntArray349[local22] = -5;
					}
					if (local15.aClass78Array1[local22].anInt3646 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass78Array2[local22] != null) {
					if (local15.aClass78Array2[local22].anInt3646 == 2) {
						local15.anIntArray349[local22] = -6;
					}
					if (local15.aClass78Array2[local22].anInt3646 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg0.method2398(155);
			arg0.method2389(0);
			@Pc(103) int local103 = arg0.anInt3423;
			arg0.method2370(local15.anInt2059);
			for (@Pc(110) int local110 = 0; local110 < local15.anInt2057; local110++) {
				if (local15.anIntArray349[local110] == 0) {
					try {
						@Pc(134) int local134 = local15.anIntArray348[local110];
						@Pc(153) Field local153;
						@Pc(156) int local156;
						if (local134 == 0) {
							local153 = (Field) local15.aClass78Array1[local110].anObject3;
							local156 = local153.getInt(null);
							arg0.method2389(0);
							arg0.method2370(local156);
						} else if (local134 == 1) {
							local153 = (Field) local15.aClass78Array1[local110].anObject3;
							local153.setInt(null, local15.anIntArray350[local110]);
							arg0.method2389(0);
						} else if (local134 == 2) {
							local153 = (Field) local15.aClass78Array1[local110].anObject3;
							local156 = local153.getModifiers();
							arg0.method2389(0);
							arg0.method2370(local156);
						}
						@Pc(217) Method local217;
						if (local134 == 3) {
							local217 = (Method) local15.aClass78Array2[local110].anObject3;
							@Pc(222) byte[][] local222 = local15.aByteArrayArrayArray3[local110];
							@Pc(226) Object[] local226 = new Object[local222.length];
							for (@Pc(228) int local228 = 0; local228 < local222.length; local228++) {
								@Pc(240) ObjectInputStream local240 = new ObjectInputStream(new ByteArrayInputStream(local222[local228]));
								local226[local228] = local240.readObject();
							}
							@Pc(259) Object local259 = local217.invoke(null, local226);
							if (local259 == null) {
								arg0.method2389(0);
							} else if (local259 instanceof Number) {
								arg0.method2389(1);
								arg0.method2384(((Number) local259).longValue());
							} else if (local259 instanceof Class77) {
								arg0.method2389(2);
								arg0.method2367((Class77) local259);
							} else {
								arg0.method2389(4);
							}
						} else if (local134 == 4) {
							local217 = (Method) local15.aClass78Array2[local110].anObject3;
							local156 = local217.getModifiers();
							arg0.method2389(0);
							arg0.method2370(local156);
						}
					} catch (@Pc(327) ClassNotFoundException local327) {
						arg0.method2389(-10);
					} catch (@Pc(333) InvalidClassException local333) {
						arg0.method2389(-11);
					} catch (@Pc(339) StreamCorruptedException local339) {
						arg0.method2389(-12);
					} catch (@Pc(345) OptionalDataException local345) {
						arg0.method2389(-13);
					} catch (@Pc(351) IllegalAccessException local351) {
						arg0.method2389(-14);
					} catch (@Pc(357) IllegalArgumentException local357) {
						arg0.method2389(-15);
					} catch (@Pc(363) InvocationTargetException local363) {
						arg0.method2389(-16);
					} catch (@Pc(369) SecurityException local369) {
						arg0.method2389(-17);
					} catch (@Pc(375) IOException local375) {
						arg0.method2389(-18);
					} catch (@Pc(381) NullPointerException local381) {
						arg0.method2389(-19);
					} catch (@Pc(387) Exception local387) {
						arg0.method2389(-20);
					} catch (@Pc(393) Throwable local393) {
						arg0.method2389(-21);
					}
				} else {
					arg0.method2389(local15.anIntArray349[local110]);
				}
			}
			arg0.method2394(local103);
			arg0.method2371(arg0.anInt3423 - local103);
			local15.method3004();
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(B)V")
	public static void method2674() {
		for (@Pc(14) Class2_Sub10 local14 = (Class2_Sub10) Static177.aClass74_12.method2430(); local14 != null; local14 = (Class2_Sub10) Static177.aClass74_12.method2435()) {
			@Pc(19) int local19 = local14.anInt1896;
			if (Static40.method798(local19)) {
				@Pc(25) boolean local25 = true;
				@Pc(29) Class66[] local29 = Static125.aClass66ArrayArray1[local19];
				for (@Pc(31) int local31 = 0; local31 < local29.length; local31++) {
					if (local29[local31] != null) {
						local25 = local29[local31].aBoolean131;
						break;
					}
				}
				if (!local25) {
					@Pc(55) int local55 = (int) local14.aLong134;
					@Pc(59) Class66 local59 = Static55.method1034(local55);
					if (local59 != null) {
						Static57.method2994(local59);
					}
				}
			}
		}
	}
}
