import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nfa")
public final class Class218 {

	@OriginalMember(owner = "client!nfa", name = "g", descriptor = "Lclient!hm;")
	private final Class136 aClass136_72 = new Class136(64);

	@OriginalMember(owner = "client!nfa", name = "b", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_82;

	@OriginalMember(owner = "client!nfa", name = "e", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_83;

	@OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(ILclient!pfa;Lclient!pfa;)V")
	public Class218(@OriginalArg(0) int arg0, @OriginalArg(1) Class251 arg1, @OriginalArg(2) Class251 arg2) {
		this.aClass251_82 = arg1;
		this.aClass251_83 = arg2;
		if (this.aClass251_82 != null) {
			this.aClass251_82.method5768(0);
		}
		if (this.aClass251_83 != null) {
			this.aClass251_83.method5768(0);
		}
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(II)Lclient!kv;")
	public Class6_Sub2_Sub12 method5246(@OriginalArg(1) int arg0) {
		@Pc(11) Class6_Sub2_Sub12 local11 = (Class6_Sub2_Sub12) this.aClass136_72.method3473((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 < 32768) {
			local27 = this.aClass251_82.method5772(arg0, 0);
		} else {
			local27 = this.aClass251_83.method5772(arg0 & 0x7FFF, 0);
		}
		local11 = new Class6_Sub2_Sub12();
		if (local27 != null) {
			local11.method4513(new Class6_Sub21(local27));
		}
		if (arg0 >= 32768) {
			local11.method4511();
		}
		this.aClass136_72.method3482((long) arg0, local11);
		return local11;
	}
}
