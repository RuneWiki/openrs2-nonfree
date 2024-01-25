import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rt")
public final class Class223 {

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "Lclient!rp;")
	private final Class220 aClass220_49 = new Class220(64);

	@OriginalMember(owner = "client!rt", name = "g", descriptor = "Lclient!lt;")
	public final Class158 aClass158_76;

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "Lclient!lt;")
	private final Class158 aClass158_75;

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Lclient!cm;ILclient!lt;Lclient!lt;)V")
	public Class223(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class158 arg2, @OriginalArg(3) Class158 arg3) {
		this.aClass158_76 = arg3;
		this.aClass158_75 = arg2;
		this.aClass158_75.method3683(3);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V")
	public void method5040() {
		@Pc(2) Class220 local2 = this.aClass220_49;
		synchronized (this.aClass220_49) {
			this.aClass220_49.method4987();
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)V")
	public void method5041() {
		@Pc(6) Class220 local6 = this.aClass220_49;
		synchronized (this.aClass220_49) {
			this.aClass220_49.method4999();
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(II)Lclient!is;")
	public Class121 method5043(@OriginalArg(0) int arg0) {
		@Pc(6) Class220 local6 = this.aClass220_49;
		@Pc(16) Class121 local16;
		synchronized (this.aClass220_49) {
			local16 = (Class121) this.aClass220_49.method4990((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass158_75.method3672(arg0, 3);
		local16 = new Class121();
		local16.aClass223_2 = this;
		if (local33 != null) {
			local16.method2737(new Class6_Sub15(local33));
		}
		@Pc(52) Class220 local52 = this.aClass220_49;
		synchronized (this.aClass220_49) {
			this.aClass220_49.method4996(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(II)V")
	public void method5044() {
		@Pc(2) Class220 local2 = this.aClass220_49;
		synchronized (this.aClass220_49) {
			this.aClass220_49.method4998(5);
		}
	}
}
