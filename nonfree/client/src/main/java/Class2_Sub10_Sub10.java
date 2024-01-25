import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class2_Sub10_Sub10 extends Class2_Sub10 {

	@OriginalMember(owner = "client!fm", name = "H", descriptor = "I")
	private int anInt3603 = 4096;

	@OriginalMember(owner = "client!fm", name = "I", descriptor = "I")
	private int anInt3604 = 4096;

	@OriginalMember(owner = "client!fm", name = "F", descriptor = "I")
	private int anInt3601 = 4096;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub10() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method8411(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass250_41.method6392(arg0);
		if (super.aClass250_41.aBoolean573) {
			@Pc(26) int[][] local26 = this.method8408(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static93.anInt1862; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local38[local52];
				@Pc(66) int local66 = local34[local52];
				if (local62 == local58 && local66 == local62) {
					local42[local52] = this.anInt3603 * local58 >> 12;
					local46[local52] = this.anInt3604 * local62 >> 12;
					local50[local52] = this.anInt3601 * local66 >> 12;
				} else {
					local42[local52] = this.anInt3603;
					local46[local52] = this.anInt3604;
					local50[local52] = this.anInt3601;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!ud;II)V")
	@Override
	public void method8410(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3603 = arg0.method6884();
		} else if (arg1 == 1) {
			this.anInt3604 = arg0.method6884();
		} else if (arg1 == 2) {
			this.anInt3601 = arg0.method6884();
		}
	}
}
