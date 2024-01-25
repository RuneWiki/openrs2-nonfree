import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class116 {

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "Lclient!vh;")
	private final Class330 aClass330_21 = new Class330(16);

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "Lclient!pj;")
	private final Class248 aClass248_23;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lclient!dd;ILclient!pj;)V")
	public Class116(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class248 arg2) {
		this.aClass248_23 = arg2;
		this.aClass248_23.method5793(30);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)V")
	public void method2645() {
		@Pc(2) Class330 local2 = this.aClass330_21;
		synchronized (this.aClass330_21) {
			this.aClass330_21.method7680(5);
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(II)Lclient!lfa;")
	public Class186 method2646(@OriginalArg(1) int arg0) {
		@Pc(6) Class330 local6 = this.aClass330_21;
		@Pc(16) Class186 local16;
		synchronized (this.aClass330_21) {
			local16 = (Class186) this.aClass330_21.method7677((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class248 local29 = this.aClass248_23;
		@Pc(38) byte[] local38;
		synchronized (this.aClass248_23) {
			local38 = this.aClass248_23.method5797(30, arg0);
		}
		local16 = new Class186();
		if (local38 != null) {
			local16.method4415(new Class6_Sub12(local38));
		}
		@Pc(62) Class330 local62 = this.aClass330_21;
		synchronized (this.aClass330_21) {
			this.aClass330_21.method7676(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V")
	public void method2648() {
		@Pc(2) Class330 local2 = this.aClass330_21;
		synchronized (this.aClass330_21) {
			this.aClass330_21.method7688();
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
	public void method2649() {
		@Pc(2) Class330 local2 = this.aClass330_21;
		synchronized (this.aClass330_21) {
			this.aClass330_21.method7678();
		}
	}
}
