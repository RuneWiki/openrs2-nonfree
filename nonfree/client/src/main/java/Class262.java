import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class262 {

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "Lclient!rl;")
	public final Class317 aClass317_45 = new Class317(20);

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "Lclient!rl;")
	private final Class317 aClass317_46 = new Class317(64);

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "Lclient!rg;")
	private final Class310 aClass310_90;

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "Lclient!rg;")
	public final Class310 aClass310_91;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lclient!dja;ILclient!rg;Lclient!rg;)V")
	public Class262(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class310 arg2, @OriginalArg(3) Class310 arg3) {
		this.aClass310_90 = arg2;
		this.aClass310_91 = arg3;
		this.aClass310_90.method7773(46);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
	public void method6396() {
		@Pc(6) Class317 local6 = this.aClass317_46;
		synchronized (this.aClass317_46) {
			this.aClass317_46.method7873();
		}
		local6 = this.aClass317_45;
		synchronized (this.aClass317_45) {
			this.aClass317_45.method7873();
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)V")
	public void method6398() {
		@Pc(6) Class317 local6 = this.aClass317_46;
		synchronized (this.aClass317_46) {
			this.aClass317_46.method7870(5);
		}
		local6 = this.aClass317_45;
		synchronized (this.aClass317_45) {
			this.aClass317_45.method7870(5);
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZI)Lclient!mka;")
	public Class240 method6399(@OriginalArg(1) int arg0) {
		@Pc(6) Class317 local6 = this.aClass317_46;
		@Pc(16) Class240 local16;
		synchronized (this.aClass317_46) {
			local16 = (Class240) this.aClass317_46.method7882((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class310 local30 = this.aClass310_90;
		@Pc(39) byte[] local39;
		synchronized (this.aClass310_90) {
			local39 = this.aClass310_90.method7803(arg0, 46);
		}
		local16 = new Class240();
		local16.aClass262_1 = this;
		if (local39 != null) {
			local16.method5882(new Class14_Sub21(local39));
		}
		@Pc(72) Class317 local72 = this.aClass317_46;
		synchronized (this.aClass317_46) {
			this.aClass317_46.method7875((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)V")
	public void method6400() {
		@Pc(2) Class317 local2 = this.aClass317_46;
		synchronized (this.aClass317_46) {
			this.aClass317_46.method7874();
		}
		local2 = this.aClass317_45;
		synchronized (this.aClass317_45) {
			this.aClass317_45.method7874();
		}
	}
}
