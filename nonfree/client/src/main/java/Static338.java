import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!vm", name = "h", descriptor = "I")
	public static int anInt5369 = 0;

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(II)I")
	public static int method4468(@OriginalArg(1) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(28) int local28 = local22 | local22 >>> 8;
		@Pc(39) int local39 = local28 | local28 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(III)I")
	public static int method4471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg1 > 0) {
			local12 = arg0 & 0x1 | local12 << 1;
			arg1--;
			arg0 >>>= 0x1;
		}
		return local12;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V")
	public static void method4479() {
		Static27.anIntArray86 = Static5.method215(0.4F);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method4497(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub1_Sub8 local8 = Static155.method2994(arg1, 3);
		local8.method2031();
		local8.aString80 = arg0;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method4528(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(34) int local34 = 0;
			for (@Pc(36) long local36 = arg0; local36 != 0L; local36 /= 37L) {
				local34++;
			}
			@Pc(52) StringBuffer local52 = new StringBuffer(local34);
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				local52.append(Static112.aCharArray1[(int) (local56 - arg0 * 37L)]);
			}
			return local52.reverse().toString();
		}
	}
}
