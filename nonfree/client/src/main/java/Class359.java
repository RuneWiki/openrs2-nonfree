import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wfa")
public final class Class359 {

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "Lclient!lga;")
	private final Class207 aClass207_61 = new Class207(256);

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "Lclient!sea;")
	private final Class308 aClass308_193;

	@OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "(Lclient!ci;ILclient!sea;)V")
	public Class359(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class308 arg2) {
		this.aClass308_193 = arg2;
		this.aClass308_193.method6568(26);
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(II)Lclient!qaa;")
	public Class1_Sub8_Sub10 method7783(@OriginalArg(0) int arg0) {
		@Pc(6) Class207 local6 = this.aClass207_61;
		@Pc(16) Class1_Sub8_Sub10 local16;
		synchronized (this.aClass207_61) {
			local16 = (Class1_Sub8_Sub10) this.aClass207_61.method4390((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class308 local37 = this.aClass308_193;
		@Pc(46) byte[] local46;
		synchronized (this.aClass308_193) {
			local46 = this.aClass308_193.method6569(26, arg0);
		}
		local16 = new Class1_Sub8_Sub10();
		if (local46 != null) {
			local16.method5895(new Class1_Sub3(local46));
		}
		@Pc(68) Class207 local68 = this.aClass207_61;
		synchronized (this.aClass207_61) {
			this.aClass207_61.method4391((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)V")
	public void method7784() {
		@Pc(10) Class207 local10 = this.aClass207_61;
		synchronized (this.aClass207_61) {
			this.aClass207_61.method4392();
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(B)V")
	public void method7785() {
		@Pc(14) Class207 local14 = this.aClass207_61;
		synchronized (this.aClass207_61) {
			this.aClass207_61.method4398();
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IB)V")
	public void method7786() {
		@Pc(2) Class207 local2 = this.aClass207_61;
		synchronized (this.aClass207_61) {
			this.aClass207_61.method4397(5);
		}
	}
}
