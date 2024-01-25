import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class319 {

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "Lclient!ui;")
	private final Class359 aClass359_61 = new Class359(64);

	@OriginalMember(owner = "client!rl", name = "g", descriptor = "Lclient!lga;")
	public final Class223 aClass223_104;

	@OriginalMember(owner = "client!rl", name = "k", descriptor = "Lclient!lga;")
	private final Class223 aClass223_105;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lclient!fs;ILclient!lga;Lclient!lga;)V")
	public Class319(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2, @OriginalArg(3) Class223 arg3) {
		this.aClass223_104 = arg3;
		this.aClass223_105 = arg2;
		this.aClass223_105.method5264(3);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)V")
	public void method7619() {
		@Pc(2) Class359 local2 = this.aClass359_61;
		synchronized (this.aClass359_61) {
			this.aClass359_61.method8507();
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(BI)V")
	public void method7621() {
		@Pc(2) Class359 local2 = this.aClass359_61;
		synchronized (this.aClass359_61) {
			this.aClass359_61.method8502(5);
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V")
	public void method7622() {
		@Pc(13) Class359 local13 = this.aClass359_61;
		synchronized (this.aClass359_61) {
			this.aClass359_61.method8511();
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)Lclient!nia;")
	public Class253 method7623(@OriginalArg(1) int arg0) {
		@Pc(6) Class359 local6 = this.aClass359_61;
		@Pc(16) Class253 local16;
		synchronized (this.aClass359_61) {
			local16 = (Class253) this.aClass359_61.method8517((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class223 local30 = this.aClass223_105;
		@Pc(39) byte[] local39;
		synchronized (this.aClass223_105) {
			local39 = this.aClass223_105.method5267(arg0, 3);
		}
		local16 = new Class253();
		local16.aClass319_1 = this;
		if (local39 != null) {
			local16.method6110(new Class6_Sub15(local39));
		}
		@Pc(66) Class359 local66 = this.aClass359_61;
		synchronized (this.aClass359_61) {
			this.aClass359_61.method8515((long) arg0, local16);
			return local16;
		}
	}
}
