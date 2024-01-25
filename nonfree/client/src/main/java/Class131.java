import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class131 {

	@OriginalMember(owner = "client!h", name = "c", descriptor = "Lclient!me;")
	private final Class211 aClass211_22 = new Class211(128);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "Lclient!pe;")
	private final Class254 aClass254_56;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Lclient!vd;ILclient!pe;)V")
	public Class131(@OriginalArg(0) Class335 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2) {
		this.aClass254_56 = arg2;
		this.aClass254_56.method6396(1);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)Lclient!ih;")
	public Class159 method3146(@OriginalArg(0) int arg0) {
		@Pc(6) Class211 local6 = this.aClass211_22;
		@Pc(18) Class159 local18;
		synchronized (this.aClass211_22) {
			local18 = (Class159) this.aClass211_22.method5534((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class254 local31 = this.aClass254_56;
		@Pc(40) byte[] local40;
		synchronized (this.aClass254_56) {
			local40 = this.aClass254_56.method6401(1, arg0);
		}
		local18 = new Class159();
		if (local40 != null) {
			local18.method3778(new Class3_Sub7(local40));
		}
		@Pc(70) Class211 local70 = this.aClass211_22;
		synchronized (this.aClass211_22) {
			this.aClass211_22.method5529((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(II)V")
	public void method3148() {
		@Pc(2) Class211 local2 = this.aClass211_22;
		synchronized (this.aClass211_22) {
			this.aClass211_22.method5538(5);
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
	public void method3149() {
		@Pc(2) Class211 local2 = this.aClass211_22;
		synchronized (this.aClass211_22) {
			this.aClass211_22.method5537();
		}
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V")
	public void method3151() {
		@Pc(2) Class211 local2 = this.aClass211_22;
		synchronized (this.aClass211_22) {
			this.aClass211_22.method5535();
		}
	}
}
