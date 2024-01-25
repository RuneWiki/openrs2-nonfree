import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class381 {

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "Lclient!tq;")
	private final Class340 aClass340_66 = new Class340(64);

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "Lclient!wm;")
	private final Class390 aClass390_124;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lclient!ega;ILclient!wm;)V")
	public Class381(@OriginalArg(0) Class98 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class390 arg2) {
		this.aClass390_124 = arg2;
		if (this.aClass390_124 != null) {
			this.aClass390_124.method8913(11);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)V")
	public void method8721() {
		@Pc(2) Class340 local2 = this.aClass340_66;
		synchronized (this.aClass340_66) {
			this.aClass340_66.method7996(5);
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
	public void method8723() {
		@Pc(2) Class340 local2 = this.aClass340_66;
		synchronized (this.aClass340_66) {
			this.aClass340_66.method7987();
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
	public void method8727() {
		@Pc(12) Class340 local12 = this.aClass340_66;
		synchronized (this.aClass340_66) {
			this.aClass340_66.method8000();
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)Lclient!mm;")
	public Class233 method8728(@OriginalArg(0) int arg0) {
		@Pc(6) Class340 local6 = this.aClass340_66;
		@Pc(16) Class233 local16;
		synchronized (this.aClass340_66) {
			local16 = (Class233) this.aClass340_66.method7999((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class390 local29 = this.aClass390_124;
		@Pc(38) byte[] local38;
		synchronized (this.aClass390_124) {
			local38 = this.aClass390_124.method8914(11, arg0);
		}
		local16 = new Class233();
		if (local38 != null) {
			local16.method5640(new Class5_Sub41(local38));
		}
		@Pc(62) Class340 local62 = this.aClass340_66;
		synchronized (this.aClass340_66) {
			this.aClass340_66.method7986((long) arg0, local16);
			return local16;
		}
	}
}
