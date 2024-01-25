import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class4_Sub4_Sub11 extends Class4_Sub4 {

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub11() {
		super(3, false);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BILclient!fh;)V")
	@Override
	public void method6046(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			super.aBoolean535 = arg1.method5007() == 1;
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6043(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass163_41.method3181(arg0);
		if (super.aClass163_41.aBoolean296) {
			@Pc(28) int[] local28 = this.method6040(arg0, 2);
			@Pc(34) int[][] local34 = this.method6049(arg0, 0);
			@Pc(40) int[][] local40 = this.method6049(arg0, 1);
			@Pc(44) int[] local44 = local11[0];
			@Pc(48) int[] local48 = local11[1];
			@Pc(52) int[] local52 = local11[2];
			@Pc(56) int[] local56 = local34[0];
			@Pc(60) int[] local60 = local34[1];
			@Pc(64) int[] local64 = local34[2];
			@Pc(68) int[] local68 = local40[0];
			@Pc(72) int[] local72 = local40[1];
			@Pc(76) int[] local76 = local40[2];
			for (@Pc(78) int local78 = 0; local78 < Static419.anInt6404; local78++) {
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
					@Pc(99) int local99 = 4096 - local84;
					local44[local78] = local84 * local56[local78] + local99 * local68[local78] >> 12;
					local48[local78] = local99 * local72[local78] + local60[local78] * local84 >> 12;
					local52[local78] = local99 * local76[local78] + local84 * local64[local78] >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method6037(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass103_41.method1977(arg0);
		if (super.aClass103_41.aBoolean164) {
			@Pc(26) int[] local26 = this.method6040(arg0, 0);
			@Pc(34) int[] local34 = this.method6040(arg0, 1);
			@Pc(40) int[] local40 = this.method6040(arg0, 2);
			for (@Pc(42) int local42 = 0; local42 < Static419.anInt6404; local42++) {
				@Pc(48) int local48 = local40[local42];
				if (local48 == 4096) {
					local16[local42] = local26[local42];
				} else if (local48 == 0) {
					local16[local42] = local34[local42];
				} else {
					local16[local42] = local34[local42] * (4096 - local48) + local48 * local26[local42] >> 12;
				}
			}
		}
		return local16;
	}
}
