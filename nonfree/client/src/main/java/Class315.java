import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class315 {

	@OriginalMember(owner = "client!tp", name = "j", descriptor = "Lclient!me;")
	private Class211 aClass211_60 = new Class211(64);

	@OriginalMember(owner = "client!tp", name = "m", descriptor = "Lclient!me;")
	public Class211 aClass211_61 = new Class211(64);

	@OriginalMember(owner = "client!tp", name = "i", descriptor = "Lclient!pe;")
	private final Class254 aClass254_128;

	@OriginalMember(owner = "client!tp", name = "h", descriptor = "Lclient!pe;")
	public final Class254 aClass254_127;

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lclient!vd;ILclient!pe;Lclient!pe;)V")
	public Class315(@OriginalArg(0) Class335 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2, @OriginalArg(3) Class254 arg3) {
		this.aClass254_128 = arg2;
		this.aClass254_127 = arg3;
		this.aClass254_128.method6396(34);
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(BI)Lclient!gca;")
	public Class114 method7655(@OriginalArg(1) int arg0) {
		@Pc(6) Class211 local6 = this.aClass211_60;
		@Pc(16) Class114 local16;
		synchronized (this.aClass211_60) {
			local16 = (Class114) this.aClass211_60.method5534((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class254 local29 = this.aClass254_128;
		@Pc(38) byte[] local38;
		synchronized (this.aClass254_128) {
			local38 = this.aClass254_128.method6401(34, arg0);
		}
		local16 = new Class114();
		local16.aClass315_2 = this;
		if (local38 != null) {
			local16.method2977(new Class3_Sub7(local38));
		}
		@Pc(71) Class211 local71 = this.aClass211_60;
		synchronized (this.aClass211_60) {
			this.aClass211_60.method5529((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(III)V")
	public void method7656(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass211_60 = new Class211(arg1);
		this.aClass211_61 = new Class211(arg0);
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(I)V")
	public void method7657() {
		@Pc(2) Class211 local2 = this.aClass211_60;
		synchronized (this.aClass211_60) {
			this.aClass211_60.method5535();
		}
		local2 = this.aClass211_61;
		synchronized (this.aClass211_61) {
			this.aClass211_61.method5535();
		}
	}

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "(I)V")
	public void method7658() {
		@Pc(6) Class211 local6 = this.aClass211_60;
		synchronized (this.aClass211_60) {
			this.aClass211_60.method5537();
		}
		local6 = this.aClass211_61;
		synchronized (this.aClass211_61) {
			this.aClass211_61.method5537();
		}
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(BI)V")
	public void method7659() {
		@Pc(12) Class211 local12 = this.aClass211_60;
		synchronized (this.aClass211_60) {
			this.aClass211_60.method5538(5);
		}
		local12 = this.aClass211_61;
		synchronized (this.aClass211_61) {
			this.aClass211_61.method5538(5);
		}
	}
}
