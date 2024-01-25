import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIII)V")
	public static void method2462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub1_Sub13 local8 = Static476.method6225(8, arg3);
		local8.method4919();
		local8.anInt5686 = arg2;
		local8.anInt5690 = arg1;
		local8.anInt5680 = arg0;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IBII)I")
	public static int method2463(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static542.aByteArrayArrayArray17[arg2][arg1][arg0] & 0x8) == 0) {
			return arg2 <= 0 || (Static542.aByteArrayArrayArray17[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(III)V")
	public static void method2464(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub1_Sub13 local12 = Static476.method6225(1, arg0);
		local12.method4919();
		local12.anInt5686 = arg1;
	}
}
