import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class279 {

	@OriginalMember(owner = "client!os", name = "b", descriptor = "Lclient!rl;")
	private final Class317 aClass317_50 = new Class317(64);

	@OriginalMember(owner = "client!os", name = "a", descriptor = "Lclient!rl;")
	public final Class317 aClass317_51 = new Class317(2);

	@OriginalMember(owner = "client!os", name = "h", descriptor = "Lclient!rg;")
	private final Class310 aClass310_97;

	@OriginalMember(owner = "client!os", name = "g", descriptor = "Lclient!rg;")
	public final Class310 aClass310_96;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Lclient!dja;ILclient!rg;Lclient!rg;)V")
	public Class279(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class310 arg2, @OriginalArg(3) Class310 arg3) {
		this.aClass310_97 = arg2;
		this.aClass310_96 = arg3;
		this.aClass310_97.method7773(33);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Z)V")
	public void method6655() {
		@Pc(2) Class317 local2 = this.aClass317_50;
		synchronized (this.aClass317_50) {
			this.aClass317_50.method7874();
		}
		local2 = this.aClass317_51;
		synchronized (this.aClass317_51) {
			this.aClass317_51.method7874();
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IZ)V")
	public void method6656() {
		@Pc(6) Class317 local6 = this.aClass317_50;
		synchronized (this.aClass317_50) {
			this.aClass317_50.method7870(5);
		}
		local6 = this.aClass317_51;
		synchronized (this.aClass317_51) {
			this.aClass317_51.method7870(5);
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(II)Lclient!le;")
	public Class218 method6657(@OriginalArg(0) int arg0) {
		@Pc(6) Class317 local6 = this.aClass317_50;
		@Pc(18) Class218 local18;
		synchronized (this.aClass317_50) {
			local18 = (Class218) this.aClass317_50.method7882((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(32) Class310 local32 = this.aClass310_97;
		@Pc(43) byte[] local43;
		synchronized (this.aClass310_97) {
			local43 = this.aClass310_97.method7803(arg0, 33);
		}
		local18 = new Class218();
		local18.aClass279_1 = this;
		if (local43 != null) {
			local18.method5191(new Class14_Sub21(local43));
		}
		@Pc(79) Class317 local79 = this.aClass317_50;
		synchronized (this.aClass317_50) {
			this.aClass317_50.method7875((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
	public void method6658() {
		@Pc(2) Class317 local2 = this.aClass317_50;
		synchronized (this.aClass317_50) {
			this.aClass317_50.method7873();
		}
		local2 = this.aClass317_51;
		synchronized (this.aClass317_51) {
			this.aClass317_51.method7873();
		}
	}
}
