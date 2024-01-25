import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wla")
public final class Class2_Sub11_Sub39 extends Class2_Sub11 {

	@OriginalMember(owner = "client!wla", name = "D", descriptor = "I")
	private int anInt10933 = 1;

	@OriginalMember(owner = "client!wla", name = "G", descriptor = "I")
	private int anInt10937 = 1;

	@OriginalMember(owner = "client!wla", name = "<init>", descriptor = "()V")
	public Class2_Sub11_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wla", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9531(@OriginalArg(0) int arg0) {
		@Pc(21) int[] local21 = super.aClass174_41.method3748(arg0, 1);
		if (super.aClass174_41.aBoolean369) {
			@Pc(33) int local33 = this.anInt10933 + this.anInt10933 + 1;
			@Pc(37) int local37 = 65536 / local33;
			@Pc(46) int local46 = this.anInt10937 + this.anInt10937 + 1;
			@Pc(50) int local50 = 65536 / local46;
			@Pc(53) int[][] local53 = new int[local33][];
			@Pc(74) int local74;
			for (@Pc(59) int local59 = arg0 - this.anInt10933; local59 <= arg0 + this.anInt10933; local59++) {
				@Pc(69) int[] local69 = this.method9540(local59 & Static332.anInt5074, 0);
				@Pc(72) int[] local72 = new int[Static301.anInt10214];
				local74 = 0;
				for (@Pc(78) int local78 = -this.anInt10937; local78 <= this.anInt10937; local78++) {
					local74 += local69[Static78.anInt1356 & local78];
				}
				@Pc(95) int local95 = 0;
				while (Static301.anInt10214 > local95) {
					local72[local95] = local74 * local50 >> 16;
					local74 -= local69[local95 - this.anInt10937 & Static78.anInt1356];
					local95++;
					local74 += local69[this.anInt10937 + local95 & Static78.anInt1356];
				}
				local53[this.anInt10933 + local59 - arg0] = local72;
			}
			for (@Pc(160) int local160 = 0; local160 < Static301.anInt10214; local160++) {
				@Pc(164) int local164 = 0;
				for (local74 = 0; local74 < local33; local74++) {
					local164 += local53[local74][local160];
				}
				local21[local160] = local37 * local164 >> 16;
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!wla", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9533(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass370_41.method8744(arg0);
		if (super.aClass370_41.aBoolean846) {
			@Pc(23) int local23 = this.anInt10933 + this.anInt10933 + 1;
			@Pc(27) int local27 = 65536 / local23;
			@Pc(36) int local36 = this.anInt10937 + this.anInt10937 + 1;
			@Pc(40) int local40 = 65536 / local36;
			@Pc(43) int[][][] local43 = new int[local23][][];
			@Pc(69) int local69;
			@Pc(71) int local71;
			for (@Pc(49) int local49 = arg0 - this.anInt10933; local49 <= arg0 + this.anInt10933; local49++) {
				@Pc(61) int[][] local61 = this.method9538(0, local49 & Static332.anInt5074);
				@Pc(65) int[][] local65 = new int[3][Static301.anInt10214];
				@Pc(67) int local67 = 0;
				local69 = 0;
				local71 = 0;
				@Pc(75) int[] local75 = local61[0];
				@Pc(79) int[] local79 = local61[1];
				@Pc(83) int[] local83 = local61[2];
				for (@Pc(87) int local87 = -this.anInt10937; local87 <= this.anInt10937; local87++) {
					@Pc(95) int local95 = local87 & Static78.anInt1356;
					local67 += local75[local95];
					local69 += local79[local95];
					local71 += local83[local95];
				}
				@Pc(122) int[] local122 = local65[0];
				@Pc(126) int[] local126 = local65[1];
				@Pc(130) int[] local130 = local65[2];
				@Pc(134) int local134 = 0;
				while (local134 < Static301.anInt10214) {
					local122[local134] = local40 * local67 >> 16;
					local126[local134] = local40 * local69 >> 16;
					local130[local134] = local40 * local71 >> 16;
					@Pc(170) int local170 = Static78.anInt1356 & local134 - this.anInt10937;
					local134++;
					local67 -= local75[local170];
					local71 -= local83[local170];
					local69 -= local79[local170];
					@Pc(197) int local197 = local134 + this.anInt10937 & Static78.anInt1356;
					local69 += local79[local197];
					local67 += local75[local197];
					local71 += local83[local197];
				}
				local43[local49 + this.anInt10933 - arg0] = local65;
			}
			@Pc(245) int[] local245 = local11[0];
			@Pc(249) int[] local249 = local11[1];
			@Pc(255) int[] local255 = local11[2];
			for (local69 = 0; local69 < Static301.anInt10214; local69++) {
				local71 = 0;
				@Pc(263) int local263 = 0;
				@Pc(265) int local265 = 0;
				for (@Pc(267) int local267 = 0; local267 < local23; local267++) {
					@Pc(273) int[][] local273 = local43[local267];
					local71 += local273[0][local69];
					local265 += local273[2][local69];
					local263 += local273[1][local69];
				}
				local245[local69] = local71 * local27 >> 16;
				local249[local69] = local263 * local27 >> 16;
				local255[local69] = local265 * local27 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wla", name = "a", descriptor = "(ILclient!et;Z)V")
	@Override
	public void method9532(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt10937 = arg1.method8581(-17416);
		} else if (arg0 == 1) {
			this.anInt10933 = arg1.method8581(-17416);
		} else if (arg0 == 2) {
			super.aBoolean936 = arg1.method8581(-17416) == 1;
		}
	}
}
