import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lv")
public final class Class150 {

	@OriginalMember(owner = "client!lv", name = "e", descriptor = "Lclient!ad;")
	private final Class5 aClass5_38 = new Class5(64);

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "Lclient!dn;")
	private final Class56 aClass56_63;

	static {
		new Class175("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
	}

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(Lclient!gt;ILclient!dn;)V")
	public Class150(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class56 arg2) {
		this.aClass56_63 = arg2;
		this.aClass56_63.method1373(5);
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(II)Lclient!ci;")
	public Class3_Sub3_Sub6 method3776(@OriginalArg(0) int arg0) {
		@Pc(14) Class5 local14 = this.aClass5_38;
		@Pc(24) Class3_Sub3_Sub6 local24;
		synchronized (this.aClass5_38) {
			local24 = (Class3_Sub3_Sub6) this.aClass5_38.method104((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(41) byte[] local41 = this.aClass56_63.method1384(5, arg0);
		local24 = new Class3_Sub3_Sub6();
		if (local41 != null) {
			local24.method1077(new Class3_Sub2(local41));
		}
		@Pc(57) Class5 local57 = this.aClass5_38;
		synchronized (this.aClass5_38) {
			this.aClass5_38.method114((long) arg0, local24);
			return local24;
		}
	}
}
