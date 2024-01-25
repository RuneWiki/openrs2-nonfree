import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class158 {

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "Lclient!tb;")
	private final Class313 aClass313_26 = new Class313(64);

	@OriginalMember(owner = "client!ih", name = "h", descriptor = "Lclient!pl;")
	private final Class259 aClass259_66;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lclient!rf;ILclient!pl;)V")
	public Class158(@OriginalArg(0) Class284 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class259 arg2) {
		this.aClass259_66 = arg2;
		if (this.aClass259_66 != null) {
			this.aClass259_66.method5969(35);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
	public void method3496() {
		@Pc(6) Class313 local6 = this.aClass313_26;
		synchronized (this.aClass313_26) {
			this.aClass313_26.method6977();
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)V")
	public void method3497() {
		@Pc(2) Class313 local2 = this.aClass313_26;
		synchronized (this.aClass313_26) {
			this.aClass313_26.method6982(5);
		}
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V")
	public void method3498() {
		@Pc(10) Class313 local10 = this.aClass313_26;
		synchronized (this.aClass313_26) {
			this.aClass313_26.method6983();
		}
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(BI)Lclient!ru;")
	public Class293 method3499(@OriginalArg(1) int arg0) {
		@Pc(6) Class313 local6 = this.aClass313_26;
		@Pc(16) Class293 local16;
		synchronized (this.aClass313_26) {
			local16 = (Class293) this.aClass313_26.method6989((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class259 local29 = this.aClass259_66;
		@Pc(38) byte[] local38;
		synchronized (this.aClass259_66) {
			local38 = this.aClass259_66.method5985(arg0, 35);
		}
		local16 = new Class293();
		if (local38 != null) {
			local16.method6636(new Class2_Sub15(local38));
		}
		local16.method6637();
		@Pc(69) Class313 local69 = this.aClass313_26;
		synchronized (this.aClass313_26) {
			this.aClass313_26.method6980((long) arg0, local16);
			return local16;
		}
	}
}
