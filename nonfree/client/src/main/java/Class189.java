import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class189 {

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "Lclient!vi;")
	private final Class332 aClass332_124 = new Class332(64);

	@OriginalMember(owner = "client!lq", name = "i", descriptor = "Lclient!pq;")
	private final Class251 aClass251_86;

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lclient!uea;ILclient!pq;)V")
	public Class189(@OriginalArg(0) Class314 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2) {
		this.aClass251_86 = arg2;
		this.aClass251_86.method5849(32);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)Lclient!gj;")
	public Class120 method4109(@OriginalArg(1) int arg0) {
		@Pc(6) Class332 local6 = this.aClass332_124;
		@Pc(16) Class120 local16;
		synchronized (this.aClass332_124) {
			local16 = (Class120) this.aClass332_124.method7502((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class251 local29 = this.aClass251_86;
		@Pc(38) byte[] local38;
		synchronized (this.aClass251_86) {
			local38 = this.aClass251_86.method5860(32, arg0);
		}
		local16 = new Class120();
		if (local38 != null) {
			local16.method2398(new Class6_Sub14(local38));
		}
		@Pc(60) Class332 local60 = this.aClass332_124;
		synchronized (this.aClass332_124) {
			this.aClass332_124.method7498((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(II)V")
	public void method4112() {
		@Pc(2) Class332 local2 = this.aClass332_124;
		synchronized (this.aClass332_124) {
			this.aClass332_124.method7497(5);
		}
	}

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "(I)V")
	public void method4114() {
		@Pc(10) Class332 local10 = this.aClass332_124;
		synchronized (this.aClass332_124) {
			this.aClass332_124.method7510();
		}
	}

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "(I)V")
	public void method4115() {
		@Pc(6) Class332 local6 = this.aClass332_124;
		synchronized (this.aClass332_124) {
			this.aClass332_124.method7512();
		}
	}
}
