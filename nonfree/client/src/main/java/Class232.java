import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mda")
public final class Class232 implements Interface18 {

	@OriginalMember(owner = "client!mda", name = "c", descriptor = "Z")
	private boolean aBoolean390;

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "Lclient!ha;")
	private Class100 aClass100_8;

	@OriginalMember(owner = "client!mda", name = "n", descriptor = "Lclient!eo;")
	private final Class99 aClass99_1;

	@OriginalMember(owner = "client!mda", name = "j", descriptor = "[Lclient!bka;")
	private final Interface5[] anInterface5Array1;

	@OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Lclient!eo;Lclient!fc;)V")
	public Class232(@OriginalArg(0) Class99 arg0, @OriginalArg(1) Class107 arg1) {
		this.aClass99_1 = arg0;
		this.anInterface5Array1 = new Interface5[this.aClass99_1.anInterface3Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface5Array1.length; local15++) {
			this.anInterface5Array1[local15] = arg1.method2732(this.aClass99_1.anInterface3Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(I)V")
	@Override
	public void method5204() {
		if (this.aClass100_8 != Static273.aClass100_6) {
			this.aClass100_8 = Static273.aClass100_6;
			this.aBoolean390 = true;
		}
		this.aClass100_8.GA(0);
		@Pc(32) Interface5[] local32 = this.anInterface5Array1;
		for (@Pc(34) int local34 = 0; local34 < local32.length; local34++) {
			@Pc(40) Interface5 local40 = local32[local34];
			if (local40 != null) {
				local40.method8563();
			}
		}
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(Z)I")
	@Override
	public int method5202() {
		return this.aClass99_1.anInt2194;
	}

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "(I)I")
	@Override
	public int method5203() {
		@Pc(7) int local7 = 0;
		@Pc(19) Interface5[] local19 = this.anInterface5Array1;
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(27) Interface5 local27 = local19[local21];
			if (local27 == null || local27.method8564()) {
				local7++;
			}
		}
		return local7 * 100 / this.anInterface5Array1.length;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(B)V")
	@Override
	public void method5201() {
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5205(@OriginalArg(0) boolean arg0) {
		@Pc(15) Interface5[] local15 = this.anInterface5Array1;
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(23) Interface5 local23 = local15[local17];
			if (local23 != null) {
				local23.method8562();
			}
		}
		this.aBoolean390 = false;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(JI)Z")
	@Override
	public boolean method5200(@OriginalArg(0) long arg0) {
		return Static480.method6763() >= (long) this.aClass99_1.anInt2197 + arg0;
	}
}
