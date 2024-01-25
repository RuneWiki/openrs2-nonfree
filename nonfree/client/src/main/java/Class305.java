import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class305 {

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "Lclient!iha;")
	private Class168 aClass168_69 = new Class168(64);

	@OriginalMember(owner = "client!qn", name = "l", descriptor = "Lclient!gda;")
	private final Class126 aClass126_225;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lclient!po;ILclient!gda;)V")
	public Class305(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class126 arg2) {
		this.aClass126_225 = arg2;
		if (this.aClass126_225 != null) {
			@Pc(20) int local20 = this.aClass126_225.method3082() - 1;
			this.aClass126_225.method3062(local20);
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IB)V")
	public void method6902(@OriginalArg(0) int arg0) {
		@Pc(6) Class168 local6 = this.aClass168_69;
		synchronized (this.aClass168_69) {
			this.aClass168_69.method3862();
			this.aClass168_69 = new Class168(arg0);
		}
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(B)V")
	public void method6903() {
		@Pc(2) Class168 local2 = this.aClass168_69;
		synchronized (this.aClass168_69) {
			this.aClass168_69.method3856();
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Z)V")
	public void method6904() {
		@Pc(11) Class168 local11 = this.aClass168_69;
		synchronized (this.aClass168_69) {
			this.aClass168_69.method3862();
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)V")
	public void method6905() {
		@Pc(2) Class168 local2 = this.aClass168_69;
		synchronized (this.aClass168_69) {
			this.aClass168_69.method3852(5);
		}
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(II)Lclient!hb;")
	public Class143 method6909(@OriginalArg(0) int arg0) {
		@Pc(14) Class168 local14 = this.aClass168_69;
		@Pc(26) Class143 local26;
		synchronized (this.aClass168_69) {
			local26 = (Class143) this.aClass168_69.method3860((long) arg0);
		}
		if (local26 != null) {
			return local26;
		}
		@Pc(40) Class126 local40 = this.aClass126_225;
		@Pc(55) byte[] local55;
		synchronized (this.aClass126_225) {
			local55 = this.aClass126_225.method3086(Static536.method7360(arg0), Static8.method133(arg0));
		}
		local26 = new Class143();
		if (local55 != null) {
			local26.method3368(new Class5_Sub36(local55));
		}
		@Pc(79) Class168 local79 = this.aClass168_69;
		synchronized (this.aClass168_69) {
			this.aClass168_69.method3853((long) arg0, local26);
			return local26;
		}
	}
}
