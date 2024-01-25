import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sea")
public final class Class320 {

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "Lclient!qj;")
	private final Class295 aClass295_57 = new Class295(64);

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "Lclient!uq;")
	private final Class362 aClass362_123;

	@OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(Lclient!kw;ILclient!uq;)V")
	public Class320(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class362 arg2) {
		this.aClass362_123 = arg2;
		this.aClass362_123.method8355(31);
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(I)V")
	public void method6998() {
		@Pc(6) Class295 local6 = this.aClass295_57;
		synchronized (this.aClass295_57) {
			this.aClass295_57.method6474();
		}
	}

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "(I)V")
	public void method6999() {
		@Pc(2) Class295 local2 = this.aClass295_57;
		synchronized (this.aClass295_57) {
			this.aClass295_57.method6464();
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(IB)V")
	public void method7001() {
		@Pc(2) Class295 local2 = this.aClass295_57;
		synchronized (this.aClass295_57) {
			this.aClass295_57.method6462(5);
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(ZI)Lclient!ur;")
	public Class363 method7002(@OriginalArg(1) int arg0) {
		@Pc(6) Class295 local6 = this.aClass295_57;
		@Pc(16) Class363 local16;
		synchronized (this.aClass295_57) {
			local16 = (Class363) this.aClass295_57.method6470((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class362 local29 = this.aClass362_123;
		@Pc(38) byte[] local38;
		synchronized (this.aClass362_123) {
			local38 = this.aClass362_123.method8368(31, arg0);
		}
		local16 = new Class363();
		if (local38 != null) {
			local16.method8379(new Class3_Sub4(local38));
		}
		@Pc(68) Class295 local68 = this.aClass295_57;
		synchronized (this.aClass295_57) {
			this.aClass295_57.method6469((long) arg0, local16);
			return local16;
		}
	}
}
