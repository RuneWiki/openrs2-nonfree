import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!ll", name = "j", descriptor = "I")
	public static int anInt3647;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_82 = new Class205(16, -1);

	@OriginalMember(owner = "client!ll", name = "k", descriptor = "I")
	public static int anInt3648 = 0;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)Lclient!ip;")
	public static Class1_Sub2 method3324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class251 local7 = Static64.aClass251ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass1_Sub2_3;
	}
}
