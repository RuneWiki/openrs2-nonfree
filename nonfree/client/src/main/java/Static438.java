import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!pba", name = "i", descriptor = "I")
	public static int anInt7717 = -1;

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(IBI)Z")
	public static boolean method6518(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(III)V")
	public static void method6519(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class5_Sub3_Sub17 local11 = Static358.method5408(16, (long) arg0);
		local11.method7286();
		local11.anInt8546 = arg1;
	}
}
