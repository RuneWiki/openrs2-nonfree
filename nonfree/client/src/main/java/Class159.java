import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hja")
public final class Class159 {

	@OriginalMember(owner = "client!hja", name = "c", descriptor = "Lclient!ui;")
	private final Class359 aClass359_26 = new Class359(64);

	@OriginalMember(owner = "client!hja", name = "d", descriptor = "Lclient!lga;")
	private final Class223 aClass223_47;

	@OriginalMember(owner = "client!hja", name = "<init>", descriptor = "(Lclient!fs;ILclient!lga;)V")
	public Class159(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2) {
		this.aClass223_47 = arg2;
		if (this.aClass223_47 != null) {
			this.aClass223_47.method5264(54);
		}
	}

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "(BI)Lclient!dv;")
	public Class84 method4063(@OriginalArg(1) int arg0) {
		@Pc(6) Class359 local6 = this.aClass359_26;
		@Pc(16) Class84 local16;
		synchronized (this.aClass359_26) {
			local16 = (Class84) this.aClass359_26.method8517((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class223 local30 = this.aClass223_47;
		@Pc(39) byte[] local39;
		synchronized (this.aClass223_47) {
			local39 = this.aClass223_47.method5267(arg0, 54);
		}
		local16 = new Class84();
		if (local39 != null) {
			local16.method2159(new Class6_Sub15(local39));
		}
		@Pc(70) Class359 local70 = this.aClass359_26;
		synchronized (this.aClass359_26) {
			this.aClass359_26.method8515((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hja", name = "b", descriptor = "(I)V")
	public void method4067() {
		@Pc(2) Class359 local2 = this.aClass359_26;
		synchronized (this.aClass359_26) {
			this.aClass359_26.method8507();
		}
	}

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "(I)V")
	public void method4068() {
		@Pc(6) Class359 local6 = this.aClass359_26;
		synchronized (this.aClass359_26) {
			this.aClass359_26.method8511();
		}
	}

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "(II)V")
	public void method4069() {
		@Pc(2) Class359 local2 = this.aClass359_26;
		synchronized (this.aClass359_26) {
			this.aClass359_26.method8502(5);
		}
	}
}
