import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ww")
public final class Class362 {

	@OriginalMember(owner = "client!ww", name = "g", descriptor = "Lclient!me;")
	private final Class211 aClass211_68 = new Class211(256);

	@OriginalMember(owner = "client!ww", name = "f", descriptor = "Lclient!pe;")
	private final Class254 aClass254_140;

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Lclient!vd;ILclient!pe;)V")
	public Class362(@OriginalArg(0) Class335 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2) {
		this.aClass254_140 = arg2;
		this.aClass254_140.method6396(26);
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(II)V")
	public void method8437() {
		@Pc(8) Class211 local8 = this.aClass211_68;
		synchronized (this.aClass211_68) {
			this.aClass211_68.method5538(5);
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(B)V")
	public void method8438() {
		@Pc(6) Class211 local6 = this.aClass211_68;
		synchronized (this.aClass211_68) {
			this.aClass211_68.method5537();
		}
	}

	@OriginalMember(owner = "client!ww", name = "b", descriptor = "(B)V")
	public void method8439() {
		@Pc(14) Class211 local14 = this.aClass211_68;
		synchronized (this.aClass211_68) {
			this.aClass211_68.method5535();
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IB)Lclient!oaa;")
	public Class3_Sub4_Sub15 method8441(@OriginalArg(0) int arg0) {
		@Pc(6) Class211 local6 = this.aClass211_68;
		@Pc(24) Class3_Sub4_Sub15 local24;
		synchronized (this.aClass211_68) {
			local24 = (Class3_Sub4_Sub15) this.aClass211_68.method5534((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class254 local37 = this.aClass254_140;
		@Pc(46) byte[] local46;
		synchronized (this.aClass254_140) {
			local46 = this.aClass254_140.method6401(26, arg0);
		}
		local24 = new Class3_Sub4_Sub15();
		if (local46 != null) {
			local24.method5995(new Class3_Sub7(local46));
		}
		@Pc(68) Class211 local68 = this.aClass211_68;
		synchronized (this.aClass211_68) {
			this.aClass211_68.method5529((long) arg0, local24);
			return local24;
		}
	}
}
