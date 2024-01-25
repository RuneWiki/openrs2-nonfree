import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!op", name = "b", descriptor = "Z")
	public static boolean aBoolean413 = true;

	@OriginalMember(owner = "client!op", name = "k", descriptor = "Lclient!gp;")
	public static Interface2 anInterface2_1 = null;

	@OriginalMember(owner = "client!op", name = "r", descriptor = "Lclient!o;")
	public static Class2_Sub32 aClass2_Sub32_1 = null;

	@OriginalMember(owner = "client!op", name = "s", descriptor = "I")
	public static int anInt4515 = 0;

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;")
	public static Class method4057(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(II)V")
	public static void method4058(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub11_Sub19 local8 = Static306.method5411(10, arg0);
		local8.method5539();
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(BIILclient!vl;)J")
	public static long method4060(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface9 arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = 2147483648L;
		@Pc(9) long local9 = Long.MIN_VALUE;
		@Pc(20) Class96 local20 = Static234.method4051(arg2.method5583());
		@Pc(41) long local41 = (long) (arg1 | 0x40000000 | arg0 << 7 | arg2.method5581() << 14 | arg2.method5580() << 20);
		if (local20.anInt3115 == 0) {
			local41 |= local9;
		}
		if (local20.anInt3136 == 1) {
			local41 |= local5;
		}
		if (local20.aBoolean279) {
			local41 |= local7;
		}
		return local41 | (long) arg2.method5583() << 32;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(BLclient!dg;Ljava/lang/String;)I")
	public static int method4066(@OriginalArg(1) Class2_Sub10 arg0, @OriginalArg(2) String arg1) {
		@Pc(6) int local6 = arg0.anInt4807;
		@Pc(10) byte[] local10 = Static106.method2335(arg1);
		arg0.method4407(local10.length);
		arg0.anInt4807 += Static78.aClass197_1.method5617(arg0.anInt4807, arg0.aByteArray57, local10.length, local10, 0);
		return arg0.anInt4807 - local6;
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(B)I")
	public static int method4068() {
		return 2;
	}
}
