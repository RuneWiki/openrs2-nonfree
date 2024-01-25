import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mga")
public final class Class206 {

	@OriginalMember(owner = "client!mga", name = "e", descriptor = "Lclient!hm;")
	private final Class136 aClass136_64 = new Class136(64);

	@OriginalMember(owner = "client!mga", name = "j", descriptor = "I")
	public int anInt5693 = 0;

	@OriginalMember(owner = "client!mga", name = "f", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_74;

	@OriginalMember(owner = "client!mga", name = "c", descriptor = "I")
	public final int anInt5689;

	@OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(Lclient!bs;ILclient!pfa;)V")
	public Class206(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2) {
		this.aClass251_74 = arg2;
		this.anInt5689 = this.aClass251_74.method5768(4);
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(B)V")
	public void method4892() {
		@Pc(6) Class136 local6 = this.aClass136_64;
		synchronized (this.aClass136_64) {
			this.aClass136_64.method3476();
		}
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(II)Lclient!vi;")
	public Class345 method4893(@OriginalArg(1) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_64;
		@Pc(16) Class345 local16;
		synchronized (this.aClass136_64) {
			local16 = (Class345) this.aClass136_64.method3473((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class251 local29 = this.aClass251_74;
		@Pc(38) byte[] local38;
		synchronized (this.aClass251_74) {
			local38 = this.aClass251_74.method5772(arg0, 4);
		}
		local16 = new Class345();
		local16.aClass206_6 = this;
		local16.anInt9265 = arg0;
		if (local38 != null) {
			local16.method7581(new Class6_Sub21(local38));
		}
		local16.method7585();
		@Pc(69) Class136 local69 = this.aClass136_64;
		synchronized (this.aClass136_64) {
			this.aClass136_64.method3482((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!mga", name = "b", descriptor = "(I)V")
	public void method4894() {
		@Pc(10) Class136 local10 = this.aClass136_64;
		synchronized (this.aClass136_64) {
			this.aClass136_64.method3470();
		}
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(BI)V")
	public void method4895() {
		@Pc(2) Class136 local2 = this.aClass136_64;
		synchronized (this.aClass136_64) {
			this.aClass136_64.method3474(5);
		}
	}
}
