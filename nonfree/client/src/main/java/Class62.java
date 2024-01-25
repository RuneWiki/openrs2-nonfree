import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class62 {

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "Lclient!jo;")
	private Class126 aClass126_13 = new Class126(128);

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "Lclient!jo;")
	public Class126 aClass126_14 = new Class126(64);

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "Lclient!ok;")
	private final Class178 aClass178_24;

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "Lclient!ok;")
	public final Class178 aClass178_25;

	static {
		new Class55("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");
	}

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lclient!kr;ILclient!ok;Lclient!ok;)V")
	public Class62(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class178 arg2, @OriginalArg(3) Class178 arg3) {
		this.aClass178_24 = arg2;
		this.aClass178_25 = arg3;
		this.aClass178_24.method3833(36);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V")
	public void method1476() {
		@Pc(6) Class126 local6 = this.aClass126_13;
		synchronized (this.aClass126_13) {
			this.aClass126_13.method2821();
		}
		local6 = this.aClass126_14;
		synchronized (this.aClass126_14) {
			this.aClass126_14.method2821();
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
	public void method1479() {
		@Pc(8) Class126 local8 = this.aClass126_13;
		synchronized (this.aClass126_13) {
			this.aClass126_13.method2827();
		}
		local8 = this.aClass126_14;
		synchronized (this.aClass126_14) {
			this.aClass126_14.method2827();
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)Lclient!b;")
	public Class20 method1481(@OriginalArg(0) int arg0) {
		@Pc(6) Class126 local6 = this.aClass126_13;
		@Pc(16) Class20 local16;
		synchronized (this.aClass126_13) {
			local16 = (Class20) this.aClass126_13.method2822((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class178 local29 = this.aClass178_24;
		@Pc(38) byte[] local38;
		synchronized (this.aClass178_24) {
			local38 = this.aClass178_24.method3838(arg0, 36);
		}
		local16 = new Class20();
		local16.aClass62_1 = this;
		local16.anInt315 = arg0;
		if (local38 != null) {
			local16.method219(new Class7_Sub14(local38));
		}
		local16.method216();
		@Pc(77) Class126 local77 = this.aClass126_13;
		synchronized (this.aClass126_13) {
			this.aClass126_13.method2824((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BI)V")
	public void method1482() {
		@Pc(2) Class126 local2 = this.aClass126_13;
		synchronized (this.aClass126_13) {
			this.aClass126_13.method2828(5);
		}
		local2 = this.aClass126_14;
		synchronized (this.aClass126_14) {
			this.aClass126_14.method2828(5);
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(III)V")
	public void method1484(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass126_13 = new Class126(arg0);
		this.aClass126_14 = new Class126(arg1);
	}
}
