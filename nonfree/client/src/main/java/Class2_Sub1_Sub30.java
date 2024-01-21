import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class2_Sub1_Sub30 extends Class2_Sub1 {

	@OriginalMember(owner = "client!rc", name = "bb", descriptor = "I")
	private int anInt3342;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method2982(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass11_39.method511(arg0);
		if (super.aClass11_39.aBoolean37) {
			@Pc(26) int[] local26 = this.method2980(1, arg0);
			@Pc(32) int[] local32 = this.method2980(2, arg0);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			for (@Pc(46) int local46 = 0; local46 < Static129.anInt3118; local46++) {
				@Pc(58) int local58 = local26[local46] * 255 >> 12 & 0xFF;
				@Pc(67) int local67 = local32[local46] * this.anInt3342 >> 12;
				@Pc(75) int local75 = local67 * Static108.anIntArray424[local58] >> 12;
				@Pc(83) int local83 = local67 * Static130.anIntArray465[local58] >> 12;
				@Pc(91) int local91 = (local75 >> 12) + local46 & Static8.anInt230;
				@Pc(99) int local99 = Static78.anInt2044 & (local83 >> 12) + arg0;
				@Pc(105) int[][] local105 = this.method2991(local99, 0);
				local36[local46] = local105[0][local91];
				local40[local46] = local105[1][local91];
				local44[local46] = local105[2][local91];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BLclient!oa;I)V")
	@Override
	public void method2987(@OriginalArg(1) Class2_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3342 = arg0.method2353() << 4;
		} else if (arg1 == 1) {
			super.aBoolean183 = arg0.method2387() == 1;
		}
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(Z)V")
	@Override
	public void method2992() {
		Static128.method2196();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method2986(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass3_39.method62(arg0);
		if (super.aClass3_39.aBoolean5) {
			@Pc(26) int[] local26 = this.method2980(1, arg0);
			@Pc(32) int[] local32 = this.method2980(2, arg0);
			for (@Pc(34) int local34 = 0; local34 < Static129.anInt3118; local34++) {
				@Pc(44) int local44 = local26[local34] >> 4 & 0xFF;
				@Pc(53) int local53 = this.anInt3342 * local32[local34] >> 12;
				@Pc(61) int local61 = local53 * Static108.anIntArray424[local44] >> 12;
				@Pc(69) int local69 = Static130.anIntArray465[local44] * local53 >> 12;
				@Pc(77) int local77 = Static8.anInt230 & (local61 >> 12) + local34;
				@Pc(86) int local86 = arg0 + (local69 >> 12) & Static78.anInt2044;
				@Pc(92) int[] local92 = this.method2980(0, local86);
				local16[local34] = local92[local77];
			}
		}
		return local16;
	}
}
