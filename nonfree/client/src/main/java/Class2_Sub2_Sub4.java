import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class2_Sub2_Sub4 extends Class2_Sub2 {

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub4() {
		super(3, false);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6271(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass114_41.method2346(arg0);
		if (super.aClass114_41.aBoolean180) {
			@Pc(26) int[] local26 = this.method6266(2, arg0);
			@Pc(32) int[][] local32 = this.method6276(0, arg0);
			@Pc(40) int[][] local40 = this.method6276(1, arg0);
			@Pc(44) int[] local44 = local16[0];
			@Pc(48) int[] local48 = local16[1];
			@Pc(52) int[] local52 = local16[2];
			@Pc(56) int[] local56 = local32[0];
			@Pc(60) int[] local60 = local32[1];
			@Pc(64) int[] local64 = local32[2];
			@Pc(68) int[] local68 = local40[0];
			@Pc(72) int[] local72 = local40[1];
			@Pc(76) int[] local76 = local40[2];
			for (@Pc(78) int local78 = 0; local78 < Static398.anInt6955; local78++) {
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
					@Pc(116) int local116 = 4096 - local84;
					local44[local78] = local84 * local56[local78] + local116 * local68[local78] >> 12;
					local48[local78] = local84 * local60[local78] + local72[local78] * local116 >> 12;
					local52[local78] = local84 * local64[local78] + local116 * local76[local78] >> 12;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6274(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass234_41.method5375(arg0);
		if (super.aClass234_41.aBoolean454) {
			@Pc(29) int[] local29 = this.method6266(0, arg0);
			@Pc(35) int[] local35 = this.method6266(1, arg0);
			@Pc(41) int[] local41 = this.method6266(2, arg0);
			for (@Pc(43) int local43 = 0; local43 < Static398.anInt6955; local43++) {
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

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!hw;BI)V")
	@Override
	public void method6273(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean518 = arg0.method6138() == 1;
		}
	}
}
