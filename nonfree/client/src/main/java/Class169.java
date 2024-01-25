import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class169 {

	@OriginalMember(owner = "client!mn", name = "k", descriptor = "Lclient!rp;")
	private final Class220 aClass220_35 = new Class220(128);

	@OriginalMember(owner = "client!mn", name = "j", descriptor = "Lclient!lt;")
	private final Class158 aClass158_57;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lclient!cm;ILclient!lt;)V")
	public Class169(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class158 arg2) {
		this.aClass158_57 = arg2;
		this.aClass158_57.method3683(1);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)V")
	public void method3851() {
		@Pc(8) Class220 local8 = this.aClass220_35;
		synchronized (this.aClass220_35) {
			this.aClass220_35.method4998(5);
		}
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)V")
	public void method3855() {
		@Pc(2) Class220 local2 = this.aClass220_35;
		synchronized (this.aClass220_35) {
			this.aClass220_35.method4987();
		}
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)V")
	public void method3856() {
		@Pc(2) Class220 local2 = this.aClass220_35;
		synchronized (this.aClass220_35) {
			this.aClass220_35.method4999();
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZI)Lclient!tg;")
	public Class234 method3857(@OriginalArg(1) int arg0) {
		@Pc(6) Class220 local6 = this.aClass220_35;
		@Pc(16) Class234 local16;
		synchronized (this.aClass220_35) {
			local16 = (Class234) this.aClass220_35.method4990((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass158_57.method3672(arg0, 1);
		local16 = new Class234();
		if (local33 != null) {
			local16.method5255(new Class6_Sub15(local33));
		}
		@Pc(49) Class220 local49 = this.aClass220_35;
		synchronized (this.aClass220_35) {
			this.aClass220_35.method4996(local16, (long) arg0);
			return local16;
		}
	}
}
