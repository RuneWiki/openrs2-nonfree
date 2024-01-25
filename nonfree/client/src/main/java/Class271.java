import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wt")
public final class Class271 {

	@OriginalMember(owner = "client!wt", name = "k", descriptor = "Lclient!wm;")
	private final Class267 aClass267_85 = new Class267(64);

	@OriginalMember(owner = "client!wt", name = "g", descriptor = "Lclient!ph;")
	private final Class187 aClass187_134;

	@OriginalMember(owner = "client!wt", name = "d", descriptor = "I")
	public final int anInt7591;

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lclient!kp;ILclient!ph;)V")
	public Class271(@OriginalArg(0) Class147 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class187 arg2) {
		this.aClass187_134 = arg2;
		if (this.aClass187_134 == null) {
			this.anInt7591 = 0;
		} else {
			this.anInt7591 = this.aClass187_134.method4306(16);
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V")
	public void method6054() {
		@Pc(7) Class267 local7 = this.aClass267_85;
		synchronized (this.aClass267_85) {
			this.aClass267_85.method6011();
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(BI)Lclient!f;")
	public Class73 method6056(@OriginalArg(1) int arg0) {
		@Pc(6) Class267 local6 = this.aClass267_85;
		@Pc(16) Class73 local16;
		synchronized (this.aClass267_85) {
			local16 = (Class73) this.aClass267_85.method6014((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class187 local29 = this.aClass187_134;
		@Pc(38) byte[] local38;
		synchronized (this.aClass187_134) {
			local38 = this.aClass187_134.method4300(16, arg0);
		}
		local16 = new Class73();
		if (local38 != null) {
			local16.method1849(new Class10_Sub8(local38));
		}
		@Pc(60) Class267 local60 = this.aClass267_85;
		synchronized (this.aClass267_85) {
			this.aClass267_85.method6008(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(I)V")
	public void method6058() {
		@Pc(10) Class267 local10 = this.aClass267_85;
		synchronized (this.aClass267_85) {
			this.aClass267_85.method6013();
		}
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(II)V")
	public void method6061() {
		@Pc(2) Class267 local2 = this.aClass267_85;
		synchronized (this.aClass267_85) {
			this.aClass267_85.method6007(5);
		}
	}
}
