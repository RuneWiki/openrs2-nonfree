import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class233 {

	@OriginalMember(owner = "client!od", name = "e", descriptor = "Lclient!jt;")
	private Class166 aClass166_37 = new Class166(64);

	@OriginalMember(owner = "client!od", name = "h", descriptor = "Lclient!vd;")
	private final Class353 aClass353_70;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lclient!qg;ILclient!vd;)V")
	public Class233(@OriginalArg(0) Class271 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class353 arg2) {
		this.aClass353_70 = arg2;
		if (this.aClass353_70 != null) {
			@Pc(20) int local20 = this.aClass353_70.method8415() - 1;
			this.aClass353_70.method8422(local20);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)Lclient!naa;")
	public Class215 method6390(@OriginalArg(1) int arg0) {
		@Pc(6) Class166 local6 = this.aClass166_37;
		@Pc(22) Class215 local22;
		synchronized (this.aClass166_37) {
			local22 = (Class215) this.aClass166_37.method4805((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class353 local35 = this.aClass353_70;
		@Pc(48) byte[] local48;
		synchronized (this.aClass353_70) {
			local48 = this.aClass353_70.method8404(Static436.method6775(arg0), Static136.method2201(arg0));
		}
		local22 = new Class215();
		if (local48 != null) {
			local22.method5755(new Class6_Sub40(local48));
		}
		@Pc(70) Class166 local70 = this.aClass166_37;
		synchronized (this.aClass166_37) {
			this.aClass166_37.method4803(local22, (long) arg0);
			return local22;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
	public void method6391() {
		@Pc(6) Class166 local6 = this.aClass166_37;
		synchronized (this.aClass166_37) {
			this.aClass166_37.method4802();
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)V")
	public void method6392(@OriginalArg(0) int arg0) {
		@Pc(11) Class166 local11 = this.aClass166_37;
		synchronized (this.aClass166_37) {
			this.aClass166_37.method4811();
			this.aClass166_37 = new Class166(arg0);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
	public void method6393() {
		@Pc(8) Class166 local8 = this.aClass166_37;
		synchronized (this.aClass166_37) {
			this.aClass166_37.method4811();
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(IB)V")
	public void method6394() {
		@Pc(6) Class166 local6 = this.aClass166_37;
		synchronized (this.aClass166_37) {
			this.aClass166_37.method4809(5);
		}
	}
}
