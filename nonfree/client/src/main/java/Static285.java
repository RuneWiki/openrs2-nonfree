import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "Z")
	public static boolean aBoolean434;

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "Lclient!he;")
	public static Class100 aClass100_83;

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_92 = new Class267("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray43 = new String[100];

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILclient!og;)V")
	public static void method5697(@OriginalArg(0) int arg0, @OriginalArg(1) Class86 arg1) {
		Static55.aClass86Array1[arg0] = arg1;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V")
	public static void method5698() {
		for (@Pc(6) Class6_Sub19 local6 = (Class6_Sub19) Static182.aClass244_16.method5976(); local6 != null; local6 = (Class6_Sub19) Static182.aClass244_16.method5964()) {
			if (local6.aBoolean232) {
				local6.method2972();
			}
		}
		for (@Pc(35) Class6_Sub19 local35 = (Class6_Sub19) Static307.aClass244_26.method5976(); local35 != null; local35 = (Class6_Sub19) Static307.aClass244_26.method5964()) {
			if (local35.aBoolean232) {
				local35.method2972();
			}
		}
	}
}
