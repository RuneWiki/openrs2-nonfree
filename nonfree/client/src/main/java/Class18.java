import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public final class Class18 {

	@OriginalMember(owner = "client!as", name = "g", descriptor = "Lclient!wf;")
	private final Class316 aClass316_2 = new Class316(64);

	@OriginalMember(owner = "client!as", name = "i", descriptor = "Lclient!kda;")
	private final Class160 aClass160_3;

	static {
		new Class114("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lclient!bt;ILclient!kda;)V")
	public Class18(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2) {
		this.aClass160_3 = arg2;
		this.aClass160_3.method4207(32);
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(II)Lclient!rn;")
	public Class255 method869(@OriginalArg(1) int arg0) {
		@Pc(6) Class316 local6 = this.aClass316_2;
		@Pc(16) Class255 local16;
		synchronized (this.aClass316_2) {
			local16 = (Class255) this.aClass316_2.method7799((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class160 local29 = this.aClass160_3;
		@Pc(38) byte[] local38;
		synchronized (this.aClass160_3) {
			local38 = this.aClass160_3.method4198(arg0, 32);
		}
		local16 = new Class255();
		if (local38 != null) {
			local16.method6215(new Class1_Sub13(local38));
		}
		@Pc(62) Class316 local62 = this.aClass316_2;
		synchronized (this.aClass316_2) {
			this.aClass316_2.method7792((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)V")
	public void method872() {
		@Pc(6) Class316 local6 = this.aClass316_2;
		synchronized (this.aClass316_2) {
			this.aClass316_2.method7803();
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V")
	public void method873() {
		@Pc(6) Class316 local6 = this.aClass316_2;
		synchronized (this.aClass316_2) {
			this.aClass316_2.method7794();
		}
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(II)V")
	public void method874() {
		@Pc(12) Class316 local12 = this.aClass316_2;
		synchronized (this.aClass316_2) {
			this.aClass316_2.method7791(5);
		}
	}
}
