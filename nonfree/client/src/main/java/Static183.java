import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!kp", name = "f", descriptor = "[[Lclient!ae;")
	public static Class4[][] aClass4ArrayArray1;

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "[I")
	public static final int[] anIntArray664 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "[I")
	public static final int[] anIntArray665 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!kp", name = "h", descriptor = "I")
	public static int anInt3441 = -1;

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(II[Ljava/lang/String;I)Ljava/lang/String;")
	public static String method3159(@OriginalArg(0) int arg0, @OriginalArg(2) String[] arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(19) String local19 = arg1[arg0];
			return local19 == null ? "null" : local19.toString();
		} else {
			@Pc(30) int local30 = arg2 + arg0;
			@Pc(32) int local32 = 0;
			for (@Pc(34) int local34 = arg0; local34 < local30; local34++) {
				@Pc(40) String local40 = arg1[local34];
				if (local40 == null) {
					local32 += 4;
				} else {
					local32 += local40.length();
				}
			}
			@Pc(59) StringBuffer local59 = new StringBuffer(local32);
			for (@Pc(61) int local61 = arg0; local61 < local30; local61++) {
				@Pc(67) String local67 = arg1[local61];
				if (local67 == null) {
					local59.append("null");
				} else {
					local59.append(local67);
				}
			}
			return local59.toString();
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(BJ)V")
	public static void method3161(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}
}
