import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kv")
public final class Class195 {

	@OriginalMember(owner = "client!kv", name = "m", descriptor = "Lclient!aj;")
	private final Class10 aClass10_30 = new Class10(64);

	@OriginalMember(owner = "client!kv", name = "k", descriptor = "Lclient!om;")
	private final Class246 aClass246_134;

	@OriginalMember(owner = "client!kv", name = "j", descriptor = "I")
	public final int anInt5267;

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lclient!mea;ILclient!om;)V")
	public Class195(@OriginalArg(0) Class211 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2) {
		this.aClass246_134 = arg2;
		if (this.aClass246_134 == null) {
			this.anInt5267 = 0;
		} else {
			this.anInt5267 = this.aClass246_134.method5673(16);
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)V")
	public void method4538() {
		@Pc(10) Class10 local10 = this.aClass10_30;
		synchronized (this.aClass10_30) {
			this.aClass10_30.method262();
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IB)Lclient!eda;")
	public Class73 method4539(@OriginalArg(0) int arg0) {
		@Pc(6) Class10 local6 = this.aClass10_30;
		@Pc(16) Class73 local16;
		synchronized (this.aClass10_30) {
			local16 = (Class73) this.aClass10_30.method250((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class246 local29 = this.aClass246_134;
		@Pc(38) byte[] local38;
		synchronized (this.aClass246_134) {
			local38 = this.aClass246_134.method5653(16, arg0);
		}
		local16 = new Class73();
		if (local38 != null) {
			local16.method2354(new Class3_Sub11(local38));
		}
		@Pc(60) Class10 local60 = this.aClass10_30;
		synchronized (this.aClass10_30) {
			this.aClass10_30.method254(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(B)V")
	public void method4541() {
		@Pc(6) Class10 local6 = this.aClass10_30;
		synchronized (this.aClass10_30) {
			this.aClass10_30.method263();
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(BI)V")
	public void method4543() {
		@Pc(2) Class10 local2 = this.aClass10_30;
		synchronized (this.aClass10_30) {
			this.aClass10_30.method258(5);
		}
	}
}
