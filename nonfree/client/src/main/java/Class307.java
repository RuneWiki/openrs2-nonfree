import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class307 {

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "Lclient!vi;")
	private final Class332 aClass332_183 = new Class332(64);

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "Lclient!pq;")
	private final Class251 aClass251_137;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lclient!uea;ILclient!pq;)V")
	public Class307(@OriginalArg(0) Class314 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2) {
		this.aClass251_137 = arg2;
		if (this.aClass251_137 != null) {
			this.aClass251_137.method5849(11);
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)V")
	public void method6809() {
		@Pc(2) Class332 local2 = this.aClass332_183;
		synchronized (this.aClass332_183) {
			this.aClass332_183.method7497(5);
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)V")
	public void method6810() {
		@Pc(6) Class332 local6 = this.aClass332_183;
		synchronized (this.aClass332_183) {
			this.aClass332_183.method7512();
		}
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(II)Lclient!wg;")
	public Class343 method6811(@OriginalArg(0) int arg0) {
		@Pc(6) Class332 local6 = this.aClass332_183;
		@Pc(16) Class343 local16;
		synchronized (this.aClass332_183) {
			local16 = (Class343) this.aClass332_183.method7502((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class251 local29 = this.aClass251_137;
		@Pc(38) byte[] local38;
		synchronized (this.aClass251_137) {
			local38 = this.aClass251_137.method5860(11, arg0);
		}
		local16 = new Class343();
		if (local38 != null) {
			local16.method7743(new Class6_Sub14(local38));
		}
		@Pc(62) Class332 local62 = this.aClass332_183;
		synchronized (this.aClass332_183) {
			this.aClass332_183.method7498((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "(B)V")
	public void method6813() {
		@Pc(10) Class332 local10 = this.aClass332_183;
		synchronized (this.aClass332_183) {
			this.aClass332_183.method7510();
		}
	}
}
