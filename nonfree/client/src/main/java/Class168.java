import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Class168 {

	@OriginalMember(owner = "client!jk", name = "g", descriptor = "Lclient!aj;")
	private Class10 aClass10_23 = new Class10(128);

	@OriginalMember(owner = "client!jk", name = "k", descriptor = "Lclient!aj;")
	public Class10 aClass10_24 = new Class10(64);

	@OriginalMember(owner = "client!jk", name = "j", descriptor = "Lclient!om;")
	public final Class246 aClass246_121;

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "Lclient!om;")
	private final Class246 aClass246_120;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lclient!mea;ILclient!om;Lclient!om;)V")
	public Class168(@OriginalArg(0) Class211 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2, @OriginalArg(3) Class246 arg3) {
		this.aClass246_121 = arg3;
		this.aClass246_120 = arg2;
		this.aClass246_120.method5673(36);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IB)Lclient!cd;")
	public Class40 method4062(@OriginalArg(0) int arg0) {
		@Pc(6) Class10 local6 = this.aClass10_23;
		@Pc(16) Class40 local16;
		synchronized (this.aClass10_23) {
			local16 = (Class40) this.aClass10_23.method250((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class246 local29 = this.aClass246_120;
		@Pc(38) byte[] local38;
		synchronized (this.aClass246_120) {
			local38 = this.aClass246_120.method5653(36, arg0);
		}
		local16 = new Class40();
		local16.anInt1379 = arg0;
		local16.aClass168_1 = this;
		if (local38 != null) {
			local16.method1123(new Class3_Sub11(local38));
		}
		local16.method1122();
		@Pc(77) Class10 local77 = this.aClass10_23;
		synchronized (this.aClass10_23) {
			this.aClass10_23.method254(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(BII)V")
	public void method4063(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass10_23 = new Class10(arg1);
		this.aClass10_24 = new Class10(arg0);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Z)V")
	public void method4064() {
		@Pc(10) Class10 local10 = this.aClass10_23;
		synchronized (this.aClass10_23) {
			this.aClass10_23.method262();
		}
		local10 = this.aClass10_24;
		synchronized (this.aClass10_24) {
			this.aClass10_24.method262();
		}
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)V")
	public void method4066() {
		@Pc(10) Class10 local10 = this.aClass10_23;
		synchronized (this.aClass10_23) {
			this.aClass10_23.method263();
		}
		local10 = this.aClass10_24;
		synchronized (this.aClass10_24) {
			this.aClass10_24.method263();
		}
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(IB)V")
	public void method4067() {
		@Pc(2) Class10 local2 = this.aClass10_23;
		synchronized (this.aClass10_23) {
			this.aClass10_23.method258(5);
		}
		local2 = this.aClass10_24;
		synchronized (this.aClass10_24) {
			this.aClass10_24.method258(5);
		}
	}
}
