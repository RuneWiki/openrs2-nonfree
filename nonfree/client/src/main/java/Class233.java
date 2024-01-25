import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class233 {

	@OriginalMember(owner = "client!me", name = "b", descriptor = "Lclient!iha;")
	private final Class168 aClass168_49 = new Class168(64);

	@OriginalMember(owner = "client!me", name = "j", descriptor = "Lclient!iha;")
	public final Class168 aClass168_50 = new Class168(2);

	@OriginalMember(owner = "client!me", name = "k", descriptor = "Lclient!gda;")
	public final Class126 aClass126_164;

	@OriginalMember(owner = "client!me", name = "h", descriptor = "Lclient!gda;")
	private final Class126 aClass126_163;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!po;ILclient!gda;Lclient!gda;)V")
	public Class233(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class126 arg2, @OriginalArg(3) Class126 arg3) {
		this.aClass126_164 = arg3;
		this.aClass126_163 = arg2;
		this.aClass126_163.method3062(33);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(II)Lclient!sb;")
	public Class323 method5211(@OriginalArg(0) int arg0) {
		@Pc(6) Class168 local6 = this.aClass168_49;
		@Pc(18) Class323 local18;
		synchronized (this.aClass168_49) {
			local18 = (Class323) this.aClass168_49.method3860((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(32) Class126 local32 = this.aClass126_163;
		@Pc(41) byte[] local41;
		synchronized (this.aClass126_163) {
			local41 = this.aClass126_163.method3086(arg0, 33);
		}
		local18 = new Class323();
		local18.aClass233_2 = this;
		if (local41 != null) {
			local18.method7361(new Class5_Sub36(local41));
		}
		@Pc(68) Class168 local68 = this.aClass168_49;
		synchronized (this.aClass168_49) {
			this.aClass168_49.method3853((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(I)V")
	public void method5213() {
		@Pc(14) Class168 local14 = this.aClass168_49;
		synchronized (this.aClass168_49) {
			this.aClass168_49.method3862();
		}
		local14 = this.aClass168_50;
		synchronized (this.aClass168_50) {
			this.aClass168_50.method3862();
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZI)V")
	public void method5214() {
		@Pc(6) Class168 local6 = this.aClass168_49;
		synchronized (this.aClass168_49) {
			this.aClass168_49.method3852(5);
		}
		local6 = this.aClass168_50;
		synchronized (this.aClass168_50) {
			this.aClass168_50.method3852(5);
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
	public void method5215() {
		@Pc(6) Class168 local6 = this.aClass168_49;
		synchronized (this.aClass168_49) {
			this.aClass168_49.method3856();
		}
		local6 = this.aClass168_50;
		synchronized (this.aClass168_50) {
			this.aClass168_50.method3856();
		}
	}
}
