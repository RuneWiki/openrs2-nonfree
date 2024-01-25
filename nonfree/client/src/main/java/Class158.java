import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class158 {

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "Lclient!wm;")
	private final Class267 aClass267_40 = new Class267(16);

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "Lclient!ph;")
	private final Class187 aClass187_77;

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lclient!kp;ILclient!ph;)V")
	public Class158(@OriginalArg(0) Class147 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class187 arg2) {
		this.aClass187_77 = arg2;
		this.aClass187_77.method4306(30);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)V")
	public void method3475() {
		@Pc(2) Class267 local2 = this.aClass267_40;
		synchronized (this.aClass267_40) {
			this.aClass267_40.method6007(5);
		}
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(II)Lclient!oh;")
	public Class179 method3476(@OriginalArg(1) int arg0) {
		@Pc(6) Class267 local6 = this.aClass267_40;
		@Pc(16) Class179 local16;
		synchronized (this.aClass267_40) {
			local16 = (Class179) this.aClass267_40.method6014((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class187 local29 = this.aClass187_77;
		@Pc(38) byte[] local38;
		synchronized (this.aClass187_77) {
			local38 = this.aClass187_77.method4300(30, arg0);
		}
		local16 = new Class179();
		if (local38 != null) {
			local16.method4079(new Class10_Sub8(local38));
		}
		@Pc(60) Class267 local60 = this.aClass267_40;
		synchronized (this.aClass267_40) {
			this.aClass267_40.method6008(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V")
	public void method3480() {
		@Pc(2) Class267 local2 = this.aClass267_40;
		synchronized (this.aClass267_40) {
			this.aClass267_40.method6013();
		}
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)V")
	public void method3481() {
		@Pc(6) Class267 local6 = this.aClass267_40;
		synchronized (this.aClass267_40) {
			this.aClass267_40.method6011();
		}
	}
}
