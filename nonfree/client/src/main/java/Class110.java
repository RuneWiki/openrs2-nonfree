import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public final class Class110 {

	@OriginalMember(owner = "client!fq", name = "h", descriptor = "Lclient!pca;")
	private final Class245 aClass245_30 = new Class245(64);

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "Lclient!jo;")
	private final Class168 aClass168_38;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lclient!jda;ILclient!jo;)V")
	public Class110(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class168 arg2) {
		this.aClass168_38 = arg2;
		this.aClass168_38.method4443(31);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IB)V")
	public void method2918() {
		@Pc(14) Class245 local14 = this.aClass245_30;
		synchronized (this.aClass245_30) {
			this.aClass245_30.method6083(5);
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(BI)Lclient!jn;")
	public Class167 method2921(@OriginalArg(1) int arg0) {
		@Pc(6) Class245 local6 = this.aClass245_30;
		@Pc(16) Class167 local16;
		synchronized (this.aClass245_30) {
			local16 = (Class167) this.aClass245_30.method6082((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class168 local34 = this.aClass168_38;
		@Pc(43) byte[] local43;
		synchronized (this.aClass168_38) {
			local43 = this.aClass168_38.method4435(arg0, 31);
		}
		local16 = new Class167();
		if (local43 != null) {
			local16.method4418(new Class6_Sub26(local43));
		}
		@Pc(65) Class245 local65 = this.aClass245_30;
		synchronized (this.aClass245_30) {
			this.aClass245_30.method6075(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)V")
	public void method2922() {
		@Pc(2) Class245 local2 = this.aClass245_30;
		synchronized (this.aClass245_30) {
			this.aClass245_30.method6076();
		}
	}

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(I)V")
	public void method2923() {
		@Pc(11) Class245 local11 = this.aClass245_30;
		synchronized (this.aClass245_30) {
			this.aClass245_30.method6079();
		}
	}
}
