import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class226 {

	@OriginalMember(owner = "client!ni", name = "l", descriptor = "Lclient!pca;")
	private Class245 aClass245_49 = new Class245(64);

	@OriginalMember(owner = "client!ni", name = "n", descriptor = "Lclient!pca;")
	public Class245 aClass245_50 = new Class245(64);

	@OriginalMember(owner = "client!ni", name = "i", descriptor = "Lclient!jo;")
	public final Class168 aClass168_85;

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "Lclient!jo;")
	private final Class168 aClass168_84;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lclient!jda;ILclient!jo;Lclient!jo;)V")
	public Class226(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class168 arg2, @OriginalArg(3) Class168 arg3) {
		this.aClass168_85 = arg3;
		this.aClass168_84 = arg2;
		this.aClass168_84.method4443(34);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZI)Lclient!we;")
	public Class344 method5636(@OriginalArg(1) int arg0) {
		@Pc(6) Class245 local6 = this.aClass245_49;
		@Pc(16) Class344 local16;
		synchronized (this.aClass245_49) {
			local16 = (Class344) this.aClass245_49.method6082((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class168 local35 = this.aClass168_84;
		@Pc(44) byte[] local44;
		synchronized (this.aClass168_84) {
			local44 = this.aClass168_84.method4435(arg0, 34);
		}
		local16 = new Class344();
		local16.aClass226_4 = this;
		if (local44 != null) {
			local16.method8001(new Class6_Sub26(local44));
		}
		@Pc(69) Class245 local69 = this.aClass245_49;
		synchronized (this.aClass245_49) {
			this.aClass245_49.method6075(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)V")
	public void method5637() {
		@Pc(6) Class245 local6 = this.aClass245_49;
		synchronized (this.aClass245_49) {
			this.aClass245_49.method6083(5);
		}
		local6 = this.aClass245_50;
		synchronized (this.aClass245_50) {
			this.aClass245_50.method6083(5);
		}
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
	public void method5640() {
		@Pc(6) Class245 local6 = this.aClass245_49;
		synchronized (this.aClass245_49) {
			this.aClass245_49.method6079();
		}
		local6 = this.aClass245_50;
		synchronized (this.aClass245_50) {
			this.aClass245_50.method6079();
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
	public void method5641() {
		@Pc(6) Class245 local6 = this.aClass245_49;
		synchronized (this.aClass245_49) {
			this.aClass245_49.method6076();
		}
		local6 = this.aClass245_50;
		synchronized (this.aClass245_50) {
			this.aClass245_50.method6076();
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(III)V")
	public void method5642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass245_49 = new Class245(arg0);
		this.aClass245_50 = new Class245(arg1);
	}
}
