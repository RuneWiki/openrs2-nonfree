import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static143 {

	@OriginalMember(owner = "client!gw", name = "E", descriptor = "I")
	public static int anInt2544;

	@OriginalMember(owner = "client!gw", name = "G", descriptor = "Lclient!o;")
	public static Class13 aClass13_11;

	@OriginalMember(owner = "client!gw", name = "I", descriptor = "Lclient!la;")
	public static Class92 aClass92_3;

	@OriginalMember(owner = "client!gw", name = "H", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_50 = new Class134("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!gw", name = "M", descriptor = "I")
	public static int anInt2549 = 0;

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(II)V")
	public static void method2109(@OriginalArg(1) int arg0) {
		Static396.anInt7303 = arg0;
		Static419.aClass132_57.method2698();
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(ILclient!or;Ljava/awt/Canvas;Lclient!l;I)Lclient!za;")
	public static Class163 method2110(@OriginalArg(0) int arg0, @OriginalArg(1) Class183 arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) Interface9 arg3) {
		return new w(arg0, arg2, arg3, arg1);
	}
}
