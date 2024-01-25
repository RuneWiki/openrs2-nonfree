import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ss")
public final class Class335 {

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "Lclient!ui;")
	private Class359 aClass359_62 = new Class359(64);

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "Lclient!lga;")
	private final Class223 aClass223_108;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Lclient!fs;ILclient!lga;)V")
	public Class335(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2) {
		this.aClass223_108 = arg2;
		if (this.aClass223_108 != null) {
			@Pc(20) int local20 = this.aClass223_108.method5290() - 1;
			this.aClass223_108.method5264(local20);
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V")
	public void method7985() {
		@Pc(6) Class359 local6 = this.aClass359_62;
		synchronized (this.aClass359_62) {
			this.aClass359_62.method8507();
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)Lclient!ji;")
	public Class191 method7986(@OriginalArg(0) int arg0) {
		@Pc(14) Class359 local14 = this.aClass359_62;
		@Pc(24) Class191 local24;
		synchronized (this.aClass359_62) {
			local24 = (Class191) this.aClass359_62.method8517((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(38) Class223 local38 = this.aClass223_108;
		@Pc(51) byte[] local51;
		synchronized (this.aClass223_108) {
			local51 = this.aClass223_108.method5267(Static212.method6681(arg0), Static426.method8712(arg0));
		}
		local24 = new Class191();
		if (local51 != null) {
			local24.method4697(new Class6_Sub15(local51));
		}
		@Pc(75) Class359 local75 = this.aClass359_62;
		synchronized (this.aClass359_62) {
			this.aClass359_62.method8515((long) arg0, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IZ)V")
	public void method7987(@OriginalArg(0) int arg0) {
		@Pc(6) Class359 local6 = this.aClass359_62;
		synchronized (this.aClass359_62) {
			this.aClass359_62.method8507();
			this.aClass359_62 = new Class359(arg0);
		}
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(II)V")
	public void method7988() {
		@Pc(7) Class359 local7 = this.aClass359_62;
		synchronized (this.aClass359_62) {
			this.aClass359_62.method8502(5);
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)V")
	public void method7989() {
		@Pc(2) Class359 local2 = this.aClass359_62;
		synchronized (this.aClass359_62) {
			this.aClass359_62.method8511();
		}
	}
}
