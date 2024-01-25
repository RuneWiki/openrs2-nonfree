import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class147 {

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "Lclient!rp;")
	private final Class220 aClass220_30 = new Class220(16);

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "Lclient!lt;")
	private final Class158 aClass158_49;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lclient!cm;ILclient!lt;)V")
	public Class147(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class158 arg2) {
		this.aClass158_49 = arg2;
		this.aClass158_49.method3683(30);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V")
	public void method3373() {
		@Pc(12) Class220 local12 = this.aClass220_30;
		synchronized (this.aClass220_30) {
			this.aClass220_30.method4999();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZ)V")
	public void method3374() {
		@Pc(2) Class220 local2 = this.aClass220_30;
		synchronized (this.aClass220_30) {
			this.aClass220_30.method4998(5);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BI)Lclient!lu;")
	public Class159 method3375(@OriginalArg(1) int arg0) {
		@Pc(6) Class220 local6 = this.aClass220_30;
		@Pc(18) Class159 local18;
		synchronized (this.aClass220_30) {
			local18 = (Class159) this.aClass220_30.method4990((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(44) byte[] local44 = this.aClass158_49.method3672(arg0, 30);
		local18 = new Class159();
		if (local44 != null) {
			local18.method3703(new Class6_Sub15(local44));
		}
		@Pc(60) Class220 local60 = this.aClass220_30;
		synchronized (this.aClass220_30) {
			this.aClass220_30.method4996(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(Z)V")
	public void method3377() {
		@Pc(6) Class220 local6 = this.aClass220_30;
		synchronized (this.aClass220_30) {
			this.aClass220_30.method4987();
		}
	}
}
