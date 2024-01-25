import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class100 {

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "Lclient!qc;")
	private final Class231 aClass231_31 = new Class231(64);

	@OriginalMember(owner = "client!gf", name = "i", descriptor = "Lclient!dda;")
	private final Class53 aClass53_49;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lclient!oda;ILclient!dda;)V")
	public Class100(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class53 arg2) {
		this.aClass53_49 = arg2;
		this.aClass53_49.method1592(31);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
	public void method2653() {
		@Pc(6) Class231 local6 = this.aClass231_31;
		synchronized (this.aClass231_31) {
			this.aClass231_31.method6227();
		}
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
	public void method2656() {
		@Pc(2) Class231 local2 = this.aClass231_31;
		synchronized (this.aClass231_31) {
			this.aClass231_31.method6240();
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IZ)Lclient!cda;")
	public Class33 method2658(@OriginalArg(0) int arg0) {
		@Pc(6) Class231 local6 = this.aClass231_31;
		@Pc(16) Class33 local16;
		synchronized (this.aClass231_31) {
			local16 = (Class33) this.aClass231_31.method6228((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class53 local35 = this.aClass53_49;
		@Pc(44) byte[] local44;
		synchronized (this.aClass53_49) {
			local44 = this.aClass53_49.method1616(arg0, 31);
		}
		local16 = new Class33();
		if (local44 != null) {
			local16.method1079(new Class2_Sub29(local44));
		}
		@Pc(66) Class231 local66 = this.aClass231_31;
		synchronized (this.aClass231_31) {
			this.aClass231_31.method6232(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V")
	public void method2659() {
		@Pc(2) Class231 local2 = this.aClass231_31;
		synchronized (this.aClass231_31) {
			this.aClass231_31.method6231(5);
		}
	}
}
