import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qea")
public final class Class296 {

	@OriginalMember(owner = "client!qea", name = "d", descriptor = "Lclient!ui;")
	private final Class359 aClass359_53 = new Class359(256);

	@OriginalMember(owner = "client!qea", name = "f", descriptor = "Lclient!lga;")
	private final Class223 aClass223_96;

	@OriginalMember(owner = "client!qea", name = "<init>", descriptor = "(Lclient!fs;ILclient!lga;)V")
	public Class296(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2) {
		this.aClass223_96 = arg2;
		this.aClass223_96.method5264(26);
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(II)Lclient!ij;")
	public Class6_Sub2_Sub10 method7212(@OriginalArg(0) int arg0) {
		@Pc(6) Class359 local6 = this.aClass359_53;
		@Pc(16) Class6_Sub2_Sub10 local16;
		synchronized (this.aClass359_53) {
			local16 = (Class6_Sub2_Sub10) this.aClass359_53.method8517((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(36) Class223 local36 = this.aClass223_96;
		@Pc(45) byte[] local45;
		synchronized (this.aClass223_96) {
			local45 = this.aClass223_96.method5267(arg0, 26);
		}
		local16 = new Class6_Sub2_Sub10();
		if (local45 != null) {
			local16.method4497(new Class6_Sub15(local45));
		}
		@Pc(69) Class359 local69 = this.aClass359_53;
		synchronized (this.aClass359_53) {
			this.aClass359_53.method8515((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(BI)V")
	public void method7213() {
		@Pc(10) Class359 local10 = this.aClass359_53;
		synchronized (this.aClass359_53) {
			this.aClass359_53.method8502(5);
		}
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)V")
	public void method7214() {
		@Pc(2) Class359 local2 = this.aClass359_53;
		synchronized (this.aClass359_53) {
			this.aClass359_53.method8511();
		}
	}

	@OriginalMember(owner = "client!qea", name = "b", descriptor = "(I)V")
	public void method7215() {
		@Pc(6) Class359 local6 = this.aClass359_53;
		synchronized (this.aClass359_53) {
			this.aClass359_53.method8507();
		}
	}
}
