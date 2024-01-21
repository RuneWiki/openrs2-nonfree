import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class2_Sub1_Sub5 extends Class2_Sub1 {

	@OriginalMember(owner = "client!cd", name = "V", descriptor = "I")
	private int anInt504;

	@OriginalMember(owner = "client!cd", name = "S", descriptor = "I")
	private int anInt502;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method2792(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass66_39.method1971(arg0);
		if (super.aClass66_39.aBoolean123) {
			@Pc(24) int local24 = Static120.anInt2812 / this.anInt504;
			@Pc(29) int local29 = Static11.anInt283 / this.anInt502;
			@Pc(40) int[][] local40;
			if (local29 <= 0) {
				local40 = this.method2794(0, 0);
			} else {
				@Pc(46) int local46 = arg0 % local29;
				local40 = this.method2794(0, Static11.anInt283 * local46 / local29);
			}
			@Pc(60) int[] local60 = local40[0];
			@Pc(64) int[] local64 = local40[2];
			@Pc(68) int[] local68 = local40[1];
			@Pc(72) int[] local72 = local7[0];
			@Pc(76) int[] local76 = local7[1];
			@Pc(80) int[] local80 = local7[2];
			for (@Pc(82) int local82 = 0; local82 < Static120.anInt2812; local82++) {
				@Pc(99) int local99;
				if (local24 > 0) {
					@Pc(93) int local93 = local82 % local24;
					local99 = local93 * Static120.anInt2812 / local24;
				} else {
					local99 = 0;
				}
				local72[local82] = local60[local99];
				local76[local82] = local68[local99];
				local80[local82] = local64[local99];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method2801(@OriginalArg(1) int arg0) {
		@Pc(12) int[] local12 = super.aClass81_39.method2606(arg0);
		if (super.aClass81_39.aBoolean153) {
			@Pc(21) int local21 = Static120.anInt2812 / this.anInt504;
			@Pc(26) int local26 = Static11.anInt283 / this.anInt502;
			@Pc(37) int[] local37;
			@Pc(43) int local43;
			if (local26 <= 0) {
				local37 = this.method2796(0, 0);
			} else {
				local43 = arg0 % local26;
				local37 = this.method2796(0, local43 * Static11.anInt283 / local26);
			}
			for (local43 = 0; local43 < Static120.anInt2812; local43++) {
				if (local21 > 0) {
					@Pc(66) int local66 = local43 % local21;
					local12[local43] = local37[local66 * Static120.anInt2812 / local21];
				} else {
					local12[local43] = local37[0];
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!me;IB)V")
	@Override
	public void method2799(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt504 = arg0.method1402();
		} else if (arg1 == 1) {
			this.anInt502 = arg0.method1402();
		}
	}
}
