import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class232 {

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "Lclient!ad;")
	private final Class6 aClass6_48 = new Class6(16);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "Lclient!tf;")
	private final Class322 aClass322_112;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!qh;ILclient!tf;)V")
	public Class232(@OriginalArg(0) Class274 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class322 arg2) {
		this.aClass322_112 = arg2;
		this.aClass322_112.method6831(30);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	public void method5413() {
		@Pc(11) Class6 local11 = this.aClass6_48;
		synchronized (this.aClass6_48) {
			this.aClass6_48.method102();
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BI)Lclient!rk;")
	public Class293 method5415(@OriginalArg(1) int arg0) {
		@Pc(6) Class6 local6 = this.aClass6_48;
		@Pc(16) Class293 local16;
		synchronized (this.aClass6_48) {
			local16 = (Class293) this.aClass6_48.method92((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class322 local29 = this.aClass322_112;
		@Pc(38) byte[] local38;
		synchronized (this.aClass322_112) {
			local38 = this.aClass322_112.method6802(30, arg0);
		}
		local16 = new Class293();
		if (local38 != null) {
			local16.method6429(new Class3_Sub11(local38));
		}
		@Pc(65) Class6 local65 = this.aClass6_48;
		synchronized (this.aClass6_48) {
			this.aClass6_48.method106((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZI)V")
	public void method5416() {
		@Pc(2) Class6 local2 = this.aClass6_48;
		synchronized (this.aClass6_48) {
			this.aClass6_48.method97(5);
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
	public void method5417() {
		@Pc(6) Class6 local6 = this.aClass6_48;
		synchronized (this.aClass6_48) {
			this.aClass6_48.method94();
		}
	}
}
