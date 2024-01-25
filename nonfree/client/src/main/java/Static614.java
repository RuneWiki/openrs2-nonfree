import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static614 {

	@OriginalMember(owner = "client!uga", name = "f", descriptor = "[I")
	public static int[] anIntArray552;

	@OriginalMember(owner = "client!uga", name = "d", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_258 = new Class160(108, 0);

	@OriginalMember(owner = "client!uga", name = "b", descriptor = "Z")
	public static boolean aBoolean702 = false;

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(ZI)V")
	public static void method8650(@OriginalArg(1) int arg0) {
		@Pc(16) Class14_Sub2_Sub9 local16 = Static499.method7527((long) arg0, 14);
		local16.method4001();
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(III)Z")
	public static boolean method8657(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}
}
