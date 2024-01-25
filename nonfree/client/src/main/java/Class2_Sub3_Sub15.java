import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class2_Sub3_Sub15 extends Class2_Sub3 {

	@OriginalMember(owner = "client!hr", name = "K", descriptor = "I")
	private int anInt4967 = 32768;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub15() {
		super(3, false);
	}

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method9150(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass281_41.method7189(arg0);
		if (super.aClass281_41.aBoolean607) {
			@Pc(31) int[] local31 = this.method9156(arg0, 1);
			@Pc(39) int[] local39 = this.method9156(arg0, 2);
			for (@Pc(41) int local41 = 0; local41 < Static222.anInt4971; local41++) {
				@Pc(51) int local51 = local31[local41] >> 4 & 0xFF;
				@Pc(60) int local60 = this.anInt4967 * local39[local41] >> 12;
				@Pc(68) int local68 = Static375.anIntArray163[local51] * local60 >> 12;
				@Pc(76) int local76 = Static56.anIntArray79[local51] * local60 >> 12;
				@Pc(85) int local85 = local41 + (local68 >> 12) & Static620.anInt10845;
				@Pc(94) int local94 = arg0 + (local76 >> 12) & Static591.anInt6375;
				@Pc(100) int[] local100 = this.method9156(local94, 0);
				local11[local41] = local100[local85];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!cea;II)V")
	@Override
	public void method9157(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4967 = arg0.method8326() << 4;
		} else if (arg1 == 1) {
			super.aBoolean748 = arg0.method8383() == 1;
		}
	}

	@OriginalMember(owner = "client!hr", name = "e", descriptor = "(I)V")
	@Override
	public void method9152() {
		Static508.method7815();
	}

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "(II)[[I")
	@Override
	public int[][] method9155(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = super.aClass10_41.method211(arg0);
		if (super.aClass10_41.aBoolean11) {
			@Pc(28) int[] local28 = this.method9156(arg0, 1);
			@Pc(34) int[] local34 = this.method9156(arg0, 2);
			@Pc(38) int[] local38 = local13[0];
			@Pc(42) int[] local42 = local13[1];
			@Pc(46) int[] local46 = local13[2];
			for (@Pc(48) int local48 = 0; local48 < Static222.anInt4971; local48++) {
				@Pc(60) int local60 = local28[local48] * 255 >> 12 & 0xFF;
				@Pc(69) int local69 = this.anInt4967 * local34[local48] >> 12;
				@Pc(77) int local77 = local69 * Static375.anIntArray163[local60] >> 12;
				@Pc(85) int local85 = local69 * Static56.anIntArray79[local60] >> 12;
				@Pc(93) int local93 = local48 + (local77 >> 12) & Static620.anInt10845;
				@Pc(101) int local101 = (local85 >> 12) + arg0 & Static591.anInt6375;
				@Pc(107) int[][] local107 = this.method9147(local101, 0);
				local38[local48] = local107[0][local93];
				local42[local48] = local107[1][local93];
				local46[local48] = local107[2][local93];
			}
		}
		return local13;
	}
}
