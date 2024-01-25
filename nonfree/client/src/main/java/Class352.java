import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class352 {

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "Lclient!aj;")
	private final Class10 aClass10_66 = new Class10(64);

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "Lclient!om;")
	public final Class246 aClass246_262;

	@OriginalMember(owner = "client!vn", name = "i", descriptor = "Lclient!om;")
	private final Class246 aClass246_263;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lclient!mea;ILclient!om;Lclient!om;)V")
	public Class352(@OriginalArg(0) Class211 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2, @OriginalArg(3) Class246 arg3) {
		this.aClass246_262 = arg3;
		this.aClass246_263 = arg2;
		this.aClass246_263.method5673(3);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IB)V")
	public void method7547() {
		@Pc(2) Class10 local2 = this.aClass10_66;
		synchronized (this.aClass10_66) {
			this.aClass10_66.method258(5);
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)Lclient!vp;")
	public Class354 method7548(@OriginalArg(0) int arg0) {
		@Pc(6) Class10 local6 = this.aClass10_66;
		@Pc(16) Class354 local16;
		synchronized (this.aClass10_66) {
			local16 = (Class354) this.aClass10_66.method250((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class246 local35 = this.aClass246_263;
		@Pc(44) byte[] local44;
		synchronized (this.aClass246_263) {
			local44 = this.aClass246_263.method5653(3, arg0);
		}
		local16 = new Class354();
		local16.aClass352_3 = this;
		if (local44 != null) {
			local16.method7562(new Class3_Sub11(local44));
		}
		@Pc(69) Class10 local69 = this.aClass10_66;
		synchronized (this.aClass10_66) {
			this.aClass10_66.method254(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V")
	public void method7550() {
		@Pc(2) Class10 local2 = this.aClass10_66;
		synchronized (this.aClass10_66) {
			this.aClass10_66.method262();
		}
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(Z)V")
	public void method7551() {
		@Pc(2) Class10 local2 = this.aClass10_66;
		synchronized (this.aClass10_66) {
			this.aClass10_66.method263();
		}
	}
}
