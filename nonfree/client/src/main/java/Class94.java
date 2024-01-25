import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eba")
public final class Class94 {

	@OriginalMember(owner = "client!eba", name = "g", descriptor = "Lclient!tq;")
	private final Class340 aClass340_14 = new Class340(64);

	@OriginalMember(owner = "client!eba", name = "h", descriptor = "Lclient!wm;")
	private final Class390 aClass390_28;

	@OriginalMember(owner = "client!eba", name = "f", descriptor = "Lclient!wm;")
	public final Class390 aClass390_27;

	@OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lclient!ega;ILclient!wm;Lclient!wm;)V")
	public Class94(@OriginalArg(0) Class98 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class390 arg2, @OriginalArg(3) Class390 arg3) {
		this.aClass390_28 = arg2;
		this.aClass390_27 = arg3;
		this.aClass390_28.method8913(3);
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(B)V")
	public void method2324() {
		@Pc(14) Class340 local14 = this.aClass340_14;
		synchronized (this.aClass340_14) {
			this.aClass340_14.method8000();
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(II)V")
	public void method2326() {
		@Pc(6) Class340 local6 = this.aClass340_14;
		synchronized (this.aClass340_14) {
			this.aClass340_14.method7996(5);
		}
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "(B)V")
	public void method2327() {
		@Pc(8) Class340 local8 = this.aClass340_14;
		synchronized (this.aClass340_14) {
			this.aClass340_14.method7987();
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IB)Lclient!rba;")
	public Class299 method2328(@OriginalArg(0) int arg0) {
		@Pc(12) Class340 local12 = this.aClass340_14;
		@Pc(22) Class299 local22;
		synchronized (this.aClass340_14) {
			local22 = (Class299) this.aClass340_14.method7999((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class390 local35 = this.aClass390_28;
		@Pc(44) byte[] local44;
		synchronized (this.aClass390_28) {
			local44 = this.aClass390_28.method8914(3, arg0);
		}
		local22 = new Class299();
		local22.aClass94_1 = this;
		if (local44 != null) {
			local22.method7127(new Class5_Sub41(local44));
		}
		@Pc(69) Class340 local69 = this.aClass340_14;
		synchronized (this.aClass340_14) {
			this.aClass340_14.method7986((long) arg0, local22);
			return local22;
		}
	}
}
