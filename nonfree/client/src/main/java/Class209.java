import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class209 {

	@OriginalMember(owner = "client!md", name = "h", descriptor = "Lclient!me;")
	private final Class211 aClass211_46 = new Class211(64);

	@OriginalMember(owner = "client!md", name = "l", descriptor = "I")
	public int anInt6577 = 0;

	@OriginalMember(owner = "client!md", name = "j", descriptor = "Lclient!pe;")
	private final Class254 aClass254_90;

	@OriginalMember(owner = "client!md", name = "e", descriptor = "I")
	public final int anInt6573;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!vd;ILclient!pe;)V")
	public Class209(@OriginalArg(0) Class335 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2) {
		this.aClass254_90 = arg2;
		this.anInt6573 = this.aClass254_90.method6396(4);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IB)V")
	public void method5510() {
		@Pc(2) Class211 local2 = this.aClass211_46;
		synchronized (this.aClass211_46) {
			this.aClass211_46.method5538(5);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
	public void method5511() {
		@Pc(6) Class211 local6 = this.aClass211_46;
		synchronized (this.aClass211_46) {
			this.aClass211_46.method5537();
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ZI)Lclient!gr;")
	public Class128 method5515(@OriginalArg(1) int arg0) {
		@Pc(6) Class211 local6 = this.aClass211_46;
		@Pc(16) Class128 local16;
		synchronized (this.aClass211_46) {
			local16 = (Class128) this.aClass211_46.method5534((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class254 local29 = this.aClass254_90;
		@Pc(38) byte[] local38;
		synchronized (this.aClass254_90) {
			local38 = this.aClass254_90.method6401(4, arg0);
		}
		local16 = new Class128();
		local16.aClass209_2 = this;
		local16.anInt3541 = arg0;
		if (local38 != null) {
			local16.method3116(new Class3_Sub7(local38));
		}
		local16.method3111();
		@Pc(69) Class211 local69 = this.aClass211_46;
		synchronized (this.aClass211_46) {
			this.aClass211_46.method5529((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(B)V")
	public void method5516() {
		@Pc(6) Class211 local6 = this.aClass211_46;
		synchronized (this.aClass211_46) {
			this.aClass211_46.method5535();
		}
	}
}
