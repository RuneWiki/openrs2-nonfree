import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class270 implements Interface24 {

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "Lclient!oa;")
	private Class15 aClass15_15;

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "Z")
	private boolean aBoolean678;

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "Lclient!si;")
	private final Class298 aClass298_1;

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "[Lclient!n;")
	private final Interface11[] anInterface11Array1;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lclient!si;Lclient!em;)V")
	public Class270(@OriginalArg(0) Class298 arg0, @OriginalArg(1) Class86 arg1) {
		this.aClass298_1 = arg0;
		this.anInterface11Array1 = new Interface11[this.aClass298_1.anInterface8Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface11Array1.length; local15++) {
			this.anInterface11Array1[local15] = arg1.method2384(this.aClass298_1.anInterface8Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)I")
	@Override
	public int method6804() {
		return this.aClass298_1.anInt8969;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
	@Override
	public void method6802() {
		if (Static546.aClass15_16 != this.aClass15_15) {
			this.aBoolean678 = true;
			this.aClass15_15 = Static546.aClass15_16;
		}
		this.aClass15_15.D(0);
		@Pc(26) Interface11[] local26 = this.anInterface11Array1;
		for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
			@Pc(34) Interface11 local34 = local26[local28];
			if (local34 != null) {
				local34.method8277();
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)I")
	@Override
	public int method6800() {
		@Pc(7) int local7 = 0;
		@Pc(15) Interface11[] local15 = this.anInterface11Array1;
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(23) Interface11 local23 = local15[local17];
			if (local23 == null || local23.method8278()) {
				local7++;
			}
		}
		return local7 * 100 / this.anInterface11Array1.length;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZJ)Z")
	@Override
	public boolean method6801(@OriginalArg(1) long arg0) {
		return Static376.method6088() >= (long) this.aClass298_1.anInt8973 + arg0;
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)V")
	@Override
	public void method6803() {
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6799(@OriginalArg(0) boolean arg0) {
		@Pc(16) Interface11[] local16 = this.anInterface11Array1;
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(24) Interface11 local24 = local16[local18];
			if (local24 != null) {
				local24.method8276();
			}
		}
		this.aBoolean678 = false;
	}
}
