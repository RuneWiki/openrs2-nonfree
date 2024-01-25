import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class133 {

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "Lclient!wf;")
	private final Class316 aClass316_25 = new Class316(64);

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "Lclient!kda;")
	private final Class160 aClass160_45;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lclient!bt;ILclient!kda;)V")
	public Class133(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2) {
		this.aClass160_45 = arg2;
		if (this.aClass160_45 != null) {
			this.aClass160_45.method4207(35);
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
	public void method3770() {
		@Pc(2) Class316 local2 = this.aClass316_25;
		synchronized (this.aClass316_25) {
			this.aClass316_25.method7803();
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZI)V")
	public void method3771() {
		@Pc(6) Class316 local6 = this.aClass316_25;
		synchronized (this.aClass316_25) {
			this.aClass316_25.method7791(5);
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(BI)Lclient!eu;")
	public Class84 method3772(@OriginalArg(1) int arg0) {
		@Pc(6) Class316 local6 = this.aClass316_25;
		@Pc(16) Class84 local16;
		synchronized (this.aClass316_25) {
			local16 = (Class84) this.aClass316_25.method7799((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class160 local37 = this.aClass160_45;
		@Pc(46) byte[] local46;
		synchronized (this.aClass160_45) {
			local46 = this.aClass160_45.method4198(arg0, 35);
		}
		local16 = new Class84();
		if (local46 != null) {
			local16.method2667(new Class1_Sub13(local46));
		}
		local16.method2668();
		@Pc(71) Class316 local71 = this.aClass316_25;
		synchronized (this.aClass316_25) {
			this.aClass316_25.method7792((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)V")
	public void method3774() {
		@Pc(10) Class316 local10 = this.aClass316_25;
		synchronized (this.aClass316_25) {
			this.aClass316_25.method7794();
		}
	}
}
