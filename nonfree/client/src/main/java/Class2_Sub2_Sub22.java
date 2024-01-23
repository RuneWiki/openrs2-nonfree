import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class2_Sub2_Sub22 extends Class2_Sub2 {

	@OriginalMember(owner = "client!o", name = "V", descriptor = "[I")
	public static int[] anIntArray533 = new int[99];

	@OriginalMember(owner = "client!o", name = "ab", descriptor = "I")
	private int anInt3234 = 32768;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 99; local6++) {
			@Pc(11) int local11 = local6 + 1;
			@Pc(24) int local24 = (int) (Math.pow(2.0D, (double) local11 / 7.0D) * 300.0D + (double) local11);
			local4 += local24;
			anIntArray533[local6] = local4 / 4;
		}
	}

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub22() {
		super(3, false);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3961(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass16_41.method300(arg0);
		if (super.aClass16_41.aBoolean12) {
			@Pc(26) int[] local26 = this.method3955(1, arg0);
			@Pc(32) int[] local32 = this.method3955(2, arg0);
			for (@Pc(34) int local34 = 0; local34 < Static54.anInt953; local34++) {
				@Pc(45) int local45 = local32[local34] * this.anInt3234 >> 12;
				@Pc(53) int local53 = local26[local34] >> 4 & 0xFF;
				@Pc(61) int local61 = local45 * Static60.anIntArray168[local53] >> 12;
				@Pc(69) int local69 = Static157.anIntArray603[local53] * local45 >> 12;
				@Pc(78) int local78 = Static74.anInt1601 & local34 + (local69 >> 12);
				@Pc(86) int local86 = Static156.anInt3604 & (local61 >> 12) + arg0;
				@Pc(92) int[] local92 = this.method3955(0, local86);
				local16[local34] = local92[local78];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!o", name = "e", descriptor = "(I)V")
	@Override
	public void method3958() {
		Static97.method1685();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BLclient!nh;I)V")
	@Override
	public void method3957(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3234 = arg0.method2095() << 4;
		} else if (arg1 == 1) {
			super.aBoolean212 = arg0.method2122() == 1;
		}
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3960(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass51_41.method1700(arg0);
		if (super.aClass51_41.aBoolean82) {
			@Pc(21) int[] local21 = this.method3955(1, arg0);
			@Pc(27) int[] local27 = this.method3955(2, arg0);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			for (@Pc(41) int local41 = 0; local41 < Static54.anInt953; local41++) {
				@Pc(53) int local53 = local21[local41] * 255 >> 12 & 0xFF;
				@Pc(62) int local62 = local27[local41] * this.anInt3234 >> 12;
				@Pc(70) int local70 = local62 * Static157.anIntArray603[local53] >> 12;
				@Pc(78) int local78 = local62 * Static60.anIntArray168[local53] >> 12;
				@Pc(86) int local86 = local41 + (local70 >> 12) & Static74.anInt1601;
				@Pc(94) int local94 = Static156.anInt3604 & arg0 + (local78 >> 12);
				@Pc(100) int[][] local100 = this.method3952(0, local94);
				local31[local41] = local100[0][local86];
				local35[local41] = local100[1][local86];
				local39[local41] = local100[2][local86];
			}
		}
		return local11;
	}
}
