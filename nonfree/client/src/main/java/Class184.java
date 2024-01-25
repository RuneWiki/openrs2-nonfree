import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class184 {

	@OriginalMember(owner = "client!po", name = "i", descriptor = "Lclient!tl;")
	private Class227 aClass227_35 = new Class227(64);

	@OriginalMember(owner = "client!po", name = "q", descriptor = "Lclient!tl;")
	public Class227 aClass227_36 = new Class227(64);

	@OriginalMember(owner = "client!po", name = "l", descriptor = "Lclient!ui;")
	private final Class230 aClass230_66;

	@OriginalMember(owner = "client!po", name = "k", descriptor = "Lclient!ui;")
	public final Class230 aClass230_65;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lclient!gp;ILclient!ui;Lclient!ui;)V")
	public Class184(@OriginalArg(0) Class94 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class230 arg2, @OriginalArg(3) Class230 arg3) {
		this.aClass230_66 = arg2;
		this.aClass230_65 = arg3;
		this.aClass230_66.method4956(34);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Z)V")
	public void method4220() {
		@Pc(6) Class227 local6 = this.aClass227_35;
		synchronized (this.aClass227_35) {
			this.aClass227_35.method4871();
		}
		local6 = this.aClass227_36;
		synchronized (this.aClass227_36) {
			this.aClass227_36.method4871();
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
	public void method4221() {
		@Pc(6) Class227 local6 = this.aClass227_35;
		synchronized (this.aClass227_35) {
			this.aClass227_35.method4858();
		}
		local6 = this.aClass227_36;
		synchronized (this.aClass227_36) {
			this.aClass227_36.method4858();
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(II)V")
	public void method4223() {
		@Pc(6) Class227 local6 = this.aClass227_35;
		synchronized (this.aClass227_35) {
			this.aClass227_35.method4859(5);
		}
		local6 = this.aClass227_36;
		synchronized (this.aClass227_36) {
			this.aClass227_36.method4859(5);
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(BI)Lclient!s;")
	public Class206 method4224(@OriginalArg(1) int arg0) {
		@Pc(6) Class227 local6 = this.aClass227_35;
		@Pc(16) Class206 local16;
		synchronized (this.aClass227_35) {
			local16 = (Class206) this.aClass227_35.method4863((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass230_66.method4985(arg0, 34);
		local16 = new Class206();
		local16.aClass184_4 = this;
		if (local33 != null) {
			local16.method4643(new Class1_Sub33(local33));
		}
		@Pc(57) Class227 local57 = this.aClass227_35;
		synchronized (this.aClass227_35) {
			this.aClass227_35.method4865(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(III)V")
	public void method4225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass227_35 = new Class227(arg0);
		this.aClass227_36 = new Class227(arg1);
	}
}
