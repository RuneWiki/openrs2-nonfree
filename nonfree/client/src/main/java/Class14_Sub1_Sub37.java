import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class14_Sub1_Sub37 extends Class14_Sub1 {

	@OriginalMember(owner = "client!vd", name = "J", descriptor = "I")
	private int anInt10512 = 4096;

	@OriginalMember(owner = "client!vd", name = "K", descriptor = "I")
	private int anInt10513 = 4096;

	@OriginalMember(owner = "client!vd", name = "F", descriptor = "I")
	private int anInt10509 = 4096;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
	public Class14_Sub1_Sub37() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method8905(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass279_41.method6840(arg0);
		if (super.aClass279_41.aBoolean571) {
			@Pc(26) int[][] local26 = this.method8904(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static371.anInt6835; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local38[local52];
				@Pc(66) int local66 = local34[local52];
				if (local62 == local58 && local62 == local66) {
					local42[local52] = this.anInt10509 * local58 >> 12;
					local46[local52] = this.anInt10513 * local62 >> 12;
					local50[local52] = this.anInt10512 * local66 >> 12;
				} else {
					local42[local52] = this.anInt10509;
					local46[local52] = this.anInt10513;
					local50[local52] = this.anInt10512;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!so;II)V")
	@Override
	public void method8903(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt10509 = arg0.method5900();
		} else if (arg1 == 1) {
			this.anInt10513 = arg0.method5900();
		} else if (arg1 == 2) {
			this.anInt10512 = arg0.method5900();
		}
	}
}
