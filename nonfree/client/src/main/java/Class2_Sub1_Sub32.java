import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class2_Sub1_Sub32 extends Class2_Sub1 {

	@OriginalMember(owner = "client!re", name = "V", descriptor = "I")
	private int anInt3380;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method2792(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass66_39.method1971(arg0);
		if (super.aClass66_39.aBoolean123) {
			@Pc(26) int[] local26 = this.method2796(1, arg0);
			@Pc(32) int[] local32 = this.method2796(2, arg0);
			@Pc(36) int[] local36 = local16[2];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[0];
			for (@Pc(46) int local46 = 0; local46 < Static120.anInt2812; local46++) {
				@Pc(58) int local58 = local26[local46] * 255 >> 12 & 0xFF;
				@Pc(67) int local67 = this.anInt3380 * local32[local46] >> 12;
				@Pc(75) int local75 = local67 * Static159.anIntArray376[local58] >> 12;
				@Pc(83) int local83 = Static174.anIntArray388[local58] * local67 >> 12;
				@Pc(91) int local91 = Static49.anInt1370 & (local75 >> 12) + local46;
				@Pc(99) int local99 = arg0 + (local83 >> 12) & Static180.anInt4192;
				@Pc(105) int[][] local105 = this.method2794(0, local99);
				local44[local46] = local105[0][local91];
				local40[local46] = local105[1][local91];
				local36[local46] = local105[2][local91];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!me;IB)V")
	@Override
	public void method2799(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3380 = arg0.method1397() << 4;
		} else if (arg1 == 1) {
			super.aBoolean175 = arg0.method1402() == 1;
		}
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V")
	@Override
	public void method2789() {
		Static51.method913();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method2801(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass81_39.method2606(arg0);
		if (super.aClass81_39.aBoolean153) {
			@Pc(26) int[] local26 = this.method2796(1, arg0);
			@Pc(32) int[] local32 = this.method2796(2, arg0);
			for (@Pc(34) int local34 = 0; local34 < Static120.anInt2812; local34++) {
				@Pc(44) int local44 = local26[local34] >> 4 & 0xFF;
				@Pc(53) int local53 = local32[local34] * this.anInt3380 >> 12;
				@Pc(61) int local61 = local53 * Static159.anIntArray376[local44] >> 12;
				@Pc(70) int local70 = local34 + (local61 >> 12) & Static49.anInt1370;
				@Pc(78) int local78 = local53 * Static174.anIntArray388[local44] >> 12;
				@Pc(86) int local86 = Static180.anInt4192 & (local78 >> 12) + arg0;
				@Pc(92) int[] local92 = this.method2796(0, local86);
				local11[local34] = local92[local70];
			}
		}
		return local11;
	}
}
