import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class4_Sub4_Sub22 extends Class4_Sub4 {

	@OriginalMember(owner = "client!lk", name = "F", descriptor = "I")
	private int anInt5520 = 4096;

	@OriginalMember(owner = "client!lk", name = "H", descriptor = "I")
	private int anInt5522 = 4096;

	@OriginalMember(owner = "client!lk", name = "J", descriptor = "I")
	private int anInt5523 = 4096;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub22() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(BILclient!eh;)V")
	@Override
	public void method7886(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt5520 = arg1.method5982();
		} else if (arg0 == 1) {
			this.anInt5522 = arg1.method5982();
		} else if (arg0 == 2) {
			this.anInt5523 = arg1.method5982();
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7887(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass201_41.method4419(arg0);
		if (super.aClass201_41.aBoolean392) {
			@Pc(26) int[][] local26 = this.method7892(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static560.anInt9394; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local38[local52];
				@Pc(66) int local66 = local34[local52];
				if (local62 == local58 && local62 == local66) {
					local42[local52] = local58 * this.anInt5520 >> 12;
					local46[local52] = this.anInt5522 * local62 >> 12;
					local50[local52] = this.anInt5523 * local66 >> 12;
				} else {
					local42[local52] = this.anInt5520;
					local46[local52] = this.anInt5522;
					local50[local52] = this.anInt5523;
				}
			}
		}
		return local11;
	}
}
