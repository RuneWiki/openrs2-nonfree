import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public final class Class3_Sub2_Sub18 extends Class3_Sub2 {

	@OriginalMember(owner = "client!mq", name = "F", descriptor = "Z")
	private boolean aBoolean494 = true;

	@OriginalMember(owner = "client!mq", name = "G", descriptor = "Z")
	private boolean aBoolean495 = true;

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8594(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass40_41.method1572(arg0);
		if (super.aClass40_41.aBoolean97) {
			@Pc(34) int[] local34 = this.method8603(this.aBoolean495 ? Class4_Sub1_Sub3_Sub2.lb - arg0 : arg0, 0);
			if (this.aBoolean494) {
				for (@Pc(39) int local39 = 0; local39 < Static491.anInt8519; local39++) {
					local11[local39] = local34[Static309.anInt5846 - local39];
				}
			} else {
				Static653.method6859(local34, 0, local11, 0, Static491.anInt8519);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8604(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass193_41.method4800(arg0);
		if (super.aClass193_41.aBoolean358) {
			@Pc(29) int[][] local29 = this.method8595(this.aBoolean495 ? Class4_Sub1_Sub3_Sub2.lb - arg0 : arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			@Pc(58) int local58;
			if (this.aBoolean494) {
				for (local58 = 0; local58 < Static491.anInt8519; local58++) {
					local45[local58] = local33[Static309.anInt5846 - local58];
					local49[local58] = local37[Static309.anInt5846 - local58];
					local53[local58] = local41[Static309.anInt5846 - local58];
				}
			} else {
				for (local58 = 0; local58 < Static491.anInt8519; local58++) {
					local45[local58] = local33[local58];
					local49[local58] = local37[local58];
					local53[local58] = local41[local58];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!sl;IB)V")
	@Override
	public void method8600(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean494 = arg0.method4225() == 1;
		} else if (arg1 == 1) {
			this.aBoolean495 = arg0.method4225() == 1;
		} else if (arg1 == 2) {
			super.aBoolean720 = arg0.method4225() == 1;
		}
	}
}
