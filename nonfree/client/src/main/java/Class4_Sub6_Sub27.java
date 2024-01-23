import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class Class4_Sub6_Sub27 extends Class4_Sub6 {

	@OriginalMember(owner = "client!ql", name = "P", descriptor = "Z")
	private boolean aBoolean287 = true;

	@OriginalMember(owner = "client!ql", name = "J", descriptor = "I")
	private int anInt4342 = 4096;

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub27() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4379(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = this.aClass84_41.method2153(arg0);
		if (this.aClass84_41.aBoolean183) {
			@Pc(36) int[] local36 = this.method4372(0, Static137.anInt2812 & arg0 - 1);
			@Pc(42) int[] local42 = this.method4372(0, arg0);
			@Pc(52) int[] local52 = this.method4372(0, arg0 + 1 & Static137.anInt2812);
			@Pc(56) int[] local56 = local17[0];
			@Pc(60) int[] local60 = local17[1];
			@Pc(64) int[] local64 = local17[2];
			for (@Pc(66) int local66 = 0; local66 < Static2.anInt19; local66++) {
				@Pc(81) int local81 = this.anInt4342 * (local52[local66] - local36[local66]);
				@Pc(101) int local101 = this.anInt4342 * (local42[Static168.anInt3337 & local66 + 1] - local42[local66 - 1 & Static168.anInt3337]);
				@Pc(105) int local105 = local101 >> 12;
				@Pc(109) int local109 = local81 >> 12;
				@Pc(115) int local115 = local105 * local105 >> 12;
				@Pc(121) int local121 = local109 * local109 >> 12;
				@Pc(136) int local136 = (int) (Math.sqrt((double) ((float) (local115 + local121 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(143) int local143;
				@Pc(147) int local147;
				@Pc(145) int local145;
				if (local136 == 0) {
					local143 = 0;
					local145 = 0;
					local147 = 0;
				} else {
					local143 = local101 / local136;
					local147 = local81 / local136;
					local145 = 16777216 / local136;
				}
				if (this.aBoolean287) {
					local145 = (local145 >> 1) + 2048;
					local143 = (local143 >> 1) + 2048;
					local147 = (local147 >> 1) + 2048;
				}
				local56[local66] = local143;
				local60[local66] = local147;
				local64[local66] = local145;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!p;II)V")
	@Override
	public void method4381(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4342 = arg0.method1837();
		} else if (arg1 == 1) {
			this.aBoolean287 = arg0.method1874() == 1;
		}
	}
}
