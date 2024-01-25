import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class36 {

	@OriginalMember(owner = "client!bl", name = "k", descriptor = "Lclient!qj;")
	private Class295 aClass295_2 = new Class295(64);

	@OriginalMember(owner = "client!bl", name = "g", descriptor = "Lclient!uq;")
	private final Class362 aClass362_10;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lclient!kw;ILclient!uq;)V")
	public Class36(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class362 arg2) {
		this.aClass362_10 = arg2;
		if (this.aClass362_10 != null) {
			@Pc(20) int local20 = this.aClass362_10.method8373() - 1;
			this.aClass362_10.method8355(local20);
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IB)V")
	public void method1017(@OriginalArg(0) int arg0) {
		@Pc(2) Class295 local2 = this.aClass295_2;
		synchronized (this.aClass295_2) {
			this.aClass295_2.method6464();
			this.aClass295_2 = new Class295(arg0);
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V")
	public void method1018() {
		@Pc(11) Class295 local11 = this.aClass295_2;
		synchronized (this.aClass295_2) {
			this.aClass295_2.method6474();
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(II)Lclient!hl;")
	public Class148 method1021(@OriginalArg(1) int arg0) {
		@Pc(6) Class295 local6 = this.aClass295_2;
		@Pc(20) Class148 local20;
		synchronized (this.aClass295_2) {
			local20 = (Class148) this.aClass295_2.method6470((long) arg0);
		}
		if (local20 != null) {
			return local20;
		}
		@Pc(33) Class362 local33 = this.aClass362_10;
		@Pc(46) byte[] local46;
		synchronized (this.aClass362_10) {
			local46 = this.aClass362_10.method8368(Static543.method6977(arg0), Static313.method7418(arg0));
		}
		local20 = new Class148();
		if (local46 != null) {
			local20.method3417(new Class3_Sub4(local46));
		}
		@Pc(68) Class295 local68 = this.aClass295_2;
		synchronized (this.aClass295_2) {
			this.aClass295_2.method6469((long) arg0, local20);
			return local20;
		}
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(II)V")
	public void method1023() {
		@Pc(10) Class295 local10 = this.aClass295_2;
		synchronized (this.aClass295_2) {
			this.aClass295_2.method6462(5);
		}
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "(I)V")
	public void method1024() {
		@Pc(6) Class295 local6 = this.aClass295_2;
		synchronized (this.aClass295_2) {
			this.aClass295_2.method6464();
		}
	}
}
