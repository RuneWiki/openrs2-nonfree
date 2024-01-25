import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2 {

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "Lclient!wm;")
	private Class267 aClass267_1 = new Class267(64);

	@OriginalMember(owner = "client!aa", name = "p", descriptor = "Lclient!wm;")
	public Class267 aClass267_2 = new Class267(64);

	@OriginalMember(owner = "client!aa", name = "o", descriptor = "Lclient!ph;")
	public final Class187 aClass187_2;

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "Lclient!ph;")
	private final Class187 aClass187_1;

	static {
		new Class182("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lclient!kp;ILclient!ph;Lclient!ph;)V")
	public Class2(@OriginalArg(0) Class147 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class187 arg2, @OriginalArg(3) Class187 arg3) {
		this.aClass187_2 = arg3;
		this.aClass187_1 = arg2;
		this.aClass187_1.method4306(34);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)V")
	public void method7() {
		@Pc(8) Class267 local8 = this.aClass267_1;
		synchronized (this.aClass267_1) {
			this.aClass267_1.method6007(5);
		}
		local8 = this.aClass267_2;
		synchronized (this.aClass267_2) {
			this.aClass267_2.method6007(5);
		}
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)V")
	public void method9() {
		@Pc(2) Class267 local2 = this.aClass267_1;
		synchronized (this.aClass267_1) {
			this.aClass267_1.method6011();
		}
		local2 = this.aClass267_2;
		synchronized (this.aClass267_2) {
			this.aClass267_2.method6011();
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIZ)V")
	public void method10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass267_1 = new Class267(arg0);
		this.aClass267_2 = new Class267(arg1);
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(B)V")
	public void method11() {
		@Pc(2) Class267 local2 = this.aClass267_1;
		synchronized (this.aClass267_1) {
			this.aClass267_1.method6013();
		}
		local2 = this.aClass267_2;
		synchronized (this.aClass267_2) {
			this.aClass267_2.method6013();
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)Lclient!aq;")
	public Class14 method12(@OriginalArg(0) int arg0) {
		@Pc(6) Class267 local6 = this.aClass267_1;
		@Pc(16) Class14 local16;
		synchronized (this.aClass267_1) {
			local16 = (Class14) this.aClass267_1.method6014((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class187 local37 = this.aClass187_1;
		@Pc(46) byte[] local46;
		synchronized (this.aClass187_1) {
			local46 = this.aClass187_1.method4300(34, arg0);
		}
		local16 = new Class14();
		local16.aClass2_1 = this;
		if (local46 != null) {
			local16.method246(new Class10_Sub8(local46));
		}
		@Pc(71) Class267 local71 = this.aClass267_1;
		synchronized (this.aClass267_1) {
			this.aClass267_1.method6008(local16, (long) arg0);
			return local16;
		}
	}
}
