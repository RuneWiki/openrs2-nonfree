import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class79 {

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "Lclient!aj;")
	private final Class10 aClass10_12 = new Class10(64);

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "Lclient!om;")
	private final Class246 aClass246_68;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lclient!mea;ILclient!om;)V")
	public Class79(@OriginalArg(0) Class211 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2) {
		this.aClass246_68 = arg2;
		if (this.aClass246_68 != null) {
			this.aClass246_68.method5673(35);
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
	public void method2478() {
		@Pc(2) Class10 local2 = this.aClass10_12;
		synchronized (this.aClass10_12) {
			this.aClass10_12.method262();
		}
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V")
	public void method2479() {
		@Pc(2) Class10 local2 = this.aClass10_12;
		synchronized (this.aClass10_12) {
			this.aClass10_12.method263();
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)V")
	public void method2480() {
		@Pc(6) Class10 local6 = this.aClass10_12;
		synchronized (this.aClass10_12) {
			this.aClass10_12.method258(5);
		}
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(II)Lclient!hu;")
	public Class137 method2482(@OriginalArg(0) int arg0) {
		@Pc(6) Class10 local6 = this.aClass10_12;
		@Pc(16) Class137 local16;
		synchronized (this.aClass10_12) {
			local16 = (Class137) this.aClass10_12.method250((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class246 local29 = this.aClass246_68;
		@Pc(38) byte[] local38;
		synchronized (this.aClass246_68) {
			local38 = this.aClass246_68.method5653(35, arg0);
		}
		local16 = new Class137();
		if (local38 != null) {
			local16.method3702(new Class3_Sub11(local38));
		}
		local16.method3705();
		@Pc(63) Class10 local63 = this.aClass10_12;
		synchronized (this.aClass10_12) {
			this.aClass10_12.method254(local16, (long) arg0);
			return local16;
		}
	}
}
