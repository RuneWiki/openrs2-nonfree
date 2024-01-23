import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class4_Sub1_Sub5 extends Class4_Sub1 {

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub5() {
		super(3, false);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILclient!pi;)V")
	@Override
	public void method4545(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub24 arg1) {
		if (arg0 == 0) {
			this.aBoolean392 = arg1.method3110() == 1;
		}
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4544(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass43_41.method1180(arg0);
		if (this.aClass43_41.aBoolean82) {
			@Pc(21) int[] local21 = this.method4538(0, arg0);
			@Pc(27) int[] local27 = this.method4538(1, arg0);
			@Pc(33) int[] local33 = this.method4538(2, arg0);
			for (@Pc(35) int local35 = 0; local35 < Static68.anInt1753; local35++) {
				@Pc(46) int local46 = local33[local35];
				if (local46 == 4096) {
					local11[local35] = local21[local35];
				} else if (local46 == 0) {
					local11[local35] = local27[local35];
				} else {
					local11[local35] = (4096 - local46) * local27[local35] + local21[local35] * local46 >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4542(@OriginalArg(0) int arg0) {
		@Pc(20) int[][] local20 = this.aClass113_41.method2911(arg0);
		if (this.aClass113_41.aBoolean232) {
			@Pc(30) int[] local30 = this.method4538(2, arg0);
			@Pc(36) int[][] local36 = this.method4549(0, arg0);
			@Pc(44) int[][] local44 = this.method4549(1, arg0);
			@Pc(48) int[] local48 = local20[2];
			@Pc(52) int[] local52 = local20[1];
			@Pc(56) int[] local56 = local20[0];
			@Pc(60) int[] local60 = local36[0];
			@Pc(64) int[] local64 = local44[0];
			@Pc(68) int[] local68 = local36[2];
			@Pc(72) int[] local72 = local44[1];
			@Pc(76) int[] local76 = local36[1];
			@Pc(80) int[] local80 = local44[2];
			for (@Pc(82) int local82 = 0; local82 < Static68.anInt1753; local82++) {
				@Pc(89) int local89 = local30[local82];
				if (local89 == 4096) {
					local56[local82] = local60[local82];
					local52[local82] = local76[local82];
					local48[local82] = local68[local82];
				} else if (local89 == 0) {
					local56[local82] = local64[local82];
					local52[local82] = local72[local82];
					local48[local82] = local80[local82];
				} else {
					@Pc(103) int local103 = 4096 - local89;
					local56[local82] = local60[local82] * local89 + local103 * local64[local82] >> 12;
					local52[local82] = local103 * local72[local82] + local76[local82] * local89 >> 12;
					local48[local82] = local103 * local80[local82] + local68[local82] * local89 >> 12;
				}
			}
		}
		return local20;
	}
}
