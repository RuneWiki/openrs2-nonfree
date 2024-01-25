import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class6 {

	@OriginalMember(owner = "client!af", name = "d", descriptor = "Lclient!me;")
	private final Class211 aClass211_3 = new Class211(64);

	@OriginalMember(owner = "client!af", name = "k", descriptor = "Lclient!pe;")
	private final Class254 aClass254_3;

	@OriginalMember(owner = "client!af", name = "g", descriptor = "Lclient!pe;")
	public final Class254 aClass254_2;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lclient!vd;ILclient!pe;Lclient!pe;)V")
	public Class6(@OriginalArg(0) Class335 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2, @OriginalArg(3) Class254 arg3) {
		this.aClass254_3 = arg2;
		this.aClass254_2 = arg3;
		this.aClass254_3.method6396(3);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
	public void method303() {
		@Pc(7) Class211 local7 = this.aClass211_3;
		synchronized (this.aClass211_3) {
			this.aClass211_3.method5535();
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BI)Lclient!qd;")
	public Class265 method304(@OriginalArg(1) int arg0) {
		@Pc(6) Class211 local6 = this.aClass211_3;
		@Pc(16) Class265 local16;
		synchronized (this.aClass211_3) {
			local16 = (Class265) this.aClass211_3.method5534((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class254 local37 = this.aClass254_3;
		@Pc(46) byte[] local46;
		synchronized (this.aClass254_3) {
			local46 = this.aClass254_3.method6401(3, arg0);
		}
		local16 = new Class265();
		local16.aClass6_2 = this;
		if (local46 != null) {
			local16.method6757(new Class3_Sub7(local46));
		}
		@Pc(71) Class211 local71 = this.aClass211_3;
		synchronized (this.aClass211_3) {
			this.aClass211_3.method5529((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V")
	public void method308() {
		@Pc(2) Class211 local2 = this.aClass211_3;
		synchronized (this.aClass211_3) {
			this.aClass211_3.method5537();
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ZI)V")
	public void method310() {
		@Pc(8) Class211 local8 = this.aClass211_3;
		synchronized (this.aClass211_3) {
			this.aClass211_3.method5538(5);
		}
	}
}
