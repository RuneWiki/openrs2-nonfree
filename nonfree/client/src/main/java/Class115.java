import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class115 {

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "Lclient!uaa;")
	private final Class288 aClass288_22 = new Class288(256);

	@OriginalMember(owner = "client!gl", name = "g", descriptor = "Lclient!gp;")
	private final Class117 aClass117_89;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lclient!jc;ILclient!gp;)V")
	public Class115(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class117 arg2) {
		this.aClass117_89 = arg2;
		this.aClass117_89.method2951(26);
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V")
	public void method2910() {
		@Pc(2) Class288 local2 = this.aClass288_22;
		synchronized (this.aClass288_22) {
			this.aClass288_22.method6744();
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)V")
	public void method2911() {
		@Pc(6) Class288 local6 = this.aClass288_22;
		synchronized (this.aClass288_22) {
			this.aClass288_22.method6735(5);
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IB)Lclient!wj;")
	public Class5_Sub2_Sub18 method2913(@OriginalArg(0) int arg0) {
		@Pc(6) Class288 local6 = this.aClass288_22;
		@Pc(16) Class5_Sub2_Sub18 local16;
		synchronized (this.aClass288_22) {
			local16 = (Class5_Sub2_Sub18) this.aClass288_22.method6745((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class117 local29 = this.aClass117_89;
		@Pc(38) byte[] local38;
		synchronized (this.aClass117_89) {
			local38 = this.aClass117_89.method2962(arg0, 26);
		}
		local16 = new Class5_Sub2_Sub18();
		if (local38 != null) {
			local16.method7326(new Class5_Sub3(local38));
		}
		@Pc(65) Class288 local65 = this.aClass288_22;
		synchronized (this.aClass288_22) {
			this.aClass288_22.method6746(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)V")
	public void method2914() {
		@Pc(6) Class288 local6 = this.aClass288_22;
		synchronized (this.aClass288_22) {
			this.aClass288_22.method6742();
		}
	}
}
