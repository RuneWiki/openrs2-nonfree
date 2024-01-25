import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class3_Sub1_Sub11 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ec", name = "L", descriptor = "I")
	private int anInt2558 = 4096;

	@OriginalMember(owner = "client!ec", name = "N", descriptor = "I")
	private int anInt2560 = 0;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub11() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method8371(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass220_41.method5791(arg0);
		if (super.aClass220_41.aBoolean587) {
			@Pc(29) int[][] local29 = this.method8360(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static131.anInt2935; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local37[local55];
				@Pc(69) int local69 = local41[local55];
				if (local61 < this.anInt2560) {
					local45[local55] = this.anInt2560;
				} else if (local61 <= this.anInt2558) {
					local45[local55] = local61;
				} else {
					local45[local55] = this.anInt2558;
				}
				if (local65 < this.anInt2560) {
					local49[local55] = this.anInt2560;
				} else if (local65 <= this.anInt2558) {
					local49[local55] = local65;
				} else {
					local49[local55] = this.anInt2558;
				}
				if (this.anInt2560 > local69) {
					local53[local55] = this.anInt2560;
				} else if (local69 <= this.anInt2558) {
					local53[local55] = local69;
				} else {
					local53[local55] = this.anInt2558;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!fd;I)V")
	@Override
	public void method8372(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt2560 = arg1.method6535();
		} else if (arg0 == 1) {
			this.anInt2558 = arg1.method6535();
		} else if (arg0 == 2) {
			super.aBoolean850 = arg1.method6538() == 1;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8359(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass313_41.method7619(arg0);
		if (super.aClass313_41.aBoolean787) {
			@Pc(27) int[] local27 = this.method8362(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static131.anInt2935; local29++) {
				@Pc(35) int local35 = local27[local29];
				if (local35 < this.anInt2560) {
					local17[local29] = this.anInt2560;
				} else if (local35 > this.anInt2558) {
					local17[local29] = this.anInt2558;
				} else {
					local17[local29] = local35;
				}
			}
		}
		return local17;
	}
}
