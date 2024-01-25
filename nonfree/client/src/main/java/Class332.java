import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class332 {

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "Lclient!qj;")
	private final Class295 aClass295_60 = new Class295(16);

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "Lclient!uq;")
	private final Class362 aClass362_130;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lclient!kw;ILclient!uq;)V")
	public Class332(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class362 arg2) {
		this.aClass362_130 = arg2;
		this.aClass362_130.method8355(30);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
	public void method7476() {
		@Pc(10) Class295 local10 = this.aClass295_60;
		synchronized (this.aClass295_60) {
			this.aClass295_60.method6464();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
	public void method7477() {
		@Pc(8) Class295 local8 = this.aClass295_60;
		synchronized (this.aClass295_60) {
			this.aClass295_60.method6474();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)Lclient!mh;")
	public Class228 method7478(@OriginalArg(0) int arg0) {
		@Pc(6) Class295 local6 = this.aClass295_60;
		@Pc(16) Class228 local16;
		synchronized (this.aClass295_60) {
			local16 = (Class228) this.aClass295_60.method6470((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class362 local37 = this.aClass362_130;
		@Pc(46) byte[] local46;
		synchronized (this.aClass362_130) {
			local46 = this.aClass362_130.method8368(30, arg0);
		}
		local16 = new Class228();
		if (local46 != null) {
			local16.method5270(new Class3_Sub4(local46));
		}
		@Pc(68) Class295 local68 = this.aClass295_60;
		synchronized (this.aClass295_60) {
			this.aClass295_60.method6469((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(II)V")
	public void method7481() {
		@Pc(2) Class295 local2 = this.aClass295_60;
		synchronized (this.aClass295_60) {
			this.aClass295_60.method6462(5);
		}
	}
}
