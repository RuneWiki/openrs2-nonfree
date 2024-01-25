import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static247 {

	@OriginalMember(owner = "client!mj", name = "r", descriptor = "[I")
	public static int[] anIntArray318;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "[I")
	public static final int[] anIntArray317 = new int[3];

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_59 = new Class267("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!mj", name = "q", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_91 = new Class92(13, 6);

	@OriginalMember(owner = "client!mj", name = "t", descriptor = "[Lclient!jt;")
	public static final Class136[] aClass136Array1 = new Class136[30];

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;)V")
	public static void method3826(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		Static143.method2456(arg0, null, arg3, arg2, -1, arg4, arg1);
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(III)B")
	public static byte method3831(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
