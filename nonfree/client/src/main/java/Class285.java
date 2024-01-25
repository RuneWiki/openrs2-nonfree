import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qt")
public final class Class285 implements Interface5 {

	@OriginalMember(owner = "client!qt", name = "h", descriptor = "Lclient!ha;")
	private Class20 aClass20_12;

	@OriginalMember(owner = "client!qt", name = "i", descriptor = "Z")
	private boolean aBoolean643;

	@OriginalMember(owner = "client!qt", name = "d", descriptor = "Lclient!vp;")
	private final Class361 aClass361_1;

	@OriginalMember(owner = "client!qt", name = "j", descriptor = "[Lclient!aaa;")
	private final Interface1[] anInterface1Array1;

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lclient!vp;Lclient!mia;)V")
	public Class285(@OriginalArg(0) Class361 arg0, @OriginalArg(1) Class210 arg1) {
		this.aClass361_1 = arg0;
		this.anInterface1Array1 = new Interface1[this.aClass361_1.anInterface2Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface1Array1.length; local15++) {
			this.anInterface1Array1[local15] = arg1.method5950(this.aClass361_1.anInterface2Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V")
	@Override
	public void method9011() {
		if (this.aClass20_12 != Static186.aClass20_4) {
			this.aClass20_12 = Static186.aClass20_4;
			this.aBoolean643 = true;
		}
		this.aClass20_12.GA(0);
		@Pc(22) Interface1[] local22 = this.anInterface1Array1;
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(30) Interface1 local30 = local22[local24];
			if (local30 != null) {
				local30.method9231();
			}
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(ZI)V")
	@Override
	public void method9012(@OriginalArg(0) boolean arg0) {
		@Pc(10) Interface1[] local10 = this.anInterface1Array1;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(18) Interface1 local18 = local10[local12];
			if (local18 != null) {
				local18.method9233();
			}
		}
		this.aBoolean643 = false;
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(I)V")
	@Override
	public void method9013() {
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)I")
	@Override
	public int method9009() {
		return this.aClass361_1.anInt10684;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(BJ)Z")
	@Override
	public boolean method9010(@OriginalArg(1) long arg0) {
		return Static277.method5091() >= arg0 + (long) this.aClass361_1.anInt10686;
	}

	@OriginalMember(owner = "client!qt", name = "c", descriptor = "(I)I")
	@Override
	public int method9014() {
		@Pc(14) int local14 = 0;
		@Pc(17) Interface1[] local17 = this.anInterface1Array1;
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			@Pc(25) Interface1 local25 = local17[local19];
			if (local25 == null || local25.method9232()) {
				local14++;
			}
		}
		return local14 * 100 / this.anInterface1Array1.length;
	}
}
