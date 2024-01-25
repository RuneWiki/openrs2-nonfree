import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class303 {

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "Lclient!qj;")
	private final Class295 aClass295_51 = new Class295(64);

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "Lclient!uq;")
	private final Class362 aClass362_109;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lclient!kw;ILclient!uq;)V")
	public Class303(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class362 arg2) {
		this.aClass362_109 = arg2;
		if (this.aClass362_109 != null) {
			this.aClass362_109.method8355(35);
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
	public void method6666() {
		@Pc(13) Class295 local13 = this.aClass295_51;
		synchronized (this.aClass295_51) {
			this.aClass295_51.method6474();
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)V")
	public void method6667() {
		@Pc(2) Class295 local2 = this.aClass295_51;
		synchronized (this.aClass295_51) {
			this.aClass295_51.method6462(5);
		}
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)V")
	public void method6669() {
		@Pc(6) Class295 local6 = this.aClass295_51;
		synchronized (this.aClass295_51) {
			this.aClass295_51.method6464();
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IB)Lclient!be;")
	public Class28 method6672(@OriginalArg(0) int arg0) {
		@Pc(6) Class295 local6 = this.aClass295_51;
		@Pc(16) Class28 local16;
		synchronized (this.aClass295_51) {
			local16 = (Class28) this.aClass295_51.method6470((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class362 local29 = this.aClass362_109;
		@Pc(38) byte[] local38;
		synchronized (this.aClass362_109) {
			local38 = this.aClass362_109.method8368(35, arg0);
		}
		local16 = new Class28();
		if (local38 != null) {
			local16.method756(new Class3_Sub4(local38));
		}
		local16.method754();
		@Pc(63) Class295 local63 = this.aClass295_51;
		synchronized (this.aClass295_51) {
			this.aClass295_51.method6469((long) arg0, local16);
			return local16;
		}
	}
}
