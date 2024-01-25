import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class319 {

	@OriginalMember(owner = "client!se", name = "j", descriptor = "Lclient!qj;")
	private final Class295 aClass295_56 = new Class295(64);

	@OriginalMember(owner = "client!se", name = "l", descriptor = "Lclient!uq;")
	private final Class362 aClass362_121;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lclient!kw;ILclient!uq;)V")
	public Class319(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class362 arg2) {
		this.aClass362_121 = arg2;
		if (this.aClass362_121 != null) {
			this.aClass362_121.method8355(54);
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
	public void method6992() {
		@Pc(6) Class295 local6 = this.aClass295_56;
		synchronized (this.aClass295_56) {
			this.aClass295_56.method6474();
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(II)V")
	public void method6993() {
		@Pc(2) Class295 local2 = this.aClass295_56;
		synchronized (this.aClass295_56) {
			this.aClass295_56.method6462(5);
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(Z)V")
	public void method6995() {
		@Pc(6) Class295 local6 = this.aClass295_56;
		synchronized (this.aClass295_56) {
			this.aClass295_56.method6464();
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(II)Lclient!fv;")
	public Class120 method6997(@OriginalArg(0) int arg0) {
		@Pc(6) Class295 local6 = this.aClass295_56;
		@Pc(16) Class120 local16;
		synchronized (this.aClass295_56) {
			local16 = (Class120) this.aClass295_56.method6470((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class362 local29 = this.aClass362_121;
		@Pc(40) byte[] local40;
		synchronized (this.aClass362_121) {
			local40 = this.aClass362_121.method8368(54, arg0);
		}
		local16 = new Class120();
		if (local40 != null) {
			local16.method2868(new Class3_Sub4(local40));
		}
		@Pc(70) Class295 local70 = this.aClass295_56;
		synchronized (this.aClass295_56) {
			this.aClass295_56.method6469((long) arg0, local16);
			return local16;
		}
	}
}
