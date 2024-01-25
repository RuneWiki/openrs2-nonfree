import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class373 {

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "Lclient!jt;")
	private final Class166 aClass166_66 = new Class166(64);

	@OriginalMember(owner = "client!wg", name = "j", descriptor = "Lclient!jt;")
	private final Class166 aClass166_67 = new Class166(100);

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "Lclient!vd;")
	private final Class353 aClass353_137;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lclient!qg;ILclient!vd;Lclient!vd;Lclient!vd;)V")
	public Class373(@OriginalArg(0) Class271 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class353 arg2, @OriginalArg(3) Class353 arg3, @OriginalArg(4) Class353 arg4) {
		this.aClass353_137 = arg2;
		if (this.aClass353_137 != null) {
			@Pc(26) int local26 = this.aClass353_137.method8415() - 1;
			this.aClass353_137.method8422(local26);
		}
		Static343.method5561(arg4, arg3);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)Lclient!ao;")
	public Class21 method8738(@OriginalArg(1) int arg0) {
		@Pc(6) Class166 local6 = this.aClass166_66;
		@Pc(16) Class21 local16;
		synchronized (this.aClass166_66) {
			local16 = (Class21) this.aClass166_66.method4805((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class353 local29 = this.aClass353_137;
		@Pc(42) byte[] local42;
		synchronized (this.aClass353_137) {
			local42 = this.aClass353_137.method8404(Static614.method8518(arg0), Static88.method1510(arg0));
		}
		local16 = new Class21();
		local16.aClass373_1 = this;
		local16.anInt358 = arg0;
		if (local42 != null) {
			local16.method347(new Class6_Sub40(local42));
		}
		local16.method348();
		@Pc(80) Class166 local80 = this.aClass166_66;
		synchronized (this.aClass166_66) {
			this.aClass166_66.method4803(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZ)V")
	public void method8739() {
		@Pc(6) Class166 local6 = this.aClass166_66;
		synchronized (this.aClass166_66) {
			this.aClass166_66.method4809(5);
		}
		local6 = this.aClass166_67;
		synchronized (this.aClass166_67) {
			this.aClass166_67.method4809(5);
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
	public void method8740() {
		@Pc(6) Class166 local6 = this.aClass166_66;
		synchronized (this.aClass166_66) {
			this.aClass166_66.method4802();
		}
		local6 = this.aClass166_67;
		synchronized (this.aClass166_67) {
			this.aClass166_67.method4802();
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZI)Lclient!ae;")
	public Class6_Sub2_Sub1 method8741(@OriginalArg(1) int arg0) {
		@Pc(6) Class166 local6 = this.aClass166_67;
		synchronized (this.aClass166_67) {
			@Pc(25) Class6_Sub2_Sub1 local25 = (Class6_Sub2_Sub1) this.aClass166_67.method4805((long) arg0);
			if (local25 == null) {
				local25 = new Class6_Sub2_Sub1(arg0);
				this.aClass166_67.method4803(local25, (long) arg0);
			}
			return local25.method188() ? local25 : null;
		}
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V")
	public void method8743() {
		@Pc(6) Class166 local6 = this.aClass166_66;
		synchronized (this.aClass166_66) {
			this.aClass166_66.method4811();
		}
		local6 = this.aClass166_67;
		synchronized (this.aClass166_67) {
			this.aClass166_67.method4811();
		}
	}
}
