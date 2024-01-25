import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public final class Class2_Sub10_Sub31 extends Class2_Sub10 {

	@OriginalMember(owner = "client!st", name = "I", descriptor = "I")
	private int anInt8845 = 32768;

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub31() {
		super(3, false);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method8411(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass250_41.method6392(arg0);
		if (super.aClass250_41.aBoolean573) {
			@Pc(27) int[] local27 = this.method8402(arg0, 1);
			@Pc(33) int[] local33 = this.method8402(arg0, 2);
			@Pc(37) int[] local37 = local17[0];
			@Pc(41) int[] local41 = local17[1];
			@Pc(45) int[] local45 = local17[2];
			for (@Pc(47) int local47 = 0; local47 < Static93.anInt1862; local47++) {
				@Pc(59) int local59 = local27[local47] * 255 >> 12 & 0xFF;
				@Pc(68) int local68 = local33[local47] * this.anInt8845 >> 12;
				@Pc(76) int local76 = local68 * Static68.anIntArray145[local59] >> 12;
				@Pc(84) int local84 = Static253.anIntArray343[local59] * local68 >> 12;
				@Pc(92) int local92 = Static603.anInt9994 & (local76 >> 12) + local47;
				@Pc(100) int local100 = arg0 + (local84 >> 12) & Static93.anInt1860;
				@Pc(106) int[][] local106 = this.method8408(local100, 0);
				local37[local47] = local106[0][local92];
				local41[local47] = local106[1][local92];
				local45[local47] = local106[2][local92];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8403(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass304_41.method7208(arg0);
		if (super.aClass304_41.aBoolean638) {
			@Pc(26) int[] local26 = this.method8402(arg0, 1);
			@Pc(32) int[] local32 = this.method8402(arg0, 2);
			for (@Pc(34) int local34 = 0; local34 < Static93.anInt1862; local34++) {
				@Pc(44) int local44 = local26[local34] >> 4 & 0xFF;
				@Pc(53) int local53 = local32[local34] * this.anInt8845 >> 12;
				@Pc(61) int local61 = local53 * Static68.anIntArray145[local44] >> 12;
				@Pc(69) int local69 = local53 * Static253.anIntArray343[local44] >> 12;
				@Pc(77) int local77 = (local61 >> 12) + local34 & Static603.anInt9994;
				@Pc(86) int local86 = arg0 + (local69 >> 12) & Static93.anInt1860;
				@Pc(92) int[] local92 = this.method8402(local86, 0);
				local11[local34] = local92[local77];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Lclient!ud;II)V")
	@Override
	public void method8410(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8845 = arg0.method6884() << 4;
		} else if (arg1 == 1) {
			super.aBoolean741 = arg0.method6904() == 1;
		}
	}

	@OriginalMember(owner = "client!st", name = "b", descriptor = "(Z)V")
	@Override
	public void method8407() {
		Static385.method5800();
	}
}
