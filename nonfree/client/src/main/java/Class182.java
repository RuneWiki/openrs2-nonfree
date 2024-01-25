import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class182 {

	@OriginalMember(owner = "client!jn", name = "i", descriptor = "Lclient!tq;")
	private final Class340 aClass340_34 = new Class340(64);

	@OriginalMember(owner = "client!jn", name = "h", descriptor = "Lclient!wm;")
	private final Class390 aClass390_72;

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Lclient!ega;ILclient!wm;)V")
	public Class182(@OriginalArg(0) Class98 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class390 arg2) {
		this.aClass390_72 = arg2;
		this.aClass390_72.method8913(31);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)V")
	public void method4674() {
		@Pc(2) Class340 local2 = this.aClass340_34;
		synchronized (this.aClass340_34) {
			this.aClass340_34.method7996(5);
		}
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(II)Lclient!haa;")
	public Class142 method4675(@OriginalArg(0) int arg0) {
		@Pc(6) Class340 local6 = this.aClass340_34;
		@Pc(16) Class142 local16;
		synchronized (this.aClass340_34) {
			local16 = (Class142) this.aClass340_34.method7999((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class390 local29 = this.aClass390_72;
		@Pc(38) byte[] local38;
		synchronized (this.aClass390_72) {
			local38 = this.aClass390_72.method8914(31, arg0);
		}
		local16 = new Class142();
		if (local38 != null) {
			local16.method3439(new Class5_Sub41(local38));
		}
		@Pc(60) Class340 local60 = this.aClass340_34;
		synchronized (this.aClass340_34) {
			this.aClass340_34.method7986((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(B)V")
	public void method4677() {
		@Pc(2) Class340 local2 = this.aClass340_34;
		synchronized (this.aClass340_34) {
			this.aClass340_34.method8000();
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V")
	public void method4678() {
		@Pc(2) Class340 local2 = this.aClass340_34;
		synchronized (this.aClass340_34) {
			this.aClass340_34.method7987();
		}
	}
}
