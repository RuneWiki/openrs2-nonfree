import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jfa")
public final class Class165 {

	@OriginalMember(owner = "client!jfa", name = "d", descriptor = "Lclient!pca;")
	private final Class245 aClass245_40 = new Class245(64);

	@OriginalMember(owner = "client!jfa", name = "h", descriptor = "Lclient!jo;")
	private final Class168 aClass168_62;

	@OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(Lclient!jda;ILclient!jo;)V")
	public Class165(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class168 arg2) {
		this.aClass168_62 = arg2;
		if (this.aClass168_62 != null) {
			this.aClass168_62.method4443(35);
		}
	}

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "(B)V")
	public void method4281() {
		@Pc(2) Class245 local2 = this.aClass245_40;
		synchronized (this.aClass245_40) {
			this.aClass245_40.method6079();
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(II)Lclient!eb;")
	public Class80 method4282(@OriginalArg(1) int arg0) {
		@Pc(6) Class245 local6 = this.aClass245_40;
		@Pc(16) Class80 local16;
		synchronized (this.aClass245_40) {
			local16 = (Class80) this.aClass245_40.method6082((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class168 local29 = this.aClass168_62;
		@Pc(38) byte[] local38;
		synchronized (this.aClass168_62) {
			local38 = this.aClass168_62.method4435(arg0, 35);
		}
		local16 = new Class80();
		if (local38 != null) {
			local16.method2207(new Class6_Sub26(local38));
		}
		local16.method2210();
		@Pc(63) Class245 local63 = this.aClass245_40;
		synchronized (this.aClass245_40) {
			this.aClass245_40.method6075(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "(II)V")
	public void method4284() {
		@Pc(14) Class245 local14 = this.aClass245_40;
		synchronized (this.aClass245_40) {
			this.aClass245_40.method6083(5);
		}
	}

	@OriginalMember(owner = "client!jfa", name = "c", descriptor = "(B)V")
	public void method4286() {
		@Pc(6) Class245 local6 = this.aClass245_40;
		synchronized (this.aClass245_40) {
			this.aClass245_40.method6076();
		}
	}
}
