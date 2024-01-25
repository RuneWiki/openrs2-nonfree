import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class2_Sub2_Sub8 extends Class2_Sub2 {

	@OriginalMember(owner = "client!dn", name = "E", descriptor = "I")
	private int anInt1487 = 1;

	@OriginalMember(owner = "client!dn", name = "G", descriptor = "I")
	private int anInt1488 = 1;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub8() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5465(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass170_41.method3645(arg0);
		if (super.aClass170_41.aBoolean317) {
			@Pc(29) int local29 = this.anInt1487 + this.anInt1487 + 1;
			@Pc(33) int local33 = 65536 / local29;
			@Pc(42) int local42 = this.anInt1488 + this.anInt1488 + 1;
			@Pc(46) int local46 = 65536 / local42;
			@Pc(49) int[][] local49 = new int[local29][];
			@Pc(70) int local70;
			for (@Pc(55) int local55 = arg0 - this.anInt1487; local55 <= this.anInt1487 + arg0; local55++) {
				@Pc(65) int[] local65 = this.method5472(Static157.anInt2698 & local55, 0);
				@Pc(68) int[] local68 = new int[Static217.anInt3574];
				local70 = 0;
				for (@Pc(74) int local74 = -this.anInt1488; local74 <= this.anInt1488; local74++) {
					local70 += local65[Static127.anInt2287 & local74];
				}
				@Pc(91) int local91 = 0;
				while (local91 < Static217.anInt3574) {
					local68[local91] = local46 * local70 >> 16;
					local70 -= local65[Static127.anInt2287 & local91 - this.anInt1488];
					local91++;
					local70 += local65[Static127.anInt2287 & this.anInt1488 + local91];
				}
				local49[local55 + this.anInt1487 - arg0] = local68;
			}
			for (@Pc(150) int local150 = 0; local150 < Static217.anInt3574; local150++) {
				@Pc(154) int local154 = 0;
				for (local70 = 0; local70 < local29; local70++) {
					local154 += local49[local70][local150];
				}
				local17[local150] = local33 * local154 >> 16;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5471(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass207_41.method4467(arg0);
		if (super.aClass207_41.aBoolean419) {
			@Pc(28) int local28 = this.anInt1487 + this.anInt1487 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(40) int local40 = this.anInt1488 + this.anInt1488 + 1;
			@Pc(44) int local44 = 65536 / local40;
			@Pc(47) int[][][] local47 = new int[local28][][];
			@Pc(71) int local71;
			@Pc(73) int local73;
			for (@Pc(53) int local53 = arg0 - this.anInt1487; local53 <= arg0 + this.anInt1487; local53++) {
				@Pc(63) int[][] local63 = this.method5474(0, local53 & Static157.anInt2698);
				@Pc(67) int[][] local67 = new int[3][Static217.anInt3574];
				@Pc(69) int local69 = 0;
				local71 = 0;
				local73 = 0;
				@Pc(77) int[] local77 = local63[0];
				@Pc(81) int[] local81 = local63[1];
				@Pc(85) int[] local85 = local63[2];
				for (@Pc(89) int local89 = -this.anInt1488; local89 <= this.anInt1488; local89++) {
					@Pc(95) int local95 = Static127.anInt2287 & local89;
					local71 += local81[local95];
					local73 += local85[local95];
					local69 += local77[local95];
				}
				@Pc(122) int[] local122 = local67[0];
				@Pc(126) int[] local126 = local67[1];
				@Pc(130) int[] local130 = local67[2];
				@Pc(132) int local132 = 0;
				while (Static217.anInt3574 > local132) {
					local122[local132] = local69 * local44 >> 16;
					local126[local132] = local71 * local44 >> 16;
					local130[local132] = local44 * local73 >> 16;
					@Pc(166) int local166 = Static127.anInt2287 & local132 - this.anInt1488;
					local69 -= local77[local166];
					local132++;
					local71 -= local81[local166];
					local73 -= local85[local166];
					@Pc(192) int local192 = Static127.anInt2287 & this.anInt1488 + local132;
					local71 += local81[local192];
					local69 += local77[local192];
					local73 += local85[local192];
				}
				local47[this.anInt1487 + local53 - arg0] = local67;
			}
			@Pc(239) int[] local239 = local16[0];
			@Pc(243) int[] local243 = local16[1];
			@Pc(247) int[] local247 = local16[2];
			for (local71 = 0; local71 < Static217.anInt3574; local71++) {
				local73 = 0;
				@Pc(255) int local255 = 0;
				@Pc(257) int local257 = 0;
				for (@Pc(259) int local259 = 0; local259 < local28; local259++) {
					@Pc(265) int[][] local265 = local47[local259];
					local255 += local265[1][local71];
					local73 += local265[0][local71];
					local257 += local265[2][local71];
				}
				local239[local71] = local73 * local32 >> 16;
				local243[local71] = local255 * local32 >> 16;
				local247[local71] = local32 * local257 >> 16;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!sv;II)V")
	@Override
	public void method5470(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1488 = arg0.method3580();
		} else if (arg1 == 1) {
			this.anInt1487 = arg0.method3580();
		} else if (arg1 == 2) {
			super.aBoolean509 = arg0.method3580() == 1;
		}
	}
}
