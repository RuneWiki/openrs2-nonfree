import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static676 {

	@OriginalMember(owner = "client!ww", name = "d", descriptor = "I")
	public static int anInt9309;

	@OriginalMember(owner = "client!ww", name = "i", descriptor = "I")
	public static int anInt9313;

	@OriginalMember(owner = "client!ww", name = "j", descriptor = "[I")
	public static int[] anIntArray511;

	@OriginalMember(owner = "client!ww", name = "k", descriptor = "[I")
	public static final int[] anIntArray512 = new int[1];

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(BILjava/lang/String;)V")
	public static void method7789(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(13) Class5_Sub2_Sub4 local13 = Static257.method3597(3, (long) arg0);
		local13.method2438();
		local13.aString26 = arg1;
	}
}
