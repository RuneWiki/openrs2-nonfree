import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!dq", name = "r", descriptor = "I")
	public static final int anInt1505 = Static159.method2403(2200);

	@OriginalMember(owner = "client!dq", name = "A", descriptor = "I")
	public static final int anInt1507 = 4096;

	@OriginalMember(owner = "client!dq", name = "ec", descriptor = "I")
	public static final int anInt1517 = 4096;

	@OriginalMember(owner = "client!dq", name = "mc", descriptor = "I")
	public static int anInt1518 = 0;

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!ra;[Lclient!dq;)Lclient!dq;")
	public static Class37_Sub1 method1330(@OriginalArg(0) Class109_Sub2 arg0, @OriginalArg(1) Class37_Sub1[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class37_Sub1 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] != null) {
				local1++;
				local3 = arg1[local5];
			}
		}
		if (local1 == 1) {
			return local3;
		} else {
			return new Class37_Sub1(arg0, arg1);
		}
	}
}
