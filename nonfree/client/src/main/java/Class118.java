import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class118 {

	@OriginalMember(owner = "client!gm", name = "k", descriptor = "Lclient!pca;")
	private final Class245 aClass245_32 = new Class245(64);

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "Lclient!jo;")
	private final Class168 aClass168_45;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lclient!jda;ILclient!jo;)V")
	public Class118(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class168 arg2) {
		this.aClass168_45 = arg2;
		if (this.aClass168_45 != null) {
			this.aClass168_45.method4443(11);
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)V")
	public void method3495() {
		@Pc(11) Class245 local11 = this.aClass245_32;
		synchronized (this.aClass245_32) {
			this.aClass245_32.method6083(5);
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
	public void method3496() {
		@Pc(6) Class245 local6 = this.aClass245_32;
		synchronized (this.aClass245_32) {
			this.aClass245_32.method6079();
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZI)Lclient!ew;")
	public Class99 method3497(@OriginalArg(1) int arg0) {
		@Pc(6) Class245 local6 = this.aClass245_32;
		@Pc(16) Class99 local16;
		synchronized (this.aClass245_32) {
			local16 = (Class99) this.aClass245_32.method6082((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class168 local29 = this.aClass168_45;
		@Pc(38) byte[] local38;
		synchronized (this.aClass168_45) {
			local38 = this.aClass168_45.method4435(arg0, 11);
		}
		local16 = new Class99();
		if (local38 != null) {
			local16.method2525(new Class6_Sub26(local38));
		}
		@Pc(66) Class245 local66 = this.aClass245_32;
		synchronized (this.aClass245_32) {
			this.aClass245_32.method6075(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)V")
	public void method3498() {
		@Pc(6) Class245 local6 = this.aClass245_32;
		synchronized (this.aClass245_32) {
			this.aClass245_32.method6076();
		}
	}
}
