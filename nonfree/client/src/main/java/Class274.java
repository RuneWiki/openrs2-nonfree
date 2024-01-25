import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public final class Class274 {

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "Lclient!uaa;")
	private Class288 aClass288_58 = new Class288(64);

	@OriginalMember(owner = "client!sr", name = "p", descriptor = "Lclient!uaa;")
	public Class288 aClass288_59 = new Class288(64);

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "Lclient!gp;")
	public final Class117 aClass117_192;

	@OriginalMember(owner = "client!sr", name = "i", descriptor = "Lclient!gp;")
	private final Class117 aClass117_193;

	static {
		new Class40(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
		new Class40("Ok", "Okay", "OK", "Ok");
	}

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Lclient!jc;ILclient!gp;Lclient!gp;)V")
	public Class274(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class117 arg2, @OriginalArg(3) Class117 arg3) {
		this.aClass117_192 = arg3;
		this.aClass117_193 = arg2;
		this.aClass117_193.method2951(34);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)V")
	public void method6378() {
		@Pc(7) Class288 local7 = this.aClass288_58;
		synchronized (this.aClass288_58) {
			this.aClass288_58.method6744();
		}
		local7 = this.aClass288_59;
		synchronized (this.aClass288_59) {
			this.aClass288_59.method6744();
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(II)V")
	public void method6381() {
		@Pc(6) Class288 local6 = this.aClass288_58;
		synchronized (this.aClass288_58) {
			this.aClass288_58.method6735(5);
		}
		local6 = this.aClass288_59;
		synchronized (this.aClass288_59) {
			this.aClass288_59.method6735(5);
		}
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(II)Lclient!rt;")
	public Class260 method6382(@OriginalArg(1) int arg0) {
		@Pc(6) Class288 local6 = this.aClass288_58;
		@Pc(16) Class260 local16;
		synchronized (this.aClass288_58) {
			local16 = (Class260) this.aClass288_58.method6745((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class117 local29 = this.aClass117_193;
		@Pc(38) byte[] local38;
		synchronized (this.aClass117_193) {
			local38 = this.aClass117_193.method2962(arg0, 34);
		}
		local16 = new Class260();
		local16.aClass274_4 = this;
		if (local38 != null) {
			local16.method6216(new Class5_Sub3(local38));
		}
		@Pc(63) Class288 local63 = this.aClass288_58;
		synchronized (this.aClass288_58) {
			this.aClass288_58.method6746(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(B)V")
	public void method6383() {
		@Pc(2) Class288 local2 = this.aClass288_58;
		synchronized (this.aClass288_58) {
			this.aClass288_58.method6742();
		}
		local2 = this.aClass288_59;
		synchronized (this.aClass288_59) {
			this.aClass288_59.method6742();
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(III)V")
	public void method6384(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass288_58 = new Class288(arg1);
		this.aClass288_59 = new Class288(arg0);
	}
}
