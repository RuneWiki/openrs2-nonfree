import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class246 {

	@OriginalMember(owner = "client!qk", name = "i", descriptor = "Lclient!uaa;")
	private Class288 aClass288_52 = new Class288(128);

	@OriginalMember(owner = "client!qk", name = "o", descriptor = "Lclient!uaa;")
	public Class288 aClass288_53 = new Class288(64);

	@OriginalMember(owner = "client!qk", name = "h", descriptor = "Lclient!gp;")
	public final Class117 aClass117_170;

	@OriginalMember(owner = "client!qk", name = "k", descriptor = "Lclient!gp;")
	private final Class117 aClass117_171;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lclient!jc;ILclient!gp;Lclient!gp;)V")
	public Class246(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class117 arg2, @OriginalArg(3) Class117 arg3) {
		this.aClass117_170 = arg3;
		this.aClass117_171 = arg2;
		this.aClass117_171.method2951(36);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)V")
	public void method5844(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass288_52 = new Class288(arg0);
		this.aClass288_53 = new Class288(arg1);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)V")
	public void method5845() {
		@Pc(11) Class288 local11 = this.aClass288_52;
		synchronized (this.aClass288_52) {
			this.aClass288_52.method6735(5);
		}
		local11 = this.aClass288_53;
		synchronized (this.aClass288_53) {
			this.aClass288_53.method6735(5);
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V")
	public void method5846() {
		@Pc(2) Class288 local2 = this.aClass288_52;
		synchronized (this.aClass288_52) {
			this.aClass288_52.method6744();
		}
		local2 = this.aClass288_53;
		synchronized (this.aClass288_53) {
			this.aClass288_53.method6744();
		}
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(II)Lclient!fm;")
	public Class101 method5847(@OriginalArg(0) int arg0) {
		@Pc(6) Class288 local6 = this.aClass288_52;
		@Pc(16) Class101 local16;
		synchronized (this.aClass288_52) {
			local16 = (Class101) this.aClass288_52.method6745((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class117 local29 = this.aClass117_171;
		@Pc(38) byte[] local38;
		synchronized (this.aClass117_171) {
			local38 = this.aClass117_171.method2962(arg0, 36);
		}
		local16 = new Class101();
		local16.aClass246_1 = this;
		local16.anInt2859 = arg0;
		if (local38 != null) {
			local16.method2607(new Class5_Sub3(local38));
		}
		local16.method2606();
		@Pc(69) Class288 local69 = this.aClass288_52;
		synchronized (this.aClass288_52) {
			this.aClass288_52.method6746(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V")
	public void method5848() {
		@Pc(2) Class288 local2 = this.aClass288_52;
		synchronized (this.aClass288_52) {
			this.aClass288_52.method6742();
		}
		local2 = this.aClass288_53;
		synchronized (this.aClass288_53) {
			this.aClass288_53.method6742();
		}
	}
}
