import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class292 {

	@OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
	public int anInt8590;

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "Lclient!jt;")
	private final Class166 aClass166_45 = new Class166(64);

	@OriginalMember(owner = "client!rk", name = "m", descriptor = "Lclient!jt;")
	public final Class166 aClass166_47 = new Class166(60);

	@OriginalMember(owner = "client!rk", name = "j", descriptor = "Lclient!vd;")
	public final Class353 aClass353_97;

	@OriginalMember(owner = "client!rk", name = "l", descriptor = "Lclient!vd;")
	private final Class353 aClass353_98;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lclient!qg;ILclient!vd;Lclient!vd;)V")
	public Class292(@OriginalArg(0) Class271 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class353 arg2, @OriginalArg(3) Class353 arg3) {
		this.aClass353_97 = arg3;
		this.aClass353_98 = arg2;
		@Pc(26) int local26 = this.aClass353_98.method8415() - 1;
		this.aClass353_98.method8422(local26);
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IB)V")
	public void method7394(@OriginalArg(0) int arg0) {
		this.anInt8590 = arg0;
		@Pc(9) Class166 local9 = this.aClass166_47;
		synchronized (this.aClass166_47) {
			this.aClass166_47.method4811();
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V")
	public void method7396() {
		@Pc(2) Class166 local2 = this.aClass166_45;
		synchronized (this.aClass166_45) {
			this.aClass166_45.method4802();
		}
		local2 = this.aClass166_47;
		synchronized (this.aClass166_47) {
			this.aClass166_47.method4802();
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)V")
	public void method7398() {
		@Pc(6) Class166 local6 = this.aClass166_45;
		synchronized (this.aClass166_45) {
			this.aClass166_45.method4809(5);
		}
		local6 = this.aClass166_47;
		synchronized (this.aClass166_47) {
			this.aClass166_47.method4809(5);
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
	public void method7400() {
		@Pc(2) Class166 local2 = this.aClass166_45;
		synchronized (this.aClass166_45) {
			this.aClass166_45.method4811();
		}
		local2 = this.aClass166_47;
		synchronized (this.aClass166_47) {
			this.aClass166_47.method4811();
		}
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(II)Lclient!fda;")
	public Class93 method7401(@OriginalArg(0) int arg0) {
		@Pc(6) Class166 local6 = this.aClass166_45;
		@Pc(16) Class93 local16;
		synchronized (this.aClass166_45) {
			local16 = (Class93) this.aClass166_45.method4805((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class353 local34 = this.aClass353_98;
		@Pc(47) byte[] local47;
		synchronized (this.aClass353_98) {
			local47 = this.aClass353_98.method8404(Static243.method4191(arg0), Static190.method3388(arg0));
		}
		local16 = new Class93();
		local16.anInt2757 = arg0;
		local16.aClass292_1 = this;
		if (local47 != null) {
			local16.method2363(new Class6_Sub40(local47));
		}
		@Pc(75) Class166 local75 = this.aClass166_45;
		synchronized (this.aClass166_45) {
			this.aClass166_45.method4803(local16, (long) arg0);
			return local16;
		}
	}
}
