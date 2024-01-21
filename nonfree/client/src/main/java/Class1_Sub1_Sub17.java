import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class1_Sub1_Sub17 extends Class1_Sub1 {

	@OriginalMember(owner = "client!jf", name = "jb", descriptor = "I")
	private int anInt2101 = 1;

	@OriginalMember(owner = "client!jf", name = "mb", descriptor = "I")
	private int anInt2104 = 1;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3313(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass39_41.method1383(arg0);
		if (super.aClass39_41.aBoolean82) {
			@Pc(29) int local29 = this.anInt2101 + this.anInt2101 + 1;
			@Pc(33) int local33 = 65536 / local29;
			@Pc(36) int[][][] local36 = new int[local29][][];
			@Pc(44) int local44 = this.anInt2104 + this.anInt2104 + 1;
			@Pc(48) int local48 = 65536 / local44;
			@Pc(76) int local76;
			@Pc(78) int local78;
			for (@Pc(54) int local54 = arg0 - this.anInt2101; local54 <= this.anInt2101 + arg0; local54++) {
				@Pc(64) int[][] local64 = this.method3307(0, local54 & Static134.anInt3338);
				@Pc(66) int local66 = 0;
				@Pc(70) int[][] local70 = new int[3][Static176.anInt3921];
				@Pc(74) int[] local74 = local64[0];
				local76 = 0;
				local78 = 0;
				@Pc(82) int[] local82 = local64[1];
				@Pc(86) int[] local86 = local64[2];
				for (@Pc(90) int local90 = -this.anInt2104; local90 <= this.anInt2104; local90++) {
					@Pc(96) int local96 = Static70.anInt1730 & local90;
					local76 += local82[local96];
					local78 += local86[local96];
					local66 += local74[local96];
				}
				@Pc(127) int[] local127 = local70[0];
				@Pc(131) int[] local131 = local70[1];
				@Pc(135) int[] local135 = local70[2];
				@Pc(137) int local137 = 0;
				while (Static176.anInt3921 > local137) {
					local127[local137] = local48 * local66 >> 16;
					local131[local137] = local48 * local76 >> 16;
					local135[local137] = local48 * local78 >> 16;
					@Pc(171) int local171 = local137 - this.anInt2104 & Static70.anInt1730;
					local78 -= local86[local171];
					local137++;
					local66 -= local74[local171];
					local76 -= local82[local171];
					@Pc(197) int local197 = Static70.anInt1730 & this.anInt2104 + local137;
					local76 += local82[local197];
					local78 += local86[local197];
					local66 += local74[local197];
				}
				local36[local54 + this.anInt2101 - arg0] = local70;
			}
			@Pc(248) int[] local248 = local7[2];
			@Pc(252) int[] local252 = local7[0];
			@Pc(256) int[] local256 = local7[1];
			for (local76 = 0; local76 < Static176.anInt3921; local76++) {
				@Pc(262) int local262 = 0;
				@Pc(264) int local264 = 0;
				local78 = 0;
				for (@Pc(268) int local268 = 0; local268 < local29; local268++) {
					@Pc(274) int[][] local274 = local36[local268];
					local78 += local274[0][local76];
					local262 += local274[1][local76];
					local264 += local274[2][local76];
				}
				local252[local76] = local33 * local78 >> 16;
				local256[local76] = local33 * local262 >> 16;
				local248[local76] = local33 * local264 >> 16;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3310(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = super.aClass80_41.method2876(arg0);
		if (super.aClass80_41.aBoolean151) {
			@Pc(25) int local25 = this.anInt2101 + this.anInt2101 + 1;
			@Pc(29) int local29 = 65536 / local25;
			@Pc(37) int local37 = this.anInt2104 + this.anInt2104 + 1;
			@Pc(41) int local41 = 65536 / local37;
			@Pc(44) int[][] local44 = new int[local25][];
			@Pc(65) int local65;
			for (@Pc(50) int local50 = arg0 - this.anInt2101; local50 <= this.anInt2101 + arg0; local50++) {
				@Pc(60) int[] local60 = this.method3303(Static134.anInt3338 & local50, 0);
				@Pc(63) int[] local63 = new int[Static176.anInt3921];
				local65 = 0;
				for (@Pc(69) int local69 = -this.anInt2104; local69 <= this.anInt2104; local69++) {
					local65 += local60[local69 & Static70.anInt1730];
				}
				@Pc(90) int local90 = 0;
				while (local90 < Static176.anInt3921) {
					local63[local90] = local65 * local41 >> 16;
					local65 -= local60[local90 - this.anInt2104 & Static70.anInt1730];
					local90++;
					local65 += local60[Static70.anInt1730 & local90 + this.anInt2104];
				}
				local44[local50 + this.anInt2101 - arg0] = local63;
			}
			for (@Pc(146) int local146 = 0; local146 < Static176.anInt3921; local146++) {
				@Pc(150) int local150 = 0;
				for (local65 = 0; local65 < local25; local65++) {
					local150 += local44[local65][local146];
				}
				local13[local146] = local150 * local29 >> 16;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILclient!wa;)V")
	@Override
	public void method3312(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt2104 = arg1.method1738();
		} else if (arg0 == 1) {
			this.anInt2101 = arg1.method1738();
		} else if (arg0 == 2) {
			super.aBoolean185 = arg1.method1738() == 1;
		}
	}
}
