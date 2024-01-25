import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!kc", name = "J", descriptor = "I")
	public static final int anInt3569 = 4096;

	@OriginalMember(owner = "client!kc", name = "yb", descriptor = "I")
	public static final int anInt3576 = 4096;

	@OriginalMember(owner = "client!kc", name = "Nb", descriptor = "I")
	public static final int anInt3577 = Static109.method1799(2200);

	@OriginalMember(owner = "client!kc", name = "nc", descriptor = "I")
	public static int anInt3581 = 0;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!f;[Lclient!kc;)Lclient!kc;")
	public static Class63_Sub1 method2954(@OriginalArg(0) Class75_Sub1 arg0, @OriginalArg(1) Class63_Sub1[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class63_Sub1 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] != null) {
				local1++;
				local3 = arg1[local5];
			}
		}
		if (local1 == 1) {
			return local3;
		} else {
			return new Class63_Sub1(arg0, arg1);
		}
	}
}
