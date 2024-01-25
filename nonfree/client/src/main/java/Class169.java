import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kba")
public final class Class169 {

	@OriginalMember(owner = "client!kba", name = "e", descriptor = "Lclient!hm;")
	private final Class136 aClass136_56 = new Class136(64);

	@OriginalMember(owner = "client!kba", name = "h", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_65;

	@OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(Lclient!bs;ILclient!pfa;)V")
	public Class169(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2) {
		this.aClass251_65 = arg2;
		this.aClass251_65.method5768(5);
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(II)Lclient!sw;")
	public Class6_Sub2_Sub17 method4257(@OriginalArg(0) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_56;
		@Pc(16) Class6_Sub2_Sub17 local16;
		synchronized (this.aClass136_56) {
			local16 = (Class6_Sub2_Sub17) this.aClass136_56.method3473((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class251 local29 = this.aClass251_65;
		@Pc(38) byte[] local38;
		synchronized (this.aClass251_65) {
			local38 = this.aClass251_65.method5772(arg0, 5);
		}
		local16 = new Class6_Sub2_Sub17();
		if (local38 != null) {
			local16.method6741(new Class6_Sub21(local38));
		}
		@Pc(65) Class136 local65 = this.aClass136_56;
		synchronized (this.aClass136_56) {
			this.aClass136_56.method3482((long) arg0, local16);
			return local16;
		}
	}
}
