import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class2_Sub1_Sub16 extends Class2_Sub1 {

	@OriginalMember(owner = "client!lf", name = "Q", descriptor = "I")
	private int anInt2487 = 4;

	@OriginalMember(owner = "client!lf", name = "bb", descriptor = "I")
	private int anInt2491 = 4;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub16() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!ra;IZ)V")
	@Override
	public void method3264(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2487 = arg0.method260();
		} else if (arg1 == 1) {
			this.anInt2491 = arg0.method260();
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method3256(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass52_41.method1596(arg0);
		if (super.aClass52_41.aBoolean103) {
			@Pc(25) int local25 = Static102.anInt2347 / this.anInt2491;
			@Pc(30) int local30 = Static135.anInt2897 / this.anInt2487;
			@Pc(46) int[] local46;
			@Pc(36) int local36;
			if (local25 > 0) {
				local36 = arg0 % local25;
				local46 = this.method3265(Static102.anInt2347 * local36 / local25, 0);
			} else {
				local46 = this.method3265(0, 0);
			}
			for (local36 = 0; local36 < Static135.anInt2897; local36++) {
				if (local30 > 0) {
					@Pc(64) int local64 = local36 % local30;
					local16[local36] = local46[local64 * Static135.anInt2897 / local30];
				} else {
					local16[local36] = local46[0];
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3262(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass43_41.method1433(arg0);
		if (super.aClass43_41.aBoolean92) {
			@Pc(25) int local25 = Static135.anInt2897 / this.anInt2487;
			@Pc(30) int local30 = Static102.anInt2347 / this.anInt2491;
			@Pc(38) int[][] local38;
			if (local30 <= 0) {
				local38 = this.method3259(0, 0);
			} else {
				@Pc(44) int local44 = arg0 % local30;
				local38 = this.method3259(local44 * Static102.anInt2347 / local30, 0);
			}
			@Pc(60) int[] local60 = local38[0];
			@Pc(64) int[] local64 = local38[1];
			@Pc(68) int[] local68 = local38[2];
			@Pc(72) int[] local72 = local16[0];
			@Pc(76) int[] local76 = local16[2];
			@Pc(80) int[] local80 = local16[1];
			for (@Pc(82) int local82 = 0; local82 < Static135.anInt2897; local82++) {
				@Pc(91) int local91;
				if (local25 <= 0) {
					local91 = 0;
				} else {
					@Pc(97) int local97 = local82 % local25;
					local91 = Static135.anInt2897 * local97 / local25;
				}
				local72[local82] = local60[local91];
				local80[local82] = local64[local91];
				local76[local82] = local68[local91];
			}
		}
		return local16;
	}
}
