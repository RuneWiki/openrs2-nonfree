import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class178 {

	@OriginalMember(owner = "client!rm", name = "i", descriptor = "Lclient!ff;")
	private Class14_Sub2 aClass14_Sub2_54 = new Class14_Sub2();

	@OriginalMember(owner = "client!rm", name = "o", descriptor = "Lclient!er;")
	private final Class56 aClass56_12 = new Class56();

	@OriginalMember(owner = "client!rm", name = "n", descriptor = "I")
	private final int anInt5362;

	@OriginalMember(owner = "client!rm", name = "m", descriptor = "I")
	private int anInt5361;

	@OriginalMember(owner = "client!rm", name = "q", descriptor = "Lclient!bn;")
	private final Class25 aClass25_29;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(I)V")
	public Class178(@OriginalArg(0) int arg0) {
		this.anInt5362 = arg0;
		this.anInt5361 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass25_29 = new Class25(local19);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZLclient!ff;J)V")
	public void method4767(@OriginalArg(1) Class14_Sub2 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt5361 == 0) {
			@Pc(7) Class14_Sub2 local7 = this.aClass56_12.method1917();
			local7.method5986();
			local7.method5760();
			if (local7 == this.aClass14_Sub2_54) {
				local7 = this.aClass56_12.method1917();
				local7.method5986();
				local7.method5760();
			}
		} else {
			this.anInt5361--;
		}
		this.aClass25_29.method687(arg1, arg0);
		this.aClass56_12.method1922(arg0);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V")
	public void method4769() {
		this.aClass56_12.method1916();
		this.aClass25_29.method685();
		this.aClass14_Sub2_54 = new Class14_Sub2();
		this.anInt5361 = this.anInt5362;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IJ)Lclient!ff;")
	public Class14_Sub2 method4772(@OriginalArg(1) long arg0) {
		@Pc(10) Class14_Sub2 local10 = (Class14_Sub2) this.aClass25_29.method691(arg0);
		if (local10 != null) {
			this.aClass56_12.method1922(local10);
		}
		return local10;
	}
}
