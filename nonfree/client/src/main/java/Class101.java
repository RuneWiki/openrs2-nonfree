import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class101 {

	@OriginalMember(owner = "client!et", name = "j", descriptor = "Lclient!iha;")
	private final Class168 aClass168_23 = new Class168(64);

	@OriginalMember(owner = "client!et", name = "g", descriptor = "Lclient!gda;")
	private final Class126 aClass126_80;

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lclient!po;ILclient!gda;)V")
	public Class101(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class126 arg2) {
		this.aClass126_80 = arg2;
		if (this.aClass126_80 != null) {
			this.aClass126_80.method3062(35);
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V")
	public void method2559() {
		@Pc(6) Class168 local6 = this.aClass168_23;
		synchronized (this.aClass168_23) {
			this.aClass168_23.method3862();
		}
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(IB)Lclient!hca;")
	public Class145 method2560(@OriginalArg(0) int arg0) {
		@Pc(14) Class168 local14 = this.aClass168_23;
		@Pc(24) Class145 local24;
		synchronized (this.aClass168_23) {
			local24 = (Class145) this.aClass168_23.method3860((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(38) Class126 local38 = this.aClass126_80;
		@Pc(47) byte[] local47;
		synchronized (this.aClass126_80) {
			local47 = this.aClass126_80.method3086(arg0, 35);
		}
		local24 = new Class145();
		if (local47 != null) {
			local24.method3388(new Class5_Sub36(local47));
		}
		local24.method3392();
		@Pc(74) Class168 local74 = this.aClass168_23;
		synchronized (this.aClass168_23) {
			this.aClass168_23.method3853((long) arg0, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(BI)V")
	public void method2563() {
		@Pc(13) Class168 local13 = this.aClass168_23;
		synchronized (this.aClass168_23) {
			this.aClass168_23.method3852(5);
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(B)V")
	public void method2564() {
		@Pc(2) Class168 local2 = this.aClass168_23;
		synchronized (this.aClass168_23) {
			this.aClass168_23.method3856();
		}
	}
}
