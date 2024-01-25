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

public final class Static200 {

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(BII)V")
	public static void method2511(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static537.aClass112_11.method2078(Static229.aClass159_26.method2776(Static261.anInt4297));
		@Pc(24) int local24;
		for (@Pc(18) Class2_Sub27 local18 = (Class2_Sub27) Static411.aClass70_43.method1264(); local18 != null; local18 = (Class2_Sub27) Static411.aClass70_43.method1261()) {
			local24 = Static147.method2015(local18);
			if (local13 < local24) {
				local13 = local24;
			}
		}
		local13 += 8;
		local24 = Static484.anInt7715 * 16 + 21;
		@Pc(54) int local54 = arg0 - local13 / 2;
		if (local54 + local13 > Static172.anInt2621) {
			local54 = Static172.anInt2621 - local13;
		}
		if (local54 < 0) {
			local54 = 0;
		}
		@Pc(73) int local73 = arg1;
		if (Static187.anInt8962 < local24 + arg1) {
			local73 = Static187.anInt8962 - local24;
		}
		if (local73 < 0) {
			local73 = 0;
		}
		Static214.anInt3100 = local54;
		Static428.anInt6943 = local13;
		Static524.anInt8323 = (Static321.aBoolean428 ? 26 : 22) + Static484.anInt7715 * 16;
		Static312.anInt5139 = local73;
		Static572.aBoolean774 = true;
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(BLclient!lr;)V")
	public static void method2513(@OriginalArg(1) Class2_Sub7_Sub2 arg0) {
		@Pc(10) Class2_Sub22 local10 = (Class2_Sub22) Static148.aClass70_6.method1264();
		if (local10 == null) {
			return;
		}
		@Pc(15) boolean local15 = false;
		for (@Pc(17) int local17 = 0; local17 < local10.anInt3099; local17++) {
			if (local10.aClass5Array2[local17] != null) {
				if (local10.aClass5Array2[local17].anInt151 == 2) {
					local10.anIntArray261[local17] = -5;
				}
				if (local10.aClass5Array2[local17].anInt151 == 0) {
					local15 = true;
				}
			}
			if (local10.aClass5Array1[local17] != null) {
				if (local10.aClass5Array1[local17].anInt151 == 2) {
					local10.anIntArray261[local17] = -6;
				}
				if (local10.aClass5Array1[local17].anInt151 == 0) {
					local15 = true;
				}
			}
		}
		if (local15) {
			return;
		}
		@Pc(83) int local83 = arg0.anInt5186;
		arg0.method4495(local10.anInt3104);
		for (@Pc(96) int local96 = 0; local96 < local10.anInt3099; local96++) {
			if (local10.anIntArray261[local96] == 0) {
				try {
					@Pc(120) int local120 = local10.anIntArray260[local96];
					@Pc(129) Field local129;
					@Pc(133) int local133;
					if (local120 == 0) {
						local129 = (Field) local10.aClass5Array2[local96].anObject1;
						local133 = local129.getInt(null);
						arg0.method4459(0);
						arg0.method4495(local133);
					} else if (local120 == 1) {
						local129 = (Field) local10.aClass5Array2[local96].anObject1;
						local129.setInt(null, local10.anIntArray262[local96]);
						arg0.method4459(0);
					} else if (local120 == 2) {
						local129 = (Field) local10.aClass5Array2[local96].anObject1;
						local133 = local129.getModifiers();
						arg0.method4459(0);
						arg0.method4495(local133);
					}
					@Pc(205) Method local205;
					if (local120 == 3) {
						local205 = (Method) local10.aClass5Array1[local96].anObject1;
						@Pc(210) byte[][] local210 = local10.aByteArrayArrayArray13[local96];
						@Pc(214) Object[] local214 = new Object[local210.length];
						for (@Pc(216) int local216 = 0; local216 < local210.length; local216++) {
							@Pc(228) ObjectInputStream local228 = new ObjectInputStream(new ByteArrayInputStream(local210[local216]));
							local214[local216] = local228.readObject();
						}
						@Pc(247) Object local247 = local205.invoke(null, local214);
						if (local247 == null) {
							arg0.method4459(0);
						} else if (local247 instanceof Number) {
							arg0.method4459(1);
							arg0.method4493(((Number) local247).longValue());
						} else if (local247 instanceof String) {
							arg0.method4459(2);
							arg0.method4481((String) local247);
						} else {
							arg0.method4459(4);
						}
					} else if (local120 == 4) {
						local205 = (Method) local10.aClass5Array1[local96].anObject1;
						local133 = local205.getModifiers();
						arg0.method4459(0);
						arg0.method4495(local133);
					}
				} catch (@Pc(317) ClassNotFoundException local317) {
					arg0.method4459(-10);
				} catch (@Pc(323) InvalidClassException local323) {
					arg0.method4459(-11);
				} catch (@Pc(331) StreamCorruptedException local331) {
					arg0.method4459(-12);
				} catch (@Pc(337) OptionalDataException local337) {
					arg0.method4459(-13);
				} catch (@Pc(345) IllegalAccessException local345) {
					arg0.method4459(-14);
				} catch (@Pc(351) IllegalArgumentException local351) {
					arg0.method4459(-15);
				} catch (@Pc(357) InvocationTargetException local357) {
					arg0.method4459(-16);
				} catch (@Pc(363) SecurityException local363) {
					arg0.method4459(-17);
				} catch (@Pc(369) IOException local369) {
					arg0.method4459(-18);
				} catch (@Pc(375) NullPointerException local375) {
					arg0.method4459(-19);
				} catch (@Pc(383) Exception local383) {
					arg0.method4459(-20);
				} catch (@Pc(389) Throwable local389) {
					arg0.method4459(-21);
				}
			} else {
				arg0.method4459(local10.anIntArray261[local96]);
			}
		}
		arg0.method4516(local83);
		local10.method7657();
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(IBI)Z")
	public static boolean method2514(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}
}
