import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!nl", name = "m", descriptor = "I")
	public static int anInt6250 = 0;

	@OriginalMember(owner = "client!nl", name = "p", descriptor = "[I")
	public static final int[] anIntArray340 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(FIIIZIII)[I")
	public static int[] method5293(@OriginalArg(0) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class3_Sub6_Sub23 local10 = new Class3_Sub6_Sub23();
		local10.anInt5590 = 8;
		local10.anInt5587 = (int) (arg0 * 4096.0F);
		local10.aBoolean404 = true;
		local10.anInt5595 = 35;
		local10.anInt5592 = 8;
		local10.anInt5597 = 4;
		local10.method7768();
		Static181.method3119(2048, 1);
		local10.method4773(0, local6);
		return local6;
	}
}
