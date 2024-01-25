import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nfa")
public final class Class228 {

	@OriginalMember(owner = "client!nfa", name = "k", descriptor = "Lclient!me;")
	private final Class211 aClass211_47 = new Class211(64);

	@OriginalMember(owner = "client!nfa", name = "o", descriptor = "Lclient!me;")
	public final Class211 aClass211_48 = new Class211(2);

	@OriginalMember(owner = "client!nfa", name = "c", descriptor = "Lclient!pe;")
	private final Class254 aClass254_95;

	@OriginalMember(owner = "client!nfa", name = "f", descriptor = "Lclient!pe;")
	public final Class254 aClass254_96;

	@OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(Lclient!vd;ILclient!pe;Lclient!pe;)V")
	public Class228(@OriginalArg(0) Class335 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2, @OriginalArg(3) Class254 arg3) {
		this.aClass254_95 = arg2;
		this.aClass254_96 = arg3;
		this.aClass254_95.method6396(33);
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(ZI)Lclient!we;")
	public Class351 method5845(@OriginalArg(1) int arg0) {
		@Pc(6) Class211 local6 = this.aClass211_47;
		@Pc(25) Class351 local25;
		synchronized (this.aClass211_47) {
			local25 = (Class351) this.aClass211_47.method5534((long) arg0);
		}
		if (local25 != null) {
			return local25;
		}
		@Pc(38) Class254 local38 = this.aClass254_95;
		@Pc(47) byte[] local47;
		synchronized (this.aClass254_95) {
			local47 = this.aClass254_95.method6401(33, arg0);
		}
		local25 = new Class351();
		local25.aClass228_2 = this;
		if (local47 != null) {
			local25.method8265(new Class3_Sub7(local47));
		}
		local6 = this.aClass211_47;
		synchronized (this.aClass211_47) {
			this.aClass211_47.method5529((long) arg0, local25);
			return local25;
		}
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(B)V")
	public void method5846() {
		@Pc(6) Class211 local6 = this.aClass211_47;
		synchronized (this.aClass211_47) {
			this.aClass211_47.method5537();
		}
		local6 = this.aClass211_48;
		synchronized (this.aClass211_48) {
			this.aClass211_48.method5537();
		}
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(II)V")
	public void method5848() {
		@Pc(2) Class211 local2 = this.aClass211_47;
		synchronized (this.aClass211_47) {
			this.aClass211_47.method5538(5);
		}
		local2 = this.aClass211_48;
		synchronized (this.aClass211_48) {
			this.aClass211_48.method5538(5);
		}
	}

	@OriginalMember(owner = "client!nfa", name = "b", descriptor = "(I)V")
	public void method5849() {
		@Pc(6) Class211 local6 = this.aClass211_47;
		synchronized (this.aClass211_47) {
			this.aClass211_47.method5535();
		}
		local6 = this.aClass211_48;
		synchronized (this.aClass211_48) {
			this.aClass211_48.method5535();
		}
	}
}
