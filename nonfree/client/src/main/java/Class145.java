import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public final class Class145 {

	@OriginalMember(owner = "client!kt", name = "f", descriptor = "Lclient!rp;")
	private final Class220 aClass220_27 = new Class220(64);

	@OriginalMember(owner = "client!kt", name = "l", descriptor = "Lclient!rp;")
	public final Class220 aClass220_28 = new Class220(2);

	@OriginalMember(owner = "client!kt", name = "k", descriptor = "Lclient!lt;")
	public final Class158 aClass158_47;

	@OriginalMember(owner = "client!kt", name = "d", descriptor = "Lclient!lt;")
	private final Class158 aClass158_46;

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lclient!cm;ILclient!lt;Lclient!lt;)V")
	public Class145(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class158 arg2, @OriginalArg(3) Class158 arg3) {
		this.aClass158_47 = arg3;
		this.aClass158_46 = arg2;
		this.aClass158_46.method3683(33);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)V")
	public void method3330() {
		@Pc(2) Class220 local2 = this.aClass220_27;
		synchronized (this.aClass220_27) {
			this.aClass220_27.method4999();
		}
		local2 = this.aClass220_28;
		synchronized (this.aClass220_28) {
			this.aClass220_28.method4999();
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(II)Lclient!kf;")
	public Class138 method3331(@OriginalArg(1) int arg0) {
		@Pc(6) Class220 local6 = this.aClass220_27;
		@Pc(18) Class138 local18;
		synchronized (this.aClass220_27) {
			local18 = (Class138) this.aClass220_27.method4990((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(35) byte[] local35 = this.aClass158_46.method3672(arg0, 33);
		local18 = new Class138();
		local18.aClass145_2 = this;
		if (local35 != null) {
			local18.method3186(new Class6_Sub15(local35));
		}
		@Pc(54) Class220 local54 = this.aClass220_27;
		synchronized (this.aClass220_27) {
			this.aClass220_27.method4996(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "(I)V")
	public void method3333() {
		@Pc(6) Class220 local6 = this.aClass220_27;
		synchronized (this.aClass220_27) {
			this.aClass220_27.method4987();
		}
		local6 = this.aClass220_28;
		synchronized (this.aClass220_28) {
			this.aClass220_28.method4987();
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IZ)V")
	public void method3335() {
		@Pc(2) Class220 local2 = this.aClass220_27;
		synchronized (this.aClass220_27) {
			this.aClass220_27.method4998(5);
		}
		local2 = this.aClass220_28;
		synchronized (this.aClass220_28) {
			this.aClass220_28.method4998(5);
		}
	}
}
