import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rda")
public final class Class6_Sub3_Sub30 extends Class6_Sub3 {

	@OriginalMember(owner = "client!rda", name = "H", descriptor = "I")
	private int anInt7863 = 32768;

	@OriginalMember(owner = "client!rda", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub30() {
		super(3, false);
	}

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method7959(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass263_41.method5967(arg0);
		if (super.aClass263_41.aBoolean505) {
			@Pc(26) int[] local26 = this.method7950(1, arg0);
			@Pc(32) int[] local32 = this.method7950(2, arg0);
			@Pc(36) int[] local36 = local11[0];
			@Pc(40) int[] local40 = local11[1];
			@Pc(44) int[] local44 = local11[2];
			for (@Pc(46) int local46 = 0; local46 < Static35.anInt670; local46++) {
				@Pc(58) int local58 = local26[local46] * 255 >> 12 & 0xFF;
				@Pc(67) int local67 = this.anInt7863 * local32[local46] >> 12;
				@Pc(75) int local75 = local67 * Static6.anIntArray5[local58] >> 12;
				@Pc(83) int local83 = Static412.anIntArray712[local58] * local67 >> 12;
				@Pc(92) int local92 = local46 + (local75 >> 12) & Static147.anInt2781;
				@Pc(101) int local101 = arg0 + (local83 >> 12) & Static132.anInt2511;
				@Pc(107) int[][] local107 = this.method7961(local101, 0);
				local36[local46] = local107[0][local92];
				local40[local46] = local107[1][local92];
				local44[local46] = local107[2][local92];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rda", name = "g", descriptor = "(I)V")
	@Override
	public void method7957() {
		Static583.method7925();
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILclient!jr;B)V")
	@Override
	public void method7955(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt7863 = arg1.method6044() << 4;
		} else if (arg0 == 1) {
			super.aBoolean674 = arg1.method6019() == 1;
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7954(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass137_41.method3408(arg0);
		if (super.aClass137_41.aBoolean306) {
			@Pc(29) int[] local29 = this.method7950(1, arg0);
			@Pc(35) int[] local35 = this.method7950(2, arg0);
			for (@Pc(37) int local37 = 0; local37 < Static35.anInt670; local37++) {
				@Pc(47) int local47 = local29[local37] >> 4 & 0xFF;
				@Pc(56) int local56 = local35[local37] * this.anInt7863 >> 12;
				@Pc(64) int local64 = local56 * Static6.anIntArray5[local47] >> 12;
				@Pc(72) int local72 = local56 * Static412.anIntArray712[local47] >> 12;
				@Pc(80) int local80 = Static147.anInt2781 & (local64 >> 12) + local37;
				@Pc(89) int local89 = Static132.anInt2511 & arg0 + (local72 >> 12);
				@Pc(95) int[] local95 = this.method7950(0, local89);
				local11[local37] = local95[local80];
			}
		}
		return local11;
	}
}
