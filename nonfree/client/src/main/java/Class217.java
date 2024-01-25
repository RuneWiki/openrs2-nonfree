import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class217 {

	@OriginalMember(owner = "client!md", name = "c", descriptor = "Lclient!tb;")
	private final Class313 aClass313_33 = new Class313(128);

	@OriginalMember(owner = "client!md", name = "b", descriptor = "Lclient!pl;")
	private final Class259 aClass259_104;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!rf;ILclient!pl;)V")
	public Class217(@OriginalArg(0) Class284 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class259 arg2) {
		this.aClass259_104 = arg2;
		if (this.aClass259_104 != null) {
			@Pc(20) int local20 = this.aClass259_104.method5962() - 1;
			this.aClass259_104.method5969(local20);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(II)Lclient!ss;")
	public Class309 method5012(@OriginalArg(0) int arg0) {
		@Pc(6) Class313 local6 = this.aClass313_33;
		@Pc(21) Class309 local21;
		synchronized (this.aClass313_33) {
			local21 = (Class309) this.aClass313_33.method6989((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(42) byte[] local42 = this.aClass259_104.method5985(Static248.method3898(arg0), Static415.method6027(arg0));
		local21 = new Class309();
		if (local42 != null) {
			local21.method6907(new Class2_Sub15(local42));
		}
		@Pc(58) Class313 local58 = this.aClass313_33;
		synchronized (this.aClass313_33) {
			this.aClass313_33.method6980((long) arg0, local21);
			return local21;
		}
	}
}
