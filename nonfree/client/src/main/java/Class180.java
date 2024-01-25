import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class180 {

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "Lclient!vi;")
	private final Class332 aClass332_117 = new Class332(64);

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "Lclient!pq;")
	private final Class251 aClass251_81;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!uea;ILclient!pq;)V")
	public Class180(@OriginalArg(0) Class314 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2) {
		this.aClass251_81 = arg2;
		if (this.aClass251_81 != null) {
			this.aClass251_81.method5849(35);
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
	public void method3989() {
		@Pc(2) Class332 local2 = this.aClass332_117;
		synchronized (this.aClass332_117) {
			this.aClass332_117.method7512();
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)V")
	public void method3990() {
		@Pc(6) Class332 local6 = this.aClass332_117;
		synchronized (this.aClass332_117) {
			this.aClass332_117.method7497(5);
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)Lclient!wr;")
	public Class347 method3991(@OriginalArg(1) int arg0) {
		@Pc(6) Class332 local6 = this.aClass332_117;
		@Pc(16) Class347 local16;
		synchronized (this.aClass332_117) {
			local16 = (Class347) this.aClass332_117.method7502((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class251 local29 = this.aClass251_81;
		@Pc(38) byte[] local38;
		synchronized (this.aClass251_81) {
			local38 = this.aClass251_81.method5860(35, arg0);
		}
		local16 = new Class347();
		if (local38 != null) {
			local16.method7840(new Class6_Sub14(local38));
		}
		local16.method7844();
		@Pc(69) Class332 local69 = this.aClass332_117;
		synchronized (this.aClass332_117) {
			this.aClass332_117.method7498((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V")
	public void method3992() {
		@Pc(2) Class332 local2 = this.aClass332_117;
		synchronized (this.aClass332_117) {
			this.aClass332_117.method7510();
		}
	}
}
