import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class1_Sub2_Sub3 extends Class1_Sub2 {

	@OriginalMember(owner = "client!bi", name = "ib", descriptor = "I")
	private int anInt534;

	@OriginalMember(owner = "client!bi", name = "fb", descriptor = "I")
	private int anInt532;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3126(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass5_39.method168(arg0);
		if (super.aClass5_39.aBoolean16) {
			@Pc(26) int[] local26 = this.method3130(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static110.anInt2825; local28++) {
				@Pc(34) int local34 = local26[local28];
				if (local34 < this.anInt534) {
					local16[local28] = this.anInt534;
				} else if (local34 <= this.anInt532) {
					local16[local28] = local34;
				} else {
					local16[local28] = this.anInt532;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method3120(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt534 = arg0.method878();
		} else if (arg1 == 1) {
			this.anInt532 = arg0.method878();
		} else if (arg1 == 2) {
			super.aBoolean215 = arg0.method861() == 1;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3129(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass77_39.method2617(arg0);
		if (super.aClass77_39.aBoolean193) {
			@Pc(29) int[][] local29 = this.method3118(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static110.anInt2825; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local37[local55];
				@Pc(69) int local69 = local41[local55];
				if (this.anInt534 > local61) {
					local45[local55] = this.anInt534;
				} else if (local61 > this.anInt532) {
					local45[local55] = this.anInt532;
				} else {
					local45[local55] = local61;
				}
				if (this.anInt534 > local65) {
					local49[local55] = this.anInt534;
				} else if (this.anInt532 >= local65) {
					local49[local55] = local65;
				} else {
					local49[local55] = this.anInt532;
				}
				if (local69 < this.anInt534) {
					local53[local55] = this.anInt534;
				} else if (local69 <= this.anInt532) {
					local53[local55] = local69;
				} else {
					local53[local55] = this.anInt532;
				}
			}
		}
		return local19;
	}
}
