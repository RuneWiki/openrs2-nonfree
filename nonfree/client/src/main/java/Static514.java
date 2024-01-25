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

public final class Static514 {

	@OriginalMember(owner = "client!vm", name = "h", descriptor = "I")
	public static int anInt8674 = 0;

	@OriginalMember(owner = "client!vm", name = "n", descriptor = "[I")
	public static final int[] anIntArray784 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(BILclient!jj;)V")
	public static void method7109(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub6_Sub2 arg1) {
		while (true) {
			@Pc(18) Class1_Sub41 local18 = (Class1_Sub41) Static491.aClass37_89.method977();
			if (local18 == null) {
				return;
			}
			@Pc(23) boolean local23 = false;
			for (@Pc(25) int local25 = 0; local25 < local18.anInt7511; local25++) {
				if (local18.aClass157Array2[local25] != null) {
					if (local18.aClass157Array2[local25].anInt4742 == 2) {
						local18.anIntArray715[local25] = -5;
					}
					if (local18.aClass157Array2[local25].anInt4742 == 0) {
						local23 = true;
					}
				}
				if (local18.aClass157Array1[local25] != null) {
					if (local18.aClass157Array1[local25].anInt4742 == 2) {
						local18.anIntArray715[local25] = -6;
					}
					if (local18.aClass157Array1[local25].anInt4742 == 0) {
						local23 = true;
					}
				}
			}
			if (local23) {
				return;
			}
			arg1.method3973(arg0);
			arg1.method3937(0);
			@Pc(108) int local108 = arg1.anInt4555;
			arg1.method3948(local18.anInt7512);
			for (@Pc(115) int local115 = 0; local115 < local18.anInt7511; local115++) {
				if (local18.anIntArray715[local115] == 0) {
					try {
						@Pc(136) int local136 = local18.anIntArray714[local115];
						@Pc(145) Field local145;
						@Pc(149) int local149;
						if (local136 == 0) {
							local145 = (Field) local18.aClass157Array2[local115].anObject12;
							local149 = local145.getInt(null);
							arg1.method3937(0);
							arg1.method3948(local149);
						} else if (local136 == 1) {
							local145 = (Field) local18.aClass157Array2[local115].anObject12;
							local145.setInt(null, local18.anIntArray713[local115]);
							arg1.method3937(0);
						} else if (local136 == 2) {
							local145 = (Field) local18.aClass157Array2[local115].anObject12;
							local149 = local145.getModifiers();
							arg1.method3937(0);
							arg1.method3948(local149);
						}
						@Pc(218) Method local218;
						if (local136 == 3) {
							local218 = (Method) local18.aClass157Array1[local115].anObject12;
							@Pc(243) byte[][] local243 = local18.aByteArrayArrayArray16[local115];
							@Pc(247) Object[] local247 = new Object[local243.length];
							for (@Pc(249) int local249 = 0; local249 < local243.length; local249++) {
								@Pc(261) ObjectInputStream local261 = new ObjectInputStream(new ByteArrayInputStream(local243[local249]));
								local247[local249] = local261.readObject();
							}
							@Pc(280) Object local280 = local218.invoke(null, local247);
							if (local280 == null) {
								arg1.method3937(0);
							} else if (local280 instanceof Number) {
								arg1.method3937(1);
								arg1.method3926(((Number) local280).longValue());
							} else if (local280 instanceof String) {
								arg1.method3937(2);
								arg1.method3917((String) local280);
							} else {
								arg1.method3937(4);
							}
						} else if (local136 == 4) {
							local218 = (Method) local18.aClass157Array1[local115].anObject12;
							local149 = local218.getModifiers();
							arg1.method3937(0);
							arg1.method3948(local149);
						}
					} catch (@Pc(323) ClassNotFoundException local323) {
						arg1.method3937(-10);
					} catch (@Pc(329) InvalidClassException local329) {
						arg1.method3937(-11);
					} catch (@Pc(335) StreamCorruptedException local335) {
						arg1.method3937(-12);
					} catch (@Pc(341) OptionalDataException local341) {
						arg1.method3937(-13);
					} catch (@Pc(347) IllegalAccessException local347) {
						arg1.method3937(-14);
					} catch (@Pc(353) IllegalArgumentException local353) {
						arg1.method3937(-15);
					} catch (@Pc(359) InvocationTargetException local359) {
						arg1.method3937(-16);
					} catch (@Pc(365) SecurityException local365) {
						arg1.method3937(-17);
					} catch (@Pc(371) IOException local371) {
						arg1.method3937(-18);
					} catch (@Pc(377) NullPointerException local377) {
						arg1.method3937(-19);
					} catch (@Pc(383) Exception local383) {
						arg1.method3937(-20);
					} catch (@Pc(389) Throwable local389) {
						arg1.method3937(-21);
					}
				} else {
					arg1.method3937(local18.anIntArray715[local115]);
				}
			}
			arg1.method3927(local108);
			arg1.method3961(arg1.anInt4555 - local108);
			local18.method7525();
		}
	}
}
