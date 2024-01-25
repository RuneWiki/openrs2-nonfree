import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class336 {

	@OriginalMember(owner = "client!th", name = "c", descriptor = "Lclient!tq;")
	private final Class340 aClass340_59 = new Class340(64);

	@OriginalMember(owner = "client!th", name = "e", descriptor = "Lclient!wm;")
	private final Class390 aClass390_112;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lclient!ega;ILclient!wm;)V")
	public Class336(@OriginalArg(0) Class98 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class390 arg2) {
		this.aClass390_112 = arg2;
		if (this.aClass390_112 != null) {
			this.aClass390_112.method8913(35);
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II)Lclient!lca;")
	public Class208 method7773(@OriginalArg(1) int arg0) {
		@Pc(12) Class340 local12 = this.aClass340_59;
		@Pc(22) Class208 local22;
		synchronized (this.aClass340_59) {
			local22 = (Class208) this.aClass340_59.method7999((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class390 local35 = this.aClass390_112;
		@Pc(44) byte[] local44;
		synchronized (this.aClass390_112) {
			local44 = this.aClass390_112.method8914(35, arg0);
		}
		local22 = new Class208();
		if (local44 != null) {
			local22.method5125(new Class5_Sub41(local44));
		}
		local22.method5130();
		@Pc(71) Class340 local71 = this.aClass340_59;
		synchronized (this.aClass340_59) {
			this.aClass340_59.method7986((long) arg0, local22);
			return local22;
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(II)V")
	public void method7774() {
		@Pc(6) Class340 local6 = this.aClass340_59;
		synchronized (this.aClass340_59) {
			this.aClass340_59.method7996(5);
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
	public void method7776() {
		@Pc(10) Class340 local10 = this.aClass340_59;
		synchronized (this.aClass340_59) {
			this.aClass340_59.method8000();
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(B)V")
	public void method7779() {
		@Pc(6) Class340 local6 = this.aClass340_59;
		synchronized (this.aClass340_59) {
			this.aClass340_59.method7987();
		}
	}
}
