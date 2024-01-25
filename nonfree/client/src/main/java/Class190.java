import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jha")
public final class Class190 {

	@OriginalMember(owner = "client!jha", name = "e", descriptor = "Lclient!ui;")
	private Class359 aClass359_39 = new Class359(128);

	@OriginalMember(owner = "client!jha", name = "c", descriptor = "Lclient!ui;")
	public Class359 aClass359_40 = new Class359(64);

	@OriginalMember(owner = "client!jha", name = "i", descriptor = "Lclient!lga;")
	public final Class223 aClass223_67;

	@OriginalMember(owner = "client!jha", name = "h", descriptor = "Lclient!lga;")
	private final Class223 aClass223_66;

	@OriginalMember(owner = "client!jha", name = "<init>", descriptor = "(Lclient!fs;ILclient!lga;Lclient!lga;)V")
	public Class190(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2, @OriginalArg(3) Class223 arg3) {
		this.aClass223_67 = arg3;
		this.aClass223_66 = arg2;
		this.aClass223_66.method5264(36);
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(IZI)V")
	public void method4690(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass359_39 = new Class359(arg1);
		this.aClass359_40 = new Class359(arg0);
	}

	@OriginalMember(owner = "client!jha", name = "b", descriptor = "(B)V")
	public void method4693() {
		@Pc(15) Class359 local15 = this.aClass359_39;
		synchronized (this.aClass359_39) {
			this.aClass359_39.method8507();
		}
		local15 = this.aClass359_40;
		synchronized (this.aClass359_40) {
			this.aClass359_40.method8507();
		}
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(ZI)V")
	public void method4694() {
		@Pc(2) Class359 local2 = this.aClass359_39;
		synchronized (this.aClass359_39) {
			this.aClass359_39.method8502(5);
		}
		local2 = this.aClass359_40;
		synchronized (this.aClass359_40) {
			this.aClass359_40.method8502(5);
		}
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(IZ)Lclient!uja;")
	public Class361 method4695(@OriginalArg(0) int arg0) {
		@Pc(6) Class359 local6 = this.aClass359_39;
		@Pc(16) Class361 local16;
		synchronized (this.aClass359_39) {
			local16 = (Class361) this.aClass359_39.method8517((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class223 local30 = this.aClass223_66;
		@Pc(39) byte[] local39;
		synchronized (this.aClass223_66) {
			local39 = this.aClass223_66.method5267(arg0, 36);
		}
		local16 = new Class361();
		local16.aClass190_6 = this;
		local16.anInt9787 = arg0;
		if (local39 != null) {
			local16.method8529(new Class6_Sub15(local39));
		}
		local16.method8533();
		@Pc(72) Class359 local72 = this.aClass359_39;
		synchronized (this.aClass359_39) {
			this.aClass359_39.method8515((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(I)V")
	public void method4696() {
		@Pc(6) Class359 local6 = this.aClass359_39;
		synchronized (this.aClass359_39) {
			this.aClass359_39.method8511();
		}
		local6 = this.aClass359_40;
		synchronized (this.aClass359_40) {
			this.aClass359_40.method8511();
		}
	}
}
