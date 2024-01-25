import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class86 {

	@OriginalMember(owner = "client!fs", name = "h", descriptor = "Lclient!tm;")
	private Class7_Sub4 aClass7_Sub4_17 = new Class7_Sub4();

	@OriginalMember(owner = "client!fs", name = "p", descriptor = "Lclient!bg;")
	private final Class24 aClass24_2 = new Class24();

	@OriginalMember(owner = "client!fs", name = "n", descriptor = "I")
	private final int anInt2424;

	@OriginalMember(owner = "client!fs", name = "o", descriptor = "I")
	private int anInt2425;

	@OriginalMember(owner = "client!fs", name = "m", descriptor = "Lclient!mt;")
	private final Class164 aClass164_15;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(I)V")
	public Class86(@OriginalArg(0) int arg0) {
		this.anInt2424 = arg0;
		this.anInt2425 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass164_15 = new Class164(local19);
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)V")
	public void method2016() {
		this.aClass24_2.method299();
		this.aClass164_15.method3509();
		this.aClass7_Sub4_17 = new Class7_Sub4();
		this.anInt2425 = this.anInt2424;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lclient!tm;IJ)V")
	public void method2018(@OriginalArg(0) Class7_Sub4 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt2425 == 0) {
			@Pc(15) Class7_Sub4 local15 = this.aClass24_2.method308();
			local15.method5802();
			local15.method5661();
			if (local15 == this.aClass7_Sub4_17) {
				local15 = this.aClass24_2.method308();
				local15.method5802();
				local15.method5661();
			}
		} else {
			this.anInt2425--;
		}
		this.aClass164_15.method3508(arg1, arg0);
		this.aClass24_2.method298(arg0);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(JI)Lclient!tm;")
	public Class7_Sub4 method2019(@OriginalArg(0) long arg0) {
		@Pc(15) Class7_Sub4 local15 = (Class7_Sub4) this.aClass164_15.method3512(arg0);
		if (local15 != null) {
			this.aClass24_2.method298(local15);
		}
		return local15;
	}
}
