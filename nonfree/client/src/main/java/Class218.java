import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ow")
public final class Class218 {

	@OriginalMember(owner = "client!ow", name = "h", descriptor = "Lclient!qc;")
	private final Class231 aClass231_53 = new Class231(64);

	@OriginalMember(owner = "client!ow", name = "b", descriptor = "Lclient!dda;")
	private final Class53 aClass53_100;

	@OriginalMember(owner = "client!ow", name = "<init>", descriptor = "(Lclient!oda;ILclient!dda;)V")
	public Class218(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class53 arg2) {
		this.aClass53_100 = arg2;
		this.aClass53_100.method1592(32);
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(I)V")
	public void method5791() {
		@Pc(6) Class231 local6 = this.aClass231_53;
		synchronized (this.aClass231_53) {
			this.aClass231_53.method6240();
		}
	}

	@OriginalMember(owner = "client!ow", name = "b", descriptor = "(I)V")
	public void method5793() {
		@Pc(2) Class231 local2 = this.aClass231_53;
		synchronized (this.aClass231_53) {
			this.aClass231_53.method6227();
		}
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(II)V")
	public void method5794() {
		@Pc(2) Class231 local2 = this.aClass231_53;
		synchronized (this.aClass231_53) {
			this.aClass231_53.method6231(5);
		}
	}

	@OriginalMember(owner = "client!ow", name = "b", descriptor = "(II)Lclient!bf;")
	public Class24 method5796(@OriginalArg(1) int arg0) {
		@Pc(6) Class231 local6 = this.aClass231_53;
		@Pc(18) Class24 local18;
		synchronized (this.aClass231_53) {
			local18 = (Class24) this.aClass231_53.method6228((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class53 local31 = this.aClass53_100;
		@Pc(40) byte[] local40;
		synchronized (this.aClass53_100) {
			local40 = this.aClass53_100.method1616(arg0, 32);
		}
		local18 = new Class24();
		if (local40 != null) {
			local18.method711(new Class2_Sub29(local40));
		}
		@Pc(68) Class231 local68 = this.aClass231_53;
		synchronized (this.aClass231_53) {
			this.aClass231_53.method6232(local18, (long) arg0);
			return local18;
		}
	}
}
