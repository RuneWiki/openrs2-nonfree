import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class4_Sub3_Sub2 extends Class4_Sub3 {

	@OriginalMember(owner = "client!bm", name = "H", descriptor = "I")
	private int anInt516 = 4;

	@OriginalMember(owner = "client!bm", name = "W", descriptor = "I")
	private int anInt526 = 4;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub2() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6335(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass93_41.method2622(arg0);
		if (super.aClass93_41.aBoolean189) {
			@Pc(27) int local27 = Static304.anInt5637 / this.anInt526;
			@Pc(32) int local32 = Static191.anInt3822 / this.anInt516;
			@Pc(40) int[][] local40;
			if (local32 <= 0) {
				local40 = this.method6331(0, 0);
			} else {
				@Pc(46) int local46 = arg0 % local32;
				local40 = this.method6331(local46 * Static191.anInt3822 / local32, 0);
			}
			@Pc(60) int[] local60 = local40[0];
			@Pc(64) int[] local64 = local40[1];
			@Pc(68) int[] local68 = local40[2];
			@Pc(72) int[] local72 = local18[0];
			@Pc(76) int[] local76 = local18[1];
			@Pc(80) int[] local80 = local18[2];
			for (@Pc(82) int local82 = 0; local82 < Static304.anInt5637; local82++) {
				@Pc(99) int local99;
				if (local27 > 0) {
					@Pc(93) int local93 = local82 % local27;
					local99 = local93 * Static304.anInt5637 / local27;
				} else {
					local99 = 0;
				}
				local72[local82] = local60[local99];
				local76[local82] = local64[local99];
				local80[local82] = local68[local99];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6339(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass157_41.method4027(arg0);
		if (super.aClass157_41.aBoolean315) {
			@Pc(22) int local22 = Static304.anInt5637 / this.anInt526;
			@Pc(27) int local27 = Static191.anInt3822 / this.anInt516;
			@Pc(38) int[] local38;
			@Pc(44) int local44;
			if (local27 <= 0) {
				local38 = this.method6337(0, 0);
			} else {
				local44 = arg0 % local27;
				local38 = this.method6337(0, Static191.anInt3822 * local44 / local27);
			}
			for (local44 = 0; local44 < Static304.anInt5637; local44++) {
				if (local22 <= 0) {
					local13[local44] = local38[0];
				} else {
					@Pc(72) int local72 = local44 % local22;
					local13[local44] = local38[local72 * Static304.anInt5637 / local22];
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILclient!wn;I)V")
	@Override
	public void method6340(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt526 = arg1.method4614();
		} else if (arg0 == 1) {
			this.anInt516 = arg1.method4614();
		}
	}
}
