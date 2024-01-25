import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class245 {

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "Lclient!vi;")
	private Class332 aClass332_158 = new Class332(64);

	@OriginalMember(owner = "client!pg", name = "n", descriptor = "Lclient!vi;")
	public Class332 aClass332_159 = new Class332(64);

	@OriginalMember(owner = "client!pg", name = "i", descriptor = "Lclient!pq;")
	private final Class251 aClass251_111;

	@OriginalMember(owner = "client!pg", name = "j", descriptor = "Lclient!pq;")
	public final Class251 aClass251_112;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lclient!uea;ILclient!pq;Lclient!pq;)V")
	public Class245(@OriginalArg(0) Class314 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2, @OriginalArg(3) Class251 arg3) {
		this.aClass251_111 = arg2;
		this.aClass251_112 = arg3;
		this.aClass251_111.method5849(34);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)V")
	public void method5766(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass332_158 = new Class332(arg1);
		this.aClass332_159 = new Class332(arg0);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
	public void method5767() {
		@Pc(6) Class332 local6 = this.aClass332_158;
		synchronized (this.aClass332_158) {
			this.aClass332_158.method7510();
		}
		local6 = this.aClass332_159;
		synchronized (this.aClass332_159) {
			this.aClass332_159.method7510();
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IB)Lclient!ft;")
	public Class111 method5768(@OriginalArg(0) int arg0) {
		@Pc(6) Class332 local6 = this.aClass332_158;
		@Pc(16) Class111 local16;
		synchronized (this.aClass332_158) {
			local16 = (Class111) this.aClass332_158.method7502((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class251 local29 = this.aClass251_111;
		@Pc(38) byte[] local38;
		synchronized (this.aClass251_111) {
			local38 = this.aClass251_111.method5860(34, arg0);
		}
		local16 = new Class111();
		local16.aClass245_2 = this;
		if (local38 != null) {
			local16.method2218(new Class6_Sub14(local38));
		}
		@Pc(71) Class332 local71 = this.aClass332_158;
		synchronized (this.aClass332_158) {
			this.aClass332_158.method7498((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)V")
	public void method5770() {
		@Pc(12) Class332 local12 = this.aClass332_158;
		synchronized (this.aClass332_158) {
			this.aClass332_158.method7497(5);
		}
		local12 = this.aClass332_159;
		synchronized (this.aClass332_159) {
			this.aClass332_159.method7497(5);
		}
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)V")
	public void method5771() {
		@Pc(6) Class332 local6 = this.aClass332_158;
		synchronized (this.aClass332_158) {
			this.aClass332_158.method7512();
		}
		local6 = this.aClass332_159;
		synchronized (this.aClass332_159) {
			this.aClass332_159.method7512();
		}
	}
}
