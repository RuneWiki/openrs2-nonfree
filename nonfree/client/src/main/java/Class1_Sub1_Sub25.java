import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class1_Sub1_Sub25 extends Class1_Sub1 {

	@OriginalMember(owner = "client!oi", name = "S", descriptor = "I")
	private int anInt3700 = 32768;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub25() {
		super(3, false);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method4459(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = this.aClass176_41.method4469(arg0);
		if (this.aClass176_41.aBoolean437) {
			@Pc(28) int[] local28 = this.method4450(1, arg0);
			@Pc(34) int[] local34 = this.method4450(2, arg0);
			for (@Pc(36) int local36 = 0; local36 < Static131.anInt2513; local36++) {
				@Pc(52) int local52 = local34[local36] * this.anInt3700 >> 12;
				@Pc(60) int local60 = local28[local36] >> 4 & 0xFF;
				@Pc(68) int local68 = local52 * Static134.anIntArray305[local60] >> 12;
				@Pc(76) int local76 = Static187.anIntArray407[local60] * local52 >> 12;
				@Pc(84) int local84 = (local68 >> 12) + local36 & Static11.anInt321;
				@Pc(92) int local92 = Static9.anInt244 & arg0 + (local76 >> 12);
				@Pc(98) int[] local98 = this.method4450(0, local92);
				local18[local36] = local98[local84];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "(I)V")
	@Override
	public void method4454() {
		Static173.method2622();
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method4444(@OriginalArg(1) int arg0) {
		@Pc(7) int[][] local7 = this.aClass153_41.method3955(arg0);
		if (this.aClass153_41.aBoolean396) {
			@Pc(17) int[] local17 = this.method4450(1, arg0);
			@Pc(23) int[] local23 = this.method4450(2, arg0);
			@Pc(27) int[] local27 = local7[0];
			@Pc(31) int[] local31 = local7[2];
			@Pc(35) int[] local35 = local7[1];
			for (@Pc(37) int local37 = 0; local37 < Static131.anInt2513; local37++) {
				@Pc(54) int local54 = local17[local37] * 255 >> 12 & 0xFF;
				@Pc(63) int local63 = local23[local37] * this.anInt3700 >> 12;
				@Pc(71) int local71 = local63 * Static187.anIntArray407[local54] >> 12;
				@Pc(79) int local79 = Static9.anInt244 & (local71 >> 12) + arg0;
				@Pc(87) int local87 = local63 * Static134.anIntArray305[local54] >> 12;
				@Pc(95) int local95 = (local87 >> 12) + local37 & Static11.anInt321;
				@Pc(101) int[][] local101 = this.method4457(0, local79);
				local27[local37] = local101[0][local95];
				local35[local37] = local101[1][local95];
				local31[local37] = local101[2][local95];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZLclient!jj;I)V")
	@Override
	public void method4446(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3700 = arg0.method3107() << 4;
		} else if (arg1 == 1) {
			this.aBoolean434 = arg0.method3122() == 1;
		}
	}
}
