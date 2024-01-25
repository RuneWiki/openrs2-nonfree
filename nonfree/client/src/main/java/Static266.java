import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!nh", name = "A", descriptor = "I")
	public static int anInt4570;

	@OriginalMember(owner = "client!nh", name = "N", descriptor = "I")
	public static int anInt4578;

	@OriginalMember(owner = "client!nh", name = "B", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_75 = new Class186(6, -1);

	@OriginalMember(owner = "client!nh", name = "K", descriptor = "[I")
	public static final int[] anIntArray404 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(III)V")
	public static void method4086(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class6_Sub1_Sub12 local12 = Static449.method5975(arg1, 7);
		local12.method3043();
		local12.anInt3397 = arg0;
	}
}
