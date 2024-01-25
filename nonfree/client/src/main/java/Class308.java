import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class308 {

	@OriginalMember(owner = "client!re", name = "a", descriptor = "Lclient!rl;")
	private final Class317 aClass317_56 = new Class317(64);

	@OriginalMember(owner = "client!re", name = "g", descriptor = "Lclient!rg;")
	private final Class310 aClass310_104;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lclient!dja;ILclient!rg;)V")
	public Class308(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class310 arg2) {
		this.aClass310_104 = arg2;
		this.aClass310_104.method7773(31);
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(B)V")
	public void method7677() {
		@Pc(11) Class317 local11 = this.aClass317_56;
		synchronized (this.aClass317_56) {
			this.aClass317_56.method7873();
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(II)Lclient!ji;")
	public Class188 method7678(@OriginalArg(1) int arg0) {
		@Pc(6) Class317 local6 = this.aClass317_56;
		@Pc(18) Class188 local18;
		synchronized (this.aClass317_56) {
			local18 = (Class188) this.aClass317_56.method7882((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(42) Class310 local42 = this.aClass310_104;
		@Pc(51) byte[] local51;
		synchronized (this.aClass310_104) {
			local51 = this.aClass310_104.method7803(arg0, 31);
		}
		local18 = new Class188();
		if (local51 != null) {
			local18.method4751(new Class14_Sub21(local51));
		}
		@Pc(75) Class317 local75 = this.aClass317_56;
		synchronized (this.aClass317_56) {
			this.aClass317_56.method7875((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
	public void method7680() {
		@Pc(2) Class317 local2 = this.aClass317_56;
		synchronized (this.aClass317_56) {
			this.aClass317_56.method7874();
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(II)V")
	public void method7681() {
		@Pc(2) Class317 local2 = this.aClass317_56;
		synchronized (this.aClass317_56) {
			this.aClass317_56.method7870(5);
		}
	}
}
