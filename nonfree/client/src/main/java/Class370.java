import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class370 {

	@OriginalMember(owner = "client!va", name = "f", descriptor = "Lclient!rl;")
	private final Class317 aClass317_68 = new Class317(64);

	@OriginalMember(owner = "client!va", name = "k", descriptor = "Lclient!rg;")
	private final Class310 aClass310_124;

	@OriginalMember(owner = "client!va", name = "e", descriptor = "I")
	public final int anInt10393;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lclient!dja;ILclient!rg;)V")
	public Class370(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class310 arg2) {
		this.aClass310_124 = arg2;
		if (this.aClass310_124 == null) {
			this.anInt10393 = 0;
		} else {
			this.anInt10393 = this.aClass310_124.method7773(47);
		}
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
	public void method8885() {
		@Pc(2) Class317 local2 = this.aClass317_68;
		synchronized (this.aClass317_68) {
			this.aClass317_68.method7874();
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(II)Lclient!aea;")
	public Class10 method8886(@OriginalArg(0) int arg0) {
		@Pc(12) Class317 local12 = this.aClass317_68;
		@Pc(22) Class10 local22;
		synchronized (this.aClass317_68) {
			local22 = (Class10) this.aClass317_68.method7882((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(36) Class310 local36 = this.aClass310_124;
		@Pc(45) byte[] local45;
		synchronized (this.aClass310_124) {
			local45 = this.aClass310_124.method7803(arg0, 47);
		}
		local22 = new Class10();
		if (local45 != null) {
			local22.method102(new Class14_Sub21(local45));
		}
		@Pc(69) Class317 local69 = this.aClass317_68;
		synchronized (this.aClass317_68) {
			this.aClass317_68.method7875((long) arg0, local22);
			return local22;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)V")
	public void method8887() {
		@Pc(2) Class317 local2 = this.aClass317_68;
		synchronized (this.aClass317_68) {
			this.aClass317_68.method7870(5);
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
	public void method8888() {
		@Pc(2) Class317 local2 = this.aClass317_68;
		synchronized (this.aClass317_68) {
			this.aClass317_68.method7873();
		}
	}
}
