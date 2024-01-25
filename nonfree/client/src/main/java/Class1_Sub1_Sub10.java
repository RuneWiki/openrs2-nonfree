import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gea")
public final class Class1_Sub1_Sub10 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gea", name = "E", descriptor = "I")
	private int anInt2917 = 1;

	@OriginalMember(owner = "client!gea", name = "N", descriptor = "I")
	private int anInt2923 = 1;

	@OriginalMember(owner = "client!gea", name = "K", descriptor = "I")
	private int anInt2920 = 204;

	@OriginalMember(owner = "client!gea", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7706(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass223_41.method4438(arg0);
		if (super.aClass223_41.aBoolean442) {
			for (@Pc(17) int local17 = 0; local17 < Static279.anInt4906; local17++) {
				@Pc(23) int local23 = Static557.anIntArray708[local17];
				@Pc(27) int local27 = Static445.anIntArray590[arg0];
				@Pc(34) int local34 = local23 * this.anInt2923 >> 12;
				@Pc(41) int local41 = local27 * this.anInt2917 >> 12;
				@Pc(51) int local51 = this.anInt2923 * (local23 % (4096 / this.anInt2923));
				@Pc(61) int local61 = this.anInt2917 * (local27 % (4096 / this.anInt2917));
				if (this.anInt2920 > local61) {
					for (local34 -= local41; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 != 1) {
						local11[local17] = 0;
						continue;
					}
					if (local51 < this.anInt2920) {
						local11[local17] = 0;
						continue;
					}
				}
				if (local51 < this.anInt2920) {
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

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(ILclient!mo;I)V")
	@Override
	public void method7708(@OriginalArg(1) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2923 = arg0.method5750();
		} else if (arg1 == 1) {
			this.anInt2917 = arg0.method5750();
		} else if (arg1 == 2) {
			this.anInt2920 = arg0.method5771();
		}
	}
}
