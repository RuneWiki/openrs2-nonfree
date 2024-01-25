import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class245 {

	@OriginalMember(owner = "client!op", name = "l", descriptor = "Lclient!jt;")
	private final Class166 aClass166_39 = new Class166(64);

	@OriginalMember(owner = "client!op", name = "f", descriptor = "Lclient!vd;")
	private final Class353 aClass353_75;

	@OriginalMember(owner = "client!op", name = "e", descriptor = "I")
	public final int anInt7548;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lclient!qg;ILclient!vd;)V")
	public Class245(@OriginalArg(0) Class271 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class353 arg2) {
		this.aClass353_75 = arg2;
		if (this.aClass353_75 == null) {
			this.anInt7548 = 0;
		} else {
			this.anInt7548 = this.aClass353_75.method8422(16);
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(B)V")
	public void method6510() {
		@Pc(2) Class166 local2 = this.aClass166_39;
		synchronized (this.aClass166_39) {
			this.aClass166_39.method4811();
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IB)Lclient!sp;")
	public Class310 method6511(@OriginalArg(0) int arg0) {
		@Pc(6) Class166 local6 = this.aClass166_39;
		@Pc(16) Class310 local16;
		synchronized (this.aClass166_39) {
			local16 = (Class310) this.aClass166_39.method4805((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class353 local34 = this.aClass353_75;
		@Pc(43) byte[] local43;
		synchronized (this.aClass353_75) {
			local43 = this.aClass353_75.method8404(16, arg0);
		}
		local16 = new Class310();
		if (local43 != null) {
			local16.method7823(new Class6_Sub40(local43));
		}
		@Pc(65) Class166 local65 = this.aClass166_39;
		synchronized (this.aClass166_39) {
			this.aClass166_39.method4803(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
	public void method6515() {
		@Pc(2) Class166 local2 = this.aClass166_39;
		synchronized (this.aClass166_39) {
			this.aClass166_39.method4802();
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(II)V")
	public void method6516() {
		@Pc(6) Class166 local6 = this.aClass166_39;
		synchronized (this.aClass166_39) {
			this.aClass166_39.method4809(5);
		}
	}
}
