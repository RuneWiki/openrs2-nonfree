import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class352 {

	@OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
	public int anInt9370;

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "Lclient!iha;")
	private final Class168 aClass168_83 = new Class168(64);

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "Lclient!iha;")
	public final Class168 aClass168_84 = new Class168(60);

	@OriginalMember(owner = "client!tj", name = "n", descriptor = "Lclient!gda;")
	public final Class126 aClass126_263;

	@OriginalMember(owner = "client!tj", name = "m", descriptor = "Lclient!gda;")
	private final Class126 aClass126_264;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lclient!po;ILclient!gda;Lclient!gda;)V")
	public Class352(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class126 arg2, @OriginalArg(3) Class126 arg3) {
		this.aClass126_263 = arg3;
		this.aClass126_264 = arg2;
		@Pc(26) int local26 = this.aClass126_264.method3082() - 1;
		this.aClass126_264.method3062(local26);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
	public void method8005() {
		@Pc(2) Class168 local2 = this.aClass168_83;
		synchronized (this.aClass168_83) {
			this.aClass168_83.method3856();
		}
		local2 = this.aClass168_84;
		synchronized (this.aClass168_84) {
			this.aClass168_84.method3856();
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(BI)Lclient!pv;")
	public Class295 method8006(@OriginalArg(1) int arg0) {
		@Pc(14) Class168 local14 = this.aClass168_83;
		@Pc(24) Class295 local24;
		synchronized (this.aClass168_83) {
			local24 = (Class295) this.aClass168_83.method3860((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(38) Class126 local38 = this.aClass126_264;
		@Pc(51) byte[] local51;
		synchronized (this.aClass126_264) {
			local51 = this.aClass126_264.method3086(Static211.method3413(arg0), Static370.method5510(arg0));
		}
		local24 = new Class295();
		local24.anInt7615 = arg0;
		local24.aClass352_2 = this;
		if (local51 != null) {
			local24.method6634(new Class5_Sub36(local51));
		}
		@Pc(81) Class168 local81 = this.aClass168_83;
		synchronized (this.aClass168_83) {
			this.aClass168_83.method3853((long) arg0, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)V")
	public void method8009(@OriginalArg(0) int arg0) {
		this.anInt9370 = arg0;
		@Pc(15) Class168 local15 = this.aClass168_84;
		synchronized (this.aClass168_84) {
			this.aClass168_84.method3862();
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
	public void method8010() {
		@Pc(6) Class168 local6 = this.aClass168_83;
		synchronized (this.aClass168_83) {
			this.aClass168_83.method3862();
		}
		local6 = this.aClass168_84;
		synchronized (this.aClass168_84) {
			this.aClass168_84.method3862();
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZI)V")
	public void method8012() {
		@Pc(6) Class168 local6 = this.aClass168_83;
		synchronized (this.aClass168_83) {
			this.aClass168_83.method3852(5);
		}
		local6 = this.aClass168_84;
		synchronized (this.aClass168_84) {
			this.aClass168_84.method3852(5);
		}
	}
}
