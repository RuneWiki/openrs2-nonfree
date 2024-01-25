import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
	public static int anInt181;

	@OriginalMember(owner = "client!aj", name = "h", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_9 = new Class12(39, 5);

	@OriginalMember(owner = "client!aj", name = "i", descriptor = "[Z")
	public static final boolean[] aBooleanArray1 = new boolean[100];

	@OriginalMember(owner = "client!aj", name = "o", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_5 = new Class119("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method140(@OriginalArg(1) String arg0) {
		@Pc(9) String local9 = Static401.method5220(Static415.method5404(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(BII)Z")
	public static boolean method142(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
	public static void method143() {
		@Pc(9) int local9 = (int) ((double) Static296.anInt5187 * 34.46D);
		local9 <<= 0x0;
		if (Static185.aClass34_7.method5739()) {
			local9 += 128;
		}
		Static185.aClass34_7.d(50, local9);
	}
}
