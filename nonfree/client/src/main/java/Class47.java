import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public final class Class47 {

	@OriginalMember(owner = "client!cs", name = "e", descriptor = "Lclient!tl;")
	private final Class227 aClass227_6 = new Class227(64);

	@OriginalMember(owner = "client!cs", name = "i", descriptor = "Lclient!ui;")
	private final Class230 aClass230_18;

	static {
		new Class169("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!gp;ILclient!ui;)V")
	public Class47(@OriginalArg(0) Class94 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class230 arg2) {
		this.aClass230_18 = arg2;
		if (this.aClass230_18 != null) {
			this.aClass230_18.method4956(11);
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)V")
	public void method887() {
		@Pc(2) Class227 local2 = this.aClass227_6;
		synchronized (this.aClass227_6) {
			this.aClass227_6.method4871();
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)Lclient!bf;")
	public Class24 method888(@OriginalArg(1) int arg0) {
		@Pc(6) Class227 local6 = this.aClass227_6;
		@Pc(16) Class24 local16;
		synchronized (this.aClass227_6) {
			local16 = (Class24) this.aClass227_6.method4863((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass230_18.method4985(arg0, 11);
		local16 = new Class24();
		if (local33 != null) {
			local16.method372(new Class1_Sub33(local33));
		}
		@Pc(49) Class227 local49 = this.aClass227_6;
		synchronized (this.aClass227_6) {
			this.aClass227_6.method4865(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(BI)V")
	public void method890() {
		@Pc(10) Class227 local10 = this.aClass227_6;
		synchronized (this.aClass227_6) {
			this.aClass227_6.method4859(5);
		}
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(B)V")
	public void method892() {
		@Pc(2) Class227 local2 = this.aClass227_6;
		synchronized (this.aClass227_6) {
			this.aClass227_6.method4858();
		}
	}
}
