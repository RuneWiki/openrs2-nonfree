import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
	public static int anInt5560;

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "J")
	public static long aLong145;

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
	public static int anInt5563;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)V")
	public static void method4789(@OriginalArg(1) int arg0) {
		@Pc(13) Class6_Sub1_Sub5 local13 = Static77.method1176(arg0, 4);
		local13.method770();
	}
}
