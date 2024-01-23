import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!vd", name = "R", descriptor = "Lclient!uh;")
	public static Class178 aClass178_9;

	@OriginalMember(owner = "client!vd", name = "S", descriptor = "[[[Lclient!qo;")
	public static Class3_Sub25[][][] aClass3_Sub25ArrayArrayArray6;

	@OriginalMember(owner = "client!vd", name = "G", descriptor = "Lclient!fk;")
	public static Class56 aClass56_27 = new Class56();

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method4772(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "(I)V")
	public static void method4773() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static312.aBooleanArray136[local7] = false;
		}
		Static6.anInt138 = 0;
		Static257.anInt5292 = -1;
		Static25.anInt467 = 1;
		Static102.anInt1860 = -1;
		Static31.anInt571 = 0;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BLjava/lang/String;II)V")
	public static void method4774(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static251.method4236(arg0, arg2, arg1, arg3, null, arg4, -1);
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(II)I")
	public static int method4775(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return local5 + arg0;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method4776(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) byte local10 = 2;
		@Pc(20) char[] local20 = new char[local8];
		for (@Pc(22) int local22 = 0; local22 < local8; local22++) {
			@Pc(33) char local33 = arg0.charAt(local22);
			if (local10 == 0) {
				local33 = Character.toLowerCase(local33);
			} else if (local10 == 2 || Character.isUpperCase(local33)) {
				local33 = Static274.method4502(local33);
			}
			if (Character.isLetter(local33)) {
				local10 = 0;
			} else if (local33 == '.' || local33 == '?' || local33 == '!') {
				local10 = 2;
			} else if (!Character.isSpaceChar(local33)) {
				local10 = 1;
			} else if (local10 != 2) {
				local10 = 1;
			}
			local20[local22] = local33;
		}
		return new String(local20);
	}
}
