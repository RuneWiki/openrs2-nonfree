import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class1_Sub1_Sub37 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ue", name = "bb", descriptor = "I")
	private int anInt5614 = 4096;

	@OriginalMember(owner = "client!ue", name = "cb", descriptor = "Z")
	private boolean aBoolean352 = true;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub37() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method4714(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = this.aClass45_41.method1139(arg0);
		if (this.aClass45_41.aBoolean95) {
			@Pc(22) int[] local22 = this.method4716(0, Static279.anInt5616 & arg0 - 1);
			@Pc(28) int[] local28 = this.method4716(0, arg0);
			@Pc(38) int[] local38 = this.method4716(0, arg0 + 1 & Static279.anInt5616);
			@Pc(42) int[] local42 = local7[0];
			@Pc(46) int[] local46 = local7[1];
			@Pc(50) int[] local50 = local7[2];
			for (@Pc(52) int local52 = 0; local52 < Static62.anInt1350; local52++) {
				@Pc(70) int local70 = this.anInt5614 * (local38[local52] - local22[local52]);
				@Pc(89) int local89 = this.anInt5614 * (local28[Static302.anInt6003 & local52 + 1] - local28[Static302.anInt6003 & local52 - 1]);
				@Pc(93) int local93 = local70 >> 12;
				@Pc(99) int local99 = local93 * local93 >> 12;
				@Pc(103) int local103 = local89 >> 12;
				@Pc(109) int local109 = local103 * local103 >> 12;
				@Pc(123) int local123 = (int) (Math.sqrt((double) ((float) (local109 + local99 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(132) int local132;
				@Pc(130) int local130;
				@Pc(128) int local128;
				if (local123 == 0) {
					local128 = 0;
					local130 = 0;
					local132 = 0;
				} else {
					local132 = local89 / local123;
					local130 = local70 / local123;
					local128 = 16777216 / local123;
				}
				if (this.aBoolean352) {
					local130 = (local130 >> 1) + 2048;
					local128 = (local128 >> 1) + 2048;
					local132 = (local132 >> 1) + 2048;
				}
				local42[local52] = local132;
				local46[local52] = local130;
				local50[local52] = local128;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!qm;II)V")
	@Override
	public void method4712(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5614 = arg0.method2244();
		} else if (arg1 == 1) {
			this.aBoolean352 = arg0.method2199() == 1;
		}
	}
}
