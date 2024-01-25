import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qt")
public final class Class306 {

	@OriginalMember(owner = "client!qt", name = "i", descriptor = "Lclient!ui;")
	private Class359 aClass359_56 = new Class359(64);

	@OriginalMember(owner = "client!qt", name = "k", descriptor = "Lclient!ui;")
	public Class359 aClass359_57 = new Class359(64);

	@OriginalMember(owner = "client!qt", name = "c", descriptor = "Lclient!lga;")
	public final Class223 aClass223_98;

	@OriginalMember(owner = "client!qt", name = "d", descriptor = "Lclient!lga;")
	private final Class223 aClass223_99;

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lclient!fs;ILclient!lga;Lclient!lga;)V")
	public Class306(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2, @OriginalArg(3) Class223 arg3) {
		this.aClass223_98 = arg3;
		this.aClass223_99 = arg2;
		this.aClass223_99.method5264(34);
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(II)V")
	public void method7368() {
		@Pc(2) Class359 local2 = this.aClass359_56;
		synchronized (this.aClass359_56) {
			this.aClass359_56.method8502(5);
		}
		local2 = this.aClass359_57;
		synchronized (this.aClass359_57) {
			this.aClass359_57.method8502(5);
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IZI)V")
	public void method7369(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass359_56 = new Class359(arg1);
		this.aClass359_57 = new Class359(arg0);
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(II)Lclient!ri;")
	public Class317 method7371(@OriginalArg(1) int arg0) {
		@Pc(14) Class359 local14 = this.aClass359_56;
		@Pc(24) Class317 local24;
		synchronized (this.aClass359_56) {
			local24 = (Class317) this.aClass359_56.method8517((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(38) Class223 local38 = this.aClass223_99;
		@Pc(47) byte[] local47;
		synchronized (this.aClass223_99) {
			local47 = this.aClass223_99.method5267(arg0, 34);
		}
		local24 = new Class317();
		local24.aClass306_5 = this;
		if (local47 != null) {
			local24.method7552(new Class6_Sub15(local47));
		}
		@Pc(74) Class359 local74 = this.aClass359_56;
		synchronized (this.aClass359_56) {
			this.aClass359_56.method8515((long) arg0, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(I)V")
	public void method7373() {
		@Pc(2) Class359 local2 = this.aClass359_56;
		synchronized (this.aClass359_56) {
			this.aClass359_56.method8511();
		}
		local2 = this.aClass359_57;
		synchronized (this.aClass359_57) {
			this.aClass359_57.method8511();
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(Z)V")
	public void method7374() {
		@Pc(6) Class359 local6 = this.aClass359_56;
		synchronized (this.aClass359_56) {
			this.aClass359_56.method8507();
		}
		local6 = this.aClass359_57;
		synchronized (this.aClass359_57) {
			this.aClass359_57.method8507();
		}
	}
}
