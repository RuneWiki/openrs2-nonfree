import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class223 {

	@OriginalMember(owner = "client!si", name = "e", descriptor = "Lclient!wm;")
	private final Class267 aClass267_65 = new Class267(64);

	@OriginalMember(owner = "client!si", name = "i", descriptor = "Lclient!ph;")
	private final Class187 aClass187_112;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Lclient!kp;ILclient!ph;)V")
	public Class223(@OriginalArg(0) Class147 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class187 arg2) {
		this.aClass187_112 = arg2;
		this.aClass187_112.method4306(32);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V")
	public void method4949() {
		@Pc(12) Class267 local12 = this.aClass267_65;
		synchronized (this.aClass267_65) {
			this.aClass267_65.method6011();
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
	public void method4950() {
		@Pc(2) Class267 local2 = this.aClass267_65;
		synchronized (this.aClass267_65) {
			this.aClass267_65.method6013();
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(II)Lclient!ae;")
	public Class6 method4952(@OriginalArg(0) int arg0) {
		@Pc(6) Class267 local6 = this.aClass267_65;
		@Pc(29) Class6 local29;
		synchronized (this.aClass267_65) {
			local29 = (Class6) this.aClass267_65.method6014((long) arg0);
		}
		if (local29 != null) {
			return local29;
		}
		@Pc(42) Class187 local42 = this.aClass187_112;
		@Pc(51) byte[] local51;
		synchronized (this.aClass187_112) {
			local51 = this.aClass187_112.method4300(32, arg0);
		}
		local29 = new Class6();
		if (local51 != null) {
			local29.method34(new Class10_Sub8(local51));
		}
		@Pc(73) Class267 local73 = this.aClass267_65;
		synchronized (this.aClass267_65) {
			this.aClass267_65.method6008(local29, (long) arg0);
			return local29;
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ZI)V")
	public void method4953() {
		@Pc(10) Class267 local10 = this.aClass267_65;
		synchronized (this.aClass267_65) {
			this.aClass267_65.method6007(5);
		}
	}
}
