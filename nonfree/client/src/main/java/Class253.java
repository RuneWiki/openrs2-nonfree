import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class253 {

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "Lclient!rl;")
	private final Class317 aClass317_42 = new Class317(256);

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "Lclient!rg;")
	private final Class310 aClass310_88;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lclient!dja;ILclient!rg;)V")
	public Class253(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class310 arg2) {
		this.aClass310_88 = arg2;
		this.aClass310_88.method7773(26);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)V")
	public void method6170() {
		@Pc(6) Class317 local6 = this.aClass317_42;
		synchronized (this.aClass317_42) {
			this.aClass317_42.method7870(5);
		}
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V")
	public void method6171() {
		@Pc(6) Class317 local6 = this.aClass317_42;
		synchronized (this.aClass317_42) {
			this.aClass317_42.method7873();
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
	public void method6172() {
		@Pc(6) Class317 local6 = this.aClass317_42;
		synchronized (this.aClass317_42) {
			this.aClass317_42.method7874();
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZI)Lclient!sf;")
	public Class14_Sub2_Sub16 method6174(@OriginalArg(1) int arg0) {
		@Pc(6) Class317 local6 = this.aClass317_42;
		@Pc(16) Class14_Sub2_Sub16 local16;
		synchronized (this.aClass317_42) {
			local16 = (Class14_Sub2_Sub16) this.aClass317_42.method7882((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(36) Class310 local36 = this.aClass310_88;
		@Pc(45) byte[] local45;
		synchronized (this.aClass310_88) {
			local45 = this.aClass310_88.method7803(arg0, 26);
		}
		local16 = new Class14_Sub2_Sub16();
		if (local45 != null) {
			local16.method7998(new Class14_Sub21(local45));
		}
		@Pc(69) Class317 local69 = this.aClass317_42;
		synchronized (this.aClass317_42) {
			this.aClass317_42.method7875((long) arg0, local16);
			return local16;
		}
	}
}
