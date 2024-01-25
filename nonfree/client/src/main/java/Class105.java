import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class105 {

	@OriginalMember(owner = "client!fn", name = "f", descriptor = "Lclient!ff;")
	private Class1_Sub2 aClass1_Sub2_24 = new Class1_Sub2();

	@OriginalMember(owner = "client!fn", name = "n", descriptor = "Lclient!rp;")
	private final Class259 aClass259_4 = new Class259();

	@OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
	private final int anInt2786;

	@OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
	private int anInt2787;

	@OriginalMember(owner = "client!fn", name = "k", descriptor = "Lclient!pt;")
	private final Class230 aClass230_19;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(I)V")
	public Class105(@OriginalArg(0) int arg0) {
		this.anInt2786 = arg0;
		this.anInt2787 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass230_19 = new Class230(local19);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(BLclient!ff;J)V")
	public void method2600(@OriginalArg(1) Class1_Sub2 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt2787 == 0) {
			@Pc(15) Class1_Sub2 local15 = this.aClass259_4.method6658();
			local15.method8239();
			local15.method7390();
			if (this.aClass1_Sub2_24 == local15) {
				local15 = this.aClass259_4.method6658();
				local15.method8239();
				local15.method7390();
			}
		} else {
			this.anInt2787--;
		}
		this.aClass230_19.method6139(arg1, arg0);
		this.aClass259_4.method6656(arg0);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V")
	public void method2604() {
		this.aClass259_4.method6653();
		this.aClass230_19.method6141();
		this.aClass1_Sub2_24 = new Class1_Sub2();
		this.anInt2787 = this.anInt2786;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IJ)Lclient!ff;")
	public Class1_Sub2 method2605(@OriginalArg(1) long arg0) {
		@Pc(15) Class1_Sub2 local15 = (Class1_Sub2) this.aClass230_19.method6144(arg0);
		if (local15 != null) {
			this.aClass259_4.method6656(local15);
		}
		return local15;
	}
}
