import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
	public static int anInt5634;

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
	public static int anInt5635;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
	public static int anInt5633 = -1;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)Lclient!aa;")
	public static Class2_Sub1 method4780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class57 local7 = Static18.aClass57ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass2_Sub1_1;
	}
}
