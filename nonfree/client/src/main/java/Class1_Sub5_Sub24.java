import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class1_Sub5_Sub24 extends Class1_Sub5 {

	@OriginalMember(owner = "client!od", name = "hb", descriptor = "I")
	private int anInt2714;

	@OriginalMember(owner = "client!od", name = "V", descriptor = "I")
	private int anInt2705;

	@OriginalMember(owner = "client!od", name = "bb", descriptor = "I")
	private int anInt2709;

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(B)V")
	@Override
	public void method3146() {
		this.anInt2709 = this.anInt2714 - this.anInt2705;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3143(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass2_41.method19(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(25) int[] local25 = this.method3145(0, arg0);
			for (@Pc(27) int local27 = 0; local27 < Static177.anInt4018; local27++) {
				local7[local27] = (this.anInt2709 * local25[local27] >> 12) + this.anInt2705;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!ka;IZ)V")
	@Override
	public void method3148(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2705 = arg0.method359();
		} else if (arg1 == 1) {
			this.anInt2714 = arg0.method359();
		} else if (arg1 == 2) {
			super.aBoolean173 = arg0.method336() == 1;
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3149(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass53_41.method1591(arg0);
		if (super.aClass53_41.aBoolean90) {
			@Pc(29) int[][] local29 = this.method3144(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[2];
			@Pc(41) int[] local41 = local19[1];
			@Pc(45) int[] local45 = local29[1];
			@Pc(49) int[] local49 = local19[0];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static177.anInt4018; local55++) {
				local49[local55] = this.anInt2705 + (this.anInt2709 * local33[local55] >> 12);
				local41[local55] = this.anInt2705 + (this.anInt2709 * local45[local55] >> 12);
				local53[local55] = (this.anInt2709 * local37[local55] >> 12) + this.anInt2705;
			}
		}
		return local19;
	}
}
