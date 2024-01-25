import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class258 {

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "Lclient!rp;")
	private final Class220 aClass220_57 = new Class220(64);

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "Lclient!lt;")
	private final Class158 aClass158_95;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!cm;ILclient!lt;)V")
	public Class258(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class158 arg2) {
		this.aClass158_95 = arg2;
		if (this.aClass158_95 != null) {
			this.aClass158_95.method3683(11);
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)Lclient!vr;")
	public Class255 method5882(@OriginalArg(1) int arg0) {
		@Pc(6) Class220 local6 = this.aClass220_57;
		@Pc(18) Class255 local18;
		synchronized (this.aClass220_57) {
			local18 = (Class255) this.aClass220_57.method4990((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(35) byte[] local35 = this.aClass158_95.method3672(arg0, 11);
		local18 = new Class255();
		if (local35 != null) {
			local18.method5851(new Class6_Sub15(local35));
		}
		@Pc(58) Class220 local58 = this.aClass220_57;
		synchronized (this.aClass220_57) {
			this.aClass220_57.method4996(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
	public void method5883() {
		@Pc(6) Class220 local6 = this.aClass220_57;
		synchronized (this.aClass220_57) {
			this.aClass220_57.method4999();
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
	public void method5884() {
		@Pc(2) Class220 local2 = this.aClass220_57;
		synchronized (this.aClass220_57) {
			this.aClass220_57.method4987();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V")
	public void method5886() {
		@Pc(9) Class220 local9 = this.aClass220_57;
		synchronized (this.aClass220_57) {
			this.aClass220_57.method4998(5);
		}
	}
}
