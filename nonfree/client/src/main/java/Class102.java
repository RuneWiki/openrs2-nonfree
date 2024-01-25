import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eu")
public final class Class102 {

	@OriginalMember(owner = "client!eu", name = "d", descriptor = "Lclient!qr;")
	private final Class293 aClass293_11 = new Class293(64);

	@OriginalMember(owner = "client!eu", name = "m", descriptor = "Lclient!qr;")
	public final Class293 aClass293_12 = new Class293(2);

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "Lclient!wu;")
	private final Class384 aClass384_36;

	@OriginalMember(owner = "client!eu", name = "i", descriptor = "Lclient!wu;")
	public final Class384 aClass384_37;

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lclient!ms;ILclient!wu;Lclient!wu;)V")
	public Class102(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class384 arg2, @OriginalArg(3) Class384 arg3) {
		this.aClass384_36 = arg2;
		this.aClass384_37 = arg3;
		this.aClass384_36.method8862(33);
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(BI)V")
	public void method2071() {
		@Pc(6) Class293 local6 = this.aClass293_11;
		synchronized (this.aClass293_11) {
			this.aClass293_11.method6922(5);
		}
		local6 = this.aClass293_12;
		synchronized (this.aClass293_12) {
			this.aClass293_12.method6922(5);
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(II)Lclient!of;")
	public Class256 method2072(@OriginalArg(0) int arg0) {
		@Pc(6) Class293 local6 = this.aClass293_11;
		@Pc(16) Class256 local16;
		synchronized (this.aClass293_11) {
			local16 = (Class256) this.aClass293_11.method6921((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class384 local29 = this.aClass384_36;
		@Pc(38) byte[] local38;
		synchronized (this.aClass384_36) {
			local38 = this.aClass384_36.method8885(33, arg0);
		}
		local16 = new Class256();
		local16.aClass102_2 = this;
		if (local38 != null) {
			local16.method6183(new Class5_Sub12(local38));
		}
		@Pc(63) Class293 local63 = this.aClass293_11;
		synchronized (this.aClass293_11) {
			this.aClass293_11.method6925((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)V")
	public void method2073() {
		@Pc(2) Class293 local2 = this.aClass293_11;
		synchronized (this.aClass293_11) {
			this.aClass293_11.method6930();
		}
		local2 = this.aClass293_12;
		synchronized (this.aClass293_12) {
			this.aClass293_12.method6930();
		}
	}

	@OriginalMember(owner = "client!eu", name = "c", descriptor = "(I)V")
	public void method2076() {
		@Pc(6) Class293 local6 = this.aClass293_11;
		synchronized (this.aClass293_11) {
			this.aClass293_11.method6927();
		}
		local6 = this.aClass293_12;
		synchronized (this.aClass293_12) {
			this.aClass293_12.method6927();
		}
	}
}
