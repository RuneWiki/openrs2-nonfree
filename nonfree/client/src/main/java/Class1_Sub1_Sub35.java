import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class1_Sub1_Sub35 extends Class1_Sub1 {

	@OriginalMember(owner = "client!te", name = "V", descriptor = "I")
	private int anInt5500;

	@OriginalMember(owner = "client!te", name = "Y", descriptor = "[I")
	private int[] anIntArray556;

	@OriginalMember(owner = "client!te", name = "eb", descriptor = "I")
	private int anInt5507;

	@OriginalMember(owner = "client!te", name = "W", descriptor = "I")
	private int anInt5501 = -1;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub35() {
		super(0, false);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4749(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = this.aClass70_41.method1662(arg0);
		if (this.aClass70_41.aBoolean118 && this.method4309()) {
			@Pc(33) int[] local33 = local7[2];
			@Pc(37) int[] local37 = local7[0];
			@Pc(53) int local53 = this.anInt5507 * (this.anInt5500 == Static6.anInt2264 ? arg0 : arg0 * this.anInt5500 / Static6.anInt2264);
			@Pc(57) int[] local57 = local7[1];
			@Pc(67) int local67;
			@Pc(77) int local77;
			if (this.anInt5507 == Static75.anInt1848) {
				for (local67 = 0; local67 < Static75.anInt1848; local67++) {
					local77 = this.anIntArray556[local53++];
					local33[local67] = (local77 & 0xFF) << 4;
					local57[local67] = local77 >> 4 & 0xFF0;
					local37[local67] = local77 >> 12 & 0xFF0;
				}
			} else {
				for (local67 = 0; local67 < Static75.anInt1848; local67++) {
					local77 = this.anInt5507 * local67 / Static75.anInt1848;
					@Pc(84) int local84 = this.anIntArray556[local77 + local53];
					local33[local67] = (local84 & 0xFF) << 4;
					local57[local67] = local84 >> 4 & 0xFF0;
					local37[local67] = local84 >> 12 & 0xFF0;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!te", name = "f", descriptor = "(I)V")
	@Override
	public void method4762() {
		super.method4762();
		this.anIntArray556 = null;
	}

	@OriginalMember(owner = "client!te", name = "g", descriptor = "(I)Z")
	private boolean method4309() {
		if (this.anIntArray556 != null) {
			return true;
		} else if (this.anInt5501 >= 0) {
			@Pc(17) int local17 = Static75.anInt1848;
			@Pc(19) int local19 = Static6.anInt2264;
			@Pc(30) int local30 = Static75.anInterface3_1.method4404(this.anInt5501).aBoolean251 ? 64 : 128;
			this.anIntArray556 = Static75.anInterface3_1.method4406(local30, 1.0F, local30, this.anInt5501);
			this.anInt5500 = local30;
			this.anInt5507 = local30;
			Static254.method4235(local19, local17);
			return this.anIntArray556 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!te", name = "e", descriptor = "(I)I")
	@Override
	public int method4761() {
		return this.anInt5501;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BLclient!im;I)V")
	@Override
	public void method4760(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5501 = arg0.method2652();
		}
	}
}
