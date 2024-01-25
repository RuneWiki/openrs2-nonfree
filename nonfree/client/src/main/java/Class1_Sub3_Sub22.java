import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lda")
public final class Class1_Sub3_Sub22 extends Class1_Sub3 {

	@OriginalMember(owner = "client!lda", name = "C", descriptor = "I")
	private int anInt5294 = 32768;

	@OriginalMember(owner = "client!lda", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub22() {
		super(3, false);
	}

	@OriginalMember(owner = "client!lda", name = "g", descriptor = "(I)V")
	@Override
	public void method7912() {
		Static401.method6051();
	}

	@OriginalMember(owner = "client!lda", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method7906(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass227_41.method5672(arg0);
		if (super.aClass227_41.aBoolean433) {
			@Pc(26) int[] local26 = this.method7911(arg0, 1);
			@Pc(32) int[] local32 = this.method7911(arg0, 2);
			for (@Pc(34) int local34 = 0; local34 < Static236.anInt4609; local34++) {
				@Pc(44) int local44 = local26[local34] >> 4 & 0xFF;
				@Pc(53) int local53 = this.anInt5294 * local32[local34] >> 12;
				@Pc(61) int local61 = Static82.anIntArray177[local44] * local53 >> 12;
				@Pc(69) int local69 = local53 * Static510.anIntArray737[local44] >> 12;
				@Pc(77) int local77 = (local61 >> 12) + local34 & Static36.anInt1319;
				@Pc(86) int local86 = Static226.anInt4534 & arg0 + (local69 >> 12);
				@Pc(92) int[] local92 = this.method7911(local86, 0);
				local16[local34] = local92[local77];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(Lclient!gw;II)V")
	@Override
	public void method7901(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5294 = arg0.method3056() << 4;
		} else if (arg1 == 1) {
			super.aBoolean652 = arg0.method3043() == 1;
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7913(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass233_41.method5782(arg0);
		if (super.aClass233_41.aBoolean439) {
			@Pc(21) int[] local21 = this.method7911(arg0, 1);
			@Pc(27) int[] local27 = this.method7911(arg0, 2);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			for (@Pc(41) int local41 = 0; local41 < Static236.anInt4609; local41++) {
				@Pc(53) int local53 = local21[local41] * 255 >> 12 & 0xFF;
				@Pc(62) int local62 = local27[local41] * this.anInt5294 >> 12;
				@Pc(70) int local70 = Static82.anIntArray177[local53] * local62 >> 12;
				@Pc(78) int local78 = Static510.anIntArray737[local53] * local62 >> 12;
				@Pc(86) int local86 = (local70 >> 12) + local41 & Static36.anInt1319;
				@Pc(94) int local94 = Static226.anInt4534 & (local78 >> 12) + arg0;
				@Pc(100) int[][] local100 = this.method7910(0, local94);
				local31[local41] = local100[0][local86];
				local35[local41] = local100[1][local86];
				local39[local41] = local100[2][local86];
			}
		}
		return local11;
	}
}
