import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class Class165 {

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "Lclient!wm;")
	private final Class267 aClass267_44 = new Class267(64);

	@OriginalMember(owner = "client!ml", name = "k", descriptor = "Lclient!wm;")
	public final Class267 aClass267_45 = new Class267(2);

	@OriginalMember(owner = "client!ml", name = "i", descriptor = "Lclient!ph;")
	private final Class187 aClass187_80;

	@OriginalMember(owner = "client!ml", name = "h", descriptor = "Lclient!ph;")
	public final Class187 aClass187_79;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!kp;ILclient!ph;Lclient!ph;)V")
	public Class165(@OriginalArg(0) Class147 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class187 arg2, @OriginalArg(3) Class187 arg3) {
		this.aClass187_80 = arg2;
		this.aClass187_79 = arg3;
		this.aClass187_80.method4306(33);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)V")
	public void method3681() {
		@Pc(2) Class267 local2 = this.aClass267_44;
		synchronized (this.aClass267_44) {
			this.aClass267_44.method6007(5);
		}
		local2 = this.aClass267_45;
		synchronized (this.aClass267_45) {
			this.aClass267_45.method6007(5);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
	public void method3682() {
		@Pc(6) Class267 local6 = this.aClass267_44;
		synchronized (this.aClass267_44) {
			this.aClass267_44.method6013();
		}
		local6 = this.aClass267_45;
		synchronized (this.aClass267_45) {
			this.aClass267_45.method6013();
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IZ)Lclient!uo;")
	public Class252 method3683(@OriginalArg(0) int arg0) {
		@Pc(6) Class267 local6 = this.aClass267_44;
		@Pc(16) Class252 local16;
		synchronized (this.aClass267_44) {
			local16 = (Class252) this.aClass267_44.method6014((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class187 local37 = this.aClass187_80;
		@Pc(46) byte[] local46;
		synchronized (this.aClass187_80) {
			local46 = this.aClass187_80.method4300(33, arg0);
		}
		local16 = new Class252();
		local16.aClass165_2 = this;
		if (local46 != null) {
			local16.method5449(new Class10_Sub8(local46));
		}
		@Pc(71) Class267 local71 = this.aClass267_44;
		synchronized (this.aClass267_44) {
			this.aClass267_44.method6008(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V")
	public void method3685() {
		@Pc(6) Class267 local6 = this.aClass267_44;
		synchronized (this.aClass267_44) {
			this.aClass267_44.method6011();
		}
		local6 = this.aClass267_45;
		synchronized (this.aClass267_45) {
			this.aClass267_45.method6011();
		}
	}
}
