import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class318 {

	@OriginalMember(owner = "client!um", name = "f", descriptor = "Lclient!vi;")
	private final Class332 aClass332_189 = new Class332(128);

	@OriginalMember(owner = "client!um", name = "b", descriptor = "Lclient!pq;")
	private final Class251 aClass251_146;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lclient!uea;ILclient!pq;)V")
	public Class318(@OriginalArg(0) Class314 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2) {
		this.aClass251_146 = arg2;
		this.aClass251_146.method5849(1);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(II)V")
	public void method7318() {
		@Pc(8) Class332 local8 = this.aClass332_189;
		synchronized (this.aClass332_189) {
			this.aClass332_189.method7497(5);
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
	public void method7321() {
		@Pc(6) Class332 local6 = this.aClass332_189;
		synchronized (this.aClass332_189) {
			this.aClass332_189.method7512();
		}
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(II)Lclient!eba;")
	public Class79 method7322(@OriginalArg(0) int arg0) {
		@Pc(6) Class332 local6 = this.aClass332_189;
		@Pc(16) Class79 local16;
		synchronized (this.aClass332_189) {
			local16 = (Class79) this.aClass332_189.method7502((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class251 local29 = this.aClass251_146;
		@Pc(38) byte[] local38;
		synchronized (this.aClass251_146) {
			local38 = this.aClass251_146.method5860(1, arg0);
		}
		local16 = new Class79();
		if (local38 != null) {
			local16.method1653(new Class6_Sub14(local38));
		}
		@Pc(60) Class332 local60 = this.aClass332_189;
		synchronized (this.aClass332_189) {
			this.aClass332_189.method7498((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(B)V")
	public void method7324() {
		@Pc(6) Class332 local6 = this.aClass332_189;
		synchronized (this.aClass332_189) {
			this.aClass332_189.method7510();
		}
	}
}
