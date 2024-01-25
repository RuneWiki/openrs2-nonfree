import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class6_Sub2_Sub25 extends Class6_Sub2 {

	@OriginalMember(owner = "client!nn", name = "H", descriptor = "I")
	private int anInt4638 = 3072;

	@OriginalMember(owner = "client!nn", name = "I", descriptor = "I")
	private int anInt4639 = 1024;

	@OriginalMember(owner = "client!nn", name = "L", descriptor = "I")
	private int anInt4641 = 2048;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub25() {
		super(1, false);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILclient!ha;I)V")
	@Override
	public void method5861(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4639 = arg0.method3108();
		} else if (arg1 == 1) {
			this.anInt4638 = arg0.method3108();
		} else if (arg1 == 2) {
			super.aBoolean488 = arg0.method3111() == 1;
		}
	}

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "(I)V")
	@Override
	public void method5862() {
		this.anInt4641 = this.anInt4638 - this.anInt4639;
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5868(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass130_41.method2911(arg0);
		if (super.aClass130_41.aBoolean230) {
			@Pc(28) int[][] local28 = this.method5867(arg0, 0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local16[0];
			@Pc(48) int[] local48 = local16[1];
			@Pc(52) int[] local52 = local16[2];
			for (@Pc(54) int local54 = 0; local54 < Static185.anInt4925; local54++) {
				local44[local54] = (this.anInt4641 * local32[local54] >> 12) + this.anInt4639;
				local48[local54] = this.anInt4639 + (this.anInt4641 * local36[local54] >> 12);
				local52[local54] = this.anInt4639 + (this.anInt4641 * local40[local54] >> 12);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5859(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass100_41.method2225(arg0);
		if (super.aClass100_41.aBoolean185) {
			@Pc(26) int[] local26 = this.method5858(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static185.anInt4925; local28++) {
				local16[local28] = (this.anInt4641 * local26[local28] >> 12) + this.anInt4639;
			}
		}
		return local16;
	}
}
