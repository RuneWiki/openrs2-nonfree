import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wu")
public final class Class366 implements Interface23 {

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "Lclient!r;")
	private Class31 aClass31_14;

	@OriginalMember(owner = "client!wu", name = "f", descriptor = "Z")
	private boolean aBoolean726;

	@OriginalMember(owner = "client!wu", name = "l", descriptor = "Lclient!ab;")
	private final Class4 aClass4_1;

	@OriginalMember(owner = "client!wu", name = "n", descriptor = "[Lclient!at;")
	private final Interface1[] anInterface1Array1;

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Lclient!ab;Lclient!ida;)V")
	public Class366(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class138 arg1) {
		this.aClass4_1 = arg0;
		this.anInterface1Array1 = new Interface1[this.aClass4_1.anInterface9Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface1Array1.length; local15++) {
			this.anInterface1Array1[local15] = arg1.method3598(this.aClass4_1.anInterface9Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!wu", name = "d", descriptor = "(I)V")
	@Override
	public void method8171() {
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(I)V")
	@Override
	public void method8169() {
		if (Static319.aClass31_11 != this.aClass31_14) {
			this.aBoolean726 = true;
			this.aClass31_14 = Static319.aClass31_11;
		}
		this.aClass31_14.ja(0);
		@Pc(28) Interface1[] local28 = this.anInterface1Array1;
		for (@Pc(30) int local30 = 0; local30 < local28.length; local30++) {
			@Pc(36) Interface1 local36 = local28[local30];
			if (local36 != null) {
				local36.method7700();
			}
		}
	}

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "(I)I")
	@Override
	public int method8170() {
		return this.aClass4_1.anInt22;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)I")
	@Override
	public int method8167() {
		@Pc(7) int local7 = 0;
		@Pc(18) Interface1[] local18 = this.anInterface1Array1;
		for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
			@Pc(26) Interface1 local26 = local18[local20];
			if (local26 == null || local26.method7701()) {
				local7++;
			}
		}
		return local7 * 100 / this.anInterface1Array1.length;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IJ)Z")
	@Override
	public boolean method8168(@OriginalArg(1) long arg0) {
		return Static96.method2000() >= arg0 + (long) this.aClass4_1.anInt25;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8172(@OriginalArg(1) boolean arg0) {
		@Pc(10) Interface1[] local10 = this.anInterface1Array1;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(18) Interface1 local18 = local10[local12];
			if (local18 != null) {
				local18.method7699();
			}
		}
		this.aBoolean726 = false;
	}
}
