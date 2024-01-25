import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vs")
public final class Class6_Sub2_Sub39 extends Class6_Sub2 {

	@OriginalMember(owner = "client!vs", name = "D", descriptor = "I")
	private int anInt7162 = 4;

	@OriginalMember(owner = "client!vs", name = "z", descriptor = "I")
	private int anInt7159 = 4;

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5859(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass100_41.method2225(arg0);
		if (super.aClass100_41.aBoolean185) {
			@Pc(28) int local28 = Static185.anInt4925 / this.anInt7159;
			@Pc(33) int local33 = Static345.anInt5779 / this.anInt7162;
			@Pc(44) int[] local44;
			@Pc(50) int local50;
			if (local33 <= 0) {
				local44 = this.method5858(0, 0);
			} else {
				local50 = arg0 % local33;
				local44 = this.method5858(0, local50 * Static345.anInt5779 / local33);
			}
			for (local50 = 0; local50 < Static185.anInt4925; local50++) {
				if (local28 > 0) {
					@Pc(70) int local70 = local50 % local28;
					local19[local50] = local44[local70 * Static185.anInt4925 / local28];
				} else {
					local19[local50] = local44[0];
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(ILclient!ha;I)V")
	@Override
	public void method5861(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7159 = arg0.method3111();
		} else if (arg1 == 1) {
			this.anInt7162 = arg0.method3111();
		}
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5868(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass130_41.method2911(arg0);
		if (super.aClass130_41.aBoolean230) {
			@Pc(25) int local25 = Static185.anInt4925 / this.anInt7159;
			@Pc(30) int local30 = Static345.anInt5779 / this.anInt7162;
			@Pc(46) int[][] local46;
			if (local30 > 0) {
				@Pc(36) int local36 = arg0 % local30;
				local46 = this.method5867(Static345.anInt5779 * local36 / local30, 0);
			} else {
				local46 = this.method5867(0, 0);
			}
			@Pc(60) int[] local60 = local46[0];
			@Pc(64) int[] local64 = local46[1];
			@Pc(68) int[] local68 = local46[2];
			@Pc(72) int[] local72 = local11[0];
			@Pc(76) int[] local76 = local11[1];
			@Pc(80) int[] local80 = local11[2];
			for (@Pc(82) int local82 = 0; local82 < Static185.anInt4925; local82++) {
				@Pc(88) int local88;
				if (local25 <= 0) {
					local88 = 0;
				} else {
					@Pc(94) int local94 = local82 % local25;
					local88 = local94 * Static185.anInt4925 / local25;
				}
				local72[local82] = local60[local88];
				local76[local82] = local64[local88];
				local80[local82] = local68[local88];
			}
		}
		return local11;
	}
}
