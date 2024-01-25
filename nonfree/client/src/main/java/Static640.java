import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static640 {

	@OriginalMember(owner = "client!vk", name = "w", descriptor = "F")
	public static float aFloat210;

	@OriginalMember(owner = "client!vk", name = "s", descriptor = "Lclient!tja;")
	public static final Class336 aClass336_20 = new Class336(6, 8);

	@OriginalMember(owner = "client!vk", name = "v", descriptor = "[I")
	public static final int[] anIntArray890 = new int[1];

	@OriginalMember(owner = "client!vk", name = "x", descriptor = "I")
	public static int anInt10168 = 1;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(BIZ)Lclient!g;")
	public static Class3_Sub24 method8894(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(20) long local20 = (long) ((arg1 ? Integer.MIN_VALUE : 0) | arg0);
		return (Class3_Sub24) Static36.aClass83_2.method2368(local20);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)V")
	public static void method8895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class3_Sub11_Sub4 local9 = Static583.method8201(1, (long) arg1);
		local9.method2195();
		local9.anInt2394 = arg0;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
	public static void method8896() {
		if (Static406.anInt6454 == 9) {
			Static553.method7892(5);
		} else if (Static406.anInt6454 == 5 || Static406.anInt6454 == 6) {
			Static553.method7892(3);
		} else if (Static406.anInt6454 == 12) {
			Static553.method7892(3);
			return;
		}
	}
}
