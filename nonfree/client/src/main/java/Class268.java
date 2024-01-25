import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class268 {

	@OriginalMember(owner = "client!q", name = "c", descriptor = "Lclient!fba;")
	private final Class102 aClass102_48 = new Class102(64);

	@OriginalMember(owner = "client!q", name = "g", descriptor = "Lclient!la;")
	private final Class196 aClass196_95;

	@OriginalMember(owner = "client!q", name = "b", descriptor = "I")
	public final int anInt7964;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lclient!mp;ILclient!la;)V")
	public Class268(@OriginalArg(0) Class222 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class196 arg2) {
		this.aClass196_95 = arg2;
		this.anInt7964 = this.aClass196_95.method5118(19);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(BI)Lclient!vl;")
	public Class359 method6925(@OriginalArg(1) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_48;
		@Pc(16) Class359 local16;
		synchronized (this.aClass102_48) {
			local16 = (Class359) this.aClass102_48.method2677((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class196 local29 = this.aClass196_95;
		@Pc(38) byte[] local38;
		synchronized (this.aClass196_95) {
			local38 = this.aClass196_95.method5102(19, arg0);
		}
		local16 = new Class359();
		if (local38 != null) {
			local16.method8443(new Class3_Sub3(local38));
		}
		@Pc(60) Class102 local60 = this.aClass102_48;
		synchronized (this.aClass102_48) {
			this.aClass102_48.method2674((long) arg0, local16);
			return local16;
		}
	}
}
