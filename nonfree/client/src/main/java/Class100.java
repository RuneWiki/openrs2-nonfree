import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gv")
public final class Class100 {

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "Lclient!wm;")
	private final Class267 aClass267_25 = new Class267(64);

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "Lclient!ph;")
	public final Class187 aClass187_58;

	@OriginalMember(owner = "client!gv", name = "e", descriptor = "Lclient!ph;")
	private final Class187 aClass187_60;

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lclient!kp;ILclient!ph;Lclient!ph;)V")
	public Class100(@OriginalArg(0) Class147 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class187 arg2, @OriginalArg(3) Class187 arg3) {
		this.aClass187_58 = arg3;
		this.aClass187_60 = arg2;
		this.aClass187_60.method4306(3);
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZI)Lclient!mm;")
	public Class166 method2412(@OriginalArg(1) int arg0) {
		@Pc(6) Class267 local6 = this.aClass267_25;
		@Pc(16) Class166 local16;
		synchronized (this.aClass267_25) {
			local16 = (Class166) this.aClass267_25.method6014((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class187 local35 = this.aClass187_60;
		@Pc(44) byte[] local44;
		synchronized (this.aClass187_60) {
			local44 = this.aClass187_60.method4300(3, arg0);
		}
		local16 = new Class166();
		local16.aClass100_2 = this;
		if (local44 != null) {
			local16.method3697(new Class10_Sub8(local44));
		}
		@Pc(69) Class267 local69 = this.aClass267_25;
		synchronized (this.aClass267_25) {
			this.aClass267_25.method6008(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V")
	public void method2413() {
		@Pc(2) Class267 local2 = this.aClass267_25;
		synchronized (this.aClass267_25) {
			this.aClass267_25.method6013();
		}
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)V")
	public void method2414() {
		@Pc(2) Class267 local2 = this.aClass267_25;
		synchronized (this.aClass267_25) {
			this.aClass267_25.method6011();
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(II)V")
	public void method2415() {
		@Pc(6) Class267 local6 = this.aClass267_25;
		synchronized (this.aClass267_25) {
			this.aClass267_25.method6007(5);
		}
	}
}
