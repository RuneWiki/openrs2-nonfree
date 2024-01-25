import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "Lclient!xa;")
	public static Class13 aClass13_6;

	@OriginalMember(owner = "client!ap", name = "h", descriptor = "[I")
	public static int[] anIntArray203;

	@OriginalMember(owner = "client!ap", name = "u", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_19 = new Class61(26, 7);

	@OriginalMember(owner = "client!ap", name = "w", descriptor = "I")
	public static int anInt1593 = 0;

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(III)V")
	public static void method1347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class100 local7 = Static309.aClass100ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 != null && local7.aClass10_Sub5_1 != null) {
			local7.aClass10_Sub5_1 = null;
		}
	}
}
