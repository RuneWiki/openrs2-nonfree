import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class5_Sub3_Sub6 extends Class5_Sub3 {

	@OriginalMember(owner = "client!co", name = "N", descriptor = "[I")
	public static final int[] anIntArray84 = new int[32];

	@OriginalMember(owner = "client!co", name = "R", descriptor = "I")
	private int anInt913 = 32768;

	static {
		@Pc(6) int local6 = 2;
		for (@Pc(8) int local8 = 0; local8 < 32; local8++) {
			anIntArray84[local8] = local6 - 1;
			local6 += local6;
		}
	}

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub6() {
		super(3, false);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method6016(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass53_41.method969(arg0);
		if (super.aClass53_41.aBoolean83) {
			@Pc(21) int[] local21 = this.method6020(1, arg0);
			@Pc(27) int[] local27 = this.method6020(2, arg0);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			for (@Pc(41) int local41 = 0; local41 < Static7.anInt129; local41++) {
				@Pc(53) int local53 = local21[local41] * 255 >> 12 & 0xFF;
				@Pc(62) int local62 = this.anInt913 * local27[local41] >> 12;
				@Pc(70) int local70 = Static186.anIntArray370[local53] * local62 >> 12;
				@Pc(78) int local78 = Static77.anIntArray120[local53] * local62 >> 12;
				@Pc(86) int local86 = Static177.anInt3515 & local41 + (local70 >> 12);
				@Pc(94) int local94 = Static221.anInt4359 & (local78 >> 12) + arg0;
				@Pc(100) int[][] local100 = this.method6023(0, local94);
				local31[local41] = local100[0][local86];
				local35[local41] = local100[1][local86];
				local39[local41] = local100[2][local86];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!rg;BI)V")
	@Override
	public void method6017(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt913 = arg0.method5106() << 4;
		} else if (arg1 == 1) {
			super.aBoolean592 = arg0.method5115() == 1;
		}
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(I)V")
	@Override
	public void method6010() {
		Static124.method2201();
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method6011(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass188_41.method5318(arg0);
		if (super.aClass188_41.aBoolean490) {
			@Pc(26) int[] local26 = this.method6020(1, arg0);
			@Pc(34) int[] local34 = this.method6020(2, arg0);
			for (@Pc(36) int local36 = 0; local36 < Static7.anInt129; local36++) {
				@Pc(46) int local46 = local26[local36] >> 4 & 0xFF;
				@Pc(55) int local55 = this.anInt913 * local34[local36] >> 12;
				@Pc(63) int local63 = Static186.anIntArray370[local46] * local55 >> 12;
				@Pc(71) int local71 = Static77.anIntArray120[local46] * local55 >> 12;
				@Pc(79) int local79 = (local63 >> 12) + local36 & Static177.anInt3515;
				@Pc(88) int local88 = Static221.anInt4359 & arg0 + (local71 >> 12);
				@Pc(94) int[] local94 = this.method6020(0, local88);
				local16[local36] = local94[local79];
			}
		}
		return local16;
	}
}
