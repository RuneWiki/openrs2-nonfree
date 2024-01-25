import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public final class Class1_Sub1_Sub5 extends Class1_Sub1 {

	@OriginalMember(owner = "client!bt", name = "E", descriptor = "Z")
	private boolean aBoolean94 = true;

	@OriginalMember(owner = "client!bt", name = "C", descriptor = "I")
	private int anInt1273 = 4096;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub5() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILclient!io;I)V")
	@Override
	public void method7881(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt1273 = arg1.method4426();
		} else if (arg0 == 1) {
			this.aBoolean94 = arg1.method4393() == 1;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7883(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass153_41.method3557(arg0);
		if (super.aClass153_41.aBoolean340) {
			@Pc(25) int[] local25 = this.method7882(0, Static561.anInt6003 & arg0 - 1);
			@Pc(31) int[] local31 = this.method7882(0, arg0);
			@Pc(41) int[] local41 = this.method7882(0, arg0 + 1 & Static561.anInt6003);
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static87.anInt1964; local55++) {
				@Pc(69) int local69 = (local41[local55] - local25[local55]) * this.anInt1273;
				@Pc(89) int local89 = this.anInt1273 * (local31[local55 + 1 & Static451.anInt8721] - local31[local55 - 1 & Static451.anInt8721]);
				@Pc(93) int local93 = local89 >> 12;
				@Pc(97) int local97 = local69 >> 12;
				@Pc(103) int local103 = local93 * local93 >> 12;
				@Pc(109) int local109 = local97 * local97 >> 12;
				@Pc(123) int local123 = (int) (Math.sqrt((double) ((float) (local109 + local103 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(132) int local132;
				@Pc(130) int local130;
				@Pc(134) int local134;
				if (local123 == 0) {
					local130 = 0;
					local132 = 0;
					local134 = 0;
				} else {
					local132 = local89 / local123;
					local134 = 16777216 / local123;
					local130 = local69 / local123;
				}
				if (this.aBoolean94) {
					local130 = (local130 >> 1) + 2048;
					local134 = (local134 >> 1) + 2048;
					local132 = (local132 >> 1) + 2048;
				}
				local45[local55] = local132;
				local49[local55] = local130;
				local53[local55] = local134;
			}
		}
		return local11;
	}
}
