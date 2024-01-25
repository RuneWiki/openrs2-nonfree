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

public final class Static334 {

	@OriginalMember(owner = "client!rc", name = "P", descriptor = "I")
	public static int anInt5834;

	@OriginalMember(owner = "client!rc", name = "T", descriptor = "F")
	public static float aFloat64;

	@OriginalMember(owner = "client!rc", name = "D", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_78 = new Class267("slide:", "gleiten:", "glissement:", "deslizamento:");

	@OriginalMember(owner = "client!rc", name = "N", descriptor = "I")
	public static int anInt5833 = 0;

	@OriginalMember(owner = "client!rc", name = "O", descriptor = "[I")
	public static final int[] anIntArray397 = new int[32];

	@OriginalMember(owner = "client!rc", name = "U", descriptor = "[C")
	public static final char[] aCharArray3 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "([FFFIIIIIIIIFZ)V")
	public static void method4878(@OriginalArg(0) float[] arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) float arg11) {
		@Pc(5) int local5 = arg4 - arg8;
		@Pc(9) int local9 = arg10 - arg9;
		@Pc(13) int local13 = arg5 - arg7;
		@Pc(38) float local38 = (float) local9 * arg0[0] + arg0[1] * (float) local5 + (float) local13 * arg0[2];
		@Pc(63) float local63 = (float) local13 * arg0[5] + arg0[4] * (float) local5 + arg0[3] * (float) local9;
		@Pc(84) float local84 = arg0[8] * (float) local13 + (float) local5 * arg0[7] + arg0[6] * (float) local9;
		@Pc(92) float local92;
		@Pc(99) float local99;
		if (arg6 == 0) {
			local92 = local38 + arg11 + 0.5F;
			local99 = arg2 + 0.5F - local84;
		} else if (arg6 == 1) {
			local92 = local38 + arg11 + 0.5F;
			local99 = arg2 + local84 + 0.5F;
		} else if (arg6 == 2) {
			local92 = arg11 + 0.5F - local38;
			local99 = arg1 + 0.5F - local63;
		} else if (arg6 == 3) {
			local99 = arg1 + 0.5F - local63;
			local92 = arg11 + local38 + 0.5F;
		} else if (arg6 == 4) {
			local92 = arg2 + local84 + 0.5F;
			local99 = arg1 + 0.5F - local63;
		} else {
			local99 = arg1 + 0.5F - local63;
			local92 = arg2 + 0.5F - local84;
		}
		@Pc(206) float local206;
		if (arg3 == 1) {
			local206 = local92;
			local92 = -local99;
			local99 = local206;
		} else if (arg3 == 2) {
			local99 = -local99;
			local92 = -local92;
		} else if (arg3 == 3) {
			local206 = local92;
			local92 = local99;
			local99 = -local206;
		}
		Static311.aFloat59 = local92;
		Static333.aFloat63 = local99;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILclient!md;)V")
	public static void method4879(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub1_Sub1 arg1) {
		while (true) {
			@Pc(18) Class6_Sub6 local18 = (Class6_Sub6) Static273.aClass244_24.method5976();
			if (local18 == null) {
				return;
			}
			@Pc(23) boolean local23 = false;
			for (@Pc(25) int local25 = 0; local25 < local18.anInt1168; local25++) {
				if (local18.aClass122Array2[local25] != null) {
					if (local18.aClass122Array2[local25].anInt3557 == 2) {
						local18.anIntArray74[local25] = -5;
					}
					if (local18.aClass122Array2[local25].anInt3557 == 0) {
						local23 = true;
					}
				}
				if (local18.aClass122Array1[local25] != null) {
					if (local18.aClass122Array1[local25].anInt3557 == 2) {
						local18.anIntArray74[local25] = -6;
					}
					if (local18.aClass122Array1[local25].anInt3557 == 0) {
						local23 = true;
					}
				}
			}
			if (local23) {
				return;
			}
			arg1.method3804(arg0);
			arg1.method6439(0);
			@Pc(104) int local104 = arg1.anInt7898;
			arg1.method6461(local18.anInt1170);
			for (@Pc(111) int local111 = 0; local111 < local18.anInt1168; local111++) {
				if (local18.anIntArray74[local111] == 0) {
					try {
						@Pc(135) int local135 = local18.anIntArray72[local111];
						@Pc(150) Field local150;
						@Pc(153) int local153;
						if (local135 == 0) {
							local150 = (Field) local18.aClass122Array2[local111].anObject7;
							local153 = local150.getInt(null);
							arg1.method6439(0);
							arg1.method6461(local153);
						} else if (local135 == 1) {
							local150 = (Field) local18.aClass122Array2[local111].anObject7;
							local150.setInt(null, local18.anIntArray73[local111]);
							arg1.method6439(0);
						} else if (local135 == 2) {
							local150 = (Field) local18.aClass122Array2[local111].anObject7;
							local153 = local150.getModifiers();
							arg1.method6439(0);
							arg1.method6461(local153);
						}
						@Pc(214) Method local214;
						if (local135 == 3) {
							local214 = (Method) local18.aClass122Array1[local111].anObject7;
							@Pc(219) byte[][] local219 = local18.aByteArrayArrayArray3[local111];
							@Pc(223) Object[] local223 = new Object[local219.length];
							for (@Pc(225) int local225 = 0; local225 < local219.length; local225++) {
								@Pc(237) ObjectInputStream local237 = new ObjectInputStream(new ByteArrayInputStream(local219[local225]));
								local223[local225] = local237.readObject();
							}
							@Pc(252) Object local252 = local214.invoke(null, local223);
							if (local252 == null) {
								arg1.method6439(0);
							} else if (local252 instanceof Number) {
								arg1.method6439(1);
								arg1.method6475(((Number) local252).longValue());
							} else if (local252 instanceof String) {
								arg1.method6439(2);
								arg1.method6448((String) local252);
							} else {
								arg1.method6439(4);
							}
						} else if (local135 == 4) {
							local214 = (Method) local18.aClass122Array1[local111].anObject7;
							local153 = local214.getModifiers();
							arg1.method6439(0);
							arg1.method6461(local153);
						}
					} catch (@Pc(320) ClassNotFoundException local320) {
						arg1.method6439(-10);
					} catch (@Pc(326) InvalidClassException local326) {
						arg1.method6439(-11);
					} catch (@Pc(332) StreamCorruptedException local332) {
						arg1.method6439(-12);
					} catch (@Pc(338) OptionalDataException local338) {
						arg1.method6439(-13);
					} catch (@Pc(344) IllegalAccessException local344) {
						arg1.method6439(-14);
					} catch (@Pc(350) IllegalArgumentException local350) {
						arg1.method6439(-15);
					} catch (@Pc(356) InvocationTargetException local356) {
						arg1.method6439(-16);
					} catch (@Pc(362) SecurityException local362) {
						arg1.method6439(-17);
					} catch (@Pc(368) IOException local368) {
						arg1.method6439(-18);
					} catch (@Pc(374) NullPointerException local374) {
						arg1.method6439(-19);
					} catch (@Pc(380) Exception local380) {
						arg1.method6439(-20);
					} catch (@Pc(386) Throwable local386) {
						arg1.method6439(-21);
					}
				} else {
					arg1.method6439(local18.anIntArray74[local111]);
				}
			}
			arg1.method6489(local104);
			arg1.method6458(arg1.anInt7898 - local104);
			local18.method6525();
		}
	}
}
