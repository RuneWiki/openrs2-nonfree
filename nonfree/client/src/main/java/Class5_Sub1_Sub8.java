import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class5_Sub1_Sub8 extends Class5_Sub1 {

	@OriginalMember(owner = "client!fi", name = "D", descriptor = "I")
	private int anInt2826 = 1365;

	@OriginalMember(owner = "client!fi", name = "G", descriptor = "I")
	private int anInt2829 = 0;

	@OriginalMember(owner = "client!fi", name = "E", descriptor = "I")
	private int anInt2827 = 0;

	@OriginalMember(owner = "client!fi", name = "I", descriptor = "I")
	private int anInt2831 = 20;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BILclient!co;)V")
	@Override
	public void method7164(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt2826 = arg1.method4227();
		} else if (arg0 == 1) {
			this.anInt2831 = arg1.method4227();
		} else if (arg0 == 2) {
			this.anInt2827 = arg1.method4227();
		} else if (arg0 == 3) {
			this.anInt2829 = arg1.method4227();
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7155(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass104_41.method2752(arg0);
		if (super.aClass104_41.aBoolean203) {
			for (@Pc(17) int local17 = 0; local17 < Static147.anInt3075; local17++) {
				@Pc(31) int local31 = this.anInt2827 + (Static315.anIntArray425[local17] << 12) / this.anInt2826;
				@Pc(44) int local44 = (Static295.anIntArray403[arg0] << 12) / this.anInt2826 + this.anInt2829;
				@Pc(50) int local50 = local31;
				@Pc(52) int local52 = local44;
				@Pc(58) int local58 = local31 * local31 >> 12;
				@Pc(64) int local64 = local44 * local44 >> 12;
				@Pc(66) int local66;
				for (local66 = 0; local64 + local58 < 16384 && this.anInt2831 > local66; local66++) {
					local52 = (local52 * local50 >> 12) * 2 + local44;
					local50 = local31 + local58 - local64;
					local64 = local52 * local52 >> 12;
					local58 = local50 * local50 >> 12;
				}
				local11[local17] = this.anInt2831 - 1 > local66 ? (local66 << 12) / this.anInt2831 : 0;
			}
		}
		return local11;
	}
}
