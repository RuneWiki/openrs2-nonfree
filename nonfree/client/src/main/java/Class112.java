import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class112 {

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "Lclient!qc;")
	private Class231 aClass231_32 = new Class231(64);

	@OriginalMember(owner = "client!hd", name = "j", descriptor = "Lclient!qc;")
	public Class231 aClass231_33 = new Class231(64);

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "Lclient!dda;")
	public final Class53 aClass53_58;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "Lclient!dda;")
	private final Class53 aClass53_57;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lclient!oda;ILclient!dda;Lclient!dda;)V")
	public Class112(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class53 arg2, @OriginalArg(3) Class53 arg3) {
		this.aClass53_58 = arg3;
		this.aClass53_57 = arg2;
		this.aClass53_57.method1592(34);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BI)Lclient!wk;")
	public Class313 method2955(@OriginalArg(1) int arg0) {
		@Pc(6) Class231 local6 = this.aClass231_32;
		@Pc(16) Class313 local16;
		synchronized (this.aClass231_32) {
			local16 = (Class313) this.aClass231_32.method6228((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class53 local29 = this.aClass53_57;
		@Pc(38) byte[] local38;
		synchronized (this.aClass53_57) {
			local38 = this.aClass53_57.method1616(arg0, 34);
		}
		local16 = new Class313();
		local16.aClass112_3 = this;
		if (local38 != null) {
			local16.method7743(new Class2_Sub29(local38));
		}
		@Pc(72) Class231 local72 = this.aClass231_32;
		synchronized (this.aClass231_32) {
			this.aClass231_32.method6232(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
	public void method2956() {
		@Pc(6) Class231 local6 = this.aClass231_32;
		synchronized (this.aClass231_32) {
			this.aClass231_32.method6240();
		}
		local6 = this.aClass231_33;
		synchronized (this.aClass231_33) {
			this.aClass231_33.method6240();
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
	public void method2958() {
		@Pc(6) Class231 local6 = this.aClass231_32;
		synchronized (this.aClass231_32) {
			this.aClass231_32.method6227();
		}
		local6 = this.aClass231_33;
		synchronized (this.aClass231_33) {
			this.aClass231_33.method6227();
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)V")
	public void method2961() {
		@Pc(2) Class231 local2 = this.aClass231_32;
		synchronized (this.aClass231_32) {
			this.aClass231_32.method6231(5);
		}
		local2 = this.aClass231_33;
		synchronized (this.aClass231_33) {
			this.aClass231_33.method6231(5);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(III)V")
	public void method2962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass231_32 = new Class231(arg1);
		this.aClass231_33 = new Class231(arg0);
	}
}
