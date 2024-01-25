import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class71 implements Interface22 {

	@OriginalMember(owner = "client!dk", name = "l", descriptor = "Lclient!r;")
	private Class12 aClass12_7;

	@OriginalMember(owner = "client!dk", name = "m", descriptor = "Z")
	private boolean aBoolean165;

	@OriginalMember(owner = "client!dk", name = "h", descriptor = "Lclient!raa;")
	private final Class275 aClass275_1;

	@OriginalMember(owner = "client!dk", name = "n", descriptor = "[Lclient!gca;")
	private final Interface6[] anInterface6Array1;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lclient!raa;Lclient!kda;)V")
	public Class71(@OriginalArg(0) Class275 arg0, @OriginalArg(1) Class185 arg1) {
		this.aClass275_1 = arg0;
		this.anInterface6Array1 = new Interface6[this.aClass275_1.anInterface2Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface6Array1.length; local15++) {
			this.anInterface6Array1[local15] = arg1.method4197(this.aClass275_1.anInterface2Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IZ)V")
	@Override
	public void method1805(@OriginalArg(1) boolean arg0) {
		@Pc(10) Interface6[] local10 = this.anInterface6Array1;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(18) Interface6 local18 = local10[local12];
			if (local18 != null) {
				local18.method6803();
			}
		}
		this.aBoolean165 = false;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(JI)Z")
	@Override
	public boolean method1803(@OriginalArg(0) long arg0) {
		return arg0 + (long) this.aClass275_1.anInt7738 <= Static255.method4035();
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
	@Override
	public void method1804() {
		if (this.aClass12_7 != Static136.aClass12_8) {
			this.aBoolean165 = true;
			this.aClass12_7 = Static136.aClass12_8;
		}
		this.aClass12_7.ja(0);
		@Pc(26) Interface6[] local26 = this.anInterface6Array1;
		for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
			@Pc(34) Interface6 local34 = local26[local28];
			if (local34 != null) {
				local34.method6804();
			}
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)V")
	@Override
	public void method1806() {
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)I")
	@Override
	public int method1807() {
		return this.aClass275_1.anInt7736;
	}

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)I")
	@Override
	public int method1808() {
		@Pc(7) int local7 = 0;
		@Pc(10) Interface6[] local10 = this.anInterface6Array1;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(18) Interface6 local18 = local10[local12];
			if (local18 == null || local18.method6805()) {
				local7++;
			}
		}
		return local7 * 100 / this.anInterface6Array1.length;
	}
}
