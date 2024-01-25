import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class227 {

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "Lclient!fba;")
	private final Class102 aClass102_39 = new Class102(64);

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "Lclient!fba;")
	private final Class102 aClass102_40 = new Class102(100);

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "Lclient!la;")
	private final Class196 aClass196_73;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lclient!mp;ILclient!la;Lclient!la;Lclient!la;)V")
	public Class227(@OriginalArg(0) Class222 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class196 arg2, @OriginalArg(3) Class196 arg3, @OriginalArg(4) Class196 arg4) {
		this.aClass196_73 = arg2;
		if (this.aClass196_73 != null) {
			@Pc(26) int local26 = this.aClass196_73.method5125() - 1;
			this.aClass196_73.method5118(local26);
		}
		Static358.method5877(arg3, arg4);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZ)Lclient!vo;")
	public Class361 method5968(@OriginalArg(0) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_39;
		@Pc(16) Class361 local16;
		synchronized (this.aClass102_39) {
			local16 = (Class361) this.aClass102_39.method2677((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) Class196 local38 = this.aClass196_73;
		@Pc(51) byte[] local51;
		synchronized (this.aClass196_73) {
			local51 = this.aClass196_73.method5102(Static329.method5387(arg0), Static283.method5408(arg0));
		}
		local16 = new Class361();
		local16.aClass227_2 = this;
		local16.anInt9862 = arg0;
		if (local51 != null) {
			local16.method8450(new Class3_Sub3(local51));
		}
		local16.method8446();
		@Pc(82) Class102 local82 = this.aClass102_39;
		synchronized (this.aClass102_39) {
			this.aClass102_39.method2674((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
	public void method5973() {
		@Pc(6) Class102 local6 = this.aClass102_39;
		synchronized (this.aClass102_39) {
			this.aClass102_39.method2680();
		}
		local6 = this.aClass102_40;
		synchronized (this.aClass102_40) {
			this.aClass102_40.method2680();
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)Lclient!gba;")
	public Class3_Sub4_Sub8 method5974(@OriginalArg(0) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_40;
		synchronized (this.aClass102_40) {
			@Pc(16) Class3_Sub4_Sub8 local16 = (Class3_Sub4_Sub8) this.aClass102_40.method2677((long) arg0);
			if (local16 == null) {
				local16 = new Class3_Sub4_Sub8(arg0);
				this.aClass102_40.method2674((long) arg0, local16);
			}
			return local16.method3038() ? local16 : null;
		}
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(B)V")
	public void method5975() {
		@Pc(6) Class102 local6 = this.aClass102_39;
		synchronized (this.aClass102_39) {
			this.aClass102_39.method2681();
		}
		local6 = this.aClass102_40;
		synchronized (this.aClass102_40) {
			this.aClass102_40.method2681();
		}
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(IZ)V")
	public void method5976() {
		@Pc(2) Class102 local2 = this.aClass102_39;
		synchronized (this.aClass102_39) {
			this.aClass102_39.method2668(5);
		}
		local2 = this.aClass102_40;
		synchronized (this.aClass102_40) {
			this.aClass102_40.method2668(5);
		}
	}
}
