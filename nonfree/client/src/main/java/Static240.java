import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "Lclient!ns;")
	public static Class166 aClass166_165;

	@OriginalMember(owner = "client!lv", name = "c", descriptor = "I")
	public static int anInt4394;

	@OriginalMember(owner = "client!lv", name = "f", descriptor = "I")
	public static int anInt4396;

	@OriginalMember(owner = "client!lv", name = "h", descriptor = "Lclient!ns;")
	public static Class166 aClass166_166;

	@OriginalMember(owner = "client!lv", name = "e", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_61 = new Class242("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!lv", name = "g", descriptor = "I")
	public static int anInt4397 = 1;

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lclient!rk;I)V")
	public static void method3311(@OriginalArg(0) Class6_Sub2_Sub1_Sub2 arg0) {
		for (@Pc(10) Class4_Sub44 local10 = (Class4_Sub44) Static208.aClass258_31.method5538(); local10 != null; local10 = (Class4_Sub44) Static208.aClass258_31.method5528()) {
			if (local10.aClass6_Sub2_Sub1_Sub2_1 == arg0) {
				if (local10.aClass4_Sub18_Sub2_3 != null) {
					Static393.aClass4_Sub18_Sub1_1.method2789(local10.aClass4_Sub18_Sub2_3);
					local10.aClass4_Sub18_Sub2_3 = null;
				}
				local10.method5854();
				return;
			}
		}
	}
}
