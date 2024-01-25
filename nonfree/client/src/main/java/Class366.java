import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vfa")
public final class Class366 implements Interface5 {

	@OriginalMember(owner = "client!vfa", name = "b", descriptor = "Lclient!ha;")
	private Class65 aClass65_15;

	@OriginalMember(owner = "client!vfa", name = "i", descriptor = "Z")
	private boolean aBoolean874;

	@OriginalMember(owner = "client!vfa", name = "f", descriptor = "Lclient!raa;")
	private final Class298 aClass298_1;

	@OriginalMember(owner = "client!vfa", name = "c", descriptor = "[Lclient!ol;")
	private final Interface21[] anInterface21Array1;

	@OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(Lclient!raa;Lclient!fj;)V")
	public Class366(@OriginalArg(0) Class298 arg0, @OriginalArg(1) Class119 arg1) {
		this.aClass298_1 = arg0;
		this.anInterface21Array1 = new Interface21[this.aClass298_1.anInterface24Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface21Array1.length; local15++) {
			this.anInterface21Array1[local15] = arg1.method2963(this.aClass298_1.anInterface24Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(B)I")
	@Override
	public int method8489() {
		@Pc(14) int local14 = 0;
		@Pc(17) Interface21[] local17 = this.anInterface21Array1;
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			@Pc(25) Interface21 local25 = local17[local19];
			if (local25 == null || local25.method7887()) {
				local14++;
			}
		}
		return local14 * 100 / this.anInterface21Array1.length;
	}

	@OriginalMember(owner = "client!vfa", name = "c", descriptor = "(I)V")
	@Override
	public void method8494() {
		if (this.aClass65_15 != Static208.aClass65_7) {
			this.aClass65_15 = Static208.aClass65_7;
			this.aBoolean874 = true;
		}
		this.aClass65_15.GA(0);
		@Pc(28) Interface21[] local28 = this.anInterface21Array1;
		for (@Pc(30) int local30 = 0; local30 < local28.length; local30++) {
			@Pc(36) Interface21 local36 = local28[local30];
			if (local36 != null) {
				local36.method7888();
			}
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8491(@OriginalArg(1) boolean arg0) {
		@Pc(18) Interface21[] local18 = this.anInterface21Array1;
		for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
			@Pc(26) Interface21 local26 = local18[local20];
			if (local26 != null) {
				local26.method7886();
			}
		}
		this.aBoolean874 = false;
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(BJ)Z")
	@Override
	public boolean method8490(@OriginalArg(1) long arg0) {
		return Static547.method7619() >= arg0 + (long) this.aClass298_1.anInt8317;
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(I)I")
	@Override
	public int method8492() {
		return this.aClass298_1.anInt8316;
	}

	@OriginalMember(owner = "client!vfa", name = "b", descriptor = "(I)V")
	@Override
	public void method8493() {
	}
}
