import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class211 {

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "Lclient!tq;")
	private final Class340 aClass340_39 = new Class340(256);

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "Lclient!wm;")
	private final Class390 aClass390_80;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lclient!ega;ILclient!wm;)V")
	public Class211(@OriginalArg(0) Class98 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class390 arg2) {
		this.aClass390_80 = arg2;
		this.aClass390_80.method8913(26);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
	public void method5179() {
		@Pc(2) Class340 local2 = this.aClass340_39;
		synchronized (this.aClass340_39) {
			this.aClass340_39.method7987();
		}
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)V")
	public void method5180() {
		@Pc(6) Class340 local6 = this.aClass340_39;
		synchronized (this.aClass340_39) {
			this.aClass340_39.method8000();
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)V")
	public void method5182() {
		@Pc(2) Class340 local2 = this.aClass340_39;
		synchronized (this.aClass340_39) {
			this.aClass340_39.method7996(5);
		}
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)Lclient!va;")
	public Class5_Sub3_Sub19 method5183(@OriginalArg(1) int arg0) {
		@Pc(6) Class340 local6 = this.aClass340_39;
		@Pc(16) Class5_Sub3_Sub19 local16;
		synchronized (this.aClass340_39) {
			local16 = (Class5_Sub3_Sub19) this.aClass340_39.method7999((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class390 local29 = this.aClass390_80;
		@Pc(38) byte[] local38;
		synchronized (this.aClass390_80) {
			local38 = this.aClass390_80.method8914(26, arg0);
		}
		local16 = new Class5_Sub3_Sub19();
		if (local38 != null) {
			local16.method8406(new Class5_Sub41(local38));
		}
		@Pc(60) Class340 local60 = this.aClass340_39;
		synchronized (this.aClass340_39) {
			this.aClass340_39.method7986((long) arg0, local16);
			return local16;
		}
	}
}
