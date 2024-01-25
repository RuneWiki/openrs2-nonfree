import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static592 {

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "Lclient!vb;")
	public static Class371 aClass371_12;

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "[Lclient!hu;")
	public static Class51_Sub1[] aClass51_Sub1Array2 = new Class51_Sub1[0];

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
	public static int anInt9548 = 765;

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "[I")
	public static final int[] anIntArray535 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)V")
	public static void method8148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class5_Sub1_Sub18 local14 = Static123.method1827((long) arg0, 1);
		local14.method7441();
		local14.anInt8635 = arg1;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/lang/String;IB)I")
	public static int method8150(@OriginalArg(0) String arg0) {
		return Static181.method3134(16, arg0);
	}
}
