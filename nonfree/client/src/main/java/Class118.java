import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class118 {

	@OriginalMember(owner = "client!gm", name = "e", descriptor = "Lclient!aj;")
	private final Class10 aClass10_15 = new Class10(64);

	@OriginalMember(owner = "client!gm", name = "h", descriptor = "Lclient!om;")
	private final Class246 aClass246_86;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lclient!mea;ILclient!om;)V")
	public Class118(@OriginalArg(0) Class211 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2) {
		this.aClass246_86 = arg2;
		if (this.aClass246_86 != null) {
			this.aClass246_86.method5673(11);
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
	public void method3018() {
		@Pc(2) Class10 local2 = this.aClass10_15;
		synchronized (this.aClass10_15) {
			this.aClass10_15.method262();
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)Lclient!ap;")
	public Class14 method3019(@OriginalArg(1) int arg0) {
		@Pc(6) Class10 local6 = this.aClass10_15;
		@Pc(16) Class14 local16;
		synchronized (this.aClass10_15) {
			local16 = (Class14) this.aClass10_15.method250((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class246 local37 = this.aClass246_86;
		@Pc(46) byte[] local46;
		synchronized (this.aClass246_86) {
			local46 = this.aClass246_86.method5653(11, arg0);
		}
		local16 = new Class14();
		if (local46 != null) {
			local16.method437(new Class3_Sub11(local46));
		}
		@Pc(68) Class10 local68 = this.aClass10_15;
		synchronized (this.aClass10_15) {
			this.aClass10_15.method254(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IB)V")
	public void method3020() {
		@Pc(12) Class10 local12 = this.aClass10_15;
		synchronized (this.aClass10_15) {
			this.aClass10_15.method258(5);
		}
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)V")
	public void method3021() {
		@Pc(2) Class10 local2 = this.aClass10_15;
		synchronized (this.aClass10_15) {
			this.aClass10_15.method263();
		}
	}
}
