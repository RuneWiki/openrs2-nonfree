import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class313 {

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "Lclient!ui;")
	public final Class359 aClass359_59 = new Class359(20);

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "Lclient!ui;")
	private final Class359 aClass359_60 = new Class359(64);

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "Lclient!lga;")
	public final Class223 aClass223_101;

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "Lclient!lga;")
	private final Class223 aClass223_102;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lclient!fs;ILclient!lga;Lclient!lga;)V")
	public Class313(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2, @OriginalArg(3) Class223 arg3) {
		this.aClass223_101 = arg3;
		this.aClass223_102 = arg2;
		this.aClass223_102.method5264(46);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)V")
	public void method7515() {
		@Pc(2) Class359 local2 = this.aClass359_60;
		synchronized (this.aClass359_60) {
			this.aClass359_60.method8502(5);
		}
		local2 = this.aClass359_59;
		synchronized (this.aClass359_59) {
			this.aClass359_59.method8502(5);
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(BI)Lclient!aha;")
	public Class14 method7516(@OriginalArg(1) int arg0) {
		@Pc(6) Class359 local6 = this.aClass359_60;
		@Pc(16) Class14 local16;
		synchronized (this.aClass359_60) {
			local16 = (Class14) this.aClass359_60.method8517((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class223 local30 = this.aClass223_102;
		@Pc(39) byte[] local39;
		synchronized (this.aClass223_102) {
			local39 = this.aClass223_102.method5267(arg0, 46);
		}
		local16 = new Class14();
		local16.aClass313_1 = this;
		if (local39 != null) {
			local16.method188(new Class6_Sub15(local39));
		}
		@Pc(74) Class359 local74 = this.aClass359_60;
		synchronized (this.aClass359_60) {
			this.aClass359_60.method8515((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V")
	public void method7517() {
		@Pc(2) Class359 local2 = this.aClass359_60;
		synchronized (this.aClass359_60) {
			this.aClass359_60.method8507();
		}
		local2 = this.aClass359_59;
		synchronized (this.aClass359_59) {
			this.aClass359_59.method8507();
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
	public void method7518() {
		@Pc(11) Class359 local11 = this.aClass359_60;
		synchronized (this.aClass359_60) {
			this.aClass359_60.method8511();
		}
		local11 = this.aClass359_59;
		synchronized (this.aClass359_59) {
			this.aClass359_59.method8511();
		}
	}
}
