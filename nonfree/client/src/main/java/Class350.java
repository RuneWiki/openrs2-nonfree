import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class350 {

	@OriginalMember(owner = "client!tr", name = "h", descriptor = "Lclient!ui;")
	private final Class359 aClass359_65 = new Class359(16);

	@OriginalMember(owner = "client!tr", name = "f", descriptor = "Lclient!lga;")
	private final Class223 aClass223_115;

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Lclient!fs;ILclient!lga;)V")
	public Class350(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2) {
		this.aClass223_115 = arg2;
		this.aClass223_115.method5264(30);
	}

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(II)Lclient!gv;")
	public Class143 method8254(@OriginalArg(1) int arg0) {
		@Pc(6) Class359 local6 = this.aClass359_65;
		@Pc(16) Class143 local16;
		synchronized (this.aClass359_65) {
			local16 = (Class143) this.aClass359_65.method8517((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class223 local30 = this.aClass223_115;
		@Pc(39) byte[] local39;
		synchronized (this.aClass223_115) {
			local39 = this.aClass223_115.method5267(arg0, 30);
		}
		local16 = new Class143();
		if (local39 != null) {
			local16.method3841(new Class6_Sub15(local39));
		}
		@Pc(71) Class359 local71 = this.aClass359_65;
		synchronized (this.aClass359_65) {
			this.aClass359_65.method8515((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)V")
	public void method8255() {
		@Pc(11) Class359 local11 = this.aClass359_65;
		synchronized (this.aClass359_65) {
			this.aClass359_65.method8511();
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(II)V")
	public void method8256() {
		@Pc(2) Class359 local2 = this.aClass359_65;
		synchronized (this.aClass359_65) {
			this.aClass359_65.method8502(5);
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V")
	public void method8257() {
		@Pc(6) Class359 local6 = this.aClass359_65;
		synchronized (this.aClass359_65) {
			this.aClass359_65.method8507();
		}
	}
}
