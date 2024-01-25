import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class197 {

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "Lclient!lh;")
	private final Class151 aClass151_141 = new Class151(64);

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "Lclient!hh;")
	private final Class109 aClass109_73;

	static {
		new Class96("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
	}

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lclient!mt;ILclient!hh;)V")
	public Class197(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2) {
		this.aClass109_73 = arg2;
		this.aClass109_73.method2322(5);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)Lclient!nq;")
	public Class1_Sub1_Sub9 method4730(@OriginalArg(0) int arg0) {
		@Pc(6) Class151 local6 = this.aClass151_141;
		@Pc(16) Class1_Sub1_Sub9 local16;
		synchronized (this.aClass151_141) {
			local16 = (Class1_Sub1_Sub9) this.aClass151_141.method3288((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass109_73.method2349(5, arg0);
		local16 = new Class1_Sub1_Sub9();
		if (local33 != null) {
			local16.method3777(new Class1_Sub14(local33));
		}
		@Pc(53) Class151 local53 = this.aClass151_141;
		synchronized (this.aClass151_141) {
			this.aClass151_141.method3291((long) arg0, local16);
			return local16;
		}
	}
}
