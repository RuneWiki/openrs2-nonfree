import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tca")
public final class Class6_Sub3_Sub32 extends Class6_Sub3 {

	@OriginalMember(owner = "client!tca", name = "C", descriptor = "I")
	private int anInt8111 = 4096;

	@OriginalMember(owner = "client!tca", name = "J", descriptor = "I")
	private int anInt8116 = 0;

	@OriginalMember(owner = "client!tca", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7828(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass174_41.method3731(arg0);
		if (super.aClass174_41.aBoolean271) {
			@Pc(29) int[] local29 = this.method7824(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static447.anInt8568; local31++) {
				@Pc(37) int local37 = local29[local31];
				if (local37 < this.anInt8116) {
					local19[local31] = this.anInt8116;
				} else if (local37 <= this.anInt8111) {
					local19[local31] = local37;
				} else {
					local19[local31] = this.anInt8111;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IILclient!dga;)V")
	@Override
	public void method7831(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt8116 = arg1.method6006();
		} else if (arg0 == 1) {
			this.anInt8111 = arg1.method6006();
		} else if (arg0 == 2) {
			super.aBoolean668 = arg1.method6041() == 1;
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7822(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass103_41.method2141(arg0);
		if (super.aClass103_41.aBoolean172) {
			@Pc(29) int[][] local29 = this.method7823(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static447.anInt8568; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local37[local55];
				@Pc(69) int local69 = local41[local55];
				if (local61 < this.anInt8116) {
					local45[local55] = this.anInt8116;
				} else if (local61 > this.anInt8111) {
					local45[local55] = this.anInt8111;
				} else {
					local45[local55] = local61;
				}
				if (local65 < this.anInt8116) {
					local49[local55] = this.anInt8116;
				} else if (this.anInt8111 >= local65) {
					local49[local55] = local65;
				} else {
					local49[local55] = this.anInt8111;
				}
				if (local69 < this.anInt8116) {
					local53[local55] = this.anInt8116;
				} else if (this.anInt8111 >= local69) {
					local53[local55] = local69;
				} else {
					local53[local55] = this.anInt8111;
				}
			}
		}
		return local19;
	}
}
