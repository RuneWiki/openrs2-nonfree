import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class4_Sub1_Sub20 extends Class4_Sub1 {

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub20() {
		super(3, false);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IBLclient!un;)V")
	@Override
	public void method8389(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			super.aBoolean726 = arg1.method4905() == 1;
		}
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8388(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass84_41.method2457(arg0);
		if (super.aClass84_41.aBoolean194) {
			@Pc(26) int[] local26 = this.method8392(arg0, 2);
			@Pc(32) int[][] local32 = this.method8385(arg0, 0);
			@Pc(40) int[][] local40 = this.method8385(arg0, 1);
			@Pc(44) int[] local44 = local16[0];
			@Pc(48) int[] local48 = local16[1];
			@Pc(52) int[] local52 = local16[2];
			@Pc(56) int[] local56 = local32[0];
			@Pc(60) int[] local60 = local32[1];
			@Pc(64) int[] local64 = local32[2];
			@Pc(68) int[] local68 = local40[0];
			@Pc(72) int[] local72 = local40[1];
			@Pc(76) int[] local76 = local40[2];
			for (@Pc(78) int local78 = 0; local78 < Static376.anInt7260; local78++) {
				@Pc(84) int local84 = local26[local78];
				if (local84 == 4096) {
					local44[local78] = local56[local78];
					local48[local78] = local60[local78];
					local52[local78] = local64[local78];
				} else if (local84 == 0) {
					local44[local78] = local68[local78];
					local48[local78] = local72[local78];
					local52[local78] = local76[local78];
				} else {
					@Pc(97) int local97 = 4096 - local84;
					local44[local78] = local84 * local56[local78] + local97 * local68[local78] >> 12;
					local48[local78] = local97 * local72[local78] + local84 * local60[local78] >> 12;
					local52[local78] = local76[local78] * local97 + local64[local78] * local84 >> 12;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8384(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass185_41.method4444(arg0);
		if (super.aClass185_41.aBoolean366) {
			@Pc(29) int[] local29 = this.method8392(arg0, 0);
			@Pc(35) int[] local35 = this.method8392(arg0, 1);
			@Pc(41) int[] local41 = this.method8392(arg0, 2);
			for (@Pc(43) int local43 = 0; local43 < Static376.anInt7260; local43++) {
				@Pc(49) int local49 = local41[local43];
				if (local49 == 4096) {
					local19[local43] = local29[local43];
				} else if (local49 == 0) {
					local19[local43] = local35[local43];
				} else {
					local19[local43] = (4096 - local49) * local35[local43] + local29[local43] * local49 >> 12;
				}
			}
		}
		return local19;
	}
}
