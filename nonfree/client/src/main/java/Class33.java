import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class33 {

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "Lclient!wq;")
	private Class391 aClass391_6 = new Class391(128);

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "Lclient!wq;")
	public Class391 aClass391_7 = new Class391(64);

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "Lclient!la;")
	public final Class208 aClass208_7;

	@OriginalMember(owner = "client!bd", name = "i", descriptor = "Lclient!la;")
	private final Class208 aClass208_6;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!to;ILclient!la;Lclient!la;)V")
	public Class33(@OriginalArg(0) Class333 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class208 arg2, @OriginalArg(3) Class208 arg3) {
		this.aClass208_7 = arg3;
		this.aClass208_6 = arg2;
		this.aClass208_6.method5005(36);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)V")
	public void method652() {
		@Pc(2) Class391 local2 = this.aClass391_6;
		synchronized (this.aClass391_6) {
			this.aClass391_6.method9274(5);
		}
		local2 = this.aClass391_7;
		synchronized (this.aClass391_7) {
			this.aClass391_7.method9274(5);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
	public void method654() {
		@Pc(2) Class391 local2 = this.aClass391_6;
		synchronized (this.aClass391_6) {
			this.aClass391_6.method9286();
		}
		local2 = this.aClass391_7;
		synchronized (this.aClass391_7) {
			this.aClass391_7.method9286();
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
	public void method655() {
		@Pc(2) Class391 local2 = this.aClass391_6;
		synchronized (this.aClass391_6) {
			this.aClass391_6.method9276(0);
		}
		local2 = this.aClass391_7;
		synchronized (this.aClass391_7) {
			this.aClass391_7.method9276(0);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)V")
	public void method656(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass391_6 = new Class391(arg1);
		this.aClass391_7 = new Class391(arg0);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)Lclient!sb;")
	public Class315 method657(@OriginalArg(0) int arg0) {
		@Pc(6) Class391 local6 = this.aClass391_6;
		@Pc(16) Class315 local16;
		synchronized (this.aClass391_6) {
			local16 = (Class315) this.aClass391_6.method9275((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class208 local30 = this.aClass208_6;
		@Pc(39) byte[] local39;
		synchronized (this.aClass208_6) {
			local39 = this.aClass208_6.method4991(36, arg0, -118);
		}
		local16 = new Class315();
		local16.aClass33_2 = this;
		local16.anInt8868 = arg0;
		if (local39 != null) {
			local16.method7603(new Class5_Sub23(local39));
		}
		local16.method7601();
		@Pc(80) Class391 local80 = this.aClass391_6;
		synchronized (this.aClass391_6) {
			this.aClass391_6.method9273((long) arg0, local16, 1);
			return local16;
		}
	}
}
