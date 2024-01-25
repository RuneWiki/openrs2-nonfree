import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!di", name = "s", descriptor = "I")
	public static int anInt1637;

	@OriginalMember(owner = "client!di", name = "t", descriptor = "I")
	public static int anInt1638;

	@OriginalMember(owner = "client!di", name = "v", descriptor = "F")
	public static float aFloat33;

	@OriginalMember(owner = "client!di", name = "w", descriptor = "Lclient!rp;")
	public static Class224 aClass224_1;

	@OriginalMember(owner = "client!di", name = "C", descriptor = "Lclient!qg;")
	public static Class205 aClass205_1;

	@OriginalMember(owner = "client!di", name = "u", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!di", name = "y", descriptor = "I")
	public static int anInt1640 = -1;

	@OriginalMember(owner = "client!di", name = "B", descriptor = "Z")
	public static boolean aBoolean117 = false;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIILclient!qa;BII)V")
	public static void method1491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class30 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface12 local11 = (Interface12) Static278.method4397(arg6, arg0, arg2);
		@Pc(20) Class139 local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(37) int local37;
		if (local11 != null) {
			local20 = Static146.aClass228_1.method5203(local11.method6320());
			local26 = local11.method6316() & 0x3;
			local30 = local11.method6318();
			if (local20.anInt4364 == -1) {
				local37 = arg1;
				if (local20.anInt4358 > 0) {
					local37 = arg4;
				}
				if (local30 == 0 || local30 == 2) {
					if (local26 == 0) {
						arg5.method2093(arg3, local37, arg7, 4);
					} else if (local26 == 1) {
						arg5.method2037(arg3, local37, arg7, 4);
					} else if (local26 == 2) {
						arg5.method2093(arg3, local37, arg7 + 3, 4);
					} else if (local26 == 3) {
						arg5.method2037(arg3 + 3, local37, arg7, 4);
					}
				}
				if (local30 == 3) {
					if (local26 == 0) {
						arg5.method2072(arg3, arg7, 1, 1, local37);
					} else if (local26 == 1) {
						arg5.method2072(arg3, arg7 + 3, 1, 1, local37);
					} else if (local26 == 2) {
						arg5.method2072(arg3 + 3, arg7 + 3, 1, 1, local37);
					} else if (local26 == 3) {
						arg5.method2072(arg3 + 3, arg7, 1, 1, local37);
					}
				}
				if (local30 == 2) {
					if (local26 == 0) {
						arg5.method2037(arg3, local37, arg7, 4);
					} else if (local26 == 1) {
						arg5.method2093(arg3, local37, arg7 + 3, 4);
					} else if (local26 == 2) {
						arg5.method2037(arg3 + 3, local37, arg7, 4);
					} else if (local26 == 3) {
						arg5.method2093(arg3, local37, arg7, 4);
					}
				}
			} else {
				Static32.method453(arg7, local26, arg3, local20, arg5);
			}
		}
		local11 = (Interface12) Static422.method5870(arg6, arg0, arg2, wo.class);
		if (local11 != null) {
			local20 = Static146.aClass228_1.method5203(local11.method6320());
			local26 = local11.method6316() & 0x3;
			local30 = local11.method6318();
			if (local20.anInt4364 != -1) {
				Static32.method453(arg7, local26, arg3, local20, arg5);
			} else if (local30 == 9) {
				local37 = -1118482;
				if (local20.anInt4358 > 0) {
					local37 = -1179648;
				}
				if (local26 == 0 || local26 == 2) {
					arg5.method2080(arg3 + 3, arg7 - -3, arg7, arg3, local37);
				} else {
					arg5.method2080(arg3, arg7 + 3, arg7, arg3 + 3, local37);
				}
			}
		}
		local11 = (Interface12) Static241.method4021(arg6, arg0, arg2);
		if (local11 == null) {
			return;
		}
		local20 = Static146.aClass228_1.method5203(local11.method6320());
		local26 = local11.method6316() & 0x3;
		if (local20.anInt4364 != -1) {
			Static32.method453(arg7, local26, arg3, local20, arg5);
		}
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(III)I")
	public static int method1492(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local7 *= arg0;
			}
			arg1 >>= 0x1;
			arg0 *= arg0;
		}
		if (arg1 == 1) {
			return local7 * arg0;
		} else {
			return local7;
		}
	}

	@OriginalMember(owner = "client!di", name = "c", descriptor = "(III)B")
	public static byte method1493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
