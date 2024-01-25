import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class80 {

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "Lclient!hm;")
	private final Class136 aClass136_25 = new Class136(64);

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_26;

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
	public final int anInt2176;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lclient!bs;ILclient!pfa;)V")
	public Class80(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2) {
		this.aClass251_26 = arg2;
		this.anInt2176 = this.aClass251_26.method5768(19);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)Lclient!nda;")
	public Class216 method1993(@OriginalArg(1) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_25;
		@Pc(16) Class216 local16;
		synchronized (this.aClass136_25) {
			local16 = (Class216) this.aClass136_25.method3473((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class251 local29 = this.aClass251_26;
		@Pc(38) byte[] local38;
		synchronized (this.aClass251_26) {
			local38 = this.aClass251_26.method5772(arg0, 19);
		}
		local16 = new Class216();
		if (local38 != null) {
			local16.method5198(new Class6_Sub21(local38));
		}
		@Pc(60) Class136 local60 = this.aClass136_25;
		synchronized (this.aClass136_25) {
			this.aClass136_25.method3482((long) arg0, local16);
			return local16;
		}
	}
}
