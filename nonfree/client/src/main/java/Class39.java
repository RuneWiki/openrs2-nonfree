import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!caa")
public final class Class39 {

	@OriginalMember(owner = "client!caa", name = "k", descriptor = "Lclient!tja;")
	private final Class352 aClass352_9 = new Class352(64);

	@OriginalMember(owner = "client!caa", name = "h", descriptor = "Lclient!bt;")
	private final Class34 aClass34_10;

	@OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(Lclient!mja;ILclient!bt;)V")
	public Class39(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2) {
		this.aClass34_10 = arg2;
		if (this.aClass34_10 != null) {
			this.aClass34_10.method1233(35);
		}
	}

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "(I)V")
	public void method1308() {
		@Pc(2) Class352 local2 = this.aClass352_9;
		synchronized (this.aClass352_9) {
			this.aClass352_9.method7656();
		}
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(BI)V")
	public void method1309() {
		@Pc(11) Class352 local11 = this.aClass352_9;
		synchronized (this.aClass352_9) {
			this.aClass352_9.method7663(5);
		}
	}

	@OriginalMember(owner = "client!caa", name = "c", descriptor = "(I)V")
	public void method1310() {
		@Pc(6) Class352 local6 = this.aClass352_9;
		synchronized (this.aClass352_9) {
			this.aClass352_9.method7659();
		}
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(II)Lclient!kr;")
	public Class200 method1311(@OriginalArg(0) int arg0) {
		@Pc(6) Class352 local6 = this.aClass352_9;
		@Pc(18) Class200 local18;
		synchronized (this.aClass352_9) {
			local18 = (Class200) this.aClass352_9.method7653((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class34 local31 = this.aClass34_10;
		@Pc(40) byte[] local40;
		synchronized (this.aClass34_10) {
			local40 = this.aClass34_10.method1239(35, arg0);
		}
		local18 = new Class200();
		if (local40 != null) {
			local18.method4433(new Class4_Sub11(local40));
		}
		local18.method4435();
		@Pc(67) Class352 local67 = this.aClass352_9;
		synchronized (this.aClass352_9) {
			this.aClass352_9.method7655((long) arg0, local18);
			return local18;
		}
	}
}
