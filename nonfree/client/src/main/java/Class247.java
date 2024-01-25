import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class247 {

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "Lclient!qc;")
	private final Class231 aClass231_59 = new Class231(64);

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "Lclient!dda;")
	private final Class53 aClass53_117;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lclient!oda;ILclient!dda;)V")
	public Class247(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class53 arg2) {
		this.aClass53_117 = arg2;
		if (this.aClass53_117 != null) {
			this.aClass53_117.method1592(11);
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)Lclient!el;")
	public Class73 method6470(@OriginalArg(0) int arg0) {
		@Pc(6) Class231 local6 = this.aClass231_59;
		@Pc(16) Class73 local16;
		synchronized (this.aClass231_59) {
			local16 = (Class73) this.aClass231_59.method6228((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class53 local35 = this.aClass53_117;
		@Pc(44) byte[] local44;
		synchronized (this.aClass53_117) {
			local44 = this.aClass53_117.method1616(arg0, 11);
		}
		local16 = new Class73();
		if (local44 != null) {
			local16.method2117(new Class2_Sub29(local44));
		}
		@Pc(66) Class231 local66 = this.aClass231_59;
		synchronized (this.aClass231_59) {
			this.aClass231_59.method6232(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
	public void method6471() {
		@Pc(6) Class231 local6 = this.aClass231_59;
		synchronized (this.aClass231_59) {
			this.aClass231_59.method6227();
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)V")
	public void method6473() {
		@Pc(2) Class231 local2 = this.aClass231_59;
		synchronized (this.aClass231_59) {
			this.aClass231_59.method6231(5);
		}
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)V")
	public void method6474() {
		@Pc(2) Class231 local2 = this.aClass231_59;
		synchronized (this.aClass231_59) {
			this.aClass231_59.method6240();
		}
	}
}
