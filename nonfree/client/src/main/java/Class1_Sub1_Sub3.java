import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!be", name = "Q", descriptor = "I")
	private int anInt350 = 1365;

	@OriginalMember(owner = "client!be", name = "W", descriptor = "I")
	private int anInt355 = 0;

	@OriginalMember(owner = "client!be", name = "ab", descriptor = "I")
	private int anInt357 = 20;

	@OriginalMember(owner = "client!be", name = "R", descriptor = "I")
	private int anInt351 = 0;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!fj;IB)V")
	@Override
	public void method3573(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt350 = arg0.method2765();
		} else if (arg1 == 1) {
			this.anInt357 = arg0.method2765();
		} else if (arg1 == 2) {
			this.anInt355 = arg0.method2765();
		} else if (arg1 == 3) {
			this.anInt351 = arg0.method2765();
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3571(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass40_41.method1362(arg0);
		if (super.aClass40_41.aBoolean86) {
			for (@Pc(23) int local23 = 0; local23 < Static115.anInt2578; local23++) {
				@Pc(37) int local37 = this.anInt355 + (Static45.anIntArray97[local23] << 12) / this.anInt350;
				@Pc(49) int local49 = (Static187.anIntArray362[arg0] << 12) / this.anInt350 + this.anInt351;
				@Pc(55) int local55 = local37;
				@Pc(57) int local57 = local49;
				@Pc(63) int local63 = local49 * local49 >> 12;
				@Pc(69) int local69 = local37 * local37 >> 12;
				@Pc(71) int local71 = 0;
				while (local63 + local69 < 16384 && local71 < this.anInt357) {
					local71++;
					local57 = local49 + (local57 * local55 >> 12) * 2;
					local55 = local37 + local69 - local63;
					local63 = local57 * local57 >> 12;
					local69 = local55 * local55 >> 12;
				}
				local17[local23] = this.anInt357 - 1 <= local71 ? 0 : (local71 << 12) / this.anInt357;
			}
		}
		return local17;
	}
}
