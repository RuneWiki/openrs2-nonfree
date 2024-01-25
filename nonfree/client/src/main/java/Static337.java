import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!oca", name = "y", descriptor = "Lclient!gba;")
	public static final Class104 aClass104_8 = new Class104();

	@OriginalMember(owner = "client!oca", name = "E", descriptor = "[C")
	public static final char[] aCharArray35 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!oca", name = "F", descriptor = "Lclient!bn;")
	public static final Class31 aClass31_9 = new Class31(15, 0, 1, 0);

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(IBI[I[Ljava/lang/Object;)V")
	public static void method5133(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Object[] arg3) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(10) int local10 = (arg1 + arg0) / 2;
		@Pc(12) int local12 = arg0;
		@Pc(16) int local16 = arg2[local10];
		arg2[local10] = arg2[arg1];
		arg2[arg1] = local16;
		@Pc(30) Object local30 = arg3[local10];
		arg3[local10] = arg3[arg1];
		arg3[arg1] = local30;
		@Pc(47) int local47 = local16 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(49) int local49 = arg0; local49 < arg1; local49++) {
			if (local16 + (local49 & local47) > arg2[local49]) {
				@Pc(69) int local69 = arg2[local49];
				arg2[local49] = arg2[local12];
				arg2[local12] = local69;
				@Pc(83) Object local83 = arg3[local49];
				arg3[local49] = arg3[local12];
				arg3[local12++] = local83;
			}
		}
		arg2[arg1] = arg2[local12];
		arg2[local12] = local16;
		arg3[arg1] = arg3[local12];
		arg3[local12] = local30;
		method5133(arg0, local12 - 1, arg2, arg3);
		method5133(local12 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method5134(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 == '<' || local23 == '>') {
				local10 += 3;
			}
		}
		@Pc(41) StringBuffer local41 = new StringBuffer(local10 + local8);
		for (@Pc(43) int local43 = 0; local43 < local8; local43++) {
			@Pc(49) char local49 = arg0.charAt(local43);
			if (local49 == '<') {
				local41.append("<lt>");
			} else if (local49 == '>') {
				local41.append("<gt>");
			} else {
				local41.append(local49);
			}
		}
		return local41.toString();
	}
}
