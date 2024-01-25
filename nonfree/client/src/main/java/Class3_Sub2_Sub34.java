import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class3_Sub2_Sub34 extends Class3_Sub2 {

	@OriginalMember(owner = "client!uj", name = "C", descriptor = "I")
	private int anInt9527 = 1;

	@OriginalMember(owner = "client!uj", name = "I", descriptor = "I")
	private int anInt9529 = 1;

	@OriginalMember(owner = "client!uj", name = "J", descriptor = "I")
	private int anInt9530 = 204;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8594(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass40_41.method1572(arg0);
		if (super.aClass40_41.aBoolean97) {
			for (@Pc(17) int local17 = 0; local17 < Static491.anInt8519; local17++) {
				@Pc(23) int local23 = Static546.anIntArray582[local17];
				@Pc(27) int local27 = Static372.anIntArray207[arg0];
				@Pc(34) int local34 = local23 * this.anInt9527 >> 12;
				@Pc(41) int local41 = this.anInt9529 * local27 >> 12;
				@Pc(51) int local51 = local23 % (4096 / this.anInt9527) * this.anInt9527;
				@Pc(61) int local61 = local27 % (4096 / this.anInt9529) * this.anInt9529;
				if (local61 < this.anInt9530) {
					for (local34 -= local41; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 != 1) {
						local11[local17] = 0;
						continue;
					}
					if (this.anInt9530 > local51) {
						local11[local17] = 0;
						continue;
					}
				}
				if (local51 < this.anInt9530) {
					for (local34 -= local41; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 > 0) {
						local11[local17] = 0;
						continue;
					}
				}
				local11[local17] = 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!sl;IB)V")
	@Override
	public void method8600(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt9527 = arg0.method4225();
		} else if (arg1 == 1) {
			this.anInt9529 = arg0.method4225();
		} else if (arg1 == 2) {
			this.anInt9530 = arg0.method4221();
		}
	}
}
