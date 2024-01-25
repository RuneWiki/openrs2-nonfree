import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class150 {

	@OriginalMember(owner = "client!ls", name = "h", descriptor = "Lclient!ka;")
	private final Class132 aClass132_31 = new Class132(64);

	@OriginalMember(owner = "client!ls", name = "f", descriptor = "Lclient!dk;")
	private final Class54 aClass54_70;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lclient!ad;ILclient!dk;)V")
	public Class150(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class54 arg2) {
		this.aClass54_70 = arg2;
		this.aClass54_70.method1123(32);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(II)V")
	public void method3065() {
		@Pc(2) Class132 local2 = this.aClass132_31;
		synchronized (this.aClass132_31) {
			this.aClass132_31.method2713(5);
		}
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(II)Lclient!nq;")
	public Class173 method3066(@OriginalArg(1) int arg0) {
		@Pc(6) Class132 local6 = this.aClass132_31;
		@Pc(16) Class173 local16;
		synchronized (this.aClass132_31) {
			local16 = (Class173) this.aClass132_31.method2701((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class54 local37 = this.aClass54_70;
		@Pc(46) byte[] local46;
		synchronized (this.aClass54_70) {
			local46 = this.aClass54_70.method1126(32, arg0);
		}
		local16 = new Class173();
		if (local46 != null) {
			local16.method3665(new Class2_Sub13(local46));
		}
		@Pc(68) Class132 local68 = this.aClass132_31;
		synchronized (this.aClass132_31) {
			this.aClass132_31.method2711(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V")
	public void method3067() {
		@Pc(6) Class132 local6 = this.aClass132_31;
		synchronized (this.aClass132_31) {
			this.aClass132_31.method2698();
		}
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(I)V")
	public void method3068() {
		@Pc(12) Class132 local12 = this.aClass132_31;
		synchronized (this.aClass132_31) {
			this.aClass132_31.method2708();
		}
	}
}
