import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class3_Sub2_Sub19 extends Class3_Sub2 {

	@OriginalMember(owner = "client!lg", name = "I", descriptor = "I")
	private int anInt6083 = 1;

	@OriginalMember(owner = "client!lg", name = "F", descriptor = "I")
	private int anInt6082 = 1;

	@OriginalMember(owner = "client!lg", name = "E", descriptor = "I")
	private int anInt6086 = 204;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9209(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass293_41.method7200(arg0);
		if (super.aClass293_41.aBoolean641) {
			for (@Pc(17) int local17 = 0; local17 < Static636.anInt10302; local17++) {
				@Pc(23) int local23 = Static508.anIntArray472[local17];
				@Pc(27) int local27 = Static123.anIntArray113[arg0];
				@Pc(34) int local34 = local23 * this.anInt6082 >> 12;
				@Pc(41) int local41 = this.anInt6083 * local27 >> 12;
				@Pc(51) int local51 = this.anInt6082 * (local23 % (4096 / this.anInt6082));
				@Pc(61) int local61 = this.anInt6083 * (local27 % (4096 / this.anInt6083));
				if (this.anInt6086 > local61) {
					for (local34 -= local41; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 != 1) {
						local11[local17] = 0;
						continue;
					}
					if (this.anInt6086 > local51) {
						local11[local17] = 0;
						continue;
					}
				}
				if (this.anInt6086 > local51) {
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

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILclient!rba;I)V")
	@Override
	public void method9214(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		if (arg0 == 0) {
			this.anInt6082 = arg1.method5322(-54);
		} else if (arg0 == 1) {
			this.anInt6083 = arg1.method5322(-52);
		} else if (arg0 == 2) {
			this.anInt6086 = arg1.method5272();
		}
	}
}
