import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(III)V")
	public static void method5427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class1_Sub3_Sub13 local14 = Static397.method4998(7, arg0);
		local14.method3459();
		local14.anInt4301 = arg1;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)J")
	public static long method5428() {
		return Static123.aClass11_1.method4913();
	}
}
