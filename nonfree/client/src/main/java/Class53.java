import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cda")
public final class Class53 implements Interface19 {

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "Lclient!ha;")
	private Class13 aClass13_1;

	@OriginalMember(owner = "client!cda", name = "h", descriptor = "Z")
	private boolean aBoolean89;

	@OriginalMember(owner = "client!cda", name = "k", descriptor = "Lclient!jn;")
	private final Class172 aClass172_1;

	@OriginalMember(owner = "client!cda", name = "i", descriptor = "[Lclient!ww;")
	private final Interface27[] anInterface27Array1;

	@OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(Lclient!jn;Lclient!jaa;)V")
	public Class53(@OriginalArg(0) Class172 arg0, @OriginalArg(1) Class161 arg1) {
		this.aClass172_1 = arg0;
		this.anInterface27Array1 = new Interface27[this.aClass172_1.anInterface18Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface27Array1.length; local15++) {
			this.anInterface27Array1[local15] = arg1.method4355(this.aClass172_1.anInterface18Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!cda", name = "b", descriptor = "(I)I")
	@Override
	public int method2899() {
		@Pc(7) int local7 = 0;
		@Pc(15) Interface27[] local15 = this.anInterface27Array1;
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(23) Interface27 local23 = local15[local17];
			if (local23 == null || local23.method7759()) {
				local7++;
			}
		}
		return local7 * 100 / this.anInterface27Array1.length;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method2901(@OriginalArg(1) boolean arg0) {
		@Pc(10) Interface27[] local10 = this.anInterface27Array1;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(18) Interface27 local18 = local10[local12];
			if (local18 != null) {
				local18.method7760();
			}
		}
		this.aBoolean89 = false;
	}

	@OriginalMember(owner = "client!cda", name = "b", descriptor = "(Z)V")
	@Override
	public void method2900() {
		if (this.aClass13_1 != Static674.aClass13_22) {
			this.aBoolean89 = true;
			this.aClass13_1 = Static674.aClass13_22;
		}
		this.aClass13_1.GA(0);
		@Pc(27) Interface27[] local27 = this.anInterface27Array1;
		for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
			@Pc(35) Interface27 local35 = local27[local29];
			if (local35 != null) {
				local35.method7758();
			}
		}
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)I")
	@Override
	public int method2896() {
		return this.aClass172_1.anInt4900;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(IJ)Z")
	@Override
	public boolean method2898(@OriginalArg(1) long arg0) {
		return Static524.method7320() >= arg0 + (long) this.aClass172_1.anInt4898;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(Z)V")
	@Override
	public void method2897() {
	}
}
