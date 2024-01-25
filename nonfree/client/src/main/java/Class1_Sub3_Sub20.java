import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ku")
public final class Class1_Sub3_Sub20 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ku", name = "P", descriptor = "I")
	private int anInt5061 = 1;

	@OriginalMember(owner = "client!ku", name = "Q", descriptor = "I")
	private int anInt5062 = 1;

	@OriginalMember(owner = "client!ku", name = "S", descriptor = "I")
	private int anInt5063 = 204;

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IILclient!os;)V")
	@Override
	public void method8200(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt5062 = arg1.method4487();
		} else if (arg0 == 1) {
			this.anInt5061 = arg1.method4487();
		} else if (arg0 == 2) {
			this.anInt5063 = arg1.method4494();
		}
	}

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method8193(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass222_41.method5913(arg0);
		if (super.aClass222_41.aBoolean485) {
			for (@Pc(17) int local17 = 0; local17 < Static254.anInt4973; local17++) {
				@Pc(23) int local23 = Static457.anIntArray732[local17];
				@Pc(27) int local27 = Static392.anIntArray673[arg0];
				@Pc(34) int local34 = this.anInt5062 * local23 >> 12;
				@Pc(41) int local41 = local27 * this.anInt5061 >> 12;
				@Pc(51) int local51 = this.anInt5062 * (local23 % (4096 / this.anInt5062));
				@Pc(61) int local61 = local27 % (4096 / this.anInt5061) * this.anInt5061;
				if (this.anInt5063 > local61) {
					for (local34 -= local41; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 != 1) {
						local11[local17] = 0;
						continue;
					}
					if (this.anInt5063 > local51) {
						local11[local17] = 0;
						continue;
					}
				}
				if (local51 < this.anInt5063) {
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
}
