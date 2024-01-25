import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class278 {

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "Lclient!tq;")
	private final Class340 aClass340_42 = new Class340(64);

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "Lclient!wm;")
	private final Class390 aClass390_87;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lclient!ega;ILclient!wm;)V")
	public Class278(@OriginalArg(0) Class98 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class390 arg2) {
		this.aClass390_87 = arg2;
		if (this.aClass390_87 != null) {
			this.aClass390_87.method8913(54);
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)V")
	public void method6503() {
		@Pc(12) Class340 local12 = this.aClass340_42;
		synchronized (this.aClass340_42) {
			this.aClass340_42.method8000();
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
	public void method6504() {
		@Pc(2) Class340 local2 = this.aClass340_42;
		synchronized (this.aClass340_42) {
			this.aClass340_42.method7987();
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)Lclient!us;")
	public Class357 method6505(@OriginalArg(0) int arg0) {
		@Pc(6) Class340 local6 = this.aClass340_42;
		@Pc(16) Class357 local16;
		synchronized (this.aClass340_42) {
			local16 = (Class357) this.aClass340_42.method7999((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class390 local29 = this.aClass390_87;
		@Pc(38) byte[] local38;
		synchronized (this.aClass390_87) {
			local38 = this.aClass390_87.method8914(54, arg0);
		}
		local16 = new Class357();
		if (local38 != null) {
			local16.method8321(new Class5_Sub41(local38));
		}
		@Pc(60) Class340 local60 = this.aClass340_42;
		synchronized (this.aClass340_42) {
			this.aClass340_42.method7986((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZ)V")
	public void method6507() {
		@Pc(2) Class340 local2 = this.aClass340_42;
		synchronized (this.aClass340_42) {
			this.aClass340_42.method7996(5);
		}
	}
}
