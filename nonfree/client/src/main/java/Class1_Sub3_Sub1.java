import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class1_Sub3_Sub1 extends Class1_Sub3 {

	@OriginalMember(owner = "client!aj", name = "N", descriptor = "I")
	private int anInt299 = 32768;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub1() {
		super(3, false);
	}

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "(I)V")
	@Override
	public void method6074() {
		Static443.method5895();
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6084(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass172_41.method3962(arg0);
		if (super.aClass172_41.aBoolean327) {
			@Pc(21) int[] local21 = this.method6076(1, arg0);
			@Pc(27) int[] local27 = this.method6076(2, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static347.anInt5974; local29++) {
				@Pc(39) int local39 = local21[local29] >> 4 & 0xFF;
				@Pc(48) int local48 = local27[local29] * this.anInt299 >> 12;
				@Pc(56) int local56 = Static292.anIntArray372[local39] * local48 >> 12;
				@Pc(64) int local64 = Static12.anIntArray19[local39] * local48 >> 12;
				@Pc(72) int local72 = Static307.anInt5524 & (local56 >> 12) + local29;
				@Pc(80) int local80 = (local64 >> 12) + arg0 & Static274.anInt4887;
				@Pc(88) int[] local88 = this.method6076(0, local80);
				local11[local29] = local88[local72];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6083(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass20_41.method474(arg0);
		if (super.aClass20_41.aBoolean14) {
			@Pc(21) int[] local21 = this.method6076(1, arg0);
			@Pc(27) int[] local27 = this.method6076(2, arg0);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			for (@Pc(41) int local41 = 0; local41 < Static347.anInt5974; local41++) {
				@Pc(53) int local53 = local21[local41] * 255 >> 12 & 0xFF;
				@Pc(62) int local62 = this.anInt299 * local27[local41] >> 12;
				@Pc(70) int local70 = Static292.anIntArray372[local53] * local62 >> 12;
				@Pc(78) int local78 = Static12.anIntArray19[local53] * local62 >> 12;
				@Pc(87) int local87 = Static307.anInt5524 & local41 + (local70 >> 12);
				@Pc(96) int local96 = Static274.anInt4887 & arg0 + (local78 >> 12);
				@Pc(102) int[][] local102 = this.method6072(0, local96);
				local31[local41] = local102[0][local87];
				local35[local41] = local102[1][local87];
				local39[local41] = local102[2][local87];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!lh;II)V")
	@Override
	public void method6079(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt299 = arg0.method4093() << 4;
		} else if (arg1 == 1) {
			super.aBoolean494 = arg0.method4130() == 1;
		}
	}
}
