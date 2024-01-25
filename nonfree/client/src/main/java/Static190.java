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

public final class Static190 {

	@OriginalMember(owner = "client!mi", name = "t", descriptor = "I")
	public static int anInt3778;

	@OriginalMember(owner = "client!mi", name = "B", descriptor = "Lclient!tc;")
	public static Class91 aClass91_8;

	@OriginalMember(owner = "client!mi", name = "J", descriptor = "Lclient!ra;")
	public static Class170 aClass170_72;

	@OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
	public static int anInt3772 = 3;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IBLclient!ae;)V")
	public static void method3479(@OriginalArg(2) Class5_Sub1_Sub1 arg0) {
		while (true) {
			@Pc(15) Class5_Sub21 local15 = (Class5_Sub21) Static148.aClass211_14.method5608();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt2422; local22++) {
				if (local15.aClass60Array2[local22] != null) {
					if (local15.aClass60Array2[local22].anInt1838 == 2) {
						local15.anIntArray145[local22] = -5;
					}
					if (local15.aClass60Array2[local22].anInt1838 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass60Array1[local22] != null) {
					if (local15.aClass60Array1[local22].anInt1838 == 2) {
						local15.anIntArray145[local22] = -6;
					}
					if (local15.aClass60Array1[local22].anInt1838 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg0.method174(48);
			arg0.method1886(0);
			@Pc(104) int local104 = arg0.anInt2029;
			arg0.method1851(local15.anInt2421);
			for (@Pc(111) int local111 = 0; local111 < local15.anInt2422; local111++) {
				if (local15.anIntArray145[local111] == 0) {
					try {
						@Pc(132) int local132 = local15.anIntArray147[local111];
						@Pc(144) Field local144;
						@Pc(148) int local148;
						if (local132 == 0) {
							local144 = (Field) local15.aClass60Array2[local111].anObject2;
							local148 = local144.getInt(null);
							arg0.method1886(0);
							arg0.method1851(local148);
						} else if (local132 == 1) {
							local144 = (Field) local15.aClass60Array2[local111].anObject2;
							local144.setInt(null, local15.anIntArray146[local111]);
							arg0.method1886(0);
						} else if (local132 == 2) {
							local144 = (Field) local15.aClass60Array2[local111].anObject2;
							local148 = local144.getModifiers();
							arg0.method1886(0);
							arg0.method1851(local148);
						}
						@Pc(219) Method local219;
						if (local132 == 3) {
							local219 = (Method) local15.aClass60Array1[local111].anObject2;
							@Pc(244) byte[][] local244 = local15.aByteArrayArrayArray13[local111];
							@Pc(248) Object[] local248 = new Object[local244.length];
							for (@Pc(250) int local250 = 0; local250 < local244.length; local250++) {
								@Pc(262) ObjectInputStream local262 = new ObjectInputStream(new ByteArrayInputStream(local244[local250]));
								local248[local250] = local262.readObject();
							}
							@Pc(277) Object local277 = local219.invoke(null, local248);
							if (local277 == null) {
								arg0.method1886(0);
							} else if (local277 instanceof Number) {
								arg0.method1886(1);
								arg0.method1871(((Number) local277).longValue());
							} else if (local277 instanceof String) {
								arg0.method1886(2);
								arg0.method1849((String) local277);
							} else {
								arg0.method1886(4);
							}
						} else if (local132 == 4) {
							local219 = (Method) local15.aClass60Array1[local111].anObject2;
							local148 = local219.getModifiers();
							arg0.method1886(0);
							arg0.method1851(local148);
						}
					} catch (@Pc(320) ClassNotFoundException local320) {
						arg0.method1886(-10);
					} catch (@Pc(326) InvalidClassException local326) {
						arg0.method1886(-11);
					} catch (@Pc(332) StreamCorruptedException local332) {
						arg0.method1886(-12);
					} catch (@Pc(338) OptionalDataException local338) {
						arg0.method1886(-13);
					} catch (@Pc(344) IllegalAccessException local344) {
						arg0.method1886(-14);
					} catch (@Pc(350) IllegalArgumentException local350) {
						arg0.method1886(-15);
					} catch (@Pc(356) InvocationTargetException local356) {
						arg0.method1886(-16);
					} catch (@Pc(362) SecurityException local362) {
						arg0.method1886(-17);
					} catch (@Pc(368) IOException local368) {
						arg0.method1886(-18);
					} catch (@Pc(374) NullPointerException local374) {
						arg0.method1886(-19);
					} catch (@Pc(380) Exception local380) {
						arg0.method1886(-20);
					} catch (@Pc(386) Throwable local386) {
						arg0.method1886(-21);
					}
				} else {
					arg0.method1886(local15.anIntArray145[local111]);
				}
			}
			arg0.method1864(local104);
			arg0.method1857(arg0.anInt2029 - local104);
			local15.method5803();
		}
	}
}
