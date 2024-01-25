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

public final class Static422 {

	@OriginalMember(owner = "client!qb", name = "ab", descriptor = "Lclient!mca;")
	public static Class1_Sub28 aClass1_Sub28_1 = new Class1_Sub28(0, -1);

	@OriginalMember(owner = "client!qb", name = "jb", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_135 = new Class319(0, 4);

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BLclient!jd;)V")
	public static void method5907(@OriginalArg(1) Class1_Sub20_Sub1 arg0) {
		@Pc(10) Class1_Sub36 local10 = (Class1_Sub36) Static258.aClass361_52.method7854();
		if (local10 == null) {
			return;
		}
		@Pc(15) boolean local15 = false;
		for (@Pc(17) int local17 = 0; local17 < local10.anInt6251; local17++) {
			if (local10.aClass23Array1[local17] != null) {
				if (local10.aClass23Array1[local17].anInt875 == 2) {
					local10.anIntArray419[local17] = -5;
				}
				if (local10.aClass23Array1[local17].anInt875 == 0) {
					local15 = true;
				}
			}
			if (local10.aClass23Array2[local17] != null) {
				if (local10.aClass23Array2[local17].anInt875 == 2) {
					local10.anIntArray419[local17] = -6;
				}
				if (local10.aClass23Array2[local17].anInt875 == 0) {
					local15 = true;
				}
			}
		}
		if (local15) {
			return;
		}
		@Pc(95) int local95 = arg0.anInt5238;
		arg0.method4421(local10.anInt6250);
		for (@Pc(102) int local102 = 0; local102 < local10.anInt6251; local102++) {
			if (local10.anIntArray419[local102] == 0) {
				try {
					@Pc(126) int local126 = local10.anIntArray420[local102];
					@Pc(138) Field local138;
					@Pc(166) int local166;
					if (local126 == 0) {
						local138 = (Field) local10.aClass23Array1[local102].anObject1;
						local166 = local138.getInt(null);
						arg0.method4378(0);
						arg0.method4421(local166);
					} else if (local126 == 1) {
						local138 = (Field) local10.aClass23Array1[local102].anObject1;
						local138.setInt(null, local10.anIntArray418[local102]);
						arg0.method4378(0);
					} else if (local126 == 2) {
						local138 = (Field) local10.aClass23Array1[local102].anObject1;
						local166 = local138.getModifiers();
						arg0.method4378(0);
						arg0.method4421(local166);
					}
					@Pc(205) Method local205;
					if (local126 == 3) {
						local205 = (Method) local10.aClass23Array2[local102].anObject1;
						@Pc(210) byte[][] local210 = local10.aByteArrayArrayArray6[local102];
						@Pc(214) Object[] local214 = new Object[local210.length];
						for (@Pc(216) int local216 = 0; local216 < local210.length; local216++) {
							@Pc(228) ObjectInputStream local228 = new ObjectInputStream(new ByteArrayInputStream(local210[local216]));
							local214[local216] = local228.readObject();
						}
						@Pc(247) Object local247 = local205.invoke(null, local214);
						if (local247 == null) {
							arg0.method4378(0);
						} else if (local247 instanceof Number) {
							arg0.method4378(1);
							arg0.method4380(((Number) local247).longValue());
						} else if (local247 instanceof String) {
							arg0.method4378(2);
							arg0.method4399((String) local247);
						} else {
							arg0.method4378(4);
						}
					} else if (local126 == 4) {
						local205 = (Method) local10.aClass23Array2[local102].anObject1;
						local166 = local205.getModifiers();
						arg0.method4378(0);
						arg0.method4421(local166);
					}
				} catch (@Pc(315) ClassNotFoundException local315) {
					arg0.method4378(-10);
				} catch (@Pc(321) InvalidClassException local321) {
					arg0.method4378(-11);
				} catch (@Pc(327) StreamCorruptedException local327) {
					arg0.method4378(-12);
				} catch (@Pc(333) OptionalDataException local333) {
					arg0.method4378(-13);
				} catch (@Pc(339) IllegalAccessException local339) {
					arg0.method4378(-14);
				} catch (@Pc(345) IllegalArgumentException local345) {
					arg0.method4378(-15);
				} catch (@Pc(351) InvocationTargetException local351) {
					arg0.method4378(-16);
				} catch (@Pc(357) SecurityException local357) {
					arg0.method4378(-17);
				} catch (@Pc(363) IOException local363) {
					arg0.method4378(-18);
				} catch (@Pc(369) NullPointerException local369) {
					arg0.method4378(-19);
				} catch (@Pc(375) Exception local375) {
					arg0.method4378(-20);
				} catch (@Pc(381) Throwable local381) {
					arg0.method4378(-21);
				}
			} else {
				arg0.method4378(local10.anIntArray419[local102]);
			}
		}
		arg0.method4418(local95);
		local10.method7878();
	}
}
