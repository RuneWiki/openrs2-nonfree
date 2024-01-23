import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "Lclient!og;")
	public static Class127 aClass127_3;

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "[Lclient!mh;")
	public static Class114[] aClass114Array1;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
	public static int anInt1432 = 0;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString41 = "wishes to trade with you.";

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
	public static int anInt1433 = 127;

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString42 = "Attack";

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!ak;ILclient!ak;)I")
	public static int method1187(@OriginalArg(0) Class7 arg0, @OriginalArg(2) Class7 arg1) {
		@Pc(5) int local5 = 0;
		if (arg1.method242(Static170.anInt3126)) {
			local5++;
		}
		if (arg1.method242(Static47.anInt5870)) {
			local5++;
		}
		if (arg1.method242(Static152.anInt2815)) {
			local5++;
		}
		if (arg0.method242(Static170.anInt3126)) {
			local5++;
		}
		if (arg0.method242(Static47.anInt5870)) {
			local5++;
		}
		if (arg0.method242(Static152.anInt2815)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public static boolean method1188(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(18) int local18 = 0; local18 < Static150.anInt2784; local18++) {
			if (arg0.equalsIgnoreCase(Static259.aStringArray29[local18])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIB)I")
	public static int method1189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 > 243) {
			arg1 >>= 0x4;
		} else if (arg0 > 217) {
			arg1 >>= 0x3;
		} else if (arg0 > 192) {
			arg1 >>= 0x2;
		} else if (arg0 > 179) {
			arg1 >>= 0x1;
		}
		return (arg0 >> 1) + (arg2 >> 2 << 10) + (arg1 >> 5 << 7);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)Lclient!ik;")
	public static Class79 method1191(@OriginalArg(0) int arg0) {
		@Pc(6) Class79 local6 = (Class79) Static205.aClass31_31.method852((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(21) byte[] local21 = Static57.aClass7_50.method253(arg0, 32);
		local6 = new Class79();
		if (local21 != null) {
			local6.method1821(new Class1_Sub18(local21));
		}
		local6.method1822();
		Static205.aClass31_31.method851(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)I")
	public static int method1192(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(48) int local48 = Static243.method3852(arg1 + 91923, arg0 - -45365, 4) + (Static243.method3852(arg1 + 37821, arg0 + 10294, 2) - 128 >> 1) + (Static243.method3852(arg1, arg0, 1) + -128 >> 2) - 128;
		local48 = (int) ((double) local48 * 0.3D) + 35;
		if (local48 < 10) {
			local48 = 10;
		} else if (local48 > 60) {
			local48 = 60;
		}
		return local48;
	}
}
