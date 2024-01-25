import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qea")
public final class Class274 {

	@OriginalMember(owner = "client!qea", name = "d", descriptor = "Lclient!mf;")
	private final Class222 aClass222_49 = new Class222(64);

	@OriginalMember(owner = "client!qea", name = "l", descriptor = "Lclient!pu;")
	private final Class270 aClass270_92;

	@OriginalMember(owner = "client!qea", name = "<init>", descriptor = "(Lclient!kr;ILclient!pu;)V")
	public Class274(@OriginalArg(0) Class195 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class270 arg2) {
		this.aClass270_92 = arg2;
		if (this.aClass270_92 != null) {
			this.aClass270_92.method5685(35);
		}
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(ZI)Lclient!aj;")
	public Class12 method5884(@OriginalArg(1) int arg0) {
		@Pc(6) Class222 local6 = this.aClass222_49;
		@Pc(16) Class12 local16;
		synchronized (this.aClass222_49) {
			local16 = (Class12) this.aClass222_49.method4430((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class270 local29 = this.aClass270_92;
		@Pc(38) byte[] local38;
		synchronized (this.aClass270_92) {
			local38 = this.aClass270_92.method5704(35, arg0);
		}
		local16 = new Class12();
		if (local38 != null) {
			local16.method154(new Class1_Sub35(local38));
		}
		local16.method152();
		@Pc(63) Class222 local63 = this.aClass222_49;
		synchronized (this.aClass222_49) {
			this.aClass222_49.method4434(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(B)V")
	public void method5885() {
		@Pc(7) Class222 local7 = this.aClass222_49;
		synchronized (this.aClass222_49) {
			this.aClass222_49.method4428();
		}
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(IB)V")
	public void method5886() {
		@Pc(2) Class222 local2 = this.aClass222_49;
		synchronized (this.aClass222_49) {
			this.aClass222_49.method4433(5);
		}
	}

	@OriginalMember(owner = "client!qea", name = "b", descriptor = "(I)V")
	public void method5890() {
		@Pc(2) Class222 local2 = this.aClass222_49;
		synchronized (this.aClass222_49) {
			this.aClass222_49.method4422();
		}
	}
}
