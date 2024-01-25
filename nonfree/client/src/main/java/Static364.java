import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!sk", name = "H", descriptor = "I")
	public static final int anInt6294 = 4096;

	@OriginalMember(owner = "client!sk", name = "rb", descriptor = "I")
	public static final int anInt6298 = Static329.method4426(2200);

	@OriginalMember(owner = "client!sk", name = "Wb", descriptor = "I")
	public static final int anInt6301 = 4096;

	@OriginalMember(owner = "client!sk", name = "sc", descriptor = "I")
	public static int anInt6303 = 0;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!bc;[Lclient!sk;)Lclient!sk;")
	public static Class110_Sub2 method4912(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) Class110_Sub2[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class110_Sub2 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] != null) {
				local1++;
				local3 = arg1[local5];
			}
		}
		if (local1 == 1) {
			return local3;
		} else {
			return new Class110_Sub2(arg0, arg1);
		}
	}
}
