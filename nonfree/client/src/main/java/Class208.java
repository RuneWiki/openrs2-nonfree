import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class Class208 {

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "Lclient!hm;")
	private final Class136 aClass136_66 = new Class136(64);

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_76;

	@OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
	public final int anInt5718;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!bs;ILclient!pfa;)V")
	public Class208(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2) {
		this.aClass251_76 = arg2;
		if (this.aClass251_76 == null) {
			this.anInt5718 = 0;
		} else {
			this.anInt5718 = this.aClass251_76.method5768(16);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
	public void method4918() {
		@Pc(2) Class136 local2 = this.aClass136_66;
		synchronized (this.aClass136_66) {
			this.aClass136_66.method3476();
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)Lclient!ug;")
	public Class334 method4919(@OriginalArg(0) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_66;
		@Pc(16) Class334 local16;
		synchronized (this.aClass136_66) {
			local16 = (Class334) this.aClass136_66.method3473((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class251 local29 = this.aClass251_76;
		@Pc(38) byte[] local38;
		synchronized (this.aClass251_76) {
			local38 = this.aClass251_76.method5772(arg0, 16);
		}
		local16 = new Class334();
		if (local38 != null) {
			local16.method7240(new Class6_Sub21(local38));
		}
		@Pc(62) Class136 local62 = this.aClass136_66;
		synchronized (this.aClass136_66) {
			this.aClass136_66.method3482((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(II)V")
	public void method4920() {
		@Pc(2) Class136 local2 = this.aClass136_66;
		synchronized (this.aClass136_66) {
			this.aClass136_66.method3474(5);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Z)V")
	public void method4921() {
		@Pc(8) Class136 local8 = this.aClass136_66;
		synchronized (this.aClass136_66) {
			this.aClass136_66.method3470();
		}
	}
}
