import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lja")
public final class Class218 {

	@OriginalMember(owner = "client!lja", name = "h", descriptor = "Lclient!wq;")
	private final Class391 aClass391_28 = new Class391(128);

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "Lclient!la;")
	private final Class208 aClass208_77;

	@OriginalMember(owner = "client!lja", name = "<init>", descriptor = "(Lclient!to;ILclient!la;)V")
	public Class218(@OriginalArg(0) Class333 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class208 arg2) {
		this.aClass208_77 = arg2;
		this.aClass208_77.method5005(1);
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(BI)Lclient!pba;")
	public Class274 method5200(@OriginalArg(1) int arg0) {
		@Pc(6) Class391 local6 = this.aClass391_28;
		@Pc(16) Class274 local16;
		synchronized (this.aClass391_28) {
			local16 = (Class274) this.aClass391_28.method9275((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class208 local30 = this.aClass208_77;
		@Pc(41) byte[] local41;
		synchronized (this.aClass208_77) {
			local41 = this.aClass208_77.method4991(1, arg0, -121);
		}
		local16 = new Class274();
		if (local41 != null) {
			local16.method6496(new Class5_Sub23(local41));
		}
		@Pc(74) Class391 local74 = this.aClass391_28;
		synchronized (this.aClass391_28) {
			this.aClass391_28.method9273((long) arg0, local16, 1);
			return local16;
		}
	}

	@OriginalMember(owner = "client!lja", name = "b", descriptor = "(BI)V")
	public void method5201() {
		@Pc(2) Class391 local2 = this.aClass391_28;
		synchronized (this.aClass391_28) {
			this.aClass391_28.method9274(5);
		}
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(I)V")
	public void method5202() {
		@Pc(6) Class391 local6 = this.aClass391_28;
		synchronized (this.aClass391_28) {
			this.aClass391_28.method9276(0);
		}
	}

	@OriginalMember(owner = "client!lja", name = "b", descriptor = "(I)V")
	public void method5203() {
		@Pc(2) Class391 local2 = this.aClass391_28;
		synchronized (this.aClass391_28) {
			this.aClass391_28.method9286();
		}
	}
}
