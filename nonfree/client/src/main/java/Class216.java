import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kw")
public final class Class216 {

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "Lclient!pja;")
	private final Class279 aClass279_31 = new Class279(64);

	@OriginalMember(owner = "client!kw", name = "g", descriptor = "Lclient!gj;")
	private final Class143 aClass143_82;

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Lclient!im;ILclient!gj;)V")
	public Class216(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class143 arg2) {
		this.aClass143_82 = arg2;
		this.aClass143_82.method3123(31);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)V")
	public void method5046() {
		@Pc(2) Class279 local2 = this.aClass279_31;
		synchronized (this.aClass279_31) {
			this.aClass279_31.method6638();
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(II)V")
	public void method5047() {
		@Pc(2) Class279 local2 = this.aClass279_31;
		synchronized (this.aClass279_31) {
			this.aClass279_31.method6630(5);
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(BI)Lclient!ik;")
	public Class179 method5048(@OriginalArg(1) int arg0) {
		@Pc(6) Class279 local6 = this.aClass279_31;
		@Pc(16) Class179 local16;
		synchronized (this.aClass279_31) {
			local16 = (Class179) this.aClass279_31.method6631((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class143 local29 = this.aClass143_82;
		@Pc(44) byte[] local44;
		synchronized (this.aClass143_82) {
			local44 = this.aClass143_82.method3125(arg0, 31);
		}
		local16 = new Class179();
		if (local44 != null) {
			local16.method4051(new Class3_Sub17(local44));
		}
		@Pc(66) Class279 local66 = this.aClass279_31;
		synchronized (this.aClass279_31) {
			this.aClass279_31.method6635(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(I)V")
	public void method5049() {
		@Pc(2) Class279 local2 = this.aClass279_31;
		synchronized (this.aClass279_31) {
			this.aClass279_31.method6637();
		}
	}
}
