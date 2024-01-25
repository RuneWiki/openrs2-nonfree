import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class135 {

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "Lclient!aj;")
	private final Class10 aClass10_16 = new Class10(64);

	@OriginalMember(owner = "client!hq", name = "h", descriptor = "Lclient!om;")
	private final Class246 aClass246_103;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!mea;ILclient!om;)V")
	public Class135(@OriginalArg(0) Class211 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2) {
		this.aClass246_103 = arg2;
		this.aClass246_103.method5673(32);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)V")
	public void method3662() {
		@Pc(2) Class10 local2 = this.aClass10_16;
		synchronized (this.aClass10_16) {
			this.aClass10_16.method263();
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)Lclient!pw;")
	public Class267 method3664(@OriginalArg(0) int arg0) {
		@Pc(6) Class10 local6 = this.aClass10_16;
		@Pc(16) Class267 local16;
		synchronized (this.aClass10_16) {
			local16 = (Class267) this.aClass10_16.method250((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class246 local29 = this.aClass246_103;
		@Pc(38) byte[] local38;
		synchronized (this.aClass246_103) {
			local38 = this.aClass246_103.method5653(32, arg0);
		}
		local16 = new Class267();
		if (local38 != null) {
			local16.method6005(new Class3_Sub11(local38));
		}
		@Pc(65) Class10 local65 = this.aClass10_16;
		synchronized (this.aClass10_16) {
			this.aClass10_16.method254(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Z)V")
	public void method3665() {
		@Pc(10) Class10 local10 = this.aClass10_16;
		synchronized (this.aClass10_16) {
			this.aClass10_16.method262();
		}
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(II)V")
	public void method3666() {
		@Pc(6) Class10 local6 = this.aClass10_16;
		synchronized (this.aClass10_16) {
			this.aClass10_16.method258(5);
		}
	}
}
