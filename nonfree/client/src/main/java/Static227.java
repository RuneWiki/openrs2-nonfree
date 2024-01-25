import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!la", name = "f", descriptor = "Lclient!vp;")
	public static Class260 aClass260_1;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIIB)V")
	public static void method3264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static131.anInt2360 = arg1;
		Static146.anInt2676 = arg3;
		Static49.anInt878 = arg0;
		Static304.anInt6522 = arg5;
		Static433.anInt7250 = arg4;
		Static24.anInt2904 = arg2;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method3265(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BI)I")
	public static int method3267(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)I")
	public static int method3268(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}
