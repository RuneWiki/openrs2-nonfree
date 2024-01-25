import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wea")
public final class Class4_Sub4_Sub39 extends Class4_Sub4 {

	@OriginalMember(owner = "client!wea", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub39() {
		super(3, false);
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method7883(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass343_41.method7596(arg0);
		if (super.aClass343_41.aBoolean638) {
			@Pc(30) int[] local30 = this.method7890(0, arg0);
			@Pc(36) int[] local36 = this.method7890(1, arg0);
			@Pc(42) int[] local42 = this.method7890(2, arg0);
			for (@Pc(44) int local44 = 0; local44 < Static560.anInt9394; local44++) {
				@Pc(50) int local50 = local42[local44];
				if (local50 == 4096) {
					local13[local44] = local30[local44];
				} else if (local50 == 0) {
					local13[local44] = local36[local44];
				} else {
					local13[local44] = local36[local44] * (4096 - local50) + local50 * local30[local44] >> 12;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(BILclient!eh;)V")
	@Override
	public void method7886(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			super.aBoolean679 = arg1.method6015() == 1;
		}
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7887(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass201_41.method4419(arg0);
		if (super.aClass201_41.aBoolean392) {
			@Pc(28) int[] local28 = this.method7890(2, arg0);
			@Pc(34) int[][] local34 = this.method7892(0, arg0);
			@Pc(40) int[][] local40 = this.method7892(1, arg0);
			@Pc(44) int[] local44 = local11[0];
			@Pc(48) int[] local48 = local11[1];
			@Pc(52) int[] local52 = local11[2];
			@Pc(56) int[] local56 = local34[0];
			@Pc(60) int[] local60 = local34[1];
			@Pc(64) int[] local64 = local34[2];
			@Pc(68) int[] local68 = local40[0];
			@Pc(72) int[] local72 = local40[1];
			@Pc(76) int[] local76 = local40[2];
			for (@Pc(78) int local78 = 0; local78 < Static560.anInt9394; local78++) {
				@Pc(84) int local84 = local28[local78];
				if (local84 == 4096) {
					local44[local78] = local56[local78];
					local48[local78] = local60[local78];
					local52[local78] = local64[local78];
				} else if (local84 == 0) {
					local44[local78] = local68[local78];
					local48[local78] = local72[local78];
					local52[local78] = local76[local78];
				} else {
					@Pc(114) int local114 = 4096 - local84;
					local44[local78] = local68[local78] * local114 + local84 * local56[local78] >> 12;
					local48[local78] = local84 * local60[local78] + local72[local78] * local114 >> 12;
					local52[local78] = local76[local78] * local114 + local84 * local64[local78] >> 12;
				}
			}
		}
		return local11;
	}
}
