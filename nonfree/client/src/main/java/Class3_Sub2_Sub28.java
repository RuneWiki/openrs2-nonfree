import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qfa")
public final class Class3_Sub2_Sub28 extends Class3_Sub2 {

	@OriginalMember(owner = "client!qfa", name = "F", descriptor = "Z")
	private boolean aBoolean617 = true;

	@OriginalMember(owner = "client!qfa", name = "H", descriptor = "Z")
	private boolean aBoolean618 = true;

	@OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub28() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8711(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass115_41.method2722(arg0);
		if (super.aClass115_41.aBoolean233) {
			@Pc(34) int[][] local34 = this.method8718(0, this.aBoolean618 ? Static622.anInt9680 - arg0 : arg0);
			@Pc(38) int[] local38 = local34[0];
			@Pc(42) int[] local42 = local34[1];
			@Pc(46) int[] local46 = local34[2];
			@Pc(50) int[] local50 = local11[0];
			@Pc(54) int[] local54 = local11[1];
			@Pc(58) int[] local58 = local11[2];
			@Pc(63) int local63;
			if (this.aBoolean617) {
				for (local63 = 0; local63 < Static30.anInt908; local63++) {
					local50[local63] = local38[Static241.anInt4556 - local63];
					local54[local63] = local42[Static241.anInt4556 - local63];
					local58[local63] = local46[Static241.anInt4556 - local63];
				}
			} else {
				for (local63 = 0; local63 < Static30.anInt908; local63++) {
					local50[local63] = local38[local63];
					local54[local63] = local42[local63];
					local58[local63] = local46[local63];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8710(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass340_41.method7837(arg0);
		if (super.aClass340_41.aBoolean687) {
			@Pc(29) int[] local29 = this.method8716(0, this.aBoolean618 ? Static622.anInt9680 - arg0 : arg0);
			if (this.aBoolean617) {
				for (@Pc(34) int local34 = 0; local34 < Static30.anInt908; local34++) {
					local11[local34] = local29[Static241.anInt4556 - local34];
				}
			} else {
				Static689.method8054(local29, 0, local11, 0, Static30.anInt908);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lclient!fca;II)V")
	@Override
	public void method8709(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean617 = arg0.method4888() == 1;
		} else if (arg1 == 1) {
			this.aBoolean618 = arg0.method4888() == 1;
		} else if (arg1 == 2) {
			super.aBoolean761 = arg0.method4888() == 1;
		}
	}
}
