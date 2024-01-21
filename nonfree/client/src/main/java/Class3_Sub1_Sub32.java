import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class3_Sub1_Sub32 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ta", name = "N", descriptor = "I")
	private int anInt3461;

	@OriginalMember(owner = "client!ta", name = "M", descriptor = "I")
	private int anInt3460;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method2914(@OriginalArg(1) int arg0) {
		@Pc(15) int[][] local15 = super.aClass48_39.method1402(arg0);
		if (super.aClass48_39.aBoolean87) {
			@Pc(24) int local24 = Static141.anInt3261 / this.anInt3461;
			@Pc(29) int local29 = Static141.anInt3259 / this.anInt3460;
			@Pc(48) int[][] local48;
			if (local29 > 0) {
				@Pc(38) int local38 = arg0 % local29;
				local48 = this.method2913(Static141.anInt3259 * local38 / local29, 0);
			} else {
				local48 = this.method2913(0, 0);
			}
			@Pc(60) int[] local60 = local48[0];
			@Pc(64) int[] local64 = local48[1];
			@Pc(68) int[] local68 = local15[0];
			@Pc(72) int[] local72 = local48[2];
			@Pc(76) int[] local76 = local15[1];
			@Pc(80) int[] local80 = local15[2];
			for (@Pc(82) int local82 = 0; local82 < Static141.anInt3261; local82++) {
				@Pc(99) int local99;
				if (local24 > 0) {
					@Pc(93) int local93 = local82 % local24;
					local99 = local93 * Static141.anInt3261 / local24;
				} else {
					local99 = 0;
				}
				local68[local82] = local60[local99];
				local76[local82] = local64[local99];
				local80[local82] = local72[local99];
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method2911(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_39.method2720(arg0);
		if (super.aClass82_39.aBoolean160) {
			@Pc(20) int local20 = Static141.anInt3259 / this.anInt3460;
			@Pc(25) int local25 = Static141.anInt3261 / this.anInt3461;
			@Pc(44) int[] local44;
			@Pc(34) int local34;
			if (local20 > 0) {
				local34 = arg0 % local20;
				local44 = this.method2904(0, Static141.anInt3259 * local34 / local20);
			} else {
				local44 = this.method2904(0, 0);
			}
			for (local34 = 0; local34 < Static141.anInt3261; local34++) {
				if (local25 <= 0) {
					local11[local34] = local44[0];
				} else {
					@Pc(70) int local70 = local34 % local25;
					local11[local34] = local44[Static141.anInt3261 * local70 / local25];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BILclient!rd;)V")
	@Override
	public void method2906(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt3461 = arg1.method191();
		} else if (arg0 == 1) {
			this.anInt3460 = arg1.method191();
		}
	}
}
