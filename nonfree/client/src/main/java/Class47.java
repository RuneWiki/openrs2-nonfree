import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cca")
public final class Class47 {

	@OriginalMember(owner = "client!cca", name = "e", descriptor = "Lclient!ww;")
	private Class2_Sub2 aClass2_Sub2_19 = new Class2_Sub2();

	@OriginalMember(owner = "client!cca", name = "k", descriptor = "Lclient!dm;")
	private final Class75 aClass75_3 = new Class75();

	@OriginalMember(owner = "client!cca", name = "h", descriptor = "I")
	private final int anInt1172;

	@OriginalMember(owner = "client!cca", name = "j", descriptor = "I")
	private int anInt1173;

	@OriginalMember(owner = "client!cca", name = "i", descriptor = "Lclient!gca;")
	private final Class118 aClass118_8;

	@OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(I)V")
	public Class47(@OriginalArg(0) int arg0) {
		this.anInt1172 = arg0;
		this.anInt1173 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass118_8 = new Class118(local19);
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(BJ)Lclient!ww;")
	public Class2_Sub2 method912(@OriginalArg(1) long arg0) {
		@Pc(10) Class2_Sub2 local10 = (Class2_Sub2) this.aClass118_8.method2595(arg0);
		if (local10 != null) {
			this.aClass75_3.method1572(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(B)V")
	public void method913() {
		this.aClass75_3.method1567();
		this.aClass118_8.method2599();
		this.aClass2_Sub2_19 = new Class2_Sub2();
		this.anInt1173 = this.anInt1172;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(JB)V")
	public void method914(@OriginalArg(0) long arg0) {
		@Pc(10) Class2_Sub2 local10 = (Class2_Sub2) this.aClass118_8.method2595(arg0);
		if (local10 != null) {
			local10.method8653();
			local10.method8271();
			this.anInt1173++;
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(JLclient!ww;I)V")
	public void method915(@OriginalArg(0) long arg0, @OriginalArg(1) Class2_Sub2 arg1) {
		if (this.anInt1173 == 0) {
			@Pc(18) Class2_Sub2 local18 = this.aClass75_3.method1571();
			local18.method8653();
			local18.method8271();
			if (local18 == this.aClass2_Sub2_19) {
				local18 = this.aClass75_3.method1571();
				local18.method8653();
				local18.method8271();
			}
		} else {
			this.anInt1173--;
		}
		this.aClass118_8.method2601(arg1, arg0);
		this.aClass75_3.method1572(arg1);
	}
}
