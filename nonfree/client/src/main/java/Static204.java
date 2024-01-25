import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!jt", name = "n", descriptor = "I")
	public static int anInt4018 = 1;

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "(B)V")
	public static void method3194() {
		Static353.anIntArray575 = Static381.method3658(0.4F);
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(II)V")
	public static void method3195(@OriginalArg(0) int arg0) {
		@Pc(8) Class10_Sub1_Sub17 local8 = Static154.method2630(1, arg0);
		local8.method5346();
	}

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "(II)I")
	public static int method3196(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}
}
