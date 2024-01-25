import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class301 {

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "Lclient!wq;")
	private final Class391 aClass391_47 = new Class391(64);

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "Lclient!la;")
	private final Class208 aClass208_115;

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
	public final int anInt8327;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lclient!to;ILclient!la;)V")
	public Class301(@OriginalArg(0) Class333 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class208 arg2) {
		this.aClass208_115 = arg2;
		if (this.aClass208_115 == null) {
			this.anInt8327 = 0;
		} else {
			this.anInt8327 = this.aClass208_115.method5005(16);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
	public void method7165() {
		@Pc(2) Class391 local2 = this.aClass391_47;
		synchronized (this.aClass391_47) {
			this.aClass391_47.method9276(0);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)V")
	public void method7166() {
		@Pc(6) Class391 local6 = this.aClass391_47;
		synchronized (this.aClass391_47) {
			this.aClass391_47.method9274(5);
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)V")
	public void method7168() {
		@Pc(2) Class391 local2 = this.aClass391_47;
		synchronized (this.aClass391_47) {
			this.aClass391_47.method9286();
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)Lclient!sh;")
	public Class319 method7170(@OriginalArg(0) int arg0) {
		@Pc(6) Class391 local6 = this.aClass391_47;
		@Pc(16) Class319 local16;
		synchronized (this.aClass391_47) {
			local16 = (Class319) this.aClass391_47.method9275((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class208 local30 = this.aClass208_115;
		@Pc(39) byte[] local39;
		synchronized (this.aClass208_115) {
			local39 = this.aClass208_115.method4991(16, arg0, -11);
		}
		local16 = new Class319();
		if (local39 != null) {
			local16.method7911(new Class5_Sub23(local39));
		}
		@Pc(73) Class391 local73 = this.aClass391_47;
		synchronized (this.aClass391_47) {
			this.aClass391_47.method9273((long) arg0, local16, 1);
			return local16;
		}
	}
}
