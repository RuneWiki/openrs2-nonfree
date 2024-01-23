import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class1_Sub2_Sub20 extends Class1_Sub2 {

	@OriginalMember(owner = "client!kn", name = "K", descriptor = "I")
	private int anInt2976 = 1;

	@OriginalMember(owner = "client!kn", name = "Y", descriptor = "I")
	private int anInt2983 = 1;

	@OriginalMember(owner = "client!kn", name = "Z", descriptor = "I")
	private int anInt2984 = 204;

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method4577(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = this.aClass65_41.method1368(arg0);
		if (this.aClass65_41.aBoolean137) {
			for (@Pc(23) int local23 = 0; local23 < Static299.anInt5670; local23++) {
				@Pc(30) int local30 = Static310.anIntArray108[local23];
				@Pc(34) int local34 = Static7.anIntArray13[arg0];
				@Pc(41) int local41 = this.anInt2976 * local30 >> 12;
				@Pc(51) int local51 = this.anInt2976 * (local30 % (4096 / this.anInt2976));
				@Pc(61) int local61 = this.anInt2983 * (local34 % (4096 / this.anInt2983));
				@Pc(68) int local68 = this.anInt2983 * local34 >> 12;
				if (local61 < this.anInt2984) {
					for (local41 -= local68; local41 < 0; local41 += 4) {
					}
					while (local41 > 3) {
						local41 -= 4;
					}
					if (local41 != 1) {
						local17[local23] = 0;
						continue;
					}
					if (this.anInt2984 > local51) {
						local17[local23] = 0;
						continue;
					}
				}
				if (this.anInt2984 > local51) {
					for (local41 -= local68; local41 < 0; local41 += 4) {
					}
					while (local41 > 3) {
						local41 -= 4;
					}
					if (local41 > 0) {
						local17[local23] = 0;
						continue;
					}
				}
				local17[local23] = 4096;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILclient!sb;I)V")
	@Override
	public void method4582(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2976 = arg0.method2595();
		} else if (arg1 == 1) {
			this.anInt2983 = arg0.method2595();
		} else if (arg1 == 2) {
			this.anInt2984 = arg0.method2593();
		}
	}
}
