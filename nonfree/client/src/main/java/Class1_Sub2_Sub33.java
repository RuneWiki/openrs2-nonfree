import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class1_Sub2_Sub33 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub33() {
		super(3, false);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5965(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass99_41.method1772(arg0);
		if (super.aClass99_41.aBoolean228) {
			@Pc(26) int[] local26 = this.method5964(arg0, 2);
			@Pc(32) int[][] local32 = this.method5968(0, arg0);
			@Pc(40) int[][] local40 = this.method5968(1, arg0);
			@Pc(44) int[] local44 = local11[0];
			@Pc(48) int[] local48 = local11[1];
			@Pc(52) int[] local52 = local11[2];
			@Pc(56) int[] local56 = local32[0];
			@Pc(60) int[] local60 = local32[1];
			@Pc(64) int[] local64 = local32[2];
			@Pc(68) int[] local68 = local40[0];
			@Pc(72) int[] local72 = local40[1];
			@Pc(76) int[] local76 = local40[2];
			for (@Pc(78) int local78 = 0; local78 < Static218.anInt3990; local78++) {
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
					@Pc(119) int local119 = 4096 - local84;
					local44[local78] = local56[local78] * local84 + local119 * local68[local78] >> 12;
					local48[local78] = local84 * local60[local78] + local72[local78] * local119 >> 12;
					local52[local78] = local76[local78] * local119 + local64[local78] * local84 >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method5962(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean650 = arg0.method2915() == 1;
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5961(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass22_41.method312(arg0);
		if (super.aClass22_41.aBoolean44) {
			@Pc(29) int[] local29 = this.method5964(arg0, 0);
			@Pc(35) int[] local35 = this.method5964(arg0, 1);
			@Pc(41) int[] local41 = this.method5964(arg0, 2);
			for (@Pc(43) int local43 = 0; local43 < Static218.anInt3990; local43++) {
				@Pc(49) int local49 = local41[local43];
				if (local49 == 4096) {
					local19[local43] = local29[local43];
				} else if (local49 == 0) {
					local19[local43] = local35[local43];
				} else {
					local19[local43] = local49 * local29[local43] + local35[local43] * (4096 - local49) >> 12;
				}
			}
		}
		return local19;
	}
}
