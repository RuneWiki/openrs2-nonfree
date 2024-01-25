import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bda")
public final class Class6_Sub3_Sub3 extends Class6_Sub3 {

	@OriginalMember(owner = "client!bda", name = "H", descriptor = "Z")
	private boolean aBoolean44 = true;

	@OriginalMember(owner = "client!bda", name = "I", descriptor = "Z")
	private boolean aBoolean45 = true;

	@OriginalMember(owner = "client!bda", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILclient!jr;B)V")
	@Override
	public void method7955(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		if (arg0 == 0) {
			this.aBoolean44 = arg1.method6019() == 1;
		} else if (arg0 == 1) {
			this.aBoolean45 = arg1.method6019() == 1;
		} else if (arg0 == 2) {
			super.aBoolean674 = arg1.method6019() == 1;
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7954(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass137_41.method3408(arg0);
		if (super.aClass137_41.aBoolean306) {
			@Pc(29) int[] local29 = this.method7950(0, this.aBoolean45 ? Static132.anInt2511 - arg0 : arg0);
			if (this.aBoolean44) {
				for (@Pc(34) int local34 = 0; local34 < Static35.anInt670; local34++) {
					local11[local34] = local29[Static147.anInt2781 - local34];
				}
			} else {
				Static596.method7716(local29, 0, local11, 0, Static35.anInt670);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bda", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method7959(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass263_41.method5967(arg0);
		if (super.aClass263_41.aBoolean505) {
			@Pc(33) int[][] local33 = this.method7961(this.aBoolean45 ? Static132.anInt2511 - arg0 : arg0, 0);
			@Pc(37) int[] local37 = local33[0];
			@Pc(41) int[] local41 = local33[1];
			@Pc(45) int[] local45 = local33[2];
			@Pc(49) int[] local49 = local16[0];
			@Pc(53) int[] local53 = local16[1];
			@Pc(57) int[] local57 = local16[2];
			@Pc(62) int local62;
			if (this.aBoolean44) {
				for (local62 = 0; local62 < Static35.anInt670; local62++) {
					local49[local62] = local37[Static147.anInt2781 - local62];
					local53[local62] = local41[Static147.anInt2781 - local62];
					local57[local62] = local45[Static147.anInt2781 - local62];
				}
			} else {
				for (local62 = 0; local62 < Static35.anInt670; local62++) {
					local49[local62] = local37[local62];
					local53[local62] = local41[local62];
					local57[local62] = local45[local62];
				}
			}
		}
		return local16;
	}
}
