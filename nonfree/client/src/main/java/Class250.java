import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class250 {

	@OriginalMember(owner = "client!pl", name = "f", descriptor = "Lclient!pca;")
	private final Class245 aClass245_55 = new Class245(64);

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "Lclient!jo;")
	private final Class168 aClass168_93;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lclient!jda;ILclient!jo;)V")
	public Class250(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class168 arg2) {
		this.aClass168_93 = arg2;
		this.aClass168_93.method4443(32);
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
	public void method6262() {
		@Pc(2) Class245 local2 = this.aClass245_55;
		synchronized (this.aClass245_55) {
			this.aClass245_55.method6076();
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)V")
	public void method6263() {
		@Pc(2) Class245 local2 = this.aClass245_55;
		synchronized (this.aClass245_55) {
			this.aClass245_55.method6083(5);
		}
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(II)Lclient!jq;")
	public Class169 method6264(@OriginalArg(0) int arg0) {
		@Pc(6) Class245 local6 = this.aClass245_55;
		@Pc(16) Class169 local16;
		synchronized (this.aClass245_55) {
			local16 = (Class169) this.aClass245_55.method6082((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class168 local37 = this.aClass168_93;
		@Pc(46) byte[] local46;
		synchronized (this.aClass168_93) {
			local46 = this.aClass168_93.method4435(arg0, 32);
		}
		local16 = new Class169();
		if (local46 != null) {
			local16.method4460(new Class6_Sub26(local46));
		}
		@Pc(68) Class245 local68 = this.aClass245_55;
		synchronized (this.aClass245_55) {
			this.aClass245_55.method6075(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(Z)V")
	public void method6268() {
		@Pc(6) Class245 local6 = this.aClass245_55;
		synchronized (this.aClass245_55) {
			this.aClass245_55.method6079();
		}
	}
}
