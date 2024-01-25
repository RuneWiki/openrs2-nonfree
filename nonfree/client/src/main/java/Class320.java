import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class320 {

	@OriginalMember(owner = "client!si", name = "f", descriptor = "Lclient!jda;")
	private final Class165 aClass165_61 = new Class165(64);

	@OriginalMember(owner = "client!si", name = "k", descriptor = "Lclient!aj;")
	private final Class15 aClass15_137;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Lclient!gia;ILclient!aj;)V")
	public Class320(@OriginalArg(0) Class118 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2) {
		this.aClass15_137 = arg2;
		if (this.aClass15_137 != null) {
			this.aClass15_137.method512(35);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IB)V")
	public void method7840() {
		@Pc(2) Class165 local2 = this.aClass165_61;
		synchronized (this.aClass165_61) {
			this.aClass165_61.method4394(5);
		}
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(B)V")
	public void method7841() {
		@Pc(11) Class165 local11 = this.aClass165_61;
		synchronized (this.aClass165_61) {
			this.aClass165_61.method4400();
		}
	}

	@OriginalMember(owner = "client!si", name = "c", descriptor = "(B)V")
	public void method7843() {
		@Pc(2) Class165 local2 = this.aClass165_61;
		synchronized (this.aClass165_61) {
			this.aClass165_61.method4403();
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BI)Lclient!v;")
	public Class357 method7845(@OriginalArg(1) int arg0) {
		@Pc(6) Class165 local6 = this.aClass165_61;
		@Pc(16) Class357 local16;
		synchronized (this.aClass165_61) {
			local16 = (Class357) this.aClass165_61.method4389((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class15 local37 = this.aClass15_137;
		@Pc(46) byte[] local46;
		synchronized (this.aClass15_137) {
			local46 = this.aClass15_137.method517(arg0, 35);
		}
		local16 = new Class357();
		if (local46 != null) {
			local16.method8757(new Class3_Sub25(local46));
		}
		local16.method8758();
		@Pc(71) Class165 local71 = this.aClass165_61;
		synchronized (this.aClass165_61) {
			this.aClass165_61.method4392(local16, (long) arg0);
			return local16;
		}
	}
}
