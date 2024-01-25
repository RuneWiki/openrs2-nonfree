import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class131 {

	@OriginalMember(owner = "client!ik", name = "g", descriptor = "Lclient!qc;")
	private final Class231 aClass231_39 = new Class231(16);

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "Lclient!dda;")
	private final Class53 aClass53_69;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lclient!oda;ILclient!dda;)V")
	public Class131(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class53 arg2) {
		this.aClass53_69 = arg2;
		this.aClass53_69.method1592(30);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IB)V")
	public void method3291() {
		@Pc(6) Class231 local6 = this.aClass231_39;
		synchronized (this.aClass231_39) {
			this.aClass231_39.method6231(5);
		}
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V")
	public void method3294() {
		@Pc(2) Class231 local2 = this.aClass231_39;
		synchronized (this.aClass231_39) {
			this.aClass231_39.method6240();
		}
	}

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)V")
	public void method3295() {
		@Pc(11) Class231 local11 = this.aClass231_39;
		synchronized (this.aClass231_39) {
			this.aClass231_39.method6227();
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZI)Lclient!tj;")
	public Class271 method3297(@OriginalArg(1) int arg0) {
		@Pc(6) Class231 local6 = this.aClass231_39;
		@Pc(16) Class271 local16;
		synchronized (this.aClass231_39) {
			local16 = (Class271) this.aClass231_39.method6228((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class53 local29 = this.aClass53_69;
		@Pc(38) byte[] local38;
		synchronized (this.aClass53_69) {
			local38 = this.aClass53_69.method1616(arg0, 30);
		}
		local16 = new Class271();
		if (local38 != null) {
			local16.method6982(new Class2_Sub29(local38));
		}
		@Pc(65) Class231 local65 = this.aClass231_39;
		synchronized (this.aClass231_39) {
			this.aClass231_39.method6232(local16, (long) arg0);
			return local16;
		}
	}
}
