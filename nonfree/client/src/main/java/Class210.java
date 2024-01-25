import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class210 {

	@OriginalMember(owner = "client!mk", name = "t", descriptor = "I")
	public int anInt6567;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "Z")
	public boolean aBoolean431 = false;

	@OriginalMember(owner = "client!mk", name = "f", descriptor = "Lclient!jt;")
	private Class166 aClass166_32 = new Class166(64);

	@OriginalMember(owner = "client!mk", name = "q", descriptor = "Lclient!jt;")
	public final Class166 aClass166_33 = new Class166(500);

	@OriginalMember(owner = "client!mk", name = "r", descriptor = "Lclient!jt;")
	public final Class166 aClass166_34 = new Class166(30);

	@OriginalMember(owner = "client!mk", name = "s", descriptor = "Lclient!jt;")
	public final Class166 aClass166_35 = new Class166(50);

	@OriginalMember(owner = "client!mk", name = "g", descriptor = "Z")
	public boolean aBoolean432;

	@OriginalMember(owner = "client!mk", name = "o", descriptor = "Lclient!vd;")
	public final Class353 aClass353_59;

	@OriginalMember(owner = "client!mk", name = "j", descriptor = "Lclient!vd;")
	private final Class353 aClass353_58;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lclient!qg;IZLclient!vd;Lclient!vd;)V")
	public Class210(@OriginalArg(0) Class271 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class353 arg3, @OriginalArg(4) Class353 arg4) {
		this.aBoolean432 = arg2;
		this.aClass353_59 = arg4;
		this.aClass353_58 = arg3;
		if (this.aClass353_58 != null) {
			@Pc(47) int local47 = this.aClass353_58.method8415() - 1;
			this.aClass353_58.method8422(local47);
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)Lclient!su;")
	public Class312 method5629(@OriginalArg(0) int arg0) {
		@Pc(6) Class166 local6 = this.aClass166_32;
		@Pc(18) Class312 local18;
		synchronized (this.aClass166_32) {
			local18 = (Class312) this.aClass166_32.method4805((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class353 local31 = this.aClass353_58;
		@Pc(44) byte[] local44;
		synchronized (this.aClass353_58) {
			local44 = this.aClass353_58.method8404(Static68.method1192(arg0), Static253.method4540(arg0));
		}
		local18 = new Class312();
		local18.anInt9241 = arg0;
		local18.aClass210_5 = this;
		if (local44 != null) {
			local18.method7852(new Class6_Sub40(local44));
		}
		local18.method7851();
		if (!this.aBoolean432 && local18.aBoolean625) {
			local18.anIntArray563 = null;
			local18.aStringArray65 = null;
		}
		if (local18.aBoolean628) {
			local18.anInt9233 = 0;
			local18.aBoolean631 = false;
		}
		@Pc(101) Class166 local101 = this.aClass166_32;
		synchronized (this.aClass166_32) {
			this.aClass166_32.method4803(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(B)V")
	public void method5631() {
		@Pc(6) Class166 local6 = this.aClass166_32;
		synchronized (this.aClass166_32) {
			this.aClass166_32.method4802();
		}
		local6 = this.aClass166_33;
		synchronized (this.aClass166_33) {
			this.aClass166_33.method4802();
		}
		local6 = this.aClass166_34;
		synchronized (this.aClass166_34) {
			this.aClass166_34.method4802();
		}
		local6 = this.aClass166_35;
		synchronized (this.aClass166_35) {
			this.aClass166_35.method4802();
		}
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(II)V")
	public void method5634() {
		@Pc(2) Class166 local2 = this.aClass166_32;
		synchronized (this.aClass166_32) {
			this.aClass166_32.method4809(5);
		}
		local2 = this.aClass166_33;
		synchronized (this.aClass166_33) {
			this.aClass166_33.method4809(5);
		}
		local2 = this.aClass166_34;
		synchronized (this.aClass166_34) {
			this.aClass166_34.method4809(5);
		}
		local2 = this.aClass166_35;
		synchronized (this.aClass166_35) {
			this.aClass166_35.method4809(5);
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(BZ)V")
	public void method5635(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean431 != arg0) {
			this.aBoolean431 = arg0;
			this.method5641();
		}
	}

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "(II)V")
	public void method5638(@OriginalArg(1) int arg0) {
		this.aClass166_32 = new Class166(arg0);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZI)V")
	public void method5639(@OriginalArg(1) int arg0) {
		this.anInt6567 = arg0;
		@Pc(9) Class166 local9 = this.aClass166_33;
		synchronized (this.aClass166_33) {
			this.aClass166_33.method4811();
		}
		local9 = this.aClass166_34;
		synchronized (this.aClass166_34) {
			this.aClass166_34.method4811();
		}
		local9 = this.aClass166_35;
		synchronized (this.aClass166_35) {
			this.aClass166_35.method4811();
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZ)V")
	public void method5640(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean432 != arg0) {
			this.aBoolean432 = arg0;
			this.method5641();
		}
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V")
	public void method5641() {
		@Pc(6) Class166 local6 = this.aClass166_32;
		synchronized (this.aClass166_32) {
			this.aClass166_32.method4811();
		}
		local6 = this.aClass166_33;
		synchronized (this.aClass166_33) {
			this.aClass166_33.method4811();
		}
		local6 = this.aClass166_34;
		synchronized (this.aClass166_34) {
			this.aClass166_34.method4811();
		}
		local6 = this.aClass166_35;
		synchronized (this.aClass166_35) {
			this.aClass166_35.method4811();
		}
	}
}
