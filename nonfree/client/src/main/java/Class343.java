import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wda")
public final class Class343 {

	@OriginalMember(owner = "client!wda", name = "r", descriptor = "I")
	public int anInt9587;

	@OriginalMember(owner = "client!wda", name = "j", descriptor = "Lclient!pca;")
	private final Class245 aClass245_69 = new Class245(64);

	@OriginalMember(owner = "client!wda", name = "p", descriptor = "Lclient!pca;")
	public final Class245 aClass245_70 = new Class245(50);

	@OriginalMember(owner = "client!wda", name = "q", descriptor = "Lclient!pca;")
	public final Class245 aClass245_71 = new Class245(5);

	@OriginalMember(owner = "client!wda", name = "c", descriptor = "Lclient!jo;")
	public final Class168 aClass168_123;

	@OriginalMember(owner = "client!wda", name = "m", descriptor = "Lclient!jo;")
	private final Class168 aClass168_124;

	@OriginalMember(owner = "client!wda", name = "l", descriptor = "Z")
	public boolean aBoolean711;

	@OriginalMember(owner = "client!wda", name = "i", descriptor = "Lclient!jda;")
	public final Class162 aClass162_4;

	@OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(Lclient!jda;IZLclient!jo;Lclient!jo;)V")
	public Class343(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class168 arg3, @OriginalArg(4) Class168 arg4) {
		this.aClass168_123 = arg4;
		this.aClass168_124 = arg3;
		this.aBoolean711 = arg2;
		this.aClass162_4 = arg0;
		if (this.aClass168_124 != null) {
			@Pc(41) int local41 = this.aClass168_124.method4456() - 1;
			this.aClass168_124.method4443(local41);
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(B)V")
	public void method7990() {
		@Pc(6) Class245 local6 = this.aClass245_69;
		synchronized (this.aClass245_69) {
			this.aClass245_69.method6079();
		}
		local6 = this.aClass245_70;
		synchronized (this.aClass245_70) {
			this.aClass245_70.method6079();
		}
		local6 = this.aClass245_71;
		synchronized (this.aClass245_71) {
			this.aClass245_71.method6079();
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Z)V")
	public void method7991() {
		@Pc(13) Class245 local13 = this.aClass245_69;
		synchronized (this.aClass245_69) {
			this.aClass245_69.method6076();
		}
		local13 = this.aClass245_70;
		synchronized (this.aClass245_70) {
			this.aClass245_70.method6076();
		}
		local13 = this.aClass245_71;
		synchronized (this.aClass245_71) {
			this.aClass245_71.method6076();
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(I)V")
	public void method7992() {
		@Pc(2) Class245 local2 = this.aClass245_70;
		synchronized (this.aClass245_70) {
			this.aClass245_70.method6079();
		}
		local2 = this.aClass245_71;
		synchronized (this.aClass245_71) {
			this.aClass245_71.method6079();
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(ZI)V")
	public void method7993(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean711 != arg0) {
			this.aBoolean711 = arg0;
			this.method7990();
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(II)Lclient!nc;")
	public Class222 method7994(@OriginalArg(1) int arg0) {
		@Pc(6) Class245 local6 = this.aClass245_69;
		@Pc(16) Class222 local16;
		synchronized (this.aClass245_69) {
			local16 = (Class222) this.aClass245_69.method6082((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class168 local29 = this.aClass168_124;
		@Pc(46) byte[] local46;
		synchronized (this.aClass168_124) {
			local46 = this.aClass168_124.method4435(Static467.method7194(arg0), Static125.method2480(arg0));
		}
		local16 = new Class222();
		local16.anInt6238 = arg0;
		local16.aClass343_1 = this;
		if (local46 != null) {
			local16.method5322(new Class6_Sub26(local46));
		}
		local16.method5330();
		@Pc(77) Class245 local77 = this.aClass245_69;
		synchronized (this.aClass245_69) {
			this.aClass245_69.method6075(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "(II)V")
	public void method7995(@OriginalArg(1) int arg0) {
		this.anInt9587 = arg0;
		@Pc(9) Class245 local9 = this.aClass245_70;
		synchronized (this.aClass245_70) {
			this.aClass245_70.method6079();
		}
		local9 = this.aClass245_71;
		synchronized (this.aClass245_71) {
			this.aClass245_71.method6079();
		}
	}

	@OriginalMember(owner = "client!wda", name = "c", descriptor = "(II)V")
	public void method7996() {
		@Pc(2) Class245 local2 = this.aClass245_69;
		synchronized (this.aClass245_69) {
			this.aClass245_69.method6083(5);
		}
		local2 = this.aClass245_70;
		synchronized (this.aClass245_70) {
			this.aClass245_70.method6083(5);
		}
		local2 = this.aClass245_71;
		synchronized (this.aClass245_71) {
			this.aClass245_71.method6083(5);
		}
	}
}
