import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class116 {

	@OriginalMember(owner = "client!gn", name = "i", descriptor = "Lclient!uaa;")
	private final Class288 aClass288_23 = new Class288(64);

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "Lclient!gp;")
	private final Class117 aClass117_91;

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
	public final int anInt3312;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lclient!jc;ILclient!gp;)V")
	public Class116(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class117 arg2) {
		this.aClass117_91 = arg2;
		this.anInt3312 = this.aClass117_91.method2951(19);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IZ)Lclient!ad;")
	public Class7 method2926(@OriginalArg(0) int arg0) {
		@Pc(6) Class288 local6 = this.aClass288_23;
		@Pc(16) Class7 local16;
		synchronized (this.aClass288_23) {
			local16 = (Class7) this.aClass288_23.method6745((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class117 local29 = this.aClass117_91;
		@Pc(38) byte[] local38;
		synchronized (this.aClass117_91) {
			local38 = this.aClass117_91.method2962(arg0, 19);
		}
		local16 = new Class7();
		if (local38 != null) {
			local16.method269(new Class5_Sub3(local38));
		}
		@Pc(60) Class288 local60 = this.aClass288_23;
		synchronized (this.aClass288_23) {
			this.aClass288_23.method6746(local16, (long) arg0);
			return local16;
		}
	}
}
