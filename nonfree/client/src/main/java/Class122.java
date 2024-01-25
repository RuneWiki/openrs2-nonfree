import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class122 {

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "Lclient!tq;")
	private final Class340 aClass340_20 = new Class340(16);

	@OriginalMember(owner = "client!fl", name = "h", descriptor = "Lclient!wm;")
	private final Class390 aClass390_41;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lclient!ega;ILclient!wm;)V")
	public Class122(@OriginalArg(0) Class98 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class390 arg2) {
		this.aClass390_41 = arg2;
		this.aClass390_41.method8913(30);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)Lclient!ke;")
	public Class192 method2977(@OriginalArg(1) int arg0) {
		@Pc(6) Class340 local6 = this.aClass340_20;
		@Pc(16) Class192 local16;
		synchronized (this.aClass340_20) {
			local16 = (Class192) this.aClass340_20.method7999((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class390 local29 = this.aClass390_41;
		@Pc(38) byte[] local38;
		synchronized (this.aClass390_41) {
			local38 = this.aClass390_41.method8914(30, arg0);
		}
		local16 = new Class192();
		if (local38 != null) {
			local16.method4865(new Class5_Sub41(local38));
		}
		@Pc(60) Class340 local60 = this.aClass340_20;
		synchronized (this.aClass340_20) {
			this.aClass340_20.method7986((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)V")
	public void method2978() {
		@Pc(12) Class340 local12 = this.aClass340_20;
		synchronized (this.aClass340_20) {
			this.aClass340_20.method7987();
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
	public void method2979() {
		@Pc(2) Class340 local2 = this.aClass340_20;
		synchronized (this.aClass340_20) {
			this.aClass340_20.method8000();
		}
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(II)V")
	public void method2980() {
		@Pc(6) Class340 local6 = this.aClass340_20;
		synchronized (this.aClass340_20) {
			this.aClass340_20.method7996(5);
		}
	}
}
