import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cga")
public final class Class6_Sub4_Sub3 extends Class6_Sub4 {

	@OriginalMember(owner = "client!cga", name = "I", descriptor = "Z")
	private boolean aBoolean95 = true;

	@OriginalMember(owner = "client!cga", name = "D", descriptor = "Z")
	private boolean aBoolean93 = true;

	@OriginalMember(owner = "client!cga", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8323(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass372_41.method8736(arg0);
		if (super.aClass372_41.aBoolean691) {
			@Pc(37) int[] local37 = this.method8313(this.aBoolean95 ? Static2.anInt12 - arg0 : arg0, 0);
			if (this.aBoolean93) {
				for (@Pc(50) int local50 = 0; local50 < Static6.anInt111; local50++) {
					local11[local50] = local37[Static325.anInt6209 - local50];
				}
			} else {
				Static655.method5830(local37, 0, local11, 0, Static6.anInt111);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public void method8314(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub40 arg1) {
		if (arg0 == 0) {
			this.aBoolean93 = arg1.method8604() == 1;
		} else if (arg0 == 1) {
			this.aBoolean95 = arg1.method8604() == 1;
		} else if (arg0 == 2) {
			super.aBoolean674 = arg1.method8604() == 1;
		}
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8320(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass307_41.method7792(arg0);
		if (super.aClass307_41.aBoolean613) {
			@Pc(29) int[][] local29 = this.method8319(0, this.aBoolean95 ? Static2.anInt12 - arg0 : arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			@Pc(58) int local58;
			if (this.aBoolean93) {
				for (local58 = 0; local58 < Static6.anInt111; local58++) {
					local45[local58] = local33[Static325.anInt6209 - local58];
					local49[local58] = local37[Static325.anInt6209 - local58];
					local53[local58] = local41[Static325.anInt6209 - local58];
				}
			} else {
				for (local58 = 0; local58 < Static6.anInt111; local58++) {
					local45[local58] = local33[local58];
					local49[local58] = local37[local58];
					local53[local58] = local41[local58];
				}
			}
		}
		return local11;
	}
}
