import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class324 {

	@OriginalMember(owner = "client!sn", name = "h", descriptor = "Lclient!wq;")
	private final Class391 aClass391_55 = new Class391(64);

	@OriginalMember(owner = "client!sn", name = "g", descriptor = "Lclient!la;")
	private final Class208 aClass208_126;

	@OriginalMember(owner = "client!sn", name = "k", descriptor = "Lclient!la;")
	public final Class208 aClass208_125;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lclient!to;ILclient!la;Lclient!la;)V")
	public Class324(@OriginalArg(0) Class333 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class208 arg2, @OriginalArg(3) Class208 arg3) {
		this.aClass208_126 = arg2;
		this.aClass208_125 = arg3;
		this.aClass208_126.method5005(3);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)Lclient!uj;")
	public Class351 method7959(@OriginalArg(1) int arg0) {
		@Pc(6) Class391 local6 = this.aClass391_55;
		@Pc(16) Class351 local16;
		synchronized (this.aClass391_55) {
			local16 = (Class351) this.aClass391_55.method9275((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class208 local30 = this.aClass208_126;
		@Pc(41) byte[] local41;
		synchronized (this.aClass208_126) {
			local41 = this.aClass208_126.method4991(3, arg0, -118);
		}
		local16 = new Class351();
		local16.aClass324_2 = this;
		if (local41 != null) {
			local16.method8673(new Class5_Sub23(local41));
		}
		@Pc(68) Class391 local68 = this.aClass391_55;
		synchronized (this.aClass391_55) {
			this.aClass391_55.method9273((long) arg0, local16, 1);
			return local16;
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IB)V")
	public void method7961() {
		@Pc(6) Class391 local6 = this.aClass391_55;
		synchronized (this.aClass391_55) {
			this.aClass391_55.method9274(5);
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
	public void method7965() {
		@Pc(14) Class391 local14 = this.aClass391_55;
		synchronized (this.aClass391_55) {
			this.aClass391_55.method9286();
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
	public void method7967() {
		@Pc(14) Class391 local14 = this.aClass391_55;
		synchronized (this.aClass391_55) {
			this.aClass391_55.method9276(0);
		}
	}
}
