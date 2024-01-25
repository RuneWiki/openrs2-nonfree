import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Class295 {

	@OriginalMember(owner = "client!pp", name = "m", descriptor = "Lclient!qfa;")
	public final Class307 aClass307_77 = new Class307(20);

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "Lclient!qfa;")
	private final Class307 aClass307_78 = new Class307(64);

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "Lclient!ik;")
	private final Class182 aClass182_100;

	@OriginalMember(owner = "client!pp", name = "k", descriptor = "Lclient!ik;")
	public final Class182 aClass182_101;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lclient!qh;ILclient!ik;Lclient!ik;)V")
	public Class295(@OriginalArg(0) Class309 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class182 arg2, @OriginalArg(3) Class182 arg3) {
		this.aClass182_100 = arg2;
		this.aClass182_101 = arg3;
		this.aClass182_100.method3970(46);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)Lclient!ng;")
	public Class261 method6907(@OriginalArg(1) int arg0) {
		@Pc(6) Class307 local6 = this.aClass307_78;
		@Pc(16) Class261 local16;
		synchronized (this.aClass307_78) {
			local16 = (Class261) this.aClass307_78.method7002((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class182 local30 = this.aClass182_100;
		@Pc(39) byte[] local39;
		synchronized (this.aClass182_100) {
			local39 = this.aClass182_100.method3985(arg0, 46);
		}
		local16 = new Class261();
		local16.aClass295_2 = this;
		if (local39 != null) {
			local16.method5767(new Class3_Sub2(local39));
		}
		@Pc(66) Class307 local66 = this.aClass307_78;
		synchronized (this.aClass307_78) {
			this.aClass307_78.method7000(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V")
	public void method6909() {
		@Pc(6) Class307 local6 = this.aClass307_78;
		synchronized (this.aClass307_78) {
			this.aClass307_78.method6998();
		}
		local6 = this.aClass307_77;
		synchronized (this.aClass307_77) {
			this.aClass307_77.method6998();
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(BI)V")
	public void method6910() {
		@Pc(6) Class307 local6 = this.aClass307_78;
		synchronized (this.aClass307_78) {
			this.aClass307_78.method6995(5);
		}
		local6 = this.aClass307_77;
		synchronized (this.aClass307_77) {
			this.aClass307_77.method6995(5);
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Z)V")
	public void method6911() {
		@Pc(6) Class307 local6 = this.aClass307_78;
		synchronized (this.aClass307_78) {
			this.aClass307_78.method7006();
		}
		local6 = this.aClass307_77;
		synchronized (this.aClass307_77) {
			this.aClass307_77.method7006();
		}
	}
}
