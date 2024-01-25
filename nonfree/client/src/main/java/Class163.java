import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class163 {

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "Lclient!tl;")
	private final Class227 aClass227_31 = new Class227(64);

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "Lclient!ui;")
	private final Class230 aClass230_61;

	static {
		new Class169(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
	}

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lclient!gp;ILclient!ui;)V")
	public Class163(@OriginalArg(0) Class94 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class230 arg2) {
		this.aClass230_61 = arg2;
		this.aClass230_61.method4956(32);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V")
	public void method3325() {
		@Pc(6) Class227 local6 = this.aClass227_31;
		synchronized (this.aClass227_31) {
			this.aClass227_31.method4858();
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IB)V")
	public void method3326() {
		@Pc(6) Class227 local6 = this.aClass227_31;
		synchronized (this.aClass227_31) {
			this.aClass227_31.method4859(5);
		}
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(IB)Lclient!ai;")
	public Class8 method3328(@OriginalArg(0) int arg0) {
		@Pc(6) Class227 local6 = this.aClass227_31;
		@Pc(16) Class8 local16;
		synchronized (this.aClass227_31) {
			local16 = (Class8) this.aClass227_31.method4863((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(39) byte[] local39 = this.aClass230_61.method4985(arg0, 32);
		local16 = new Class8();
		if (local39 != null) {
			local16.method95(new Class1_Sub33(local39));
		}
		@Pc(55) Class227 local55 = this.aClass227_31;
		synchronized (this.aClass227_31) {
			this.aClass227_31.method4865(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)V")
	public void method3329() {
		@Pc(6) Class227 local6 = this.aClass227_31;
		synchronized (this.aClass227_31) {
			this.aClass227_31.method4871();
		}
	}
}
