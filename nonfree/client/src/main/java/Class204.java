import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class204 {

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "Lclient!wm;")
	private final Class267 aClass267_58 = new Class267(64);

	@OriginalMember(owner = "client!qr", name = "e", descriptor = "Lclient!ph;")
	private final Class187 aClass187_101;

	static {
		new Class182("Adventurer", "Abenteurer", "Aventurier", "Aventureiro");
	}

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lclient!kp;ILclient!ph;)V")
	public Class204(@OriginalArg(0) Class147 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class187 arg2) {
		this.aClass187_101 = arg2;
		if (this.aClass187_101 != null) {
			this.aClass187_101.method4306(11);
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)Lclient!ll;")
	public Class155 method4526(@OriginalArg(0) int arg0) {
		@Pc(14) Class267 local14 = this.aClass267_58;
		@Pc(24) Class155 local24;
		synchronized (this.aClass267_58) {
			local24 = (Class155) this.aClass267_58.method6014((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class187 local37 = this.aClass187_101;
		@Pc(46) byte[] local46;
		synchronized (this.aClass187_101) {
			local46 = this.aClass187_101.method4300(11, arg0);
		}
		local24 = new Class155();
		if (local46 != null) {
			local24.method3451(new Class10_Sub8(local46));
		}
		@Pc(68) Class267 local68 = this.aClass267_58;
		synchronized (this.aClass267_58) {
			this.aClass267_58.method6008(local24, (long) arg0);
			return local24;
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V")
	public void method4527() {
		@Pc(2) Class267 local2 = this.aClass267_58;
		synchronized (this.aClass267_58) {
			this.aClass267_58.method6013();
		}
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(II)V")
	public void method4528() {
		@Pc(2) Class267 local2 = this.aClass267_58;
		synchronized (this.aClass267_58) {
			this.aClass267_58.method6007(5);
		}
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)V")
	public void method4530() {
		@Pc(14) Class267 local14 = this.aClass267_58;
		synchronized (this.aClass267_58) {
			this.aClass267_58.method6011();
		}
	}
}
