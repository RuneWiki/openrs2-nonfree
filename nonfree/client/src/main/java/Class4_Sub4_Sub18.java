import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class4_Sub4_Sub18 extends Class4_Sub4 {

	@OriginalMember(owner = "client!li", name = "Q", descriptor = "I")
	private int anInt3829 = 4096;

	@OriginalMember(owner = "client!li", name = "R", descriptor = "I")
	private int anInt3830 = 4096;

	@OriginalMember(owner = "client!li", name = "Y", descriptor = "I")
	private int anInt3836 = 4096;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IBLclient!tq;)V")
	@Override
	public void method5387(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt3829 = arg1.method2404();
		} else if (arg0 == 1) {
			this.anInt3836 = arg1.method2404();
		} else if (arg0 == 2) {
			this.anInt3830 = arg1.method2404();
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5383(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass160_41.method4316(arg0);
		if (super.aClass160_41.aBoolean441) {
			@Pc(26) int[][] local26 = this.method5384(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static124.anInt3576; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local38[local52];
				@Pc(66) int local66 = local34[local52];
				if (local62 == local58 && local62 == local66) {
					local42[local52] = this.anInt3829 * local58 >> 12;
					local46[local52] = this.anInt3836 * local62 >> 12;
					local50[local52] = local66 * this.anInt3830 >> 12;
				} else {
					local42[local52] = this.anInt3829;
					local46[local52] = this.anInt3836;
					local50[local52] = this.anInt3830;
				}
			}
		}
		return local16;
	}
}
