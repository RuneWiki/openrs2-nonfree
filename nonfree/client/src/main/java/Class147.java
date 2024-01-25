import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class147 {

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "Lclient!tl;")
	private Class227 aClass227_23 = new Class227(64);

	@OriginalMember(owner = "client!lm", name = "h", descriptor = "Lclient!ui;")
	private final Class230 aClass230_53;

	static {
		new Class169("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
	}

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!gp;ILclient!ui;)V")
	public Class147(@OriginalArg(0) Class94 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class230 arg2) {
		this.aClass230_53 = arg2;
		if (this.aClass230_53 != null) {
			@Pc(20) int local20 = this.aClass230_53.method4969() - 1;
			this.aClass230_53.method4956(local20);
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Z)V")
	public void method2955() {
		@Pc(6) Class227 local6 = this.aClass227_23;
		synchronized (this.aClass227_23) {
			this.aClass227_23.method4858();
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(BI)Lclient!ga;")
	public Class87 method2957(@OriginalArg(1) int arg0) {
		@Pc(14) Class227 local14 = this.aClass227_23;
		@Pc(24) Class87 local24;
		synchronized (this.aClass227_23) {
			local24 = (Class87) this.aClass227_23.method4863((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(45) byte[] local45 = this.aClass230_53.method4985(Static314.method4641(arg0), Static32.method502(arg0));
		local24 = new Class87();
		if (local45 != null) {
			local24.method1631(new Class1_Sub33(local45));
		}
		@Pc(61) Class227 local61 = this.aClass227_23;
		synchronized (this.aClass227_23) {
			this.aClass227_23.method4865(local24, (long) arg0);
			return local24;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)V")
	public void method2960(@OriginalArg(1) int arg0) {
		@Pc(2) Class227 local2 = this.aClass227_23;
		synchronized (this.aClass227_23) {
			this.aClass227_23.method4871();
			this.aClass227_23 = new Class227(arg0);
		}
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(BI)V")
	public void method2961() {
		@Pc(14) Class227 local14 = this.aClass227_23;
		synchronized (this.aClass227_23) {
			this.aClass227_23.method4859(5);
		}
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(Z)V")
	public void method2962() {
		@Pc(12) Class227 local12 = this.aClass227_23;
		synchronized (this.aClass227_23) {
			this.aClass227_23.method4871();
		}
	}
}
