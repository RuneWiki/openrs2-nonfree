import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class201 {

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "Lclient!aj;")
	private final Class10 aClass10_32 = new Class10(128);

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "Lclient!om;")
	private final Class246 aClass246_140;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lclient!mea;ILclient!om;)V")
	public Class201(@OriginalArg(0) Class211 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2) {
		this.aClass246_140 = arg2;
		this.aClass246_140.method5673(1);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
	public void method4714() {
		@Pc(6) Class10 local6 = this.aClass10_32;
		synchronized (this.aClass10_32) {
			this.aClass10_32.method263();
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)Lclient!kf;")
	public Class183 method4715(@OriginalArg(1) int arg0) {
		@Pc(6) Class10 local6 = this.aClass10_32;
		@Pc(25) Class183 local25;
		synchronized (this.aClass10_32) {
			local25 = (Class183) this.aClass10_32.method250((long) arg0);
		}
		if (local25 != null) {
			return local25;
		}
		@Pc(38) Class246 local38 = this.aClass246_140;
		@Pc(47) byte[] local47;
		synchronized (this.aClass246_140) {
			local47 = this.aClass246_140.method5653(1, arg0);
		}
		local25 = new Class183();
		if (local47 != null) {
			local25.method4397(new Class3_Sub11(local47));
		}
		local6 = this.aClass10_32;
		synchronized (this.aClass10_32) {
			this.aClass10_32.method254(local25, (long) arg0);
			return local25;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V")
	public void method4716() {
		@Pc(14) Class10 local14 = this.aClass10_32;
		synchronized (this.aClass10_32) {
			this.aClass10_32.method262();
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)V")
	public void method4718() {
		@Pc(2) Class10 local2 = this.aClass10_32;
		synchronized (this.aClass10_32) {
			this.aClass10_32.method258(5);
		}
	}
}
