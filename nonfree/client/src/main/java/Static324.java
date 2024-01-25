import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!um", name = "j", descriptor = "I")
	public static int anInt6226 = -1;

	@OriginalMember(owner = "client!um", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString230 = null;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!kk;III)V")
	public static void method5564(@OriginalArg(0) Class117 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = Static118.anIntArrayArrayArray3[arg1][arg2][arg3];
		@Pc(9) int local9 = 0;
		arg0.anInt5367 = 0;
		@Pc(19) int local19;
		while (local9 <= 24) {
			local19 = local7 >> local9 & 0xFF;
			if (local19 <= 0) {
				break;
			}
			arg0.aClass14_Sub13_Sub1Array3[arg0.anInt5367++] = Static127.aClass14_Sub13_Sub1Array1[local19 - 1];
			local9 += 8;
		}
		for (local19 = arg0.anInt5367; local19 < 4; local19++) {
			arg0.aClass14_Sub13_Sub1Array3[local19] = null;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ILclient!jg;)Lclient!mm;")
	public static Class37_Sub3 method5565(@OriginalArg(1) Class14_Sub4 arg0) {
		return new Class37_Sub3(arg0.method2502(), arg0.method2502(), arg0.method2502(), arg0.method2502(), arg0.method2501(), arg0.method2501(), arg0.method2548());
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method5567(@OriginalArg(0) String arg0) throws ClassNotFoundException {
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

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(BLclient!ap;)V")
	public static void method5568(@OriginalArg(1) Class15 arg0) {
		@Pc(7) Class110 local7 = null;
		try {
			@Pc(11) Class205 local11 = arg0.method277();
			while (local11.anInt6370 == 0) {
				Static15.method5425(1L);
			}
			if (local11.anInt6370 == 1) {
				local7 = (Class110) local11.anObject7;
				@Pc(33) Class14_Sub4 local33 = Static198.method3703();
				local7.method3080(local33.anInt2637, 0, local33.aByteArray74);
			}
		} catch (@Pc(43) Exception local43) {
		}
		try {
			if (local7 != null) {
				local7.method3079();
			}
		} catch (@Pc(50) Exception local50) {
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
	public static String method5569(@OriginalArg(1) long arg0) {
		Static193.aCalendar2.setTime(new Date(arg0));
		@Pc(13) int local13 = Static193.aCalendar2.get(7);
		@Pc(17) int local17 = Static193.aCalendar2.get(5);
		@Pc(21) int local21 = Static193.aCalendar2.get(2);
		@Pc(25) int local25 = Static193.aCalendar2.get(1);
		@Pc(29) int local29 = Static193.aCalendar2.get(11);
		@Pc(33) int local33 = Static193.aCalendar2.get(12);
		@Pc(42) int local42 = Static193.aCalendar2.get(13);
		return Static289.aStringArray67[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static7.aStringArray5[local21] + "-" + local25 + " " + local29 / 10 + local29 % 10 + ":" + local33 / 10 + local33 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIII)V")
	public static void method5570(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static108.aByteArrayArrayArray5 = new byte[4][arg1][arg0];
	}
}
