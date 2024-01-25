import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static666 {

	@OriginalMember(owner = "client!wia", name = "h", descriptor = "[I")
	public static int[] anIntArray614;

	@OriginalMember(owner = "client!wia", name = "g", descriptor = "Z")
	public static volatile boolean aBoolean785 = false;

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(III)V")
	public static void method9172(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static376.method5512(arg0, arg1);
	}

	@OriginalMember(owner = "client!wia", name = "b", descriptor = "(III)V")
	public static void method9174(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class5_Sub5_Sub6 local11 = Static478.method6972((long) arg0, 13);
		local11.method2687();
		local11.anInt3058 = arg1;
	}
}
