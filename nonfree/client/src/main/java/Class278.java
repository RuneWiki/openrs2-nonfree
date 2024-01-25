import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class278 {

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "Lclient!fc;")
	private final Class94 aClass94_43 = new Class94(256);

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "Lclient!ni;")
	private final Class223 aClass223_109;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lclient!rga;ILclient!ni;)V")
	public Class278(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2) {
		this.aClass223_109 = arg2;
		this.aClass223_109.method5970(26);
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)V")
	public void method6961() {
		@Pc(12) Class94 local12 = this.aClass94_43;
		synchronized (this.aClass94_43) {
			this.aClass94_43.method2952();
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Lclient!hd;")
	public Class6_Sub5_Sub15 method6962(@OriginalArg(1) int arg0) {
		@Pc(6) Class94 local6 = this.aClass94_43;
		@Pc(16) Class6_Sub5_Sub15 local16;
		synchronized (this.aClass94_43) {
			local16 = (Class6_Sub5_Sub15) this.aClass94_43.method2960((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class223 local29 = this.aClass223_109;
		@Pc(38) byte[] local38;
		synchronized (this.aClass223_109) {
			local38 = this.aClass223_109.method5954(arg0, 26);
		}
		local16 = new Class6_Sub5_Sub15();
		if (local38 != null) {
			local16.method3744(new Class6_Sub8(local38));
		}
		@Pc(60) Class94 local60 = this.aClass94_43;
		synchronized (this.aClass94_43) {
			this.aClass94_43.method2963((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
	public void method6964() {
		@Pc(14) Class94 local14 = this.aClass94_43;
		synchronized (this.aClass94_43) {
			this.aClass94_43.method2964();
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(II)V")
	public void method6965() {
		@Pc(6) Class94 local6 = this.aClass94_43;
		synchronized (this.aClass94_43) {
			this.aClass94_43.method2958(5);
		}
	}
}
