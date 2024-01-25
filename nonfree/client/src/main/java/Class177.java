import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class177 {

	@OriginalMember(owner = "client!jf", name = "k", descriptor = "Lclient!tja;")
	private final Class352 aClass352_39 = new Class352(64);

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "Lclient!bt;")
	private final Class34 aClass34_61;

	@OriginalMember(owner = "client!jf", name = "m", descriptor = "Lclient!ls;")
	public final Class220 aClass220_1;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lclient!mja;ILclient!bt;Lclient!ls;)V")
	public Class177(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class220 arg3) {
		this.aClass34_61 = arg2;
		this.aClass34_61.method1233(32);
		this.aClass220_1 = arg3;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V")
	public void method3977() {
		@Pc(10) Class352 local10 = this.aClass352_39;
		synchronized (this.aClass352_39) {
			this.aClass352_39.method7659();
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)V")
	public void method3978() {
		@Pc(2) Class352 local2 = this.aClass352_39;
		synchronized (this.aClass352_39) {
			this.aClass352_39.method7656();
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BI)Lclient!vl;")
	public Class377 method3979(@OriginalArg(1) int arg0) {
		@Pc(6) Class352 local6 = this.aClass352_39;
		@Pc(16) Class377 local16;
		synchronized (this.aClass352_39) {
			local16 = (Class377) this.aClass352_39.method7653((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class34 local37 = this.aClass34_61;
		@Pc(46) byte[] local46;
		synchronized (this.aClass34_61) {
			local46 = this.aClass34_61.method1239(32, arg0);
		}
		local16 = new Class377();
		local16.aClass177_2 = this;
		if (local46 != null) {
			local16.method8544(new Class4_Sub11(local46));
		}
		@Pc(71) Class352 local71 = this.aClass352_39;
		synchronized (this.aClass352_39) {
			this.aClass352_39.method7655((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)V")
	public void method3981() {
		@Pc(2) Class352 local2 = this.aClass352_39;
		synchronized (this.aClass352_39) {
			this.aClass352_39.method7663(5);
		}
	}
}
