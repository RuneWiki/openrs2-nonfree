import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!il", name = "p", descriptor = "Lclient!in;")
	public static final Class167 aClass167_1 = new Class167();

	@OriginalMember(owner = "client!il", name = "q", descriptor = "Z")
	public static boolean aBoolean412 = false;

	@OriginalMember(owner = "client!il", name = "y", descriptor = "[I")
	public static final int[] anIntArray254 = new int[3];

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(IIII)V")
	public static void method4086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Class5_Sub3_Sub17 local14 = Static358.method5408(9, (long) arg0);
		local14.method7286();
		local14.anInt8549 = arg1;
		local14.anInt8546 = arg2;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!eka;IZ)V")
	public static void method4087(@OriginalArg(0) Class5_Sub17_Sub1 arg0) {
		Static39.aClass255_1.method7454(arg0);
		Static448.method6481(Static180.aClass390_42, arg0, Static548.aClass390_107, Static162.aClass390_35, Static39.aClass255_1);
	}
}
