import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wu")
public final class Class365 implements Interface15 {

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "Z")
	private boolean aBoolean717;

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "Lclient!r;")
	private Class7 aClass7_14;

	@OriginalMember(owner = "client!wu", name = "n", descriptor = "Lclient!gh;")
	private final Class125 aClass125_1;

	@OriginalMember(owner = "client!wu", name = "l", descriptor = "[Lclient!gs;")
	private final Interface9[] anInterface9Array1;

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Lclient!gh;Lclient!sf;)V")
	public Class365(@OriginalArg(0) Class125 arg0, @OriginalArg(1) Class302 arg1) {
		this.aClass125_1 = arg0;
		this.anInterface9Array1 = new Interface9[this.aClass125_1.anInterface2Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface9Array1.length; local15++) {
			this.anInterface9Array1[local15] = arg1.method6941(this.aClass125_1.anInterface2Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8256(@OriginalArg(1) boolean arg0) {
		@Pc(10) Interface9[] local10 = this.anInterface9Array1;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(18) Interface9 local18 = local10[local12];
			if (local18 != null) {
				local18.method8147();
			}
		}
		this.aBoolean717 = false;
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(I)V")
	@Override
	public void method8260() {
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)V")
	@Override
	public void method8258() {
		if (this.aClass7_14 != Static39.aClass7_2) {
			this.aBoolean717 = true;
			this.aClass7_14 = Static39.aClass7_2;
		}
		this.aClass7_14.ja(0);
		@Pc(26) Interface9[] local26 = this.anInterface9Array1;
		for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
			@Pc(34) Interface9 local34 = local26[local28];
			if (local34 != null) {
				local34.method8148();
			}
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)I")
	@Override
	public int method8259() {
		@Pc(7) int local7 = 0;
		@Pc(18) Interface9[] local18 = this.anInterface9Array1;
		for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
			@Pc(26) Interface9 local26 = local18[local20];
			if (local26 == null || local26.method8149()) {
				local7++;
			}
		}
		return local7 * 100 / this.anInterface9Array1.length;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Z)I")
	@Override
	public int method8255() {
		return this.aClass125_1.anInt3483;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(JB)Z")
	@Override
	public boolean method8257(@OriginalArg(0) long arg0) {
		return Static112.method2047() >= arg0 + (long) this.aClass125_1.anInt3479;
	}
}
