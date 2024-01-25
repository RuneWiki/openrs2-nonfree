import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "Lclient!tf;")
	public static Class340 aClass340_40 = new Class340();

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIII)V")
	public static void method5187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(25) Class6_Sub2_Sub4 local25 = Static602.method8315((long) arg0 | (long) arg3 << 32, 18);
		local25.method2040();
		local25.anInt2113 = arg1;
		local25.anInt2111 = arg2;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)I")
	public static int method5188() {
		return Static616.aClass339_1.method8113();
	}
}
