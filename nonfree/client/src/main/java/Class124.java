import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public final class Class124 {

	@OriginalMember(owner = "client!gq", name = "i", descriptor = "Lclient!vi;")
	private final Class332 aClass332_80 = new Class332(16);

	@OriginalMember(owner = "client!gq", name = "h", descriptor = "Lclient!pq;")
	private final Class251 aClass251_61;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lclient!uea;ILclient!pq;)V")
	public Class124(@OriginalArg(0) Class314 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2) {
		this.aClass251_61 = arg2;
		this.aClass251_61.method5849(30);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(BI)V")
	public void method2624() {
		@Pc(2) Class332 local2 = this.aClass332_80;
		synchronized (this.aClass332_80) {
			this.aClass332_80.method7497(5);
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(II)Lclient!mp;")
	public Class203 method2626(@OriginalArg(1) int arg0) {
		@Pc(6) Class332 local6 = this.aClass332_80;
		@Pc(16) Class203 local16;
		synchronized (this.aClass332_80) {
			local16 = (Class203) this.aClass332_80.method7502((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class251 local29 = this.aClass251_61;
		@Pc(38) byte[] local38;
		synchronized (this.aClass251_61) {
			local38 = this.aClass251_61.method5860(30, arg0);
		}
		local16 = new Class203();
		if (local38 != null) {
			local16.method4910(new Class6_Sub14(local38));
		}
		@Pc(60) Class332 local60 = this.aClass332_80;
		synchronized (this.aClass332_80) {
			this.aClass332_80.method7498((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V")
	public void method2627() {
		@Pc(2) Class332 local2 = this.aClass332_80;
		synchronized (this.aClass332_80) {
			this.aClass332_80.method7510();
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)V")
	public void method2630() {
		@Pc(6) Class332 local6 = this.aClass332_80;
		synchronized (this.aClass332_80) {
			this.aClass332_80.method7512();
		}
	}
}
