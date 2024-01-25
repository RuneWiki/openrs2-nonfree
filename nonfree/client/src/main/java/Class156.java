import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class156 implements Interface21 {

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "Lclient!ha;")
	private Class82 aClass82_4;

	@OriginalMember(owner = "client!ic", name = "n", descriptor = "Z")
	private boolean aBoolean338;

	@OriginalMember(owner = "client!ic", name = "k", descriptor = "Lclient!laa;")
	private final Class199 aClass199_1;

	@OriginalMember(owner = "client!ic", name = "m", descriptor = "[Lclient!vd;")
	private final Interface27[] anInterface27Array1;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lclient!laa;Lclient!tda;)V")
	public Class156(@OriginalArg(0) Class199 arg0, @OriginalArg(1) Class319 arg1) {
		this.aClass199_1 = arg0;
		this.anInterface27Array1 = new Interface27[this.aClass199_1.anInterface23Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface27Array1.length; local15++) {
			this.anInterface27Array1[local15] = arg1.method7785(this.aClass199_1.anInterface23Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8187(@OriginalArg(0) boolean arg0) {
		@Pc(10) Interface27[] local10 = this.anInterface27Array1;
		for (@Pc(19) int local19 = 0; local19 < local10.length; local19++) {
			@Pc(25) Interface27 local25 = local10[local19];
			if (local25 != null) {
				local25.method8108();
			}
		}
		this.aBoolean338 = false;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
	@Override
	public void method8190() {
		if (this.aClass82_4 != Static266.aClass82_8) {
			this.aClass82_4 = Static266.aClass82_8;
			this.aBoolean338 = true;
		}
		this.aClass82_4.GA(0);
		@Pc(30) Interface27[] local30 = this.anInterface27Array1;
		for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
			@Pc(38) Interface27 local38 = local30[local32];
			if (local38 != null) {
				local38.method8107();
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)I")
	@Override
	public int method8192() {
		@Pc(7) int local7 = 0;
		@Pc(10) Interface27[] local10 = this.anInterface27Array1;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(18) Interface27 local18 = local10[local12];
			if (local18 == null || local18.method8109()) {
				local7++;
			}
		}
		return local7 * 100 / this.anInterface27Array1.length;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)I")
	@Override
	public int method8189() {
		return this.aClass199_1.anInt6046;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(JI)Z")
	@Override
	public boolean method8188(@OriginalArg(0) long arg0) {
		return Static191.method3071() >= arg0 + (long) this.aClass199_1.anInt6049;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
	@Override
	public void method8191() {
	}
}
