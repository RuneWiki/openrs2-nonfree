import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!rr", name = "P", descriptor = "Lclient!fh;")
	public static Interface2 anInterface2_5;

	@OriginalMember(owner = "client!rr", name = "O", descriptor = "I")
	public static int anInt5578 = 0;

	@OriginalMember(owner = "client!rr", name = "Q", descriptor = "Lclient!ar;")
	public static Class14 aClass14_28 = new Class14();

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method4880(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(34) int local34 = 0;
			@Pc(36) long local36 = arg0;
			while (local36 != 0L) {
				local36 /= 37L;
				local34++;
			}
			@Pc(54) StringBuffer local54 = new StringBuffer(local34);
			while (arg0 != 0L) {
				@Pc(58) long local58 = arg0;
				arg0 /= 37L;
				@Pc(72) char local72 = Static251.aCharArray7[(int) (local58 - arg0 * 37L)];
				if (local72 == '_') {
					@Pc(80) int local80 = local54.length() - 1;
					local54.setCharAt(local80, Character.toUpperCase(local54.charAt(local80)));
					local72 = ' ';
				}
				local54.append(local72);
			}
			local54.reverse();
			local54.setCharAt(0, Character.toUpperCase(local54.charAt(0)));
			return local54.toString();
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIIIII)I")
	public static int method4882(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg4 & 0x1) == 1) {
			@Pc(8) int local8 = arg2;
			arg2 = arg5;
			arg5 = local8;
		}
		@Pc(16) int local16 = arg3 & 0x3;
		if (local16 == 0) {
			return arg1;
		} else if (local16 == 1) {
			return 1 + 7 - arg2 - arg0;
		} else if (local16 == 2) {
			return 7 + 1 - arg1 - arg5;
		} else {
			return arg0;
		}
	}
}
