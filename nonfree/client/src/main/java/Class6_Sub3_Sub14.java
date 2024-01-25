import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class6_Sub3_Sub14 extends Class6_Sub3 {

	@OriginalMember(owner = "client!fm", name = "F", descriptor = "I")
	private int anInt2857 = 2048;

	@OriginalMember(owner = "client!fm", name = "I", descriptor = "I")
	private int anInt2860 = 3072;

	@OriginalMember(owner = "client!fm", name = "G", descriptor = "I")
	private int anInt2858 = 1024;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method7959(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass263_41.method5967(arg0);
		if (super.aClass263_41.aBoolean505) {
			@Pc(21) int[][] local21 = this.method7961(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static35.anInt670; local47++) {
				local37[local47] = this.anInt2858 + (local25[local47] * this.anInt2857 >> 12);
				local41[local47] = this.anInt2858 + (this.anInt2857 * local29[local47] >> 12);
				local45[local47] = this.anInt2858 + (this.anInt2857 * local33[local47] >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7954(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass137_41.method3408(arg0);
		if (super.aClass137_41.aBoolean306) {
			@Pc(26) int[] local26 = this.method7950(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static35.anInt670; local28++) {
				local16[local28] = (this.anInt2857 * local26[local28] >> 12) + this.anInt2858;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILclient!jr;B)V")
	@Override
	public void method7955(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt2858 = arg1.method6044();
		} else if (arg0 == 1) {
			this.anInt2860 = arg1.method6044();
		} else if (arg0 == 2) {
			super.aBoolean674 = arg1.method6019() == 1;
		}
	}

	@OriginalMember(owner = "client!fm", name = "g", descriptor = "(I)V")
	@Override
	public void method7957() {
		this.anInt2857 = this.anInt2860 - this.anInt2858;
	}
}
