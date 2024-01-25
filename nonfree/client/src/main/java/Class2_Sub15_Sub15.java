import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iea")
public final class Class2_Sub15_Sub15 extends Class2_Sub15 {

	@OriginalMember(owner = "client!iea", name = "H", descriptor = "I")
	private int anInt4853 = 204;

	@OriginalMember(owner = "client!iea", name = "J", descriptor = "I")
	private int anInt4855 = 1;

	@OriginalMember(owner = "client!iea", name = "L", descriptor = "I")
	private int anInt4857 = 1;

	@OriginalMember(owner = "client!iea", name = "<init>", descriptor = "()V")
	public Class2_Sub15_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(IZLclient!ol;)V")
	@Override
	public void method9718(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt4855 = arg1.method5203();
		} else if (arg0 == 1) {
			this.anInt4857 = arg1.method5203();
		} else if (arg0 == 2) {
			this.anInt4853 = arg1.method5211();
		}
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9724(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass338_41.method8470(arg0);
		if (super.aClass338_41.aBoolean712) {
			for (@Pc(17) int local17 = 0; local17 < Static329.anInt6017; local17++) {
				@Pc(23) int local23 = Static537.anIntArray480[local17];
				@Pc(27) int local27 = Static401.anIntArray357[arg0];
				@Pc(34) int local34 = this.anInt4855 * local23 >> 12;
				@Pc(41) int local41 = local27 * this.anInt4857 >> 12;
				@Pc(51) int local51 = this.anInt4855 * (local23 % (4096 / this.anInt4855));
				@Pc(61) int local61 = this.anInt4857 * (local27 % (4096 / this.anInt4857));
				if (local61 < this.anInt4853) {
					for (local34 -= local41; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 != 1) {
						local11[local17] = 0;
						continue;
					}
					if (local51 < this.anInt4853) {
						local11[local17] = 0;
						continue;
					}
				}
				if (this.anInt4853 > local51) {
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
