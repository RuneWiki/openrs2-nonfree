import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jea")
public final class Class3_Sub1_Sub16 extends Class3_Sub1 {

	@OriginalMember(owner = "client!jea", name = "O", descriptor = "Z")
	private boolean aBoolean414 = true;

	@OriginalMember(owner = "client!jea", name = "P", descriptor = "Z")
	private boolean aBoolean415 = true;

	@OriginalMember(owner = "client!jea", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub16() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(ILclient!fd;I)V")
	@Override
	public void method8372(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg0 == 0) {
			this.aBoolean414 = arg1.method6538() == 1;
		} else if (arg0 == 1) {
			this.aBoolean415 = arg1.method6538() == 1;
		} else if (arg0 == 2) {
			super.aBoolean850 = arg1.method6538() == 1;
		}
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8359(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass313_41.method7619(arg0);
		if (super.aClass313_41.aBoolean787) {
			@Pc(34) int[] local34 = this.method8362(this.aBoolean415 ? Static483.anInt9026 - arg0 : arg0, 0);
			if (this.aBoolean414) {
				for (@Pc(47) int local47 = 0; local47 < Static131.anInt2935; local47++) {
					local11[local47] = local34[Static251.anInt5425 - local47];
				}
			} else {
				Static602.method4669(local34, 0, local11, 0, Static131.anInt2935);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jea", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method8371(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass220_41.method5791(arg0);
		if (super.aClass220_41.aBoolean587) {
			@Pc(29) int[][] local29 = this.method8360(0, this.aBoolean415 ? Static483.anInt9026 - arg0 : arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			@Pc(58) int local58;
			if (this.aBoolean414) {
				for (local58 = 0; local58 < Static131.anInt2935; local58++) {
					local45[local58] = local33[Static251.anInt5425 - local58];
					local49[local58] = local37[Static251.anInt5425 - local58];
					local53[local58] = local41[Static251.anInt5425 - local58];
				}
			} else {
				for (local58 = 0; local58 < Static131.anInt2935; local58++) {
					local45[local58] = local33[local58];
					local49[local58] = local37[local58];
					local53[local58] = local41[local58];
				}
			}
		}
		return local11;
	}
}
