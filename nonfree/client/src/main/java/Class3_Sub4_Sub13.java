import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fr")
public final class Class3_Sub4_Sub13 extends Class3_Sub4 {

	@OriginalMember(owner = "client!fr", name = "L", descriptor = "I")
	private int anInt2100 = 0;

	@OriginalMember(owner = "client!fr", name = "T", descriptor = "I")
	private int anInt2105 = 4096;

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub13() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method6144(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass148_41.method3566(arg0);
		if (super.aClass148_41.aBoolean309) {
			@Pc(29) int[][] local29 = this.method6138(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static148.anInt2687; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local37[local55];
				@Pc(69) int local69 = local41[local55];
				if (local61 < this.anInt2100) {
					local45[local55] = this.anInt2100;
				} else if (local61 > this.anInt2105) {
					local45[local55] = this.anInt2105;
				} else {
					local45[local55] = local61;
				}
				if (local65 < this.anInt2100) {
					local49[local55] = this.anInt2100;
				} else if (this.anInt2105 < local65) {
					local49[local55] = this.anInt2105;
				} else {
					local49[local55] = local65;
				}
				if (this.anInt2100 > local69) {
					local53[local55] = this.anInt2100;
				} else if (this.anInt2105 >= local69) {
					local53[local55] = local69;
				} else {
					local53[local55] = this.anInt2105;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method6134(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass109_41.method2831(arg0);
		if (super.aClass109_41.aBoolean250) {
			@Pc(26) int[] local26 = this.method6139(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static148.anInt2687; local28++) {
				@Pc(34) int local34 = local26[local28];
				if (local34 < this.anInt2100) {
					local16[local28] = this.anInt2100;
				} else if (this.anInt2105 >= local34) {
					local16[local28] = local34;
				} else {
					local16[local28] = this.anInt2105;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method6141(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2100 = arg0.method4083();
		} else if (arg1 == 1) {
			this.anInt2105 = arg0.method4083();
		} else if (arg1 == 2) {
			super.aBoolean504 = arg0.method4096() == 1;
		}
	}
}
