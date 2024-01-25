import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class33 {

	@OriginalMember(owner = "client!br", name = "h", descriptor = "Lclient!vi;")
	private final Class332 aClass332_23 = new Class332(64);

	@OriginalMember(owner = "client!br", name = "o", descriptor = "Lclient!vi;")
	public final Class332 aClass332_24 = new Class332(2);

	@OriginalMember(owner = "client!br", name = "c", descriptor = "Lclient!pq;")
	public final Class251 aClass251_15;

	@OriginalMember(owner = "client!br", name = "f", descriptor = "Lclient!pq;")
	private final Class251 aClass251_16;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!uea;ILclient!pq;Lclient!pq;)V")
	public Class33(@OriginalArg(0) Class314 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2, @OriginalArg(3) Class251 arg3) {
		this.aClass251_15 = arg3;
		this.aClass251_16 = arg2;
		this.aClass251_16.method5849(33);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V")
	public void method594() {
		@Pc(6) Class332 local6 = this.aClass332_23;
		synchronized (this.aClass332_23) {
			this.aClass332_23.method7512();
		}
		local6 = this.aClass332_24;
		synchronized (this.aClass332_24) {
			this.aClass332_24.method7512();
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(B)V")
	public void method597() {
		@Pc(6) Class332 local6 = this.aClass332_23;
		synchronized (this.aClass332_23) {
			this.aClass332_23.method7510();
		}
		local6 = this.aClass332_24;
		synchronized (this.aClass332_24) {
			this.aClass332_24.method7510();
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(BI)V")
	public void method599() {
		@Pc(2) Class332 local2 = this.aClass332_23;
		synchronized (this.aClass332_23) {
			this.aClass332_23.method7497(5);
		}
		local2 = this.aClass332_24;
		synchronized (this.aClass332_24) {
			this.aClass332_24.method7497(5);
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IB)Lclient!iaa;")
	public Class139 method600(@OriginalArg(0) int arg0) {
		@Pc(6) Class332 local6 = this.aClass332_23;
		@Pc(16) Class139 local16;
		synchronized (this.aClass332_23) {
			local16 = (Class139) this.aClass332_23.method7502((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class251 local29 = this.aClass251_16;
		@Pc(38) byte[] local38;
		synchronized (this.aClass251_16) {
			local38 = this.aClass251_16.method5860(33, arg0);
		}
		local16 = new Class139();
		local16.aClass33_1 = this;
		if (local38 != null) {
			local16.method3001(new Class6_Sub14(local38));
		}
		@Pc(68) Class332 local68 = this.aClass332_23;
		synchronized (this.aClass332_23) {
			this.aClass332_23.method7498((long) arg0, local16);
			return local16;
		}
	}
}
