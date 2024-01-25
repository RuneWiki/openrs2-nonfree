import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class25 {

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "Lclient!pca;")
	private final Class245 aClass245_11 = new Class245(128);

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "Lclient!jo;")
	private final Class168 aClass168_14;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lclient!jda;ILclient!jo;)V")
	public Class25(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class168 arg2) {
		this.aClass168_14 = arg2;
		this.aClass168_14.method4443(1);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
	public void method982() {
		@Pc(14) Class245 local14 = this.aClass245_11;
		synchronized (this.aClass245_11) {
			this.aClass245_11.method6079();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)V")
	public void method986() {
		@Pc(11) Class245 local11 = this.aClass245_11;
		synchronized (this.aClass245_11) {
			this.aClass245_11.method6083(5);
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)Lclient!bda;")
	public Class28 method987(@OriginalArg(1) int arg0) {
		@Pc(6) Class245 local6 = this.aClass245_11;
		@Pc(16) Class28 local16;
		synchronized (this.aClass245_11) {
			local16 = (Class28) this.aClass245_11.method6082((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class168 local29 = this.aClass168_14;
		@Pc(38) byte[] local38;
		synchronized (this.aClass168_14) {
			local38 = this.aClass168_14.method4435(arg0, 1);
		}
		local16 = new Class28();
		if (local38 != null) {
			local16.method998(new Class6_Sub26(local38));
		}
		@Pc(60) Class245 local60 = this.aClass245_11;
		synchronized (this.aClass245_11) {
			this.aClass245_11.method6075(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
	public void method988() {
		@Pc(6) Class245 local6 = this.aClass245_11;
		synchronized (this.aClass245_11) {
			this.aClass245_11.method6076();
		}
	}
}
