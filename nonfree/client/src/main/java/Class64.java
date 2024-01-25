import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class64 {

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "Lclient!kh;")
	private final Class134 aClass134_15 = new Class134(64);

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "Lclient!ul;")
	private final Class246 aClass246_55;

	static {
		new Class7("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");
	}

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lclient!ee;ILclient!ul;)V")
	public Class64(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2) {
		this.aClass246_55 = arg2;
		this.aClass246_55.method5492(5);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)Lclient!nl;")
	public Class1_Sub2_Sub10 method1692(@OriginalArg(0) int arg0) {
		@Pc(6) Class134 local6 = this.aClass134_15;
		@Pc(18) Class1_Sub2_Sub10 local18;
		synchronized (this.aClass134_15) {
			local18 = (Class1_Sub2_Sub10) this.aClass134_15.method3266((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(36) Class246 local36 = this.aClass246_55;
		@Pc(45) byte[] local45;
		synchronized (this.aClass246_55) {
			local45 = this.aClass246_55.method5477(5, arg0);
		}
		local18 = new Class1_Sub2_Sub10();
		if (local45 != null) {
			local18.method3941(new Class1_Sub5(local45));
		}
		@Pc(69) Class134 local69 = this.aClass134_15;
		synchronized (this.aClass134_15) {
			this.aClass134_15.method3263((long) arg0, local18);
			return local18;
		}
	}
}
