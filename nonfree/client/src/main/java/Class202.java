import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class202 {

	@OriginalMember(owner = "client!mo", name = "t", descriptor = "I")
	public int anInt5701;

	@OriginalMember(owner = "client!mo", name = "l", descriptor = "Lclient!vi;")
	private final Class332 aClass332_136 = new Class332(64);

	@OriginalMember(owner = "client!mo", name = "r", descriptor = "Lclient!vi;")
	public final Class332 aClass332_137 = new Class332(50);

	@OriginalMember(owner = "client!mo", name = "s", descriptor = "Lclient!vi;")
	public final Class332 aClass332_138 = new Class332(5);

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "Lclient!pq;")
	private final Class251 aClass251_95;

	@OriginalMember(owner = "client!mo", name = "h", descriptor = "Lclient!uea;")
	public final Class314 aClass314_3;

	@OriginalMember(owner = "client!mo", name = "q", descriptor = "Lclient!pq;")
	public final Class251 aClass251_96;

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "Z")
	public boolean aBoolean363;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Lclient!uea;IZLclient!pq;Lclient!pq;)V")
	public Class202(@OriginalArg(0) Class314 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class251 arg3, @OriginalArg(4) Class251 arg4) {
		this.aClass251_95 = arg3;
		this.aClass314_3 = arg0;
		this.aClass251_96 = arg4;
		this.aBoolean363 = arg2;
		if (this.aClass251_95 != null) {
			@Pc(41) int local41 = this.aClass251_95.method5847() - 1;
			this.aClass251_95.method5849(local41);
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(BI)V")
	public void method4895(@OriginalArg(1) int arg0) {
		this.anInt5701 = arg0;
		@Pc(9) Class332 local9 = this.aClass332_137;
		synchronized (this.aClass332_137) {
			this.aClass332_137.method7510();
		}
		local9 = this.aClass332_138;
		synchronized (this.aClass332_138) {
			this.aClass332_138.method7510();
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZ)V")
	public void method4896(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean363) {
			this.aBoolean363 = arg0;
			this.method4898();
		}
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(BI)Lclient!qba;")
	public Class257 method4897(@OriginalArg(1) int arg0) {
		@Pc(6) Class332 local6 = this.aClass332_136;
		@Pc(16) Class257 local16;
		synchronized (this.aClass332_136) {
			local16 = (Class257) this.aClass332_136.method7502((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class251 local29 = this.aClass251_95;
		@Pc(42) byte[] local42;
		synchronized (this.aClass251_95) {
			local42 = this.aClass251_95.method5860(Static278.method5538(arg0), Static275.method3947(arg0));
		}
		local16 = new Class257();
		local16.aClass202_2 = this;
		local16.anInt7151 = arg0;
		if (local42 != null) {
			local16.method5943(new Class6_Sub14(local42));
		}
		local16.method5934();
		@Pc(73) Class332 local73 = this.aClass332_136;
		synchronized (this.aClass332_136) {
			this.aClass332_136.method7498((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)V")
	public void method4898() {
		@Pc(2) Class332 local2 = this.aClass332_136;
		synchronized (this.aClass332_136) {
			this.aClass332_136.method7510();
		}
		local2 = this.aClass332_137;
		synchronized (this.aClass332_137) {
			this.aClass332_137.method7510();
		}
		local2 = this.aClass332_138;
		synchronized (this.aClass332_138) {
			this.aClass332_138.method7510();
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IB)V")
	public void method4899() {
		@Pc(2) Class332 local2 = this.aClass332_136;
		synchronized (this.aClass332_136) {
			this.aClass332_136.method7497(5);
		}
		local2 = this.aClass332_137;
		synchronized (this.aClass332_137) {
			this.aClass332_137.method7497(5);
		}
		local2 = this.aClass332_138;
		synchronized (this.aClass332_138) {
			this.aClass332_138.method7497(5);
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V")
	public void method4900() {
		@Pc(10) Class332 local10 = this.aClass332_136;
		synchronized (this.aClass332_136) {
			this.aClass332_136.method7512();
		}
		local10 = this.aClass332_137;
		synchronized (this.aClass332_137) {
			this.aClass332_137.method7512();
		}
		local10 = this.aClass332_138;
		synchronized (this.aClass332_138) {
			this.aClass332_138.method7512();
		}
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(B)V")
	public void method4903() {
		@Pc(6) Class332 local6 = this.aClass332_137;
		synchronized (this.aClass332_137) {
			this.aClass332_137.method7510();
		}
		local6 = this.aClass332_138;
		synchronized (this.aClass332_138) {
			this.aClass332_138.method7510();
		}
	}
}
