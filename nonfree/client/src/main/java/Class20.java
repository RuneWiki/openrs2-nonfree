import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class20 {

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "Lclient!wq;")
	private final Class391 aClass391_2 = new Class391(64);

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "Lclient!la;")
	private final Class208 aClass208_1;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lclient!to;ILclient!la;)V")
	public Class20(@OriginalArg(0) Class333 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class208 arg2) {
		this.aClass208_1 = arg2;
		if (this.aClass208_1 != null) {
			this.aClass208_1.method5005(35);
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IZ)V")
	public void method342() {
		@Pc(2) Class391 local2 = this.aClass391_2;
		synchronized (this.aClass391_2) {
			this.aClass391_2.method9274(5);
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Z)V")
	public void method343() {
		@Pc(6) Class391 local6 = this.aClass391_2;
		synchronized (this.aClass391_2) {
			this.aClass391_2.method9286();
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)Lclient!dba;")
	public Class82 method345(@OriginalArg(1) int arg0) {
		@Pc(6) Class391 local6 = this.aClass391_2;
		@Pc(16) Class82 local16;
		synchronized (this.aClass391_2) {
			local16 = (Class82) this.aClass391_2.method9275((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class208 local30 = this.aClass208_1;
		@Pc(39) byte[] local39;
		synchronized (this.aClass208_1) {
			local39 = this.aClass208_1.method4991(35, arg0, -127);
		}
		local16 = new Class82();
		if (local39 != null) {
			local16.method1409(new Class5_Sub23(local39));
		}
		local16.method1407();
		@Pc(72) Class391 local72 = this.aClass391_2;
		synchronized (this.aClass391_2) {
			this.aClass391_2.method9273((long) arg0, local16, 1);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)V")
	public void method346() {
		@Pc(2) Class391 local2 = this.aClass391_2;
		synchronized (this.aClass391_2) {
			this.aClass391_2.method9276(0);
		}
	}
}
