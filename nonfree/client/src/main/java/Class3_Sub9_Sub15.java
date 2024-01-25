import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class3_Sub9_Sub15 extends Class3_Sub9 {

	@OriginalMember(owner = "client!fm", name = "G", descriptor = "I")
	private int anInt3416 = 4096;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub15() {
		super(1, true);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!jp;IB)V")
	@Override
	public void method9166(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3416 = arg0.method8593();
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9165(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass113_41.method3239(arg0);
		if (super.aClass113_41.aBoolean275) {
			@Pc(31) int[] local31 = this.method9162(arg0 - 1 & Static636.anInt10126, 0);
			@Pc(37) int[] local37 = this.method9162(arg0, 0);
			@Pc(47) int[] local47 = this.method9162(arg0 + 1 & Static636.anInt10126, 0);
			for (@Pc(49) int local49 = 0; local49 < Static62.anInt1251; local49++) {
				@Pc(63) int local63 = this.anInt3416 * (local47[local49] - local31[local49]);
				@Pc(82) int local82 = this.anInt3416 * (local37[Static302.anInt5067 & local49 + 1] - local37[local49 - 1 & Static302.anInt5067]);
				@Pc(86) int local86 = local82 >> 12;
				@Pc(90) int local90 = local63 >> 12;
				@Pc(96) int local96 = local86 * local86 >> 12;
				@Pc(102) int local102 = local90 * local90 >> 12;
				@Pc(116) int local116 = (int) (Math.sqrt((double) ((float) (local102 + local96 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(124) int local124 = local116 == 0 ? 0 : 16777216 / local116;
				local17[local49] = 4096 - local124;
			}
		}
		return local17;
	}
}
