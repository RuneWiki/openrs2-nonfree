import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class1_Sub8_Sub35 extends Class1_Sub8 {

	@OriginalMember(owner = "client!tj", name = "N", descriptor = "I")
	private int anInt7100 = 1;

	@OriginalMember(owner = "client!tj", name = "S", descriptor = "I")
	private int anInt7101 = 1;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V")
	public Class1_Sub8_Sub35() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6031(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass225_41.method5085(arg0);
		if (super.aClass225_41.aBoolean421) {
			@Pc(31) int local31 = this.anInt7101 + this.anInt7101 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(43) int local43 = this.anInt7100 + this.anInt7100 + 1;
			@Pc(47) int local47 = 65536 / local43;
			@Pc(50) int[][] local50 = new int[local31][];
			@Pc(70) int local70;
			for (@Pc(55) int local55 = arg0 - this.anInt7101; local55 <= this.anInt7101 + arg0; local55++) {
				@Pc(65) int[] local65 = this.method6037(0, local55 & Static443.anInt7904);
				@Pc(68) int[] local68 = new int[Static18.anInt439];
				local70 = 0;
				for (@Pc(74) int local74 = -this.anInt7100; local74 <= this.anInt7100; local74++) {
					local70 += local65[local74 & Static283.anInt5397];
				}
				@Pc(95) int local95 = 0;
				while (local95 < Static18.anInt439) {
					local68[local95] = local47 * local70 >> 16;
					local70 -= local65[Static283.anInt5397 & local95 - this.anInt7100];
					local95++;
					local70 += local65[Static283.anInt5397 & local95 + this.anInt7100];
				}
				local50[this.anInt7101 + local55 - arg0] = local68;
			}
			for (@Pc(156) int local156 = 0; local156 < Static18.anInt439; local156++) {
				@Pc(160) int local160 = 0;
				for (local70 = 0; local70 < local31; local70++) {
					local160 += local50[local70][local156];
				}
				local19[local156] = local160 * local35 >> 16;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6030(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass130_41.method3108(arg0);
		if (super.aClass130_41.aBoolean246) {
			@Pc(32) int local32 = this.anInt7101 + this.anInt7101 + 1;
			@Pc(36) int local36 = 65536 / local32;
			@Pc(44) int local44 = this.anInt7100 + this.anInt7100 + 1;
			@Pc(48) int local48 = 65536 / local44;
			@Pc(51) int[][][] local51 = new int[local32][][];
			@Pc(75) int local75;
			@Pc(77) int local77;
			for (@Pc(57) int local57 = arg0 - this.anInt7101; local57 <= arg0 + this.anInt7101; local57++) {
				@Pc(67) int[][] local67 = this.method6035(local57 & Static443.anInt7904, 0);
				@Pc(71) int[][] local71 = new int[3][Static18.anInt439];
				@Pc(73) int local73 = 0;
				local75 = 0;
				local77 = 0;
				@Pc(81) int[] local81 = local67[0];
				@Pc(85) int[] local85 = local67[1];
				@Pc(89) int[] local89 = local67[2];
				for (@Pc(93) int local93 = -this.anInt7100; local93 <= this.anInt7100; local93++) {
					@Pc(99) int local99 = local93 & Static283.anInt5397;
					local75 += local85[local99];
					local77 += local89[local99];
					local73 += local81[local99];
				}
				@Pc(130) int[] local130 = local71[0];
				@Pc(134) int[] local134 = local71[1];
				@Pc(138) int[] local138 = local71[2];
				@Pc(140) int local140 = 0;
				while (local140 < Static18.anInt439) {
					local130[local140] = local48 * local73 >> 16;
					local134[local140] = local75 * local48 >> 16;
					local138[local140] = local77 * local48 >> 16;
					@Pc(173) int local173 = Static283.anInt5397 & local140 - this.anInt7100;
					local75 -= local85[local173];
					local140++;
					local77 -= local89[local173];
					local73 -= local81[local173];
					@Pc(200) int local200 = local140 + this.anInt7100 & Static283.anInt5397;
					local77 += local89[local200];
					local75 += local85[local200];
					local73 += local81[local200];
				}
				local51[local57 + this.anInt7101 - arg0] = local71;
			}
			@Pc(244) int[] local244 = local11[0];
			@Pc(248) int[] local248 = local11[1];
			@Pc(252) int[] local252 = local11[2];
			for (local75 = 0; local75 < Static18.anInt439; local75++) {
				local77 = 0;
				@Pc(260) int local260 = 0;
				@Pc(262) int local262 = 0;
				for (@Pc(264) int local264 = 0; local264 < local32; local264++) {
					@Pc(270) int[][] local270 = local51[local264];
					local260 += local270[1][local75];
					local77 += local270[0][local75];
					local262 += local270[2][local75];
				}
				local244[local75] = local36 * local77 >> 16;
				local248[local75] = local36 * local260 >> 16;
				local252[local75] = local36 * local262 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZILclient!ia;)V")
	@Override
	public void method6038(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt7100 = arg1.method1171();
		} else if (arg0 == 1) {
			this.anInt7101 = arg1.method1171();
		} else if (arg0 == 2) {
			super.aBoolean508 = arg1.method1171() == 1;
		}
	}
}
