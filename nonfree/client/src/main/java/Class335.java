import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class335 {

	@OriginalMember(owner = "client!te", name = "g", descriptor = "Lclient!qj;")
	private final Class295 aClass295_61 = new Class295(64);

	@OriginalMember(owner = "client!te", name = "c", descriptor = "Lclient!uq;")
	private final Class362 aClass362_131;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!kw;ILclient!uq;)V")
	public Class335(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class362 arg2) {
		this.aClass362_131 = arg2;
		if (this.aClass362_131 != null) {
			this.aClass362_131.method8355(11);
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(II)Lclient!pga;")
	public Class281 method7504(@OriginalArg(0) int arg0) {
		@Pc(6) Class295 local6 = this.aClass295_61;
		@Pc(16) Class281 local16;
		synchronized (this.aClass295_61) {
			local16 = (Class281) this.aClass295_61.method6470((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class362 local29 = this.aClass362_131;
		@Pc(38) byte[] local38;
		synchronized (this.aClass362_131) {
			local38 = this.aClass362_131.method8368(11, arg0);
		}
		local16 = new Class281();
		if (local38 != null) {
			local16.method6172(new Class3_Sub4(local38));
		}
		@Pc(65) Class295 local65 = this.aClass295_61;
		synchronized (this.aClass295_61) {
			this.aClass295_61.method6469((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(II)V")
	public void method7505() {
		@Pc(2) Class295 local2 = this.aClass295_61;
		synchronized (this.aClass295_61) {
			this.aClass295_61.method6462(5);
		}
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V")
	public void method7507() {
		@Pc(7) Class295 local7 = this.aClass295_61;
		synchronized (this.aClass295_61) {
			this.aClass295_61.method6464();
		}
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(I)V")
	public void method7509() {
		@Pc(6) Class295 local6 = this.aClass295_61;
		synchronized (this.aClass295_61) {
			this.aClass295_61.method6474();
		}
	}
}
