import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "Lclient!lga;")
	public static Class223 aClass223_41;

	@OriginalMember(owner = "client!gu", name = "f", descriptor = "[I")
	public static final int[] anIntArray215 = new int[32];

	@OriginalMember(owner = "client!gu", name = "k", descriptor = "Lclient!hj;")
	public static final Class158 aClass158_4 = new Class158(13, 0, 1, 0);

	@OriginalMember(owner = "client!gu", name = "l", descriptor = "I")
	public static int anInt4178 = 0;

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)V")
	public static void method3838(@OriginalArg(0) int arg0) {
		Static366.anInt6173 = arg0;
		@Pc(7) Class359 local7 = Static307.aClass359_44;
		synchronized (Static307.aClass359_44) {
			Static307.aClass359_44.method8507();
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIIIB)V")
	public static void method3839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(18) Class6_Sub2_Sub4 local18 = Static602.method8315((long) arg3, 10);
		local18.method2040();
		local18.anInt2116 = arg2;
		local18.anInt2113 = arg1;
		local18.anInt2111 = arg0;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(III)I")
	public static int method3840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local7 *= arg0;
			}
			arg1 >>= 0x1;
			arg0 *= arg0;
		}
		if (arg1 == 1) {
			return arg0 * local7;
		} else {
			return local7;
		}
	}
}
