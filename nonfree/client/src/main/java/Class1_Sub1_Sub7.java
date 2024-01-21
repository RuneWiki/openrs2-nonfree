import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class1_Sub1_Sub7 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ec", name = "Y", descriptor = "I")
	private int anInt1245;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3008(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass80_41.method2742(arg0);
		if (super.aClass80_41.aBoolean288) {
			@Pc(26) int[] local26 = this.method3012(1, arg0);
			@Pc(32) int[] local32 = this.method3012(2, arg0);
			for (@Pc(34) int local34 = 0; local34 < Static65.anInt1933; local34++) {
				@Pc(44) int local44 = local26[local34] >> 4 & 0xFF;
				@Pc(53) int local53 = this.anInt1245 * local32[local34] >> 12;
				@Pc(61) int local61 = local53 * Static3.anIntArray6[local44] >> 12;
				@Pc(69) int local69 = Static45.anIntArray153[local44] * local53 >> 12;
				@Pc(77) int local77 = Static64.anInt1922 & (local61 >> 12) + local34;
				@Pc(85) int local85 = Static93.anInt2716 & (local69 >> 12) + arg0;
				@Pc(91) int[] local91 = this.method3012(0, local85);
				local16[local34] = local91[local77];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V")
	@Override
	public void method3009() {
		Static68.method1457();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IILclient!ce;)V")
	@Override
	public void method3011(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt1245 = arg1.method1642() << 4;
		} else if (arg0 == 1) {
			super.aBoolean319 = arg1.method1607() == 1;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3006(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass40_41.method1589(arg0);
		if (super.aClass40_41.aBoolean168) {
			@Pc(26) int[] local26 = this.method3012(1, arg0);
			@Pc(32) int[] local32 = this.method3012(2, arg0);
			@Pc(36) int[] local36 = local16[2];
			@Pc(40) int[] local40 = local16[0];
			@Pc(44) int[] local44 = local16[1];
			for (@Pc(46) int local46 = 0; local46 < Static65.anInt1933; local46++) {
				@Pc(58) int local58 = local26[local46] * 255 >> 12 & 0xFF;
				@Pc(67) int local67 = this.anInt1245 * local32[local46] >> 12;
				@Pc(75) int local75 = local67 * Static3.anIntArray6[local58] >> 12;
				@Pc(83) int local83 = Static45.anIntArray153[local58] * local67 >> 12;
				@Pc(91) int local91 = (local75 >> 12) + local46 & Static64.anInt1922;
				@Pc(99) int local99 = Static93.anInt2716 & (local83 >> 12) + arg0;
				@Pc(105) int[][] local105 = this.method3013(local99, 0);
				local40[local46] = local105[0][local91];
				local44[local46] = local105[1][local91];
				local36[local46] = local105[2][local91];
			}
		}
		return local16;
	}
}
