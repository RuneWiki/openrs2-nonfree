import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static656 {

	@OriginalMember(owner = "client!wd", name = "A", descriptor = "I")
	public static int anInt10355;

	@OriginalMember(owner = "client!wd", name = "C", descriptor = "Lclient!bj;")
	public static Class4_Sub5_Sub3 aClass4_Sub5_Sub3_3;

	@OriginalMember(owner = "client!wd", name = "y", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_224 = new Class151(0, -1);

	@OriginalMember(owner = "client!wd", name = "B", descriptor = "I")
	public static int anInt10356 = 0;

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(III)V")
	public static void method8747(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class4_Sub5_Sub11 local9 = Static652.method8695((long) arg0, 7);
		local9.method3955();
		local9.anInt4427 = arg1;
	}
}
