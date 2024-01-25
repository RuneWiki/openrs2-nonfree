import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class1_Sub5_Sub27 extends Class1_Sub5 {

	@OriginalMember(owner = "client!rg", name = "O", descriptor = "I")
	private int anInt5343 = 1;

	@OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
	private int anInt5341 = 1;

	@OriginalMember(owner = "client!rg", name = "Q", descriptor = "I")
	private int anInt5345 = 204;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5805(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass214_41.method5651(arg0);
		if (super.aClass214_41.aBoolean544) {
			for (@Pc(17) int local17 = 0; local17 < Static75.anInt1566; local17++) {
				@Pc(23) int local23 = Static49.anIntArray492[local17];
				@Pc(27) int local27 = Static191.anIntArray379[arg0];
				@Pc(34) int local34 = local23 * this.anInt5341 >> 12;
				@Pc(41) int local41 = this.anInt5343 * local27 >> 12;
				@Pc(51) int local51 = local23 % (4096 / this.anInt5341) * this.anInt5341;
				@Pc(61) int local61 = local27 % (4096 / this.anInt5343) * this.anInt5343;
				if (this.anInt5345 > local61) {
					for (local34 -= local41; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 != 1) {
						local11[local17] = 0;
						continue;
					}
					if (local51 < this.anInt5345) {
						local11[local17] = 0;
						continue;
					}
				}
				if (this.anInt5345 > local51) {
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

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method5814(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5341 = arg0.method5720();
		} else if (arg1 == 1) {
			this.anInt5343 = arg0.method5720();
		} else if (arg1 == 2) {
			this.anInt5345 = arg0.method5715();
		}
	}
}
