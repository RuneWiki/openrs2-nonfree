import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class6_Sub3_Sub12 extends Class6_Sub3 {

	@OriginalMember(owner = "client!el", name = "G", descriptor = "I")
	private int anInt2209 = 4096;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub12() {
		super(1, true);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7954(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass137_41.method3408(arg0);
		if (super.aClass137_41.aBoolean306) {
			@Pc(31) int[] local31 = this.method7950(0, arg0 - 1 & Static132.anInt2511);
			@Pc(37) int[] local37 = this.method7950(0, arg0);
			@Pc(47) int[] local47 = this.method7950(0, arg0 + 1 & Static132.anInt2511);
			for (@Pc(49) int local49 = 0; local49 < Static35.anInt670; local49++) {
				@Pc(63) int local63 = this.anInt2209 * (local47[local49] - local31[local49]);
				@Pc(83) int local83 = (local37[Static147.anInt2781 & local49 + 1] - local37[Static147.anInt2781 & local49 - 1]) * this.anInt2209;
				@Pc(87) int local87 = local83 >> 12;
				@Pc(91) int local91 = local63 >> 12;
				@Pc(97) int local97 = local87 * local87 >> 12;
				@Pc(103) int local103 = local91 * local91 >> 12;
				@Pc(117) int local117 = (int) (Math.sqrt((double) ((float) (local103 + local97 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(128) int local128 = local117 == 0 ? 0 : 16777216 / local117;
				local17[local49] = 4096 - local128;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ILclient!jr;B)V")
	@Override
	public void method7955(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt2209 = arg1.method6044();
		}
	}
}
