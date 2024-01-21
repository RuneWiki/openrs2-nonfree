import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class3_Sub2_Sub28 extends Class3_Sub2 {

	@OriginalMember(owner = "client!qe", name = "cb", descriptor = "I")
	private int anInt3256 = 0;

	@OriginalMember(owner = "client!qe", name = "eb", descriptor = "I")
	private int anInt3258 = 4096;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub28() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method3326(@OriginalArg(1) int arg0) {
		@Pc(15) int[][] local15 = super.aClass67_41.method1940(arg0);
		if (super.aClass67_41.aBoolean135) {
			@Pc(29) int[][] local29 = this.method3332(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local15[0];
			@Pc(45) int[] local45 = local29[2];
			@Pc(49) int[] local49 = local15[1];
			@Pc(53) int[] local53 = local15[2];
			for (@Pc(55) int local55 = 0; local55 < Static190.anInt3865; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local45[local55];
				@Pc(69) int local69 = local37[local55];
				if (local61 < this.anInt3256) {
					local41[local55] = this.anInt3256;
				} else if (this.anInt3258 < local61) {
					local41[local55] = this.anInt3258;
				} else {
					local41[local55] = local61;
				}
				if (local69 < this.anInt3256) {
					local49[local55] = this.anInt3256;
				} else if (local69 > this.anInt3258) {
					local49[local55] = this.anInt3258;
				} else {
					local49[local55] = local69;
				}
				if (local65 < this.anInt3256) {
					local53[local55] = this.anInt3256;
				} else if (local65 > this.anInt3258) {
					local53[local55] = this.anInt3258;
				} else {
					local53[local55] = local65;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3334(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass2_41.method9(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(29) int[] local29 = this.method3328(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static190.anInt3865; local31++) {
				@Pc(37) int local37 = local29[local31];
				if (local37 < this.anInt3256) {
					local11[local31] = this.anInt3256;
				} else if (local37 <= this.anInt3258) {
					local11[local31] = local37;
				} else {
					local11[local31] = this.anInt3258;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3337(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3256 = arg0.method1270();
		} else if (arg1 == 1) {
			this.anInt3258 = arg0.method1270();
		} else if (arg1 == 2) {
			super.aBoolean190 = arg0.method1278() == 1;
		}
	}
}
