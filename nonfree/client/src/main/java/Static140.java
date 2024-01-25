import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!fba", name = "F", descriptor = "[[Lclient!faa;")
	public static Class97[][] aClass97ArrayArray1;

	@OriginalMember(owner = "client!fba", name = "J", descriptor = "Lclient!nd;")
	public static final Class214 aClass214_2 = new Class214();

	@OriginalMember(owner = "client!fba", name = "K", descriptor = "I")
	public static int anInt2734 = -1;

	@OriginalMember(owner = "client!fba", name = "L", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray12 = new String[100];

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(II[B)[B")
	public static byte[] method2332(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[arg0];
		Static596.method7719(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lclient!pj;I)V")
	public static void method2334(@OriginalArg(0) Class248 arg0) {
		Static181.anInt3477 = arg0.method5777("hitmarks");
		Static427.anInt7586 = arg0.method5777("hitbar_default");
		Static503.anInt8755 = arg0.method5777("timerbar_default");
		Static44.anInt833 = arg0.method5777("headicons_pk");
		Static10.anInt139 = arg0.method5777("headicons_prayer");
		Static255.anInt4660 = arg0.method5777("hint_headicons");
		Static194.anInt3795 = arg0.method5777("hint_mapmarkers");
		Static377.anInt6888 = arg0.method5777("mapflag");
		Static450.anInt7953 = arg0.method5777("cross");
		Static585.anInt6434 = arg0.method5777("mapdots");
		Static493.anInt8640 = arg0.method5777("scrollbar");
		Static425.anInt7500 = arg0.method5777("name_icons");
		Static24.anInt431 = arg0.method5777("floorshadows");
		Static574.anInt4894 = arg0.method5777("compass");
		Static536.anInt9212 = arg0.method5777("otherlevel");
		Static389.anInt7106 = arg0.method5777("hint_mapedge");
	}
}
