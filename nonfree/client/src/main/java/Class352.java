import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class352 implements Interface15 {

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "Z")
	private boolean aBoolean718;

	@OriginalMember(owner = "client!vq", name = "e", descriptor = "Lclient!r;")
	private Class45 aClass45_13;

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "Lclient!ok;")
	private final Class241 aClass241_1;

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "[Lclient!waa;")
	private final Interface24[] anInterface24Array1;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lclient!ok;Lclient!ul;)V")
	public Class352(@OriginalArg(0) Class241 arg0, @OriginalArg(1) Class340 arg1) {
		this.aClass241_1 = arg0;
		this.anInterface24Array1 = new Interface24[this.aClass241_1.anInterface22Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface24Array1.length; local15++) {
			this.anInterface24Array1[local15] = arg1.method7126(this.aClass241_1.anInterface22Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7602(@OriginalArg(0) boolean arg0) {
		@Pc(18) Interface24[] local18 = this.anInterface24Array1;
		for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
			@Pc(26) Interface24 local26 = local18[local20];
			if (local26 != null) {
				local26.method6873();
			}
		}
		this.aBoolean718 = false;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)I")
	@Override
	public int method7604() {
		return this.aClass241_1.anInt6778;
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)V")
	@Override
	public void method7601() {
		if (Static505.aClass45_11 != this.aClass45_13) {
			this.aBoolean718 = true;
			this.aClass45_13 = Static505.aClass45_11;
		}
		this.aClass45_13.ja(0);
		@Pc(22) Interface24[] local22 = this.anInterface24Array1;
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(30) Interface24 local30 = local22[local24];
			if (local30 != null) {
				local30.method6872();
			}
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Z)I")
	@Override
	public int method7603() {
		@Pc(12) int local12 = 0;
		@Pc(15) Interface24[] local15 = this.anInterface24Array1;
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(23) Interface24 local23 = local15[local17];
			if (local23 == null || local23.method6871()) {
				local12++;
			}
		}
		return local12 * 100 / this.anInterface24Array1.length;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
	@Override
	public void method7600() {
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IJ)Z")
	@Override
	public boolean method7605(@OriginalArg(1) long arg0) {
		return Static158.method2936() >= arg0 + (long) this.aClass241_1.anInt6781;
	}
}
