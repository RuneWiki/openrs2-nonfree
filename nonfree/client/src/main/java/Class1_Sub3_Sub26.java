import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ow")
public final class Class1_Sub3_Sub26 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ow", name = "S", descriptor = "I")
	private int anInt6508 = 4096;

	@OriginalMember(owner = "client!ow", name = "P", descriptor = "I")
	private int anInt6506 = 4096;

	@OriginalMember(owner = "client!ow", name = "L", descriptor = "I")
	private int anInt6503 = 4096;

	@OriginalMember(owner = "client!ow", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub26() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ow", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8190(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass281_41.method7073(arg0);
		if (super.aClass281_41.aBoolean590) {
			@Pc(26) int[][] local26 = this.method8199(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static254.anInt4973; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local38[local52];
				@Pc(66) int local66 = local34[local52];
				if (local58 == local62 && local66 == local62) {
					local42[local52] = this.anInt6503 * local58 >> 12;
					local46[local52] = local62 * this.anInt6508 >> 12;
					local50[local52] = local66 * this.anInt6506 >> 12;
				} else {
					local42[local52] = this.anInt6503;
					local46[local52] = this.anInt6508;
					local50[local52] = this.anInt6506;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(IILclient!os;)V")
	@Override
	public void method8200(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt6503 = arg1.method4494();
		} else if (arg0 == 1) {
			this.anInt6508 = arg1.method4494();
		} else if (arg0 == 2) {
			this.anInt6506 = arg1.method4494();
		}
	}
}
