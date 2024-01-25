import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ag", name = "t", descriptor = "[I")
	public static int[] anIntArray4;

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
	public static int anInt43 = 0;

	@OriginalMember(owner = "client!ag", name = "u", descriptor = "I")
	public static int anInt49 = 0;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method43(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 == '<' || local18 == '>') {
				local10 += 3;
			}
		}
		@Pc(42) StringBuffer local42 = new StringBuffer(local10 + local8);
		for (@Pc(44) int local44 = 0; local44 < local8; local44++) {
			@Pc(50) char local50 = arg0.charAt(local44);
			if (local50 == '<') {
				local42.append("<lt>");
			} else if (local50 == '>') {
				local42.append("<gt>");
			} else {
				local42.append(local50);
			}
		}
		return local42.toString();
	}
}
