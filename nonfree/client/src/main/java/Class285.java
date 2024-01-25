import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class285 {

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "Lclient!pca;")
	private final Class245 aClass245_58 = new Class245(64);

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "Lclient!jo;")
	private final Class168 aClass168_107;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "Lclient!jo;")
	public final Class168 aClass168_106;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lclient!jda;ILclient!jo;Lclient!jo;)V")
	public Class285(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class168 arg2, @OriginalArg(3) Class168 arg3) {
		this.aClass168_107 = arg2;
		this.aClass168_106 = arg3;
		this.aClass168_107.method4443(3);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
	public void method7161() {
		@Pc(2) Class245 local2 = this.aClass245_58;
		synchronized (this.aClass245_58) {
			this.aClass245_58.method6079();
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IB)Lclient!th;")
	public Class300 method7162(@OriginalArg(0) int arg0) {
		@Pc(6) Class245 local6 = this.aClass245_58;
		@Pc(16) Class300 local16;
		synchronized (this.aClass245_58) {
			local16 = (Class300) this.aClass245_58.method6082((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class168 local29 = this.aClass168_107;
		@Pc(44) byte[] local44;
		synchronized (this.aClass168_107) {
			local44 = this.aClass168_107.method4435(arg0, 3);
		}
		local16 = new Class300();
		local16.aClass285_1 = this;
		if (local44 != null) {
			local16.method7376(new Class6_Sub26(local44));
		}
		@Pc(69) Class245 local69 = this.aClass245_58;
		synchronized (this.aClass245_58) {
			this.aClass245_58.method6075(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(IB)V")
	public void method7164() {
		@Pc(2) Class245 local2 = this.aClass245_58;
		synchronized (this.aClass245_58) {
			this.aClass245_58.method6083(5);
		}
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V")
	public void method7165() {
		@Pc(11) Class245 local11 = this.aClass245_58;
		synchronized (this.aClass245_58) {
			this.aClass245_58.method6076();
		}
	}
}
