import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class1_Sub1_Sub25 extends Class1_Sub1 {

	@OriginalMember(owner = "client!pa", name = "Z", descriptor = "I")
	private int anInt3325 = 1;

	@OriginalMember(owner = "client!pa", name = "kb", descriptor = "I")
	private int anInt3333 = 1;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub25() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3729(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass17_41.method474(arg0);
		if (super.aClass17_41.aBoolean24) {
			@Pc(29) int local29 = this.anInt3325 + this.anInt3325 + 1;
			@Pc(33) int local33 = 65536 / local29;
			@Pc(42) int local42 = this.anInt3333 + this.anInt3333 + 1;
			@Pc(45) int[][] local45 = new int[local29][];
			@Pc(49) int local49 = 65536 / local42;
			@Pc(70) int local70;
			for (@Pc(55) int local55 = arg0 - this.anInt3325; local55 <= arg0 + this.anInt3325; local55++) {
				@Pc(65) int[] local65 = this.method3733(Static148.anInt3213 & local55, 0);
				@Pc(68) int[] local68 = new int[Static157.anInt3431];
				local70 = 0;
				for (@Pc(74) int local74 = -this.anInt3333; local74 <= this.anInt3333; local74++) {
					local70 += local65[Static74.anInt1679 & local74];
				}
				@Pc(91) int local91 = 0;
				while (Static157.anInt3431 > local91) {
					local68[local91] = local49 * local70 >> 16;
					local70 -= local65[local91 - this.anInt3333 & Static74.anInt1679];
					local91++;
					local70 += local65[Static74.anInt1679 & this.anInt3333 + local91];
				}
				local45[this.anInt3325 + local55 - arg0] = local68;
			}
			for (@Pc(151) int local151 = 0; local151 < Static157.anInt3431; local151++) {
				@Pc(155) int local155 = 0;
				for (local70 = 0; local70 < local29; local70++) {
					local155 += local45[local70][local151];
				}
				local16[local151] = local33 * local155 >> 16;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!k;BI)V")
	@Override
	public void method3738(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3333 = arg0.method3793();
		} else if (arg1 == 1) {
			this.anInt3325 = arg0.method3793();
		} else if (arg1 == 2) {
			super.aBoolean213 = arg0.method3793() == 1;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3735(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass75_41.method2410(arg0);
		if (super.aClass75_41.aBoolean134) {
			@Pc(31) int local31 = this.anInt3325 + this.anInt3325 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(43) int local43 = this.anInt3333 + this.anInt3333 + 1;
			@Pc(47) int local47 = 65536 / local43;
			@Pc(50) int[][][] local50 = new int[local31][][];
			@Pc(74) int local74;
			@Pc(76) int local76;
			for (@Pc(56) int local56 = arg0 - this.anInt3325; local56 <= this.anInt3325 + arg0; local56++) {
				@Pc(66) int[][] local66 = this.method3737(0, Static148.anInt3213 & local56);
				@Pc(70) int[][] local70 = new int[3][Static157.anInt3431];
				@Pc(72) int local72 = 0;
				local74 = 0;
				local76 = 0;
				@Pc(80) int[] local80 = local66[0];
				@Pc(84) int[] local84 = local66[1];
				@Pc(88) int[] local88 = local66[2];
				for (@Pc(92) int local92 = -this.anInt3333; local92 <= this.anInt3333; local92++) {
					@Pc(98) int local98 = Static74.anInt1679 & local92;
					local74 += local84[local98];
					local76 += local88[local98];
					local72 += local80[local98];
				}
				@Pc(125) int[] local125 = local70[0];
				@Pc(129) int[] local129 = local70[1];
				@Pc(133) int[] local133 = local70[2];
				@Pc(135) int local135 = 0;
				while (Static157.anInt3431 > local135) {
					local125[local135] = local72 * local47 >> 16;
					local129[local135] = local74 * local47 >> 16;
					local133[local135] = local76 * local47 >> 16;
					@Pc(169) int local169 = local135 - this.anInt3333 & Static74.anInt1679;
					local76 -= local88[local169];
					local72 -= local80[local169];
					local135++;
					local74 -= local84[local169];
					@Pc(195) int local195 = this.anInt3333 + local135 & Static74.anInt1679;
					local76 += local88[local195];
					local74 += local84[local195];
					local72 += local80[local195];
				}
				local50[this.anInt3325 + local56 - arg0] = local70;
			}
			@Pc(240) int[] local240 = local19[0];
			@Pc(244) int[] local244 = local19[1];
			@Pc(248) int[] local248 = local19[2];
			for (local74 = 0; local74 < Static157.anInt3431; local74++) {
				local76 = 0;
				@Pc(256) int local256 = 0;
				@Pc(258) int local258 = 0;
				for (@Pc(260) int local260 = 0; local260 < local31; local260++) {
					@Pc(266) int[][] local266 = local50[local260];
					local258 += local266[1][local74];
					local256 += local266[2][local74];
					local76 += local266[0][local74];
				}
				local240[local74] = local35 * local76 >> 16;
				local244[local74] = local35 * local258 >> 16;
				local248[local74] = local35 * local256 >> 16;
			}
		}
		return local19;
	}
}
