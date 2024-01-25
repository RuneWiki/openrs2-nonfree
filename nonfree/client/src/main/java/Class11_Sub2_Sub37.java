import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class11_Sub2_Sub37 extends Class11_Sub2 {

	@OriginalMember(owner = "client!wf", name = "K", descriptor = "I")
	private int anInt6637 = 32768;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V")
	public Class11_Sub2_Sub37() {
		super(3, false);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method5716(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass124_41.method2853(arg0);
		if (super.aClass124_41.aBoolean221) {
			@Pc(29) int[] local29 = this.method5710(1, arg0);
			@Pc(35) int[] local35 = this.method5710(2, arg0);
			for (@Pc(37) int local37 = 0; local37 < Static339.anInt6549; local37++) {
				@Pc(47) int local47 = local29[local37] >> 4 & 0xFF;
				@Pc(56) int local56 = this.anInt6637 * local35[local37] >> 12;
				@Pc(64) int local64 = Static333.anIntArray526[local47] * local56 >> 12;
				@Pc(72) int local72 = Static284.anIntArray437[local47] * local56 >> 12;
				@Pc(80) int local80 = local37 + (local64 >> 12) & Static323.anInt6272;
				@Pc(88) int local88 = Static75.anInt1419 & (local72 >> 12) + arg0;
				@Pc(94) int[] local94 = this.method5710(0, local88);
				local11[local37] = local94[local80];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)V")
	@Override
	public void method5708() {
		Static22.method318();
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5709(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass63_41.method1118(arg0);
		if (super.aClass63_41.aBoolean85) {
			@Pc(21) int[] local21 = this.method5710(1, arg0);
			@Pc(29) int[] local29 = this.method5710(2, arg0);
			@Pc(33) int[] local33 = local11[0];
			@Pc(37) int[] local37 = local11[1];
			@Pc(41) int[] local41 = local11[2];
			for (@Pc(43) int local43 = 0; local43 < Static339.anInt6549; local43++) {
				@Pc(55) int local55 = local21[local43] * 255 >> 12 & 0xFF;
				@Pc(64) int local64 = local29[local43] * this.anInt6637 >> 12;
				@Pc(72) int local72 = Static333.anIntArray526[local55] * local64 >> 12;
				@Pc(80) int local80 = local64 * Static284.anIntArray437[local55] >> 12;
				@Pc(88) int local88 = (local72 >> 12) + local43 & Static323.anInt6272;
				@Pc(96) int local96 = Static75.anInt1419 & (local80 >> 12) + arg0;
				@Pc(102) int[][] local102 = this.method5715(local96, 0);
				local33[local43] = local102[0][local88];
				local37[local43] = local102[1][local88];
				local41[local43] = local102[2][local88];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!kh;BI)V")
	@Override
	public void method5711(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6637 = arg0.method5187() << 4;
		} else if (arg1 == 1) {
			super.aBoolean427 = arg0.method5185() == 1;
		}
	}
}
