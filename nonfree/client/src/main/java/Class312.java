import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class312 {

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "Lclient!iha;")
	public final Class168 aClass168_72 = new Class168(20);

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "Lclient!iha;")
	private final Class168 aClass168_73 = new Class168(64);

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "Lclient!gda;")
	public final Class126 aClass126_232;

	@OriginalMember(owner = "client!rf", name = "l", descriptor = "Lclient!gda;")
	private final Class126 aClass126_233;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lclient!po;ILclient!gda;Lclient!gda;)V")
	public Class312(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class126 arg2, @OriginalArg(3) Class126 arg3) {
		this.aClass126_232 = arg3;
		this.aClass126_233 = arg2;
		this.aClass126_233.method3062(46);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IB)V")
	public void method7049() {
		@Pc(6) Class168 local6 = this.aClass168_73;
		synchronized (this.aClass168_73) {
			this.aClass168_73.method3852(5);
		}
		local6 = this.aClass168_72;
		synchronized (this.aClass168_72) {
			this.aClass168_72.method3852(5);
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
	public void method7051() {
		@Pc(2) Class168 local2 = this.aClass168_73;
		synchronized (this.aClass168_73) {
			this.aClass168_73.method3856();
		}
		local2 = this.aClass168_72;
		synchronized (this.aClass168_72) {
			this.aClass168_72.method3856();
		}
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V")
	public void method7052() {
		@Pc(6) Class168 local6 = this.aClass168_73;
		synchronized (this.aClass168_73) {
			this.aClass168_73.method3862();
		}
		local6 = this.aClass168_72;
		synchronized (this.aClass168_72) {
			this.aClass168_72.method3862();
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(BI)Lclient!kw;")
	public Class213 method7055(@OriginalArg(1) int arg0) {
		@Pc(6) Class168 local6 = this.aClass168_73;
		@Pc(16) Class213 local16;
		synchronized (this.aClass168_73) {
			local16 = (Class213) this.aClass168_73.method3860((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) Class126 local38 = this.aClass126_233;
		@Pc(47) byte[] local47;
		synchronized (this.aClass126_233) {
			local47 = this.aClass126_233.method3086(arg0, 46);
		}
		local16 = new Class213();
		local16.aClass312_2 = this;
		if (local47 != null) {
			local16.method4843(new Class5_Sub36(local47));
		}
		@Pc(74) Class168 local74 = this.aClass168_73;
		synchronized (this.aClass168_73) {
			this.aClass168_73.method3853((long) arg0, local16);
			return local16;
		}
	}
}
