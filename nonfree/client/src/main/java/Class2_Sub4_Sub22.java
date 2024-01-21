import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class2_Sub4_Sub22 extends Class2_Sub4 {

	@OriginalMember(owner = "client!mh", name = "T", descriptor = "I")
	private int anInt2761 = 32768;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub22() {
		super(3, false);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3122(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass99_41.method2748(arg0);
		if (super.aClass99_41.aBoolean176) {
			@Pc(26) int[] local26 = this.method3129(1, arg0);
			@Pc(32) int[] local32 = this.method3129(2, arg0);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[2];
			@Pc(44) int[] local44 = local16[1];
			for (@Pc(46) int local46 = 0; local46 < Static118.anInt2608; local46++) {
				@Pc(58) int local58 = local26[local46] * 255 >> 12 & 0xFF;
				@Pc(67) int local67 = local32[local46] * this.anInt2761 >> 12;
				@Pc(75) int local75 = Static63.anIntArray104[local58] * local67 >> 12;
				@Pc(83) int local83 = local67 * Static159.anIntArray290[local58] >> 12;
				@Pc(91) int local91 = local46 + (local75 >> 12) & Static82.anInt1734;
				@Pc(99) int local99 = Static167.anInt3559 & (local83 >> 12) + arg0;
				@Pc(105) int[][] local105 = this.method3130(local99, 0);
				local36[local46] = local105[0][local91];
				local44[local46] = local105[1][local91];
				local40[local46] = local105[2][local91];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3127(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass78_41.method2318(arg0);
		if (super.aClass78_41.aBoolean144) {
			@Pc(21) int[] local21 = this.method3129(1, arg0);
			@Pc(27) int[] local27 = this.method3129(2, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static118.anInt2608; local29++) {
				@Pc(40) int local40 = local27[local29] * this.anInt2761 >> 12;
				@Pc(48) int local48 = local21[local29] >> 4 & 0xFF;
				@Pc(56) int local56 = Static63.anIntArray104[local48] * local40 >> 12;
				@Pc(64) int local64 = Static159.anIntArray290[local48] * local40 >> 12;
				@Pc(72) int local72 = local29 + (local56 >> 12) & Static82.anInt1734;
				@Pc(81) int local81 = arg0 + (local64 >> 12) & Static167.anInt3559;
				@Pc(87) int[] local87 = this.method3129(0, local81);
				local11[local29] = local87[local72];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IBLclient!kd;)V")
	@Override
	public void method3120(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt2761 = arg1.method1557() << 4;
		} else if (arg0 == 1) {
			super.aBoolean190 = arg1.method1534() == 1;
		}
	}

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "(I)V")
	@Override
	public void method3133() {
		Static172.method516();
	}
}
