import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gda")
public final class Class117 {

	@OriginalMember(owner = "client!gda", name = "o", descriptor = "I")
	public int anInt2786;

	@OriginalMember(owner = "client!gda", name = "l", descriptor = "Lclient!vi;")
	private final Class332 aClass332_72 = new Class332(64);

	@OriginalMember(owner = "client!gda", name = "n", descriptor = "Lclient!vi;")
	public final Class332 aClass332_73 = new Class332(30);

	@OriginalMember(owner = "client!gda", name = "c", descriptor = "Lclient!pq;")
	public final Class251 aClass251_52;

	@OriginalMember(owner = "client!gda", name = "f", descriptor = "Lclient!pq;")
	private final Class251 aClass251_53;

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lclient!uea;ILclient!pq;Lclient!pq;)V")
	public Class117(@OriginalArg(0) Class314 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2, @OriginalArg(3) Class251 arg3) {
		this.aClass251_52 = arg3;
		this.aClass251_53 = arg2;
		@Pc(26) int local26 = this.aClass251_53.method5847() - 1;
		this.aClass251_53.method5849(local26);
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(IB)Lclient!p;")
	public Class237 method2317(@OriginalArg(0) int arg0) {
		@Pc(6) Class332 local6 = this.aClass332_72;
		@Pc(16) Class237 local16;
		synchronized (this.aClass332_72) {
			local16 = (Class237) this.aClass332_72.method7502((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class251 local29 = this.aClass251_53;
		@Pc(42) byte[] local42;
		synchronized (this.aClass251_53) {
			local42 = this.aClass251_53.method5860(Static201.method5198(arg0), Static156.method2291(arg0));
		}
		local16 = new Class237();
		local16.aClass117_1 = this;
		local16.anInt6457 = arg0;
		if (local42 != null) {
			local16.method5494(new Class6_Sub14(local42));
		}
		@Pc(70) Class332 local70 = this.aClass332_72;
		synchronized (this.aClass332_72) {
			this.aClass332_72.method7498((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(II)V")
	public void method2318() {
		@Pc(6) Class332 local6 = this.aClass332_72;
		synchronized (this.aClass332_72) {
			this.aClass332_72.method7497(5);
		}
		local6 = this.aClass332_73;
		synchronized (this.aClass332_73) {
			this.aClass332_73.method7497(5);
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(B)V")
	public void method2319() {
		@Pc(2) Class332 local2 = this.aClass332_72;
		synchronized (this.aClass332_72) {
			this.aClass332_72.method7512();
		}
		local2 = this.aClass332_73;
		synchronized (this.aClass332_73) {
			this.aClass332_73.method7512();
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(I)V")
	public void method2323() {
		@Pc(2) Class332 local2 = this.aClass332_72;
		synchronized (this.aClass332_72) {
			this.aClass332_72.method7510();
		}
		local2 = this.aClass332_73;
		synchronized (this.aClass332_73) {
			this.aClass332_73.method7510();
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(IZ)V")
	public void method2324(@OriginalArg(0) int arg0) {
		this.anInt2786 = arg0;
		@Pc(9) Class332 local9 = this.aClass332_73;
		synchronized (this.aClass332_73) {
			this.aClass332_73.method7510();
		}
	}
}
