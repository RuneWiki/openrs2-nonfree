import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public final class Class61 {

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "Lclient!qc;")
	private final Class231 aClass231_19 = new Class231(64);

	@OriginalMember(owner = "client!dt", name = "j", descriptor = "Lclient!qc;")
	public final Class231 aClass231_20 = new Class231(2);

	@OriginalMember(owner = "client!dt", name = "d", descriptor = "Lclient!dda;")
	private final Class53 aClass53_28;

	@OriginalMember(owner = "client!dt", name = "h", descriptor = "Lclient!dda;")
	public final Class53 aClass53_29;

	static {
		new Class202(null, "geschickt werden.", null, null);
	}

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Lclient!oda;ILclient!dda;Lclient!dda;)V")
	public Class61(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class53 arg2, @OriginalArg(3) Class53 arg3) {
		this.aClass53_28 = arg2;
		this.aClass53_29 = arg3;
		this.aClass53_28.method1592(33);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)V")
	public void method1759() {
		@Pc(14) Class231 local14 = this.aClass231_19;
		synchronized (this.aClass231_19) {
			this.aClass231_19.method6240();
		}
		local14 = this.aClass231_20;
		synchronized (this.aClass231_20) {
			this.aClass231_20.method6240();
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(II)Lclient!wa;")
	public Class307 method1760(@OriginalArg(0) int arg0) {
		@Pc(6) Class231 local6 = this.aClass231_19;
		@Pc(16) Class307 local16;
		synchronized (this.aClass231_19) {
			local16 = (Class307) this.aClass231_19.method6228((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class53 local29 = this.aClass53_28;
		@Pc(38) byte[] local38;
		synchronized (this.aClass53_28) {
			local38 = this.aClass53_28.method1616(arg0, 33);
		}
		local16 = new Class307();
		local16.aClass61_2 = this;
		if (local38 != null) {
			local16.method7619(new Class2_Sub29(local38));
		}
		@Pc(63) Class231 local63 = this.aClass231_19;
		synchronized (this.aClass231_19) {
			this.aClass231_19.method6232(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(B)V")
	public void method1761() {
		@Pc(6) Class231 local6 = this.aClass231_19;
		synchronized (this.aClass231_19) {
			this.aClass231_19.method6227();
		}
		local6 = this.aClass231_20;
		synchronized (this.aClass231_20) {
			this.aClass231_20.method6227();
		}
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(II)V")
	public void method1763() {
		@Pc(11) Class231 local11 = this.aClass231_19;
		synchronized (this.aClass231_19) {
			this.aClass231_19.method6231(5);
		}
		local11 = this.aClass231_20;
		synchronized (this.aClass231_20) {
			this.aClass231_20.method6231(5);
		}
	}
}
