import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nu")
public final class Class256 {

	@OriginalMember(owner = "client!nu", name = "d", descriptor = "Lclient!wq;")
	private Class391 aClass391_36 = new Class391(64);

	@OriginalMember(owner = "client!nu", name = "h", descriptor = "Lclient!wq;")
	public Class391 aClass391_37 = new Class391(64);

	@OriginalMember(owner = "client!nu", name = "k", descriptor = "Lclient!la;")
	public final Class208 aClass208_95;

	@OriginalMember(owner = "client!nu", name = "c", descriptor = "Lclient!la;")
	private final Class208 aClass208_94;

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(Lclient!to;ILclient!la;Lclient!la;)V")
	public Class256(@OriginalArg(0) Class333 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class208 arg2, @OriginalArg(3) Class208 arg3) {
		this.aClass208_95 = arg3;
		this.aClass208_94 = arg2;
		this.aClass208_94.method5005(34);
	}

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(I)V")
	public void method5931() {
		@Pc(6) Class391 local6 = this.aClass391_36;
		synchronized (this.aClass391_36) {
			this.aClass391_36.method9276(0);
		}
		local6 = this.aClass391_37;
		synchronized (this.aClass391_37) {
			this.aClass391_37.method9276(0);
		}
	}

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(II)V")
	public void method5933() {
		@Pc(6) Class391 local6 = this.aClass391_36;
		synchronized (this.aClass391_36) {
			this.aClass391_36.method9274(5);
		}
		local6 = this.aClass391_37;
		synchronized (this.aClass391_37) {
			this.aClass391_37.method9274(5);
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(BI)Lclient!qf;")
	public Class289 method5935(@OriginalArg(1) int arg0) {
		@Pc(6) Class391 local6 = this.aClass391_36;
		@Pc(16) Class289 local16;
		synchronized (this.aClass391_36) {
			local16 = (Class289) this.aClass391_36.method9275((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class208 local30 = this.aClass208_94;
		@Pc(39) byte[] local39;
		synchronized (this.aClass208_94) {
			local39 = this.aClass208_94.method4991(34, arg0, -122);
		}
		local16 = new Class289();
		local16.aClass256_1 = this;
		if (local39 != null) {
			local16.method6917(new Class5_Sub23(local39));
		}
		@Pc(66) Class391 local66 = this.aClass391_36;
		synchronized (this.aClass391_36) {
			this.aClass391_36.method9273((long) arg0, local16, 1);
			return local16;
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(ZII)V")
	public void method5938(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass391_36 = new Class391(arg0);
		this.aClass391_37 = new Class391(arg1);
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(I)V")
	public void method5939() {
		@Pc(6) Class391 local6 = this.aClass391_36;
		synchronized (this.aClass391_36) {
			this.aClass391_36.method9286();
		}
		local6 = this.aClass391_37;
		synchronized (this.aClass391_37) {
			this.aClass391_37.method9286();
		}
	}
}
