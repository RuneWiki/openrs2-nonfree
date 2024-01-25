import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public final class Class164 {

	@OriginalMember(owner = "client!it", name = "h", descriptor = "Lclient!lga;")
	private final Class207 aClass207_22 = new Class207(16);

	@OriginalMember(owner = "client!it", name = "j", descriptor = "Lclient!sea;")
	private final Class308 aClass308_93;

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lclient!ci;ILclient!sea;)V")
	public Class164(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class308 arg2) {
		this.aClass308_93 = arg2;
		this.aClass308_93.method6568(30);
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(BI)V")
	public void method3418() {
		@Pc(12) Class207 local12 = this.aClass207_22;
		synchronized (this.aClass207_22) {
			this.aClass207_22.method4397(5);
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(II)Lclient!og;")
	public Class251 method3419(@OriginalArg(1) int arg0) {
		@Pc(6) Class207 local6 = this.aClass207_22;
		@Pc(16) Class251 local16;
		synchronized (this.aClass207_22) {
			local16 = (Class251) this.aClass207_22.method4390((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class308 local29 = this.aClass308_93;
		@Pc(47) byte[] local47;
		synchronized (this.aClass308_93) {
			local47 = this.aClass308_93.method6569(30, arg0);
		}
		local16 = new Class251();
		if (local47 != null) {
			local16.method5447(new Class1_Sub3(local47));
		}
		@Pc(69) Class207 local69 = this.aClass207_22;
		synchronized (this.aClass207_22) {
			this.aClass207_22.method4391((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(I)V")
	public void method3421() {
		@Pc(2) Class207 local2 = this.aClass207_22;
		synchronized (this.aClass207_22) {
			this.aClass207_22.method4398();
		}
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(I)V")
	public void method3422() {
		@Pc(2) Class207 local2 = this.aClass207_22;
		synchronized (this.aClass207_22) {
			this.aClass207_22.method4392();
		}
	}
}
