import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!jh", name = "C", descriptor = "I")
	public static int anInt4778;

	@OriginalMember(owner = "client!jh", name = "D", descriptor = "I")
	public static int anInt4779;

	@OriginalMember(owner = "client!jh", name = "y", descriptor = "Z")
	public static boolean aBoolean329 = false;

	@OriginalMember(owner = "client!jh", name = "B", descriptor = "[I")
	public static final int[] anIntArray386 = new int[1];

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZLclient!fb;)V")
	public static void method3998(@OriginalArg(1) Class12_Sub2_Sub2_Sub1_Sub2 arg0) {
		@Pc(16) Class14_Sub31 local16 = (Class14_Sub31) Static587.aClass187_83.method4078((long) arg0.anInt2945);
		if (local16 == null) {
			return;
		}
		if (local16.aClass14_Sub5_Sub4_2 != null) {
			Static217.aClass14_Sub5_Sub3_1.method6029(local16.aClass14_Sub5_Sub4_2);
			local16.aClass14_Sub5_Sub4_2 = null;
		}
		local16.method9315();
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(IBI)Z")
	public static boolean method4000(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}
}
