import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!up")
public final class Class243 {

	@OriginalMember(owner = "client!up", name = "d", descriptor = "Lclient!ff;")
	private final Class83 aClass83_58 = new Class83(64);

	@OriginalMember(owner = "client!up", name = "c", descriptor = "Lclient!vh;")
	private final Class250 aClass250_83;

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lclient!lf;ILclient!vh;)V")
	public Class243(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2) {
		this.aClass250_83 = arg2;
		if (this.aClass250_83 != null) {
			this.aClass250_83.method5653(11);
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IB)Lclient!vr;")
	public Class256 method5551(@OriginalArg(0) int arg0) {
		@Pc(6) Class83 local6 = this.aClass83_58;
		@Pc(16) Class256 local16;
		synchronized (this.aClass83_58) {
			local16 = (Class256) this.aClass83_58.method1658((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(39) byte[] local39 = this.aClass250_83.method5667(arg0, 11);
		local16 = new Class256();
		if (local39 != null) {
			local16.method5762(new Class1_Sub1(local39));
		}
		@Pc(55) Class83 local55 = this.aClass83_58;
		synchronized (this.aClass83_58) {
			this.aClass83_58.method1675((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(Z)V")
	public void method5553() {
		@Pc(10) Class83 local10 = this.aClass83_58;
		synchronized (this.aClass83_58) {
			this.aClass83_58.method1669();
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(II)V")
	public void method5554() {
		@Pc(12) Class83 local12 = this.aClass83_58;
		synchronized (this.aClass83_58) {
			this.aClass83_58.method1663(5);
		}
	}

	@OriginalMember(owner = "client!up", name = "c", descriptor = "(Z)V")
	public void method5555() {
		@Pc(11) Class83 local11 = this.aClass83_58;
		synchronized (this.aClass83_58) {
			this.aClass83_58.method1667();
		}
	}
}
