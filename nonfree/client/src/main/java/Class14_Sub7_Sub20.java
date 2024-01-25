import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class14_Sub7_Sub20 extends Class14_Sub7 {

	@OriginalMember(owner = "client!jn", name = "J", descriptor = "I")
	private int anInt5302 = 32768;

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "()V")
	public Class14_Sub7_Sub20() {
		super(3, false);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method9388(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass340_41.method8152(arg0);
		if (super.aClass340_41.aBoolean655) {
			@Pc(28) int[] local28 = this.method9379(1, arg0);
			@Pc(34) int[] local34 = this.method9379(2, arg0);
			@Pc(38) int[] local38 = local18[0];
			@Pc(42) int[] local42 = local18[1];
			@Pc(46) int[] local46 = local18[2];
			for (@Pc(48) int local48 = 0; local48 < Static613.anInt10114; local48++) {
				@Pc(60) int local60 = local28[local48] * 255 >> 12 & 0xFF;
				@Pc(69) int local69 = local34[local48] * this.anInt5302 >> 12;
				@Pc(77) int local77 = local69 * Static79.anIntArray75[local60] >> 12;
				@Pc(85) int local85 = Static600.anIntArray533[local60] * local69 >> 12;
				@Pc(93) int local93 = Static677.anInt11036 & local48 + (local77 >> 12);
				@Pc(101) int local101 = Static660.anInt6757 & (local85 >> 12) + arg0;
				@Pc(107) int[][] local107 = this.method9384(local101, 0);
				local38[local48] = local107[0][local93];
				local42[local48] = local107[1][local93];
				local46[local48] = local107[2][local93];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!jn", name = "e", descriptor = "(I)V")
	@Override
	public void method9386() {
		Static678.method9367();
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method9382(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass83_41.method1817(arg0);
		if (super.aClass83_41.aBoolean135) {
			@Pc(28) int[] local28 = this.method9379(1, arg0);
			@Pc(34) int[] local34 = this.method9379(2, arg0);
			for (@Pc(36) int local36 = 0; local36 < Static613.anInt10114; local36++) {
				@Pc(46) int local46 = local28[local36] >> 4 & 0xFF;
				@Pc(55) int local55 = this.anInt5302 * local34[local36] >> 12;
				@Pc(63) int local63 = local55 * Static79.anIntArray75[local46] >> 12;
				@Pc(71) int local71 = local55 * Static600.anIntArray533[local46] >> 12;
				@Pc(79) int local79 = Static677.anInt11036 & local36 + (local63 >> 12);
				@Pc(87) int local87 = (local71 >> 12) + arg0 & Static660.anInt6757;
				@Pc(93) int[] local93 = this.method9379(0, local87);
				local18[local36] = local93[local79];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method9391(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt5302 = arg1.method7717(-1978450544) << 4;
		} else if (arg0 == 1) {
			super.aBoolean773 = arg1.method7695(127) == 1;
		}
	}
}
