import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class4_Sub3_Sub14 extends Class4_Sub3 {

	@OriginalMember(owner = "client!gg", name = "eb", descriptor = "I")
	private int anInt1491;

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "(B)V")
	@Override
	public void method3148() {
		Static97.method1889();
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3158(@OriginalArg(0) int arg0) {
		@Pc(9) int[][] local9 = super.aClass39_41.method1506(arg0);
		if (super.aClass39_41.aBoolean84) {
			@Pc(23) int[] local23 = this.method3149(arg0, 1);
			@Pc(29) int[] local29 = this.method3149(arg0, 2);
			@Pc(33) int[] local33 = local9[2];
			@Pc(37) int[] local37 = local9[0];
			@Pc(41) int[] local41 = local9[1];
			for (@Pc(43) int local43 = 0; local43 < Static134.anInt3188; local43++) {
				@Pc(54) int local54 = this.anInt1491 * local29[local43] >> 12;
				@Pc(64) int local64 = local23[local43] * 255 >> 12 & 0xFF;
				@Pc(72) int local72 = Static49.anIntArray123[local64] * local54 >> 12;
				@Pc(80) int local80 = Static22.anIntArray59[local64] * local54 >> 12;
				@Pc(88) int local88 = Static5.anInt216 & (local72 >> 12) + arg0;
				@Pc(97) int local97 = Static2.anInt80 & local43 + (local80 >> 12);
				@Pc(103) int[][] local103 = this.method3150(0, local88);
				local37[local43] = local103[0][local97];
				local41[local43] = local103[1][local97];
				local33[local43] = local103[2][local97];
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3161(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass64_41.method2211(arg0);
		if (super.aClass64_41.aBoolean127) {
			@Pc(21) int[] local21 = this.method3149(arg0, 1);
			@Pc(27) int[] local27 = this.method3149(arg0, 2);
			for (@Pc(29) int local29 = 0; local29 < Static134.anInt3188; local29++) {
				@Pc(39) int local39 = local21[local29] >> 4 & 0xFF;
				@Pc(48) int local48 = local27[local29] * this.anInt1491 >> 12;
				@Pc(56) int local56 = Static22.anIntArray59[local39] * local48 >> 12;
				@Pc(65) int local65 = Static2.anInt80 & local29 + (local56 >> 12);
				@Pc(73) int local73 = Static49.anIntArray123[local39] * local48 >> 12;
				@Pc(81) int local81 = (local73 >> 12) + arg0 & Static5.anInt216;
				@Pc(87) int[] local87 = this.method3149(local81, 0);
				local11[local29] = local87[local65];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!h;I)V")
	@Override
	public void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt1491 = arg1.method1252() << 4;
		} else if (arg0 == 1) {
			super.aBoolean170 = arg1.method1253() == 1;
		}
	}
}
