import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class1_Sub3_Sub21 extends Class1_Sub3 {

	@OriginalMember(owner = "client!mg", name = "J", descriptor = "I")
	private int anInt4032 = 32768;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub21() {
		super(3, false);
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5538(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass144_41.method3947(arg0);
		if (super.aClass144_41.aBoolean415) {
			@Pc(21) int[] local21 = this.method5532(1, arg0);
			@Pc(27) int[] local27 = this.method5532(2, arg0);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			for (@Pc(41) int local41 = 0; local41 < Static153.anInt3378; local41++) {
				@Pc(53) int local53 = local21[local41] * 255 >> 12 & 0xFF;
				@Pc(62) int local62 = local27[local41] * this.anInt4032 >> 12;
				@Pc(70) int local70 = local62 * Static31.anIntArray94[local53] >> 12;
				@Pc(78) int local78 = local62 * Static237.anIntArray440[local53] >> 12;
				@Pc(86) int local86 = Static250.anInt5127 & (local70 >> 12) + local41;
				@Pc(94) int local94 = (local78 >> 12) + arg0 & Static49.anInt1526;
				@Pc(100) int[][] local100 = this.method5528(local94, 0);
				local31[local41] = local100[0][local86];
				local35[local41] = local100[1][local86];
				local39[local41] = local100[2][local86];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IILclient!bg;)V")
	@Override
	public void method5526(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt4032 = arg1.method4556() << 4;
		} else if (arg0 == 1) {
			super.aBoolean647 = arg1.method4532() == 1;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5529(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass122_41.method3385(arg0);
		if (super.aClass122_41.aBoolean342) {
			@Pc(29) int[] local29 = this.method5532(1, arg0);
			@Pc(35) int[] local35 = this.method5532(2, arg0);
			for (@Pc(37) int local37 = 0; local37 < Static153.anInt3378; local37++) {
				@Pc(47) int local47 = local29[local37] >> 4 & 0xFF;
				@Pc(56) int local56 = this.anInt4032 * local35[local37] >> 12;
				@Pc(64) int local64 = local56 * Static31.anIntArray94[local47] >> 12;
				@Pc(72) int local72 = local56 * Static237.anIntArray440[local47] >> 12;
				@Pc(80) int local80 = Static250.anInt5127 & (local64 >> 12) + local37;
				@Pc(89) int local89 = arg0 + (local72 >> 12) & Static49.anInt1526;
				@Pc(95) int[] local95 = this.method5532(0, local89);
				local19[local37] = local95[local80];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "(I)V")
	@Override
	public void method5535() {
		Static280.method4876();
	}
}
