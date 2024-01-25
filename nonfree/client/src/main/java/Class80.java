import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class80 {

	@OriginalMember(owner = "client!f", name = "m", descriptor = "Lclient!qc;")
	private Class231 aClass231_29 = new Class231(64);

	@OriginalMember(owner = "client!f", name = "b", descriptor = "Lclient!dda;")
	private final Class53 aClass53_39;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lclient!oda;ILclient!dda;)V")
	public Class80(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class53 arg2) {
		this.aClass53_39 = arg2;
		if (this.aClass53_39 != null) {
			@Pc(20) int local20 = this.aClass53_39.method1607() - 1;
			this.aClass53_39.method1592(local20);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)Lclient!es;")
	public Class78 method2314(@OriginalArg(0) int arg0) {
		@Pc(6) Class231 local6 = this.aClass231_29;
		@Pc(16) Class78 local16;
		synchronized (this.aClass231_29) {
			local16 = (Class78) this.aClass231_29.method6228((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class53 local37 = this.aClass53_39;
		@Pc(50) byte[] local50;
		synchronized (this.aClass53_39) {
			local50 = this.aClass53_39.method1616(Static64.method1161(arg0), Static91.method1702(arg0));
		}
		local16 = new Class78();
		if (local50 != null) {
			local16.method2237(new Class2_Sub29(local50));
		}
		@Pc(72) Class231 local72 = this.aClass231_29;
		synchronized (this.aClass231_29) {
			this.aClass231_29.method6232(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZI)V")
	public void method2315(@OriginalArg(1) int arg0) {
		@Pc(6) Class231 local6 = this.aClass231_29;
		synchronized (this.aClass231_29) {
			this.aClass231_29.method6240();
			this.aClass231_29 = new Class231(arg0);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IB)V")
	public void method2316() {
		@Pc(2) Class231 local2 = this.aClass231_29;
		synchronized (this.aClass231_29) {
			this.aClass231_29.method6231(5);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
	public void method2318() {
		@Pc(2) Class231 local2 = this.aClass231_29;
		synchronized (this.aClass231_29) {
			this.aClass231_29.method6227();
		}
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(I)V")
	public void method2322() {
		@Pc(6) Class231 local6 = this.aClass231_29;
		synchronized (this.aClass231_29) {
			this.aClass231_29.method6240();
		}
	}
}
