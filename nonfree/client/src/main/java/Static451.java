import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
	public static int anInt7414;

	@OriginalMember(owner = "client!wi", name = "o", descriptor = "[I")
	public static int[] anIntArray501;

	@OriginalMember(owner = "client!wi", name = "p", descriptor = "I")
	public static int anInt7415;

	@OriginalMember(owner = "client!wi", name = "q", descriptor = "Lclient!um;")
	public static Class243 aClass243_252;

	@OriginalMember(owner = "client!wi", name = "l", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_189 = new Class129(39, 4);

	@OriginalMember(owner = "client!wi", name = "m", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_126 = new Class198(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V")
	public static void method5941() {
		for (@Pc(7) int local7 = 0; local7 < Static452.aByteArrayArrayArray16.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static452.aByteArrayArrayArray16[0].length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < Static452.aByteArrayArrayArray16[0][0].length; local15++) {
					Static452.aByteArrayArrayArray16[local7][local11][local15] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IB)V")
	public static void method5942(@OriginalArg(0) int arg0) {
		@Pc(16) Class5_Sub2_Sub9 local16 = Static72.method1073(1, arg0);
		local16.method3024();
	}
}
