import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class7 {

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "Lclient!tb;")
	private final Class313 aClass313_2 = new Class313(64);

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "Lclient!pl;")
	private final Class259 aClass259_9;

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
	public final int anInt296;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lclient!rf;ILclient!pl;)V")
	public Class7(@OriginalArg(0) Class284 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class259 arg2) {
		this.aClass259_9 = arg2;
		if (this.aClass259_9 == null) {
			this.anInt296 = 0;
		} else {
			this.anInt296 = this.aClass259_9.method5969(16);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)V")
	public void method166() {
		@Pc(6) Class313 local6 = this.aClass313_2;
		synchronized (this.aClass313_2) {
			this.aClass313_2.method6982(5);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
	public void method167() {
		@Pc(12) Class313 local12 = this.aClass313_2;
		synchronized (this.aClass313_2) {
			this.aClass313_2.method6977();
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
	public void method169() {
		@Pc(2) Class313 local2 = this.aClass313_2;
		synchronized (this.aClass313_2) {
			this.aClass313_2.method6983();
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZ)Lclient!hga;")
	public Class138 method171(@OriginalArg(0) int arg0) {
		@Pc(6) Class313 local6 = this.aClass313_2;
		@Pc(16) Class138 local16;
		synchronized (this.aClass313_2) {
			local16 = (Class138) this.aClass313_2.method6989((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class259 local34 = this.aClass259_9;
		@Pc(43) byte[] local43;
		synchronized (this.aClass259_9) {
			local43 = this.aClass259_9.method5985(arg0, 16);
		}
		local16 = new Class138();
		if (local43 != null) {
			local16.method3247(new Class2_Sub15(local43));
		}
		@Pc(65) Class313 local65 = this.aClass313_2;
		synchronized (this.aClass313_2) {
			this.aClass313_2.method6980((long) arg0, local16);
			return local16;
		}
	}
}
