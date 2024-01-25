import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class10_Sub2_Sub39 extends Class10_Sub2 {

	@OriginalMember(owner = "client!wr", name = "K", descriptor = "I")
	private int anInt7580 = 1;

	@OriginalMember(owner = "client!wr", name = "R", descriptor = "I")
	private int anInt7585 = 1;

	static {
		new Class182("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
		new Class182(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
	}

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method6037(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass102_41.method2566(arg0);
		if (super.aClass102_41.aBoolean216) {
			@Pc(30) int local30 = this.anInt7585 + this.anInt7585 + 1;
			@Pc(34) int local34 = 65536 / local30;
			@Pc(42) int local42 = this.anInt7580 + this.anInt7580 + 1;
			@Pc(46) int local46 = 65536 / local42;
			@Pc(49) int[][][] local49 = new int[local30][][];
			@Pc(75) int local75;
			@Pc(77) int local77;
			for (@Pc(55) int local55 = arg0 - this.anInt7585; local55 <= this.anInt7585 + arg0; local55++) {
				@Pc(67) int[][] local67 = this.method6045(0, local55 & Static140.anInt2877);
				@Pc(71) int[][] local71 = new int[3][Static121.anInt2458];
				@Pc(73) int local73 = 0;
				local75 = 0;
				local77 = 0;
				@Pc(81) int[] local81 = local67[0];
				@Pc(85) int[] local85 = local67[1];
				@Pc(89) int[] local89 = local67[2];
				for (@Pc(93) int local93 = -this.anInt7580; local93 <= this.anInt7580; local93++) {
					@Pc(99) int local99 = local93 & Static429.anInt7203;
					local75 += local85[local99];
					local77 += local89[local99];
					local73 += local81[local99];
				}
				@Pc(130) int[] local130 = local71[0];
				@Pc(134) int[] local134 = local71[1];
				@Pc(138) int[] local138 = local71[2];
				@Pc(140) int local140 = 0;
				while (local140 < Static121.anInt2458) {
					local130[local140] = local46 * local73 >> 16;
					local134[local140] = local46 * local75 >> 16;
					local138[local140] = local77 * local46 >> 16;
					@Pc(173) int local173 = Static429.anInt7203 & local140 - this.anInt7580;
					local75 -= local85[local173];
					local73 -= local81[local173];
					local140++;
					local77 -= local89[local173];
					@Pc(200) int local200 = local140 + this.anInt7580 & Static429.anInt7203;
					local73 += local81[local200];
					local75 += local85[local200];
					local77 += local89[local200];
				}
				local49[local55 + this.anInt7585 - arg0] = local71;
			}
			@Pc(251) int[] local251 = local18[0];
			@Pc(255) int[] local255 = local18[1];
			@Pc(259) int[] local259 = local18[2];
			for (local75 = 0; local75 < Static121.anInt2458; local75++) {
				local77 = 0;
				@Pc(267) int local267 = 0;
				@Pc(269) int local269 = 0;
				for (@Pc(271) int local271 = 0; local271 < local30; local271++) {
					@Pc(277) int[][] local277 = local49[local271];
					local269 += local277[2][local75];
					local77 += local277[0][local75];
					local267 += local277[1][local75];
				}
				local251[local75] = local34 * local77 >> 16;
				local255[local75] = local267 * local34 >> 16;
				local259[local75] = local269 * local34 >> 16;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IILclient!nn;)V")
	@Override
	public void method6044(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt7580 = arg1.method2502();
		} else if (arg0 == 1) {
			this.anInt7585 = arg1.method2502();
		} else if (arg0 == 2) {
			super.aBoolean499 = arg1.method2502() == 1;
		}
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6035(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass241_41.method5238(arg0);
		if (super.aClass241_41.aBoolean440) {
			@Pc(23) int local23 = this.anInt7585 + this.anInt7585 + 1;
			@Pc(27) int local27 = 65536 / local23;
			@Pc(35) int local35 = this.anInt7580 + this.anInt7580 + 1;
			@Pc(39) int local39 = 65536 / local35;
			@Pc(42) int[][] local42 = new int[local23][];
			@Pc(62) int local62;
			for (@Pc(47) int local47 = arg0 - this.anInt7585; local47 <= arg0 + this.anInt7585; local47++) {
				@Pc(57) int[] local57 = this.method6041(local47 & Static140.anInt2877, 0);
				@Pc(60) int[] local60 = new int[Static121.anInt2458];
				local62 = 0;
				for (@Pc(66) int local66 = -this.anInt7580; local66 <= this.anInt7580; local66++) {
					local62 += local57[local66 & Static429.anInt7203];
				}
				@Pc(87) int local87 = 0;
				while (local87 < Static121.anInt2458) {
					local60[local87] = local39 * local62 >> 16;
					local62 -= local57[Static429.anInt7203 & local87 - this.anInt7580];
					local87++;
					local62 += local57[local87 + this.anInt7580 & Static429.anInt7203];
				}
				local42[this.anInt7585 + local47 - arg0] = local60;
			}
			for (@Pc(143) int local143 = 0; local143 < Static121.anInt2458; local143++) {
				@Pc(147) int local147 = 0;
				for (local62 = 0; local62 < local23; local62++) {
					local147 += local42[local62][local143];
				}
				local11[local143] = local147 * local27 >> 16;
			}
		}
		return local11;
	}
}
