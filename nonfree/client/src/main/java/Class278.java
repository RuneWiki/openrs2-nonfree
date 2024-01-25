import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class278 {

	@OriginalMember(owner = "client!rm", name = "q", descriptor = "I")
	public int anInt8191;

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "Lclient!pca;")
	private final Class245 aClass245_56 = new Class245(64);

	@OriginalMember(owner = "client!rm", name = "p", descriptor = "Lclient!pca;")
	public final Class245 aClass245_57 = new Class245(30);

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "Lclient!jo;")
	private final Class168 aClass168_100;

	@OriginalMember(owner = "client!rm", name = "i", descriptor = "Lclient!jo;")
	public final Class168 aClass168_101;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lclient!jda;ILclient!jo;Lclient!jo;)V")
	public Class278(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class168 arg2, @OriginalArg(3) Class168 arg3) {
		this.aClass168_100 = arg2;
		this.aClass168_101 = arg3;
		@Pc(26) int local26 = this.aClass168_100.method4456() - 1;
		this.aClass168_100.method4443(local26);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(BI)Lclient!mg;")
	public Class212 method6826(@OriginalArg(1) int arg0) {
		@Pc(6) Class245 local6 = this.aClass245_56;
		@Pc(16) Class212 local16;
		synchronized (this.aClass245_56) {
			local16 = (Class212) this.aClass245_56.method6082((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class168 local29 = this.aClass168_100;
		@Pc(42) byte[] local42;
		synchronized (this.aClass168_100) {
			local42 = this.aClass168_100.method4435(Static578.method8148(arg0), Static137.method2578(arg0));
		}
		local16 = new Class212();
		local16.aClass278_1 = this;
		local16.anInt6057 = arg0;
		if (local42 != null) {
			local16.method5189(new Class6_Sub26(local42));
		}
		@Pc(78) Class245 local78 = this.aClass245_56;
		synchronized (this.aClass245_56) {
			this.aClass245_56.method6075(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V")
	public void method6829() {
		@Pc(6) Class245 local6 = this.aClass245_56;
		synchronized (this.aClass245_56) {
			this.aClass245_56.method6076();
		}
		local6 = this.aClass245_57;
		synchronized (this.aClass245_57) {
			this.aClass245_57.method6076();
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)V")
	public void method6830(@OriginalArg(1) int arg0) {
		this.anInt8191 = arg0;
		@Pc(9) Class245 local9 = this.aClass245_57;
		synchronized (this.aClass245_57) {
			this.aClass245_57.method6079();
		}
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)V")
	public void method6834() {
		@Pc(2) Class245 local2 = this.aClass245_56;
		synchronized (this.aClass245_56) {
			this.aClass245_56.method6079();
		}
		local2 = this.aClass245_57;
		synchronized (this.aClass245_57) {
			this.aClass245_57.method6079();
		}
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(II)V")
	public void method6835() {
		@Pc(2) Class245 local2 = this.aClass245_56;
		synchronized (this.aClass245_56) {
			this.aClass245_56.method6083(5);
		}
		local2 = this.aClass245_57;
		synchronized (this.aClass245_57) {
			this.aClass245_57.method6083(5);
		}
	}
}
