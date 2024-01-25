import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class6_Sub4_Sub39 extends Class6_Sub4 {

	@OriginalMember(owner = "client!wg", name = "C", descriptor = "I")
	private int anInt9504 = 1;

	@OriginalMember(owner = "client!wg", name = "D", descriptor = "I")
	private int anInt9505 = 1;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IILclient!ji;)V")
	@Override
	public void method7750(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt9504 = arg1.method6069();
		} else if (arg0 == 1) {
			this.anInt9505 = arg1.method6069();
		} else if (arg0 == 2) {
			super.aBoolean728 = arg1.method6069() == 1;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7757(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass27_41.method911(arg0);
		if (super.aClass27_41.aBoolean54) {
			@Pc(31) int local31 = this.anInt9505 + this.anInt9505 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(43) int local43 = this.anInt9504 + this.anInt9504 + 1;
			@Pc(47) int local47 = 65536 / local43;
			@Pc(50) int[][][] local50 = new int[local31][][];
			@Pc(74) int local74;
			@Pc(76) int local76;
			for (@Pc(56) int local56 = arg0 - this.anInt9505; local56 <= this.anInt9505 + arg0; local56++) {
				@Pc(66) int[][] local66 = this.method7747(Static457.anInt7873 & local56, 0);
				@Pc(70) int[][] local70 = new int[3][Static408.anInt7209];
				@Pc(72) int local72 = 0;
				local74 = 0;
				local76 = 0;
				@Pc(80) int[] local80 = local66[0];
				@Pc(84) int[] local84 = local66[1];
				@Pc(88) int[] local88 = local66[2];
				for (@Pc(92) int local92 = -this.anInt9504; local92 <= this.anInt9504; local92++) {
					@Pc(98) int local98 = local92 & Static368.anInt6505;
					local76 += local88[local98];
					local74 += local84[local98];
					local72 += local80[local98];
				}
				@Pc(125) int[] local125 = local70[0];
				@Pc(129) int[] local129 = local70[1];
				@Pc(133) int[] local133 = local70[2];
				@Pc(135) int local135 = 0;
				while (Static408.anInt7209 > local135) {
					local125[local135] = local47 * local72 >> 16;
					local129[local135] = local47 * local74 >> 16;
					local133[local135] = local76 * local47 >> 16;
					@Pc(169) int local169 = Static368.anInt6505 & local135 - this.anInt9504;
					local135++;
					local74 -= local84[local169];
					local76 -= local88[local169];
					local72 -= local80[local169];
					@Pc(196) int local196 = Static368.anInt6505 & local135 + this.anInt9504;
					local74 += local84[local196];
					local76 += local88[local196];
					local72 += local80[local196];
				}
				local50[this.anInt9505 + local56 - arg0] = local70;
			}
			@Pc(242) int[] local242 = local19[0];
			@Pc(246) int[] local246 = local19[1];
			@Pc(250) int[] local250 = local19[2];
			for (local74 = 0; local74 < Static408.anInt7209; local74++) {
				local76 = 0;
				@Pc(258) int local258 = 0;
				@Pc(260) int local260 = 0;
				for (@Pc(262) int local262 = 0; local262 < local31; local262++) {
					@Pc(268) int[][] local268 = local50[local262];
					local258 += local268[1][local74];
					local260 += local268[2][local74];
					local76 += local268[0][local74];
				}
				local242[local74] = local76 * local35 >> 16;
				local246[local74] = local35 * local258 >> 16;
				local250[local74] = local35 * local260 >> 16;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7753(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass187_41.method4558(arg0);
		if (super.aClass187_41.aBoolean374) {
			@Pc(31) int local31 = this.anInt9505 + this.anInt9505 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(43) int local43 = this.anInt9504 + this.anInt9504 + 1;
			@Pc(47) int local47 = 65536 / local43;
			@Pc(50) int[][] local50 = new int[local31][];
			@Pc(71) int local71;
			for (@Pc(56) int local56 = arg0 - this.anInt9505; local56 <= this.anInt9505 + arg0; local56++) {
				@Pc(66) int[] local66 = this.method7748(0, Static457.anInt7873 & local56);
				@Pc(69) int[] local69 = new int[Static408.anInt7209];
				local71 = 0;
				for (@Pc(75) int local75 = -this.anInt9504; local75 <= this.anInt9504; local75++) {
					local71 += local66[local75 & Static368.anInt6505];
				}
				@Pc(92) int local92 = 0;
				while (Static408.anInt7209 > local92) {
					local69[local92] = local47 * local71 >> 16;
					local71 -= local66[Static368.anInt6505 & local92 - this.anInt9504];
					local92++;
					local71 += local66[local92 + this.anInt9504 & Static368.anInt6505];
				}
				local50[this.anInt9505 + local56 - arg0] = local69;
			}
			for (@Pc(153) int local153 = 0; local153 < Static408.anInt7209; local153++) {
				@Pc(157) int local157 = 0;
				for (local71 = 0; local71 < local31; local71++) {
					local157 += local50[local71][local153];
				}
				local11[local153] = local35 * local157 >> 16;
			}
		}
		return local11;
	}
}
