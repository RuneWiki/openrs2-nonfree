import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class3_Sub2_Sub14 extends Class3_Sub2 {

	@OriginalMember(owner = "client!gj", name = "O", descriptor = "I")
	private int anInt1769 = 4;

	@OriginalMember(owner = "client!gj", name = "Q", descriptor = "I")
	private int anInt1770 = 4;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4961(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = this.aClass168_41.method4366(arg0);
		if (this.aClass168_41.aBoolean373) {
			@Pc(27) int local27 = Static62.anInt1150 / this.anInt1769;
			@Pc(32) int local32 = Static22.anInt421 / this.anInt1770;
			@Pc(51) int[] local51;
			@Pc(41) int local41;
			if (local27 > 0) {
				local41 = arg0 % local27;
				local51 = this.method4954(local41 * Static62.anInt1150 / local27, 0);
			} else {
				local51 = this.method4954(0, 0);
			}
			for (local41 = 0; local41 < Static22.anInt421; local41++) {
				if (local32 <= 0) {
					local13[local41] = local51[0];
				} else {
					@Pc(78) int local78 = local41 % local32;
					local13[local41] = local51[Static22.anInt421 * local78 / local32];
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZLclient!ug;)V")
	@Override
	public void method4958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt1770 = arg1.method3915();
		} else if (arg0 == 1) {
			this.anInt1769 = arg1.method3915();
		}
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method4955(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass150_41.method3994(arg0);
		if (this.aClass150_41.aBoolean319) {
			@Pc(20) int local20 = Static22.anInt421 / this.anInt1770;
			@Pc(25) int local25 = Static62.anInt1150 / this.anInt1769;
			@Pc(44) int[][] local44;
			if (local25 > 0) {
				@Pc(34) int local34 = arg0 % local25;
				local44 = this.method4965(Static62.anInt1150 * local34 / local25, 0);
			} else {
				local44 = this.method4965(0, 0);
			}
			@Pc(56) int[] local56 = local44[1];
			@Pc(60) int[] local60 = local44[0];
			@Pc(64) int[] local64 = local11[0];
			@Pc(68) int[] local68 = local11[1];
			@Pc(72) int[] local72 = local11[2];
			@Pc(76) int[] local76 = local44[2];
			for (@Pc(78) int local78 = 0; local78 < Static22.anInt421; local78++) {
				@Pc(92) int local92;
				if (local20 <= 0) {
					local92 = 0;
				} else {
					@Pc(98) int local98 = local78 % local20;
					local92 = Static22.anInt421 * local98 / local20;
				}
				local64[local78] = local60[local92];
				local68[local78] = local56[local92];
				local72[local78] = local76[local92];
			}
		}
		return local11;
	}
}
