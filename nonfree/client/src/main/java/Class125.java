import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class125 {

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "Lclient!fba;")
	private final Class102 aClass102_24 = new Class102(64);

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "Lclient!la;")
	private final Class196 aClass196_37;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lclient!mp;ILclient!la;)V")
	public Class125(@OriginalArg(0) Class222 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class196 arg2) {
		this.aClass196_37 = arg2;
		this.aClass196_37.method5118(5);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)Lclient!pca;")
	public Class3_Sub4_Sub18 method3116(@OriginalArg(0) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_24;
		@Pc(16) Class3_Sub4_Sub18 local16;
		synchronized (this.aClass102_24) {
			local16 = (Class3_Sub4_Sub18) this.aClass102_24.method2677((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class196 local29 = this.aClass196_37;
		@Pc(38) byte[] local38;
		synchronized (this.aClass196_37) {
			local38 = this.aClass196_37.method5102(5, arg0);
		}
		local16 = new Class3_Sub4_Sub18();
		if (local38 != null) {
			local16.method6640(new Class3_Sub3(local38));
		}
		@Pc(60) Class102 local60 = this.aClass102_24;
		synchronized (this.aClass102_24) {
			this.aClass102_24.method2674((long) arg0, local16);
			return local16;
		}
	}
}
