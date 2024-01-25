import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wfa")
public final class Class384 implements Interface22 {

	@OriginalMember(owner = "client!wfa", name = "d", descriptor = "Z")
	private boolean aBoolean794;

	@OriginalMember(owner = "client!wfa", name = "n", descriptor = "Lclient!ha;")
	private Class33 aClass33_16;

	@OriginalMember(owner = "client!wfa", name = "i", descriptor = "Lclient!qea;")
	private final Class301 aClass301_1;

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "[Lclient!g;")
	private final Interface13[] anInterface13Array1;

	@OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "(Lclient!qea;Lclient!fb;)V")
	public Class384(@OriginalArg(0) Class301 arg0, @OriginalArg(1) Class106 arg1) {
		this.aClass301_1 = arg0;
		this.anInterface13Array1 = new Interface13[this.aClass301_1.anInterface3Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface13Array1.length; local15++) {
			this.anInterface13Array1[local15] = arg1.method2550(this.aClass301_1.anInterface3Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)V")
	@Override
	public void method8779() {
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(B)I")
	@Override
	public int method8776() {
		return this.aClass301_1.anInt7621;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8778(@OriginalArg(0) boolean arg0) {
		@Pc(10) Interface13[] local10 = this.anInterface13Array1;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(18) Interface13 local18 = local10[local12];
			if (local18 != null) {
				local18.method8637();
			}
		}
		this.aBoolean794 = false;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(JI)Z")
	@Override
	public boolean method8780(@OriginalArg(0) long arg0) {
		return Static429.method5935() >= arg0 + (long) this.aClass301_1.anInt7622;
	}

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "(I)V")
	@Override
	public void method8781() {
		if (Static582.aClass33_13 != this.aClass33_16) {
			this.aBoolean794 = true;
			this.aClass33_16 = Static582.aClass33_13;
		}
		this.aClass33_16.GA(0);
		@Pc(28) Interface13[] local28 = this.anInterface13Array1;
		for (@Pc(30) int local30 = 0; local30 < local28.length; local30++) {
			@Pc(36) Interface13 local36 = local28[local30];
			if (local36 != null) {
				local36.method8638();
			}
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Z)I")
	@Override
	public int method8777() {
		@Pc(12) int local12 = 0;
		@Pc(15) Interface13[] local15 = this.anInterface13Array1;
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(23) Interface13 local23 = local15[local17];
			if (local23 == null || local23.method8636()) {
				local12++;
			}
		}
		return local12 * 100 / this.anInterface13Array1.length;
	}
}
