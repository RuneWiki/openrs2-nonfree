import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ak", name = "mb", descriptor = "I")
	public static final int anInt317 = 4096;

	@OriginalMember(owner = "client!ak", name = "Rb", descriptor = "I")
	public static final int anInt320 = 4096;

	@OriginalMember(owner = "client!ak", name = "kc", descriptor = "I")
	public static final int anInt325 = Static63.method1284(2200);

	@OriginalMember(owner = "client!ak", name = "sc", descriptor = "I")
	public static int anInt326 = 0;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!o;[Lclient!ak;)Lclient!ak;")
	public static Class9_Sub1 method227(@OriginalArg(0) Class172_Sub1 arg0, @OriginalArg(1) Class9_Sub1[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class9_Sub1 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] != null) {
				local1++;
				local3 = arg1[local5];
			}
		}
		if (local1 == 1) {
			return local3;
		} else {
			return new Class9_Sub1(arg0, arg1);
		}
	}
}
