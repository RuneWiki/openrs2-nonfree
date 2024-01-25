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

public final class Static62 {

	@OriginalMember(owner = "client!cv", name = "M", descriptor = "Lclient!mn;")
	public static Class171 aClass171_14;

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IBLclient!tq;)V")
	public static void method1003(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub17_Sub1 arg1) {
		while (true) {
			@Pc(18) Class2_Sub30 local18 = (Class2_Sub30) Static242.aClass181_16.method3972();
			if (local18 == null) {
				return;
			}
			@Pc(23) boolean local23 = false;
			for (@Pc(25) int local25 = 0; local25 < local18.anInt5146; local25++) {
				if (local18.aClass136Array1[local25] != null) {
					if (local18.aClass136Array1[local25].anInt3418 == 2) {
						local18.anIntArray431[local25] = -5;
					}
					if (local18.aClass136Array1[local25].anInt3418 == 0) {
						local23 = true;
					}
				}
				if (local18.aClass136Array2[local25] != null) {
					if (local18.aClass136Array2[local25].anInt3418 == 2) {
						local18.anIntArray431[local25] = -6;
					}
					if (local18.aClass136Array2[local25].anInt3418 == 0) {
						local23 = true;
					}
				}
			}
			if (local23) {
				return;
			}
			arg1.method5576(arg0);
			arg1.method6172(0);
			@Pc(105) int local105 = arg1.anInt7523;
			arg1.method6170(local18.anInt5144);
			for (@Pc(112) int local112 = 0; local112 < local18.anInt5146; local112++) {
				if (local18.anIntArray431[local112] == 0) {
					try {
						@Pc(133) int local133 = local18.anIntArray433[local112];
						@Pc(148) Field local148;
						@Pc(174) int local174;
						if (local133 == 0) {
							local148 = (Field) local18.aClass136Array1[local112].anObject10;
							local174 = local148.getInt(null);
							arg1.method6172(0);
							arg1.method6170(local174);
						} else if (local133 == 1) {
							local148 = (Field) local18.aClass136Array1[local112].anObject10;
							local148.setInt(null, local18.anIntArray432[local112]);
							arg1.method6172(0);
						} else if (local133 == 2) {
							local148 = (Field) local18.aClass136Array1[local112].anObject10;
							local174 = local148.getModifiers();
							arg1.method6172(0);
							arg1.method6170(local174);
						}
						@Pc(213) Method local213;
						if (local133 == 3) {
							local213 = (Method) local18.aClass136Array2[local112].anObject10;
							@Pc(218) byte[][] local218 = local18.aByteArrayArrayArray14[local112];
							@Pc(222) Object[] local222 = new Object[local218.length];
							for (@Pc(224) int local224 = 0; local224 < local218.length; local224++) {
								@Pc(236) ObjectInputStream local236 = new ObjectInputStream(new ByteArrayInputStream(local218[local224]));
								local222[local224] = local236.readObject();
							}
							@Pc(255) Object local255 = local213.invoke(null, local222);
							if (local255 == null) {
								arg1.method6172(0);
							} else if (local255 instanceof Number) {
								arg1.method6172(1);
								arg1.method6132(((Number) local255).longValue());
							} else if (local255 instanceof String) {
								arg1.method6172(2);
								arg1.method6151((String) local255);
							} else {
								arg1.method6172(4);
							}
						} else if (local133 == 4) {
							local213 = (Method) local18.aClass136Array2[local112].anObject10;
							local174 = local213.getModifiers();
							arg1.method6172(0);
							arg1.method6170(local174);
						}
					} catch (@Pc(323) ClassNotFoundException local323) {
						arg1.method6172(-10);
					} catch (@Pc(329) InvalidClassException local329) {
						arg1.method6172(-11);
					} catch (@Pc(335) StreamCorruptedException local335) {
						arg1.method6172(-12);
					} catch (@Pc(341) OptionalDataException local341) {
						arg1.method6172(-13);
					} catch (@Pc(347) IllegalAccessException local347) {
						arg1.method6172(-14);
					} catch (@Pc(353) IllegalArgumentException local353) {
						arg1.method6172(-15);
					} catch (@Pc(359) InvocationTargetException local359) {
						arg1.method6172(-16);
					} catch (@Pc(365) SecurityException local365) {
						arg1.method6172(-17);
					} catch (@Pc(371) IOException local371) {
						arg1.method6172(-18);
					} catch (@Pc(377) NullPointerException local377) {
						arg1.method6172(-19);
					} catch (@Pc(383) Exception local383) {
						arg1.method6172(-20);
					} catch (@Pc(389) Throwable local389) {
						arg1.method6172(-21);
					}
				} else {
					arg1.method6172(local18.anIntArray431[local112]);
				}
			}
			arg1.method6163(local105);
			arg1.method6131(arg1.anInt7523 - local105);
			local18.method6260();
		}
	}
}
