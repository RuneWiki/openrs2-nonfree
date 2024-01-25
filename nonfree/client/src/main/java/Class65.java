import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public final class Class65 {

	@OriginalMember(owner = "client!cq", name = "g", descriptor = "Lclient!qj;")
	public final Class295 aClass295_6 = new Class295(20);

	@OriginalMember(owner = "client!cq", name = "o", descriptor = "Lclient!qj;")
	private final Class295 aClass295_7 = new Class295(64);

	@OriginalMember(owner = "client!cq", name = "f", descriptor = "Lclient!uq;")
	public final Class362 aClass362_19;

	@OriginalMember(owner = "client!cq", name = "n", descriptor = "Lclient!uq;")
	private final Class362 aClass362_20;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lclient!kw;ILclient!uq;Lclient!uq;)V")
	public Class65(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class362 arg2, @OriginalArg(3) Class362 arg3) {
		this.aClass362_19 = arg3;
		this.aClass362_20 = arg2;
		this.aClass362_20.method8355(46);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(BI)V")
	public void method1505() {
		@Pc(11) Class295 local11 = this.aClass295_7;
		synchronized (this.aClass295_7) {
			this.aClass295_7.method6462(5);
		}
		local11 = this.aClass295_6;
		synchronized (this.aClass295_6) {
			this.aClass295_6.method6462(5);
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)Lclient!ve;")
	public Class369 method1506(@OriginalArg(0) int arg0) {
		@Pc(6) Class295 local6 = this.aClass295_7;
		@Pc(16) Class369 local16;
		synchronized (this.aClass295_7) {
			local16 = (Class369) this.aClass295_7.method6470((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class362 local29 = this.aClass362_20;
		@Pc(38) byte[] local38;
		synchronized (this.aClass362_20) {
			local38 = this.aClass362_20.method8368(46, arg0);
		}
		local16 = new Class369();
		local16.aClass65_2 = this;
		if (local38 != null) {
			local16.method8584(new Class3_Sub4(local38));
		}
		@Pc(71) Class295 local71 = this.aClass295_7;
		synchronized (this.aClass295_7) {
			this.aClass295_7.method6469((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(I)V")
	public void method1507() {
		@Pc(6) Class295 local6 = this.aClass295_7;
		synchronized (this.aClass295_7) {
			this.aClass295_7.method6464();
		}
		local6 = this.aClass295_6;
		synchronized (this.aClass295_6) {
			this.aClass295_6.method6464();
		}
	}

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "(I)V")
	public void method1508() {
		@Pc(6) Class295 local6 = this.aClass295_7;
		synchronized (this.aClass295_7) {
			this.aClass295_7.method6474();
		}
		local6 = this.aClass295_6;
		synchronized (this.aClass295_6) {
			this.aClass295_6.method6474();
		}
	}
}
