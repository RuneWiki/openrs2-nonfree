import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class116 {

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "Lclient!rp;")
	private final Class220 aClass220_19 = new Class220(64);

	@OriginalMember(owner = "client!ij", name = "i", descriptor = "Lclient!lt;")
	private final Class158 aClass158_33;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lclient!cm;ILclient!lt;)V")
	public Class116(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class158 arg2) {
		this.aClass158_33 = arg2;
		if (this.aClass158_33 != null) {
			this.aClass158_33.method3683(35);
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)V")
	public void method2662() {
		@Pc(2) Class220 local2 = this.aClass220_19;
		synchronized (this.aClass220_19) {
			this.aClass220_19.method4999();
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IB)Lclient!m;")
	public Class160 method2664(@OriginalArg(0) int arg0) {
		@Pc(6) Class220 local6 = this.aClass220_19;
		@Pc(16) Class160 local16;
		synchronized (this.aClass220_19) {
			local16 = (Class160) this.aClass220_19.method4990((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass158_33.method3672(arg0, 35);
		local16 = new Class160();
		if (local33 != null) {
			local16.method3707(new Class6_Sub15(local33));
		}
		local16.method3708();
		@Pc(60) Class220 local60 = this.aClass220_19;
		synchronized (this.aClass220_19) {
			this.aClass220_19.method4996(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
	public void method2667() {
		@Pc(2) Class220 local2 = this.aClass220_19;
		synchronized (this.aClass220_19) {
			this.aClass220_19.method4987();
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)V")
	public void method2668() {
		@Pc(13) Class220 local13 = this.aClass220_19;
		synchronized (this.aClass220_19) {
			this.aClass220_19.method4998(5);
		}
	}
}
