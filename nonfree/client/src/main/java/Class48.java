import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cw")
public final class Class48 {

	@OriginalMember(owner = "client!cw", name = "d", descriptor = "Lclient!wm;")
	private final Class267 aClass267_13 = new Class267(256);

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "Lclient!ph;")
	private final Class187 aClass187_25;

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lclient!kp;ILclient!ph;)V")
	public Class48(@OriginalArg(0) Class147 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class187 arg2) {
		this.aClass187_25 = arg2;
		this.aClass187_25.method4306(26);
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(BI)Lclient!sk;")
	public Class10_Sub1_Sub16 method1079(@OriginalArg(1) int arg0) {
		@Pc(6) Class267 local6 = this.aClass267_13;
		@Pc(18) Class10_Sub1_Sub16 local18;
		synchronized (this.aClass267_13) {
			local18 = (Class10_Sub1_Sub16) this.aClass267_13.method6014((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class187 local31 = this.aClass187_25;
		@Pc(40) byte[] local40;
		synchronized (this.aClass187_25) {
			local40 = this.aClass187_25.method4300(26, arg0);
		}
		local18 = new Class10_Sub1_Sub16();
		if (local40 != null) {
			local18.method4978(new Class10_Sub8(local40));
		}
		@Pc(68) Class267 local68 = this.aClass267_13;
		synchronized (this.aClass267_13) {
			this.aClass267_13.method6008(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)V")
	public void method1081() {
		@Pc(6) Class267 local6 = this.aClass267_13;
		synchronized (this.aClass267_13) {
			this.aClass267_13.method6011();
		}
	}

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "(I)V")
	public void method1082() {
		@Pc(13) Class267 local13 = this.aClass267_13;
		synchronized (this.aClass267_13) {
			this.aClass267_13.method6013();
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(II)V")
	public void method1086() {
		@Pc(2) Class267 local2 = this.aClass267_13;
		synchronized (this.aClass267_13) {
			this.aClass267_13.method6007(5);
		}
	}
}
