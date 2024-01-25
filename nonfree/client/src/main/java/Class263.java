import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rw")
public final class Class263 {

	@OriginalMember(owner = "client!rw", name = "d", descriptor = "Lclient!wg;")
	private final Class313 aClass313_55 = new Class313(256);

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "Lclient!kr;")
	private final Class171 aClass171_134;

	static {
		new Class306("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Lclient!g;ILclient!kr;)V")
	public Class263(@OriginalArg(0) Class101 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_134 = arg2;
		this.aClass171_134.method4349(26);
	}

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "(II)Lclient!at;")
	public Class1_Sub1_Sub2 method6267(@OriginalArg(1) int arg0) {
		@Pc(6) Class313 local6 = this.aClass313_55;
		@Pc(18) Class1_Sub1_Sub2 local18;
		synchronized (this.aClass313_55) {
			local18 = (Class1_Sub1_Sub2) this.aClass313_55.method7406((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class171 local31 = this.aClass171_134;
		@Pc(46) byte[] local46;
		synchronized (this.aClass171_134) {
			local46 = this.aClass171_134.method4339(26, arg0);
		}
		local18 = new Class1_Sub1_Sub2();
		if (local46 != null) {
			local18.method564(new Class1_Sub6(local46));
		}
		@Pc(68) Class313 local68 = this.aClass313_55;
		synchronized (this.aClass313_55) {
			this.aClass313_55.method7399((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!rw", name = "c", descriptor = "(II)V")
	public void method6268() {
		@Pc(2) Class313 local2 = this.aClass313_55;
		synchronized (this.aClass313_55) {
			this.aClass313_55.method7403(5);
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(B)V")
	public void method6269() {
		@Pc(10) Class313 local10 = this.aClass313_55;
		synchronized (this.aClass313_55) {
			this.aClass313_55.method7398();
		}
	}

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "(B)V")
	public void method6271() {
		@Pc(8) Class313 local8 = this.aClass313_55;
		synchronized (this.aClass313_55) {
			this.aClass313_55.method7400();
		}
	}
}
