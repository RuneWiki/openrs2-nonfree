import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class2_Sub2_Sub5 extends Class2_Sub2 {

	@OriginalMember(owner = "client!c", name = "Z", descriptor = "I")
	private int anInt614 = 0;

	@OriginalMember(owner = "client!c", name = "ab", descriptor = "I")
	private int anInt615 = 4096;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub5() {
		super(1, false);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IILclient!og;)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt614 = arg1.method234();
		} else if (arg0 == 1) {
			this.anInt615 = arg1.method234();
		} else if (arg0 == 2) {
			super.aBoolean183 = arg1.method218() == 1;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3562(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass57_41.method2569(arg0);
		if (super.aClass57_41.aBoolean122) {
			@Pc(26) int[] local26 = this.method3569(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static106.anInt3045; local28++) {
				@Pc(34) int local34 = local26[local28];
				if (local34 < this.anInt614) {
					local16[local28] = this.anInt614;
				} else if (local34 <= this.anInt615) {
					local16[local28] = local34;
				} else {
					local16[local28] = this.anInt615;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method3568(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass90_41.method3443(arg0);
		if (super.aClass90_41.aBoolean177) {
			@Pc(29) int[][] local29 = this.method3557(arg0, 0);
			@Pc(33) int[] local33 = local29[1];
			@Pc(37) int[] local37 = local29[2];
			@Pc(41) int[] local41 = local29[0];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[2];
			@Pc(53) int[] local53 = local19[1];
			for (@Pc(55) int local55 = 0; local55 < Static106.anInt3045; local55++) {
				@Pc(61) int local61 = local41[local55];
				@Pc(65) int local65 = local33[local55];
				@Pc(69) int local69 = local37[local55];
				if (local61 < this.anInt614) {
					local45[local55] = this.anInt614;
				} else if (local61 <= this.anInt615) {
					local45[local55] = local61;
				} else {
					local45[local55] = this.anInt615;
				}
				if (this.anInt614 > local65) {
					local53[local55] = this.anInt614;
				} else if (local65 <= this.anInt615) {
					local53[local55] = local65;
				} else {
					local53[local55] = this.anInt615;
				}
				if (local69 < this.anInt614) {
					local49[local55] = this.anInt614;
				} else if (this.anInt615 >= local69) {
					local49[local55] = local69;
				} else {
					local49[local55] = this.anInt615;
				}
			}
		}
		return local19;
	}
}
