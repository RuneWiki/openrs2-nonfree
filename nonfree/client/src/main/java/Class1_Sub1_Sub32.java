import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class1_Sub1_Sub32 extends Class1_Sub1 {

	@OriginalMember(owner = "client!si", name = "Q", descriptor = "I")
	private int anInt3906 = 1;

	@OriginalMember(owner = "client!si", name = "Z", descriptor = "I")
	private int anInt3910 = 1;

	@OriginalMember(owner = "client!si", name = "cb", descriptor = "I")
	private int anInt3913 = 204;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!fj;IB)V")
	@Override
	public void method3573(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3910 = arg0.method2771();
		} else if (arg1 == 1) {
			this.anInt3906 = arg0.method2771();
		} else if (arg1 == 2) {
			this.anInt3913 = arg0.method2765();
		}
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3571(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass40_41.method1362(arg0);
		if (super.aClass40_41.aBoolean86) {
			for (@Pc(17) int local17 = 0; local17 < Static115.anInt2578; local17++) {
				@Pc(23) int local23 = Static187.anIntArray362[arg0];
				@Pc(27) int local27 = Static45.anIntArray97[local17];
				@Pc(34) int local34 = local23 * this.anInt3906 >> 12;
				@Pc(41) int local41 = local27 * this.anInt3910 >> 12;
				@Pc(51) int local51 = local23 % (4096 / this.anInt3906) * this.anInt3906;
				@Pc(61) int local61 = this.anInt3910 * (local27 % (4096 / this.anInt3910));
				if (this.anInt3913 > local51) {
					for (local41 -= local34; local41 < 0; local41 += 4) {
					}
					while (local41 > 3) {
						local41 -= 4;
					}
					if (local41 != 1) {
						local7[local17] = 0;
						continue;
					}
					if (local61 < this.anInt3913) {
						local7[local17] = 0;
						continue;
					}
				}
				if (local61 < this.anInt3913) {
					for (local41 -= local34; local41 < 0; local41 += 4) {
					}
					while (local41 > 3) {
						local41 -= 4;
					}
					if (local41 > 0) {
						local7[local17] = 0;
						continue;
					}
				}
				local7[local17] = 4096;
			}
		}
		return local7;
	}
}
