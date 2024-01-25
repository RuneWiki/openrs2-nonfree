import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class365 {

	@OriginalMember(owner = "client!vf", name = "q", descriptor = "Lclient!tq;")
	private Class340 aClass340_62 = new Class340(64);

	@OriginalMember(owner = "client!vf", name = "r", descriptor = "Lclient!tq;")
	public Class340 aClass340_63 = new Class340(64);

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "Lclient!wm;")
	public final Class390 aClass390_121;

	@OriginalMember(owner = "client!vf", name = "j", descriptor = "Lclient!wm;")
	private final Class390 aClass390_122;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lclient!ega;ILclient!wm;Lclient!wm;)V")
	public Class365(@OriginalArg(0) Class98 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class390 arg2, @OriginalArg(3) Class390 arg3) {
		this.aClass390_121 = arg3;
		this.aClass390_122 = arg2;
		this.aClass390_122.method8913(34);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZI)V")
	public void method8479() {
		@Pc(6) Class340 local6 = this.aClass340_62;
		synchronized (this.aClass340_62) {
			this.aClass340_62.method7996(5);
		}
		local6 = this.aClass340_63;
		synchronized (this.aClass340_63) {
			this.aClass340_63.method7996(5);
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)V")
	public void method8480(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass340_62 = new Class340(arg1);
		this.aClass340_63 = new Class340(arg0);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BI)Lclient!cia;")
	public Class63 method8484(@OriginalArg(1) int arg0) {
		@Pc(6) Class340 local6 = this.aClass340_62;
		@Pc(16) Class63 local16;
		synchronized (this.aClass340_62) {
			local16 = (Class63) this.aClass340_62.method7999((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class390 local37 = this.aClass390_122;
		@Pc(46) byte[] local46;
		synchronized (this.aClass390_122) {
			local46 = this.aClass390_122.method8914(34, arg0);
		}
		local16 = new Class63();
		local16.aClass365_3 = this;
		if (local46 != null) {
			local16.method1019(new Class5_Sub41(local46));
		}
		@Pc(71) Class340 local71 = this.aClass340_62;
		synchronized (this.aClass340_62) {
			this.aClass340_62.method7986((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
	public void method8485() {
		@Pc(2) Class340 local2 = this.aClass340_62;
		synchronized (this.aClass340_62) {
			this.aClass340_62.method7987();
		}
		local2 = this.aClass340_63;
		synchronized (this.aClass340_63) {
			this.aClass340_63.method7987();
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)V")
	public void method8486() {
		@Pc(6) Class340 local6 = this.aClass340_62;
		synchronized (this.aClass340_62) {
			this.aClass340_62.method8000();
		}
		local6 = this.aClass340_63;
		synchronized (this.aClass340_63) {
			this.aClass340_63.method8000();
		}
	}
}
