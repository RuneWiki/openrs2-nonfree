import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!cw", name = "d", descriptor = "[Lclient!ha;")
	public static Class25[] aClass25Array13;

	@OriginalMember(owner = "client!cw", name = "h", descriptor = "Lclient!fa;")
	public static Class94 aClass94_6;

	@OriginalMember(owner = "client!cw", name = "g", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_144 = new Class150(105, 3);

	@OriginalMember(owner = "client!cw", name = "i", descriptor = "Lclient!ne;")
	public static final Class206 aClass206_4 = new Class206();

	@OriginalMember(owner = "client!cw", name = "j", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger6 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!cw", name = "k", descriptor = "Lclient!lj;")
	public static final Class187 aClass187_7 = new Class187();

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(III)Z")
	public static boolean method4911(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x40000) != 0 | Static528.method6949(arg1, arg0) || Static376.method5638(arg0, arg1);
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIIIIILclient!qa;)Lclient!r;")
	public static Class36 method4912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class62 arg5) {
		@Pc(6) long local6 = (long) arg0;
		@Pc(12) Class36 local12 = (Class36) Static339.aClass288_46.method6745(local6);
		if (local12 == null) {
			@Pc(22) Class184 local22 = Static287.method4830(arg0, Static290.aClass117_131);
			if (local22 == null) {
				return null;
			}
			if (local22.anInt5413 < 13) {
				local22.method4518();
			}
			local12 = arg5.method7012(local22, 2055, Static90.anInt2123, 64, 768);
			Static339.aClass288_46.method6746(local12, local6);
		}
		local12 = local12.method7356((byte) 2, 2055, true);
		if (arg2 != 0) {
			local12.OA(arg2);
		}
		if (arg4 != 0) {
			local12.D(arg4);
		}
		if (arg1 != 0) {
			local12.b(arg1);
		}
		if (arg3 != 0) {
			local12.ca(0, arg3, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(II)V")
	public static void method4915(@OriginalArg(1) int arg0) {
		Static422.method6058();
		Static92.method1976();
		Static436.method6218(true, arg0);
		Static349.method5430(Static145.aClass117_76, Static110.aClass62_15, Static533.aClass117_228);
		Static439.method7188(Static533.aClass117_228, Static110.aClass62_15);
		Static393.method5726();
		Static441.method6255(Static22.aClass25Array1);
		Static544.method2108();
		Static507.method6976();
		if (Static389.anInt7024 == 2) {
			Static287.method4831(3);
		} else if (Static389.anInt7024 == 6) {
			Static287.method4831(7);
		} else if (Static389.anInt7024 == 9) {
			Static287.method4831(10);
			return;
		} else if (Static389.anInt7024 == 1) {
			Static420.method7305(Static533.aClass117_228, Static110.aClass62_15);
			return;
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IBI)Z")
	public static boolean method4917(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!cw", name = "c", descriptor = "(II)I")
	public static int method4919(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
