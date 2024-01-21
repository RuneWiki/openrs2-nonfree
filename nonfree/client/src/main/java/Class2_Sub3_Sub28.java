import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class2_Sub3_Sub28 extends Class2_Sub3 {

	@OriginalMember(owner = "client!rf", name = "db", descriptor = "I")
	private int anInt3084;

	@OriginalMember(owner = "client!rf", name = "V", descriptor = "I")
	private int anInt3079;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(BILclient!ja;)V")
	@Override
	public void method3013(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 0) {
			this.anInt3079 = arg1.method2933();
		} else if (arg0 == 1) {
			this.anInt3084 = arg1.method2933();
		} else if (arg0 == 2) {
			super.aBoolean175 = arg1.method2962() == 1;
		}
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3023(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass43_41.method1439(arg0);
		if (super.aClass43_41.aBoolean77) {
			@Pc(29) int[][] local29 = this.method3017(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[2];
			@Pc(41) int[] local41 = local29[1];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static53.anInt1184; local55++) {
				@Pc(61) int local61 = local37[local55];
				@Pc(65) int local65 = local33[local55];
				@Pc(69) int local69 = local41[local55];
				if (this.anInt3079 > local65) {
					local45[local55] = this.anInt3079;
				} else if (local65 <= this.anInt3084) {
					local45[local55] = local65;
				} else {
					local45[local55] = this.anInt3084;
				}
				if (this.anInt3079 > local69) {
					local49[local55] = this.anInt3079;
				} else if (this.anInt3084 >= local69) {
					local49[local55] = local69;
				} else {
					local49[local55] = this.anInt3084;
				}
				if (this.anInt3079 > local61) {
					local53[local55] = this.anInt3079;
				} else if (local61 > this.anInt3084) {
					local53[local55] = this.anInt3084;
				} else {
					local53[local55] = local61;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3016(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass51_41.method1730(arg0);
		if (super.aClass51_41.aBoolean89) {
			@Pc(17) int[] local17 = this.method3011(arg0, 0);
			for (@Pc(19) int local19 = 0; local19 < Static53.anInt1184; local19++) {
				@Pc(25) int local25 = local17[local19];
				if (local25 < this.anInt3079) {
					local7[local19] = this.anInt3079;
				} else if (this.anInt3084 >= local25) {
					local7[local19] = local25;
				} else {
					local7[local19] = this.anInt3084;
				}
			}
		}
		return local7;
	}
}
