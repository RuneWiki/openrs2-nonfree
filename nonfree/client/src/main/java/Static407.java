import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!uh", name = "o", descriptor = "I")
	public static final int anInt6592 = 4096;

	@OriginalMember(owner = "client!uh", name = "O", descriptor = "I")
	public static final int anInt6595 = Static66.method998(2200);

	@OriginalMember(owner = "client!uh", name = "Lb", descriptor = "I")
	public static final int anInt6601 = 4096;

	@OriginalMember(owner = "client!uh", name = "kc", descriptor = "I")
	public static int anInt6606 = 0;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!js;[Lclient!uh;)Lclient!uh;")
	public static Class33_Sub1 method5085(@OriginalArg(0) Class128_Sub1 arg0, @OriginalArg(1) Class33_Sub1[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class33_Sub1 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] != null) {
				local1++;
				local3 = arg1[local5];
			}
		}
		if (local1 == 1) {
			return local3;
		} else {
			return new Class33_Sub1(arg0, arg1);
		}
	}
}
