import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static542 {

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!wq", name = "e", descriptor = "Lclient!kda;")
	public static Class160 aClass160_105;

	@OriginalMember(owner = "client!wq", name = "o", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "Lclient!tda;")
	public static final Class273 aClass273_14 = new Class273(10, 2, 2, 0);

	@OriginalMember(owner = "client!wq", name = "m", descriptor = "Lclient!h;")
	public static final Class114 aClass114_172 = new Class114(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

	@OriginalMember(owner = "client!wq", name = "n", descriptor = "I")
	public static int anInt9387 = 104;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(III)I")
	public static int method7916(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(40) int local40 = Static446.method6421(arg1 + 45365, arg0 + 91923, 4) + (Static446.method6421(arg1 + 10294, arg0 + 37821, 2) - 128 >> 1) + (Static446.method6421(arg1, arg0, 1) + -128 >> 2) - 128;
		local40 = (int) ((double) local40 * 0.3D) + 35;
		if (local40 < 10) {
			local40 = 10;
		} else if (local40 > 60) {
			local40 = 60;
		}
		return local40;
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(III)Z")
	public static boolean method7917(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		@Pc(18) Class288 local18 = Static365.aClass194_6.method5084(arg1);
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local18.method7068(arg0);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Z)V")
	public static void method7919() {
		Static479.aClass252_1 = new Class252(8);
		Static6.anInt98 = 0;
		for (@Pc(15) Class2_Sub3 local15 = (Class2_Sub3) Static14.aClass145_2.method3919(); local15 != null; local15 = (Class2_Sub3) Static14.aClass145_2.method3926()) {
			local15.method2068();
		}
	}
}
