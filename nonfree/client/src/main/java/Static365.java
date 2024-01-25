import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!mda", name = "i", descriptor = "I")
	public static int anInt6627;

	@OriginalMember(owner = "client!mda", name = "k", descriptor = "F")
	public static float aFloat125;

	@OriginalMember(owner = "client!mda", name = "n", descriptor = "I")
	public static int anInt6630;

	@OriginalMember(owner = "client!mda", name = "p", descriptor = "I")
	public static int anInt6631;

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lclient!mc;I)Lclient!wja;")
	public static Class388 method5528(@OriginalArg(0) Class5_Sub41 arg0) {
		@Pc(15) Class388 local15 = new Class388();
		local15.anInt10678 = arg0.method7860();
		local15.aClass5_Sub3_Sub2_1 = Static502.aClass163_2.method3900(local15.anInt10678);
		return local15;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(Ljava/lang/String;IBLjava/lang/String;)V")
	public static void method5530(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		Static270.anInt4979 = arg1;
		Static245.anInt780 = 2;
		Static430.method58(arg0, arg2, false);
	}
}
