import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static610 {

	@OriginalMember(owner = "client!uja", name = "l", descriptor = "I")
	public static int anInt9524;

	@OriginalMember(owner = "client!uja", name = "k", descriptor = "Lclient!oaa;")
	public static final Class258 aClass258_8 = new Class258();

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(I)Lclient!jf;")
	public static Class3_Sub6_Sub13 method8050() {
		return Static574.aClass3_Sub6_Sub13_3;
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(IILjava/util/Random;)I")
	public static int method8052(@OriginalArg(0) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static9.method94(arg0)) {
			return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(37) int local37 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(48) int local48;
			do {
				local48 = arg1.nextInt();
			} while (local37 <= local48);
			return Static88.method1799(local48, arg0);
		}
	}
}
