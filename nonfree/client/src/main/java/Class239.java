import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oga")
public final class Class239 {

	@OriginalMember(owner = "client!oga", name = "h", descriptor = "Lclient!ad;")
	private final Class6 aClass6_49 = new Class6(256);

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "Lclient!tf;")
	private final Class322 aClass322_115;

	@OriginalMember(owner = "client!oga", name = "<init>", descriptor = "(Lclient!qh;ILclient!tf;)V")
	public Class239(@OriginalArg(0) Class274 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class322 arg2) {
		this.aClass322_115 = arg2;
		this.aClass322_115.method6831(26);
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(BI)Lclient!gca;")
	public Class3_Sub7_Sub11 method5569(@OriginalArg(1) int arg0) {
		@Pc(12) Class6 local12 = this.aClass6_49;
		@Pc(22) Class3_Sub7_Sub11 local22;
		synchronized (this.aClass6_49) {
			local22 = (Class3_Sub7_Sub11) this.aClass6_49.method92((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class322 local35 = this.aClass322_115;
		@Pc(44) byte[] local44;
		synchronized (this.aClass322_115) {
			local44 = this.aClass322_115.method6802(26, arg0);
		}
		local22 = new Class3_Sub7_Sub11();
		if (local44 != null) {
			local22.method3008(new Class3_Sub11(local44));
		}
		@Pc(66) Class6 local66 = this.aClass6_49;
		synchronized (this.aClass6_49) {
			this.aClass6_49.method106((long) arg0, local22);
			return local22;
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(B)V")
	public void method5570() {
		@Pc(12) Class6 local12 = this.aClass6_49;
		synchronized (this.aClass6_49) {
			this.aClass6_49.method102();
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(I)V")
	public void method5571() {
		@Pc(13) Class6 local13 = this.aClass6_49;
		synchronized (this.aClass6_49) {
			this.aClass6_49.method94();
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(II)V")
	public void method5572() {
		@Pc(9) Class6 local9 = this.aClass6_49;
		synchronized (this.aClass6_49) {
			this.aClass6_49.method97(5);
		}
	}
}
