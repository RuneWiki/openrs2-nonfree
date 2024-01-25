import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class321 {

	@OriginalMember(owner = "client!tm", name = "h", descriptor = "Lclient!lga;")
	private Class207 aClass207_52 = new Class207(64);

	@OriginalMember(owner = "client!tm", name = "i", descriptor = "Lclient!sea;")
	private final Class308 aClass308_173;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lclient!ci;ILclient!sea;)V")
	public Class321(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class308 arg2) {
		this.aClass308_173 = arg2;
		if (this.aClass308_173 != null) {
			@Pc(20) int local20 = this.aClass308_173.method6564() - 1;
			this.aClass308_173.method6568(local20);
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZI)V")
	public void method7112() {
		@Pc(6) Class207 local6 = this.aClass207_52;
		synchronized (this.aClass207_52) {
			this.aClass207_52.method4397(5);
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V")
	public void method7114() {
		@Pc(12) Class207 local12 = this.aClass207_52;
		synchronized (this.aClass207_52) {
			this.aClass207_52.method4398();
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)V")
	public void method7115(@OriginalArg(1) int arg0) {
		@Pc(2) Class207 local2 = this.aClass207_52;
		synchronized (this.aClass207_52) {
			this.aClass207_52.method4392();
			this.aClass207_52 = new Class207(arg0);
		}
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(B)V")
	public void method7116() {
		@Pc(6) Class207 local6 = this.aClass207_52;
		synchronized (this.aClass207_52) {
			this.aClass207_52.method4392();
		}
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(II)Lclient!gga;")
	public Class116 method7117(@OriginalArg(1) int arg0) {
		@Pc(6) Class207 local6 = this.aClass207_52;
		@Pc(16) Class116 local16;
		synchronized (this.aClass207_52) {
			local16 = (Class116) this.aClass207_52.method4390((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class308 local29 = this.aClass308_173;
		@Pc(42) byte[] local42;
		synchronized (this.aClass308_173) {
			local42 = this.aClass308_173.method6569(Static259.method3770(arg0), Static191.method3059(arg0));
		}
		local16 = new Class116();
		if (local42 != null) {
			local16.method2692(new Class1_Sub3(local42));
		}
		@Pc(64) Class207 local64 = this.aClass207_52;
		synchronized (this.aClass207_52) {
			this.aClass207_52.method4391((long) arg0, local16);
			return local16;
		}
	}
}
