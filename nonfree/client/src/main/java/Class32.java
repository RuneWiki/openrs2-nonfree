import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bca")
public final class Class32 {

	@OriginalMember(owner = "client!bca", name = "f", descriptor = "Lclient!ui;")
	private final Class359 aClass359_4 = new Class359(128);

	@OriginalMember(owner = "client!bca", name = "d", descriptor = "Lclient!lga;")
	private final Class223 aClass223_6;

	@OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(Lclient!fs;ILclient!lga;)V")
	public Class32(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2) {
		this.aClass223_6 = arg2;
		if (this.aClass223_6 != null) {
			@Pc(20) int local20 = this.aClass223_6.method5290() - 1;
			this.aClass223_6.method5264(local20);
		}
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(BI)Lclient!rd;")
	public Class311 method445(@OriginalArg(1) int arg0) {
		@Pc(6) Class359 local6 = this.aClass359_4;
		@Pc(16) Class311 local16;
		synchronized (this.aClass359_4) {
			local16 = (Class311) this.aClass359_4.method8517((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) byte[] local38 = this.aClass223_6.method5267(Static32.method420(arg0), Static104.method2006(arg0));
		local16 = new Class311();
		if (local38 != null) {
			local16.method7467(new Class6_Sub15(local38));
		}
		@Pc(56) Class359 local56 = this.aClass359_4;
		synchronized (this.aClass359_4) {
			this.aClass359_4.method8515((long) arg0, local16);
			return local16;
		}
	}
}
