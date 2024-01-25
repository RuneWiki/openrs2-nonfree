import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!ns", name = "T", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_78 = new Class198("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

	@OriginalMember(owner = "client!ns", name = "eb", descriptor = "Lclient!ne;")
	public static final Class170 aClass170_8 = new Class170("LIVE", 0);

	@OriginalMember(owner = "client!ns", name = "gb", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_80 = new Class194(7, 7);

	@OriginalMember(owner = "client!ns", name = "hb", descriptor = "[C")
	public static final char[] aCharArray5 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Z)V")
	public static void method3586() {
		if (!Static423.aBoolean478) {
			return;
		}
		@Pc(11) Class76 local11 = Static371.method4859(Static143.anInt2595, Static127.anInt2221);
		if (local11 != null && local11.anObjectArray16 != null) {
			@Pc(20) Class5_Sub33 local20 = new Class5_Sub33();
			local20.aClass76_12 = local11;
			local20.anObjectArray35 = local11.anObjectArray16;
			Static181.method2470(local20);
		}
		Static333.anInt5333 = -1;
		Static423.aBoolean478 = false;
		Static374.anInt6237 = -1;
		if (local11 != null) {
			Static53.method833(local11);
		}
	}

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "(II)I")
	public static int method3588(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static313.method4880(arg0);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZBI)V")
	public static void method3592(@OriginalArg(1) boolean arg0) {
		Static48.anInt888 = 2;
		Static193.anInt3215 = 22050;
		Static335.aBoolean372 = arg0;
	}
}
