import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ffa")
public final class Class114 {

	@OriginalMember(owner = "client!ffa", name = "i", descriptor = "Lclient!qj;")
	private final Class295 aClass295_12 = new Class295(64);

	@OriginalMember(owner = "client!ffa", name = "j", descriptor = "Lclient!uq;")
	public final Class362 aClass362_35;

	@OriginalMember(owner = "client!ffa", name = "c", descriptor = "Lclient!uq;")
	private final Class362 aClass362_34;

	@OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(Lclient!kw;ILclient!uq;Lclient!uq;)V")
	public Class114(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class362 arg2, @OriginalArg(3) Class362 arg3) {
		this.aClass362_35 = arg3;
		this.aClass362_34 = arg2;
		this.aClass362_34.method8355(3);
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I)V")
	public void method2606() {
		@Pc(6) Class295 local6 = this.aClass295_12;
		synchronized (this.aClass295_12) {
			this.aClass295_12.method6464();
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(II)Lclient!ca;")
	public Class45 method2607(@OriginalArg(1) int arg0) {
		@Pc(6) Class295 local6 = this.aClass295_12;
		@Pc(16) Class45 local16;
		synchronized (this.aClass295_12) {
			local16 = (Class45) this.aClass295_12.method6470((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class362 local29 = this.aClass362_34;
		@Pc(38) byte[] local38;
		synchronized (this.aClass362_34) {
			local38 = this.aClass362_34.method8368(3, arg0);
		}
		local16 = new Class45();
		local16.aClass114_1 = this;
		if (local38 != null) {
			local16.method1156(new Class3_Sub4(local38));
		}
		@Pc(63) Class295 local63 = this.aClass295_12;
		synchronized (this.aClass295_12) {
			this.aClass295_12.method6469((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ZI)V")
	public void method2608() {
		@Pc(2) Class295 local2 = this.aClass295_12;
		synchronized (this.aClass295_12) {
			this.aClass295_12.method6462(5);
		}
	}

	@OriginalMember(owner = "client!ffa", name = "c", descriptor = "(I)V")
	public void method2610() {
		@Pc(6) Class295 local6 = this.aClass295_12;
		synchronized (this.aClass295_12) {
			this.aClass295_12.method6474();
		}
	}
}
