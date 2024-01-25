import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class205 {

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "Lclient!pca;")
	private final Class245 aClass245_46 = new Class245(64);

	@OriginalMember(owner = "client!lq", name = "l", descriptor = "Lclient!pca;")
	public final Class245 aClass245_47 = new Class245(2);

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "Lclient!jo;")
	private final Class168 aClass168_73;

	@OriginalMember(owner = "client!lq", name = "i", descriptor = "Lclient!jo;")
	public final Class168 aClass168_74;

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lclient!jda;ILclient!jo;Lclient!jo;)V")
	public Class205(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class168 arg2, @OriginalArg(3) Class168 arg3) {
		this.aClass168_73 = arg2;
		this.aClass168_74 = arg3;
		this.aClass168_73.method4443(33);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(BI)Lclient!tk;")
	public Class301 method4917(@OriginalArg(1) int arg0) {
		@Pc(6) Class245 local6 = this.aClass245_46;
		@Pc(16) Class301 local16;
		synchronized (this.aClass245_46) {
			local16 = (Class301) this.aClass245_46.method6082((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class168 local29 = this.aClass168_73;
		@Pc(38) byte[] local38;
		synchronized (this.aClass168_73) {
			local38 = this.aClass168_73.method4435(arg0, 33);
		}
		local16 = new Class301();
		local16.aClass205_2 = this;
		if (local38 != null) {
			local16.method7377(new Class6_Sub26(local38));
		}
		@Pc(63) Class245 local63 = this.aClass245_46;
		synchronized (this.aClass245_46) {
			this.aClass245_46.method6075(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)V")
	public void method4918() {
		@Pc(2) Class245 local2 = this.aClass245_46;
		synchronized (this.aClass245_46) {
			this.aClass245_46.method6083(5);
		}
		@Pc(30) Class245 local30 = this.aClass245_47;
		synchronized (this.aClass245_47) {
			this.aClass245_47.method6083(5);
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)V")
	public void method4920() {
		@Pc(2) Class245 local2 = this.aClass245_46;
		synchronized (this.aClass245_46) {
			this.aClass245_46.method6079();
		}
		local2 = this.aClass245_47;
		synchronized (this.aClass245_47) {
			this.aClass245_47.method6079();
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V")
	public void method4922() {
		@Pc(10) Class245 local10 = this.aClass245_46;
		synchronized (this.aClass245_46) {
			this.aClass245_46.method6076();
		}
		local10 = this.aClass245_47;
		synchronized (this.aClass245_47) {
			this.aClass245_47.method6076();
		}
	}
}
