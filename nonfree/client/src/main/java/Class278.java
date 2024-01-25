import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pga")
public final class Class278 {

	@OriginalMember(owner = "client!pga", name = "d", descriptor = "Lclient!pja;")
	private final Class279 aClass279_43 = new Class279(64);

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "Lclient!gj;")
	private final Class143 aClass143_111;

	@OriginalMember(owner = "client!pga", name = "g", descriptor = "I")
	public final int anInt7822;

	@OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Lclient!im;ILclient!gj;)V")
	public Class278(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class143 arg2) {
		this.aClass143_111 = arg2;
		this.anInt7822 = this.aClass143_111.method3123(19);
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(ZI)Lclient!vea;")
	public Class372 method6562(@OriginalArg(1) int arg0) {
		@Pc(6) Class279 local6 = this.aClass279_43;
		@Pc(16) Class372 local16;
		synchronized (this.aClass279_43) {
			local16 = (Class372) this.aClass279_43.method6631((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(41) Class143 local41 = this.aClass143_111;
		@Pc(50) byte[] local50;
		synchronized (this.aClass143_111) {
			local50 = this.aClass143_111.method3125(arg0, 19);
		}
		local16 = new Class372();
		if (local50 != null) {
			local16.method8317(new Class3_Sub17(local50));
		}
		@Pc(72) Class279 local72 = this.aClass279_43;
		synchronized (this.aClass279_43) {
			this.aClass279_43.method6635(local16, (long) arg0);
			return local16;
		}
	}
}
