import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class8 {

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "Lclient!ff;")
	private final Class83 aClass83_1 = new Class83(64);

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "Lclient!vh;")
	private final Class250 aClass250_2;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lclient!lf;ILclient!vh;)V")
	public Class8(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2) {
		this.aClass250_2 = arg2;
		this.aClass250_2.method5653(31);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB)V")
	public void method232() {
		@Pc(6) Class83 local6 = this.aClass83_1;
		synchronized (this.aClass83_1) {
			this.aClass83_1.method1663(5);
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZI)Lclient!io;")
	public Class120 method233(@OriginalArg(1) int arg0) {
		@Pc(6) Class83 local6 = this.aClass83_1;
		@Pc(16) Class120 local16;
		synchronized (this.aClass83_1) {
			local16 = (Class120) this.aClass83_1.method1658((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass250_2.method5667(arg0, 31);
		local16 = new Class120();
		if (local33 != null) {
			local16.method2766(new Class1_Sub1(local33));
		}
		@Pc(49) Class83 local49 = this.aClass83_1;
		synchronized (this.aClass83_1) {
			this.aClass83_1.method1675((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V")
	public void method235() {
		@Pc(6) Class83 local6 = this.aClass83_1;
		synchronized (this.aClass83_1) {
			this.aClass83_1.method1669();
		}
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)V")
	public void method236() {
		@Pc(2) Class83 local2 = this.aClass83_1;
		synchronized (this.aClass83_1) {
			this.aClass83_1.method1667();
		}
	}
}
