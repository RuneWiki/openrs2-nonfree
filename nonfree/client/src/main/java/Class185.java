import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class185 {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "Lclient!mq;")
	private final Class154 aClass154_40 = new Class154(64);

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "Lclient!fc;")
	private final Class71 aClass71_71;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lclient!dk;ILclient!fc;)V")
	public Class185(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class71 arg2) {
		this.aClass71_71 = arg2;
		this.aClass71_71.method1580(5);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)Lclient!kf;")
	public Class2_Sub1_Sub7 method4412(@OriginalArg(1) int arg0) {
		@Pc(6) Class154 local6 = this.aClass154_40;
		@Pc(16) Class2_Sub1_Sub7 local16;
		synchronized (this.aClass154_40) {
			local16 = (Class2_Sub1_Sub7) this.aClass154_40.method3751((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(39) byte[] local39 = this.aClass71_71.method1555(5, arg0);
		local16 = new Class2_Sub1_Sub7();
		if (local39 != null) {
			local16.method2944(new Class2_Sub13(local39));
		}
		@Pc(55) Class154 local55 = this.aClass154_40;
		synchronized (this.aClass154_40) {
			this.aClass154_40.method3745((long) arg0, local16);
			return local16;
		}
	}
}
