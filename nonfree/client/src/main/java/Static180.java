import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!he", name = "t", descriptor = "I")
	public static int anInt3500;

	@OriginalMember(owner = "client!he", name = "l", descriptor = "I")
	public static int anInt3497 = 0;

	@OriginalMember(owner = "client!he", name = "q", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_57 = new Class40(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

	@OriginalMember(owner = "client!he", name = "r", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_33 = new Class236(28, 3);

	@OriginalMember(owner = "client!he", name = "s", descriptor = "[I")
	public static final int[] anIntArray262 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)I")
	public static int method3076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static401.aShortArrayArray8 == null ? 0 : Static401.aShortArrayArray8[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(II)V")
	public static void method3080() {
		@Pc(9) Class288 local9 = Static240.aClass288_34;
		synchronized (Static240.aClass288_34) {
			Static240.aClass288_34.method6735(5);
		}
		local9 = Static229.aClass288_33;
		synchronized (Static229.aClass288_33) {
			Static229.aClass288_33.method6735(5);
		}
	}
}
