import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class Class103 {

	@OriginalMember(owner = "client!es", name = "f", descriptor = "Lclient!rl;")
	private final Class317 aClass317_16 = new Class317(64);

	@OriginalMember(owner = "client!es", name = "i", descriptor = "Lclient!rg;")
	private final Class310 aClass310_35;

	@OriginalMember(owner = "client!es", name = "k", descriptor = "Lclient!rg;")
	public final Class310 aClass310_34;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lclient!dja;ILclient!rg;Lclient!rg;)V")
	public Class103(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class310 arg2, @OriginalArg(3) Class310 arg3) {
		this.aClass310_35 = arg2;
		this.aClass310_34 = arg3;
		this.aClass310_35.method7773(3);
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(I)V")
	public void method2163() {
		@Pc(2) Class317 local2 = this.aClass317_16;
		synchronized (this.aClass317_16) {
			this.aClass317_16.method7874();
		}
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(B)V")
	public void method2164() {
		@Pc(17) Class317 local17 = this.aClass317_16;
		synchronized (this.aClass317_16) {
			this.aClass317_16.method7873();
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IB)Lclient!afa;")
	public Class12 method2165(@OriginalArg(0) int arg0) {
		@Pc(14) Class317 local14 = this.aClass317_16;
		@Pc(24) Class12 local24;
		synchronized (this.aClass317_16) {
			local24 = (Class12) this.aClass317_16.method7882((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(38) Class310 local38 = this.aClass310_35;
		@Pc(47) byte[] local47;
		synchronized (this.aClass310_35) {
			local47 = this.aClass310_35.method7803(arg0, 3);
		}
		local24 = new Class12();
		local24.aClass103_1 = this;
		if (local47 != null) {
			local24.method110(new Class14_Sub21(local47));
		}
		@Pc(74) Class317 local74 = this.aClass317_16;
		synchronized (this.aClass317_16) {
			this.aClass317_16.method7875((long) arg0, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(BI)V")
	public void method2166() {
		@Pc(15) Class317 local15 = this.aClass317_16;
		synchronized (this.aClass317_16) {
			this.aClass317_16.method7870(5);
		}
	}
}
