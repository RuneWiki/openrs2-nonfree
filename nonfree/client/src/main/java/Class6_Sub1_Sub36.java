import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vda")
public final class Class6_Sub1_Sub36 extends Class6_Sub1 {

	@OriginalMember(owner = "client!vda", name = "H", descriptor = "I")
	private int anInt10202 = 1;

	@OriginalMember(owner = "client!vda", name = "L", descriptor = "I")
	private int anInt10206 = 1;

	@OriginalMember(owner = "client!vda", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub36() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method8954(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass135_41.method3057(arg0);
		if (super.aClass135_41.aBoolean210) {
			@Pc(29) int local29 = this.anInt10206 + this.anInt10206 + 1;
			@Pc(33) int local33 = 65536 / local29;
			@Pc(42) int local42 = this.anInt10202 + this.anInt10202 + 1;
			@Pc(46) int local46 = 65536 / local42;
			@Pc(49) int[][] local49 = new int[local29][];
			@Pc(70) int local70;
			for (@Pc(55) int local55 = arg0 - this.anInt10206; local55 <= this.anInt10206 + arg0; local55++) {
				@Pc(65) int[] local65 = this.method8963(0, local55 & Static476.anInt8174);
				@Pc(68) int[] local68 = new int[Static479.anInt8231];
				local70 = 0;
				for (@Pc(74) int local74 = -this.anInt10202; local74 <= this.anInt10202; local74++) {
					local70 += local65[Static413.anInt7225 & local74];
				}
				@Pc(95) int local95 = 0;
				while (Static479.anInt8231 > local95) {
					local68[local95] = local70 * local46 >> 16;
					local70 -= local65[local95 - this.anInt10202 & Static413.anInt7225];
					local95++;
					local70 += local65[local95 + this.anInt10202 & Static413.anInt7225];
				}
				local49[local55 + this.anInt10206 - arg0] = local68;
			}
			for (@Pc(155) int local155 = 0; local155 < Static479.anInt8231; local155++) {
				@Pc(159) int local159 = 0;
				for (local70 = 0; local70 < local29; local70++) {
					local159 += local49[local70][local155];
				}
				local11[local155] = local159 * local33 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8957(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass54_41.method1386(arg0);
		if (super.aClass54_41.aBoolean81) {
			@Pc(31) int local31 = this.anInt10206 + this.anInt10206 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(43) int local43 = this.anInt10202 + this.anInt10202 + 1;
			@Pc(47) int local47 = 65536 / local43;
			@Pc(50) int[][][] local50 = new int[local31][][];
			@Pc(74) int local74;
			@Pc(76) int local76;
			for (@Pc(56) int local56 = arg0 - this.anInt10206; local56 <= this.anInt10206 + arg0; local56++) {
				@Pc(66) int[][] local66 = this.method8959(local56 & Static476.anInt8174, 0);
				@Pc(70) int[][] local70 = new int[3][Static479.anInt8231];
				@Pc(72) int local72 = 0;
				local74 = 0;
				local76 = 0;
				@Pc(80) int[] local80 = local66[0];
				@Pc(84) int[] local84 = local66[1];
				@Pc(88) int[] local88 = local66[2];
				for (@Pc(92) int local92 = -this.anInt10202; local92 <= this.anInt10202; local92++) {
					@Pc(98) int local98 = local92 & Static413.anInt7225;
					local76 += local88[local98];
					local74 += local84[local98];
					local72 += local80[local98];
				}
				@Pc(125) int[] local125 = local70[0];
				@Pc(129) int[] local129 = local70[1];
				@Pc(133) int[] local133 = local70[2];
				@Pc(135) int local135 = 0;
				while (local135 < Static479.anInt8231) {
					local125[local135] = local72 * local47 >> 16;
					local129[local135] = local47 * local74 >> 16;
					local133[local135] = local47 * local76 >> 16;
					@Pc(169) int local169 = local135 - this.anInt10202 & Static413.anInt7225;
					local135++;
					local74 -= local84[local169];
					local76 -= local88[local169];
					local72 -= local80[local169];
					@Pc(195) int local195 = local135 + this.anInt10202 & Static413.anInt7225;
					local72 += local80[local195];
					local74 += local84[local195];
					local76 += local88[local195];
				}
				local50[this.anInt10206 + local56 - arg0] = local70;
			}
			@Pc(237) int[] local237 = local18[0];
			@Pc(241) int[] local241 = local18[1];
			@Pc(245) int[] local245 = local18[2];
			for (local74 = 0; local74 < Static479.anInt8231; local74++) {
				local76 = 0;
				@Pc(253) int local253 = 0;
				@Pc(255) int local255 = 0;
				for (@Pc(257) int local257 = 0; local257 < local31; local257++) {
					@Pc(263) int[][] local263 = local50[local257];
					local255 += local263[2][local74];
					local76 += local263[0][local74];
					local253 += local263[1][local74];
				}
				local237[local74] = local35 * local76 >> 16;
				local241[local74] = local35 * local253 >> 16;
				local245[local74] = local255 * local35 >> 16;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lclient!gga;IB)V")
	@Override
	public void method8962(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt10202 = arg0.method8374();
		} else if (arg1 == 1) {
			this.anInt10206 = arg0.method8374();
		} else if (arg1 == 2) {
			super.aBoolean736 = arg0.method8374() == 1;
		}
	}
}
