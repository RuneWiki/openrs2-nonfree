import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kga")
public final class Class199 {

	@OriginalMember(owner = "client!kga", name = "d", descriptor = "Lclient!wq;")
	private Class391 aClass391_26 = new Class391(64);

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "Lclient!la;")
	private final Class208 aClass208_69;

	@OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(Lclient!to;ILclient!la;)V")
	public Class199(@OriginalArg(0) Class333 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class208 arg2) {
		this.aClass208_69 = arg2;
		if (this.aClass208_69 != null) {
			@Pc(20) int local20 = this.aClass208_69.method4988() - 1;
			this.aClass208_69.method5005(local20);
		}
	}

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "(ZI)Lclient!rc;")
	public Class300 method4687(@OriginalArg(1) int arg0) {
		@Pc(6) Class391 local6 = this.aClass391_26;
		@Pc(16) Class300 local16;
		synchronized (this.aClass391_26) {
			local16 = (Class300) this.aClass391_26.method9275((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(39) Class208 local39 = this.aClass208_69;
		@Pc(52) byte[] local52;
		synchronized (this.aClass208_69) {
			local52 = this.aClass208_69.method4991(Static40.method687(arg0), Static224.method3199(arg0), -125);
		}
		local16 = new Class300();
		if (local52 != null) {
			local16.method7161(new Class5_Sub23(local52));
		}
		@Pc(76) Class391 local76 = this.aClass391_26;
		synchronized (this.aClass391_26) {
			this.aClass391_26.method9273((long) arg0, local16, 1);
			return local16;
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(I)V")
	public void method4688(@OriginalArg(0) int arg0) {
		@Pc(2) Class391 local2 = this.aClass391_26;
		synchronized (this.aClass391_26) {
			this.aClass391_26.method9276(0);
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IZ)V")
	public void method4689() {
		@Pc(11) Class391 local11 = this.aClass391_26;
		synchronized (this.aClass391_26) {
			this.aClass391_26.method9274(5);
		}
	}

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "(I)V")
	public void method4691() {
		@Pc(6) Class391 local6 = this.aClass391_26;
		synchronized (this.aClass391_26) {
			this.aClass391_26.method9286();
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(ZI)V")
	public void method4692(@OriginalArg(1) int arg0) {
		@Pc(6) Class391 local6 = this.aClass391_26;
		synchronized (this.aClass391_26) {
			this.aClass391_26.method9276(0);
			this.aClass391_26 = new Class391(arg0);
		}
	}
}
