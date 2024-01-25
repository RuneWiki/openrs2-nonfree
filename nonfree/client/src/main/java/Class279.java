import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class279 {

	@OriginalMember(owner = "client!re", name = "c", descriptor = "Lclient!me;")
	private final Class211 aClass211_54 = new Class211(64);

	@OriginalMember(owner = "client!re", name = "a", descriptor = "Lclient!pe;")
	private final Class254 aClass254_117;

	@OriginalMember(owner = "client!re", name = "d", descriptor = "I")
	public final int anInt8547;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lclient!vd;ILclient!pe;)V")
	public Class279(@OriginalArg(0) Class335 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2) {
		this.aClass254_117 = arg2;
		this.anInt8547 = this.aClass254_117.method6396(19);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ZI)Lclient!jc;")
	public Class166 method7005(@OriginalArg(1) int arg0) {
		@Pc(6) Class211 local6 = this.aClass211_54;
		@Pc(16) Class166 local16;
		synchronized (this.aClass211_54) {
			local16 = (Class166) this.aClass211_54.method5534((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class254 local29 = this.aClass254_117;
		@Pc(38) byte[] local38;
		synchronized (this.aClass254_117) {
			local38 = this.aClass254_117.method6401(19, arg0);
		}
		local16 = new Class166();
		if (local38 != null) {
			local16.method4093(new Class3_Sub7(local38));
		}
		@Pc(68) Class211 local68 = this.aClass211_54;
		synchronized (this.aClass211_54) {
			this.aClass211_54.method5529((long) arg0, local16);
			return local16;
		}
	}
}
