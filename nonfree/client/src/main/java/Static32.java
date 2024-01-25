import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
	public static int anInt650 = 0;

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "[I")
	public static final int[] anIntArray54 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!gk;B)Lclient!lf;")
	public static Class206 method547(@OriginalArg(0) Class2_Sub7 arg0) {
		@Pc(12) int local12 = arg0.method4509();
		return new Class206(local12);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!wo;")
	public static Class12_Sub2_Sub1 method551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class228 local7 = Static469.aClass228ArrayArrayArray6[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class180 local14 = local7.aClass180_3; local14 != null; local14 = local14.aClass180_2) {
			@Pc(18) Class12_Sub2_Sub1 local18 = local14.aClass12_Sub2_Sub1_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort120 == arg1 && local18.aShort121 == arg2) {
				return local18;
			}
		}
		return null;
	}
}
