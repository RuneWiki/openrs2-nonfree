import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tca")
public final class Class337 {

	@OriginalMember(owner = "client!tca", name = "m", descriptor = "Lclient!ui;")
	private final Class359 aClass359_63 = new Class359(64);

	@OriginalMember(owner = "client!tca", name = "d", descriptor = "Lclient!ui;")
	public final Class359 aClass359_64 = new Class359(2);

	@OriginalMember(owner = "client!tca", name = "g", descriptor = "Lclient!lga;")
	private final Class223 aClass223_111;

	@OriginalMember(owner = "client!tca", name = "n", descriptor = "Lclient!lga;")
	public final Class223 aClass223_112;

	@OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(Lclient!fs;ILclient!lga;Lclient!lga;)V")
	public Class337(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2, @OriginalArg(3) Class223 arg3) {
		this.aClass223_111 = arg2;
		this.aClass223_112 = arg3;
		this.aClass223_111.method5264(33);
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(I)V")
	public void method8059() {
		@Pc(2) Class359 local2 = this.aClass359_63;
		synchronized (this.aClass359_63) {
			this.aClass359_63.method8507();
		}
		local2 = this.aClass359_64;
		synchronized (this.aClass359_64) {
			this.aClass359_64.method8507();
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(II)V")
	public void method8060() {
		@Pc(11) Class359 local11 = this.aClass359_63;
		synchronized (this.aClass359_63) {
			this.aClass359_63.method8502(5);
		}
		local11 = this.aClass359_64;
		synchronized (this.aClass359_64) {
			this.aClass359_64.method8502(5);
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(I)V")
	public void method8061() {
		@Pc(6) Class359 local6 = this.aClass359_63;
		synchronized (this.aClass359_63) {
			this.aClass359_63.method8511();
		}
		local6 = this.aClass359_64;
		synchronized (this.aClass359_64) {
			this.aClass359_64.method8511();
		}
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(II)Lclient!hf;")
	public Class151 method8065(@OriginalArg(1) int arg0) {
		@Pc(6) Class359 local6 = this.aClass359_63;
		@Pc(18) Class151 local18;
		synchronized (this.aClass359_63) {
			local18 = (Class151) this.aClass359_63.method8517((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(39) Class223 local39 = this.aClass223_111;
		@Pc(48) byte[] local48;
		synchronized (this.aClass223_111) {
			local48 = this.aClass223_111.method5267(arg0, 33);
		}
		local18 = new Class151();
		local18.aClass337_1 = this;
		if (local48 != null) {
			local18.method4010(new Class6_Sub15(local48));
		}
		@Pc(75) Class359 local75 = this.aClass359_63;
		synchronized (this.aClass359_63) {
			this.aClass359_63.method8515((long) arg0, local18);
			return local18;
		}
	}
}
