import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class2_Sub1_Sub10 extends Class2_Sub1 {

	@OriginalMember(owner = "client!fd", name = "Y", descriptor = "I")
	private int anInt1570 = 32768;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub10() {
		super(3, false);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!ea;II)V")
	@Override
	public void method3204(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1570 = arg0.method163() << 4;
		} else if (arg1 == 1) {
			super.aBoolean286 = arg0.method209() == 1;
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V")
	@Override
	public void method3207() {
		Static94.method1641();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3201(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass73_41.method2249(arg0);
		if (super.aClass73_41.aBoolean188) {
			@Pc(25) int[] local25 = this.method3203(arg0, 1);
			@Pc(31) int[] local31 = this.method3203(arg0, 2);
			for (@Pc(33) int local33 = 0; local33 < Static62.anInt1675; local33++) {
				@Pc(44) int local44 = this.anInt1570 * local31[local33] >> 12;
				@Pc(52) int local52 = local25[local33] >> 4 & 0xFF;
				@Pc(60) int local60 = Static135.anIntArray331[local52] * local44 >> 12;
				@Pc(68) int local68 = Static80.anIntArray203[local52] * local44 >> 12;
				@Pc(77) int local77 = local33 + (local60 >> 12) & Static41.anInt1259;
				@Pc(85) int local85 = Static195.anInt4423 & (local68 >> 12) + arg0;
				@Pc(91) int[] local91 = this.method3203(local85, 0);
				local7[local33] = local91[local77];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method3211(@OriginalArg(0) int arg0) {
		@Pc(21) int[][] local21 = super.aClass99_41.method3152(arg0);
		if (super.aClass99_41.aBoolean280) {
			@Pc(31) int[] local31 = this.method3203(arg0, 1);
			@Pc(37) int[] local37 = this.method3203(arg0, 2);
			@Pc(41) int[] local41 = local21[0];
			@Pc(45) int[] local45 = local21[1];
			@Pc(49) int[] local49 = local21[2];
			for (@Pc(51) int local51 = 0; local51 < Static62.anInt1675; local51++) {
				@Pc(63) int local63 = local31[local51] * 255 >> 12 & 0xFF;
				@Pc(72) int local72 = this.anInt1570 * local37[local51] >> 12;
				@Pc(80) int local80 = local72 * Static135.anIntArray331[local63] >> 12;
				@Pc(88) int local88 = local72 * Static80.anIntArray203[local63] >> 12;
				@Pc(97) int local97 = local51 + (local80 >> 12) & Static41.anInt1259;
				@Pc(106) int local106 = arg0 + (local88 >> 12) & Static195.anInt4423;
				@Pc(112) int[][] local112 = this.method3205(0, local106);
				local41[local51] = local112[0][local97];
				local45[local51] = local112[1][local97];
				local49[local51] = local112[2][local97];
			}
		}
		return local21;
	}
}
