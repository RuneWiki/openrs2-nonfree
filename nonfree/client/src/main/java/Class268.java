import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qda")
public final class Class268 {

	@OriginalMember(owner = "client!qda", name = "f", descriptor = "Lclient!ad;")
	private final Class6 aClass6_53 = new Class6(64);

	@OriginalMember(owner = "client!qda", name = "c", descriptor = "Lclient!tf;")
	private final Class322 aClass322_123;

	@OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(Lclient!qh;ILclient!tf;)V")
	public Class268(@OriginalArg(0) Class274 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class322 arg2) {
		this.aClass322_123 = arg2;
		if (this.aClass322_123 != null) {
			this.aClass322_123.method6831(35);
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(B)V")
	public void method6059() {
		@Pc(8) Class6 local8 = this.aClass6_53;
		synchronized (this.aClass6_53) {
			this.aClass6_53.method102();
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(II)Lclient!na;")
	public Class218 method6061(@OriginalArg(0) int arg0) {
		@Pc(6) Class6 local6 = this.aClass6_53;
		@Pc(16) Class218 local16;
		synchronized (this.aClass6_53) {
			local16 = (Class218) this.aClass6_53.method92((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class322 local29 = this.aClass322_123;
		@Pc(38) byte[] local38;
		synchronized (this.aClass322_123) {
			local38 = this.aClass322_123.method6802(35, arg0);
		}
		local16 = new Class218();
		if (local38 != null) {
			local16.method5093(new Class3_Sub11(local38));
		}
		local16.method5090();
		@Pc(65) Class6 local65 = this.aClass6_53;
		synchronized (this.aClass6_53) {
			this.aClass6_53.method106((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "(II)V")
	public void method6062() {
		@Pc(12) Class6 local12 = this.aClass6_53;
		synchronized (this.aClass6_53) {
			this.aClass6_53.method97(5);
		}
	}

	@OriginalMember(owner = "client!qda", name = "c", descriptor = "(I)V")
	public void method6064() {
		@Pc(14) Class6 local14 = this.aClass6_53;
		synchronized (this.aClass6_53) {
			this.aClass6_53.method94();
		}
	}
}
