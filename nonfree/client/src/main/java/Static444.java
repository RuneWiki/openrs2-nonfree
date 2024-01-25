import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!pca", name = "k", descriptor = "Lclient!rb;")
	public static Class297 aClass297_6;

	@OriginalMember(owner = "client!pca", name = "g", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_241 = new Class196(68, -2);

	@OriginalMember(owner = "client!pca", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray29 = new String[5];

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(IC)Z")
	public static boolean method6616(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(B)Lclient!dd;")
	public static Class5_Sub16 method6617() {
		@Pc(6) Class5_Sub16 local6 = Static612.method8232();
		local6.aClass187_27 = null;
		local6.anInt1727 = 0;
		local6.aClass5_Sub15_Sub2_1 = new Class5_Sub15_Sub2(5000);
		return local6;
	}
}
