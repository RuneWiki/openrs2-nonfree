import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class355 {

	@OriginalMember(owner = "client!un", name = "a", descriptor = "Lclient!wq;")
	private final Class391 aClass391_63 = new Class391(64);

	@OriginalMember(owner = "client!un", name = "h", descriptor = "Lclient!la;")
	private final Class208 aClass208_138;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lclient!to;ILclient!la;)V")
	public Class355(@OriginalArg(0) Class333 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class208 arg2) {
		this.aClass208_138 = arg2;
		if (this.aClass208_138 != null) {
			this.aClass208_138.method5005(11);
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(B)V")
	public void method8691() {
		@Pc(6) Class391 local6 = this.aClass391_63;
		synchronized (this.aClass391_63) {
			this.aClass391_63.method9276(0);
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(BI)Lclient!gw;")
	public Class152 method8693(@OriginalArg(1) int arg0) {
		@Pc(6) Class391 local6 = this.aClass391_63;
		@Pc(16) Class152 local16;
		synchronized (this.aClass391_63) {
			local16 = (Class152) this.aClass391_63.method9275((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class208 local30 = this.aClass208_138;
		@Pc(39) byte[] local39;
		synchronized (this.aClass208_138) {
			local39 = this.aClass208_138.method4991(11, arg0, -127);
		}
		local16 = new Class152();
		if (local39 != null) {
			local16.method2968(new Class5_Sub23(local39));
		}
		@Pc(71) Class391 local71 = this.aClass391_63;
		synchronized (this.aClass391_63) {
			this.aClass391_63.method9273((long) arg0, local16, 1);
			return local16;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(II)V")
	public void method8694() {
		@Pc(14) Class391 local14 = this.aClass391_63;
		synchronized (this.aClass391_63) {
			this.aClass391_63.method9274(5);
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V")
	public void method8695() {
		@Pc(2) Class391 local2 = this.aClass391_63;
		synchronized (this.aClass391_63) {
			this.aClass391_63.method9286();
		}
	}
}
