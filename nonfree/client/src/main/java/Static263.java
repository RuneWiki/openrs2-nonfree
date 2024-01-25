import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "Z")
	public static boolean aBoolean270 = false;

	@OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
	public static int anInt4339 = 0;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)I")
	public static int method3728(@OriginalArg(2) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(41) int local41 = (arg0 & 0x7F) * 96 >> 7;
			if (local41 < 2) {
				local41 = 2;
			} else if (local41 > 126) {
				local41 = 126;
			}
			return (arg0 & 0xFF80) + local41;
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IZ)V")
	public static void method3729(@OriginalArg(0) int arg0) {
		Static457.aLong117 = 1000000000L / (long) arg0;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method3732(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 == '<' || local23 == '>') {
				local10 += 3;
			}
		}
		@Pc(45) StringBuffer local45 = new StringBuffer(local10 + local8);
		for (@Pc(47) int local47 = 0; local47 < local8; local47++) {
			@Pc(53) char local53 = arg0.charAt(local47);
			if (local53 == '<') {
				local45.append("<lt>");
			} else if (local53 == '>') {
				local45.append("<gt>");
			} else {
				local45.append(local53);
			}
		}
		return local45.toString();
	}
}
