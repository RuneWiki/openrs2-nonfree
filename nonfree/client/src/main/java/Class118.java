import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class118 {

	@OriginalMember(owner = "client!gf", name = "u", descriptor = "I")
	public int anInt3436;

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "Lclient!me;")
	private final Class211 aClass211_19 = new Class211(64);

	@OriginalMember(owner = "client!gf", name = "s", descriptor = "Lclient!me;")
	public final Class211 aClass211_20 = new Class211(50);

	@OriginalMember(owner = "client!gf", name = "t", descriptor = "Lclient!me;")
	public final Class211 aClass211_21 = new Class211(5);

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "Lclient!pe;")
	public final Class254 aClass254_53;

	@OriginalMember(owner = "client!gf", name = "o", descriptor = "Lclient!pe;")
	private final Class254 aClass254_52;

	@OriginalMember(owner = "client!gf", name = "k", descriptor = "Lclient!vd;")
	public final Class335 aClass335_1;

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "Z")
	public boolean aBoolean266;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lclient!vd;IZLclient!pe;Lclient!pe;)V")
	public Class118(@OriginalArg(0) Class335 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class254 arg3, @OriginalArg(4) Class254 arg4) {
		this.aClass254_53 = arg4;
		this.aClass254_52 = arg3;
		this.aClass335_1 = arg0;
		this.aBoolean266 = arg2;
		if (this.aClass254_52 != null) {
			@Pc(41) int local41 = this.aClass254_52.method6421() - 1;
			this.aClass254_52.method6396(local41);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V")
	public void method3024(@OriginalArg(0) int arg0) {
		this.anInt3436 = arg0;
		@Pc(9) Class211 local9 = this.aClass211_20;
		synchronized (this.aClass211_20) {
			this.aClass211_20.method5535();
		}
		local9 = this.aClass211_21;
		synchronized (this.aClass211_21) {
			this.aClass211_21.method5535();
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
	public void method3025() {
		@Pc(2) Class211 local2 = this.aClass211_20;
		synchronized (this.aClass211_20) {
			this.aClass211_20.method5535();
		}
		local2 = this.aClass211_21;
		synchronized (this.aClass211_21) {
			this.aClass211_21.method5535();
		}
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)V")
	public void method3026() {
		@Pc(6) Class211 local6 = this.aClass211_19;
		synchronized (this.aClass211_19) {
			this.aClass211_19.method5535();
		}
		local6 = this.aClass211_20;
		synchronized (this.aClass211_20) {
			this.aClass211_20.method5535();
		}
		local6 = this.aClass211_21;
		synchronized (this.aClass211_21) {
			this.aClass211_21.method5535();
		}
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
	public void method3028() {
		@Pc(2) Class211 local2 = this.aClass211_19;
		synchronized (this.aClass211_19) {
			this.aClass211_19.method5537();
		}
		local2 = this.aClass211_20;
		synchronized (this.aClass211_20) {
			this.aClass211_20.method5537();
		}
		local2 = this.aClass211_21;
		synchronized (this.aClass211_21) {
			this.aClass211_21.method5537();
		}
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)Lclient!jf;")
	public Class169 method3029(@OriginalArg(0) int arg0) {
		@Pc(6) Class211 local6 = this.aClass211_19;
		@Pc(16) Class169 local16;
		synchronized (this.aClass211_19) {
			local16 = (Class169) this.aClass211_19.method5534((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class254 local29 = this.aClass254_52;
		@Pc(44) byte[] local44;
		synchronized (this.aClass254_52) {
			local44 = this.aClass254_52.method6401(Static508.method7618(arg0), Static52.method1289(arg0));
		}
		local16 = new Class169();
		local16.aClass118_3 = this;
		local16.anInt4967 = arg0;
		if (local44 != null) {
			local16.method4179(new Class3_Sub7(local44));
		}
		local16.method4174();
		@Pc(80) Class211 local80 = this.aClass211_19;
		synchronized (this.aClass211_19) {
			this.aClass211_19.method5529((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZB)V")
	public void method3031(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean266) {
			this.aBoolean266 = arg0;
			this.method3026();
		}
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(BI)V")
	public void method3032() {
		@Pc(6) Class211 local6 = this.aClass211_19;
		synchronized (this.aClass211_19) {
			this.aClass211_19.method5538(5);
		}
		local6 = this.aClass211_20;
		synchronized (this.aClass211_20) {
			this.aClass211_20.method5538(5);
		}
		local6 = this.aClass211_21;
		synchronized (this.aClass211_21) {
			this.aClass211_21.method5538(5);
		}
	}
}
