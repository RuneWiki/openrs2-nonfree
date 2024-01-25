import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!taa")
public final class Class303 {

	@OriginalMember(owner = "client!taa", name = "q", descriptor = "I")
	public int anInt9146;

	@OriginalMember(owner = "client!taa", name = "l", descriptor = "Lclient!me;")
	private final Class211 aClass211_58 = new Class211(64);

	@OriginalMember(owner = "client!taa", name = "p", descriptor = "Lclient!me;")
	public final Class211 aClass211_59 = new Class211(30);

	@OriginalMember(owner = "client!taa", name = "c", descriptor = "Lclient!pe;")
	public final Class254 aClass254_123;

	@OriginalMember(owner = "client!taa", name = "g", descriptor = "Lclient!pe;")
	private final Class254 aClass254_124;

	@OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(Lclient!vd;ILclient!pe;Lclient!pe;)V")
	public Class303(@OriginalArg(0) Class335 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2, @OriginalArg(3) Class254 arg3) {
		this.aClass254_123 = arg3;
		this.aClass254_124 = arg2;
		@Pc(26) int local26 = this.aClass254_124.method6421() - 1;
		this.aClass254_124.method6396(local26);
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(B)V")
	public void method7472() {
		@Pc(2) Class211 local2 = this.aClass211_58;
		synchronized (this.aClass211_58) {
			this.aClass211_58.method5537();
		}
		local2 = this.aClass211_59;
		synchronized (this.aClass211_59) {
			this.aClass211_59.method5537();
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)V")
	public void method7473() {
		@Pc(6) Class211 local6 = this.aClass211_58;
		synchronized (this.aClass211_58) {
			this.aClass211_58.method5535();
		}
		local6 = this.aClass211_59;
		synchronized (this.aClass211_59) {
			this.aClass211_59.method5535();
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(ZI)V")
	public void method7474(@OriginalArg(1) int arg0) {
		this.anInt9146 = arg0;
		@Pc(9) Class211 local9 = this.aClass211_59;
		synchronized (this.aClass211_59) {
			this.aClass211_59.method5535();
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(II)V")
	public void method7475() {
		@Pc(2) Class211 local2 = this.aClass211_58;
		synchronized (this.aClass211_58) {
			this.aClass211_58.method5538(5);
		}
		local2 = this.aClass211_59;
		synchronized (this.aClass211_59) {
			this.aClass211_59.method5538(5);
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(IZ)Lclient!eca;")
	public Class77 method7476(@OriginalArg(0) int arg0) {
		@Pc(6) Class211 local6 = this.aClass211_58;
		@Pc(16) Class77 local16;
		synchronized (this.aClass211_58) {
			local16 = (Class77) this.aClass211_58.method5534((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class254 local29 = this.aClass254_124;
		@Pc(42) byte[] local42;
		synchronized (this.aClass254_124) {
			local42 = this.aClass254_124.method6401(Static329.method5692(arg0), Static41.method1149(arg0));
		}
		local16 = new Class77();
		local16.anInt2565 = arg0;
		local16.aClass303_2 = this;
		if (local42 != null) {
			local16.method2275(new Class3_Sub7(local42));
		}
		@Pc(77) Class211 local77 = this.aClass211_58;
		synchronized (this.aClass211_58) {
			this.aClass211_58.method5529((long) arg0, local16);
			return local16;
		}
	}
}
