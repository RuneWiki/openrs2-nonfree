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

public final class Static260 {

	@OriginalMember(owner = "client!iu", name = "K", descriptor = "[Lclient!st;")
	public static Class328[] aClass328Array1;

	@OriginalMember(owner = "client!iu", name = "L", descriptor = "I")
	public static int anInt4564;

	@OriginalMember(owner = "client!iu", name = "H", descriptor = "I")
	public static int anInt4561 = 0;

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lclient!js;Z)V")
	public static void method3777(@OriginalArg(0) Class14_Sub29_Sub1 arg0) {
		@Pc(10) Class14_Sub28 local10 = (Class14_Sub28) Static663.aClass262_75.method6318();
		if (local10 == null) {
			return;
		}
		@Pc(15) boolean local15 = false;
		for (@Pc(17) int local17 = 0; local17 < local10.anInt4734; local17++) {
			if (local10.aClass150Array1[local17] != null) {
				if (local10.aClass150Array1[local17].anInt4247 == 2) {
					local10.anIntArray380[local17] = -5;
				}
				if (local10.aClass150Array1[local17].anInt4247 == 0) {
					local15 = true;
				}
			}
			if (local10.aClass150Array2[local17] != null) {
				if (local10.aClass150Array2[local17].anInt4247 == 2) {
					local10.anIntArray380[local17] = -6;
				}
				if (local10.aClass150Array2[local17].anInt4247 == 0) {
					local15 = true;
				}
			}
		}
		if (local15) {
			return;
		}
		@Pc(88) int local88 = arg0.anInt7264;
		arg0.method5861(local10.anInt4733);
		for (@Pc(95) int local95 = 0; local95 < local10.anInt4734; local95++) {
			if (local10.anIntArray380[local95] == 0) {
				try {
					@Pc(119) int local119 = local10.anIntArray382[local95];
					@Pc(131) Field local131;
					@Pc(135) int local135;
					if (local119 == 0) {
						local131 = (Field) local10.aClass150Array1[local95].anObject8;
						local135 = local131.getInt((Object) null);
						arg0.method5854(0);
						arg0.method5861(local135);
					} else if (local119 == 1) {
						local131 = (Field) local10.aClass150Array1[local95].anObject8;
						local131.setInt((Object) null, local10.anIntArray381[local95]);
						arg0.method5854(0);
					} else if (local119 == 2) {
						local131 = (Field) local10.aClass150Array1[local95].anObject8;
						local135 = local131.getModifiers();
						arg0.method5854(0);
						arg0.method5861(local135);
					}
					@Pc(201) Method local201;
					if (local119 == 3) {
						local201 = (Method) local10.aClass150Array2[local95].anObject8;
						@Pc(206) byte[][] local206 = local10.aByteArrayArrayArray8[local95];
						@Pc(210) Object[] local210 = new Object[local206.length];
						for (@Pc(212) int local212 = 0; local212 < local206.length; local212++) {
							@Pc(224) ObjectInputStream local224 = new ObjectInputStream(new ByteArrayInputStream(local206[local212]));
							local210[local212] = local224.readObject();
						}
						@Pc(239) Object local239 = local201.invoke((Object) null, local210);
						if (local239 == null) {
							arg0.method5854(0);
						} else if (local239 instanceof Number) {
							arg0.method5854(1);
							arg0.method5905(((Number) local239).longValue());
						} else if (local239 instanceof String) {
							arg0.method5854(2);
							arg0.method5855((String) local239);
						} else {
							arg0.method5854(4);
						}
					} else if (local119 == 4) {
						local201 = (Method) local10.aClass150Array2[local95].anObject8;
						local135 = local201.getModifiers();
						arg0.method5854(0);
						arg0.method5861(local135);
					}
				} catch (@Pc(305) ClassNotFoundException local305) {
					arg0.method5854(-10);
				} catch (@Pc(311) InvalidClassException local311) {
					arg0.method5854(-11);
				} catch (@Pc(317) StreamCorruptedException local317) {
					arg0.method5854(-12);
				} catch (@Pc(323) OptionalDataException local323) {
					arg0.method5854(-13);
				} catch (@Pc(329) IllegalAccessException local329) {
					arg0.method5854(-14);
				} catch (@Pc(335) IllegalArgumentException local335) {
					arg0.method5854(-15);
				} catch (@Pc(341) InvocationTargetException local341) {
					arg0.method5854(-16);
				} catch (@Pc(347) SecurityException local347) {
					arg0.method5854(-17);
				} catch (@Pc(353) IOException local353) {
					arg0.method5854(-18);
				} catch (@Pc(359) NullPointerException local359) {
					arg0.method5854(-19);
				} catch (@Pc(365) Exception local365) {
					arg0.method5854(-20);
				} catch (@Pc(371) Throwable local371) {
					arg0.method5854(-21);
				}
			} else {
				arg0.method5854(local10.anIntArray380[local95]);
			}
		}
		arg0.method5844(local88);
		local10.method9315();
	}
}
