import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class4_Sub2_Sub18 extends Class4_Sub2 {

	@OriginalMember(owner = "client!mb", name = "F", descriptor = "I")
	private int anInt5485 = 4096;

	@OriginalMember(owner = "client!mb", name = "H", descriptor = "I")
	private int anInt5486 = 4096;

	@OriginalMember(owner = "client!mb", name = "J", descriptor = "I")
	private int anInt5487 = 4096;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BILclient!es;)V")
	@Override
	public void method8767(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt5485 = arg1.method8859();
		} else if (arg0 == 1) {
			this.anInt5487 = arg1.method8859();
		} else if (arg0 == 2) {
			this.anInt5486 = arg1.method8859();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8771(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass304_41.method6699(arg0);
		if (super.aClass304_41.aBoolean604) {
			@Pc(29) int[][] local29 = this.method8772(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static269.anInt4330; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local41[local55];
				@Pc(69) int local69 = local37[local55];
				if (local61 == local65 && local65 == local69) {
					local45[local55] = local61 * this.anInt5485 >> 12;
					local49[local55] = this.anInt5487 * local65 >> 12;
					local53[local55] = local69 * this.anInt5486 >> 12;
				} else {
					local45[local55] = this.anInt5485;
					local49[local55] = this.anInt5487;
					local53[local55] = this.anInt5486;
				}
			}
		}
		return local11;
	}
}
