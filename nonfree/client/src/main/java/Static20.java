import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
	public static int anInt569;

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
	public static int anInt571;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "[I")
	public static int[] anIntArray42 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
	public static int anInt570 = 0;

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "[I")
	public static int[] anIntArray43 = new int[200];

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "Lclient!ea;")
	public static Class18 aClass18_178 = Static8.method128("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
	public static int anInt573 = 0;

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "Lclient!ea;")
	public static Class18 aClass18_179 = Static8.method128("Hier wechseln");

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
	public static void method349() {
		aClass18_179 = null;
		anIntArray42 = null;
		aClass18_178 = null;
		anIntArray43 = null;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILclient!c;)V")
	public static void method350(@OriginalArg(1) Class1_Sub1_Sub5_Sub1 arg0) {
		if (Static41.anInt1322 == arg0.anInt3580 || arg0.anInt3568 == -1 || arg0.anInt3597 != 0 || arg0.anInt3589 + 1 > Static121.method2378(arg0.anInt3568).anIntArray309[arg0.anInt3586]) {
			@Pc(37) int local37 = arg0.anInt3580 - arg0.anInt3563;
			@Pc(43) int local43 = Static41.anInt1322 - arg0.anInt3563;
			@Pc(53) int local53 = arg0.anInt3591 * 64 + arg0.anInt3592 * 128;
			@Pc(63) int local63 = arg0.anInt3591 * 64 + arg0.anInt3555 * 128;
			@Pc(73) int local73 = arg0.anInt3591 * 64 + arg0.anInt3559 * 128;
			arg0.anInt3558 = (local43 * local73 + (local37 - local43) * local63) / local37;
			@Pc(97) int local97 = arg0.anInt3596 * 128 + arg0.anInt3591 * 64;
			arg0.anInt3579 = (local97 * local43 + local53 * (local37 - local43)) / local37;
		}
		if (arg0.anInt3574 == 0) {
			arg0.anInt3590 = 1024;
		}
		arg0.anInt3578 = 0;
		if (arg0.anInt3574 == 1) {
			arg0.anInt3590 = 1536;
		}
		if (arg0.anInt3574 == 2) {
			arg0.anInt3590 = 0;
		}
		if (arg0.anInt3574 == 3) {
			arg0.anInt3590 = 512;
		}
		arg0.anInt3576 = arg0.anInt3590;
	}
}
