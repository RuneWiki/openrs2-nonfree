import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class201 {

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "Lclient!ld;")
	private Class1_Sub1 aClass1_Sub1_36 = new Class1_Sub1();

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "Lclient!gba;")
	private final Class104 aClass104_7 = new Class104();

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
	private final int anInt5805;

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
	private int anInt5804;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "Lclient!ba;")
	private final Class17 aClass17_23;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(I)V")
	public Class201(@OriginalArg(0) int arg0) {
		this.anInt5805 = arg0;
		this.anInt5804 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass17_23 = new Class17(local19);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!ld;J)V")
	public void method4925(@OriginalArg(1) Class1_Sub1 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt5804 == 0) {
			@Pc(12) Class1_Sub1 local12 = this.aClass104_7.method2418();
			local12.method7525();
			local12.method7528();
			if (local12 == this.aClass1_Sub1_36) {
				local12 = this.aClass104_7.method2418();
				local12.method7525();
				local12.method7528();
			}
		} else {
			this.anInt5804--;
		}
		this.aClass17_23.method737(arg0, arg1);
		this.aClass104_7.method2420(arg0);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IJ)Lclient!ld;")
	public Class1_Sub1 method4927(@OriginalArg(1) long arg0) {
		@Pc(15) Class1_Sub1 local15 = (Class1_Sub1) this.aClass17_23.method738(arg0);
		if (local15 != null) {
			this.aClass104_7.method2420(local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
	public void method4928() {
		this.aClass104_7.method2419();
		this.aClass17_23.method734();
		this.aClass1_Sub1_36 = new Class1_Sub1();
		this.anInt5804 = this.anInt5805;
	}
}
