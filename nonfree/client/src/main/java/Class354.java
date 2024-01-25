import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wca")
public final class Class354 {

	@OriginalMember(owner = "client!wca", name = "j", descriptor = "Lclient!tb;")
	private final Class313 aClass313_61 = new Class313(64);

	@OriginalMember(owner = "client!wca", name = "e", descriptor = "Lclient!pl;")
	private final Class259 aClass259_168;

	@OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(Lclient!rf;ILclient!pl;)V")
	public Class354(@OriginalArg(0) Class284 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class259 arg2) {
		this.aClass259_168 = arg2;
		this.aClass259_168.method5969(32);
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IB)Lclient!cg;")
	public Class54 method7795(@OriginalArg(0) int arg0) {
		@Pc(11) Class313 local11 = this.aClass313_61;
		@Pc(21) Class54 local21;
		synchronized (this.aClass313_61) {
			local21 = (Class54) this.aClass313_61.method6989((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class259 local34 = this.aClass259_168;
		@Pc(43) byte[] local43;
		synchronized (this.aClass259_168) {
			local43 = this.aClass259_168.method5985(arg0, 32);
		}
		local21 = new Class54();
		if (local43 != null) {
			local21.method968(new Class2_Sub15(local43));
		}
		@Pc(65) Class313 local65 = this.aClass313_61;
		synchronized (this.aClass313_61) {
			this.aClass313_61.method6980((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!wca", name = "c", descriptor = "(B)V")
	public void method7797() {
		@Pc(2) Class313 local2 = this.aClass313_61;
		synchronized (this.aClass313_61) {
			this.aClass313_61.method6977();
		}
	}

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "(IB)V")
	public void method7799() {
		@Pc(2) Class313 local2 = this.aClass313_61;
		synchronized (this.aClass313_61) {
			this.aClass313_61.method6982(5);
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(I)V")
	public void method7800() {
		@Pc(6) Class313 local6 = this.aClass313_61;
		synchronized (this.aClass313_61) {
			this.aClass313_61.method6983();
		}
	}
}
