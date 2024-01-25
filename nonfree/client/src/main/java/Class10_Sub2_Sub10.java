import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class Class10_Sub2_Sub10 extends Class10_Sub2 {

	@OriginalMember(owner = "client!en", name = "Q", descriptor = "I")
	private int anInt1981 = 32768;

	static {
		new Class182(null, "geschickt werden.", null, null);
	}

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub10() {
		super(3, false);
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(Z)V")
	@Override
	public void method6036() {
		Static44.method657();
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IILclient!nn;)V")
	@Override
	public void method6044(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt1981 = arg1.method2485() << 4;
		} else if (arg0 == 1) {
			super.aBoolean499 = arg1.method2502() == 1;
		}
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method6037(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass102_41.method2566(arg0);
		if (super.aClass102_41.aBoolean216) {
			@Pc(28) int[] local28 = this.method6041(arg0, 1);
			@Pc(34) int[] local34 = this.method6041(arg0, 2);
			@Pc(38) int[] local38 = local13[0];
			@Pc(42) int[] local42 = local13[1];
			@Pc(46) int[] local46 = local13[2];
			for (@Pc(48) int local48 = 0; local48 < Static121.anInt2458; local48++) {
				@Pc(60) int local60 = local28[local48] * 255 >> 12 & 0xFF;
				@Pc(69) int local69 = this.anInt1981 * local34[local48] >> 12;
				@Pc(77) int local77 = local69 * Static132.anIntArray275[local60] >> 12;
				@Pc(85) int local85 = Static218.anIntArray410[local60] * local69 >> 12;
				@Pc(93) int local93 = local48 + (local77 >> 12) & Static429.anInt7203;
				@Pc(102) int local102 = arg0 + (local85 >> 12) & Static140.anInt2877;
				@Pc(108) int[][] local108 = this.method6045(0, local102);
				local38[local48] = local108[0][local93];
				local42[local48] = local108[1][local93];
				local46[local48] = local108[2][local93];
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6035(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass241_41.method5238(arg0);
		if (super.aClass241_41.aBoolean440) {
			@Pc(26) int[] local26 = this.method6041(arg0, 1);
			@Pc(32) int[] local32 = this.method6041(arg0, 2);
			for (@Pc(34) int local34 = 0; local34 < Static121.anInt2458; local34++) {
				@Pc(44) int local44 = local26[local34] >> 4 & 0xFF;
				@Pc(53) int local53 = local32[local34] * this.anInt1981 >> 12;
				@Pc(61) int local61 = local53 * Static132.anIntArray275[local44] >> 12;
				@Pc(69) int local69 = Static218.anIntArray410[local44] * local53 >> 12;
				@Pc(78) int local78 = Static429.anInt7203 & local34 + (local61 >> 12);
				@Pc(86) int local86 = Static140.anInt2877 & (local69 >> 12) + arg0;
				@Pc(92) int[] local92 = this.method6041(local86, 0);
				local11[local34] = local92[local78];
			}
		}
		return local11;
	}
}
