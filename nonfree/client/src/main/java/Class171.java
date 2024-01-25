import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ifa")
public final class Class171 {

	@OriginalMember(owner = "client!ifa", name = "g", descriptor = "Lclient!rl;")
	private final Class317 aClass317_25 = new Class317(16);

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "Lclient!rg;")
	private final Class310 aClass310_56;

	@OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(Lclient!dja;ILclient!rg;)V")
	public Class171(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class310 arg2) {
		this.aClass310_56 = arg2;
		this.aClass310_56.method7773(30);
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I)V")
	public void method4198() {
		@Pc(6) Class317 local6 = this.aClass317_25;
		synchronized (this.aClass317_25) {
			this.aClass317_25.method7874();
		}
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(II)V")
	public void method4201() {
		@Pc(6) Class317 local6 = this.aClass317_25;
		synchronized (this.aClass317_25) {
			this.aClass317_25.method7870(5);
		}
	}

	@OriginalMember(owner = "client!ifa", name = "b", descriptor = "(I)V")
	public void method4202() {
		@Pc(6) Class317 local6 = this.aClass317_25;
		synchronized (this.aClass317_25) {
			this.aClass317_25.method7873();
		}
	}

	@OriginalMember(owner = "client!ifa", name = "b", descriptor = "(II)Lclient!gf;")
	public Class130 method4203(@OriginalArg(0) int arg0) {
		@Pc(6) Class317 local6 = this.aClass317_25;
		@Pc(16) Class130 local16;
		synchronized (this.aClass317_25) {
			local16 = (Class130) this.aClass317_25.method7882((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(44) Class310 local44 = this.aClass310_56;
		@Pc(53) byte[] local53;
		synchronized (this.aClass310_56) {
			local53 = this.aClass310_56.method7803(arg0, 30);
		}
		local16 = new Class130();
		if (local53 != null) {
			local16.method2831(new Class14_Sub21(local53));
		}
		@Pc(77) Class317 local77 = this.aClass317_25;
		synchronized (this.aClass317_25) {
			this.aClass317_25.method7875((long) arg0, local16);
			return local16;
		}
	}
}
