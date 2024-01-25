import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class4_Sub3_Sub31 extends Class4_Sub3 {

	@OriginalMember(owner = "client!qr", name = "G", descriptor = "I")
	private int anInt6003 = 204;

	@OriginalMember(owner = "client!qr", name = "R", descriptor = "I")
	private int anInt6012 = 1;

	@OriginalMember(owner = "client!qr", name = "M", descriptor = "I")
	private int anInt6009 = 1;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILclient!wn;I)V")
	@Override
	public void method6340(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt6009 = arg1.method4614();
		} else if (arg0 == 1) {
			this.anInt6012 = arg1.method4614();
		} else if (arg0 == 2) {
			this.anInt6003 = arg1.method4560();
		}
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6339(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass157_41.method4027(arg0);
		if (super.aClass157_41.aBoolean315) {
			for (@Pc(17) int local17 = 0; local17 < Static304.anInt5637; local17++) {
				@Pc(23) int local23 = Static231.anIntArray368[local17];
				@Pc(27) int local27 = Static376.anIntArray531[arg0];
				@Pc(34) int local34 = this.anInt6009 * local23 >> 12;
				@Pc(41) int local41 = local27 * this.anInt6012 >> 12;
				@Pc(51) int local51 = this.anInt6009 * (local23 % (4096 / this.anInt6009));
				@Pc(61) int local61 = this.anInt6012 * (local27 % (4096 / this.anInt6012));
				if (this.anInt6003 > local61) {
					for (local34 -= local41; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 != 1) {
						local11[local17] = 0;
						continue;
					}
					if (this.anInt6003 > local51) {
						local11[local17] = 0;
						continue;
					}
				}
				if (this.anInt6003 > local51) {
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
