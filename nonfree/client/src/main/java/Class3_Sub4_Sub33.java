import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class3_Sub4_Sub33 extends Class3_Sub4 {

	@OriginalMember(owner = "client!uf", name = "O", descriptor = "Z")
	private boolean aBoolean489 = true;

	@OriginalMember(owner = "client!uf", name = "L", descriptor = "Z")
	private boolean aBoolean488 = true;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IILclient!bt;)V")
	@Override
	public void method5958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.aBoolean488 = arg1.method6053() == 1;
		} else if (arg0 == 1) {
			this.aBoolean489 = arg1.method6053() == 1;
		} else if (arg0 == 2) {
			super.aBoolean524 = arg1.method6053() == 1;
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5955(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass214_41.method5177(arg0);
		if (super.aClass214_41.aBoolean455) {
			@Pc(29) int[][] local29 = this.method5962(0, this.aBoolean489 ? Static311.anInt5681 - arg0 : arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			@Pc(58) int local58;
			if (this.aBoolean488) {
				for (local58 = 0; local58 < Static106.anInt2356; local58++) {
					local45[local58] = local33[Static396.anInt6840 - local58];
					local49[local58] = local37[Static396.anInt6840 - local58];
					local53[local58] = local41[Static396.anInt6840 - local58];
				}
			} else {
				for (local58 = 0; local58 < Static106.anInt2356; local58++) {
					local45[local58] = local33[local58];
					local49[local58] = local37[local58];
					local53[local58] = local41[local58];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5966(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass146_41.method3700(arg0);
		if (super.aClass146_41.aBoolean342) {
			@Pc(29) int[] local29 = this.method5960(0, this.aBoolean489 ? Static311.anInt5681 - arg0 : arg0);
			if (this.aBoolean488) {
				for (@Pc(34) int local34 = 0; local34 < Static106.anInt2356; local34++) {
					local11[local34] = local29[Static396.anInt6840 - local34];
				}
			} else {
				Static464.method5800(local29, 0, local11, 0, Static106.anInt2356);
			}
		}
		return local11;
	}
}
