import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class294 {

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "Lclient!pca;")
	private final Class245 aClass245_60 = new Class245(64);

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "Lclient!jo;")
	private final Class168 aClass168_111;

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
	public final int anInt8756;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lclient!jda;ILclient!jo;)V")
	public Class294(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class168 arg2) {
		this.aClass168_111 = arg2;
		if (this.aClass168_111 == null) {
			this.anInt8756 = 0;
		} else {
			this.anInt8756 = this.aClass168_111.method4443(16);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
	public void method7329() {
		@Pc(2) Class245 local2 = this.aClass245_60;
		synchronized (this.aClass245_60) {
			this.aClass245_60.method6076();
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
	public void method7330() {
		@Pc(2) Class245 local2 = this.aClass245_60;
		synchronized (this.aClass245_60) {
			this.aClass245_60.method6079();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)V")
	public void method7332() {
		@Pc(6) Class245 local6 = this.aClass245_60;
		synchronized (this.aClass245_60) {
			this.aClass245_60.method6083(5);
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)Lclient!lv;")
	public Class208 method7334(@OriginalArg(1) int arg0) {
		@Pc(6) Class245 local6 = this.aClass245_60;
		@Pc(16) Class208 local16;
		synchronized (this.aClass245_60) {
			local16 = (Class208) this.aClass245_60.method6082((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class168 local29 = this.aClass168_111;
		@Pc(38) byte[] local38;
		synchronized (this.aClass168_111) {
			local38 = this.aClass168_111.method4435(arg0, 16);
		}
		local16 = new Class208();
		if (local38 != null) {
			local16.method5017(new Class6_Sub26(local38));
		}
		@Pc(60) Class245 local60 = this.aClass245_60;
		synchronized (this.aClass245_60) {
			this.aClass245_60.method6075(local16, (long) arg0);
			return local16;
		}
	}
}
