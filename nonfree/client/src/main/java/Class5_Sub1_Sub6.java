import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class5_Sub1_Sub6 extends Class5_Sub1 {

	@OriginalMember(owner = "client!dd", name = "Q", descriptor = "I")
	private int anInt782 = 4096;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub6() {
		super(1, true);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3190(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt782 = arg0.method3077();
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3195(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass101_41.method2886(arg0);
		if (super.aClass101_41.aBoolean174) {
			@Pc(25) int[] local25 = this.method3196(arg0 - 1 & Static3.anInt74, 0);
			@Pc(31) int[] local31 = this.method3196(arg0, 0);
			@Pc(41) int[] local41 = this.method3196(Static3.anInt74 & arg0 + 1, 0);
			for (@Pc(43) int local43 = 0; local43 < Static174.anInt3489; local43++) {
				@Pc(56) int local56 = (local41[local43] - local25[local43]) * this.anInt782;
				@Pc(75) int local75 = this.anInt782 * (local31[Static189.anInt3753 & local43 + 1] - local31[local43 - 1 & Static189.anInt3753]);
				@Pc(79) int local79 = local75 >> 12;
				@Pc(83) int local83 = local56 >> 12;
				@Pc(89) int local89 = local83 * local83 >> 12;
				@Pc(95) int local95 = local79 * local79 >> 12;
				@Pc(109) int local109 = (int) (Math.sqrt((double) ((float) (local95 + local89 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(117) int local117 = local109 == 0 ? 0 : 16777216 / local109;
				local11[local43] = 4096 - local117;
			}
		}
		return local11;
	}
}
