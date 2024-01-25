import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class299 {

	@OriginalMember(owner = "client!qd", name = "j", descriptor = "Lclient!tja;")
	private final Class352 aClass352_53 = new Class352(64);

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "Lclient!bt;")
	private final Class34 aClass34_103;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!mja;ILclient!bt;)V")
	public Class299(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2) {
		this.aClass34_103 = arg2;
		this.aClass34_103.method1233(31);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(BI)V")
	public void method6591() {
		@Pc(2) Class352 local2 = this.aClass352_53;
		synchronized (this.aClass352_53) {
			this.aClass352_53.method7663(5);
		}
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(BI)Lclient!lha;")
	public Class212 method6592(@OriginalArg(1) int arg0) {
		@Pc(6) Class352 local6 = this.aClass352_53;
		@Pc(16) Class212 local16;
		synchronized (this.aClass352_53) {
			local16 = (Class212) this.aClass352_53.method7653((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class34 local29 = this.aClass34_103;
		@Pc(38) byte[] local38;
		synchronized (this.aClass34_103) {
			local38 = this.aClass34_103.method1239(31, arg0);
		}
		local16 = new Class212();
		if (local38 != null) {
			local16.method4659(new Class4_Sub11(local38));
		}
		@Pc(65) Class352 local65 = this.aClass352_53;
		synchronized (this.aClass352_53) {
			this.aClass352_53.method7655((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
	public void method6595() {
		@Pc(2) Class352 local2 = this.aClass352_53;
		synchronized (this.aClass352_53) {
			this.aClass352_53.method7659();
		}
	}

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V")
	public void method6599() {
		@Pc(2) Class352 local2 = this.aClass352_53;
		synchronized (this.aClass352_53) {
			this.aClass352_53.method7656();
		}
	}
}
