import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!haa")
public final class Class122 {

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "Lclient!uaa;")
	private final Class288 aClass288_25 = new Class288(64);

	@OriginalMember(owner = "client!haa", name = "g", descriptor = "Lclient!gp;")
	private final Class117 aClass117_95;

	@OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Lclient!jc;ILclient!gp;)V")
	public Class122(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class117 arg2) {
		this.aClass117_95 = arg2;
		if (this.aClass117_95 != null) {
			this.aClass117_95.method2951(35);
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IB)V")
	public void method3028() {
		@Pc(6) Class288 local6 = this.aClass288_25;
		synchronized (this.aClass288_25) {
			this.aClass288_25.method6735(5);
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)V")
	public void method3031() {
		@Pc(2) Class288 local2 = this.aClass288_25;
		synchronized (this.aClass288_25) {
			this.aClass288_25.method6744();
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(II)Lclient!lba;")
	public Class182 method3032(@OriginalArg(1) int arg0) {
		@Pc(6) Class288 local6 = this.aClass288_25;
		@Pc(16) Class182 local16;
		synchronized (this.aClass288_25) {
			local16 = (Class182) this.aClass288_25.method6745((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(36) Class117 local36 = this.aClass117_95;
		@Pc(45) byte[] local45;
		synchronized (this.aClass117_95) {
			local45 = this.aClass117_95.method2962(arg0, 35);
		}
		local16 = new Class182();
		if (local45 != null) {
			local16.method4500(new Class5_Sub3(local45));
		}
		local16.method4499();
		@Pc(70) Class288 local70 = this.aClass288_25;
		synchronized (this.aClass288_25) {
			this.aClass288_25.method6746(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(I)V")
	public void method3034() {
		@Pc(2) Class288 local2 = this.aClass288_25;
		synchronized (this.aClass288_25) {
			this.aClass288_25.method6742();
		}
	}
}
