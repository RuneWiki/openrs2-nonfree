import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class3_Sub5_Sub28 extends Class3_Sub5 {

	@OriginalMember(owner = "client!sc", name = "Q", descriptor = "I")
	private int anInt3633;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)V")
	@Override
	public void method3164() {
		Static153.method447();
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3172(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass89_41.method2876(arg0);
		if (super.aClass89_41.aBoolean160) {
			@Pc(26) int[] local26 = this.method3167(arg0, 1);
			@Pc(32) int[] local32 = this.method3167(arg0, 2);
			@Pc(36) int[] local36 = local11[0];
			@Pc(40) int[] local40 = local11[1];
			@Pc(44) int[] local44 = local11[2];
			for (@Pc(46) int local46 = 0; local46 < Static104.anInt2195; local46++) {
				@Pc(58) int local58 = local26[local46] * 255 >> 12 & 0xFF;
				@Pc(67) int local67 = local32[local46] * this.anInt3633 >> 12;
				@Pc(75) int local75 = Static51.anIntArray160[local58] * local67 >> 12;
				@Pc(83) int local83 = Static23.anInt543 & arg0 + (local75 >> 12);
				@Pc(91) int local91 = local67 * Static48.anIntArray150[local58] >> 12;
				@Pc(99) int local99 = Static112.anInt2517 & local46 + (local91 >> 12);
				@Pc(105) int[][] local105 = this.method3163(0, local83);
				local36[local46] = local105[0][local99];
				local40[local46] = local105[1][local99];
				local44[local46] = local105[2][local99];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3173(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass39_41.method1114(arg0);
		if (super.aClass39_41.aBoolean66) {
			@Pc(29) int[] local29 = this.method3167(arg0, 1);
			@Pc(35) int[] local35 = this.method3167(arg0, 2);
			for (@Pc(37) int local37 = 0; local37 < Static104.anInt2195; local37++) {
				@Pc(47) int local47 = local29[local37] >> 4 & 0xFF;
				@Pc(56) int local56 = local35[local37] * this.anInt3633 >> 12;
				@Pc(64) int local64 = Static51.anIntArray160[local47] * local56 >> 12;
				@Pc(72) int local72 = Static48.anIntArray150[local47] * local56 >> 12;
				@Pc(80) int local80 = (local72 >> 12) + local37 & Static112.anInt2517;
				@Pc(88) int local88 = Static23.anInt543 & (local64 >> 12) + arg0;
				@Pc(94) int[] local94 = this.method3167(local88, 0);
				local19[local37] = local94[local80];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IILclient!mb;)V")
	@Override
	public void method3169(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt3633 = arg1.method2111() << 4;
		} else if (arg0 == 1) {
			super.aBoolean178 = arg1.method2107() == 1;
		}
	}
}
