import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cga")
public final class Class46 {

	@OriginalMember(owner = "client!cga", name = "e", descriptor = "Lclient!me;")
	private Class211 aClass211_14 = new Class211(64);

	@OriginalMember(owner = "client!cga", name = "f", descriptor = "Lclient!pe;")
	private final Class254 aClass254_22;

	@OriginalMember(owner = "client!cga", name = "<init>", descriptor = "(Lclient!vd;ILclient!pe;)V")
	public Class46(@OriginalArg(0) Class335 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2) {
		this.aClass254_22 = arg2;
		if (this.aClass254_22 != null) {
			@Pc(20) int local20 = this.aClass254_22.method6421() - 1;
			this.aClass254_22.method6396(local20);
		}
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(ZI)V")
	public void method1594() {
		@Pc(2) Class211 local2 = this.aClass211_14;
		synchronized (this.aClass211_14) {
			this.aClass211_14.method5538(5);
		}
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(II)Lclient!ida;")
	public Class156 method1595(@OriginalArg(0) int arg0) {
		@Pc(6) Class211 local6 = this.aClass211_14;
		@Pc(16) Class156 local16;
		synchronized (this.aClass211_14) {
			local16 = (Class156) this.aClass211_14.method5534((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class254 local29 = this.aClass254_22;
		@Pc(42) byte[] local42;
		synchronized (this.aClass254_22) {
			local42 = this.aClass254_22.method6401(Static410.method6646(arg0), Static144.method2889(arg0));
		}
		local16 = new Class156();
		if (local42 != null) {
			local16.method3728(new Class3_Sub7(local42));
		}
		@Pc(71) Class211 local71 = this.aClass211_14;
		synchronized (this.aClass211_14) {
			this.aClass211_14.method5529((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cga", name = "b", descriptor = "(I)V")
	public void method1597() {
		@Pc(2) Class211 local2 = this.aClass211_14;
		synchronized (this.aClass211_14) {
			this.aClass211_14.method5535();
		}
	}

	@OriginalMember(owner = "client!cga", name = "c", descriptor = "(I)V")
	public void method1598() {
		@Pc(2) Class211 local2 = this.aClass211_14;
		synchronized (this.aClass211_14) {
			this.aClass211_14.method5537();
		}
	}

	@OriginalMember(owner = "client!cga", name = "b", descriptor = "(ZI)V")
	public void method1600(@OriginalArg(1) int arg0) {
		@Pc(2) Class211 local2 = this.aClass211_14;
		synchronized (this.aClass211_14) {
			this.aClass211_14.method5535();
			this.aClass211_14 = new Class211(arg0);
		}
	}
}
