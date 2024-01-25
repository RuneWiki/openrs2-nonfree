import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jv")
public final class Class1_Sub2_Sub19 extends Class1_Sub2 {

	@OriginalMember(owner = "client!jv", name = "K", descriptor = "I")
	private int anInt3598 = 204;

	@OriginalMember(owner = "client!jv", name = "O", descriptor = "I")
	private int anInt3601 = 1;

	@OriginalMember(owner = "client!jv", name = "I", descriptor = "I")
	private int anInt3596 = 1;

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5868(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass264_41.method5969(arg0);
		if (super.aClass264_41.aBoolean657) {
			for (@Pc(17) int local17 = 0; local17 < Static410.anInt7198; local17++) {
				@Pc(23) int local23 = Static400.anIntArray525[local17];
				@Pc(27) int local27 = Static285.anIntArray17[arg0];
				@Pc(34) int local34 = local23 * this.anInt3596 >> 12;
				@Pc(41) int local41 = local27 * this.anInt3601 >> 12;
				@Pc(51) int local51 = this.anInt3596 * (local23 % (4096 / this.anInt3596));
				@Pc(61) int local61 = this.anInt3601 * (local27 % (4096 / this.anInt3601));
				if (local61 < this.anInt3598) {
					for (local34 -= local41; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 != 1) {
						local11[local17] = 0;
						continue;
					}
					if (this.anInt3598 > local51) {
						local11[local17] = 0;
						continue;
					}
				}
				if (this.anInt3598 > local51) {
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

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(ILclient!ti;I)V")
	@Override
	public void method5863(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3596 = arg0.method4548();
		} else if (arg1 == 1) {
			this.anInt3601 = arg0.method4548();
		} else if (arg1 == 2) {
			this.anInt3598 = arg0.method4498();
		}
	}
}
