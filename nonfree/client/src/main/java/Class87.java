import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public final class Class87 implements Interface11 {

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "Lclient!ha;")
	private Class144 aClass144_5;

	@OriginalMember(owner = "client!dt", name = "j", descriptor = "Z")
	private boolean aBoolean136;

	@OriginalMember(owner = "client!dt", name = "g", descriptor = "Lclient!ff;")
	private final Class115 aClass115_1;

	@OriginalMember(owner = "client!dt", name = "m", descriptor = "[Lclient!mf;")
	private final Interface13[] anInterface13Array1;

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Lclient!ff;Lclient!ve;)V")
	public Class87(@OriginalArg(0) Class115 arg0, @OriginalArg(1) Class373 arg1) {
		this.aClass115_1 = arg0;
		this.anInterface13Array1 = new Interface13[this.aClass115_1.anInterface14Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface13Array1.length; local15++) {
			this.anInterface13Array1[local15] = arg1.method8992(this.aClass115_1.anInterface14Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)V")
	@Override
	public void method5417() {
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(I)I")
	@Override
	public int method5416() {
		@Pc(7) int local7 = 0;
		@Pc(10) Interface13[] local10 = this.anInterface13Array1;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(18) Interface13 local18 = local10[local12];
			if (local18 == null || local18.method8820()) {
				local7++;
			}
		}
		return local7 * 100 / this.anInterface13Array1.length;
	}

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "(I)I")
	@Override
	public int method5413() {
		return this.aClass115_1.anInt2413;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5418(@OriginalArg(1) boolean arg0) {
		@Pc(10) Interface13[] local10 = this.anInterface13Array1;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(18) Interface13 local18 = local10[local12];
			if (local18 != null) {
				local18.method8819();
			}
		}
		this.aBoolean136 = false;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)V")
	@Override
	public void method5414() {
		if (Static103.aClass144_3 != this.aClass144_5) {
			this.aClass144_5 = Static103.aClass144_3;
			this.aBoolean136 = true;
		}
		this.aClass144_5.GA(0);
		@Pc(32) Interface13[] local32 = this.anInterface13Array1;
		for (@Pc(34) int local34 = 0; local34 < local32.length; local34++) {
			@Pc(40) Interface13 local40 = local32[local34];
			if (local40 != null) {
				local40.method8821();
			}
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(BJ)Z")
	@Override
	public boolean method5415(@OriginalArg(1) long arg0) {
		return Static26.method382() >= (long) this.aClass115_1.anInt2411 + arg0;
	}
}
