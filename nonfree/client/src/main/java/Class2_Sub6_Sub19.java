import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class2_Sub6_Sub19 extends Class2_Sub6 {

	static {
		new Class221("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
	}

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub19() {
		super(3, false);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!lk;II)V")
	@Override
	public void method5637(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean491 = arg0.method4240() == 1;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5641(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass208_41.method4986(arg0);
		if (super.aClass208_41.aBoolean443) {
			@Pc(21) int[] local21 = this.method5635(arg0, 2);
			@Pc(27) int[][] local27 = this.method5640(0, arg0);
			@Pc(33) int[][] local33 = this.method5640(1, arg0);
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			@Pc(49) int[] local49 = local27[0];
			@Pc(53) int[] local53 = local27[1];
			@Pc(57) int[] local57 = local27[2];
			@Pc(61) int[] local61 = local33[0];
			@Pc(65) int[] local65 = local33[1];
			@Pc(69) int[] local69 = local33[2];
			for (@Pc(71) int local71 = 0; local71 < Static151.anInt2711; local71++) {
				@Pc(77) int local77 = local21[local71];
				if (local77 == 4096) {
					local37[local71] = local49[local71];
					local41[local71] = local53[local71];
					local45[local71] = local57[local71];
				} else if (local77 == 0) {
					local37[local71] = local61[local71];
					local41[local71] = local65[local71];
					local45[local71] = local69[local71];
				} else {
					@Pc(112) int local112 = 4096 - local77;
					local37[local71] = local49[local71] * local77 + local112 * local61[local71] >> 12;
					local41[local71] = local112 * local65[local71] + local77 * local53[local71] >> 12;
					local45[local71] = local112 * local69[local71] + local57[local71] * local77 >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5642(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass166_41.method3993(arg0);
		if (super.aClass166_41.aBoolean336) {
			@Pc(26) int[] local26 = this.method5635(arg0, 0);
			@Pc(32) int[] local32 = this.method5635(arg0, 1);
			@Pc(38) int[] local38 = this.method5635(arg0, 2);
			for (@Pc(40) int local40 = 0; local40 < Static151.anInt2711; local40++) {
				@Pc(46) int local46 = local38[local40];
				if (local46 == 4096) {
					local16[local40] = local26[local40];
				} else if (local46 == 0) {
					local16[local40] = local32[local40];
				} else {
					local16[local40] = (4096 - local46) * local32[local40] + local46 * local26[local40] >> 12;
				}
			}
		}
		return local16;
	}
}
