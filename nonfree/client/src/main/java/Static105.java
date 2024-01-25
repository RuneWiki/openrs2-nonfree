import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
	public static int anInt2073;

	@OriginalMember(owner = "client!fm", name = "j", descriptor = "Lclient!ii;")
	public static Class111 aClass111_3;

	@OriginalMember(owner = "client!fm", name = "h", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_32 = new Class244(63, 7);

	@OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
	public static int anInt2075 = 0;

	@OriginalMember(owner = "client!fm", name = "k", descriptor = "I")
	public static int anInt2076 = 0;

	@OriginalMember(owner = "client!fm", name = "l", descriptor = "[I")
	public static final int[] anIntArray206 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!fm", name = "m", descriptor = "[S")
	public static final short[] aShortArray41 = new short[] { 30, 15, 22, 18, 59, 45, 23, 6 };

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(BII)V")
	public static void method1728(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class3_Sub7_Sub8 local13 = Static275.method4307(6, arg0);
		local13.method3219();
		local13.anInt3670 = arg1;
	}
}
