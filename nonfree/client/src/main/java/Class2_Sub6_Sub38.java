import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class2_Sub6_Sub38 extends Class2_Sub6 {

	@OriginalMember(owner = "client!va", name = "N", descriptor = "I")
	private int anInt6396 = 4096;

	@OriginalMember(owner = "client!va", name = "P", descriptor = "I")
	private int anInt6398 = 4096;

	@OriginalMember(owner = "client!va", name = "S", descriptor = "I")
	private int anInt6400 = 4096;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub38() {
		super(1, false);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!lk;II)V")
	@Override
	public void method5637(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6400 = arg0.method4245();
		} else if (arg1 == 1) {
			this.anInt6396 = arg0.method4245();
		} else if (arg1 == 2) {
			this.anInt6398 = arg0.method4245();
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5641(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass208_41.method4986(arg0);
		if (super.aClass208_41.aBoolean443) {
			@Pc(26) int[][] local26 = this.method5640(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static151.anInt2711; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local38[local52];
				@Pc(66) int local66 = local34[local52];
				if (local62 == local58 && local66 == local62) {
					local42[local52] = this.anInt6400 * local58 >> 12;
					local46[local52] = local62 * this.anInt6396 >> 12;
					local50[local52] = this.anInt6398 * local66 >> 12;
				} else {
					local42[local52] = this.anInt6400;
					local46[local52] = this.anInt6396;
					local50[local52] = this.anInt6398;
				}
			}
		}
		return local11;
	}
}
