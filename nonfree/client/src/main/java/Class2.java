import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2 {

	@OriginalMember(owner = "client!aa", name = "j", descriptor = "Lclient!aj;")
	private final Class10 aClass10_1 = new Class10(64);

	@OriginalMember(owner = "client!aa", name = "i", descriptor = "Lclient!om;")
	private final Class246 aClass246_1;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lclient!mea;ILclient!om;)V")
	public Class2(@OriginalArg(0) Class211 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2) {
		this.aClass246_1 = arg2;
		this.aClass246_1.method5673(31);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)Lclient!cfa;")
	public Class44 method9(@OriginalArg(0) int arg0) {
		@Pc(6) Class10 local6 = this.aClass10_1;
		@Pc(16) Class44 local16;
		synchronized (this.aClass10_1) {
			local16 = (Class44) this.aClass10_1.method250((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class246 local29 = this.aClass246_1;
		@Pc(38) byte[] local38;
		synchronized (this.aClass246_1) {
			local38 = this.aClass246_1.method5653(31, arg0);
		}
		local16 = new Class44();
		if (local38 != null) {
			local16.method1458(new Class3_Sub11(local38));
		}
		@Pc(60) Class10 local60 = this.aClass10_1;
		synchronized (this.aClass10_1) {
			this.aClass10_1.method254(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
	public void method11() {
		@Pc(9) Class10 local9 = this.aClass10_1;
		synchronized (this.aClass10_1) {
			this.aClass10_1.method262();
		}
	}

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)V")
	public void method14() {
		@Pc(6) Class10 local6 = this.aClass10_1;
		synchronized (this.aClass10_1) {
			this.aClass10_1.method263();
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)V")
	public void method15() {
		@Pc(6) Class10 local6 = this.aClass10_1;
		synchronized (this.aClass10_1) {
			this.aClass10_1.method258(5);
		}
	}
}
