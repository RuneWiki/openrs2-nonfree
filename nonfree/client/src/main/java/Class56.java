import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class56 {

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "Lclient!qc;")
	private Class231 aClass231_15 = new Class231(128);

	@OriginalMember(owner = "client!dj", name = "k", descriptor = "Lclient!qc;")
	public Class231 aClass231_16 = new Class231(64);

	@OriginalMember(owner = "client!dj", name = "j", descriptor = "Lclient!dda;")
	private final Class53 aClass53_27;

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "Lclient!dda;")
	public final Class53 aClass53_26;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lclient!oda;ILclient!dda;Lclient!dda;)V")
	public Class56(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class53 arg2, @OriginalArg(3) Class53 arg3) {
		this.aClass53_27 = arg2;
		this.aClass53_26 = arg3;
		this.aClass53_27.method1592(36);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)Lclient!maa;")
	public Class182 method1680(@OriginalArg(0) int arg0) {
		@Pc(6) Class231 local6 = this.aClass231_15;
		@Pc(16) Class182 local16;
		synchronized (this.aClass231_15) {
			local16 = (Class182) this.aClass231_15.method6228((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class53 local29 = this.aClass53_27;
		@Pc(38) byte[] local38;
		synchronized (this.aClass53_27) {
			local38 = this.aClass53_27.method1616(arg0, 36);
		}
		local16 = new Class182();
		local16.aClass56_3 = this;
		local16.anInt5349 = arg0;
		if (local38 != null) {
			local16.method4601(new Class2_Sub29(local38));
		}
		local16.method4595();
		@Pc(75) Class231 local75 = this.aClass231_15;
		synchronized (this.aClass231_15) {
			this.aClass231_15.method6232(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)V")
	public void method1681() {
		@Pc(2) Class231 local2 = this.aClass231_15;
		synchronized (this.aClass231_15) {
			this.aClass231_15.method6240();
		}
		local2 = this.aClass231_16;
		synchronized (this.aClass231_16) {
			this.aClass231_16.method6240();
		}
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(B)V")
	public void method1683() {
		@Pc(6) Class231 local6 = this.aClass231_15;
		synchronized (this.aClass231_15) {
			this.aClass231_15.method6227();
		}
		local6 = this.aClass231_16;
		synchronized (this.aClass231_16) {
			this.aClass231_16.method6227();
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)V")
	public void method1684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass231_15 = new Class231(arg0);
		this.aClass231_16 = new Class231(arg1);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IB)V")
	public void method1686() {
		@Pc(2) Class231 local2 = this.aClass231_15;
		synchronized (this.aClass231_15) {
			this.aClass231_15.method6231(5);
		}
		local2 = this.aClass231_16;
		synchronized (this.aClass231_16) {
			this.aClass231_16.method6231(5);
		}
	}
}
