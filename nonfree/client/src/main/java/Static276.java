import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
	public static int anInt5237;

	@OriginalMember(owner = "client!ua", name = "O", descriptor = "Lclient!pm;")
	public static Class139 aClass139_4;

	@OriginalMember(owner = "client!ua", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString322 = "flash3:";

	@OriginalMember(owner = "client!ua", name = "hb", descriptor = "I")
	public static int anInt5270 = 0;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)I")
	public static int method4294(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local12 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return arg1 * local12;
		} else {
			return local12;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!fh;B)V")
	public static void method4301(@OriginalArg(0) Class58 arg0) {
		Static77.aClass58_40 = arg0;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BJ)V")
	public static void method4304(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(7) InterruptedException local7) {
		}
	}
}
