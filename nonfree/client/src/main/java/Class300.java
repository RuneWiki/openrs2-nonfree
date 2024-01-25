import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class300 implements Interface17 {

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "Lclient!ha;")
	private Class137 aClass137_39;

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "Z")
	private boolean aBoolean632;

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "Lclient!kb;")
	private final Class193 aClass193_1;

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "[Lclient!aj;")
	private final Interface1[] anInterface1Array1;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lclient!kb;Lclient!sb;)V")
	public Class300(@OriginalArg(0) Class193 arg0, @OriginalArg(1) Class311 arg1) {
		this.aClass193_1 = arg0;
		this.anInterface1Array1 = new Interface1[this.aClass193_1.anInterface2Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface1Array1.length; local15++) {
			this.anInterface1Array1[local15] = arg1.method7623(this.aClass193_1.anInterface2Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V")
	@Override
	public void method9114() {
		if (this.aClass137_39 != Static677.aClass137_47) {
			this.aBoolean632 = true;
			this.aClass137_39 = Static677.aClass137_47;
		}
		this.aClass137_39.GA(0);
		@Pc(26) Interface1[] local26 = this.anInterface1Array1;
		for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
			@Pc(34) Interface1 local34 = local26[local28];
			if (local34 != null) {
				local34.method8739();
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)I")
	@Override
	public int method9115() {
		@Pc(13) int local13 = 0;
		@Pc(16) Interface1[] local16 = this.anInterface1Array1;
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(24) Interface1 local24 = local16[local18];
			if (local24 == null || local24.method8740()) {
				local13++;
			}
		}
		return local13 * 100 / this.anInterface1Array1.length;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IJ)Z")
	@Override
	public boolean method9112(@OriginalArg(1) long arg0) {
		return Static521.method7499() >= arg0 + (long) this.aClass193_1.anInt5221;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)I")
	@Override
	public int method9111() {
		return this.aClass193_1.anInt5220;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
	@Override
	public void method9116() {
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZB)V")
	@Override
	public void method9113(@OriginalArg(0) boolean arg0) {
		@Pc(10) Interface1[] local10 = this.anInterface1Array1;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(18) Interface1 local18 = local10[local12];
			if (local18 != null) {
				local18.method8741();
			}
		}
		this.aBoolean632 = false;
	}
}
