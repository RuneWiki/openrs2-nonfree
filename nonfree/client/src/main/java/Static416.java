import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!va", name = "m", descriptor = "I")
	public static int anInt4774;

	@OriginalMember(owner = "client!va", name = "j", descriptor = "I")
	public static int anInt4772 = 0;

	@OriginalMember(owner = "client!va", name = "k", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_80 = new Class186(44, 4);

	@OriginalMember(owner = "client!va", name = "l", descriptor = "I")
	public static int anInt4773 = 0;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI)Z")
	public static boolean method4229(@OriginalArg(0) boolean arg0) {
		@Pc(6) boolean local6 = Static44.aClass28_14.method3563();
		if (local6 == arg0) {
			return true;
		}
		if (!arg0) {
			Static44.aClass28_14.method3580();
		} else if (!Static44.aClass28_14.method3499()) {
			arg0 = false;
		}
		if (local6 == arg0) {
			return false;
		} else {
			Static8.aClass173_Sub1_1.aBoolean308 = arg0;
			Static8.aClass173_Sub1_1.method3970(Static165.aClass103_3);
			return true;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIII)V")
	public static void method4234(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class6_Sub1_Sub12 local15 = Static449.method5975(arg2, 11);
		local15.method3043();
		local15.anInt3397 = arg1;
		local15.anInt3403 = arg0;
	}
}
