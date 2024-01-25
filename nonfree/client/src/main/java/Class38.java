import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public final class Class38 {

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "Lclient!uaa;")
	private final Class288 aClass288_2 = new Class288(128);

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "Lclient!gp;")
	private final Class117 aClass117_22;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(Lclient!jc;ILclient!gp;)V")
	public Class38(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class117 arg2) {
		this.aClass117_22 = arg2;
		this.aClass117_22.method2951(1);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V")
	public void method1055() {
		@Pc(2) Class288 local2 = this.aClass288_2;
		synchronized (this.aClass288_2) {
			this.aClass288_2.method6742();
		}
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)V")
	public void method1056() {
		@Pc(6) Class288 local6 = this.aClass288_2;
		synchronized (this.aClass288_2) {
			this.aClass288_2.method6744();
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II)Lclient!af;")
	public Class11 method1059(@OriginalArg(1) int arg0) {
		@Pc(6) Class288 local6 = this.aClass288_2;
		@Pc(16) Class11 local16;
		synchronized (this.aClass288_2) {
			local16 = (Class11) this.aClass288_2.method6745((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class117 local29 = this.aClass117_22;
		@Pc(38) byte[] local38;
		synchronized (this.aClass117_22) {
			local38 = this.aClass117_22.method2962(arg0, 1);
		}
		local16 = new Class11();
		if (local38 != null) {
			local16.method322(new Class5_Sub3(local38));
		}
		@Pc(66) Class288 local66 = this.aClass288_2;
		synchronized (this.aClass288_2) {
			this.aClass288_2.method6746(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(II)V")
	public void method1060() {
		@Pc(2) Class288 local2 = this.aClass288_2;
		synchronized (this.aClass288_2) {
			this.aClass288_2.method6735(5);
		}
	}
}
