import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class41 {

	@OriginalMember(owner = "client!br", name = "i", descriptor = "Lclient!tb;")
	private final Class313 aClass313_11 = new Class313(64);

	@OriginalMember(owner = "client!br", name = "h", descriptor = "Lclient!pl;")
	private final Class259 aClass259_25;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!rf;ILclient!pl;)V")
	public Class41(@OriginalArg(0) Class284 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class259 arg2) {
		this.aClass259_25 = arg2;
		this.aClass259_25.method5969(31);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(B)V")
	public void method787() {
		@Pc(6) Class313 local6 = this.aClass313_11;
		synchronized (this.aClass313_11) {
			this.aClass313_11.method6983();
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(II)V")
	public void method789() {
		@Pc(6) Class313 local6 = this.aClass313_11;
		synchronized (this.aClass313_11) {
			this.aClass313_11.method6982(5);
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ZI)Lclient!df;")
	public Class75 method790(@OriginalArg(1) int arg0) {
		@Pc(6) Class313 local6 = this.aClass313_11;
		@Pc(16) Class75 local16;
		synchronized (this.aClass313_11) {
			local16 = (Class75) this.aClass313_11.method6989((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class259 local29 = this.aClass259_25;
		@Pc(47) byte[] local47;
		synchronized (this.aClass259_25) {
			local47 = this.aClass259_25.method5985(arg0, 31);
		}
		local16 = new Class75();
		if (local47 != null) {
			local16.method1364(new Class2_Sub15(local47));
		}
		@Pc(69) Class313 local69 = this.aClass313_11;
		synchronized (this.aClass313_11) {
			this.aClass313_11.method6980((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Z)V")
	public void method792() {
		@Pc(6) Class313 local6 = this.aClass313_11;
		synchronized (this.aClass313_11) {
			this.aClass313_11.method6977();
		}
	}
}
