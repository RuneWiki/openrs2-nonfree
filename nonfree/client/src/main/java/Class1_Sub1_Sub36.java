import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class1_Sub1_Sub36 extends Class1_Sub1 {

	@OriginalMember(owner = "client!tf", name = "ub", descriptor = "I")
	private int anInt4023 = 4096;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub36() {
		super(1, true);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3310(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass80_41.method2876(arg0);
		if (super.aClass80_41.aBoolean151) {
			@Pc(32) int[] local32 = this.method3303(Static134.anInt3338 & arg0 - 1, 0);
			@Pc(40) int[] local40 = this.method3303(arg0, 0);
			@Pc(52) int[] local52 = this.method3303(Static134.anInt3338 & arg0 + 1, 0);
			for (@Pc(54) int local54 = 0; local54 < Static176.anInt3921; local54++) {
				@Pc(68) int local68 = this.anInt4023 * (local52[local54] - local32[local54]);
				@Pc(88) int local88 = (local40[local54 + 1 & Static70.anInt1730] - local40[Static70.anInt1730 & local54 - 1]) * this.anInt4023;
				@Pc(92) int local92 = local88 >> 12;
				@Pc(96) int local96 = local68 >> 12;
				@Pc(102) int local102 = local92 * local92 >> 12;
				@Pc(108) int local108 = local96 * local96 >> 12;
				@Pc(122) int local122 = (int) (Math.sqrt((double) ((float) (local108 + local102 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(133) int local133 = local122 == 0 ? 0 : 16777216 / local122;
				local18[local54] = 4096 - local133;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILclient!wa;)V")
	@Override
	public void method3312(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt4023 = arg1.method1753();
		}
	}
}
