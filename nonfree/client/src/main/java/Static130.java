import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static130 {

	@OriginalMember(owner = "client!go", name = "c", descriptor = "[Lclient!lo;")
	public static final Class155[] aClass155Array6 = new Class155[4];

	@OriginalMember(owner = "client!go", name = "j", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_74 = new Class96("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!go", name = "l", descriptor = "I")
	public static int anInt4554 = -50;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ZIII[ILclient!qg;)Lclient!ls;")
	public static Class21_Sub2_Sub1 method3750(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int[] arg2, @OriginalArg(5) Class121_Sub2 arg3) {
		if (arg3.aBoolean461 || Static362.method5163(arg0) && Static362.method5163(arg1)) {
			return new Class21_Sub2_Sub1(arg3, 3553, arg0, arg1, false, arg2);
		} else if (arg3.aBoolean484) {
			return new Class21_Sub2_Sub1(arg3, 34037, arg0, arg1, false, arg2);
		} else {
			return new Class21_Sub2_Sub1(arg3, arg0, arg1, Static30.method427(arg0), Static30.method427(arg1), arg2);
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IBILclient!tn;)V")
	public static void method3751(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class229 arg2) {
		Static357.anInt6540 = arg0;
		Static392.anInt7049 = arg1;
		Static245.aClass229_7 = arg2;
	}
}
