import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class1_Sub5_Sub35 extends Class1_Sub5 {

	@OriginalMember(owner = "client!sg", name = "N", descriptor = "I")
	private int anInt3489;

	@OriginalMember(owner = "client!sg", name = "P", descriptor = "I")
	private int anInt3491;

	@OriginalMember(owner = "client!sg", name = "S", descriptor = "[I")
	private int[] anIntArray364;

	@OriginalMember(owner = "client!sg", name = "X", descriptor = "I")
	private int anInt3496;

	@OriginalMember(owner = "client!sg", name = "bb", descriptor = "I")
	private int anInt3500;

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3149(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass53_41.method1591(arg0);
		if (super.aClass53_41.aBoolean90) {
			@Pc(29) int[][] local29 = this.method3144(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static177.anInt4018; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(69) int local69 = local61 - this.anIntArray364[0];
				if (local69 < 0) {
					local69 = -local69;
				}
				if (this.anInt3500 < local69) {
					local45[local55] = local61;
					local49[local55] = local37[local55];
					local53[local55] = local41[local55];
				} else {
					@Pc(103) int local103 = local37[local55];
					local69 = local103 - this.anIntArray364[1];
					if (local69 < 0) {
						local69 = -local69;
					}
					if (local69 > this.anInt3500) {
						local45[local55] = local61;
						local49[local55] = local103;
						local53[local55] = local41[local55];
					} else {
						@Pc(140) int local140 = local41[local55];
						local69 = local140 - this.anIntArray364[2];
						if (local69 < 0) {
							local69 = -local69;
						}
						if (this.anInt3500 < local69) {
							local45[local55] = local61;
							local49[local55] = local103;
							local53[local55] = local140;
						} else {
							local45[local55] = local61 * this.anInt3489 >> 12;
							local49[local55] = local103 * this.anInt3491 >> 12;
							local53[local55] = local140 * this.anInt3496 >> 12;
						}
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!ka;IZ)V")
	@Override
	public void method3148(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3500 = arg0.method359();
		} else if (arg1 == 1) {
			this.anInt3496 = arg0.method359();
		} else if (arg1 == 2) {
			this.anInt3491 = arg0.method359();
		} else if (arg1 == 3) {
			this.anInt3489 = arg0.method359();
		} else if (arg1 == 4) {
			@Pc(57) int local57 = arg0.method316();
			this.anIntArray364[0] = (local57 & 0xFF0000) << 4;
			this.anIntArray364[2] = local57 >> 12 & 0x0;
			this.anIntArray364[1] = local57 >> 4 & 0xFF0;
		}
	}
}
