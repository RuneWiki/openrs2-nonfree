import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class10 {

	@OriginalMember(owner = "client!aj", name = "k", descriptor = "Lclient!me;")
	private Class211 aClass211_4 = new Class211(128);

	@OriginalMember(owner = "client!aj", name = "o", descriptor = "Lclient!me;")
	public Class211 aClass211_5 = new Class211(64);

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "Lclient!pe;")
	public final Class254 aClass254_5;

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "Lclient!pe;")
	private final Class254 aClass254_6;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lclient!vd;ILclient!pe;Lclient!pe;)V")
	public Class10(@OriginalArg(0) Class335 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2, @OriginalArg(3) Class254 arg3) {
		this.aClass254_5 = arg3;
		this.aClass254_6 = arg2;
		this.aClass254_6.method6396(36);
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
	public void method396() {
		@Pc(12) Class211 local12 = this.aClass211_4;
		synchronized (this.aClass211_4) {
			this.aClass211_4.method5537();
		}
		local12 = this.aClass211_5;
		synchronized (this.aClass211_5) {
			this.aClass211_5.method5537();
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)V")
	public void method398() {
		@Pc(2) Class211 local2 = this.aClass211_4;
		synchronized (this.aClass211_4) {
			this.aClass211_4.method5538(5);
		}
		local2 = this.aClass211_5;
		synchronized (this.aClass211_5) {
			this.aClass211_5.method5538(5);
		}
	}

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)V")
	public void method399() {
		@Pc(6) Class211 local6 = this.aClass211_4;
		synchronized (this.aClass211_4) {
			this.aClass211_4.method5535();
		}
		local6 = this.aClass211_5;
		synchronized (this.aClass211_5) {
			this.aClass211_5.method5535();
		}
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(BI)Lclient!dt;")
	public Class70 method400(@OriginalArg(1) int arg0) {
		@Pc(14) Class211 local14 = this.aClass211_4;
		@Pc(24) Class70 local24;
		synchronized (this.aClass211_4) {
			local24 = (Class70) this.aClass211_4.method5534((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class254 local37 = this.aClass254_6;
		@Pc(46) byte[] local46;
		synchronized (this.aClass254_6) {
			local46 = this.aClass254_6.method6401(36, arg0);
		}
		local24 = new Class70();
		local24.aClass10_3 = this;
		local24.anInt2373 = arg0;
		if (local46 != null) {
			local24.method2139(new Class3_Sub7(local46));
		}
		local24.method2135();
		@Pc(77) Class211 local77 = this.aClass211_4;
		synchronized (this.aClass211_4) {
			this.aClass211_4.method5529((long) arg0, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(III)V")
	public void method401(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass211_4 = new Class211(arg1);
		this.aClass211_5 = new Class211(arg0);
	}
}
